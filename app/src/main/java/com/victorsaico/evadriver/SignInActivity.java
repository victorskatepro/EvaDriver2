package com.victorsaico.evadriver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void goRegister(View view) {
        startActivity(new Intent(this, SingUpActivity.class));
    }

    public void goDrawer(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
