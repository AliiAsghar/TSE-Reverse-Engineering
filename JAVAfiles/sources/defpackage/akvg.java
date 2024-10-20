package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akvg extends nq {
    final /* synthetic */ String a = "MessageListFragmentPeer scrollListener";
    final /* synthetic */ nq b;
    final /* synthetic */ akmy c;

    public akvg(akmy akmyVar, nq nqVar) {
        this.b = nqVar;
        this.c = akmyVar;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        if (akqj.u()) {
            this.b.dG(recyclerView, i, i2);
            return;
        }
        akmy akmyVar = this.c;
        akrc b = ((aksr) akmyVar.a).b(this.a);
        try {
            this.b.dG(recyclerView, i, i2);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.nq
    public final void t(RecyclerView recyclerView, int i) {
        if (akqj.u()) {
            this.b.t(recyclerView, i);
            return;
        }
        akmy akmyVar = this.c;
        akrc b = ((aksr) akmyVar.a).b(this.a);
        try {
            this.b.t(recyclerView, i);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
