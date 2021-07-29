package com.mt.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class EditDataActivity extends AppCompatActivity {

    private LinearLayout toname;
    private LinearLayout toJj;
    private LinearLayout toLabel;

    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);

        toname=findViewById(R.id.toName);
        toJj=findViewById(R.id.toJj);
        toLabel=findViewById(R.id.toLabel);
        back=findViewById(R.id.back);

        toname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EditDataActivity.this,EditNameActivity.class);
                startActivity(intent);
             }
        });

        toJj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EditDataActivity.this,EditJjActivity.class);
                startActivity(intent);
            }
        });

        toLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EditDataActivity.this,LabelSelectionActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
