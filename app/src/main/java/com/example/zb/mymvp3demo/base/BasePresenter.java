package com.example.zb.mymvp3demo.base;

/**
 * Created by zb on 2019/4/27.
 */

public class BasePresenter<V extends BaseView>{
    /**
     * 绑定的View
     */
    private V mView;


    public BasePresenter() {
        //构造方法中不需要view参数
    }

    /**
     * 绑定view，一般在初始化中调用该方法
     */
    public void attachView(V mvpView) {
        this.mView = mvpView;
    }

    /**
     * 断开view，一般在onDestroy中调用
     */
    public void detachView() {
        this.mView = null;
    }

    /**
     * 是否与View建立连接
     * 每次调用业务请求的时候都要出先调用方法检查是否与View建立连接
     */
    public boolean isViewAttached() {
        return mView != null;
    }

    /**
     * 获取连接的View
     */
    public V getView(){
        return mView;
    }
}
