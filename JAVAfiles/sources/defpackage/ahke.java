package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahke implements ahkd {
    private final ahkj a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final ahiy h;

    public ahke(ahkj ahkjVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, ahiy ahiyVar) {
        this.a = ahkjVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = ahiyVar;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        if (!bool.booleanValue()) {
            ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 109, "PrimesApiImpl.java")).q("Primes instant initialization");
            try {
                aktp.d();
                Iterator it = ((Set) armfVar.b()).iterator();
                while (it.hasNext()) {
                    ((ahmw) it.next()).as();
                }
            } catch (RuntimeException e) {
                ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 'u', "PrimesApiImpl.java")).q("Primes failed to initialize");
                ahkj ahkjVar2 = this.a;
                if (!ahkjVar2.a) {
                    ahkjVar2.a = true;
                    ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 33, "Shutdown.java")).q("Shutdown ...");
                }
            }
        }
    }

    @Override // defpackage.ahkd
    public final ahqq a() {
        return ((ahqr) this.f.b()).d();
    }

    @Override // defpackage.ahkd
    public final void b(ahka ahkaVar) {
        ((ahqr) this.f.b()).c(ahkaVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    @Override // defpackage.ahkd
    public final void c() {
        ahiy ahiyVar = this.h;
        if (((AtomicBoolean) ahiyVar.c).getAndSet(true)) {
            return;
        }
        ((ahnn) ((alha) ahiyVar.a).a.b()).k();
        ((ahpf) ((alha) ahiyVar.b).a.b()).a();
    }

    @Override // defpackage.ahkd
    public final void d(ahpn ahpnVar) {
        ((ahpq) this.e.b()).a(ahpnVar);
    }

    @Override // defpackage.ahkd
    public final void e(ahka ahkaVar) {
        ((ahqr) this.f.b()).e(ahkaVar);
    }

    @Override // defpackage.ahkd
    public final void f() {
        ((ahpf) this.d.b()).a();
    }

    @Override // defpackage.ahkd
    public final boolean g() {
        return ((ahpm) this.c.b()).b();
    }

    @Override // defpackage.ahkd
    public final void h(ahka ahkaVar, long j, long j2) {
        ((ahqm) this.g.b()).a(ahkaVar, j, j2, null);
    }

    @Override // defpackage.ahkd
    public final void i(ahka ahkaVar) {
        ((ahpf) this.d.b()).b(ahkaVar, null);
    }

    @Override // defpackage.ahkd
    public final void j(ahka ahkaVar, ahqp ahqpVar) {
        ((ahqr) this.f.b()).g(ahkaVar, null, ahqpVar);
    }

    @Override // defpackage.ahkd
    public final void k(ahqq ahqqVar, ahka ahkaVar, ahqp ahqpVar) {
        ((ahqr) this.f.b()).f(ahqqVar, ahkaVar, null, ahqpVar);
    }
}
