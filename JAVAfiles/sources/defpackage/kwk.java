package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwk extends nq {
    final /* synthetic */ kwl a;

    public kwk(kwl kwlVar) {
        this.a = kwlVar;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, ascd] */
    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.computeVerticalScrollOffset() != 0 && i2 >= -10) {
            if (i2 > 10) {
                if (this.a.k.b()) {
                    ghw ghwVar = (ghw) this.a.c.b();
                    if (((Boolean) ghwVar.a.c()).booleanValue()) {
                        ghwVar.a.f(false);
                        return;
                    }
                    return;
                }
                ExtendedFloatingActionButton extendedFloatingActionButton = this.a.h;
                if (extendedFloatingActionButton != null) {
                    extendedFloatingActionButton.n();
                    return;
                }
                return;
            }
            return;
        }
        if (this.a.k.b()) {
            ghw ghwVar2 = (ghw) this.a.c.b();
            if (!((Boolean) ghwVar2.a.c()).booleanValue()) {
                ghwVar2.a.f(true);
                return;
            }
            return;
        }
        ExtendedFloatingActionButton extendedFloatingActionButton2 = this.a.h;
        if (extendedFloatingActionButton2 != null) {
            extendedFloatingActionButton2.q(3);
        }
    }
}
