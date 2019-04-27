package com.example.zb.mymvp3demo.login;

import com.example.zb.mymvp3demo.base.BaseModel;

/**
 * Created by zb on 2019/4/27.
 */

public class DataModel {
    public static BaseModel request(Class clazz){

        // 声明一个空的BaseModel
        BaseModel model = null;

        try {
            //利用反射机制获得对应Model对象的引用
            model = (BaseModel)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return model;
    }
}
