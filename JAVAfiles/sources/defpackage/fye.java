package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fye implements View.OnClickListener, PopupWindow.OnDismissListener, err {
    final /* synthetic */ fyj a;

    public fye(fyj fyjVar) {
        this.a = fyjVar;
    }

    @Override // defpackage.err
    public final void eI(erq erqVar) {
        if (erqVar.a(4, 5, 13)) {
            this.a.g();
        }
        if (erqVar.a(4, 5, 7, 13)) {
            this.a.i();
        }
        if (erqVar.a(8, 13)) {
            this.a.j();
        }
        if (erqVar.a(9, 13)) {
            this.a.l();
        }
        if (erqVar.a(8, 9, 11, 0, 16, 17, 13)) {
            this.a.f();
        }
        if (erqVar.a(11, 0, 13)) {
            this.a.m();
        }
        if (erqVar.a(12, 13)) {
            this.a.h();
        }
        if (erqVar.a(2, 13)) {
            this.a.n();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fyj fyjVar = this.a;
        ert ertVar = fyjVar.D;
        if (ertVar != null) {
            fyjVar.a.i();
            fyj fyjVar2 = this.a;
            if (fyjVar2.j == view) {
                if (ertVar.l(9)) {
                    ertVar.h();
                    return;
                }
                return;
            }
            if (fyjVar2.i == view) {
                if (ertVar.l(7)) {
                    ertVar.i();
                    return;
                }
                return;
            }
            if (fyjVar2.l == view) {
                if (ertVar.w() != 4 && ertVar.l(12)) {
                    ertVar.g();
                    return;
                }
                return;
            }
            if (fyjVar2.m == view) {
                if (ertVar.l(11)) {
                    ertVar.f();
                    return;
                }
                return;
            }
            if (fyjVar2.k == view) {
                eul.aj(ertVar, fyjVar2.F);
                return;
            }
            int i = 1;
            if (fyjVar2.n == view) {
                if (ertVar.l(15)) {
                    int y = ertVar.y();
                    int i2 = 1;
                    while (true) {
                        if (i2 <= 2) {
                            int i3 = (y + i2) % 3;
                            if (i3 != 0) {
                                i2++;
                            } else {
                                y = i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    fad fadVar = (fad) ertVar;
                    fadVar.ag();
                    if (fadVar.l != y) {
                        fadVar.l = y;
                        fadVar.e.d.h(11, y, 0).f();
                        fadVar.f.d(8, new fbp(y, i));
                        fadVar.ad();
                        fadVar.f.c();
                        return;
                    }
                    return;
                }
                return;
            }
            if (fyjVar2.o == view) {
                if (ertVar.l(14)) {
                    boolean z = !ertVar.Q();
                    fad fadVar2 = (fad) ertVar;
                    fadVar2.ag();
                    if (fadVar2.m != z) {
                        fadVar2.m = z;
                        fadVar2.e.d.h(12, z ? 1 : 0, 0).f();
                        fadVar2.f.d(9, new ezy(z, i));
                        fadVar2.ad();
                        fadVar2.f.c();
                        return;
                    }
                    return;
                }
                return;
            }
            if (fyjVar2.s == view) {
                fyjVar2.a.h();
                fyj fyjVar3 = this.a;
                fyjVar3.a(fyjVar3.c, fyjVar3.s);
                return;
            }
            if (fyjVar2.t == view) {
                fyjVar2.a.h();
                fyj fyjVar4 = this.a;
                fyjVar4.a(fyjVar4.d, fyjVar4.t);
            } else if (fyjVar2.u == view) {
                fyjVar2.a.h();
                fyj fyjVar5 = this.a;
                fyjVar5.a(fyjVar5.f, fyjVar5.u);
            } else if (fyjVar2.p == view) {
                fyjVar2.a.h();
                fyj fyjVar6 = this.a;
                fyjVar6.a(fyjVar6.e, fyjVar6.p);
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        fyj fyjVar = this.a;
        if (fyjVar.I) {
            fyjVar.a.i();
        }
    }

    @Override // defpackage.err
    public final /* synthetic */ void eF() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eJ() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void z() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void a(eta etaVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eB(boolean z) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eC(int i) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eD(ern ernVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eE(ern ernVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eG(esg esgVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eH(esn esnVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void t(int i) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void y(erz erzVar) {
    }
}
