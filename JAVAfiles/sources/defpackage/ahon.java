package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahon extends nq {
    final /* synthetic */ ahka a;
    final /* synthetic */ ahoo b;
    private boolean c;

    public ahon(ahoo ahooVar, ahka ahkaVar) {
        this.a = ahkaVar;
        this.b = ahooVar;
    }

    @Override // defpackage.nq
    public final void t(RecyclerView recyclerView, int i) {
        if (!this.c) {
            if (i == 1) {
                this.b.d(this.a);
                this.c = true;
                return;
            }
            return;
        }
        if (i == 0) {
            this.b.e(this.a, null);
            this.c = false;
        }
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
    }
}
