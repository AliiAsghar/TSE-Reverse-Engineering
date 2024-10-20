package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahoo {
    public abstract ListenableFuture<Void> b(ahom ahomVar);

    public abstract void d(ahka ahkaVar);

    public final ListenableFuture<Void> e(ahka ahkaVar, ashu ashuVar) {
        anjm a = ahom.a();
        a.j(ahkaVar);
        return b(a.i());
    }

    public final void f(RecyclerView recyclerView, ahka ahkaVar, ashu ashuVar) {
        recyclerView.aL(new ahon(this, ahkaVar));
    }

    public final void g(ahka ahkaVar, ashu ashuVar) {
        anjm a = ahom.a();
        a.j(ahkaVar);
        b(a.i());
    }
}
