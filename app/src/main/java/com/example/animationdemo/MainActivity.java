package com.example.animationdemo;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnTween;
    private Button btnFrame;
    private Button btnArrt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTween=findViewById(R.id.btn_tween);
        btnFrame=findViewById(R.id.btn_frame);
        btnArrt=findViewById(R.id.btn_attr);

        btnTween.setOnClickListener(this);
        btnFrame.setOnClickListener(this);
        btnArrt.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_tween:
                Intent intent=new Intent(MainActivity.this,TweenAnimationActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_frame:
                intent=new Intent(MainActivity.this, FrameAnimationActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_attr:
                intent=new Intent(MainActivity.this,ValueAnimation.class);
                startActivity(intent);
                break;
        }
    }
}

