package com.mt.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;


public class InterestActivity extends AppCompatActivity {

    private CheckBox msCount1;
    private CheckBox msCount2;
    private CheckBox msCount3;
    private CheckBox msCount4;
    private CheckBox msCount5;
    private CheckBox msCount6;

    private CheckBox msType1;
    private CheckBox msType2;
    private CheckBox msType3;
    private CheckBox msType4;
    private CheckBox msType5;
    private CheckBox msType6;

    private CheckBox msBq1;
    private CheckBox msBq2;
    private CheckBox msBq3;
    private CheckBox msBq4;
    private CheckBox msBq5;
    private CheckBox msBq6;

    private CheckBox jbCount1;
    private CheckBox jbCount2;
    private CheckBox jbCount3;
    private CheckBox jbCount4;
    private CheckBox jbCount5;
    private CheckBox jbCount6;

    private CheckBox jbType1;
    private CheckBox jbType2;
    private CheckBox jbType3;
    private CheckBox jbType4;
    private CheckBox jbType5;
    private CheckBox jbType6;

    private CheckBox jbBq1;
    private CheckBox jbBq2;
    private CheckBox jbBq3;
    private CheckBox jbBq4;
    private CheckBox jbBq5;
    private CheckBox jbBq6;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);

        msCount1=findViewById(R.id.msCount1);
        msCount2=findViewById(R.id.msCount2);
        msCount3=findViewById(R.id.msCount3);
        msCount4=findViewById(R.id.msCount4);
        msCount5=findViewById(R.id.msCount5);
        msCount6=findViewById(R.id.msCount6);

        msBq1=findViewById(R.id.label1);
        msBq2=findViewById(R.id.label2);
        msBq3=findViewById(R.id.label3);
        msBq4=findViewById(R.id.label4);
        msBq5=findViewById(R.id.label5);
        msBq6=findViewById(R.id.label6);

        jbCount1=findViewById(R.id.jbCount1);
        jbCount2=findViewById(R.id.jbCount2);
        jbCount3=findViewById(R.id.jbCount3);
        jbCount4=findViewById(R.id.jbCount4);
        jbCount5=findViewById(R.id.jbCount5);
        jbCount6=findViewById(R.id.jbCount6);

        jbBq1=findViewById(R.id.jbBq1);
        jbBq2=findViewById(R.id.jbBq2);
        jbBq3=findViewById(R.id.jbBq3);
        jbBq4=findViewById(R.id.jbBq4);
        jbBq5=findViewById(R.id.jbBq5);
        jbBq6=findViewById(R.id.jbBq6);

        msType1=findViewById(R.id.msType1);
        msType2=findViewById(R.id.msType2);
        msType3=findViewById(R.id.msType3);
        msType4=findViewById(R.id.msType4);
        msType5=findViewById(R.id.msType5);
        msType6=findViewById(R.id.msType6);

        jbType1=findViewById(R.id.jbType1);
        jbType2=findViewById(R.id.jbType2);
        jbType3=findViewById(R.id.jbType3);
        jbType4=findViewById(R.id.jbType4);
        jbType5=findViewById(R.id.jbType5);
        jbType6=findViewById(R.id.jbType6);


        msCount1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msCount1.setBackgroundResource(R.drawable.btn_rd7);
                    msCount2.setChecked(false);
                    msCount2.setBackgroundResource(R.drawable.btn_rd2);
                    msCount3.setChecked(false);
                    msCount3.setBackgroundResource(R.drawable.btn_rd2);
                    msCount4.setChecked(false);
                    msCount4.setBackgroundResource(R.drawable.btn_rd2);
                    msCount5.setChecked(false);
                    msCount5.setBackgroundResource(R.drawable.btn_rd2);
                    msCount6.setChecked(false);
                    msCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msCount2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msCount2.setBackgroundResource(R.drawable.btn_rd7);
                    msCount1.setChecked(false);
                    msCount1.setBackgroundResource(R.drawable.btn_rd2);
                    msCount3.setChecked(false);
                    msCount3.setBackgroundResource(R.drawable.btn_rd2);
                    msCount4.setChecked(false);
                    msCount4.setBackgroundResource(R.drawable.btn_rd2);
                    msCount5.setChecked(false);
                    msCount5.setBackgroundResource(R.drawable.btn_rd2);
                    msCount6.setChecked(false);
                    msCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msCount3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msCount3.setBackgroundResource(R.drawable.btn_rd7);
                    msCount2.setChecked(false);
                    msCount2.setBackgroundResource(R.drawable.btn_rd2);
                    msCount1.setChecked(false);
                    msCount1.setBackgroundResource(R.drawable.btn_rd2);
                    msCount4.setChecked(false);
                    msCount4.setBackgroundResource(R.drawable.btn_rd2);
                    msCount5.setChecked(false);
                    msCount5.setBackgroundResource(R.drawable.btn_rd2);
                    msCount6.setChecked(false);
                    msCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msCount4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msCount4.setBackgroundResource(R.drawable.btn_rd7);
                    msCount2.setChecked(false);
                    msCount2.setBackgroundResource(R.drawable.btn_rd2);
                    msCount3.setChecked(false);
                    msCount3.setBackgroundResource(R.drawable.btn_rd2);
                    msCount1.setChecked(false);
                    msCount1.setBackgroundResource(R.drawable.btn_rd2);
                    msCount5.setChecked(false);
                    msCount5.setBackgroundResource(R.drawable.btn_rd2);
                    msCount6.setChecked(false);
                    msCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msCount5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msCount5.setBackgroundResource(R.drawable.btn_rd7);
                    msCount2.setChecked(false);
                    msCount2.setBackgroundResource(R.drawable.btn_rd2);
                    msCount3.setChecked(false);
                    msCount3.setBackgroundResource(R.drawable.btn_rd2);
                    msCount4.setChecked(false);
                    msCount4.setBackgroundResource(R.drawable.btn_rd2);
                    msCount1.setChecked(false);
                    msCount1.setBackgroundResource(R.drawable.btn_rd2);
                    msCount6.setChecked(false);
                    msCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msCount6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msCount6.setBackgroundResource(R.drawable.btn_rd7);
                    msCount2.setChecked(false);
                    msCount2.setBackgroundResource(R.drawable.btn_rd2);
                    msCount3.setChecked(false);
                    msCount3.setBackgroundResource(R.drawable.btn_rd2);
                    msCount4.setChecked(false);
                    msCount4.setBackgroundResource(R.drawable.btn_rd2);
                    msCount5.setChecked(false);
                    msCount5.setBackgroundResource(R.drawable.btn_rd2);
                    msCount1.setChecked(false);
                    msCount1.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msBq1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msBq1.setBackgroundResource(R.drawable.btn_rd7);
                    msBq2.setChecked(false);
                    msBq2.setBackgroundResource(R.drawable.btn_rd2);
                    msBq3.setChecked(false);
                    msBq3.setBackgroundResource(R.drawable.btn_rd2);
                    msBq4.setChecked(false);
                    msBq4.setBackgroundResource(R.drawable.btn_rd2);
                    msBq5.setChecked(false);
                    msBq5.setBackgroundResource(R.drawable.btn_rd2);
                    msBq6.setChecked(false);
                    msBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msBq2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msBq2.setBackgroundResource(R.drawable.btn_rd7);
                    msBq1.setChecked(false);
                    msBq1.setBackgroundResource(R.drawable.btn_rd2);
                    msBq3.setChecked(false);
                    msBq3.setBackgroundResource(R.drawable.btn_rd2);
                    msBq4.setChecked(false);
                    msBq4.setBackgroundResource(R.drawable.btn_rd2);
                    msBq5.setChecked(false);
                    msBq5.setBackgroundResource(R.drawable.btn_rd2);
                    msBq6.setChecked(false);
                    msBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msBq3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msBq3.setBackgroundResource(R.drawable.btn_rd7);
                    msBq2.setChecked(false);
                    msBq2.setBackgroundResource(R.drawable.btn_rd2);
                    msBq1.setChecked(false);
                    msBq1.setBackgroundResource(R.drawable.btn_rd2);
                    msBq4.setChecked(false);
                    msBq4.setBackgroundResource(R.drawable.btn_rd2);
                    msBq5.setChecked(false);
                    msBq5.setBackgroundResource(R.drawable.btn_rd2);
                    msBq6.setChecked(false);
                    msBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msBq4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msBq4.setBackgroundResource(R.drawable.btn_rd7);
                    msBq2.setChecked(false);
                    msBq2.setBackgroundResource(R.drawable.btn_rd2);
                    msBq3.setChecked(false);
                    msBq3.setBackgroundResource(R.drawable.btn_rd2);
                    msBq1.setChecked(false);
                    msBq1.setBackgroundResource(R.drawable.btn_rd2);
                    msBq5.setChecked(false);
                    msBq5.setBackgroundResource(R.drawable.btn_rd2);
                    msBq6.setChecked(false);
                    msBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msBq5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msBq5.setBackgroundResource(R.drawable.btn_rd7);
                    msBq2.setChecked(false);
                    msBq2.setBackgroundResource(R.drawable.btn_rd2);
                    msBq3.setChecked(false);
                    msBq3.setBackgroundResource(R.drawable.btn_rd2);
                    msBq4.setChecked(false);
                    msBq4.setBackgroundResource(R.drawable.btn_rd2);
                    msBq1.setChecked(false);
                    msBq1.setBackgroundResource(R.drawable.btn_rd2);
                    msBq6.setChecked(false);
                    msBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msBq6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msBq6.setBackgroundResource(R.drawable.btn_rd7);
                    msBq2.setChecked(false);
                    msBq2.setBackgroundResource(R.drawable.btn_rd2);
                    msBq3.setChecked(false);
                    msBq3.setBackgroundResource(R.drawable.btn_rd2);
                    msBq4.setChecked(false);
                    msBq4.setBackgroundResource(R.drawable.btn_rd2);
                    msBq5.setChecked(false);
                    msBq5.setBackgroundResource(R.drawable.btn_rd2);
                    msBq1.setChecked(false);
                    msBq1.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbCount1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbCount1.setBackgroundResource(R.drawable.btn_rd7);
                    jbCount2.setChecked(false);
                    jbCount2.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount3.setChecked(false);
                    jbCount3.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount4.setChecked(false);
                    jbCount4.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount5.setChecked(false);
                    jbCount5.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount6.setChecked(false);
                    jbCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbCount2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbCount2.setBackgroundResource(R.drawable.btn_rd7);
                    jbCount1.setChecked(false);
                    jbCount1.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount3.setChecked(false);
                    jbCount3.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount4.setChecked(false);
                    jbCount4.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount5.setChecked(false);
                    jbCount5.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount6.setChecked(false);
                    jbCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbCount3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbCount3.setBackgroundResource(R.drawable.btn_rd7);
                    jbCount2.setChecked(false);
                    jbCount2.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount1.setChecked(false);
                    jbCount1.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount4.setChecked(false);
                    jbCount4.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount5.setChecked(false);
                    jbCount5.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount6.setChecked(false);
                    jbCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbCount4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbCount4.setBackgroundResource(R.drawable.btn_rd7);
                    jbCount2.setChecked(false);
                    jbCount2.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount3.setChecked(false);
                    jbCount3.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount1.setChecked(false);
                    jbCount1.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount5.setChecked(false);
                    jbCount5.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount6.setChecked(false);
                    jbCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbCount5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbCount5.setBackgroundResource(R.drawable.btn_rd7);
                    jbCount2.setChecked(false);
                    jbCount2.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount3.setChecked(false);
                    jbCount3.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount4.setChecked(false);
                    jbCount4.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount1.setChecked(false);
                    jbCount1.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount6.setChecked(false);
                    jbCount6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbCount6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbCount6.setBackgroundResource(R.drawable.btn_rd7);
                    jbCount2.setChecked(false);
                    jbCount2.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount3.setChecked(false);
                    jbCount3.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount4.setChecked(false);
                    jbCount4.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount5.setChecked(false);
                    jbCount5.setBackgroundResource(R.drawable.btn_rd2);
                    jbCount1.setChecked(false);
                    jbCount1.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbBq1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbBq1.setBackgroundResource(R.drawable.btn_rd7);
                    jbBq2.setChecked(false);
                    jbBq2.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq3.setChecked(false);
                    jbBq3.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq4.setChecked(false);
                    jbBq4.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq5.setChecked(false);
                    jbBq5.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq6.setChecked(false);
                    jbBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbBq2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbBq2.setBackgroundResource(R.drawable.btn_rd7);
                    jbBq1.setChecked(false);
                    jbBq1.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq3.setChecked(false);
                    jbBq3.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq4.setChecked(false);
                    jbBq4.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq5.setChecked(false);
                    jbBq5.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq6.setChecked(false);
                    jbBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbBq3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbBq3.setBackgroundResource(R.drawable.btn_rd7);
                    jbBq2.setChecked(false);
                    jbBq2.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq1.setChecked(false);
                    jbBq1.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq4.setChecked(false);
                    jbBq4.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq5.setChecked(false);
                    jbBq5.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq6.setChecked(false);
                    jbBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbBq4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbBq4.setBackgroundResource(R.drawable.btn_rd7);
                    jbBq2.setChecked(false);
                    jbBq2.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq3.setChecked(false);
                    jbBq3.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq1.setChecked(false);
                    jbBq1.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq5.setChecked(false);
                    jbBq5.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq6.setChecked(false);
                    jbBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbBq5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbBq5.setBackgroundResource(R.drawable.btn_rd7);
                    jbBq2.setChecked(false);
                    jbBq2.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq3.setChecked(false);
                    jbBq3.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq4.setChecked(false);
                    jbBq4.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq1.setChecked(false);
                    jbBq1.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq6.setChecked(false);
                    jbBq6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbBq6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbBq6.setBackgroundResource(R.drawable.btn_rd7);
                    jbBq2.setChecked(false);
                    jbBq2.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq3.setChecked(false);
                    jbBq3.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq4.setChecked(false);
                    jbBq4.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq5.setChecked(false);
                    jbBq5.setBackgroundResource(R.drawable.btn_rd2);
                    jbBq1.setChecked(false);
                    jbBq1.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        msType1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msType1.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    msType1.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        msType2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msType2.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    msType2.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        msType3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msType3.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    msType3.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        msType4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msType4.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    msType4.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        msType5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msType5.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    msType5.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        msType6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    msType6.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    msType6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });

        jbType1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbType1.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    jbType1.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbType2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbType2.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    jbType2.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbType3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbType3.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    jbType3.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbType4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbType4.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    jbType4.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbType5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbType5.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    jbType5.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        jbType6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    jbType6.setBackgroundResource(R.drawable.btn_rd7);
                }else{
                    jbType6.setBackgroundResource(R.drawable.btn_rd2);
                }
            }
        });
        btn=findViewById(R.id.wc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(InterestActivity.this,Home1Activity.class);
                startActivity(intent);
            }
        });

    }

}
