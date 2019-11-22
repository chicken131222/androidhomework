public class MainActivity extends AppCompatActivity {
    private item_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        getData();
    }


    private void init() {
            RecyclerView recyclerView = findViewById(R.id.recyclerview_list);

            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(linearLayoutManager);

            adapter = new item_Adapter();
            recyclerView.setAdapter(adapter);
        }


    private void getData() {

        List<Integer> itemview = Arrays.asList(R.drawable.pc, R.drawable.notebook, R.drawable.phone);
        List<String> itemName = Arrays.asList("데스크탑", "노트북", "스마트폰");
        List<String> itemPice = Arrays.asList("120만원", "110만원", "70만원");

        for (int i = 0; i < itemName.size(); i++) {
            item_list data = new item_list();
            data.setid(itemview.get(i));
            data.setItemname(itemName.get(i));
            data.setPrice(itemPice.get(i));

         adapter.addItem(data);

        }
        adapter.notifyDataSetChanged();

    }
}
