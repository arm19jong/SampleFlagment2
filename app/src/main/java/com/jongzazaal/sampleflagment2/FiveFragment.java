package com.jongzazaal.sampleflagment2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;

/**
 * Created by jongzazaal on 5/20/2017.
 */

public class FiveFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_four, container, false);
        Log.i(TAG, "onCreateView: 555555");
        return rootView;
    }

    @Override
    public void onStop() {
        Log.i(TAG, "onCreateView: Stop 55555");
        super.onStop();
    }
}