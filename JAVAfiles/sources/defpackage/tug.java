package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tug implements trz {
    @Override // defpackage.trz
    public final int a(int i) {
        return (int) ((i - ((Integer) ((utz) ttd.u.get()).e()).intValue()) / ((Double) ((utz) ttd.v.get()).e()).doubleValue());
    }

    @Override // defpackage.trz
    public final int b() {
        return ((Integer) tte.b.e()).intValue();
    }

    @Override // defpackage.trz
    public final String c() {
        return (String) ttd.s.e();
    }

    @Override // defpackage.trz
    public final String d() {
        return (String) ttd.p.e();
    }

    @Override // defpackage.trz
    public final String e() {
        return (String) ttd.l.e();
    }

    @Override // defpackage.trz
    public final String f() {
        return (String) ttd.j.e();
    }

    @Override // defpackage.trz
    public final void g(int i) {
        tte.m = i;
    }

    @Override // defpackage.trz
    public final boolean h() {
        return ttd.e();
    }

    @Override // defpackage.trz
    public final boolean i() {
        return tte.h();
    }

    @Override // defpackage.trz
    public final boolean j() {
        if (tte.h() && ((Boolean) ((utz) tte.i.get()).e()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.trz
    public final boolean k() {
        if (!ttd.b() && !tte.h()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.trz
    public final boolean l() {
        if (((Boolean) ttd.o.e()).booleanValue() && ttd.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.trz
    public final boolean m() {
        return ttd.a();
    }

    @Override // defpackage.trz
    public final boolean n() {
        if (ttd.e()) {
            return true;
        }
        if (((Boolean) ttd.q.e()).booleanValue() && ttd.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.trz
    public final boolean o() {
        if (((Boolean) ttd.h.e()).booleanValue() && ttd.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.trz
    public final boolean p() {
        if (((Boolean) ttd.k.e()).booleanValue() && ttd.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.trz
    public final boolean q() {
        return ttd.f();
    }

    @Override // defpackage.trz
    public final boolean r() {
        return ttd.c();
    }

    @Override // defpackage.trz
    public final boolean s() {
        return ttd.a();
    }

    @Override // defpackage.trz
    public final boolean t() {
        return ttd.a();
    }

    @Override // defpackage.trz
    public final boolean u() {
        return ttd.a();
    }

    @Override // defpackage.trz
    public final boolean v() {
        if (ttd.a() && ((Boolean) ttd.w.e()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.trz
    public final boolean w() {
        if (((Boolean) ttd.i.e()).booleanValue() && ttd.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.trz
    public final int x(int i) {
        return Math.min(i, 8192);
    }

    @Override // defpackage.trz
    public final int y() {
        return tte.a(2, false);
    }
}
