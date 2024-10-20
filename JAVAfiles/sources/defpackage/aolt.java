package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolt implements aolh {
    private static final alwo a = alwo.o("xRPC");
    private aolu b;
    private aquw c;
    private asmb d;

    @Override // defpackage.aolh
    public final /* synthetic */ aolq a() {
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final aolq b() {
        if (this.c.equals(aquw.CLIENT_STREAMING) || this.c.equals(aquw.BIDI_STREAMING)) {
            this.b.h.incrementAndGet();
        }
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final void d() {
        if (!this.c.equals(aquw.SERVER_STREAMING) && !this.c.equals(aquw.BIDI_STREAMING)) {
            return;
        }
        this.b.g.incrementAndGet();
    }

    @Override // defpackage.aolh
    public final void e(aojh aojhVar) {
        boolean z;
        try {
            if (this.b.m.getAndSet(((Status) aojhVar.a).getCode()) == null) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Already recorded result.");
            asmb asmbVar = this.d;
            aolu aoluVar = this.b;
            if (((Boolean) ((alhw) asmbVar.a).a).booleanValue() && aoluVar.e.get()) {
                ahkc a2 = ahkc.a();
                ahpn a3 = ahpn.a(null, aoluVar.c.a());
                boolean z2 = aoluVar.d.get();
                d.s(true);
                d.s(true);
                a3.q = 1;
                a3.r = z2 ? 1 : 0;
                a2.c(a3);
            }
            Object obj = asmbVar.b;
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.h()).g(th)).h("com/google/frameworks/client/data/android/metrics/MetricsRecordingInterceptor", "startOnCompleteProcessing", 'R', "MetricsRecordingInterceptor.java")).q("Failed to record RPC metrics");
        }
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq f(atii atiiVar) {
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final aolq g(atii atiiVar) {
        boolean z;
        this.c = ((aqux) atiiVar.c).a;
        aqrq aqrqVar = aojs.a;
        aqrr aqrrVar = (aqrr) atiiVar.d;
        this.d = new asmb(((aojr) aqrrVar.f(aqrqVar)).l);
        boolean z2 = false;
        if (aqrrVar.f(aolu.b) == null) {
            z = true;
        } else {
            z = false;
        }
        albo.N(z, "Unexpected option %s already set.", aolu.b);
        if (aqrrVar.f(aols.a) == null) {
            z2 = true;
        }
        albo.N(z2, "Unexpected option %s already set.", aols.a);
        this.b = new aolu((aojx) aqrrVar.f(aojx.a));
        return new aolq(1, null, null, aqrrVar.e(aolu.b, this.b).e(aols.a, this.b));
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void c() {
    }
}
