package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqol implements aqok {
    public static final ahvf a;
    public static final ahvf b;

    static {
        altg altgVar = altg.a;
        altx altxVar = new altx("CLIENT_LOGGING_PROD");
        a = ahvj.c("45359255", false, "com.google.android.libraries.performance.primes", altxVar, true, true);
        b = ahvj.c("36", true, "com.google.android.libraries.performance.primes", altxVar, true, true);
    }

    @Override // defpackage.aqok
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.aqok
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }
}
