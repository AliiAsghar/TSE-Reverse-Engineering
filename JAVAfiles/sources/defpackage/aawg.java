package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawg extends na {
    private nl c;
    private nl d;

    private static View g(nw nwVar, nl nlVar) {
        int e;
        int abs;
        int at = nwVar.at();
        View view = null;
        if (at == 0) {
            return null;
        }
        if (nwVar.bk()) {
            e = nlVar.j() + (nlVar.k() / 2);
        } else {
            e = nlVar.e() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < at; i2++) {
            View aF = nwVar.aF(i2);
            if (aF != null && (abs = Math.abs((aF.getLeft() + (aF.getWidth() / 2)) - e)) < i) {
                view = aF;
                i = abs;
            }
        }
        return view;
    }

    @Override // defpackage.na, defpackage.nz
    public final View b(nw nwVar) {
        if (nwVar.ah()) {
            nl nlVar = this.c;
            if (nlVar == null || nlVar.a != nwVar) {
                this.c = new nk(nwVar);
            }
            return g(nwVar, this.c);
        }
        if (nwVar.ag()) {
            nl nlVar2 = this.d;
            if (nlVar2 == null || nlVar2.a != nwVar) {
                this.d = new nj(nwVar);
            }
            return g(nwVar, this.d);
        }
        return null;
    }

    @Override // defpackage.na, defpackage.nz
    public final int[] c(nw nwVar, View view) {
        int[] c = super.c(nwVar, view);
        int aw = nwVar.aw();
        int marginEnd = ((nx) view.getLayoutParams()).getMarginEnd() - ((nx) view.getLayoutParams()).getMarginStart();
        if (aw == 1) {
            c[0] = c[0] + (marginEnd / 2);
        } else {
            c[0] = c[0] - (marginEnd / 2);
        }
        return c;
    }
}
