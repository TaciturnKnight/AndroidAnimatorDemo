package com.tong.animatordemo.act;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tong.animatordemo.R;

/**
 * Created by tong on 2018/6/25 下午3:39
 */
public class JavaMainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Path path = new Path();
        path.moveTo(100, 100);
        path.quadTo(300, 100, 299, 188);

        textView = findViewById(R.id.rotatetv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(textView, View.X, View.Y, path);
                animator.setDuration(3000);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        PropertyValuesHolder[] values = animation.getValues();
                        int length = values.length;
                    }
                });
                animator.start();
            }
        });
    }
}
