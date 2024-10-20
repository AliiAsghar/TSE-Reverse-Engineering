package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqnk implements aqnj {
    public static final ahvf a;

    static {
        altg altgVar = altg.a;
        a = ahvj.a("11", 2592000L, "com.google.android.libraries.mobileconfiguration", alpt.s("ANDROID_MESSAGING", "CARRIER_SERVICES", "ANDROID_MESSAGING_PRIMES"), true, false);
    }

    @Override // defpackage.aqnj
    public final long a(Context context) {
        return ((Long) a.a(context)).longValue();
    }
}
