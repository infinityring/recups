package com.IRCC.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RewardAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    int flags[];
    int cc;
    LayoutInflater inflter;

    public RewardAdapter(Context applicationContext, String[] countryList, int[] flags, int cc) {
        this.context = applicationContext;
        this.countryList = countryList;
        this.flags = flags;
        this.cc = cc;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        LinearLayout ll = (LinearLayout) view.findViewById(R.id.iconcontainer);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(countryList[i]);
        icon.setImageResource(flags[i]);
        ll.setBackgroundColor(cc);
        return view;
    }
}