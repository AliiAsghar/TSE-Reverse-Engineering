package defpackage;

import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.EnumSet;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qco {
    public final armf b;
    public final vzh c;
    public final umz d;
    public final armf e;
    public final hgj f;
    public final hgj g;
    public final hgj h;
    public final hmk i;
    public final hmk j;
    public final hmk k;
    private final armf m;
    private final armf n;
    private final lzz o;
    private final armf p;
    private final anen q;
    private final anen r;
    private final armf s;
    private final armf t;
    private final armf u;
    private final pvw v;
    private static final xze l = xze.g("BugleDataModel", "IncomingChatApiImpl");
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl");

    public qco(armf armfVar, armf armfVar2, hmk hmkVar, hmk hmkVar2, armf armfVar3, hmk hmkVar3, hgj hgjVar, hgj hgjVar2, hgj hgjVar3, lzz lzzVar, armf armfVar4, anen anenVar, anen anenVar2, vzh vzhVar, pvw pvwVar, umz umzVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        this.m = armfVar;
        this.b = armfVar2;
        this.j = hmkVar;
        this.i = hmkVar2;
        this.n = armfVar3;
        this.k = hmkVar3;
        this.h = hgjVar;
        this.f = hgjVar2;
        this.g = hgjVar3;
        this.o = lzzVar;
        this.p = armfVar4;
        this.q = anenVar;
        this.r = anenVar2;
        this.c = vzhVar;
        this.v = pvwVar;
        this.d = umzVar;
        this.e = armfVar5;
        this.s = armfVar6;
        this.t = armfVar7;
        this.u = armfVar8;
    }

    public static akul l(unz unzVar) {
        return unzVar.a().h(new psf(16), andi.a);
    }

    private static Optional m(apbt apbtVar, aozb aozbVar) {
        try {
            return Optional.of(apbtVar.getParserForType().e(aozbVar, aozs.a()));
        } catch (apba unused) {
            return Optional.empty();
        }
    }

    private static boolean n(qei qeiVar) {
        qeh qehVar = qeh.GROUP;
        qeh b = qeh.b(qeiVar.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        if (qehVar.equals(b) && !qeiVar.d.startsWith("sip:")) {
            return false;
        }
        return true;
    }

    public final uta a(String str) {
        return new uta(Long.toString(this.o.b(str)), null, null, null, null, null);
    }

    public final akul b(qed qedVar) {
        Optional m = m(qeb.a, qedVar.d);
        if (m.isEmpty()) {
            l.q("Invalid opaque data in AddUserToGroupChatResponse");
            ((vti) this.t.b()).c();
            aozy createBuilder = qeg.a.createBuilder();
            qef qefVar = qef.FAILED_PERMANENTLY;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeg qegVar = (qeg) createBuilder.b;
            qegVar.c = qefVar.f;
            qegVar.b |= 1;
            return aktp.ag((qeg) createBuilder.s());
        }
        return aktp.aj(new ncx(this, qedVar, m, 5), this.q);
    }

    public final akul c(qeo qeoVar) {
        Optional m = m(qem.a, qeoVar.e);
        if (m.isEmpty()) {
            l.q("Invalid opaque data in CreateGroupChatResponse");
            ((vti) this.t.b()).e();
            aozy createBuilder = qeg.a.createBuilder();
            qef qefVar = qef.FAILED_PERMANENTLY;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeg qegVar = (qeg) createBuilder.b;
            qegVar.c = qefVar.f;
            qegVar.b |= 1;
            return aktp.ag((qeg) createBuilder.s());
        }
        return aktp.aj(new ncx(this, qeoVar, m, 7), this.q);
    }

    public final akul d(qey qeyVar) {
        akul aj;
        akrh e = aktp.e("IncomingChatApiImpl#onGroupEventNotification");
        try {
            qei qeiVar = qeyVar.n;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            if (!n(qeiVar)) {
                xyo e2 = l.e();
                e2.H("Invalid group destination");
                e2.f(qeyVar.e);
                e2.q();
                aozy createBuilder = qeg.a.createBuilder();
                qef qefVar = qef.FAILED_PERMANENTLY;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qeg qegVar = (qeg) createBuilder.b;
                qegVar.c = qefVar.f;
                qegVar.b |= 1;
                aj = aktp.ag((qeg) createBuilder.s());
            } else {
                aj = aktp.aj(new imi(this, qeyVar, 9), this.q);
            }
            e.b(aj);
            e.close();
            return aj;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul e(qez qezVar) {
        akul aj;
        akrh e = aktp.e("IncomingChatApiImpl#onGroupFullStateNotification");
        try {
            qei qeiVar = qezVar.e;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            if (!n(qeiVar)) {
                xyo e2 = l.e();
                e2.H("Invalid group destination");
                e2.f(qezVar.d);
                e2.q();
                aozy createBuilder = qeg.a.createBuilder();
                qef qefVar = qef.FAILED_PERMANENTLY;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qeg qegVar = (qeg) createBuilder.b;
                qegVar.c = qefVar.f;
                qegVar.b |= 1;
                aj = aktp.ag((qeg) createBuilder.s());
            } else {
                aj = aktp.aj(new imi(this, qezVar, 8), this.q);
            }
            e.b(aj);
            e.close();
            return aj;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [arwe, java.lang.Object] */
    public final akul f(qfo qfoVar) {
        akul h;
        akrh e = aktp.e("IncomingChatApiImpl#onIncomingMessage");
        try {
            qei qeiVar = qfoVar.e;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            if (!n(qeiVar)) {
                alvw i = a.i();
                i.X(alwp.a, "BugleDataModel");
                alvg alvgVar = (alvg) i;
                alvgVar.X(ydl.e, qfoVar.g);
                alvgVar.X(ydl.p, ruy.b(qfoVar.h));
                alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "onIncomingMessageInSpan", 182, "IncomingChatApiImpl.java");
                qei qeiVar2 = qfoVar.e;
                if (qeiVar2 == null) {
                    qeiVar2 = qei.a;
                }
                qeh b = qeh.b(qeiVar2.c);
                if (b == null) {
                    b = qeh.UNKNOWN_TYPE;
                }
                alvgVar2.t("Invalid destination for endpoint type: %s", b.name());
                qya qyaVar = (qya) this.p.b();
                aozy createBuilder = amxb.a.createBuilder();
                aozy createBuilder2 = amxc.a.createBuilder();
                amwy amwyVar = amwy.CHAT_API_FAILED_PERMANENTLY;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                amxc amxcVar = (amxc) apagVar;
                amxcVar.f = amwyVar.f;
                amxcVar.b |= 16;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                amxc amxcVar2 = (amxc) createBuilder2.b;
                amxcVar2.g = 2;
                amxcVar2.b |= 32;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amxb amxbVar = (amxb) createBuilder.b;
                amxc amxcVar3 = (amxc) createBuilder2.s();
                amxcVar3.getClass();
                amxbVar.c = amxcVar3;
                amxbVar.b |= 1;
                qyaVar.q(qfoVar, (amxb) createBuilder.s());
                aozy createBuilder3 = qeg.a.createBuilder();
                qef qefVar = qef.FAILED_PERMANENTLY;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qeg qegVar = (qeg) createBuilder3.b;
                qegVar.c = qefVar.f;
                qegVar.b |= 1;
                h = aktp.ag((qeg) createBuilder3.s());
            } else {
                qei qeiVar3 = qfoVar.f;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                if (!((yjr) this.m.b()).A(qeiVar3.d)) {
                    alvw i2 = a.i();
                    i2.X(alwp.a, "BugleDataModel");
                    alvg alvgVar3 = (alvg) i2;
                    alvgVar3.X(ydl.e, qfoVar.g);
                    alvgVar3.X(ydl.p, ruy.b(qfoVar.h));
                    alvg alvgVar4 = (alvg) alvgVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "onIncomingMessageInSpan", 195, "IncomingChatApiImpl.java");
                    qei qeiVar4 = qfoVar.f;
                    if (qeiVar4 == null) {
                        qeiVar4 = qei.a;
                    }
                    qeh b2 = qeh.b(qeiVar4.c);
                    if (b2 == null) {
                        b2 = qeh.UNKNOWN_TYPE;
                    }
                    String name = b2.name();
                    qei qeiVar5 = qfoVar.f;
                    if (qeiVar5 == null) {
                        qeiVar5 = qei.a;
                    }
                    alvgVar4.D("Invalid selfChatEndpoint for receiverType: %s, receiverId: %s", name, qeiVar5.d);
                    qya qyaVar2 = (qya) this.p.b();
                    aozy createBuilder4 = amxb.a.createBuilder();
                    aozy createBuilder5 = amxc.a.createBuilder();
                    amwy amwyVar2 = amwy.CHAT_API_FAILED_PERMANENTLY;
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    apag apagVar2 = createBuilder5.b;
                    amxc amxcVar4 = (amxc) apagVar2;
                    amxcVar4.f = amwyVar2.f;
                    amxcVar4.b |= 16;
                    if (!apagVar2.isMutable()) {
                        createBuilder5.u();
                    }
                    amxc amxcVar5 = (amxc) createBuilder5.b;
                    amxcVar5.g = 8;
                    amxcVar5.b |= 32;
                    if (!createBuilder4.b.isMutable()) {
                        createBuilder4.u();
                    }
                    amxb amxbVar2 = (amxb) createBuilder4.b;
                    amxc amxcVar6 = (amxc) createBuilder5.s();
                    amxcVar6.getClass();
                    amxbVar2.c = amxcVar6;
                    amxbVar2.b |= 1;
                    qyaVar2.q(qfoVar, (amxb) createBuilder4.s());
                    aozy createBuilder6 = qeg.a.createBuilder();
                    qef qefVar2 = qef.FAILED_PERMANENTLY;
                    if (!createBuilder6.b.isMutable()) {
                        createBuilder6.u();
                    }
                    qeg qegVar2 = (qeg) createBuilder6.b;
                    qegVar2.c = qefVar2.f;
                    qegVar2.b |= 1;
                    h = aktp.ag((qeg) createBuilder6.s());
                } else {
                    qya qyaVar3 = (qya) this.p.b();
                    amgl amglVar = (amgl) amgu.a.createBuilder();
                    String str = qfoVar.g;
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar = (amgu) amglVar.b;
                    str.getClass();
                    amguVar.b |= Integer.MIN_VALUE;
                    amguVar.H = str;
                    amgu amguVar2 = qfoVar.l;
                    if (amguVar2 == null) {
                        amguVar2 = amgu.a;
                    }
                    amxo b3 = amxo.b(amguVar2.aa);
                    if (b3 == null) {
                        b3 = amxo.UNKNOWN_RCS_TYPE;
                    }
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar3 = (amgu) amglVar.b;
                    amguVar3.aa = b3.h;
                    amguVar3.c |= 2097152;
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar4 = (amgu) amglVar.b;
                    amguVar4.g = 8;
                    amguVar4.b |= 1;
                    if (!amglVar.b.isMutable()) {
                        amglVar.u();
                    }
                    amgu amguVar5 = (amgu) amglVar.b;
                    amguVar5.h = 2;
                    amguVar5.b |= 2;
                    qyaVar3.s((amgu) amglVar.s());
                    qeh qehVar = qeh.BOT;
                    qei qeiVar6 = qfoVar.d;
                    if (qeiVar6 == null) {
                        qeiVar6 = qei.a;
                    }
                    qeh b4 = qeh.b(qeiVar6.c);
                    if (b4 == null) {
                        b4 = qeh.UNKNOWN_TYPE;
                    }
                    int i3 = 18;
                    if (qehVar == b4) {
                        kkg kkgVar = (kkg) this.u.b();
                        qfoVar.getClass();
                        h = qjh.i(kkgVar.c, new mlg(kkgVar, qfoVar, (arpe) null, 9)).h(new psf(i3), andi.a);
                    } else {
                        alvw g = a.g();
                        g.X(alwp.a, "BugleDataModel");
                        alvg alvgVar5 = (alvg) g;
                        alvgVar5.X(ydl.e, qfoVar.g);
                        ((alvg) alvgVar5.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "onIncomingMessageInSpan", 217, "IncomingChatApiImpl.java")).q("Received incoming message.");
                        qdc qdcVar = (qdc) this.s.b();
                        aozy createBuilder7 = qfp.a.createBuilder();
                        if (!createBuilder7.b.isMutable()) {
                            createBuilder7.u();
                        }
                        apag apagVar3 = createBuilder7.b;
                        qfp qfpVar = (qfp) apagVar3;
                        qfoVar.getClass();
                        qfpVar.c = qfoVar;
                        qfpVar.b |= 1;
                        if (!apagVar3.isMutable()) {
                            createBuilder7.u();
                        }
                        qfp qfpVar2 = (qfp) createBuilder7.b;
                        qfpVar2.b |= 2;
                        qfpVar2.d = true;
                        h = qdcVar.a((qfp) createBuilder7.s()).h(new psf(i3), andi.a);
                        this.d.d(EnumSet.of(umy.WAKELOCK, umy.BACKGROUND_SERVICE), h, new qaa(4));
                    }
                }
            }
            e.b(h);
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul g(qfz qfzVar) {
        Optional m = m(qfx.a, qfzVar.d);
        if (m.isEmpty()) {
            l.q("Invalid opaque data in RemoveUserFromGroupChatResponse");
            vti vtiVar = (vti) this.t.b();
            vti.n(vtiVar, 19, 3, null, null, null, vtiVar.k(3, null), 24);
            aozy createBuilder = qeg.a.createBuilder();
            qef qefVar = qef.FAILED_PERMANENTLY;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeg qegVar = (qeg) createBuilder.b;
            qegVar.c = qefVar.f;
            qegVar.b |= 1;
            return aktp.ag((qeg) createBuilder.s());
        }
        return aktp.aj(new ncx(this, qfzVar, m, 4), this.q);
    }

    public final akul h(qgc qgcVar) {
        Optional m = m(qgd.a, qgcVar.d);
        if (m.isEmpty()) {
            l.q("Invalid opaque data in RevokeChatMessageResponse");
            aozy createBuilder = qeg.a.createBuilder();
            qef qefVar = qef.FAILED_PERMANENTLY;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeg qegVar = (qeg) createBuilder.b;
            qegVar.c = qefVar.f;
            qegVar.b |= 1;
            return aktp.ag((qeg) createBuilder.s());
        }
        return aktp.aj(new ncx(this, qgcVar, m, 6), this.q);
    }

    public final akul i(qgg qggVar) {
        Predicate mo407negate;
        Optional m = m(qgj.a, qggVar.d);
        Optional map = m.map(new qcq(1));
        mo407negate = Predicate$CC.isEqual(qgr.a).mo407negate();
        qgr qgrVar = (qgr) map.filter(mo407negate).orElse((qgr) this.v.fu(yyb.ba()));
        if (((Boolean) ((utz) vzh.c.get()).e()).booleanValue()) {
            vzh vzhVar = this.c;
            amgu amguVar = qggVar.h;
            if (amguVar == null) {
                amguVar = amgu.a;
            }
            vzhVar.d(qgrVar, rve.a(amguVar.H));
        }
        if (m.isEmpty()) {
            l.q("Invalid opaque data in SendChatMessageResponse");
            aozy createBuilder = qeg.a.createBuilder();
            qef qefVar = qef.FAILED_PERMANENTLY;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeg qegVar = (qeg) createBuilder.b;
            qegVar.c = qefVar.f;
            qegVar.b |= 1;
            return aktp.ag((qeg) createBuilder.s());
        }
        return aktp.aj(new imi(this, qggVar, 10), this.r).h(new kxr(this, qgrVar, qggVar, 17), this.r);
    }

    public final akul j(qgu qguVar) {
        Optional m = m(qgs.a, qguVar.d);
        if (m.isEmpty()) {
            l.q("Invalid opaque data in TriggerChatGroupFullStateUpdateResponse");
            aozy createBuilder = qeg.a.createBuilder();
            qef qefVar = qef.FAILED_PERMANENTLY;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeg qegVar = (qeg) createBuilder.b;
            qegVar.c = qefVar.f;
            qegVar.b |= 1;
            return aktp.ag((qeg) createBuilder.s());
        }
        return aktp.aj(new ncx(this, qguVar, m, 3), this.q);
    }

    public final akul k(qgx qgxVar) {
        qax qaxVar = (qax) this.n.b();
        try {
            qgv qgvVar = (qgv) apag.parseFrom(qgv.a, qgxVar.d, aozs.a());
            qeg qegVar = qgxVar.c;
            if (qegVar == null) {
                qegVar = qeg.a;
            }
            qef b = qef.b(qegVar.c);
            if (b == null) {
                b = qef.UNKNOWN_STATUS;
            }
            if (b.equals(qef.OK)) {
                vti vtiVar = qaxVar.d;
                String str = qgvVar.c;
                str.getClass();
                vti.n(vtiVar, 23, 2, str, null, null, null, 56);
            } else {
                vti vtiVar2 = qaxVar.d;
                String str2 = qgvVar.c;
                qeg qegVar2 = qgxVar.c;
                if (qegVar2 == null) {
                    qegVar2 = qeg.a;
                }
                vtiVar2.l(str2, qegVar2, 3);
            }
            return aktp.ai(new hbd(qaxVar, qgvVar, qgxVar, 16), qaxVar.e);
        } catch (apba e) {
            qax.a.r("Received update group operation response with invalid opaque data", e);
            vti vtiVar3 = qaxVar.d;
            vti.n(vtiVar3, 23, 3, null, null, null, vtiVar3.k(3, null), 24);
            aozy createBuilder = qeg.a.createBuilder();
            qef qefVar = qef.FAILED_PERMANENTLY;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qeg qegVar3 = (qeg) createBuilder.b;
            qegVar3.c = qefVar.f;
            qegVar3.b |= 1;
            return aktp.ag((qeg) createBuilder.s());
        }
    }
}
