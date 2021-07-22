package com.mt.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Login1Activity extends AppCompatActivity {

    private CheckBox cb1;
    private CheckBox cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        ImageView pzBtn=(ImageView)findViewById(R.id.pzBtn);
        TextView rtn=(TextView)findViewById(R.id.rtn1);
        pzBtn.setOnClickListener(onClick);
        rtn.setOnClickListener(rtnClick);

        cb1=findViewById(R.id.radio1);
        cb2=findViewById(R.id.radio2);

        Button wcBtn=findViewById(R.id.wc);
        wcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text ="";

                if(!cb1.isChecked()&&!cb2.isChecked()){
                    Toast.makeText(Login1Activity.this,"你未进行选择",Toast.LENGTH_LONG).show();
                }
                else {
                    if(cb1.isChecked()){
                        text+= cb1.getText().toString();
                    }
                    if(cb2.isChecked()){
                        text+=cb2.getText().toString();
                    }
                    Toast.makeText(Login1Activity.this,"你选择了"+text,Toast.LENGTH_LONG).show();
                }
                Intent intent=new Intent(Login1Activity.this,InterestActivity.class);
                startActivity(intent);
            }
        });

    }
    private View.OnClickListener onClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener rtnClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onBackPressed();
        }
    };

}
