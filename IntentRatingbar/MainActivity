public class MainActivity extends AppCompatActivity {
Button movebtn;
ImageButton nintenView, playView , xboxview;
Intent intent;
int ninVote , playVote , xboxVote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Intent homework");


        Integer imageVId[] = {R.id.nintendo, R.id.play, R.id.xbox};

        nintenView = (ImageButton) findViewById(R.id.nintendo);
        playView = (ImageButton) findViewById(R.id.play);
        xboxview = (ImageButton) findViewById(R.id.xbox);
        movebtn = (Button) findViewById(R.id.movebtn);


        nintenView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninVote < 5) {
                    ninVote++;
                    Toast.makeText(MainActivity.this, "닌텐도 콘솔에 총" + ninVote + "회 투표했습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "최대 투표수는 5번입니다. 초기화 값으로 초기화합니다.", Toast.LENGTH_SHORT).show();
                    ninVote = 0;
                }
            }
        });
        playView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playVote < 5) {
                    playVote++;
                    Toast.makeText(MainActivity.this, "플레이스테이션 콘솔에 총" + playVote + "회 투표했습니다.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "최대 투표수는 5번입니다. 초기화 값으로 초기화합니다.", Toast.LENGTH_SHORT).show();
                    playVote =0;
                }
            }
        });

        xboxview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xboxVote < 5) {
                    xboxVote++;
                    Toast.makeText(MainActivity.this, "엑스박스 콘솔에 총" + xboxVote + "회 투표했습니다.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "최대 투표수는 5번입니다. 초기화 값으로 초기화합니다.", Toast.LENGTH_SHORT).show();
                    xboxVote = 0;
                }
            }
        });


        movebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("NintendoCount", ninVote);
                intent.putExtra("playstationCount", playVote);
                intent.putExtra("xboxCount", xboxVote);
                startActivityForResult(intent, 0);
            }
        });
    }
        @Override
        protected void onActivityResult(int reqquestCode, int resultCode, Intent data) {
            if (resultCode == RESULT_OK) {
                ninVote = data.getIntExtra("Nintendo", ninVote);
                playVote = data.getIntExtra("playstation", playVote);
               xboxVote = data.getIntExtra("xbox", xboxVote);

            }
        }
}
