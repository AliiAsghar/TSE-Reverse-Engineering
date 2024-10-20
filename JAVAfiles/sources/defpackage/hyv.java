package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyv {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];
    private static volatile Handler c;

    private hyv() {
    }

    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + String.valueOf(bitmap) + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()));
    }

    public static int b(int i, int i2, Bitmap.Config config) {
        return i * i2 * c(config);
    }

    public static int c(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = hyu.a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                if (i != 4) {
                    return 4;
                }
                return 8;
            }
        }
        return i2;
    }

    public static int d(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int e(Object obj, int i) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return d(hashCode, i);
    }

    public static Handler f() {
        if (c == null) {
            synchronized (hyv.class) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static List g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void h() {
        if (k()) {
        } else {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void i() {
        if (l()) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void j(Runnable runnable) {
        f().post(runnable);
    }

    public static boolean k() {
        if (!l()) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean m(int i) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public static boolean n(int i, int i2) {
        if (m(i) && m(i2)) {
            return true;
        }
        return false;
    }
}
