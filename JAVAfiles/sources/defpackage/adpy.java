package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpy implements adqa {
    private final adpu a;

    public adpy(adpu adpuVar) {
        this.a = adpuVar;
    }

    private final adpo c() {
        adpo b = this.a.b();
        b.e(true);
        b.q(true);
        b.n(true);
        b.f(true);
        b.j(true);
        b.k(true);
        b.m(true);
        b.Q();
        b.P();
        b.R();
        b.S();
        b.T();
        b.p(true);
        b.r(true);
        return b;
    }

    @Override // defpackage.adqa
    public final adpo a() {
        return c();
    }

    @Override // defpackage.adqa
    public final adpo b() {
        adpo c = c();
        c.n(false);
        return c;
    }
}
