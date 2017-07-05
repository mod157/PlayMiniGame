package com.nammu.playminigame.main;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.nammu.playminigame.R;
import com.nammu.playminigame.clickgame.ClickGameActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_main)
    RecyclerView recyclerViewMenu;

    private MenuAdapter adapter;
    private Integer[] menuBitMapList = new Integer[]{new Integer(R.drawable.puzzle), new Integer(R.drawable.puzzle)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        //for(int img : menu_BitMapList){
        recyclerViewMenu.setLayoutManager(layoutManager);
        adapter = new MenuAdapter(this, menuBitMapList);
        recyclerViewMenu.setAdapter(adapter);
        //}
    }
}
