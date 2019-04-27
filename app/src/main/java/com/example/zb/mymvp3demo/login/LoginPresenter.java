package com.example.zb.mymvp3demo.login;
import com.example.zb.mymvp3demo.base.BasePresenter;
import com.example.zb.mymvp3demo.base.MvpCallback;
import java.util.HashMap;

/**
 * Created by zb on 2019/4/27.
 */

public class LoginPresenter extends BasePresenter<LoginView> {

    /**
     * 获取网络数据
     * @param
     */
    public void getData(String url, HashMap<String, String> param) {

        if (!isViewAttached()) {
            //如果没有View引用就不加载数据
            return;
        }
        //显示正在加载进度条
        getView().showLoading();
        DataModel
                .request(LoginModel.class)
                // 注册监听回调
                .requestPostAPI(url, param, new MvpCallback<String>() {

                    @Override
                    public void onSuccess(String data) {
                        //调用view接口显示数据
                        getView().showData(data);
                        getView().hideLoading();
                        getView().showToast("成功");
                    }

                    @Override
                    public void onFailure(String msg) {
                        //调用view接口提示失败信息
                        getView().showToast(msg);
                    }

                });

    }

}
