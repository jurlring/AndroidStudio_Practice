package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_move ;
    private EditText et_test;
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test= findViewById(R.id.et_test);

        btn_move=findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=et_test.getText().toString();
                Intent intent=new Intent(MainActivity.this,subactivity.class);
                intent.putExtra("str",str);
                startActivities(new Intent[]{intent});
            }
        });

    }

}