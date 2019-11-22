public class item_Adapter extends RecyclerView.Adapter<item_Adapter.itemViewHolder> {
    //Adapter에 들어갈 list 내용
    private ArrayList<item_list> item_Data = new ArrayList<>();
    // Toast 이벤트를 위해 Context를 전역변수로 생성했다.
    private Context context;  //


    public class itemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView itemview;
        private TextView itemname;
        private TextView price;
        private Button trybtn;
        private item_list itemList;

        public itemViewHolder(View view) {
            super(view);
            this.itemview = (ImageView) view.findViewById(R.id.itemview);
            this.itemname = (TextView) view.findViewById(R.id.itemname);
            this.price = (TextView) view.findViewById(R.id.itemprice);
            this.trybtn = (Button) view.findViewById(R.id.trybtn);
        }

        void onBind(item_list Item_List) {
            this.itemList = Item_List; // 항목별로 구분지어서 이벤트를 만들기위해 생성
                itemview.setImageResource(Item_List.getid());
                itemname.setText(Item_List.getItemname());
                trybtn.setOnClickListener(this);
            }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.trybtn :
                    Toast.makeText(context,  itemList.getItemname() + "을 고르셨습니다.", Toast.LENGTH_SHORT).show();
            }

        }
    }
    @Override
    public itemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        context = viewGroup.getContext() ;
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.litem_view, viewGroup, false);
        itemViewHolder viewHolder = new itemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder viewHolder, int position) {
        viewHolder.onBind(item_Data.get(position));
    }

    @Override
    public int getItemCount() {
        return item_Data.size();
    }
    void addItem(item_list data) {
        // 외부에서 item을 추가시킬 함수입니다.
        item_Data.add(data);
    }

}

