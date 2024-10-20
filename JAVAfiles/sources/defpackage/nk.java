package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nk extends nl {
    public nk(nw nwVar) {
        super(nwVar);
    }

    @Override // defpackage.nl
    public final int a(View view) {
        return nw.bE(view) + ((nx) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.nl
    public final int b(View view) {
        nx nxVar = (nx) view.getLayoutParams();
        return nw.bq(view) + nxVar.topMargin + nxVar.bottomMargin;
    }

    @Override // defpackage.nl
    public final int c(View view) {
        nx nxVar = (nx) view.getLayoutParams();
        return nw.br(view) + nxVar.leftMargin + nxVar.rightMargin;
    }

    @Override // defpackage.nl
    public final int d(View view) {
        return nw.bH(view) - ((nx) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.nl
    public final int e() {
        return this.a.G;
    }

    @Override // defpackage.nl
    public final int f() {
        nw nwVar = this.a;
        return nwVar.G - nwVar.az();
    }

    @Override // defpackage.nl
    public final int g() {
        return this.a.az();
    }

    @Override // defpackage.nl
    public final int h() {
        return this.a.E;
    }

    @Override // defpackage.nl
    public final int i() {
        return this.a.D;
    }

    @Override // defpackage.nl
    public final int j() {
        return this.a.aC();
    }

    @Override // defpackage.nl
    public final int k() {
        nw nwVar = this.a;
        return (nwVar.G - nwVar.aC()) - this.a.az();
    }

    @Override // defpackage.nl
    public final int l(View view) {
        this.a.bw(view, this.c);
        return this.c.bottom;
    }

    @Override // defpackage.nl
    public final int m(View view) {
        this.a.bw(view, this.c);
        return this.c.top;
    }

    @Override // defpackage.nl
    public final void n(int i) {
        this.a.aS(i);
    }
}
