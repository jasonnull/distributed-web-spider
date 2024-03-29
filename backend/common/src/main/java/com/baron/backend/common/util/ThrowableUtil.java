package com.baron.backend.common.util;

/**
 * Created by Baron.Chen on 2017/6/8.
 */
public class ThrowableUtil {
    private ThrowableUtil() {}

    public static String getStackTrace(Throwable t) {
        String str = "";
        StackTraceElement[] elements = t.getStackTrace();

        for (StackTraceElement element : elements) {
            str += element + "\r\n";
        } // for

        return str;
    }
}
