package com.nammu.playminigame.clickgame.module;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.nammu.playminigame.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by SunJae on 2017-02-11.
 */

public class ClickGameLevelDialog extends Dialog {

    public ClickGameLevelDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 다이얼로그 외부 화면 흐리게 표현
        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow);
        setContentView(R.layout.dialog_menu);
        ButterKnife.bind(this);
    }
}
