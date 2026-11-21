package me.zhanghai.android.files.nonfree;

import android.content.Context;

/** The free distribution does not initialize proprietary crash reporting. */
public final class CrashlyticsUtils {
    private CrashlyticsUtils() {}

    public static void init(Context context) {}
}
