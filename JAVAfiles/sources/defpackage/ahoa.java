package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahoa implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahoa(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [ahlj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 9;
        boolean z = true;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                ((ahob) this.a).X();
                return;
            case 1:
                ((ahob) this.a).W();
                return;
            case 2:
                ahpx ahpxVar = (ahpx) this.a;
                ahpv ahpvVar = (ahpv) ahpxVar.c.b();
                agrk agrkVar = ahpxVar.j;
                aegu aeguVar = (aegu) agrkVar.a.b();
                aeguVar.getClass();
                aneo aneoVar = (aneo) agrkVar.b.b();
                aneoVar.getClass();
                ahpvVar.getClass();
                ahpxVar.i = new ahpy(aeguVar, aneoVar, ahpvVar, ahpxVar.e, ahpxVar.d);
                if (ahpxVar.g) {
                    ahpxVar.i.b();
                    return;
                }
                return;
            case 3:
                Object obj = this.a;
                albo.bL(new ahoa(obj, 5), ((ahpx) obj).b);
                return;
            case 4:
                Object obj2 = this.a;
                ahpx ahpxVar2 = (ahpx) obj2;
                if (agqa.e(ahpxVar2.a)) {
                    ahpxVar2.a();
                    return;
                } else {
                    agqa.b(ahpxVar2.a, new ahoa(obj2, 3));
                    return;
                }
            case 5:
                ((ahpx) this.a).a();
                return;
            case 6:
                ?? r0 = this.a;
                ahpx ahpxVar3 = (ahpx) r0;
                if (!ahpxVar3.e.c(null)) {
                    synchronized (ahpxVar3.h) {
                        ((ahpx) r0).f.b(r0);
                    }
                    return;
                } else {
                    ahpxVar3.i.getClass();
                    ahpxVar3.i.b();
                    return;
                }
            case 7:
                ahpx ahpxVar4 = (ahpx) this.a;
                ahpxVar4.i.getClass();
                ahpy ahpyVar = ahpxVar4.i;
                if (ahpyVar.h && ahpyVar.i.get() != null) {
                    ahpyVar.h = false;
                    ((Future) ahpyVar.i.get()).cancel(false);
                    return;
                }
                return;
            case 8:
                Object obj3 = this.a;
                ahpy ahpyVar2 = (ahpy) obj3;
                ahpyVar2.f = ahpyVar2.a.e().toMillis();
                ahpyVar2.c.post(new ahoa(obj3, 10));
                ahpyVar2.a(new ahoa(obj3, i), ahpyVar2.b.b);
                return;
            case 9:
                Object obj4 = this.a;
                ahpy ahpyVar3 = (ahpy) obj4;
                long millis = ahpyVar3.a.e().toMillis();
                long j = ahpyVar3.g - ahpyVar3.f;
                alog alogVar = ahpyVar3.b.e;
                if (j >= 0) {
                    if (j > ((Integer) alogVar.get(0)).intValue()) {
                        ahmu ahmuVar = ahpyVar3.d;
                        ahmq a = ahmr.a();
                        aozy createBuilder = asjt.a.createBuilder();
                        aozy createBuilder2 = asjs.a.createBuilder();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        asjs asjsVar = (asjs) createBuilder2.b;
                        asjsVar.b = 2;
                        asjsVar.c = Long.valueOf(j);
                        asjs asjsVar2 = (asjs) createBuilder2.s();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        asjt asjtVar = (asjt) createBuilder.b;
                        asjsVar2.getClass();
                        asjtVar.r = asjsVar2;
                        asjtVar.b |= 131072;
                        a.e((asjt) createBuilder.s());
                        ahmuVar.b(a.a());
                        ahpyVar3.e = 0;
                    }
                    ahpyVar3.a(new ahoa(obj4, 8), ahpyVar3.b.d);
                    return;
                }
                int intValue = ((Integer) alogVar.get(ahpyVar3.e)).intValue();
                long j2 = millis - ahpyVar3.f;
                if (j2 > intValue) {
                    ahpv ahpvVar2 = ahpyVar3.b;
                    int i2 = ahpyVar3.e;
                    alog alogVar2 = ahpvVar2.e;
                    if (i2 != alogVar2.size() && j2 > ((Integer) alogVar2.get(ahpyVar3.e)).intValue()) {
                        while (ahpyVar3.e != alogVar2.size() && j2 > ((Integer) alogVar2.get(ahpyVar3.e)).intValue()) {
                            ahpyVar3.e++;
                            z2 = true;
                        }
                        if (z2) {
                            ahmu ahmuVar2 = ahpyVar3.d;
                            ahmq a2 = ahmr.a();
                            aozy createBuilder3 = asjt.a.createBuilder();
                            aozy createBuilder4 = asjs.a.createBuilder();
                            if (!createBuilder4.b.isMutable()) {
                                createBuilder4.u();
                            }
                            asjs asjsVar3 = (asjs) createBuilder4.b;
                            asjsVar3.b = 1;
                            asjsVar3.c = Long.valueOf(j2);
                            asjs asjsVar4 = (asjs) createBuilder4.s();
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            asjt asjtVar2 = (asjt) createBuilder3.b;
                            asjsVar4.getClass();
                            asjtVar2.r = asjsVar4;
                            asjtVar2.b |= 131072;
                            a2.e((asjt) createBuilder3.s());
                            ahmuVar2.b(a2.a());
                        }
                    }
                }
                ahpyVar3.a(new ahoa(obj4, i), ahpyVar3.b.c);
                return;
            case 10:
                ahpy ahpyVar4 = (ahpy) this.a;
                ahpyVar4.g = ahpyVar4.a.e().toMillis();
                return;
            case 11:
                ahqe ahqeVar = (ahqe) this.a;
                if (ahqeVar.s.b == null) {
                    z = false;
                }
                ahqeVar.b = z;
                return;
            case 12:
                ahqe ahqeVar2 = (ahqe) this.a;
                if (ahqeVar2.s.b == null) {
                    z = false;
                }
                ahqeVar2.c = z;
                return;
            case 13:
                ahqe ahqeVar3 = (ahqe) this.a;
                if (ahqeVar3.s.b == null) {
                    z = false;
                }
                ahqeVar3.d = z;
                return;
            case 14:
                ahqe ahqeVar4 = (ahqe) this.a;
                if (ahqeVar4.s.b == null) {
                    z = false;
                }
                ahqeVar4.e = z;
                return;
            case 15:
                ahqe ahqeVar5 = (ahqe) this.a;
                if (ahqeVar5.s.b == null) {
                    z = false;
                }
                ahqeVar5.f = z;
                return;
            case 16:
                ((ahqe) this.a).a(0);
                return;
            case 17:
                int i3 = ahqb.b;
                aiut.c();
                ahqd ahqdVar = (ahqd) this.a;
                if (ahqdVar.b.m != null) {
                    return;
                }
                ahqdVar.b.m = ahmz.b();
                return;
            case 18:
                int i4 = ahqb.b;
                aiut.c();
                ?? r02 = this.a;
                ahqd ahqdVar2 = (ahqd) r02;
                if (ahqdVar2.b.n != null) {
                    return;
                }
                ahqdVar2.b.n = ahmz.b();
                ahqe.e("Primes-ttfdd-end-and-length-ms", ahqdVar2.b.n.a);
                ahqdVar2.a.unregisterActivityLifecycleCallbacks(r02);
                return;
            case 19:
                aiut.c();
                ahqd ahqdVar3 = (ahqd) this.a;
                if (ahqdVar3.b.p != null) {
                    return;
                }
                ahqdVar3.b.p = ahmz.b();
                return;
            default:
                aiut.c();
                ahqd ahqdVar4 = (ahqd) this.a;
                if (ahqdVar4.b.o != null) {
                    return;
                }
                ahqdVar4.b.o = ahmz.b();
                return;
        }
    }
}
