package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdw implements cas {
    public final cas a;
    private final cas d;
    private final arvv e = new arvv();
    private final byn b = new byu(null, cav.a);
    private final byn c = new byu(null, cav.a);

    public hdw() {
        new bxd(new gqu(this, 14), null);
        this.d = new bxd(new gqu(this, 12), null);
        new bxd(new gqu(this, 13), null);
        this.a = new bxd(new gqu(this, 15), null);
    }

    @Override // defpackage.cas
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hbb a() {
        return (hbb) this.b.a();
    }

    public final Throwable c() {
        return (Throwable) this.c.a();
    }

    public final synchronized void d(hbb hbbVar) {
        hbbVar.getClass();
        if (f()) {
            return;
        }
        this.b.h(hbbVar);
        this.e.T(hbbVar);
    }

    public final synchronized void e(Throwable th) {
        if (f()) {
            return;
        }
        this.c.h(th);
        this.e.b(th);
    }

    public final boolean f() {
        return ((Boolean) this.d.a()).booleanValue();
    }
}
