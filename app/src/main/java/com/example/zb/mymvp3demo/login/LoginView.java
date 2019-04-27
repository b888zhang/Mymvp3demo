package com.example.zb.mymvp3demo.login;

import com.example.zb.mymvp3demo.base.BaseView;

/**
 * Created by zb on 2019/4/27.
 */

public interface LoginView extends BaseView {
    /**
     * 当数据请求成功后，调用此接口显示数据
     * @param data 数据源
     */
    void showData(String data);
}
