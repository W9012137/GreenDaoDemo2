package chencheng.bwie.com.greendaodemo;

import android.app.Application;
import android.content.Context;

public class MyLication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
        GreenDaoManager.getInstance();
    }
    public static Context getContext() {
        return mContext;
    }
}
