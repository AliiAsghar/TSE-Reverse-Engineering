package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aklf extends aiuc implements akrw {
    protected final akqf c = new akqf(this);

    @Override // defpackage.aiuc, defpackage.cg
    public View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.c();
        try {
            View K = super.K(layoutInflater, viewGroup, bundle);
            akqj.p();
            return K;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void W(Bundle bundle) {
        this.c.c();
        try {
            super.W(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void X(int i, int i2, Intent intent) {
        aksa f = this.c.f();
        try {
            super.X(i, i2, intent);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public boolean aC(MenuItem menuItem) {
        aksa j = this.c.j();
        try {
            boolean aC = super.aC(menuItem);
            j.close();
            return aC;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void aH(int i, int i2) {
        this.c.h(i, i2);
        akqj.p();
    }

    public final View aM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.K(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aN(Bundle bundle) {
        super.W(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aO(int i, int i2, Intent intent) {
        super.X(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aP(Bundle bundle) {
        super.g(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aQ() {
        super.aa();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aT() {
        super.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aV() {
        super.i();
    }

    public aktr aW() {
        throw null;
    }

    public void aY(aktr aktrVar, boolean z) {
        throw null;
    }

    public void aZ(aktr aktrVar) {
        throw null;
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void aa() {
        aksa b = this.c.b();
        try {
            super.aa();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void ad() {
        this.c.c();
        try {
            super.ad();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void af() {
        aksa b = this.c.b();
        try {
            super.af();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void ag(View view, Bundle bundle) {
        this.c.c();
        try {
            super.ag(view, bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ba() {
        super.ad();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bb() {
        super.af();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bc(Bundle bundle) {
        super.j(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bd() {
        super.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void be() {
        super.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bf(View view, Bundle bundle) {
        super.ag(view, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bg(MenuItem menuItem) {
        super.aC(menuItem);
    }

    @Override // defpackage.cg
    public void f(Context context) {
        super.f(context);
        eoz eozVar = this.E;
        if (eozVar instanceof akrw) {
            akqf akqfVar = this.c;
            if (akqfVar.a == null) {
                akqfVar.e(((akrw) eozVar).aW(), true);
            }
        }
        this.c.d();
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void g(Bundle bundle) {
        this.c.c();
        try {
            super.g(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void h() {
        aksa b = this.c.b();
        try {
            super.h();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void j(Bundle bundle) {
        this.c.c();
        try {
            super.j(bundle);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void k() {
        this.c.c();
        try {
            super.k();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void l() {
        this.c.c();
        try {
            super.l();
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final Animator w(int i, boolean z, int i2) {
        akqj.j();
        if (i != 0 || i2 != 0) {
            this.c.e(aktr.b(), true);
        }
        akqj.p();
        return null;
    }
}
