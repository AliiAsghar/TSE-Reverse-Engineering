package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolx implements aolh {
    private static final alwo a = alwo.o("xRPC");
    private aegu b;
    private aquw c;
    private long d;
    private aolu e;

    @Override // defpackage.aolh
    public final /* synthetic */ aolq a() {
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq b() {
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final void e(aojh aojhVar) {
        boolean z;
        boolean z2;
        try {
            if (((Status) aojhVar.a).f()) {
                long a2 = this.b.a() - this.d;
                boolean z3 = true;
                if (this.c.equals(aquw.UNARY)) {
                    if (a2 <= 2147483647L) {
                        aolu aoluVar = this.e;
                        int i = (int) a2;
                        if (i >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        d.t(z2, "Cannot record negative latency.");
                        if (aoluVar.i.getAndSet(i) != -1) {
                            z3 = false;
                        }
                        albo.U(z3, "Already recorded latency.");
                    } else {
                        ((alwl) ((alwl) a.h()).h("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", 52, "NetworkLatencyInterceptor.java")).q("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                    }
                } else {
                    aolu aoluVar2 = this.e;
                    if (a2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d.t(z, "Cannot record negative stream duration.");
                    if (aoluVar2.l.getAndSet(a2) != -1) {
                        z3 = false;
                    }
                    albo.U(z3, "Already recorded stream duration.");
                }
            }
            this.e.f.incrementAndGet();
        } catch (Throwable th) {
            ((alwl) ((alwl) ((alwl) a.h()).g(th)).h("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", '>', "NetworkLatencyInterceptor.java")).q("Failed to record network latency");
        }
    }

    @Override // defpackage.aolh
    public final /* synthetic */ aolq f(atii atiiVar) {
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final aolq g(atii atiiVar) {
        this.c = ((aqux) atiiVar.c).a;
        aolu aoluVar = (aolu) ((aqrr) atiiVar.d).f(aolu.b);
        aoluVar.getClass();
        this.e = aoluVar;
        aegu aeguVar = ((aojr) ((aqrr) atiiVar.d).f(aojs.a)).b;
        this.b = aeguVar;
        this.d = aeguVar.a();
        return aolq.a;
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.aolh
    public final /* synthetic */ void d() {
    }
}
