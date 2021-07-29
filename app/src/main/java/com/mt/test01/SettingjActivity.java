package com.mt.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SettingjActivity extends AppCompatActivity {

    private ImageButton back;
    private LinearLayout privacySetting;
    private LinearLayout messageSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    back=findViewById(R.id.back);
    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onBackPressed();
        }
    });
    privacySetting=findViewById(R.id.toPrivacySetting);
    privacySetting.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(SettingjActivity.this,PrivacySettingActivity.class);
            startActivity(intent);
        }
    });

        messageSetting=findViewById(R.id.toMessageSetting);
        messageSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SettingjActivity.this,MessageSettingActivity.class);
                startActivity(intent);
            }
        });

    }
}
