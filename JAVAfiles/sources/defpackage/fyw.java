package defpackage;

import android.view.View;
import androidx.media3.ui.SubtitleView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyw implements View.OnClickListener, err {
    final /* synthetic */ fyx a;
    private final erx b = new erx();
    private Object c;

    public fyw(fyx fyxVar) {
        this.a = fyxVar;
    }

    @Override // defpackage.err
    public final void a(eta etaVar) {
        SubtitleView subtitleView = this.a.f;
        if (subtitleView != null) {
            subtitleView.a(etaVar.b);
        }
    }

    @Override // defpackage.err
    public final void eC(int i) {
        this.a.i();
        this.a.l();
        this.a.k();
    }

    @Override // defpackage.err
    public final void eF() {
        View view = this.a.c;
        if (view != null) {
            view.setVisibility(4);
            if (this.a.o()) {
                this.a.d();
            } else {
                this.a.b();
            }
        }
    }

    @Override // defpackage.err
    public final void eG(esg esgVar) {
        erz erzVar;
        ert ertVar = this.a.l;
        dzg.g(ertVar);
        if (ertVar.l(17)) {
            erzVar = ertVar.H();
        } else {
            erzVar = erz.a;
        }
        if (erzVar.q()) {
            this.c = null;
        } else if (ertVar.l(30) && !ertVar.J().a()) {
            this.c = erzVar.d(ertVar.v(), this.b, true).b;
        } else {
            Object obj = this.c;
            if (obj != null) {
                int a = erzVar.a(obj);
                if (a != -1) {
                    if (ertVar.u() == erzVar.n(a, this.b).c) {
                        return;
                    }
                }
                this.c = null;
            }
        }
        this.a.m(false);
    }

    @Override // defpackage.err
    public final void eH(esn esnVar) {
        ert ertVar;
        if (!esnVar.equals(esn.a) && (ertVar = this.a.l) != null && ertVar.w() != 1) {
            this.a.h();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g();
    }

    @Override // defpackage.err
    public final void p() {
        this.a.i();
        this.a.k();
    }

    @Override // defpackage.err
    public final void t(int i) {
        if (this.a.q()) {
            fyx fyxVar = this.a;
            if (fyxVar.n) {
                fyxVar.c();
            }
        }
    }

    @Override // defpackage.err
    public final void x() {
        int i = eul.a;
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
    public final /* synthetic */ void z() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eB(boolean z) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eD(ern ernVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eE(ern ernVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eI(erq erqVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void y(erz erzVar) {
    }
}
