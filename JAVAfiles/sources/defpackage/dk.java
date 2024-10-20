package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dk {
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    String l;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList q;
    ArrayList r;
    ArrayList t;
    final ArrayList d = new ArrayList();
    boolean k = true;
    boolean s = false;

    @Deprecated
    public dk() {
    }

    public final void A(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.g = 0;
        this.h = 0;
    }

    public abstract void b();

    public abstract void c();

    public void d(int i, cg cgVar, String str, int i2) {
        throw null;
    }

    public boolean h() {
        throw null;
    }

    public abstract void i();

    public abstract void j();

    public void k(cg cgVar) {
        throw null;
    }

    public void l(cg cgVar) {
        throw null;
    }

    public void n(cg cgVar) {
        throw null;
    }

    public void o(cg cgVar, eng engVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(dj djVar) {
        this.d.add(djVar);
        djVar.d = this.e;
        djVar.e = this.f;
        djVar.f = this.g;
        djVar.g = this.h;
    }

    public final void q(int i, cg cgVar) {
        d(i, cgVar, null, 1);
    }

    public final void r(int i, cg cgVar, String str) {
        d(i, cgVar, str, 1);
    }

    public final void s(cg cgVar, String str) {
        d(0, cgVar, str, 1);
    }

    public final void t(String str) {
        if (this.k) {
            this.j = true;
            this.l = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void u() {
        if (!this.j) {
            this.k = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void v(int i, cg cgVar, String str) {
        if (i != 0) {
            d(i, cgVar, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final void w(Runnable runnable) {
        x(false, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(boolean z, Runnable runnable) {
        if (!z) {
            u();
        }
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(runnable);
    }

    public final void y() {
        this.s = true;
    }

    public final void z(int i, cg cgVar) {
        v(i, cgVar, null);
    }

    public dk(byte[] bArr) {
    }
}
