package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uwf {
    private static final xze a = xze.g("BugleNetwork", "ForegroundServiceStarter");

    public static void a(uwe uweVar) {
        if (yhx.e) {
            try {
                uweVar.a();
                return;
            } catch (ForegroundServiceStartNotAllowedException e) {
                a.r("Failed to call foreground service starter", e);
                return;
            }
        }
        uweVar.a();
    }
}
