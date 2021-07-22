package com.mt.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView rtn=(TextView)findViewById(R.id.rtn);
        Button loginBtn=(Button)findViewById(R.id.loginBtn1);
        rtn.setOnClickListener(rtnClick);
        loginBtn.setOnClickListener(loginClick);

    }
    private View.OnClickListener rtnClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           onBackPressed();
        }
    };
    private View.OnClickListener loginClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(LoginActivity.this,Login1Activity.class);
            startActivity(intent);
        }
    };
}
