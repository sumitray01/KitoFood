package com.example.kitofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText Uname,Pass,gmail;
Button Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn=findViewById(R.id.button);
        Uname = findViewById(R.id.name);
        gmail=findViewById(R.id.email);
        Pass=findViewById(R.id.pass);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=Uname.getText().toString();
                String pass=Pass.getText().toString();
                String email=gmail.getText().toString();

                Intent intent =new Intent(MainActivity.this,ShowActivity.class);
                intent.putExtra("uname",user);
                intent.putExtra("pass",pass);
                intent.putExtra("email",email);
                startActivity(intent);
            }
        });



    }


}