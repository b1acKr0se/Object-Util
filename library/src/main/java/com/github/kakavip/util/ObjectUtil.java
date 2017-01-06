package com.github.kakavip.util;

import android.text.TextUtils;

/**
 * Utility methods for operating on objects.
 */
public class ObjectUtil {

    /**
     * Returns true if the arguments are equal to each other and false otherwise,
     *
     * @param a is an object.
     * @param b is an object to be compared with a for equality.
     * @return true if the arguments are equal to each other and false otherwise.
     */
    public static boolean equals(Object a, Object b) {
        return a == b;
    }

    /**
     * Returns true if all objects is null and false otherwise.
     *
     * @param objs is an object or many objects to be checked against null
     * @return true if all objects is null and false otherwise.
     */
    public static boolean isNull(Object... objs) {
        for (Object obj : objs) {
            if (obj != null) {
                return false;
            }
        }
        return true;
    }


    /**
     * Returns true if the provided reference is non-null otherwise returns false.
     *
     * @param objs is an object or many objects to be checked against null
     * @return true if all objects is non-null and false otherwise.
     */
    public static boolean nonNull(Object... objs) {
        return !isNull(objs);
    }

    /**
     * Returns true if have one object is null and false otherwise.
     *
     * @param objs is an object or many objects to be checked against null.
     * @return true if have one object is null and false otherwise.
     */
    public static boolean haveNull(Object... objs) {
        for (Object obj : objs) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return T object
     * {@link java.util.Objects#requireNonNull(T)}
     */
    public static <T> T requireNonNull(T obj) {
        return requireNonNull(obj, "Object is null");
    }

    /**
     * Return T object
     * {@link java.util.Objects#requireNonNull(T, String)}
     */
    public static <T> T requireNonNull(T obj, String msg) {
        if (obj == null) {
            throw new NullPointerException(msg);
        }
        return obj;
    }

    public static String toString(Object... objs) {
        StringBuilder strings = new StringBuilder();
        int length = objs.length;
        for (int i = 0; i < length; i++) {
            Object obj = objs[i];
            strings.append(i + " -> " + toString(obj));
            strings.append("\n");
        }
        return strings.toString();
    }

    public static String toString(Object obj) {
        return obj != null ? obj.toString() : "null";
    }


    public static boolean isEmpty(String... strs) {
        for (String str : strs) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }


}