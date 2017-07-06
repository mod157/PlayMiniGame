package com.nammu.playminigame.main;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.nammu.playminigame.MiniGameApplication;
import com.nammu.playminigame.R;
import com.nammu.playminigame.clickgame.ClickGameActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mod15 on 2017-07-05.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private Context context;
    private Integer[] imgList;
    public MenuAdapter(Context context, Integer[] imgList){
        this.context = context;
        this.imgList = imgList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_main_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
         int img = imgList[position];
         holder.img_menu.setImageResource(img);
    }

    @Override
    public int getItemCount() {
        return imgList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        @OnClick(R.id.img_menu)
        public void onClick(View view){
            switch(getPosition()){
                case MiniGameApplication.CLICK_GAME_NO:
                    Intent intent = new Intent(context, ClickGameActivity.class);
                    context.startActivity(intent);
                    break;
                case MiniGameApplication.LONGCLICK_GAME_NO:
                    Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
        @BindView(R.id.img_menu)
        ImageView img_menu;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
