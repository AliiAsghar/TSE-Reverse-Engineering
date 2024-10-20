package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqnh implements aqng {
    public static final ahvf a;
    public static final ahvf b;
    public static final ahvf c;
    public static final ahvf d;

    static {
        altg altgVar = altg.a;
        alpt s = alpt.s("ANDROID_MESSAGING", "CARRIER_SERVICES", "ANDROID_MESSAGING_PRIMES");
        a = ahvj.c("3", false, "com.google.android.libraries.mobileconfiguration", s, true, false);
        b = ahvj.b("1", "mobileconfiguration-pa.googleapis.com", "com.google.android.libraries.mobileconfiguration", s, true, false);
        c = ahvj.b("4", "oauth2:https://www.googleapis.com/auth/mobileconfiguration", "com.google.android.libraries.mobileconfiguration", s, true, false);
        d = ahvj.b("2", "AIzaSyAjKazdIYitdprpqlEAYHkgTae00yoo8rQ", "com.google.android.libraries.mobileconfiguration", s, true, false);
    }

    @Override // defpackage.aqng
    public final String a(Context context) {
        return (String) b.a(context);
    }

    @Override // defpackage.aqng
    public final String b(Context context) {
        return (String) c.a(context);
    }

    @Override // defpackage.aqng
    public final String c(Context context) {
        return (String) d.a(context);
    }

    @Override // defpackage.aqng
    public final boolean d(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
