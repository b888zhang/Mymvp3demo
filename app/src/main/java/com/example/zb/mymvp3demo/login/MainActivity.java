package com.example.zb.mymvp3demo.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.zb.mymvp3demo.R;
import com.example.zb.mymvp3demo.base.BaseActivity;

import java.util.HashMap;

public class MainActivity extends BaseActivity implements LoginView {

    TextView      text;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        //初始化Presenter
        presenter = new LoginPresenter();
        //绑定view引用
        presenter.attachView(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //断开view引用
        presenter.detachView();
    }
    @Override
    public void showData(final String data) {
            this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    text.setText(data);
                }
            });
    }

    @Override
    public void showToast(String msg) {
        super.showToast(msg);
    }

    // button 点击事件调用方法
    public void getData(View view){
        HashMap<String, String> param=new HashMap<>();
        param.put("code","admin");
        param.put("password","123456");
        String url="http://192.168.200.211:8081/GetUserInfo";
        presenter.getData(url,param);
    }


}
