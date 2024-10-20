package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.telephony.SmsManager;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykj implements ykb {
    private final ykb a;
    private volatile alhr b;
    private volatile alhr c;

    public ykj(ykb ykbVar) {
        this.a = ykbVar;
        this.b = albo.E(new yim(ykbVar, 13), Duration.ofSeconds(aczf.c()));
        this.c = albo.E(new yim(ykbVar, 14), Duration.ofSeconds(aczf.c()));
    }

    @Override // defpackage.ykb
    public final String A(Context context) {
        return this.a.A(context);
    }

    @Override // defpackage.ykb
    public final boolean B(int i) {
        return this.a.B(i);
    }

    @Override // defpackage.ykb
    public final boolean C() {
        return this.a.C();
    }

    @Override // defpackage.ykb
    public final boolean D() {
        return this.a.D();
    }

    @Override // defpackage.ykb
    public final boolean E() {
        return this.a.E();
    }

    @Override // defpackage.ykb
    public final boolean F() {
        return this.a.F();
    }

    @Override // defpackage.ykb
    public final boolean G() {
        return this.a.G();
    }

    @Override // defpackage.ykb
    public final int[] H() {
        return this.a.H();
    }

    @Override // defpackage.ykb
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.ykb
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.ykb
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.ykb
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.ykb
    public final int e() {
        return this.a.e();
    }

    @Override // defpackage.ykb
    public final Bitmap f(Context context) {
        return this.a.f(context);
    }

    @Override // defpackage.ykb
    public final SmsManager g() {
        return this.a.g();
    }

    @Override // defpackage.ykb
    public final msh h(String str) {
        return this.a.h(str);
    }

    @Override // defpackage.ykb
    public final Optional i() {
        return this.a.i();
    }

    @Override // defpackage.ykb
    public final Optional j(boolean z) {
        return this.a.j(z);
    }

    @Override // defpackage.ykb
    public final Optional k() {
        return this.a.k();
    }

    @Override // defpackage.ykb
    public final Optional l(boolean z) {
        return this.a.l(z);
    }

    @Override // defpackage.ykb
    public final Optional m() {
        return this.a.m();
    }

    @Override // defpackage.ykb
    public final CharSequence n() {
        return this.a.n();
    }

    @Override // defpackage.ykb
    public final CharSequence o() {
        return this.a.o();
    }

    @Override // defpackage.ykb
    public final String p() {
        return this.a.p();
    }

    @Override // defpackage.ykb
    public final String q() {
        return this.a.q();
    }

    @Override // defpackage.ykb
    public final String r() {
        alhr alhrVar = this.b;
        if (alhrVar == null) {
            arro.b("getNetworkCountry");
            alhrVar = null;
        }
        return (String) alhrVar.get();
    }

    @Override // defpackage.ykb
    public final String s() {
        return this.a.s();
    }

    @Override // defpackage.ykb
    public final String t() {
        return this.a.t();
    }

    @Override // defpackage.ykb
    public final String u() {
        alhr alhrVar = this.c;
        if (alhrVar == null) {
            arro.b("getSimCountry");
            alhrVar = null;
        }
        Object obj = alhrVar.get();
        obj.getClass();
        return (String) obj;
    }

    @Override // defpackage.ykb
    @armg
    public final String v(Locale locale) {
        return this.a.v(locale);
    }

    @Override // defpackage.ykb
    public final String w() {
        return this.a.w();
    }

    @Override // defpackage.ykb
    public final String x() {
        return this.a.x();
    }

    @Override // defpackage.ykb
    public final String y() {
        return this.a.y();
    }

    @Override // defpackage.ykb
    public final String z() {
        return this.a.z();
    }
}
