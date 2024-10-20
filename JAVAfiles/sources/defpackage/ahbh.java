package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbh {
    public static final boolean a;
    public static volatile boolean b;

    static {
        boolean z;
        if (!"robolectric".equals(Build.FINGERPRINT) && Build.FINGERPRINT != null) {
            z = false;
        } else {
            z = true;
        }
        a = z;
        b = true;
    }
}
