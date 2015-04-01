package org.kitdroid.fx.base;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

import org.kitdroid.fx.common.Loger;
import org.kitdroid.fx.common.Toaster;

import butterknife.ButterKnife;

/**
 * Created by 远航 on 2015/3/28.
 */
public class BaseActivity extends ActionBarActivity implements OnClickListener{


    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.inject(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        ButterKnife.inject(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        ButterKnife.inject(this);
    }

    public void startActivityForResult(Class<? extends Activity> cls, int requestCode) {
        Intent intent = new Intent(this, cls);
        startActivityForResult(intent, requestCode);
    }
    public void startActivity(Class<? extends Activity> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }

    protected void d(String msg){
        Loger.d(getClass().getSimpleName(), msg);
    }
    protected void i(String msg){
        Loger.i(getClass().getSimpleName(), msg);
    }
    protected void w(String msg){
        Loger.w(getClass().getSimpleName(), msg);
    }
    protected void e(String msg){
        Loger.e(getClass().getSimpleName(), msg);
    }

    protected void showLongToast(CharSequence text){
        Toaster.showLong(text);
    }
    protected void showToast(CharSequence text){
        Toaster.showShort(text);
    }
    protected void showTest(CharSequence text){
        Toaster.showTest(text);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) { }



}
