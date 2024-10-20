package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aqym implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aqym(arbk arbkVar, IOException iOException, int i) {
        this.c = i;
        this.b = arbkVar;
        this.a = iOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, apyp] */
    /* JADX WARN: Type inference failed for: r0v26, types: [aqsa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [arhp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        aref arefVar;
        boolean z;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        z2 = false;
        switch (this.c) {
            case 0:
                ((aqyo) this.a).b((Status) this.b);
                return;
            case 1:
                if (((apyk) this.b).a.isCancelled()) {
                    ListenableFuture listenableFuture = ((apyk) this.b).a;
                    if ((listenableFuture instanceof apyj) && ((apyj) listenableFuture).d()) {
                        z2 = true;
                    }
                    this.a.a(z2);
                    return;
                }
                return;
            case 2:
                ((aqyo) this.a).b((Status) this.b);
                return;
            case 3:
                ((arbd) this.b).g(Status.f.withDescription(((StringBuilder) this.a).toString()), true);
                return;
            case 4:
                Status status = (Status) this.b;
                ((arbd) this.a).b.c(status.getDescription(), status.r);
                return;
            case 5:
                ((arbd) this.b).b.f(this.a);
                return;
            case 6:
                ((arbc) this.a).c.c((aqut) this.b);
                return;
            case 7:
                ((arbc) this.b).c.d(this.a);
                return;
            case 8:
                ((arbi) this.a).e.h(this.b);
                return;
            case 9:
                ((arbi) this.a).e.j((aqsp) this.b);
                return;
            case 10:
                ((arbi) this.a).e.i((aqsn) this.b);
                return;
            case 11:
                ((arbi) this.b).e.n((InputStream) this.a);
                return;
            case 12:
                ((arbi) this.a).e.c((Status) this.b);
                return;
            case 13:
                ((arbh) this.b).a.d(this.a);
                return;
            case 14:
                ((arbh) this.a).a.c((aqut) this.b);
                return;
            case 15:
                arbj arbjVar = new arbj((byte[]) null);
                arbjVar.c = aqwa.b((Status) ((arbj) this.b).a);
                ((arbk) this.a).b.k(arbjVar.a());
                return;
            case 16:
                ((arbk) this.a).b.k(((arbj) this.b).a());
                return;
            case 17:
                arbj arbjVar2 = new arbj((byte[]) null);
                arbk arbkVar = (arbk) this.b;
                arbjVar2.c = aqwa.b(Status.n.withDescription("Unable to resolve host ".concat(String.valueOf(arbkVar.a.j))).d((Throwable) this.a));
                arbkVar.b.k(arbjVar2.a());
                return;
            case 18:
                ?? r0 = this.a;
                arco arcoVar = ((arcr) this.b).g;
                SocketAddress b = arcoVar.b();
                arcoVar.a = r0;
                arcoVar.c();
                ((arcr) this.b).h = this.a;
                if (((arcr) this.b).o.a == aqsd.READY || ((arcr) this.b).o.a == aqsd.CONNECTING) {
                    Object obj = this.b;
                    while (true) {
                        arco arcoVar2 = ((arcr) obj).g;
                        if (i < arcoVar2.a.size()) {
                            int indexOf = ((aqsq) arcoVar2.a.get(i)).b.indexOf(b);
                            if (indexOf == -1) {
                                i++;
                            } else {
                                arcoVar2.b = i;
                                arcoVar2.c = indexOf;
                            }
                        } else if (((arcr) this.b).o.a == aqsd.READY) {
                            arcr arcrVar = (arcr) this.b;
                            arefVar = arcrVar.n;
                            arcrVar.n = null;
                            ((arcr) this.b).g.c();
                            ((arcr) this.b).b(aqsd.IDLE);
                        } else {
                            ((arcr) this.b).m.o(Status.n.withDescription("InternalSubchannel closed pending transport due to address change"));
                            arcr.i((arcr) this.b);
                            ((arcr) this.b).g.c();
                            ((arcr) this.b).h();
                        }
                    }
                }
                arefVar = null;
                if (arefVar != null) {
                    arcr arcrVar2 = (arcr) this.b;
                    if (arcrVar2.u != null) {
                        arcrVar2.j.o(Status.n.withDescription("InternalSubchannel closed transport early due to address change"));
                        ((arcr) this.b).u.m();
                        arcr arcrVar3 = (arcr) this.b;
                        arcrVar3.u = null;
                        arcrVar3.j = null;
                    }
                    arcr arcrVar4 = (arcr) this.b;
                    arcrVar4.j = arefVar;
                    arcrVar4.u = arcrVar4.f.d(new arbg(this, 7), 5L, TimeUnit.SECONDS, arcrVar4.a);
                    return;
                }
                return;
            case 19:
                if (((arcr) this.a).o.a != aqsd.SHUTDOWN) {
                    arcr arcrVar5 = (arcr) this.a;
                    arcrVar5.p = (Status) this.b;
                    aref arefVar2 = arcrVar5.n;
                    arau arauVar = arcrVar5.m;
                    arcrVar5.n = null;
                    arcr.i((arcr) this.a);
                    ((arcr) this.a).b(aqsd.SHUTDOWN);
                    ((arcr) this.a).g.c();
                    if (((arcr) this.a).k.isEmpty()) {
                        ((arcr) this.a).e();
                    }
                    arcr arcrVar6 = (arcr) this.a;
                    arcrVar6.f.c();
                    asmb asmbVar = arcrVar6.t;
                    if (asmbVar != null) {
                        asmbVar.m();
                        arcrVar6.t = null;
                        arcrVar6.r = null;
                    }
                    asmb asmbVar2 = ((arcr) this.a).u;
                    if (asmbVar2 != null) {
                        asmbVar2.m();
                        ((arcr) this.a).j.o((Status) this.b);
                        arcr arcrVar7 = (arcr) this.a;
                        arcrVar7.u = null;
                        arcrVar7.j = null;
                    }
                    if (arefVar2 != null) {
                        arefVar2.o((Status) this.b);
                    }
                    if (arauVar != null) {
                        arauVar.o((Status) this.b);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (((arcp) this.a).c.o.a != aqsd.SHUTDOWN) {
                    arcp arcpVar = (arcp) this.a;
                    arau arauVar2 = arcpVar.a;
                    if (arcpVar.c.n == arauVar2) {
                        arcpVar.c.n = null;
                        ((arcp) this.a).c.g.c();
                        ((arcp) this.a).c.b(aqsd.IDLE);
                        return;
                    }
                    arcr arcrVar8 = arcpVar.c;
                    if (arcrVar8.m == arauVar2) {
                        if (arcrVar8.o.a == aqsd.CONNECTING) {
                            z = true;
                        } else {
                            z = false;
                        }
                        albo.X(z, "Expected state is CONNECTING, actual state is %s", ((arcp) this.a).c.o.a);
                        arco arcoVar3 = ((arcp) this.a).c.g;
                        aqsq aqsqVar = (aqsq) arcoVar3.a.get(arcoVar3.b);
                        int i2 = arcoVar3.c + 1;
                        arcoVar3.c = i2;
                        if (i2 >= aqsqVar.b.size()) {
                            arcoVar3.b++;
                            arcoVar3.c = 0;
                        }
                        arco arcoVar4 = ((arcp) this.a).c.g;
                        if (arcoVar4.b >= arcoVar4.a.size()) {
                            arcr.i(((arcp) this.a).c);
                            ((arcp) this.a).c.g.c();
                            Object obj2 = this.a;
                            Object obj3 = this.b;
                            arcr arcrVar9 = ((arcp) obj2).c;
                            arcrVar9.f.c();
                            Status status2 = (Status) obj3;
                            d.t(!status2.f(), "The error status must not be OK");
                            arcrVar9.d(new aqse(aqsd.TRANSIENT_FAILURE, status2));
                            if (!arcrVar9.d) {
                                if (arcrVar9.r == null) {
                                    arcrVar9.r = new arbp();
                                }
                                long a = arcrVar9.r.a() - arcrVar9.i.a(TimeUnit.NANOSECONDS);
                                arcrVar9.c.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", arcr.k(status2), Long.valueOf(a));
                                if (arcrVar9.t == null) {
                                    z3 = true;
                                }
                                albo.U(z3, "previous reconnectTask is not done");
                                arcrVar9.t = arcrVar9.f.d(new arbg(arcrVar9, 5), a, TimeUnit.NANOSECONDS, arcrVar9.a);
                                return;
                            }
                            return;
                        }
                        ((arcp) this.a).c.h();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ aqym(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public aqym(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public aqym(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
