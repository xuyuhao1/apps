package com.mt.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class InterestActivity extends AppCompatActivity {

    private TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);
//        skip=findViewById(R.id.skip);
//
//        skip.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(InterestActivity.this,HomeActivity.class);
//                startActivity(intent);
//            }
//        });
    }

}
