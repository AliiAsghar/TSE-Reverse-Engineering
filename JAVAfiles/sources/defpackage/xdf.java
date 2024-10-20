package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xdf implements anil {
    private final qei a;
    private final qdq b;

    public xdf(qei qeiVar, qdq qdqVar) {
        qeiVar.getClass();
        qdqVar.getClass();
        this.a = qeiVar;
        this.b = qdqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.anil
    public final ListenableFuture a() {
        qdq qdqVar = this.b;
        zai zaiVar = new zai(this.a, (anen) ((kru) qdqVar.a).a.z.b(), (anen) ((kru) qdqVar.a).a.m.b(), (vbs) ((kru) qdqVar.a).a.ij.b(), new xdj());
        akrh e = aktp.e("IdentityBoundTachygramAuthTokenProvider#getAuthToken");
        try {
            int i = 1;
            akul f = ((vbs) zaiVar.d).d(((qei) zaiVar.a).d, 15).i(new xdg(i), zaiVar.b).h(new xdh(i), zaiVar.c).f(aqwb.class, new wgb(zaiVar, 9), zaiVar.c);
            e.b(f);
            e.close();
            return f;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.anil
    public final Object b(arpe arpeVar) {
        return arro.F(a(), arpeVar);
    }
}
