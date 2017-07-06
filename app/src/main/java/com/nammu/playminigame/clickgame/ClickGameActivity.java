package com.nammu.playminigame.clickgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.nammu.playminigame.MiniGameApplication;
import com.nammu.playminigame.R;
import com.nammu.playminigame.clickgame.fragment.EasyClickGameFragment;
import com.nammu.playminigame.clickgame.fragment.HardClickGameFragment;
import com.nammu.playminigame.clickgame.fragment.NormalClickGameFragment;
import com.nammu.playminigame.clickgame.dialog.ClickGameLevelDialog;

import butterknife.ButterKnife;

public class ClickGameActivity extends AppCompatActivity {
    private ClickGameLevelDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_game);
        //fullScreenSet();
        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_set, DetailSetFragment.newInstance(data), "detail").addToBackStack(null).commit();
        dialog = new ClickGameLevelDialog(this, levelClickEvent);
        dialog.show();
        ButterKnife.bind(this);
    }

   /* private void fragmentSet(){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.fragment_clickgame, new EasyClickGameFragment());
        fragmentTransaction.commit();
    }*/

    private void fullScreenSet(){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private ClickGameLevelDialog.LevelClickEvent levelClickEvent = new ClickGameLevelDialog.LevelClickEvent() {
        @Override
        public void onClickLevel(int level) {
            switch (level){
                case MiniGameApplication.GAME_LEVEL_EASY:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_clickgame, EasyClickGameFragment.newInstance())
                            .addToBackStack(null).commit();
                    break;
                case MiniGameApplication.GAME_LEVEL_NORMAL:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_clickgame, NormalClickGameFragment.newInstance())
                            .addToBackStack(null).commit();
                    break;
                case MiniGameApplication.GAME_LEVEL_HARD:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_clickgame, HardClickGameFragment.newInstance())
                            .addToBackStack(null).commit();
                    break;
            }
            if(dialog.isShowing())
                dialog.cancel();
        }
    };
}
