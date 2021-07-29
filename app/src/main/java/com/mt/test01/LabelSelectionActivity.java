package com.mt.test01;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LabelSelectionActivity extends AppCompatActivity {

    private CheckBox msLabel1;
    private CheckBox msLabel2;
    private CheckBox msLabel3;
    private CheckBox msLabel4;
    private CheckBox msLabel5;
    private CheckBox msLabel6;

    private CheckBox jbLabel1;
    private CheckBox jbLabel2;
    private CheckBox jbLabel3;
    private CheckBox jbLabel4;
    private CheckBox jbLabel5;
    private CheckBox jbLabel6;

    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lable_selection);

        msLabel1=findViewById(R.id.msLabel1);
        msLabel2=findViewById(R.id.msLabel2);
        msLabel3=findViewById(R.id.msLabel3);
        msLabel4=findViewById(R.id.msLabel4);
        msLabel5=findViewById(R.id.msLabel5);
        msLabel6=findViewById(R.id.msLabel6);

        jbLabel1=findViewById(R.id.jbLabel1);
        jbLabel2=findViewById(R.id.jbLabel2);
        jbLabel3=findViewById(R.id.jbLabel3);
        jbLabel4=findViewById(R.id.jbLabel4);
        jbLabel5=findViewById(R.id.jbLabel5);
        jbLabel6=findViewById(R.id.jbLabel6);

        msLabel1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msLabel1.setBackgroundResource(R.drawable.btn_rd7);
                    msLabel2.setChecked(false);
                    msLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel3.setChecked(false);
                    msLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel4.setChecked(false);
                    msLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel5.setChecked(false);
                    msLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel6.setChecked(false);
                    msLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msLabel2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msLabel2.setBackgroundResource(R.drawable.btn_rd7);
                    msLabel1.setChecked(false);
                    msLabel1.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel3.setChecked(false);
                    msLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel4.setChecked(false);
                    msLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel5.setChecked(false);
                    msLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel6.setChecked(false);
                    msLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msLabel3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msLabel3.setBackgroundResource(R.drawable.btn_rd7);
                    msLabel2.setChecked(false);
                    msLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel1.setChecked(false);
                    msLabel1.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel4.setChecked(false);
                    msLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel5.setChecked(false);
                    msLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel6.setChecked(false);
                    msLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msLabel4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msLabel4.setBackgroundResource(R.drawable.btn_rd7);
                    msLabel2.setChecked(false);
                    msLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel3.setChecked(false);
                    msLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel1.setChecked(false);
                    msLabel1.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel5.setChecked(false);
                    msLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel6.setChecked(false);
                    msLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msLabel5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msLabel5.setBackgroundResource(R.drawable.btn_rd7);
                    msLabel2.setChecked(false);
                    msLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel3.setChecked(false);
                    msLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel4.setChecked(false);
                    msLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel1.setChecked(false);
                    msLabel1.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel6.setChecked(false);
                    msLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msLabel6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msLabel6.setBackgroundResource(R.drawable.btn_rd7);
                    msLabel2.setChecked(false);
                    msLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel3.setChecked(false);
                    msLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel4.setChecked(false);
                    msLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel5.setChecked(false);
                    msLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    msLabel1.setChecked(false);
                    msLabel1.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbLabel1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbLabel1.setBackgroundResource(R.drawable.btn_rd7);
                    jbLabel2.setChecked(false);
                    jbLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel3.setChecked(false);
                    jbLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel4.setChecked(false);
                    jbLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel5.setChecked(false);
                    jbLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel6.setChecked(false);
                    jbLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbLabel2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbLabel2.setBackgroundResource(R.drawable.btn_rd7);
                    jbLabel1.setChecked(false);
                    jbLabel1.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel3.setChecked(false);
                    jbLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel4.setChecked(false);
                    jbLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel5.setChecked(false);
                    jbLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel6.setChecked(false);
                    jbLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbLabel3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbLabel3.setBackgroundResource(R.drawable.btn_rd7);
                    jbLabel2.setChecked(false);
                    jbLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel1.setChecked(false);
                    jbLabel1.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel4.setChecked(false);
                    jbLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel5.setChecked(false);
                    jbLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel6.setChecked(false);
                    jbLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbLabel4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbLabel4.setBackgroundResource(R.drawable.btn_rd7);
                    jbLabel2.setChecked(false);
                    jbLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel3.setChecked(false);
                    jbLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel1.setChecked(false);
                    jbLabel1.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel5.setChecked(false);
                    jbLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel6.setChecked(false);
                    jbLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbLabel5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbLabel5.setBackgroundResource(R.drawable.btn_rd7);
                    jbLabel2.setChecked(false);
                    jbLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel3.setChecked(false);
                    jbLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel4.setChecked(false);
                    jbLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel1.setChecked(false);
                    jbLabel1.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel6.setChecked(false);
                    jbLabel6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbLabel6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbLabel6.setBackgroundResource(R.drawable.btn_rd7);
                    jbLabel2.setChecked(false);
                    jbLabel2.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel3.setChecked(false);
                    jbLabel3.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel4.setChecked(false);
                    jbLabel4.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel5.setChecked(false);
                    jbLabel5.setBackgroundResource(R.drawable.btn_rd2);
                    jbLabel1.setChecked(false);
                    jbLabel1.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
