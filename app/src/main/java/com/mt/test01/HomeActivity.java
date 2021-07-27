package com.mt.test01;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
        public static Home1Activity instance;

        private FragmentManager fm;
        private Fragment mHomeFragment;
        private Fragment mCommonFragmentOne;
        private Fragment mMessageFragment;
        private Fragment mMineFragment;
        private Fragment mCurrent;

        private RelativeLayout mHomeLayout;
        private RelativeLayout mMessageLayout;
        private RelativeLayout mMineLayout;
        private ImageView mHomeView;
        private TextView home_text_view;
        private ImageView mMessageView;
        private TextView message_text_view;
        private ImageView mMineView;
        private TextView mine_text_view;

        private long exitTime = 0;




        protected void initView() {

            mHomeLayout = (RelativeLayout) findViewById(R.id.home_layout_view);
            mHomeLayout.setOnClickListener(this);
            mMessageLayout = (RelativeLayout) findViewById(R.id.message_layout_view);
            mMessageLayout.setOnClickListener(this);
            mMineLayout = (RelativeLayout) findViewById(R.id.mine_layout_view);
            mMineLayout.setOnClickListener(this);

            mHomeView = (ImageView) findViewById(R.id.home_image_view);
            home_text_view = (TextView) findViewById(R.id.home_text_view);
            mMessageView = (ImageView) findViewById(R.id.message_image_view);
            message_text_view = (TextView) findViewById(R.id.message_text_view);
            mMineView = (ImageView) findViewById(R.id.mine_image_view);
            mine_text_view = (TextView) findViewById(R.id.mine_text_view);

            mHomeView.setImageDrawable(getResources().getDrawable(R.mipmap.home1));
            home_text_view.setTextColor(getResources().getColor(R.color.switch_btn_colors));


            mHomeFragment = new Fragment();
            fm = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.content_layout, mHomeFragment);
            fragmentTransaction.commit();

        }

        private void hideFragment(Fragment fragment, FragmentTransaction ft) {
            if (fragment != null) {
                ft.hide(fragment);
            }
        }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.home_layout_view:
                    labelSelection(0);
                    break;
                case R.id.message_layout_view:
                    labelSelection(1);
                    break;
                case R.id.mine_layout_view:
                    labelSelection(2);
                    break;
                default:
                    break;
            }
        }

        public void labelSelection(int position) {

            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            switch (position) {
                case 0:
                    mHomeView.setImageDrawable(getResources().getDrawable(R.mipmap.home1));
                    home_text_view.setTextColor(getResources().getColor(R.color.switch_btn_colors));
                    mMessageView.setImageDrawable(getResources().getDrawable(R.mipmap.home2));
                    message_text_view.setTextColor(getResources().getColor(R.color.switch_btn_colors));
                    mMineView.setImageDrawable(getResources().getDrawable(R.mipmap.home3));
                    mine_text_view.setTextColor(getResources().getColor(R.color.switch_btn_colors));
                    hideFragment(mCommonFragmentOne, fragmentTransaction);
                    hideFragment(mMessageFragment, fragmentTransaction);
                    hideFragment(mMineFragment, fragmentTransaction);
                    if (mHomeFragment == null) {
                        mHomeFragment = new Fragment();
                        fragmentTransaction.add(R.id.content_layout, mHomeFragment);
                    } else {
                        mCurrent = mHomeFragment;
                        fragmentTransaction.show(mHomeFragment);
                    }
                    break;
                case 1:
                    mMessageView.setImageDrawable(getResources().getDrawable(R.mipmap.home2));
                    message_text_view.setTextColor(getResources().getColor(R.color.colorAccent));
                    mHomeView.setImageDrawable(getResources().getDrawable(R.mipmap.home1));
                    home_text_view.setTextColor(getResources().getColor(R.color.colorPrimary));
                    mMineView.setImageDrawable(getResources().getDrawable(R.mipmap.home3));
                    mine_text_view.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    hideFragment(mCommonFragmentOne, fragmentTransaction);
                    hideFragment(mHomeFragment, fragmentTransaction);
                    hideFragment(mMineFragment, fragmentTransaction);
                    if (mMessageFragment == null) {
                        mMessageFragment = new Fragment();
                        fragmentTransaction.add(R.id.content_layout, mMessageFragment);
                    } else {
                        mCurrent = mMessageFragment;
                        fragmentTransaction.show(mMessageFragment);
                    }
                    break;
                case 2:
                    mMineView.setImageDrawable(getResources().getDrawable(R.mipmap.home3));
                    mine_text_view.setTextColor(getResources().getColor(R.color.switch_btn_colors));
                    mHomeView.setImageDrawable(getResources().getDrawable(R.mipmap.home1));
                    home_text_view.setTextColor(getResources().getColor(R.color.switch_btn_colors));
                    mMessageView.setImageDrawable(getResources().getDrawable(R.mipmap.home2));
                    message_text_view.setTextColor(getResources().getColor(R.color.switch_btn_colors));
                    hideFragment(mCommonFragmentOne, fragmentTransaction);
                    hideFragment(mMessageFragment, fragmentTransaction);
                    hideFragment(mHomeFragment, fragmentTransaction);
                    if (mMineFragment == null) {
                        mMineFragment = new Fragment();
                        fragmentTransaction.add(R.id.content_layout, mMineFragment);
                    } else {
                        mCurrent = mMineFragment;
                        fragmentTransaction.show(mMineFragment);
                    }
                    break;
                default:
                    break;
            }
            fragmentTransaction.commit();

        }

        public boolean onKeyDown(int keyCode, KeyEvent event) {
            if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {

                if ((System.currentTimeMillis() - exitTime) > 2000) {
                   // ToastUtil.showToast("再按一次退出应用");
                    exitTime = System.currentTimeMillis();
                } else {
//                Intent intent = new Intent(Intent.ACTION_MAIN);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                intent.addCategory(Intent.CATEGORY_HOME);
//                startActivity(intent);
                    finish();
                }
                return true;
            }
            return super.onKeyDown(keyCode, event);
        }




}
