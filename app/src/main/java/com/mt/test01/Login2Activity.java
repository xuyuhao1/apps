package com.mt.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Login2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        TextView rtn=(TextView)findViewById(R.id.rtn2);
        rtn.setOnClickListener(rtnClick);
        TextView btn=(TextView) findViewById(R.id.rg);
        btn.setOnClickListener(onClick);
    }
    private View.OnClickListener onClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(Login2Activity.this,LoginActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener rtnClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onBackPressed();
        }
    };

}
