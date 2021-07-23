package com.mt.test01;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Login1Activity extends AppCompatActivity {

    private CheckBox cb1;
    private CheckBox cb2;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        ImageView pzBtn=(ImageView)findViewById(R.id.pzBtn);
        TextView rtn=(TextView)findViewById(R.id.rtn1);

        imageView=(ImageView)findViewById(R.id.imgView);

        pzBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, null);
                intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                startActivityForResult(intent, 2);
            }
        });

        rtn.setOnClickListener(rtnClick);

        cb1=findViewById(R.id.radio1);
        cb2=findViewById(R.id.radio2);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    cb1.setBackgroundResource(R.drawable.btn_rd);
                    cb2.setChecked(false);
                    cb2.setBackgroundResource(R.drawable.btn_rd6);
                }
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    cb2.setBackgroundResource(R.drawable.btn_rd1);
                    cb1.setChecked(false);
                    cb1.setBackgroundResource(R.drawable.btn_rd5);
                }
            }
        });

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
                        text+= cb2.getText().toString();
                    }
                    Toast.makeText(Login1Activity.this,"你选择了"+text,Toast.LENGTH_LONG).show();
                }
                Intent intent=new Intent(Login1Activity.this,InterestActivity.class);
                startActivity(intent);
            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == 2) {
            // 从相册返回的数据
            if (data != null) {
                // 得到图片的全路径
                Uri uri = data.getData();
                imageView.setImageURI(uri);
            }
        }
    }

    private View.OnClickListener rtnClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onBackPressed();
        }
    };

}
