package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bas {
    public static final boolean a;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 34) {
            z = true;
        } else {
            z = false;
        }
        a = z;
    }
}
