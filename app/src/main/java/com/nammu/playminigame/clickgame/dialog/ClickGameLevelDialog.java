package com.nammu.playminigame.clickgame.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.nammu.playminigame.MiniGameApplication;
import com.nammu.playminigame.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by SunJae on 2017-02-11.
 */

public class ClickGameLevelDialog extends Dialog {
    private Context context;
    private LevelClickEvent clickEvent;
    @BindView(R.id.tv_dialog_level_easy)
    TextView tv_level_easy;
    @BindView(R.id.tv_dialog_level_normal)
    TextView tv_level_normal;
    @BindView(R.id.tv_dialog_level_hard)
    TextView tv_level_hard;

    @OnClick(R.id.tv_dialog_level_easy)
    public void easySelect(){
        Toast.makeText(context, "초급 시작합니다.", Toast.LENGTH_SHORT).show();
        clickEvent.onClickLevel(MiniGameApplication.GAME_LEVEL_EASY);
    }

    @OnClick(R.id.tv_dialog_level_normal)
    public void normalSelect(){
        Toast.makeText(context, "중급 시작합니다.", Toast.LENGTH_SHORT).show();
        clickEvent.onClickLevel(MiniGameApplication.GAME_LEVEL_NORMAL);
    }

    @OnClick(R.id.tv_dialog_level_hard)
    public void hardSelect(){
        Toast.makeText(context, "고급 시작합니다.", Toast.LENGTH_SHORT).show();
        clickEvent.onClickLevel(MiniGameApplication.GAME_LEVEL_HARD);
    }

    public ClickGameLevelDialog(Context context, LevelClickEvent clickEvent) {
        super(context);
        this.context = context;
        this.clickEvent = clickEvent;
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

    public interface LevelClickEvent{
        public void onClickLevel(int level);
    }
}
