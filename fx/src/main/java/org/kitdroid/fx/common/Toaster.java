package org.kitdroid.fx.common;

import android.content.Context;
import android.widget.Toast;

import org.kitdroid.fx.AppContext;
import org.kitdroid.fx.AppState;

/**
 * Created by 远航 on 2015/3/28.
 */
public class Toaster {

    public static void showLong(CharSequence text){
        Toast.makeText(getContext(), text,Toast.LENGTH_LONG).show();
    }

    public static void showShort(CharSequence text){
        Toast.makeText(getContext(), text,Toast.LENGTH_SHORT).show();
    }

    public static void showTest(CharSequence text){
        if(!isOpen()){
            return;
        }
        Toast.makeText(getContext(), text,Toast.LENGTH_SHORT).show();
    }


    private static final boolean isOpen(){
        return AppState.isDeveloping();
    }
    private static Context getContext() {
        return AppContext.getInstance();
    }
}

