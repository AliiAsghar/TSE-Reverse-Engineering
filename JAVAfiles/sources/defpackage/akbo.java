package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class akbo {
    protected abstract void a(ListenableFuture listenableFuture, Object obj, akbp akbpVar);

    public abstract void b(akbp akbpVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void c(ahlp ahlpVar, akbp akbpVar) {
        a(ahlpVar.a, null, akbpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void j(ahlp ahlpVar, ahlp ahlpVar2, akbp akbpVar) {
        a(ahlpVar.a, ahlpVar2.a, akbpVar);
    }

    public abstract void k(ahlp ahlpVar, ahlp ahlpVar2, akbp akbpVar);
}
