package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdr implements cas {
    public final aff f;
    private final byn k;
    private final byn l;
    private final byn m;
    private final cas n;
    private final byn g = new byu(false, cav.a);
    private final byn h = new byu(1, cav.a);
    public final byn a = new byu(1, cav.a);
    public final byn b = new byu(false, cav.a);
    public final byn c = new byu(null, cav.a);
    public final byn d = new byu(Float.valueOf(1.0f), cav.a);
    public final byn e = new byu(false, cav.a);
    private final cas i = new bxd(new gqu(this, 9), null);
    private final byn j = new byu(null, cav.a);

    public hdr() {
        Float valueOf = Float.valueOf(brg.a);
        this.k = new byu(valueOf, cav.a);
        this.l = new byu(valueOf, cav.a);
        this.m = new byu(Long.MIN_VALUE, cav.a);
        this.n = new bxd(new gqu(this, 8), null);
        new bxd(new gqu(this, 10), null);
        this.f = new aff();
    }

    private final float o() {
        return ((Number) this.i.a()).floatValue();
    }

    private final float p() {
        return ((Number) this.k.a()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(long j) {
        this.m.h(Long.valueOf(j));
    }

    @Override // defpackage.cas
    public final /* bridge */ /* synthetic */ Object a() {
        return Float.valueOf(c());
    }

    public final float b() {
        return ((Number) this.n.a()).floatValue();
    }

    public final float c() {
        return ((Number) this.l.a()).floatValue();
    }

    public final float d() {
        return ((Number) this.d.a()).floatValue();
    }

    public final int e() {
        return ((Number) this.h.a()).intValue();
    }

    public final long f() {
        return ((Number) this.m.a()).longValue();
    }

    public final hbb g() {
        return (hbb) this.j.a();
    }

    public final hdv h() {
        return (hdv) this.c.a();
    }

    public final void i(hbb hbbVar) {
        this.j.h(hbbVar);
    }

    public final void j(int i) {
        this.h.h(Integer.valueOf(i));
    }

    public final void k(boolean z) {
        this.g.h(Boolean.valueOf(z));
    }

    public final void l(float f) {
        hbb g;
        this.k.h(Float.valueOf(f));
        if (((Boolean) this.e.a()).booleanValue() && (g = g()) != null) {
            f -= f % (1.0f / g.k);
        }
        this.l.h(Float.valueOf(f));
    }

    public final boolean m(int i, long j) {
        long f;
        float f2;
        float f3;
        float p;
        float f4;
        hbb g = g();
        if (g != null) {
            if (f() == Long.MIN_VALUE) {
                f = 0;
            } else {
                f = j - f();
            }
            q(j);
            if (h() != null) {
                f2 = hdv.b(g);
            } else {
                f2 = 0.0f;
            }
            if (h() != null) {
                f3 = hdv.a(g);
            } else {
                f3 = 1.0f;
            }
            float a = (((float) (f / 1000000)) / g.a()) * o();
            if (o() < brg.a) {
                p = f2 - (p() + a);
            } else {
                p = (p() + a) - f3;
            }
            if (p < brg.a) {
                l(arrn.q(p(), f2, f3) + a);
                return true;
            }
            float f5 = f3 - f2;
            int i2 = (int) (p / f5);
            int i3 = i2 + 1;
            if (e() + i3 > i) {
                l(b());
                j(i);
                return false;
            }
            j(e() + i3);
            float f6 = p - (i2 * f5);
            if (o() < brg.a) {
                f4 = f3 - f6;
            } else {
                f4 = f2 + f6;
            }
            l(f4);
            return true;
        }
        return true;
    }
}
