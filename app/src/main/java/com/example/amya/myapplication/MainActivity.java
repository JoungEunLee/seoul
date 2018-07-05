package com.example.amya.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.nhn.android.maps.NMapActivity;
import com.nhn.android.maps.NMapView;

public class MainActivity extends NMapActivity {

    private ViewGroup mapLayout;
    private NMapView mMapView;// 지도 화면 View
    private final String CLIENT_ID = "LDSmLMPEx7hDpJKRyxae";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //맵 위에 버튼
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.gangnam);
        //네이버 맵 띄우기
        mMapView = (NMapView)findViewById(R.id.mapView);
        //클라이언트 허용
        mMapView.setClientId(CLIENT_ID);
        mMapView.setClickable(true);
        mMapView.setEnabled(true);
        mMapView.setFocusable(true);
        mMapView.setFocusableInTouchMode(true);
        mMapView.requestFocus();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), hey.class);
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("강남강남강남강남강남강남강남강남강남강남강남강남");

            }
        });

    }

}
