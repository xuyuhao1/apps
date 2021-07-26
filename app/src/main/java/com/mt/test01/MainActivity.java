package com.mt.test01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton rb=  (RadioButton)findViewById(R.id.radioMale);
        Button loginBtn=findViewById(R.id.loginBtn);
        rb.setOnClickListener(onClick);
        loginBtn.setOnClickListener(loginClick);
    }
    private View.OnClickListener onClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            alertDialog2(view);
        }
    };

    private View.OnClickListener loginClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            alertDialog2(view);
        }
    };

    /**
     * 自定义样式的弹出窗
     * @param view
     */
    public void alertDialog2(final View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // 自定义 title样式
        TextView title = new TextView(this);
        title.setText("温馨提示");
        title.setTextSize(18);
        title.setTextColor(Color.parseColor("#333333"));
        title.setGravity(Gravity.CENTER);
        title.setPadding(0,80,0,20);
        builder.setCustomTitle(title);
        // 中间的信息以一个view的形式设置进去
        String str1 = "阅读并同意<font color = '#FCD633'>《用户协议》《隐私政策》</font>方可登录";
        TextView msg = new TextView(this);
        msg.setText(Html.fromHtml(str1));
        msg.setWidth(40);
        msg.setTextSize(14);
        msg.setPadding(90, 0, 90, 0);
        builder.setView(msg);

        builder.setPositiveButton("同意", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent=new Intent(MainActivity.this,Login2Activity.class);
                startActivity(intent);
            }
        }).setNegativeButton("取消", null);
        // 调用 show()方法后得到 dialog对象
        AlertDialog dialog = builder.show();
        final Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        final Button negativeButton=dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
        LinearLayout.LayoutParams positiveParams =(LinearLayout.LayoutParams)positiveButton.getLayoutParams();
        positiveParams.gravity = Gravity.CENTER;
        positiveParams.setMargins(10,10,10,10);
        positiveParams.width = 0;
        // 安卓下面有三个位置的按钮，默认权重为 1,设置成 500或更大才能让两个按钮看起来均分
        positiveParams.weight  = 500;
        LinearLayout.LayoutParams negativeParams =(LinearLayout.LayoutParams)negativeButton.getLayoutParams();
        negativeParams.gravity = Gravity.CENTER;
        positiveParams.setMargins(10,10,10,10);
        negativeParams.width = 0;
        negativeParams.weight = 500;
        positiveButton.setLayoutParams(positiveParams);
        negativeButton.setLayoutParams(negativeParams);
        positiveButton.setBackgroundResource(R.drawable.btn_normal);
        positiveButton.setTextColor(Color.parseColor("#FFFFFF"));
        negativeButton.setBackgroundColor(Color.parseColor("#FFFFFF"));
        negativeButton.setTextColor(Color.parseColor("#333333"));


//        view = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_xq, null);
//        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//        builder.setView(view).show();

    }

}
