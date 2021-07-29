package com.mt.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Home5Activity extends AppCompatActivity {

    private ImageButton edit;
    private ImageButton setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home5);

        edit=findViewById(R.id.edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home5Activity.this,EditDataActivity.class);
                startActivity(intent);
            }
        });
        setting=findViewById(R.id.setting);
        setting.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home5Activity.this,SettingjActivity.class);
                startActivity(intent);
            }
        });
    }
}
