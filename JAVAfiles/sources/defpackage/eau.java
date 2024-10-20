package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eau {
    public static final ebb a;
    public static final ul b;

    static {
        gvf.bd("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 29) {
            a = new eay();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new eax();
        } else {
            a = new eaw();
        }
        b = new ul(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface d = a.d(context, resources, i, str, i3);
        if (d != null) {
            b.c(b(resources, i, str, i2, i3), d);
        }
        return d;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(Context context, ebv[] ebvVarArr, int i) {
        gvf.bd("TypefaceCompat.createFromFontInfo");
        try {
            return a.a(context, ebvVarArr, i);
        } finally {
            Trace.endSection();
        }
    }
}
