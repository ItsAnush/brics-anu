package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView btn=findViewById(R.id.imageView12);
        btn.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this,LoginActivity.class));
            finish();
        });
    }
}
