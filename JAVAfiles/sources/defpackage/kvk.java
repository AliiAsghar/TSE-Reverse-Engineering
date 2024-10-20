package defpackage;

import android.support.v7.widget.RecyclerView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvk extends nq {
    int a = 0;
    public final /* synthetic */ kvw b;

    public kvk(kvw kvwVar) {
        this.b = kvwVar;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        akrc b = this.b.A.b("HomeFragmentPeer#onScrolled");
        try {
            kvw kvwVar = this.b;
            if (kvwVar.aR) {
                int i3 = this.a;
                if (i3 == 1 || i3 == 2) {
                    abdc abdcVar = (abdc) kvwVar.i.b();
                    kvw kvwVar2 = this.b;
                    kux kuxVar = kvwVar2.b;
                    abdcVar.i(kuxVar.fe(), kvwVar2.b(kuxVar));
                }
                if (this.b.B()) {
                    akrh e = aktp.e("HomeFragment#onScrollToNewest");
                    try {
                        this.b.u();
                        e.close();
                    } finally {
                    }
                } else {
                    ((rrt) this.b.aO.a()).d(false);
                }
                if (((Boolean) kwl.a.e()).booleanValue()) {
                    ((Optional) ((apxx) this.b.M).a).ifPresent(new ktm(this, 12));
                }
            }
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
        this.a = i;
    }
}
