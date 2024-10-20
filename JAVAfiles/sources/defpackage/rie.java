package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rie extends rhv {
    private static final xze n = xze.g("BugleDataModel", "BackgroundResponseRunnable");
    private final Bundle o;

    public rie(rho rhoVar, Action action, Bundle bundle, rhw rhwVar, anen anenVar, armf armfVar, armf armfVar2, armf armfVar3) {
        super(rhoVar, action, "Bugle.DataModel.ActionBreakdown.ResponseExecution.Latency", 2785L, rhwVar, anenVar, armfVar, armfVar2, armfVar3);
        this.o = bundle;
    }

    @Override // defpackage.rhv
    public final void b() {
        try {
            Action action = this.f;
            Bundle bundle = this.o;
            akrh e = aktp.e("BackgroundResponseRunnable#processBackgroundWorkResponse");
            int i = 6;
            try {
                rhj.e(action, 6, 7);
                akrh a = action.a();
                try {
                    Object obj = aktp.ai(new qpk(action, bundle, i, null), andi.a).get();
                    a.close();
                    rhj.c(action, 7, obj, true);
                    e.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            th = th;
            try {
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                if (((nhw) this.k.b()).a()) {
                    th = this.f.u(th);
                }
                if (((Boolean) b.e()).booleanValue()) {
                    n.n(String.valueOf(this.f) + ".processBackgroundWorkResponse threw", th);
                    qiu.d(th);
                } else {
                    xyl.p(String.valueOf(this.f) + ".processBackgroundWorkResponse threw " + th.toString(), th);
                }
            } finally {
                this.c.e(this.f, this.d);
            }
        }
    }
}
