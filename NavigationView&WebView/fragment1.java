
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.bottomnavigationtest.R;

import androidx.fragment.app.Fragment;

public class fragment1 extends Fragment{

    public fragment1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_menu1, container, false);
        final WebView webView = (WebView)v.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true); //자바스크립트 허용
        webView.getSettings().setAppCacheEnabled(true);
        webView.setWebViewClient(new WebViewClient());  // url 오픈 앱에서
        webView.loadUrl("https://www.google.com/"); // url을 정의 네이버면 네이버 구글이면 구글
        return  v;
    }
}


//생성한 fragment xml의 webView에 관한 설정  
