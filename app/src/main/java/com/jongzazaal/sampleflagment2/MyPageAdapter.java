package com.jongzazaal.sampleflagment2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jongzazaal on 10/4/2560.
 */

public class MyPageAdapter extends FragmentPagerAdapter {

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return 5;
    }

    public Fragment getItem(int position) {
        if(position == 0)
            return new OneFragment();
        else if(position == 1)
            return new TwoFragment();
        else if(position == 2)
            return new ThreeFragment();
        else if(position == 3)
            return new FourFragment();
        else if(position == 4)
            return new FiveFragment();
        return null;
    }
}