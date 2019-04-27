package com.example.zb.mymvp3demo.base;

import java.util.Map;

/**
 * Created by zb on 2019/4/27.
 */

public abstract class BaseModel<T>{
    // 执行Get网络请求
    protected void requestGetAPI(String url,MvpCallback<T> callback){
        //这里写具体的网络请求
    }

    // 执行Post网络请求
    public abstract void requestPostAPI(String url, Map params, MvpCallback<T> callback);
}
