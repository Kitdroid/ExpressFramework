package org.kitdroid.fx;

import android.app.Application;
import android.content.Context;

/**
 * Created by 远航 on 2015/3/28.
 */
public class AppContext extends Application{

    private static AppContext mInstance;

    public static Context getInstance(){
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}
