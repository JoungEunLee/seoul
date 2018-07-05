package com.example.amya.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class hey  extends Activity {

    static final String[] LIST_MENU = {"황소곱창 선릉점", "브롱스 강남점", "코다차야 신논현점", "파리바게트 선릉점"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU) ;

        ListView listview = (ListView) findViewById(R.id.list1) ;
        listview.setAdapter(adapter) ;


    }

}
