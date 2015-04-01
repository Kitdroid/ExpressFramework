package org.kitdroid.fx.common;

import android.util.Log;

import org.kitdroid.fx.AppState;

/**
 * Created by 远航 on 2015/3/28.
 */
public class Loger {

    private static final boolean isOpen(){
        return AppState.isDeveloping();
    }

    public static final void e(String tag, String msg){
        if(!isOpen()){
            return;
        }
        Log.e(tag, msg);
    }
    public static final void w(String tag, String msg){
        if(!isOpen()){
            return;
        }
        Log.w(tag, msg);
    }
    public static final void i(String tag, String msg){
        if(!isOpen()){
            return;
        }
        Log.i(tag, msg);
    }
    public static final void d(String tag, String msg){
        if(!isOpen()){
            return;
        }
        Log.d(tag, msg);
    }
    public static final void v(String tag, String msg){
        if(!isOpen()){
            return;
        }
        Log.v(tag, msg);
    }
}
