package com.example.kitofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
TextView user,email,pass;
String u,e,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        user=findViewById(R.id.mt1);
        email=findViewById(R.id.mt2);
        pass=findViewById(R.id.mt3);
        Intent intent=getIntent();
        u=intent.getStringExtra("uname");
        e=intent.getStringExtra("email");
        p=intent.getStringExtra("pass");
        user.setText(u);
        email.setText(e);
        pass.setText(p);

    }
}