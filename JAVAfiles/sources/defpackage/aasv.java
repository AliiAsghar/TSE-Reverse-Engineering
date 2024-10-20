package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasv extends na {
    final /* synthetic */ aasy c;

    public aasv(aasy aasyVar) {
        this.c = aasyVar;
    }

    @Override // defpackage.na, defpackage.nz
    public final View b(nw nwVar) {
        View U;
        if (((LinearLayoutManager) nwVar).L() != 0 || (U = nwVar.U(0)) == null) {
            return null;
        }
        int width = this.c.o + (U.getWidth() / 2);
        if (!this.c.w() ? U.getRight() <= width : U.getLeft() >= this.c.b.getRight() - width) {
            return nwVar.U(1);
        }
        return U;
    }

    @Override // defpackage.na, defpackage.nz
    public final int[] c(nw nwVar, View view) {
        int[] c = super.c(nwVar, view);
        nx nxVar = (nx) view.getLayoutParams();
        int width = this.c.b.getWidth() - ((view.getWidth() + nxVar.leftMargin) + nxVar.rightMargin);
        int i = this.c.o - nxVar.leftMargin;
        int B = this.c.B() / 2;
        int i2 = c[0];
        int i3 = ((width / 2) - i) - B;
        if (this.c.w()) {
            i3 = -i3;
        }
        c[0] = i2 + i3;
        return c;
    }
}
