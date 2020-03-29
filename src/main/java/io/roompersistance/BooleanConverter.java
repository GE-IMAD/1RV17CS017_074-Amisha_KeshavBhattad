package io.roompersistance;

import android.arch.persistence.room.TypeConverter;

public class BooleanConverter {
    @TypeConverter
    public static boolean boolFromString(String value) {
        return value.equals("1");
    }

    @TypeConverter
    public static String boolToString(boolean value) {
        return value ? "1" : "0";
    }
}