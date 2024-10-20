package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xnz implements anil {
    private final abrd a;

    public xnz(abrd abrdVar) {
        this.a = abrdVar;
    }

    @Override // defpackage.anil
    public final ListenableFuture a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.anil
    public final Object b(arpe arpeVar) {
        abrd abrdVar = this.a;
        akrh e = aktp.e("TachygramAuthTokenProvider#getAuthToken");
        try {
            akul f = ((vbu) abrdVar.d).c().i(new wgb(abrdVar, 10), abrdVar.a).i(new xdg(0), abrdVar.b).h(new xdh(0), abrdVar.a).f(aqwb.class, new wgb(abrdVar, 11), abrdVar.a);
            e.b(f);
            e.close();
            return arro.F(f, arpeVar);
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
