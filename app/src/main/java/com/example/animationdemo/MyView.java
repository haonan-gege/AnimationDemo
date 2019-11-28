package com.example.animationdemo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    public static final float RADIUS=70f;
    private Point currentPoint;
    private Paint mPaint;
    public MyView(Context context,AttributeSet attrs) {
        super(context,attrs);

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(currentPoint==null){
            currentPoint=new Point(RADIUS,RADIUS);
            float x=currentPoint.getX();
            float y=currentPoint.getY();
            canvas.drawCircle(x,y,RADIUS,mPaint);

            Point startPoint =new Point (RADIUS,RADIUS);
            Point endPoint=new Point(700,1000);

            ValueAnimator anim = ValueAnimator.ofObject(new PointEvaluator(), startPoint, endPoint);

            anim.setDuration(5000);

            anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {

                }
            });

        }
        super.onDraw(canvas);
    }
}
