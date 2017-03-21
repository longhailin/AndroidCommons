package com.hiram.commons.util;

/**
 * SizeUtils
 * 描述：KB、MB、GB 与 BYTE 的换算关系
 * 作者： hiram on 2017/3/20 17:57
 */
public class SizeUtils {

    /** gb to byte **/
    public static final long GB_2_BYTE = 1073741824;
    /** mb to byte **/
    public static final long MB_2_BYTE = 1048576;
    /** kb to byte **/
    public static final long KB_2_BYTE = 1024;

    private SizeUtils() {
        throw new AssertionError();
    }
}
