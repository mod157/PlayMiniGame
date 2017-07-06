package com.nammu.playminigame.clickgame.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nammu.playminigame.R;

import butterknife.ButterKnife;

/**
 * Created by SunJae on 2017-06-05.
 */

public class EasyClickGameFragment extends Fragment {
    public EasyClickGameFragment(){}

    /*Bundle bundle = new Bundle();
        bundle.putParcelable("WifiData_Bundle",data);
        fragment.setArguments(bundle);*/
    public static Fragment newInstance(){
        Fragment fragment = new EasyClickGameFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clickgame_easy, container, false );
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.set_toolbar);
        toolbar.setTitle(getString(R.string.title_activity_add));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
    }
}
