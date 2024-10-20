package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsy {
    public static final Object a = new Object();
    public static volatile gsy b;
    public final int c;

    public gsy() {
        throw null;
    }

    public static gsy a() {
        gsy gsyVar;
        synchronized (a) {
            if (b == null) {
                b = new gsy(3);
            }
            gsyVar = b;
        }
        return gsyVar;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (str.length() >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void c(String str, String str2) {
        if (this.c <= 3) {
            Log.d(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (this.c <= 3) {
            Log.d(str, str2, th);
        }
    }

    public gsy(int i) {
        this.c = i;
    }
}
