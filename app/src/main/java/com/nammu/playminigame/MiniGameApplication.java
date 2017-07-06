package com.nammu.playminigame;

import android.app.Application;

/**
 * Created by SunJae on 2017-06-05.
 */

public class MiniGameApplication extends Application {
    //Game NO
    public static final int CLICK_GAME_NO = 0;
    public static final int LONGCLICK_GAME_NO = 1;

    //GameLevel
    public static final int GAME_LEVEL_EASY = 100;
    public static final int GAME_LEVEL_NORMAL = 101;
    public static final int GAME_LEVEL_HARD =  102;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
