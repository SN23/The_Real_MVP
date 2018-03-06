package com.nahal.sukhjinder.the_real_mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sukhjinder on 3/5/18.
 */

public class DetailActivity extends AppCompatActivity {

    private Intent intent;
    private City city;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_detail);

        intent = getIntent();
        city = intent.getParcelableExtra("City");
        textView = (TextView) findViewById(R.id.city_name);
        textView.setText(city.getCityName());

    }


}
