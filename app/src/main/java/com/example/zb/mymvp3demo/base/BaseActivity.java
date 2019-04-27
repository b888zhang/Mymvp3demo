package com.example.zb.mymvp3demo.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import com.example.zb.mymvp3demo.R;
import com.example.zb.mymvp3demo.utils.ToastUtil;

/**
 * Created by zb on 2019/4/27.
 */

public class BaseActivity extends Activity implements BaseView {

    ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 初始化进度条
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCancelable(false);
        mProgressDialog.setTitle("正在加载中。。。。。");
    }
    @Override
    public void showLoading() {
        if (!mProgressDialog.isShowing()) {
            mProgressDialog.show();
        }
    }

    @Override
    public void hideLoading() {
        if (mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }
    @Override
    public void showToast(String msg) {
        ToastUtil.showToast(this,msg);
    }

    @Override
    public Context getContext() {
        return BaseActivity.this;
    }
}
