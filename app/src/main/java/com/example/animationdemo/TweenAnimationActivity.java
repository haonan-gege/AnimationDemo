package com.example.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TweenAnimationActivity extends AppCompatActivity {
    private TextView testView;
    private ImageView ivInside;
    private ImageView ivOuter;
    private Button btn_scale;
    private Button btn_rotate;
    private Button btn_set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        testView=findViewById(R.id.tv_view);
        ivInside=findViewById(R.id.iv_inside_circle);
        ivOuter=findViewById(R.id.iv_outer_circle);
        btn_scale=findViewById(R.id.btn_scale);
        btn_rotate=findViewById(R.id.btn_rotate);
        btn_set=findViewById(R.id.btn_set);

        Animation insideCircle= AnimationUtils.loadAnimation(this,R.anim.inside_rotate);
        insideCircle.setInterpolator(new LinearInterpolator());
        Animation outCircle= AnimationUtils.loadAnimation(this,R.anim.outside_rotate);
        outCircle.setInterpolator(new LinearInterpolator());

        ivInside.startAnimation(insideCircle);
        ivOuter.startAnimation(outCircle);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_translation:
                //根据anim/xml创建
                Animation animation= AnimationUtils.loadAnimation(this,R.anim.anim_translate);
                testView.startAnimation(animation);
                //动态创建实现xml功能
//                Animation animation=new TranslateAnimation(0,100,0,500);
//                animation.setDuration(3000);
//                testView.startAnimation(animation);
                break;

            case R.id.btn_scale:
                Animation loadanimation= AnimationUtils.loadAnimation(this,R.anim.anim_scale);
                testView.startAnimation(loadanimation);
                break;

            case R.id.btn_rotate:
                Animation insideCircle= AnimationUtils.loadAnimation(this,R.anim.inside_rotate);
                testView.startAnimation(insideCircle);
//                Animation outCircle= AnimationUtils.loadAnimation(this,R.anim.outside_rotate);
//                testView.startAnimation(outCircle);
                break;

            case R.id.btn_set:
                Animation animation1=AnimationUtils.loadAnimation(this,R.anim.anim_set);
                testView.startAnimation(animation1);






        }
    }
}
