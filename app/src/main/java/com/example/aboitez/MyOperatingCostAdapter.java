package com.example.aboitez;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyOperatingCostAdapter extends BaseAdapter {

    Context context;
    ArrayList<MyOperatingCost> list;
    LayoutInflater inflater;

    public MyOperatingCostAdapter(Context context, ArrayList<MyOperatingCost> list) {
        this.context = context;
        this.list = list;
        this.inflater = inflater;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ItemHandler handler=null;
        if(view==null){
            view=inflater.inflate(R.layout.operatingcost, null);
            handler = new ItemHandler();
            handler.item=view.findViewById(R.id.textView49);
            handler.cost=view.findViewById(R.id.textView52);
            handler.sales=view.findViewById(R.id.textView48);
            handler.markup=view.findViewById(R.id.textView51);
            handler.weeklypurchase=view.findViewById(R.id.textView50);
            view.setTag(handler);
        }else handler = (ItemHandler) view.getTag();
        //delegate

        handler.item.setText(list.get(i).getItem().toUpperCase());
        handler.cost.setText((int) list.get(i).getCost());
        handler.sales.setText((int) list.get(i).getSales());
        handler.markup.setText((int) list.get(i).getMarkup());
        handler.weeklypurchase.setText((int) list.get(i).getWeeklypurchase());
        return view;
    }

    static class ItemHandler{
        TextView item,cost, sales, markup, weeklypurchase;
    }
}
