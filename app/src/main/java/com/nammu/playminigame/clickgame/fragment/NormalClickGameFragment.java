package com.nammu.playminigame.clickgame.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nammu.playminigame.R;

import butterknife.ButterKnife;

/**
 * Created by SunJae on 2017-06-05.
 */

public class NormalClickGameFragment extends Fragment {
    public NormalClickGameFragment(){}

    public static Fragment newInstance(){
        Fragment fragment = new EasyClickGameFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clickgame_normal, container, false );
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
