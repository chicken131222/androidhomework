public class item_Adapter extends RecyclerView.Adapter<item_Adapter.itemViewHolder> {
    private ArrayList<item_list> item_Data = new ArrayList<>();
    private Context context;


    public class itemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView itemview;
        private TextView itemname;
        private TextView price;
        private Button trybtn;


        public itemViewHolder(View view) {
            super(view);
            this.itemview = (ImageView) view.findViewById(R.id.itemview);
            this.itemname = (TextView) view.findViewById(R.id.itemname);
            this.price = (TextView) view.findViewById(R.id.itemprice);
            this.trybtn = (Button) view.findViewById(R.id.trybtn);
        }

        void onBind(item_list Item_List) {
            itemview.setImageResource(Item_List.getid());
            itemname.setText(Item_List.getItemname());
            price.setText(Item_List.getPrice());
            trybtn.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.trybtn :
                    Toast.makeText(context, "상품을 고르셨습니다.", Toast.LENGTH_SHORT).show();
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
