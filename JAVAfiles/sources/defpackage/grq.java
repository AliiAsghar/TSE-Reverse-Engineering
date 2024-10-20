package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grq {
    static final /* synthetic */ grq a = new grq();
    public static final String b = "grr";

    private grq() {
    }

    public final grr a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return grt.b;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return grs.b;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return grs.c;
        }
        return grt.c;
    }
}
