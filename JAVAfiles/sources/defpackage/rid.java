package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rid extends rhv {
    private static final xze o = xze.g("BugleDataModel", "BackgroundFailureRunnable");
    public final Exception n;

    public rid(rho rhoVar, Action action, Exception exc, rhw rhwVar, anen anenVar, armf armfVar, armf armfVar2, armf armfVar3) {
        super(rhoVar, action, "Bugle.DataModel.ActionBreakdown.FailureExecution.Latency", 2785L, rhwVar, anenVar, armfVar, armfVar2, armfVar3);
        this.n = exc;
    }

    @Override // defpackage.rhv
    public final void b() {
        try {
            Action action = this.f;
            akrh e = aktp.e("BackgroundFailureRunnable#processBackgroundWorkFailure");
            try {
                akrh a = action.a();
                try {
                    Object obj = action.fy().get();
                    a.close();
                    rhj.c(action, 0, obj, false);
                    e.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            th = th;
            try {
                if (((nhw) this.k.b()).a()) {
                    th = this.f.u(th);
                }
                if (((Boolean) b.e()).booleanValue()) {
                    o.n(String.valueOf(this.f) + ".processBackgroundWorkFailure threw", th);
                    qiu.d(this.n);
                } else {
                    xyl.p(String.valueOf(this.f) + ".processBackgroundWorkFailure threw exception", th);
                }
            } finally {
                this.c.e(this.f, this.d);
            }
        }
    }
}
