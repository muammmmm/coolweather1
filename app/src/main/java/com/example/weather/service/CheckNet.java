package com.example.weather.service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
public class CheckNet
{//判断判断连没联网
    public final static int NET_NONE = 0;
    public final static int NET_WIFI = 1;
    public final static int NET_MOBILE = 2;
    public static int getNetState(Context context)
    {

        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);//网络连接的服务
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();//获取网络信息
        if(networkInfo == null)
            return NET_NONE;
        int type = networkInfo.getType(); //判断网络类型，移动网络，WiFi
        if(type == ConnectivityManager.TYPE_MOBILE)
            return NET_MOBILE;
        else if(type == ConnectivityManager.TYPE_WIFI)
            return NET_WIFI;
        return NET_MOBILE;
    }
}
