package com.example.yikezhong0506;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.yikezhong0506.ui.Recommend.RecommendFragment;
import com.example.yikezhong0506.ui.base.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;


public class MainActivity extends BaseActivity {

    private FragmentManager fragmentManager;
    private SimpleDraweeView mNameImage;
    private ImageView mChuangzuo;
    private LinearLayout mLay;
    private FrameLayout mFlout;
    /**
     * 推荐
     */
    private RadioButton mBtn1;
    /**
     * 段子
     */
    private RadioButton mBtn2;
    /**
     * 视频
     */
    private RadioButton mBtn3;
    private RadioGroup mRg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentLayout());
        initView();
        fragmentManager = getSupportFragmentManager();
        RecommendFragment recommendFragment = new RecommendFragment();
        fragmentManager.beginTransaction().replace(R.id.flout, recommendFragment).commit();
        //设置点击事件
        setLisenter();
    }

    private void setLisenter() {
    }

    private void initView() {
        mNameImage =  findViewById(R.id.name_image);
        mChuangzuo =  findViewById(R.id.chuangzuo);
        mLay =  findViewById(R.id.lay);
        mFlout =  findViewById(R.id.flout);
        mBtn1 =  findViewById(R.id.btn1);
        mBtn2 =  findViewById(R.id.btn2);
        mBtn3 =  findViewById(R.id.btn3);
        mRg =  findViewById(R.id.rg);
        Uri uri = Uri.parse("http://tx.haiqq.com/uploads/allimg/160812/102GJ358-9.jpg");
        mNameImage.setImageURI(uri);
    }

    @Override
    public int getContentLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void inject() {

    }

    @Override
    public void initView(View view) {

    }
}
