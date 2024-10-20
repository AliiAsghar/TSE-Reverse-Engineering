package defpackage;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ff implements hl {
    final /* synthetic */ fo a;
    private final hl b;

    public ff(fo foVar, hl hlVar) {
        this.a = foVar;
        this.b = hlVar;
    }

    @Override // defpackage.hl
    public final void a(hm hmVar) {
        hp hpVar = (hp) this.b;
        hpVar.a.onDestroyActionMode(hpVar.e(hmVar));
        fo foVar = this.a;
        if (foVar.t != null) {
            foVar.l.getDecorView().removeCallbacks(this.a.u);
        }
        fo foVar2 = this.a;
        if (foVar2.s != null) {
            foVar2.D();
            fo foVar3 = this.a;
            efu v = eek.v(foVar3.s);
            v.e(brg.a);
            foVar3.N = v;
            this.a.N.g(new fe(this));
        }
        fo foVar4 = this.a;
        ey eyVar = foVar4.n;
        if (eyVar != null) {
            eyVar.l(foVar4.r);
        }
        fo foVar5 = this.a;
        foVar5.r = null;
        edx.c(foVar5.x);
        this.a.H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hl
    public final boolean b(hm hmVar, MenuItem menuItem) {
        hp hpVar = (hp) this.b;
        return hpVar.a.onActionItemClicked(hpVar.e(hmVar), new ir(hpVar.b, menuItem));
    }

    @Override // defpackage.hl
    public final boolean c(hm hmVar, Menu menu) {
        hp hpVar = (hp) this.b;
        return hpVar.a.onCreateActionMode(hpVar.e(hmVar), hpVar.f(menu));
    }

    @Override // defpackage.hl
    public final void d(hm hmVar, Menu menu) {
        edx.c(this.a.x);
        hp hpVar = (hp) this.b;
        hpVar.a.onPrepareActionMode(hpVar.e(hmVar), hpVar.f(menu));
    }
}
