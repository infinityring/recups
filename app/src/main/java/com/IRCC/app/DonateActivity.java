package com.IRCC.app;

import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

public class DonateActivity extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {    "pro natura",
                                "Bio Suisse",
                                "VCS",
                                "Fondation Franz Weber",
                                "WWF",
                                "Public Eye"
                            };
    int bckL[] = { R.color.icon1, R.color.icon2, R.color.icon3, R.color.icon4};
    String oteL[] = {"Other text", "Other text","Other text", "Other text"};
    int flags[] = { R.drawable.charity1,
                    R.drawable.charity2,
                    R.drawable.charity3,
                    R.drawable.charity5,
                    R.drawable.charity6,
                    R.drawable.charity7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        GridView gridView = (GridView)findViewById(R.id.gridView);
        DonateAdapter adapter = new DonateAdapter(this, countryList, flags, bckL, oteL);
        gridView.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
