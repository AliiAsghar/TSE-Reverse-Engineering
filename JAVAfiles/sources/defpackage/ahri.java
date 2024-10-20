package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahri extends ahre implements ahmw {
    public final ahmu a;
    public final aneo b;
    public final apwt c;
    public final apwt d;
    public final ahrq e;
    public final AtomicReference f;
    public final ahmn g;

    public ahri(ahmv ahmvVar, aneo aneoVar, apwt apwtVar, apwt apwtVar2, armf armfVar, ahmn ahmnVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f = atomicReference;
        this.b = aneoVar;
        this.c = apwtVar;
        this.d = apwtVar2;
        this.g = ahmnVar;
        this.a = ahmvVar.a(aneoVar, new apwt() { // from class: ahrh
            @Override // defpackage.apwt
            public final Object b() {
                ahra c = ahrb.c();
                c.b(true);
                return c.a();
            }
        }, armfVar);
        this.e = new ahrq(new acss(apwtVar, 9));
        atomicReference.set(ahmnVar.a(1.0f));
    }

    @Override // defpackage.ahre
    public final void a(asis asisVar, asjw asjwVar, ashu ashuVar) {
        boolean z;
        if (asisVar.k.size() == 0) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordAsFuture", BasePaymentResult.ERROR_REQUEST_FAILED, "TraceMetricServiceImpl.java")).q("Invalid traces were logged.");
            ListenableFuture listenableFuture = aneh.a;
            return;
        }
        final ahmq a = ahmr.a();
        aozy createBuilder = asjt.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        asjt asjtVar = (asjt) apagVar;
        asjtVar.n = asisVar;
        asjtVar.b |= 4096;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        asjt asjtVar2 = (asjt) createBuilder.b;
        asjtVar2.o = asjwVar;
        asjtVar2.b |= 8192;
        a.e((asjt) createBuilder.s());
        if (ashuVar != null) {
            a.b = ashuVar;
        }
        final String str = asisVar.d;
        if (asisVar.f.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        final boolean z2 = z;
        final long j = asisVar.c;
        albo.bN(new ancr() { // from class: ahrf
            @Override // defpackage.ancr
            public final ListenableFuture a() {
                String str2 = str;
                ahmq ahmqVar = a;
                boolean z3 = z2;
                ahri ahriVar = ahri.this;
                if (!z3 && (((ahqz) ahriVar.c.b()).c instanceof ahqy)) {
                    long a2 = ahriVar.a.a(str2);
                    if (a2 == -1) {
                        return aneh.a;
                    }
                    ahmqVar.d = Long.valueOf(a2);
                } else {
                    ahmqVar.d(true);
                }
                if (!((ahqz) ahriVar.c.b()).b()) {
                    return aneh.a;
                }
                if (ahriVar.e.c()) {
                    return aneh.a;
                }
                long j2 = j;
                ahriVar.e.b();
                ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordTrace", 262, "TraceMetricServiceImpl.java")).A("Recording trace %d: %s", j2, str2);
                return ahriVar.a.b(ahmqVar.a());
            }
        }, this.b);
    }

    @Override // defpackage.ahmw
    public final void as() {
        this.b.execute(new ahsa(this, 1));
    }
}
