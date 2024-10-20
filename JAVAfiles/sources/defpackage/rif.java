package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rif extends rhv {
    private static final xze n = xze.g("BugleDataModel", "BackgroundWorkerRunnable");

    public rif(rho rhoVar, Action action, rhw rhwVar, anen anenVar, armf armfVar, armf armfVar2, armf armfVar3) {
        super(rhoVar, action, "Bugle.DataModel.ActionBreakdown.BackgroundExecution.Latency", 30174L, rhwVar, anenVar, armfVar, armfVar2, armfVar3);
    }

    @Override // defpackage.rhv
    public final void b() {
        ArrayList arrayList;
        xyo a = n.a();
        a.H("running BackgroundWork ");
        a.u(this.f.getClass().getSimpleName());
        a.q();
        akrh e = aktp.e("BackgroundWorkerRunnable#runImpl");
        try {
            rhj.e(this.f, 4, 5);
            try {
            } catch (Exception e2) {
                Exception exc = e2;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                if (((Boolean) b.e()).booleanValue()) {
                    if (((nhx) this.j.b()).a() && (exc instanceof CancellationException)) {
                        n.r("future failed due to CancellationException", exc);
                    } else {
                        if (((nhw) this.k.b()).a() && (arrayList = this.f.y) != null) {
                            exc = Action.o(arrayList, exc);
                        }
                        n.n("Fatal Error in action", exc);
                        qiu.d(exc);
                    }
                } else {
                    xyl.p(String.format("Aborting due to unexpected error (%s) in background worker", exc.getClass().getSimpleName()), exc);
                    n.n("Error in background worker.", exc);
                    rhj.e(this.f, 5, 6);
                    this.c.f(new rid(this.d, this.f, exc, this.c, this.i, this.j, this.k, this.l), "Bugle.DataModel.ActionBreakdown.FailureQueue.Latency");
                    this.c.d("ACTION_ERROR_QUEUED_", this.f);
                }
            }
            try {
                akrh a2 = this.f.a();
                try {
                    Bundle bundle = (Bundle) this.f.fx().get();
                    a2.close();
                    rhj.e(this.f, 5, 6);
                    this.c.f(new rie(this.d, this.f, bundle, this.c, this.i, this.j, this.k, this.l), "Bugle.DataModel.ActionBreakdown.ResponseQueue.Latency");
                    this.c.d("ACTION_RESPONSE_QUEUED_", this.f);
                    e.close();
                } catch (Throwable th) {
                    try {
                        a2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (ExecutionException e3) {
                if (!(e3.getCause() instanceof RuntimeException)) {
                    if (e3.getCause() instanceof Exception) {
                        throw ((Exception) e3.getCause());
                    }
                    throw e3;
                }
                throw ((RuntimeException) e3.getCause());
            }
        } catch (Throwable th3) {
            try {
                e.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
