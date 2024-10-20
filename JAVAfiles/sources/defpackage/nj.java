package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nj extends nl {
    public nj(nw nwVar) {
        super(nwVar);
    }

    @Override // defpackage.nl
    public final int a(View view) {
        return nw.bG(view) + ((nx) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.nl
    public final int b(View view) {
        nx nxVar = (nx) view.getLayoutParams();
        return nw.br(view) + nxVar.leftMargin + nxVar.rightMargin;
    }

    @Override // defpackage.nl
    public final int c(View view) {
        nx nxVar = (nx) view.getLayoutParams();
        return nw.bq(view) + nxVar.topMargin + nxVar.bottomMargin;
    }

    @Override // defpackage.nl
    public final int d(View view) {
        return nw.bF(view) - ((nx) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.nl
    public final int e() {
        return this.a.F;
    }

    @Override // defpackage.nl
    public final int f() {
        nw nwVar = this.a;
        return nwVar.F - nwVar.aB();
    }

    @Override // defpackage.nl
    public final int g() {
        return this.a.aB();
    }

    @Override // defpackage.nl
    public final int h() {
        return this.a.D;
    }

    @Override // defpackage.nl
    public final int i() {
        return this.a.E;
    }

    @Override // defpackage.nl
    public final int j() {
        return this.a.aA();
    }

    @Override // defpackage.nl
    public final int k() {
        nw nwVar = this.a;
        return (nwVar.F - nwVar.aA()) - this.a.aB();
    }

    @Override // defpackage.nl
    public final int l(View view) {
        this.a.bw(view, this.c);
        return this.c.right;
    }

    @Override // defpackage.nl
    public final int m(View view) {
        this.a.bw(view, this.c);
        return this.c.left;
    }

    @Override // defpackage.nl
    public final void n(int i) {
        this.a.aR(i);
    }
}
