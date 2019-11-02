
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavigationtest.ui.fragment1;
import com.example.bottomnavigationtest.ui.fragmentthree;
import com.example.bottomnavigationtest.ui.fragmenttwo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;



public class MainActivity extends AppCompatActivity {

    private FragmentManager frgmentMg = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.bottom_navset);
        navView.setOnNavigationItemSelectedListener(navListener);

    }
    //네비게이션 메뉴 선택 리스너 선언 후 선택했을때 만들어놓은 플래그를 선택해 전환시킨다.
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()) {
                        case R.id.google:
                            selectedFragment = new fragment1();
                            break;
                        case R.id.naver:
                            selectedFragment = new fragmenttwo();
                            break;
                        case R.id.daum:
                            selectedFragment = new fragmentthree();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentset,
                            selectedFragment).commit();
                    return true;

                }
            };


}
