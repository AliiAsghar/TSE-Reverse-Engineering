package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aggb {
    static final /* synthetic */ artm[] a;
    public static final alvi b;
    public final arwe c;
    public final RecyclerView d;
    public final nw e;
    public final arqr f;
    public final arqr g;
    private final arsn h = new agga();

    static {
        arrr arrrVar = new arrr(aggb.class, "observerJob", "getObserverJob()Lkotlinx/coroutines/Job;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
        b = alvi.m("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver");
    }

    public aggb(arwe arweVar, RecyclerView recyclerView, nw nwVar, arqr arqrVar, arqr arqrVar2) {
        this.c = arweVar;
        this.d = recyclerView;
        this.e = nwVar;
        this.f = arqrVar;
        this.g = arqrVar2;
    }

    public final void a(arxm arxmVar) {
        this.h.d(a[0], arxmVar);
    }
}
