package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrw implements mre {
    public final apwt a;
    public final apwt b;
    public final apwt c;
    public final apwt d;
    private final apwt e;
    private final apwt f;
    private final apwt g;

    public mrw(apwt apwtVar, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5, apwt apwtVar6, apwt apwtVar7) {
        this.a = apwtVar;
        this.b = apwtVar2;
        this.c = apwtVar3;
        this.d = apwtVar4;
        this.e = apwtVar5;
        this.f = apwtVar6;
        this.g = apwtVar7;
    }

    public static boolean A(aodz aodzVar) {
        if (aodzVar.g() && aodzVar.h() != 5 && ((aosw) aodzVar.a).h.startsWith("+")) {
            return true;
        }
        return false;
    }

    private final msh B(msh mshVar, String str, boolean z) {
        msg h = ((lxe) this.f.b()).h(mshVar, new mma((Object) this, (Object) mshVar, str, z, 5));
        h.H();
        return h;
    }

    private final alhr C(alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4) {
        return albo.D(new mrf((Object) this, alhrVar2, alhrVar, alhrVar3, 12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String t(String str, String str2) {
        if (d.ao(str)) {
            return str2;
        }
        return str;
    }

    @Override // defpackage.mre
    public final msh a(String str) {
        return ((lxe) this.f.b()).j(new mrt(str, 0), new mrt(str, 3), new mrt(str, 4), new mrt(str, 5), new mrt(str, 6), albo.D(new mrl(this, str, 11)), new mrt(str, 7), new mrs(3), new mrg(17), new mrg(17));
    }

    @Override // defpackage.mre
    public final msh b(qei qeiVar) {
        qeh qehVar = qeh.BOT;
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        if (qehVar.equals(b)) {
            return a(qeiVar.d);
        }
        return c(qeiVar.d, new mrg(17));
    }

    @Override // defpackage.mre
    public final msh c(String str, alhr alhrVar) {
        mrl mrlVar = new mrl(this, str, 9);
        alhr m = m(new mrn(str, 17), false);
        alhr s = s(new mrn(str, 20), alhrVar, m);
        y();
        alhr n = n(m, s);
        alhr r = r(n, s);
        alhr C = C(m, new mrt(str, 2), s, n);
        return ((lxe) this.f.b()).j(albo.D(new mrj(this, new mrn(str, 19), m, s, mrlVar, 9)), new mrt(str, 9), o(m, str, s, C), p(m, str, mrlVar, s), C, q(m, str, s, C), albo.D(new mrj(this, m, str, s, mrlVar, 6)), l(m, new mrt(str, 8), s), n, r);
    }

    @Override // defpackage.mre
    public final msh d(adit aditVar) {
        return c(aditVar.a, new mrg(17));
    }

    @Override // defpackage.mre
    public final msh e(String str, String str2, String str3, boolean z, String str4, alhr alhrVar) {
        String d;
        String str5;
        msf msfVar;
        String t = t(str, str2);
        if (((Boolean) msw.c.e()).booleanValue()) {
            str3.getClass();
            t.getClass();
            str4.getClass();
        }
        if (d.ao(t)) {
            str5 = "ʼUNKNOWN_SENDER!ʼ";
            d = str5;
        } else {
            d = ((msx) this.a.b()).d(t);
            str5 = str3;
        }
        if (d.ao(str5) && !d.equals("ʼUNKNOWN_SENDER!ʼ")) {
            msfVar = new msf(((yjr) this.b.b()).j(d));
        } else {
            msfVar = new msf(albo.ag(str5));
        }
        alhr m = m(new mrn(d, 18), z);
        String str6 = (String) Optional.ofNullable(str2).filter(new mmd(9)).orElse("ʼUNKNOWN_SENDER!ʼ");
        alhr m2 = m(new mrn(str6, 9), z);
        alhr s = s(new mrn(str6, 10), new mrn(alhrVar, 11), m2);
        y();
        alhr n = n(m2, s);
        alhr r = r(n, s);
        alhr C = C(m2, new mrt(str6, 1), s, n);
        alhr o = o(m2, str6, s, C);
        alhr p = p(m2, str6, new mrn(str6, 12), s);
        alhr s2 = s(new mrn(d, 13), new mrn(alhrVar, 14), m);
        lxe lxeVar = (lxe) this.f.b();
        mrn mrnVar = new mrn(d, 15);
        alhr alhrVar2 = p;
        mrn mrnVar2 = new mrn(str4, 16);
        if (((Boolean) new mss(13).get()).booleanValue()) {
            alhrVar2 = new mrt(str6, 10);
        }
        return lxeVar.j(mrnVar, mrnVar2, o, alhrVar2, C, q(m2, str6, s, C), new mrt(msfVar, 11), l(m, new mrt(d, 12), s2), n, r);
    }

    @Override // defpackage.mre
    public final msh f() {
        return ((lxe) this.f.b()).j(new mrg(18), new mrg(19), new mrg(17), new mrg(20), new mrs(1), new mrg(17), new mrs(0), new mrs(2), new mrg(17), new mrg(17));
    }

    @Override // defpackage.mre
    public final msh g(msh mshVar, alhr alhrVar) {
        return ((lxe) this.f.b()).h(mshVar, alhrVar);
    }

    @Override // defpackage.mre
    public final msh h(msh mshVar, String str) {
        return ((lxe) this.f.b()).i(mshVar, str);
    }

    @Override // defpackage.mre
    public final msh i(msh mshVar, boolean z) {
        if (z) {
            return ((lxe) this.f.b()).h(mshVar, new mrl(this, mshVar, 10));
        }
        return mshVar;
    }

    @Override // defpackage.mre
    public final msh j(msh mshVar, int i) {
        return B(mshVar, ((yjs) this.e.b()).b(i), false);
    }

    @Override // defpackage.mre
    public final msh k(msh mshVar) {
        return B(mshVar, ((yjr) this.b.b()).m(), true);
    }

    final alhr l(alhr alhrVar, alhr alhrVar2, alhr alhrVar3) {
        return albo.D(new mrf((Object) this, alhrVar2, alhrVar, alhrVar3, 11));
    }

    final alhr m(alhr alhrVar, boolean z) {
        return albo.D(new mry(this, z, alhrVar, 1));
    }

    final alhr n(alhr alhrVar, alhr alhrVar2) {
        return albo.D(new mri(this, alhrVar, alhrVar2, 8));
    }

    final alhr o(alhr alhrVar, String str, alhr alhrVar2, alhr alhrVar3) {
        return albo.D(new mrj(this, str, alhrVar, alhrVar2, alhrVar3, 7));
    }

    final alhr p(alhr alhrVar, String str, alhr alhrVar2, alhr alhrVar3) {
        return albo.D(new mrj(this, str, alhrVar, alhrVar3, alhrVar2, 10));
    }

    final alhr q(alhr alhrVar, String str, alhr alhrVar2, alhr alhrVar3) {
        return albo.D(new mrj(this, str, alhrVar, alhrVar2, alhrVar3, 8));
    }

    final alhr r(alhr alhrVar, alhr alhrVar2) {
        return albo.D(new mri(this, alhrVar, alhrVar2, 9));
    }

    final alhr s(alhr alhrVar, alhr alhrVar2, alhr alhrVar3) {
        return albo.D(new mrf((Object) this, alhrVar3, alhrVar, alhrVar2, 13));
    }

    public final boolean u(mrv mrvVar) {
        z();
        if (((yjr) this.b.b()).G(mrvVar.b)) {
            return true;
        }
        return false;
    }

    public final boolean v(mrv mrvVar) {
        z();
        if (u(mrvVar) && mrvVar.a == 4) {
            return true;
        }
        return false;
    }

    public final mrv w(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            aodz D = ((yjr) this.b.b()).D(str, str2);
            int H = ((yjr) this.b.b()).H(D);
            z();
            return new mrv(D, H, str2);
        } catch (anhk unused) {
            return null;
        }
    }

    public final msf x(String str) {
        y();
        return new msf(str);
    }

    public final void y() {
        ((msd) this.g.b()).c();
    }

    public final void z() {
        ((msd) this.g.b()).d();
    }
}
