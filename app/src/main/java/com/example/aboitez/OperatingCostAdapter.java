package com.example.aboitez;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class OperatingCostAdapter extends BaseAdapter {
    Context context;
    ArrayList<MyOperatingCost> list;
    LayoutInflater inflater;

    public OperatingCostAdapter(Context context, ArrayList<MyOperatingCost> list) {
        this.context = context;
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ItemHandler handler=null;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.operatingcost, null);
            handler = new ItemHandler();
            handler.item=convertView.findViewById(R.id.textView49);
            handler.cost=convertView.findViewById(R.id.textView52);
            handler.sales=convertView.findViewById(R.id.textView48);
            handler.markup=convertView.findViewById(R.id.textView51);
            handler.weeklypurchase=convertView.findViewById(R.id.textView50);
            convertView.setTag(handler);
        }else handler = (ItemHandler) convertView.getTag();
        //delegate
        handler.item.setText(String.valueOf(list.get(i).getItem()));
        handler.cost.setText(String.valueOf(list.get(i).getCost()));
        handler.sales.setText(String.valueOf(list.get(i).getSales()));
        handler.markup.setText(String.valueOf(list.get(i).getMarkup()));
        handler.weeklypurchase.setText(String.valueOf(list.get(i).getWeeklypurchase()));

        return convertView;
    }

    static class ItemHandler{
        TextView item,cost,sales,markup,weeklypurchase;
    }
}
