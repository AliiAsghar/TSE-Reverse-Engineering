package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpw extends acpq {
    public static final Optional x = Optional.empty();
    private final acpu y;

    public acpw(Context context) {
        ahtp.f(context);
        this.y = new acpu(new ahtn(ahsy.a("com.google.android.ims.library")).c("RcsFlags__").b().a());
    }

    @Override // defpackage.acpq
    public final acpp A() {
        return this.y.u;
    }

    @Override // defpackage.acpq
    public final acpp B() {
        return this.y.l;
    }

    @Override // defpackage.acpq
    public final acpp C() {
        return this.y.v;
    }

    @Override // defpackage.acpq
    public final acpp D() {
        return this.y.w;
    }

    @Override // defpackage.acpq
    public final apkb F() {
        aozy builder = super.F().toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apkb apkbVar = (apkb) builder.b;
        apkbVar.b |= 2;
        apkbVar.d = "com.google.android.ims.library";
        return (apkb) builder.s();
    }

    @Override // defpackage.acpq
    public final boolean K() {
        return true;
    }

    @Override // defpackage.acpq
    public final int L() {
        return 5;
    }

    @Override // defpackage.acpq
    public final acpp a() {
        return this.y.a;
    }

    @Override // defpackage.acpq
    public final acpp b() {
        return this.y.y;
    }

    @Override // defpackage.acpq
    public final acpp c() {
        return this.y.b;
    }

    @Override // defpackage.acpq
    public final acpp d() {
        return this.y.x;
    }

    @Override // defpackage.acpq
    public final acpp e() {
        return this.y.c;
    }

    @Override // defpackage.acpq
    public final acpp f() {
        return this.y.d;
    }

    @Override // defpackage.acpq
    public final acpp g() {
        return this.y.A;
    }

    @Override // defpackage.acpq
    public final acpp h() {
        return this.y.e;
    }

    @Override // defpackage.acpq
    public final acpp i() {
        return this.y.f;
    }

    @Override // defpackage.acpq
    public final acpp j() {
        return this.y.r;
    }

    @Override // defpackage.acpq
    public final acpp k() {
        return this.y.g;
    }

    @Override // defpackage.acpq
    public final acpp l() {
        return this.y.h;
    }

    @Override // defpackage.acpq
    public final acpp m() {
        return this.y.j;
    }

    @Override // defpackage.acpq
    public final acpp n() {
        return this.y.s;
    }

    @Override // defpackage.acpq
    public final acpp o() {
        return this.y.D;
    }

    @Override // defpackage.acpq
    public final acpp p() {
        return this.y.k;
    }

    @Override // defpackage.acpq
    public final acpp q() {
        return this.y.m;
    }

    @Override // defpackage.acpq
    public final acpp r() {
        return this.y.n;
    }

    @Override // defpackage.acpq
    public final acpp s() {
        return this.y.o;
    }

    @Override // defpackage.acpq
    public final acpp t() {
        return this.y.i;
    }

    @Override // defpackage.acpq
    public final acpp u() {
        return this.y.p;
    }

    @Override // defpackage.acpq
    public final acpp v() {
        return this.y.C;
    }

    @Override // defpackage.acpq
    public final acpp w() {
        return this.y.q;
    }

    @Override // defpackage.acpq
    public final acpp x() {
        return this.y.z;
    }

    @Override // defpackage.acpq
    public final acpp y() {
        return this.y.B;
    }

    @Override // defpackage.acpq
    public final acpp z() {
        return this.y.t;
    }
}
