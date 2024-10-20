package defpackage;

import io.grpc.Status;
import java.util.LinkedHashSet;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ardm implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ardm(arvo arvoVar, aryv aryvVar, int i) {
        this.c = i;
        this.a = arvoVar;
        this.b = aryvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v53, types: [arhp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [arvo, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        arfw arfwVar;
        argb argbVar;
        boolean z = true;
        switch (this.c) {
            case 0:
                if (((ardo) this.b).a.get() == ardr.e) {
                    ardr ardrVar = ((ardo) this.b).c;
                    if (ardrVar.x == null) {
                        ardrVar.x = new LinkedHashSet();
                        ardr ardrVar2 = ((ardo) this.b).c;
                        ardrVar2.R.c(ardrVar2.y, true);
                    }
                    ((ardo) this.b).c.x.add(this.a);
                    return;
                }
                ((ardn) this.a).j();
                return;
            case 1:
                ((ardj) this.b).m((Status) this.a);
                return;
            case 2:
                this.b.run();
                Object obj = this.a;
                ((ardn) obj).f.c.m.execute(new arbg(obj, 20));
                return;
            case 3:
                synchronized (((argc) ((absa) this.a).b).l) {
                    Object obj2 = this.a;
                    arfwVar = null;
                    if (!((arfw) ((absa) obj2).a).b) {
                        Object obj3 = ((absa) obj2).b;
                        ((argc) obj3).q = ((argc) obj3).q.a((arga) this.b);
                        Object obj4 = ((absa) this.a).b;
                        if (((argc) obj4).w(((argc) obj4).q) && ((argbVar = ((argc) ((absa) this.a).b).o) == null || argbVar.a())) {
                            Object obj5 = ((absa) this.a).b;
                            arfwVar = new arfw(((argc) obj5).l);
                            ((argc) obj5).x = arfwVar;
                        } else {
                            Object obj6 = ((absa) this.a).b;
                            ((argc) obj6).q = ((argc) obj6).q.b();
                            ((argc) ((absa) this.a).b).x = null;
                        }
                        z = false;
                    }
                }
                if (z) {
                    arga argaVar = (arga) this.b;
                    argaVar.a.m(new arfz((argc) ((absa) this.a).b, argaVar));
                    ((arga) this.b).a.c(Status.c.withDescription("Unneeded hedging"));
                    return;
                }
                if (arfwVar != null) {
                    Object obj7 = ((absa) this.a).b;
                    absa absaVar = new absa(obj7, arfwVar, 2);
                    argc argcVar = (argc) obj7;
                    arfwVar.b(argcVar.h.schedule(absaVar, argcVar.j.b, TimeUnit.NANOSECONDS));
                }
                ((argc) ((absa) this.a).b).t((arga) this.b);
                return;
            case 4:
                ((arfz) this.b).b.v.c((aqut) this.a);
                return;
            case 5:
                ((arfz) ((aofo) this.a).c).b.t((arga) this.b);
                return;
            case 6:
                ((arfz) this.a).b.t((arga) this.b);
                return;
            case 7:
                ((arfz) this.a).b.v.d(this.b);
                return;
            case 8:
                try {
                    ((CyclicBarrier) this.b).await(1000L, TimeUnit.MILLISECONDS);
                    ((CountDownLatch) this.a).await();
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (BrokenBarrierException | TimeoutException unused2) {
                    return;
                }
            default:
                this.a.g((arwb) this.b, arnb.a);
                return;
        }
    }

    public ardm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public ardm(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public ardm(CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch, int i) {
        this.c = i;
        this.b = cyclicBarrier;
        this.a = countDownLatch;
    }
}
