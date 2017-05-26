package com.jongzazaal.sampleflagment2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.DragEvent;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends FragmentActivity {
    ViewPager pager;
    BottomNavigationView bottomNavigationView;

    private static final String TAG = "MainActivity";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MyPageAdapter adapter = new MyPageAdapter(getSupportFragmentManager());
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation_view);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);
//        bottomNavigationView.setDrawingCacheBackgroundColor(Color.parseColor("#ffffff"));
//        try {
//            XmlResourceParser parser = getResources().getXml(R.color.color_state);
//            ColorStateList colors = ColorStateList.createFromXml(getResources(), parser);
//        }
//        catch (Exception e){}
//
//        bottomNavigationView.setItemIconTintList(R.color.color_state);
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

//                bottomNavigationView.setSelectedItemId(position);

            }

            @Override
            public void onPageSelected(int position) {
                Log.i(TAG, "score:"+position);
                if(position == 0){
                    bottomNavigationView.setSelectedItemId(R.id.home);
                }
                else if(position == 1){
                    bottomNavigationView.setSelectedItemId(R.id.favorite);
                }
                else if(position == 2){
                    bottomNavigationView.setSelectedItemId(R.id.account);
                }
                else if(position == 3){
                    bottomNavigationView.setSelectedItemId(R.id.account3);
                }
                else if(position == 4){
                    bottomNavigationView.setSelectedItemId(R.id.account4);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.home){
                    pager.setCurrentItem(0);
                }
                else if(item.getItemId() == R.id.favorite){
                    pager.setCurrentItem(1);
                }
                else if(item.getItemId() == R.id.account){
                    pager.setCurrentItem(2);
                }
                else if(item.getItemId() == R.id.account3){
                    pager.setCurrentItem(3);
                }
                else if(item.getItemId() == R.id.account4){
                    pager.setCurrentItem(4);
                }
                return true;
            }
        });

    }
}