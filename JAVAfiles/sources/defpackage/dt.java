package defpackage;

import android.util.Log;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dt extends du {
    private final dg j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dt(int r2, int r3, defpackage.dg r4) {
        /*
            r1 = this;
            cg r0 = r4.a
            r0.getClass()
            r1.<init>(r2, r3, r0)
            r1.j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt.<init>(int, int, dg):void");
    }

    @Override // defpackage.du
    public final void a() {
        super.a();
        this.a.t = false;
        this.j.e();
    }

    @Override // defpackage.du
    public final void b() {
        float f;
        if (!this.e) {
            super.b();
            int i = this.i;
            if (i == 2) {
                cg cgVar = this.j.a;
                cgVar.getClass();
                View findFocus = cgVar.Q.findFocus();
                if (findFocus != null) {
                    cgVar.al(findFocus);
                    if (da.Y(2)) {
                        Log.v("FragmentManager", a.cd(cgVar, findFocus, "requestFocus: Saved focused view ", " for Fragment "));
                    }
                }
                View L = this.a.L();
                if (L.getParent() == null) {
                    this.j.b();
                    L.setAlpha(brg.a);
                }
                if (L.getAlpha() == brg.a && L.getVisibility() == 0) {
                    L.setVisibility(4);
                }
                cc ccVar = cgVar.T;
                if (ccVar == null) {
                    f = 1.0f;
                } else {
                    f = ccVar.l;
                }
                L.setAlpha(f);
                return;
            }
            if (i == 3) {
                cg cgVar2 = this.j.a;
                cgVar2.getClass();
                View L2 = cgVar2.L();
                if (da.Y(2)) {
                    Log.v("FragmentManager", "Clearing focus " + L2.findFocus() + " on view " + L2 + " for Fragment " + cgVar2);
                }
                L2.clearFocus();
            }
        }
    }
}
