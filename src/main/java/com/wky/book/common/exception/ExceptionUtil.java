package com.wky.book.common.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 工具类异常
 *
 * @author xbts
 */
public class ExceptionUtil extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public ExceptionUtil(Throwable e) {
        super(e.getMessage(), e);
    }

    public ExceptionUtil(String message) {
        super(message);
    }

    public ExceptionUtil(String message, Throwable throwable) {
        super(message, throwable);
    }

    public static void throwsCheckedException(String message){
        throw new RuntimeException(message);
    }

    public static void throwsCheckedException(Boolean condition, String message){
        if (condition){
            throwsCheckedException(message);
        }
    }

    /**
     * 获取exception的详细错误信息。
     */
    public static String getExceptionMessage(Throwable e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw, true));
        return sw.toString();
    }
}
