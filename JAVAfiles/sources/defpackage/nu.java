package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nu implements qf {
    final /* synthetic */ nw a;
    private final /* synthetic */ int b;

    public nu(nw nwVar, int i) {
        this.b = i;
        this.a = nwVar;
    }

    @Override // defpackage.qf
    public final int a(View view) {
        int bE;
        int i;
        if (this.b != 0) {
            nx nxVar = (nx) view.getLayoutParams();
            bE = nw.bG(view);
            i = nxVar.rightMargin;
        } else {
            nx nxVar2 = (nx) view.getLayoutParams();
            bE = nw.bE(view);
            i = nxVar2.bottomMargin;
        }
        return bE + i;
    }

    @Override // defpackage.qf
    public final int b(View view) {
        int bH;
        int i;
        if (this.b != 0) {
            nx nxVar = (nx) view.getLayoutParams();
            bH = nw.bF(view);
            i = nxVar.leftMargin;
        } else {
            nx nxVar2 = (nx) view.getLayoutParams();
            bH = nw.bH(view);
            i = nxVar2.topMargin;
        }
        return bH - i;
    }

    @Override // defpackage.qf
    public final int c() {
        int i;
        int az;
        if (this.b != 0) {
            nw nwVar = this.a;
            i = nwVar.F;
            az = nwVar.aB();
        } else {
            nw nwVar2 = this.a;
            i = nwVar2.G;
            az = nwVar2.az();
        }
        return i - az;
    }

    @Override // defpackage.qf
    public final int d() {
        if (this.b != 0) {
            return this.a.aA();
        }
        return this.a.aC();
    }

    @Override // defpackage.qf
    public final View e(int i) {
        if (this.b != 0) {
            return this.a.aF(i);
        }
        return this.a.aF(i);
    }
}
