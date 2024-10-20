package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpw {
    private static final xze a = xze.g("BugleGaia", "AccountErrorHandler");
    private final uvi b;
    private final ajxd c;
    private final Activity d;
    private final armf e;

    public kpw(uvi uviVar, ajxd ajxdVar, Activity activity, armf armfVar) {
        this.b = uviVar;
        this.c = ajxdVar;
        this.d = activity;
        this.e = armfVar;
    }

    public final void a(Throwable th) {
        akrh e = aktp.e("handleAccountError");
        try {
            ((mbl) this.e.b()).c("Bugle.Gaia.HandleAccountError.Counts");
            xyo e2 = a.e();
            e2.H("Error happened when selecting account. Sign out user");
            e2.z("From screen", this.d.getClass().getName());
            e2.r(th);
            if (((Boolean) ((utz) kpt.a.get()).e()).booleanValue()) {
                this.b.c(th);
            }
            ((mbl) this.e.b()).c("Bugle.Gaia.AccountError.SwitchToPseudonymous");
            this.c.a(alog.r(akaa.class));
            e.close();
        } catch (Throwable th2) {
            try {
                e.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
