package com.example.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameAnimationActivity extends AppCompatActivity {
    private ImageView ivFrame;
    private AnimationDrawable drawable;
    private Button btn_start;
    private Button btn_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        btn_start=findViewById(R.id.btn_start);
        btn_stop=findViewById(R.id.btn_stop);
        ivFrame=findViewById(R.id.iv_progress);

        //第1种方式:静态设置属性
        drawable=(AnimationDrawable)ivFrame.getBackground();
//        //动态设置帧动画
//        ivFrame.setImageResource(R.drawable.frame_anim);
//        drawable=(AnimationDrawable)ivFrame.getDrawable();
//        //动态创建帧动画\设置
//        drawable=createAnimation();
//        ivFrame.setImageDrawable(drawable);


//启动帧动画
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable.start();
            }
        });

        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawable.stop();
            }
        });

    }

//    private AnimationDrawable createAnimation() {
//        AnimationDrawable animationDrawable = new AnimationDrawable();
//        for (int i = 0; i < 8; i++) {
//            int id = getResources().getIdentifier("wait" + i, "drawable", getPackageName());
//            Drawable drawable = getResources().getDrawable(id);
//            animationDrawable.addFrame(drawable, 100);
//        }
//        return animationDrawable;
//
//    }


}




