package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absi extends absb {
    public final to e;
    private final abso g;

    public absi(abst abstVar, abso absoVar) {
        super(abstVar, abqa.a);
        this.e = new to();
        this.g = absoVar;
        this.f.b(this);
    }

    @Override // defpackage.absb
    protected final void e(ConnectionResult connectionResult, int i) {
        this.g.e(connectionResult, i);
    }

    @Override // defpackage.absb
    protected final void f() {
        this.g.f();
    }

    @Override // defpackage.abss
    public final void h() {
        k();
    }

    @Override // defpackage.abss
    public final void i() {
        this.a = true;
        k();
    }

    @Override // defpackage.abss
    public final void j() {
        this.a = false;
        Object obj = abso.c;
        abso absoVar = this.g;
        synchronized (obj) {
            if (absoVar.m == this) {
                absoVar.m = null;
                absoVar.n.clear();
            }
        }
    }

    public final void k() {
        if (!this.e.isEmpty()) {
            this.g.g(this);
        }
    }
}
