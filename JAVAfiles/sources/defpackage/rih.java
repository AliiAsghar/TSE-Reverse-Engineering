package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rih extends rhv {
    private static final xze n = xze.g("BugleDataModel", "ExecuteActionRunnable");
    private final SettableFuture o;

    public rih(rho rhoVar, Action action, SettableFuture settableFuture, rhw rhwVar, anen anenVar, armf armfVar, armf armfVar2, armf armfVar3) {
        super(rhoVar, action, "Bugle.DataModel.ActionBreakdown.Execution.Latency", 2785L, rhwVar, anenVar, armfVar, armfVar2, armfVar3);
        this.o = settableFuture;
    }

    @Override // defpackage.rhv
    public final void b() {
        Optional empty;
        rhw rhwVar;
        ahka c;
        akrh a;
        xyo c2 = n.c();
        c2.H("running action ");
        c2.u(this.f.getClass().getSimpleName());
        c2.q();
        akrh e = aktp.e("ExecuteActionRunnable#runImpl");
        try {
            rhw rhwVar2 = this.c;
            if (utw.a(ThreadLocalRandom.current(), ActionExecutorImpl.a)) {
                empty = Optional.of(((ActionExecutorImpl) rhwVar2).e.d());
            } else {
                empty = Optional.empty();
            }
            ahqp ahqpVar = ahqp.SUCCESS;
            rhj.e(this.f, 2, 3);
            try {
                try {
                    try {
                        a = this.f.a();
                    } catch (Throwable th) {
                        th = th;
                        ahqpVar = ahqp.ERROR;
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (((Boolean) b.e()).booleanValue()) {
                            if (((nhx) this.j.b()).a() && (th instanceof CancellationException)) {
                                n.r("future failed due to CancellationException", th);
                                this.o.setException(th);
                            } else {
                                if (((nhw) this.k.b()).a()) {
                                    th = this.f.u(th);
                                }
                                n.n("Fatal Error in action", th);
                                qiu.d(th);
                            }
                        } else {
                            if (((nhw) this.k.b()).a()) {
                                th = this.f.u(th);
                            }
                            this.o.setException(th);
                            xyl.p(String.valueOf(this.f) + ".executeAction threw " + th.toString(), th);
                        }
                        rhj.a(this.f, null);
                        String c3 = this.f.c();
                        if (!TextUtils.isEmpty(c3)) {
                            this.c.h(c3, this.f.t);
                        }
                        this.c.e(this.f, this.d);
                        rhwVar = this.c;
                        c = ahka.c("ActionExecutionLatency_", this.f.x);
                    }
                    try {
                        this.o.m(albo.bJ(this.f.e()));
                        Object obj = this.o.get();
                        a.close();
                        rhj.a(this.f, obj);
                        String c4 = this.f.c();
                        if (!TextUtils.isEmpty(c4)) {
                            this.c.h(c4, this.f.t);
                        }
                        this.c.e(this.f, this.d);
                        rhwVar = this.c;
                        c = ahka.c("ActionExecutionLatency_", this.f.x);
                        rhwVar.g(empty, c, ahqpVar);
                        e.close();
                    } catch (Throwable th2) {
                        try {
                            a.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (wxu e2) {
                    ahqp ahqpVar2 = ahqp.ERROR;
                    if (((nhw) this.k.b()).a()) {
                        ArrayList arrayList = this.f.y;
                        if (arrayList != null) {
                            throw Action.o(arrayList, e2);
                        }
                        throw e2;
                    }
                    throw e2;
                }
            } catch (Throwable th4) {
                rhj.a(this.f, null);
                String c5 = this.f.c();
                if (!TextUtils.isEmpty(c5)) {
                    this.c.h(c5, this.f.t);
                }
                this.c.e(this.f, this.d);
                this.c.g(empty, ahka.c("ActionExecutionLatency_", this.f.x), ahqpVar);
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                e.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }
}
