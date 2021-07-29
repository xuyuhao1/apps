package com.mt.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PrivacySettingActivity extends AppCompatActivity {

    private ImageButton back;
    private RelativeLayout toBlacklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_setting);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        toBlacklist=findViewById(R.id.toBlacklist);
        toBlacklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PrivacySettingActivity.this,BlacklistActivity.class);
                startActivity(intent);
            }
        });
    }
}
