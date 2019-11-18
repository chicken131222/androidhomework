public class SecondActivity extends AppCompatActivity {
    int NinCount , playCount , xCount ;
    RatingBar ninbar, playbar, xbar;
    Intent  intentMain, intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        setTitle("투표결과");

      intent2 = getIntent();
       NinCount =  intent2.getIntExtra("NintendoCount" , NinCount);
       playCount = intent2.getIntExtra("playstationCount",playCount);
       xCount =  intent2.getIntExtra("xboxCount",xCount);


        xbar = (RatingBar)findViewById(R.id.xboxbar);
        ninbar = (RatingBar)findViewById(R.id.ninbar);
        playbar = (RatingBar)findViewById(R.id.playbar);

        ninbar.setRating(NinCount);
        playbar.setRating(playCount);
        xbar.setRating(xCount);

        Button savebtn = (Button) findViewById(R.id.setbtn);
        savebtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentMain = new Intent(getApplicationContext(), MainActivity.class);
                intentMain.putExtra("Nintendo", NinCount= (int)ninbar.getRating());
                intentMain.putExtra("playstation",playCount = (int)playbar.getRating());
                intentMain.putExtra("xbox", xCount = (int)xbar.getRating());
                setResult(RESULT_OK,intentMain);
                finish();
            }
        });
    }
}
