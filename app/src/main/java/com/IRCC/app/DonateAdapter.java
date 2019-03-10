package com.IRCC.app;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DonateAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    String otherText[];
    int flags[];
    int colors[];
    LayoutInflater inflter;

    public DonateAdapter(Context applicationContext, String[] countryList, int[] flags, int[] colors, String[] otherText) {
        this.context = applicationContext;
        this.countryList = countryList;
        this.flags = flags;
        this.colors = colors;
        this.otherText = otherText;
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
        view = inflter.inflate(R.layout.activity_donate_target, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        ConstraintLayout cl = (ConstraintLayout) view.findViewById(R.id.container);

       // country.setText(countryList[i]);
        icon.setImageResource(flags[i]);
        //cl.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.icon1, null));
        return view;
    }
}