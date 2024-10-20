package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arbg implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public arbg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [arau, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, aqte] */
    /* JADX WARN: Type inference failed for: r0v86, types: [arau, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        long nextLong;
        Runnable akqgVar;
        boolean z3 = true;
        switch (this.b) {
            case 0:
                ((arbi) this.a).e.d();
                return;
            case 1:
                ((arbi) this.a).r();
                return;
            case 2:
                ((arbi) this.a).e.e();
                return;
            case 3:
                ((arbh) this.a).a.e();
                return;
            case 4:
                ((atoi) ((asqc) this.a).a).a.p(Status.n.withDescription("Keepalive failed. The connection is likely gone"));
                return;
            case 5:
                arcr arcrVar = (arcr) this.a;
                arcrVar.t = null;
                arcrVar.c.a(2, "CONNECTING after backoff");
                ((arcr) this.a).b(aqsd.CONNECTING);
                ((arcr) this.a).h();
                return;
            case 6:
                if (((arcr) this.a).o.a == aqsd.IDLE) {
                    ((arcr) this.a).c.a(2, "CONNECTING as requested");
                    ((arcr) this.a).b(aqsd.CONNECTING);
                    ((arcr) this.a).h();
                    return;
                }
                return;
            case 7:
                arcr arcrVar2 = (arcr) ((aqym) this.a).b;
                aref arefVar = arcrVar2.j;
                arcrVar2.u = null;
                arcrVar2.j = null;
                arefVar.o(Status.n.withDescription("InternalSubchannel closed transport due to address change"));
                return;
            case 8:
                ((arcr) this.a).c.a(2, "Terminated");
                ?? r0 = this.a;
                atpk atpkVar = ((arcr) r0).s;
                ((aqzj) atpkVar.a).i.w.remove(r0);
                aqtc.c(((aqzj) atpkVar.a).i.I.e, r0);
                ((aqzj) atpkVar.a).i.k();
                return;
            case 9:
                arcp arcpVar = (arcp) this.a;
                arcr arcrVar3 = arcpVar.c;
                arcrVar3.r = null;
                if (arcrVar3.p != null) {
                    if (arcrVar3.n != null) {
                        z3 = false;
                    }
                    albo.U(z3, "Unexpected non-null activeTransport");
                    arcp arcpVar2 = (arcp) this.a;
                    arcpVar2.a.o(arcpVar2.c.p);
                    return;
                }
                arau arauVar = arcrVar3.m;
                arau arauVar2 = arcpVar.a;
                if (arauVar == arauVar2) {
                    arcrVar3.n = arauVar2;
                    ((arcp) this.a).c.m = null;
                    arcr arcrVar4 = ((arcp) this.a).c;
                    arcrVar4.q = arcrVar4.g.a();
                    ((arcp) this.a).c.b(aqsd.READY);
                    return;
                }
                return;
            case 10:
                arcp arcpVar3 = (arcp) this.a;
                arcpVar3.c.k.remove(arcpVar3.a);
                if (((arcp) this.a).c.o.a == aqsd.SHUTDOWN && ((arcp) this.a).c.k.isEmpty()) {
                    ((arcp) this.a).c.e();
                    return;
                }
                return;
            case 11:
                synchronized (this.a) {
                    Object obj = this.a;
                    if (((arcu) obj).k != 6) {
                        ((arcu) obj).k = 6;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    ((arcu) this.a).l.a.p(Status.n.withDescription("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            case 12:
                synchronized (this.a) {
                    Object obj2 = this.a;
                    ((arcu) obj2).f = null;
                    int i = ((arcu) obj2).k;
                    if (i == 2) {
                        ((arcu) obj2).k = 4;
                        ((arcu) obj2).e = ((arcu) obj2).c.schedule(((arcu) obj2).g, ((arcu) obj2).j, TimeUnit.NANOSECONDS);
                        z = true;
                    } else {
                        if (i == 3) {
                            ((arcu) obj2).f = ((arcu) obj2).c.schedule(((arcu) obj2).h, ((arcu) obj2).i - ((arcu) obj2).d.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                            ((arcu) this.a).k = 2;
                        }
                        z = false;
                    }
                }
                if (z) {
                    atoi atoiVar = ((arcu) this.a).l;
                    Object obj3 = atoiVar.a;
                    asqc asqcVar = new asqc(atoiVar, null);
                    Object obj4 = ((arjh) obj3).i;
                    andi andiVar = andi.a;
                    synchronized (obj4) {
                        if (((arjh) obj3).h != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        albo.T(z2);
                        if (((arjh) obj3).q) {
                            ((arjh) obj3).g();
                            arcf.b(asqcVar, andiVar);
                            return;
                        }
                        arcf arcfVar = ((arjh) obj3).p;
                        if (arcfVar != null) {
                            nextLong = 0;
                            z3 = false;
                        } else {
                            nextLong = ((arjh) obj3).e.nextLong();
                            alhp alhpVar = new alhp();
                            alhpVar.e();
                            arcf arcfVar2 = new arcf(nextLong, alhpVar);
                            ((arjh) obj3).p = arcfVar2;
                            ((arjh) obj3).C.e++;
                            arcfVar = arcfVar2;
                        }
                        if (z3) {
                            ((arjh) obj3).h.d(false, (int) (nextLong >>> 32), (int) nextLong);
                        }
                        synchronized (arcfVar) {
                            if (!arcfVar.d) {
                                arcfVar.c.put(asqcVar, andiVar);
                                return;
                            }
                            if (arcfVar.e != null) {
                                akqgVar = new arbg(asqcVar, 4);
                            } else {
                                akqgVar = new akqg(7);
                            }
                            arcf.a(andiVar, akqgVar);
                            return;
                        }
                    }
                }
                return;
            case 13:
                ((ardr) this.a).h(true);
                return;
            case 14:
                if (!((ardr) this.a).B.get()) {
                    ardr ardrVar = (ardr) this.a;
                    if (ardrVar.u != null) {
                        ardrVar.h(false);
                        ((ardr) this.a).i();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((ardr) this.a).H.a(2, "Entering SHUTDOWN state");
                ((ardr) this.a).p.a(aqsd.SHUTDOWN);
                return;
            case 16:
                ardr ardrVar2 = (ardr) this.a;
                if (ardrVar2.u == null) {
                    return;
                }
                ardrVar2.i();
                return;
            case 17:
                ardr ardrVar3 = ((ardi) this.a).b;
                ardrVar3.m.c();
                if (ardrVar3.t) {
                    ardrVar3.s.b();
                    return;
                }
                return;
            case 18:
                ardo ardoVar = (ardo) this.a;
                if (ardoVar.c.x == null) {
                    if (ardoVar.a.get() == ardr.e) {
                        ((ardo) this.a).a.set(null);
                    }
                    ((ardo) this.a).c.A.a(ardr.b);
                    return;
                }
                return;
            case 19:
                ((ardo) this.a).c.j();
                return;
            default:
                Object obj5 = this.a;
                Collection collection = ((ardn) obj5).f.c.x;
                if (collection != null) {
                    collection.remove(obj5);
                    if (((ardn) this.a).f.c.x.isEmpty()) {
                        ardr ardrVar4 = ((ardn) this.a).f.c;
                        ardrVar4.R.c(ardrVar4.y, false);
                        ardr ardrVar5 = ((ardn) this.a).f.c;
                        ardrVar5.x = null;
                        if (ardrVar5.B.get()) {
                            ((ardn) this.a).f.c.A.a(ardr.b);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
