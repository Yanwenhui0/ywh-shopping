package com.ywh.shoppinggatewayweb.authorize.util;

import com.ywh.shoppinggatewayweb.authorize.constant.WhiteApi;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/12/23
 */
public class WhiteApiUtils {

    /**
     * 用来判断 如果 当前的请求 在 放行的请求中存在,(不需要拦截 :true,否则需要拦截:false)
     * @return
     */
    public static boolean isWhiteApi(String uri){
        String[] split = WhiteApi.WHITE_APIS.split(",");

        for (String s : split) {
            if(s.equals(uri)){
                //不需要拦截
                return true;
            }
        }

        //要拦截
        return false;
    }

}
