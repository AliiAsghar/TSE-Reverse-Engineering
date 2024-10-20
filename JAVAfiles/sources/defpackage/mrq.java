package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrq implements mre {
    public static final uuf a = uuh.i(uuh.b, "enable_error_for_unknown_destination_format", false);
    static final uuf b = uuh.i(uuh.b, "mi_normalizing_eagerly_calculates", false);
    static final uuf c = uuh.i(uuh.b, "legacy_uses_supplier", false);
    public static final alvi d = alvi.m("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3");
    public final apwt e;
    public final apwt f;
    public final apwt g;
    public final apwt h;
    private final apwt i;

    public mrq(apwt apwtVar, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5) {
        this.e = apwtVar;
        this.f = apwtVar2;
        this.g = apwtVar3;
        this.h = apwtVar4;
        this.i = apwtVar5;
    }

    private final alhr t(alhr alhrVar, alhr alhrVar2) {
        return albo.D(new mri(this, alhrVar, alhrVar2, 7));
    }

    private final alhr u(alhr alhrVar, alhr alhrVar2, alhr alhrVar3) {
        return albo.D(new mrf((Object) this, alhrVar, alhrVar2, alhrVar3, 8));
    }

    @Override // defpackage.mre
    public final msh a(String str) {
        return ((lxe) this.i.b()).j(new mrn(str, 0), new mrn(str, 2), new mrn(str, 3), new mrn(str, 4), new mrn(str, 5), albo.D(new mrl(this, str, 5)), new mrn(str, 6), new mrg(8), new mrg(9), new mrg(9));
    }

    @Override // defpackage.mre
    public final msh b(qei qeiVar) {
        boolean z;
        mrh mrhVar = new mrh(qeiVar, 5);
        alhr D = albo.D(new mrh(this, 6));
        qeh b2 = qeh.b(qeiVar.c);
        if (b2 == null) {
            b2 = qeh.UNKNOWN_TYPE;
        }
        if (b2 == qeh.BOT) {
            z = true;
        } else {
            z = false;
        }
        alhr p = p(mrhVar, z, D);
        alhr m = m(p, mrhVar, D, mrhVar);
        alhr r = r(m);
        alhr D2 = albo.D(new mrl(r, D, 2));
        alhr s = s(p, mrhVar, D2, m);
        return ((lxe) this.i.b()).j(mrhVar, mrhVar, u(p, mrhVar, D2), o(p, D2, mrhVar, s), s, q(p, mrhVar, D2), t(p, mrhVar), new mrh(p, 7), m, r);
    }

    @Override // defpackage.mre
    public final msh c(String str, alhr alhrVar) {
        yjr yjrVar = (yjr) this.g.b();
        int i = 4;
        alhr D = albo.D(new mrl(this, str, i));
        alhr p = p(D, false, new mrg(16));
        alhr l = l((String) D.get(), alhrVar, p);
        alhr D2 = albo.D(new mrl(this, l, 7));
        alhr p2 = p(D, false, l);
        alhr D3 = albo.D(new mrf((Object) this, D, yjrVar, p, 9));
        alhr D4 = albo.D(new mrl(yjrVar, D3, 8));
        alhr p3 = p(D, false, D3);
        mrf mrfVar = new mrf((Object) p3, p2, l, D3, 10);
        mri mriVar = new mri(mrfVar, p3, p2, i);
        mri mriVar2 = new mri(mrfVar, D3, l, 5);
        mri mriVar3 = new mri(mrfVar, D4, D2, 6);
        alhr s = s(mriVar, D, mriVar2, mriVar3);
        alhr o = o(mriVar, mriVar2, D, s);
        mrl mrlVar = new mrl(mriVar, mriVar3, 1);
        return ((lxe) this.i.b()).j(D, new mrh(str, 20), u(mriVar, D, mriVar2), o, s, q(mriVar, D, mriVar2), t(mriVar, o), new mrn(mriVar, 7), mrlVar, r(mrlVar));
    }

    @Override // defpackage.mre
    public final msh d(adit aditVar) {
        return c(aditVar.a, new mrg(9));
    }

    @Override // defpackage.mre
    public final msh e(String str, String str2, String str3, boolean z, String str4, alhr alhrVar) {
        String str5;
        String d2;
        String str6;
        msf msfVar;
        alhr alhrVar2;
        if (true == d.ao(str)) {
            str5 = str2;
        } else {
            str5 = str;
        }
        if (((Boolean) msw.c.e()).booleanValue()) {
            str3.getClass();
            str5.getClass();
            str4.getClass();
        }
        if (d.ao(str5)) {
            str6 = "ʼUNKNOWN_SENDER!ʼ";
            d2 = str6;
        } else {
            d2 = ((msx) this.e.b()).d(str5);
            str6 = str3;
        }
        if (d.ao(str6) && !d2.equals("ʼUNKNOWN_SENDER!ʼ")) {
            msfVar = new msf(((yjr) this.g.b()).j(d2));
        } else {
            msfVar = new msf(albo.ag(str6));
        }
        alhr p = p(new mrn(d2, 1), z, alhrVar);
        String ag = albo.ag(str2);
        if (true == d.ao(ag)) {
            ag = "ʼUNKNOWN_SENDER!ʼ";
        }
        if (((Boolean) new mss(13).get()).booleanValue()) {
            ag = (String) Optional.ofNullable(str2).filter(new mmd(8)).orElse("ʼUNKNOWN_SENDER!ʼ");
        }
        alhr p2 = p(new mrh(ag, 11), z, alhrVar);
        alhr m = m(p2, new mrh(ag, 12), alhrVar, new mrh(ag, 13));
        alhr r = r(m);
        alhr D = albo.D(new mrl(r, alhrVar, 3));
        alhr u = u(p2, new mrh(ag, 19), D);
        alhr s = s(p2, new mrh(ag, 14), D, m);
        alhr o = o(p2, D, new mrh(d2, 15), s);
        lxe lxeVar = (lxe) this.i.b();
        mrh mrhVar = new mrh(d2, 16);
        mrh mrhVar2 = new mrh(str4, 17);
        if (((Boolean) new mss(13).get()).booleanValue()) {
            alhrVar2 = new mrh(ag, 18);
        } else {
            alhrVar2 = o;
        }
        return lxeVar.j(mrhVar, mrhVar2, u, alhrVar2, s, q(p2, new mrh(ag, 8), D), new mrh(msfVar, 9), new mrh(p, 10), m, r);
    }

    @Override // defpackage.mre
    public final msh f() {
        return ((lxe) this.i.b()).j(new mrg(10), new mrg(11), new mrg(9), new mrg(12), new mrg(13), new mrg(9), new mrg(14), new mrg(15), new mrg(9), new mrg(9));
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
        mrm mrmVar = new mrm(this, mshVar, i, 0);
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
        mrl mrlVar = new mrl(this, mshVar, 0);
        if (((Boolean) c.e()).booleanValue()) {
            i = ((lxe) this.i.b()).h(mshVar, mrlVar);
        } else {
            i = ((lxe) this.i.b()).i(mshVar, (String) mrlVar.get());
        }
        if (((Boolean) b.e()).booleanValue()) {
            i.H();
        }
        return i;
    }

    public final alhr l(String str, alhr alhrVar, alhr alhrVar2) {
        return albo.D(new mrf((Object) this, alhrVar2, str, alhrVar, 6));
    }

    final alhr m(alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4) {
        return albo.D(new mrj(this, alhrVar, alhrVar2, alhrVar4, alhrVar3, 3));
    }

    public final alhr n(String str, String str2, boolean z) {
        return albo.D(new mma((Object) this, (Object) str, str2, z, 4));
    }

    final alhr o(alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4) {
        return albo.D(new mrj(this, alhrVar, alhrVar3, alhrVar2, alhrVar4, 5));
    }

    final alhr p(final alhr alhrVar, final boolean z, final alhr alhrVar2) {
        return albo.D(new alhr() { // from class: mro
            @Override // defpackage.alhr
            public final Object get() {
                msy msyVar;
                mrp mrpVar;
                msy msyVar2;
                String str = (String) alhrVar.get();
                alhr alhrVar3 = alhrVar2;
                if (z) {
                    return new mrp(str, msy.BOT, "", null, 0, null, null);
                }
                if (msx.g(str)) {
                    return new mrp(str, msy.EMAIL, "", null, 0, null, null);
                }
                if (!str.equals("ʼUNKNOWN_SENDER!ʼ") && !str.isEmpty()) {
                    if (!lgc.C(str) && !lgc.D(str)) {
                        mrq mrqVar = mrq.this;
                        if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && ((msx) mrqVar.e.b()).h(str)) {
                            return new mrp(str, msy.PENPAL_BOT, "", null, 0, null, null);
                        }
                        if (((yjr) mrqVar.g.b()).C(str)) {
                            return new mrp(str, msy.PHONE_E164, "", null, 0, null, null);
                        }
                        if (((msx) mrqVar.e.b()).j(str)) {
                            try {
                                String str2 = (String) alhrVar3.get();
                                aodz D = ((yjr) mrqVar.g.b()).D(str, str2);
                                int H = ((yjr) mrqVar.g.b()).H(D);
                                if (H == 4) {
                                    if (((yjr) mrqVar.g.b()).G(D)) {
                                        if (((msx) mrqVar.e.b()).k(str)) {
                                            msyVar2 = msy.PHONE_SHORT_WITH_COUNTRY;
                                        } else {
                                            msyVar2 = msy.PHONE_SHORT_NO_COUNTRY;
                                        }
                                        mrpVar = new mrp(str, msyVar2, str2, D, 4, str2, null);
                                        return mrpVar;
                                    }
                                    H = 4;
                                }
                                if (H == 1) {
                                    mrpVar = new mrp(str, msy.PHONE_NATIONAL, str2, D, 1, str2, null);
                                } else if (H == 2) {
                                    Optional c2 = ((yjr) mrqVar.g.b()).c(str);
                                    if (c2.isPresent()) {
                                        msyVar = msy.PHONE_LOCAL_WITH_COUNTRY;
                                    } else {
                                        msyVar = msy.PHONE_LOCAL_NO_COUNTRY;
                                    }
                                    mrpVar = new mrp(str, msyVar, str2, D, 2, null, (yjt) c2.orElse(null));
                                }
                                return mrpVar;
                            } catch (anhk e) {
                                if (!((Boolean) mrq.a.e()).booleanValue()) {
                                    return new mrp(str, msy.UNKNOWN_DESTINATION_TYPE, "", null, 0, null, null);
                                }
                                throw new IllegalStateException("Unknown destination format", e);
                            }
                        }
                        if (!((Boolean) mrq.a.e()).booleanValue()) {
                            return new mrp(str, msy.UNKNOWN_DESTINATION_TYPE, "", null, 0, null, null);
                        }
                        throw new IllegalStateException("Unknown destination format");
                    }
                    return new mrp(str, msy.SATELLITE_ESP, "", null, 0, null, null);
                }
                return new mrp(str, msy.UNKNOWN_SENDER, "", null, 0, null, null);
            }
        });
    }

    final alhr q(alhr alhrVar, alhr alhrVar2, alhr alhrVar3) {
        return albo.D(new mrf((Object) this, alhrVar, alhrVar2, alhrVar3, 7));
    }

    final alhr r(alhr alhrVar) {
        return albo.D(new mrl(this, alhrVar, 6));
    }

    final alhr s(alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4) {
        return albo.D(new mrj(this, alhrVar, alhrVar2, alhrVar4, alhrVar3, 4));
    }
}
