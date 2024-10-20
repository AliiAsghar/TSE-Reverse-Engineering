package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpa implements abol {
    public static final Charset a = Charset.forName("UTF-8");
    public static final ahtn b;
    public static final ConcurrentHashMap c;
    static Boolean d;
    static Long e;
    public final Context f;

    static {
        aaoc aaocVar = acge.a;
        ahtn ahtnVar = new ahtn(ahsy.a("com.google.android.gms.clearcut.public"));
        if (!ahtnVar.e) {
            b = new ahtn(ahtnVar.a, ahtnVar.b, "gms:playlog:service:samplingrules_", ahtnVar.d, false, ahtnVar.f).c("LogSamplingRulesV2__");
            c = new ConcurrentHashMap();
            d = null;
            e = null;
            return;
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public abpa(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            ahtp.f(applicationContext);
        }
    }
}
