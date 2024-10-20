package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abld extends abrc {
    private static final abqt a;
    private static final aaoc b;
    private static final abmt m;
    private static final apuv n;

    static {
        abmt abmtVar = new abmt();
        m = abmtVar;
        abla ablaVar = new abla();
        a = ablaVar;
        b = new aaoc("GoogleAuthService.API", ablaVar, abmtVar);
        n = new apuv("Auth", "GoogleAuthServiceClient");
    }

    public abld(Context context) {
        super(context, b, abqx.q, abrb.a);
    }

    public static void a(Status status, Object obj, acit acitVar) {
        if (!abhb.e(status, obj, acitVar)) {
            n.n("The task is already complete.", new Object[0]);
        }
    }
}
