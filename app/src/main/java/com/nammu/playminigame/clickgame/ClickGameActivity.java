package com.nammu.playminigame.clickgame;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.nammu.playminigame.R;
import com.nammu.playminigame.clickgame.fragment.EasyClickGame;
import com.nammu.playminigame.clickgame.module.ClickGameLevelDialog;

import butterknife.ButterKnife;

public class ClickGameActivity extends AppCompatActivity {
    private ClickGameLevelDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_game);
        //fullScreenSet();
        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_set, DetailSetFragment.newInstance(data), "detail").addToBackStack(null).commit();
        //fragmentSet();
        dialog = new ClickGameLevelDialog(this);
        dialog.show();
        ButterKnife.bind(this);
    }

    private void fragmentSet(){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.fragment_clickgame, new EasyClickGame());
        fragmentTransaction.commit();
    }

    private void fullScreenSet(){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
