package org.kitdroid.fx;

/**
 * @author Զ�� on 2015/3/28.
 */
public class AppState {

    public static final boolean isDeveloping(){
        return BuildConfig.DEBUG;
    }

    public static final boolean isRelease(){
        // TODO
        return !BuildConfig.DEBUG;
    }
}
