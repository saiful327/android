package com.example.beeradviser;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
//import android.R;

import org.w3c.dom.Text;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
        public void onClickFindBeer(View view){
            TextView brands = (TextView) findViewById(R.id.brands);
            Spinner color = (Spinner) findViewById(R.id.color);
            String beerType =String.valueOf(color.getSelectedItem());
            brands.setText(beerType);
    }
    }

