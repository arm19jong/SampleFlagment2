package com.jongzazaal.sampleflagment2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;

/**
 * Created by jongzazaal on 10/4/2560.
 */

public class ThreeFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        Log.i(TAG, "onCreateView: 3333333");
        return rootView;
    }

    @Override
    public void onStop() {
        Log.i(TAG, "onCreateView: Stop 3333333");
        super.onStop();
    }
}