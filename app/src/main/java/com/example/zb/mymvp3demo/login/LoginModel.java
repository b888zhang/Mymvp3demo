package com.example.zb.mymvp3demo.login;
import android.telecom.Call;

import com.example.zb.mymvp3demo.base.BaseModel;
import com.example.zb.mymvp3demo.base.MvpCallback;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Callback;
import okhttp3.Response;

/**
 * 联网获取数据
 * Created by zb on 2019/4/27.
 */

public class LoginModel extends BaseModel<String>{
    @Override
    public void requestPostAPI(String url, Map params, final MvpCallback<String> callback) {

        HttpUtils.doPost(url, params, new Callback(){
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
                callback.onFailure(e.getMessage());
            }

            @Override
            public void onResponse(okhttp3.Call call, Response response) throws IOException {
                String string = response.body().string();
                callback.onSuccess(string);
            }
        });
    }

}
