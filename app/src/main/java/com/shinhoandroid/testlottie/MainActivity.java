package com.shinhoandroid.testlottie;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lav = findViewById(R.id.lottieAnimationView);

        lav.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = (float)animation.getAnimatedValue();
                Log.e("lpf--","--"+value);
            }
        });


    }

    float f = 0.05f;

    public void bt1(View v){
        f+=0.05f;
        lav.setProgress(f);

    }

    public void bt2(View v){

        lav.playAnimation();

    }

}
