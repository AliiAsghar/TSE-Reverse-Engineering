package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrk implements mre {
    public static final uuf a = uuh.i(uuh.b, "enable_error_for_unknown_destination_format", false);
    static final uuf b = uuh.i(uuh.b, "mi_normalizing_eagerly_calculates", false);
    static final uuf c = uuh.i(uuh.b, "legacy_uses_supplier", false);
    public static final xze d = xze.g("Bugle", "CsMessagingIdentityFactoryImpl");
    public final apwt e;
    public final apwt f;
    public final apwt g;
    public final apwt h;
    private final apwt i;

    public mrk(apwt apwtVar, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5) {
        this.e = apwtVar;
        this.f = apwtVar2;
        this.g = apwtVar3;
        this.h = apwtVar4;
        this.i = apwtVar5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String t(String str, String str2) {
        if (d.ao(str)) {
            return str2;
        }
        return str;
    }

    private final alhr u(alhr alhrVar, alhr alhrVar2) {
        return albo.D(new mri(this, alhrVar, alhrVar2, 0));
    }

    private final alhr v(alhr alhrVar, alhr alhrVar2, alhr alhrVar3) {
        return albo.D(new mrf((Object) this, alhrVar, alhrVar2, alhrVar3, 0));
    }

    @Override // defpackage.mre
    public final msh a(String str) {
        return ((lxe) this.i.b()).j(new mlz(str, 5), new mlz(str, 6), new mlz(str, 7), new mlz(str, 8), new mlz(str, 9), albo.D(new fgh(this, str, 14, null)), new mlz(str, 10), new ezq(20), new mrg(1), new mrg(1));
    }

    @Override // defpackage.mre
    public final msh b(qei qeiVar) {
        boolean z;
        mrh mrhVar = new mrh(qeiVar, 3);
        alhr D = albo.D(new mrh(this, 4));
        qeh b2 = qeh.b(qeiVar.c);
        if (b2 == null) {
            b2 = qeh.UNKNOWN_TYPE;
        }
        if (b2 == qeh.BOT) {
            z = true;
        } else {
            z = false;
        }
        alhr n = n(mrhVar, z, D);
        alhr m = m(n, mrhVar, D, mrhVar);
        alhr r = r(m);
        alhr D2 = albo.D(new fgh(r, D, 19, null));
        alhr s = s(n, mrhVar, D2, m);
        return ((lxe) this.i.b()).j(mrhVar, mrhVar, v(n, mrhVar, D2), p(n, D2, mrhVar, s), s, q(n, mrhVar, D2), u(n, mrhVar), n, m, r);
    }

    @Override // defpackage.mre
    public final msh c(String str, alhr alhrVar) {
        yjr yjrVar = (yjr) this.g.b();
        byte[] bArr = null;
        alhr D = albo.D(new fgh(this, str, 13, bArr));
        alhr n = n(D, false, new mrg(7));
        alhr l = l((String) D.get(), alhrVar, n);
        alhr D2 = albo.D(new fgh(this, l, 18, bArr));
        alhr n2 = n(D, false, l);
        alhr D3 = albo.D(new mrf((Object) this, D, yjrVar, n, 4));
        alhr D4 = albo.D(new fgh(yjrVar, D3, 20, bArr));
        alhr n3 = n(D, false, D3);
        mrf mrfVar = new mrf((Object) n3, n2, l, D3, 5);
        mri mriVar = new mri(mrfVar, n3, n2, 2);
        mri mriVar2 = new mri(mrfVar, D3, l, 3);
        mri mriVar3 = new mri(mrfVar, D4, D2, 1);
        alhr s = s(mriVar, D, mriVar2, mriVar3);
        alhr p = p(mriVar, mriVar2, D, s);
        fgh fghVar = new fgh(mriVar, mriVar3, 12, bArr);
        return ((lxe) this.i.b()).j(D, new mlz(str, 11), v(mriVar, D, mriVar2), p, s, q(mriVar, D, mriVar2), u(mriVar, p), mriVar, fghVar, r(fghVar));
    }

    @Override // defpackage.mre
    public final msh d(adit aditVar) {
        return c(aditVar.a, new mrg(1));
    }

    @Override // defpackage.mre
    public final msh e(String str, String str2, String str3, boolean z, String str4, alhr alhrVar) {
        String d2;
        String str5;
        msf msfVar;
        alhr alhrVar2;
        String t = t(str, str2);
        if (((Boolean) msw.c.e()).booleanValue()) {
            str3.getClass();
            t.getClass();
            str4.getClass();
        }
        if (d.ao(t)) {
            str5 = "ʼUNKNOWN_SENDER!ʼ";
            d2 = str5;
        } else {
            d2 = ((msx) this.e.b()).d(t);
            str5 = str3;
        }
        if (d.ao(str5) && !d2.equals("ʼUNKNOWN_SENDER!ʼ")) {
            msfVar = new msf(((yjr) this.g.b()).j(d2));
        } else {
            msfVar = new msf(albo.ag(str5));
        }
        alhr n = n(new mlz(d2, 4), z, alhrVar);
        String ag = albo.ag(str2);
        if (true == d.ao(ag)) {
            ag = "ʼUNKNOWN_SENDER!ʼ";
        }
        if (((Boolean) new mss(13).get()).booleanValue()) {
            ag = (String) Optional.ofNullable(str2).filter(new mmd(7)).orElse("ʼUNKNOWN_SENDER!ʼ");
        }
        alhr n2 = n(new mlz(ag, 15), z, alhrVar);
        alhr m = m(n2, new mlz(ag, 16), alhrVar, new mlz(ag, 17));
        alhr r = r(m);
        alhr D = albo.D(new fgh(r, alhrVar, 17, null));
        alhr v = v(n2, new mlz(ag, 12), D);
        alhr s = s(n2, new mlz(ag, 18), D, m);
        alhr p = p(n2, D, new mlz(d2, 19), s);
        lxe lxeVar = (lxe) this.i.b();
        mlz mlzVar = new mlz(d2, 20);
        mrh mrhVar = new mrh(str4, 1);
        if (((Boolean) new mss(13).get()).booleanValue()) {
            alhrVar2 = new mrh(ag, 0);
        } else {
            alhrVar2 = p;
        }
        return lxeVar.j(mlzVar, mrhVar, v, alhrVar2, s, q(n2, new mlz(ag, 13), D), new mlz(msfVar, 14), n, m, r);
    }

    @Override // defpackage.mre
    public final msh f() {
        return ((lxe) this.i.b()).j(new mrg(0), new mrg(2), new mrg(1), new mrg(3), new mrg(4), new mrg(1), new mrg(5), new mrg(6), new mrg(1), new mrg(1));
    }

    @Override // defpackage.mre
    public final msh g(msh mshVar, alhr alhrVar) {
        return ((lxe) this.i.b()).h(mshVar, alhrVar);
    }

    @Override // defpackage.mre
    public final msh h(msh mshVar, String str) {
        msg i = ((lxe) this.i.b()).i(mshVar, str);
        if (((Boolean) b.e()).booleanValue()) {
            i.H();
        }
        return i;
    }

    @Override // defpackage.mre
    public final msh i(msh mshVar, boolean z) {
        if (z) {
            return ((lxe) this.i.b()).i(mshVar, ((yjr) this.g.b()).j(mshVar.m()));
        }
        return mshVar;
    }

    @Override // defpackage.mre
    public final msh j(msh mshVar, int i) {
        msg i2;
        mrm mrmVar = new mrm(this, mshVar, i, 1);
        if (((Boolean) c.e()).booleanValue()) {
            i2 = ((lxe) this.i.b()).h(mshVar, mrmVar);
        } else {
            i2 = ((lxe) this.i.b()).i(mshVar, (String) mrmVar.get());
        }
        if (((Boolean) b.e()).booleanValue()) {
            i2.H();
        }
        return i2;
    }

    @Override // defpackage.mre
    public final msh k(msh mshVar) {
        msg i;
        fgh fghVar = new fgh(this, mshVar, 16, null);
        if (((Boolean) c.e()).booleanValue()) {
            i = ((lxe) this.i.b()).h(mshVar, fghVar);
        } else {
            i = ((lxe) this.i.b()).i(mshVar, (String) fghVar.get());
        }
        if (((Boolean) b.e()).booleanValue()) {
            i.H();
        }
        return i;
    }

    public final alhr l(String str, alhr alhrVar, alhr alhrVar2) {
        return albo.D(new mrf((Object) this, alhrVar2, str, alhrVar, 3));
    }

    final alhr m(alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4) {
        return albo.D(new mrj(this, alhrVar, alhrVar2, alhrVar4, alhrVar3, 1));
    }

    final alhr n(alhr alhrVar, boolean z, alhr alhrVar2) {
        return albo.D(new mma(this, z, alhrVar, alhrVar2, 2));
    }

    public final alhr o(String str, String str2, boolean z) {
        return albo.D(new mma((Object) this, (Object) str, str2, z, 3));
    }

    final alhr p(alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4) {
        return albo.D(new mrj(this, alhrVar, alhrVar3, alhrVar2, alhrVar4, 0));
    }

    final alhr q(alhr alhrVar, alhr alhrVar2, alhr alhrVar3) {
        return albo.D(new mrf((Object) this, alhrVar, alhrVar2, alhrVar3, 2));
    }

    final alhr r(alhr alhrVar) {
        return albo.D(new fgh(this, alhrVar, 15, null));
    }

    final alhr s(alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4) {
        return albo.D(new mrj(this, alhrVar, alhrVar2, alhrVar4, alhrVar3, 2));
    }
}
