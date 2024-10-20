package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfv extends ecl {
    final /* synthetic */ gfw a;

    public gfv(gfw gfwVar) {
        this.a = gfwVar;
    }

    @Override // defpackage.ecl
    public final void c(View view, efx efxVar) {
        this.a.d.c(view, efxVar);
        RecyclerView recyclerView = this.a.c;
        int fV = recyclerView.fV(view);
        no noVar = recyclerView.l;
        if (!(noVar instanceof gfp)) {
            return;
        }
        ((gfp) noVar).m(fV);
    }

    @Override // defpackage.ecl
    public final boolean i(View view, int i, Bundle bundle) {
        return this.a.d.i(view, i, bundle);
    }
}
