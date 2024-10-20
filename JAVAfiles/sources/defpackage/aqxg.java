package defpackage;

import android.os.IBinder;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxg extends aqxh implements aqte {
    public final List a;
    private arhf b;

    public aqxg(arep arepVar, aqrm aqrmVar, List list, IBinder iBinder) {
        super(arepVar, aqrmVar, aqtf.a(aqxg.class, "from ".concat(String.valueOf(String.valueOf(aqrmVar.a(aqsw.a))))));
        this.a = list;
        y(aqyc.b(iBinder, this.i));
    }

    @Override // defpackage.aqxh
    protected final aqxt C(int i) {
        return new aqxq(this, this.k, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Status b(arhd arhdVar, String str, aqut aqutVar) {
        Executor arghVar;
        aqsf aqsfVar;
        if (x()) {
            return Status.n.withDescription("transport is shutdown");
        }
        arhf arhfVar = ((aqwx) this.b).a;
        int i = armc.a;
        if (((argy) arhfVar).b.d != andi.a) {
            arghVar = new argl(((argy) arhfVar).b.d);
        } else {
            arghVar = new argh();
        }
        Executor executor = arghVar;
        boolean z = true;
        if (aqutVar.j(arcb.c)) {
            String str2 = (String) aqutVar.b(arcb.c);
            if (((argy) arhfVar).b.p.a(str2) == null) {
                arhdVar.i(argz.c);
                arhdVar.e(Status.l.withDescription(String.format("Can't find decompressor for %s", str2)), new aqut());
                return Status.b;
            }
        }
        arhn b = arhdVar.b();
        b.getClass();
        Long l = (Long) aqutVar.b(arcb.b);
        aqsm aqsmVar = ((argy) arhfVar).b.o;
        aqae[] aqaeVarArr = b.b;
        if (aqaeVarArr.length <= 0) {
            aqsm l2 = aqsmVar.l(aqti.a, ((argy) arhfVar).b);
            if (l == null) {
                aqsfVar = new aqsf(l2);
            } else {
                aqsn g = aqsn.g(l.longValue(), TimeUnit.NANOSECONDS, ((argy) arhfVar).b.s);
                ScheduledExecutorService scheduledExecutorService = ((argy) arhfVar).c.i;
                d.aC(scheduledExecutorService, "scheduler");
                aqsn b2 = l2.b();
                if (b2 != null && b2.compareTo(g) <= 0) {
                    z = false;
                    g = b2;
                }
                aqsf aqsfVar2 = new aqsf(l2, g);
                if (z) {
                    if (!g.f()) {
                        synchronized (aqsfVar2) {
                            aomp aompVar = new aomp(aqsfVar2, 7, null);
                            d.aC(scheduledExecutorService, "scheduler");
                            aqsfVar2.b = scheduledExecutorService.schedule(aompVar, g.a - System.nanoTime(), TimeUnit.NANOSECONDS);
                        }
                    } else {
                        aqsfVar2.j(new TimeoutException("context timed out"));
                    }
                }
                aqsfVar = aqsfVar2;
            }
            argt argtVar = new argt(executor, ((argy) arhfVar).b.d, arhdVar, aqsfVar);
            arhdVar.i(argtVar);
            SettableFuture create = SettableFuture.create();
            executor.execute(new argx((argy) arhfVar, aqsfVar, str, arhdVar, argtVar, create, b, aqutVar));
            executor.execute(new argw(aqsfVar, create, aqutVar, arhdVar, argtVar));
            return Status.b;
        }
        aqae aqaeVar = aqaeVarArr[0];
        throw null;
    }

    public final synchronized void e(arhf arhfVar) {
        this.b = arhfVar;
        if (!x()) {
            aqyc aqycVar = this.m;
            aqycVar.getClass();
            s(aqycVar);
            if (!x()) {
                z(3);
                aqrm aqrmVar = this.k;
                arhf arhfVar2 = ((aqwx) arhfVar).a;
                ((argy) arhfVar2).a.cancel(false);
                ((argy) arhfVar2).a = null;
                Iterator it = ((argy) arhfVar2).b.g.iterator();
                if (!it.hasNext()) {
                    this.k = aqrmVar;
                    return;
                } else {
                    throw null;
                }
            }
            return;
        }
        z(5);
        j();
        n();
    }

    public final synchronized void f() {
        u(Status.b, false);
    }

    @Override // defpackage.aqxh
    public final void j() {
        Runnable a;
        arhf arhfVar = this.b;
        if (arhfVar != null) {
            aqwx aqwxVar = (aqwx) arhfVar;
            argy argyVar = (argy) aqwxVar.a;
            Future future = argyVar.a;
            if (future != null) {
                future.cancel(false);
                argyVar.a = null;
            }
            Iterator it = argyVar.b.g.iterator();
            if (!it.hasNext()) {
                argz argzVar = argyVar.b;
                aqxg aqxgVar = argyVar.c;
                synchronized (argzVar.l) {
                    if (argzVar.n.remove(aqxgVar)) {
                        aqtc.c((aqtb) argzVar.q.g.get(Long.valueOf(aqtc.a(argzVar))), aqxgVar);
                        argzVar.b();
                    } else {
                        throw new AssertionError("Transport already removed");
                    }
                }
                aqwy aqwyVar = aqwxVar.b;
                synchronized (aqwyVar) {
                    aqwyVar.c--;
                    a = aqwyVar.a();
                }
                if (a != null) {
                    a.run();
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public final synchronized void k(Status status) {
        u(status, true);
    }

    @Override // defpackage.aqxh
    public final void i(Status status) {
    }
}
