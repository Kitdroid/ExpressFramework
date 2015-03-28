package org.kitdroid.fx.base;

import android.support.v7.app.ActionBarActivity;

import org.kitdroid.fx.common.Loger;
import org.kitdroid.fx.common.Toaster;

/**
 * Created by Ô¶º½ on 2015/3/28.
 */
public class BaseActivity extends ActionBarActivity{

    protected void e(String msg){
        Loger.e(getClass().getSimpleName(), msg);
    }
    protected void w(String msg){
        Loger.w(getClass().getSimpleName(), msg);
    }
    protected void i(String msg){
        Loger.i(getClass().getSimpleName(), msg);
    }
    protected void d(String msg){
        Loger.d(getClass().getSimpleName(), msg);
    }

    protected void showLongToast(CharSequence text){
        Toaster.showLong(text);
    }    protected void showToast(CharSequence text){
        Toaster.showShort(text);
    }
    protected void showTest(CharSequence text){
        Toaster.showTest(text);
    }

}
