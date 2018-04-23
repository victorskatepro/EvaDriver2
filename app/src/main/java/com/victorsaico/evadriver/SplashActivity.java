package com.victorsaico.evadriver;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    @BindView(R.id.imgSplash)
    ImageView imgSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        setAnimation();
    }
    public void setAnimation()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imgSplash.animate().alpha(0.0f).setDuration(1000);
                    Intent intent = new Intent(SplashActivity.this, SignInActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
