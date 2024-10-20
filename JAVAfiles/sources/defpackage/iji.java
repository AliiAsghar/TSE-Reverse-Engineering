package defpackage;

import android.content.Context;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Duration;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iji {
    public final Object a;
    public final Object b;
    public final Object c;

    public iji(Context context, aksr aksrVar, gpx gpxVar) {
        this.c = context;
        this.b = aksrVar;
        this.a = gpxVar;
    }

    public static final boolean g(jha jhaVar, Duration duration) {
        Duration duration2;
        if (hlc.E(jhaVar) instanceof afsv) {
            if (jhaVar instanceof jgv) {
                duration2 = ((aftq) ((jgv) jhaVar).a).g;
            } else if (jhaVar instanceof jgw) {
                duration2 = null;
            } else if (jhaVar instanceof jgz) {
                duration2 = ((aftq) ((jgz) jhaVar).a).g;
            } else {
                throw new armm();
            }
            if (duration2 != null && duration2.compareTo(duration) > 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akfb a(akfb akfbVar) {
        return new akfk(akfbVar, new icj(this, 19), (Executor) this.b, 1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final akfb b(enh enhVar, ConversationIdType conversationIdType, int i) {
        tde tdeVar = (tde) this.c;
        mlt mltVar = (mlt) tdeVar.d.b();
        ljp ljpVar = (ljp) tdeVar.j.b();
        anen anenVar = (anen) tdeVar.c.b();
        anenVar.getClass();
        anen anenVar2 = (anen) tdeVar.u.b();
        anenVar2.getClass();
        lgg lggVar = (lgg) tdeVar.q.b();
        lggVar.getClass();
        lgg lggVar2 = (lgg) tdeVar.s.b();
        lggVar2.getClass();
        ansy ansyVar = (ansy) tdeVar.h.b();
        ansyVar.getClass();
        xnv xnvVar = (xnv) tdeVar.i.b();
        xnvVar.getClass();
        ahiy ahiyVar = (ahiy) tdeVar.k.b();
        ahiyVar.getClass();
        psw pswVar = (psw) tdeVar.b.b();
        pswVar.getClass();
        qsa qsaVar = (qsa) tdeVar.f.b();
        qsaVar.getClass();
        Context context = (Context) tdeVar.g.b();
        context.getClass();
        enhVar.getClass();
        return new iki(tdeVar.m, mltVar, ljpVar, tdeVar.a, anenVar, anenVar2, lggVar, lggVar2, tdeVar.t, ansyVar, xnvVar, ahiyVar, tdeVar.p, tdeVar.r, tdeVar.o, tdeVar.n, pswVar, qsaVar, tdeVar.l, tdeVar.e, context, enhVar, conversationIdType, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v2, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.Object r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ifh
            if (r0 == 0) goto L13
            r0 = r8
            ifh r0 = (defpackage.ifh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ifh r0 = new ifh
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.aqil.P(r8)
            java.lang.Object r8 = r6.a
            emz r2 = new emz
            r4 = 0
            r5 = 12
            r2.<init>(r7, r6, r4, r5)
            r0.b = r3
            java.lang.Object r8 = defpackage.arro.q(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            armq r8 = (defpackage.armq) r8
            java.lang.Object r7 = r8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iji.c(java.lang.Object, arpe):java.lang.Object");
    }

    public final boolean d(Class cls, Class cls2) {
        if (((Class) this.a).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final void e(jxk jxkVar) {
        ?? r0;
        Object c;
        do {
            r0 = this.b;
            c = r0.c();
        } while (!r0.g(c, jxkVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pjv] */
    public final jms f(jmt jmtVar, List list) {
        if (!list.isEmpty()) {
            if (!jmtVar.c) {
                return jms.a;
            }
            if (list.size() > jmtVar.e) {
                return jms.b;
            }
            if (this.c.a()) {
                Object obj = this.b;
                jno jnoVar = new jno(afsz.c, (afsp) obj, Long.valueOf(jmtVar.b));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jha jhaVar = (jha) it.next();
                    if ((hlc.E(jhaVar) instanceof afsv) && hwr.al(jhaVar, jnoVar).a > jmtVar.b && g(jhaVar, jmtVar.f)) {
                        return jms.c;
                    }
                }
            }
            Object obj2 = this.b;
            if (hwr.am(list, new jno(afsz.c, (afsp) obj2, Long.valueOf(jmtVar.b))).b > jmtVar.b) {
                if (list.size() > 1) {
                    return jms.e;
                }
                return jms.d;
            }
            return jms.f;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arwe, java.lang.Object] */
    public final void h(boolean z) {
        qjh.l(this.b, null, new jmw(this, z, (arpe) null, 1), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r3 == null) goto L11;
     */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r1v14, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, miz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qkg i(defpackage.arwe r10, defpackage.qdq r11, defpackage.arqr r12) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iji.i(arwe, qdq, arqr):qkg");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final akul j(String str) {
        Object obj = this.c;
        obj.getClass();
        return akul.g(((vel) Map.EL.computeIfAbsent(this.a, str, new ttr(obj, 12))).b.h().h(new vej(10), andi.a));
    }

    public final void k(rve rveVar, Optional optional) {
        s(rveVar, rve.a, 4, 24, akec.aM(((Integer) optional.map(new tgn(17)).orElse(0)).intValue()));
    }

    public final void l(rve rveVar) {
        s(rveVar, rve.a, 10, 11, 1);
    }

    public final void m(rve rveVar) {
        s(rveVar, rve.a, 10, 3, 1);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [armf, java.lang.Object] */
    public final void n(amkb amkbVar, int i) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_E2EE_IDENTITY_VERIFICATION_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amkc.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amkc amkcVar = (amkc) apagVar;
        amkcVar.d = amkbVar.i;
        amkcVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amkc amkcVar2 = (amkc) createBuilder.b;
        amkcVar2.b |= 4;
        amkcVar2.e = i;
        amkc amkcVar3 = (amkc) createBuilder.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amkcVar3.getClass();
        amfrVar2.aL = amkcVar3;
        amfrVar2.e |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        ((maq) this.a.b()).j(amfqVar);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [armf, java.lang.Object] */
    public final void o(amkd amkdVar, int i, String str) {
        aozy createBuilder = amkf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amkf amkfVar = (amkf) apagVar;
        amkfVar.c = amkdVar.m;
        amkfVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amkf amkfVar2 = (amkf) apagVar2;
        amkfVar2.b |= 4;
        amkfVar2.g = i;
        if (str != null) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amkf amkfVar3 = (amkf) createBuilder.b;
            amkfVar3.b |= 8;
            amkfVar3.h = str;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_E2EE_LOOKUP_REGISTERED;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amkf amkfVar4 = (amkf) createBuilder.s();
        amkfVar4.getClass();
        amfrVar2.Q = amkfVar4;
        amfrVar2.c |= 1048576;
        ((maq) this.a.b()).j(amfqVar);
    }

    public final void p(rve rveVar, int i) {
        s(rveVar, rve.a, 4, 24, i);
    }

    public final void q(rve rveVar, rve rveVar2, int i) {
        s(rveVar, rveVar2, 4, 24, i);
    }

    public final void r(rve rveVar, int i) {
        s(rveVar, rve.a, 4, 26, i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [armf, java.lang.Object] */
    public final void s(rve rveVar, rve rveVar2, int i, int i2, int i3) {
        aozy createBuilder = amje.a.createBuilder();
        int e = ((mho) this.b.b()).e();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amje amjeVar = (amje) createBuilder.b;
        amjeVar.b |= 1;
        amjeVar.c = e;
        amje amjeVar2 = (amje) createBuilder.s();
        amgl amglVar = (amgl) amgu.a.createBuilder();
        amxo n = ((hgj) this.c).n();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.aa = n.h;
        amguVar.c |= 2097152;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.g = i - 1;
        amguVar2.b |= 1;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.h = i2 - 1;
        amguVar3.b |= 2;
        String k = ((mho) this.b.b()).k(Optional.empty());
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        k.getClass();
        amguVar4.c |= 1;
        amguVar4.J = k;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amjeVar2.getClass();
        amguVar5.y = amjeVar2;
        amguVar5.b |= 4194304;
        int i4 = xyp.a;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        int i5 = i4 - 1;
        if (i4 != 0) {
            amguVar6.N = i5;
            amguVar6.c |= 512;
            if (i3 != 1) {
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar7 = (amgu) amglVar.b;
                int i6 = i3 - 1;
                if (i3 != 0) {
                    amguVar7.ai = i6;
                    amguVar7.c |= 536870912;
                } else {
                    throw null;
                }
            }
            rveVar.g(new ter(amglVar, 11));
            rveVar2.g(new ter(amglVar, 12));
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_MESSAGE;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amgu amguVar8 = (amgu) amglVar.s();
            amguVar8.getClass();
            amfrVar2.k = amguVar8;
            amfrVar2.b |= 4;
            ((maq) this.a.b()).j(amfqVar);
            return;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [armf, java.lang.Object] */
    public final void t(ConversationIdType conversationIdType, rve rveVar) {
        aozy createBuilder = amul.a.createBuilder();
        String conversationIdType2 = conversationIdType.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amul amulVar = (amul) apagVar;
        conversationIdType2.getClass();
        amulVar.b |= 1;
        amulVar.c = conversationIdType2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amul amulVar2 = (amul) apagVar2;
        amulVar2.e = 1;
        amulVar2.b |= 4;
        String str = rveVar.b;
        if (str != null) {
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            amul amulVar3 = (amul) createBuilder.b;
            amulVar3.b |= 2;
            amulVar3.d = str;
        }
        maq maqVar = (maq) this.a.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.CONVERSATION_E2EE_STATUS_UPDATE;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        amul amulVar4 = (amul) createBuilder.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amulVar4.getClass();
        amfrVar2.bd = amulVar4;
        amfrVar2.f |= 536870912;
        maqVar.j(amfqVar);
    }

    public iji(armf armfVar, hgj hgjVar, armf armfVar2) {
        this.b = armfVar;
        this.c = hgjVar;
        this.a = armfVar2;
    }

    public iji(Class cls, Class cls2, hnl hnlVar) {
        this.a = cls;
        this.c = cls2;
        this.b = hnlVar;
    }

    public iji(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public iji(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public iji(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public iji(arpi arpiVar, iew iewVar, ndi ndiVar) {
        arpiVar.getClass();
        ndiVar.getClass();
        this.b = arpiVar;
        this.c = iewVar;
        this.a = ndiVar;
    }

    public iji(arpi arpiVar, uie uieVar) {
        arpiVar.getClass();
        this.a = arpiVar;
        this.b = uieVar;
        taz e = ParticipantsTable.e();
        e.w("blockedParticipantsFlow");
        e.g(new idc(4));
        this.c = new idx(new lhh(armd.m(new asac(new fzo(e.b(), (arpe) null, 3))), 7), this, 2);
    }

    public iji(wyp wypVar, armf armfVar) {
        this.a = new ConcurrentHashMap();
        this.c = wypVar;
        this.b = armfVar;
    }

    public iji(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
    }

    public iji(yyb yybVar, gpx gpxVar) {
        this.b = yybVar;
        this.a = gpxVar;
        this.c = new HashMap();
    }

    public iji(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public iji(arwe arweVar, arpi arpiVar, arpi arpiVar2, wul wulVar, ansy ansyVar) {
        arweVar.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        ansyVar.getClass();
        this.b = arweVar;
        this.a = wulVar;
        this.c = ansyVar;
    }

    public iji(arwe arweVar, wpb wpbVar) {
        arweVar.getClass();
        wpbVar.getClass();
        this.c = arweVar;
        this.a = wpbVar;
        this.b = new aghw(new jxh(arnv.a, new juf(this, 14)), 9);
    }

    public iji() {
        ascd a = ascy.a(null);
        this.b = a;
        this.a = a;
        this.c = new jxj(a, 0);
    }

    public iji(Context context, arpi arpiVar, jxv jxvVar) {
        context.getClass();
        arpiVar.getClass();
        this.c = context;
        this.a = arpiVar;
        this.b = jxvVar;
    }

    public iji(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "phone_number_min_match_guesser.guesser_id";
        a.c = new wsy();
        tci tciVar = new tci(a.a());
        this.c = tciVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "phone_number_min_match_guesser.test_phone_number";
        a2.c = new wsy();
        tci tciVar2 = new tci(a2.a());
        this.a = tciVar2;
        this.b = new tci[]{tciVar, tciVar2};
    }

    public iji(char[] cArr, byte[] bArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "received_message_phone_numbers.rcs_message_id";
        a.c = new wsy();
        tfc tfcVar = new tfc(a.a());
        this.c = tfcVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.i(true);
        a2.a = "received_message_phone_numbers.self_msisdn";
        a2.c = new wsy();
        tfc tfcVar2 = new tfc(a2.a());
        this.a = tfcVar2;
        this.b = new tfc[]{tfcVar, tfcVar2};
    }

    public iji(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.a = "remote_user_id_to_registration_id.remote_user_id";
        a.c = new wsy();
        thw thwVar = new thw(a.a());
        this.c = thwVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.f(true);
        a2.c(true);
        a2.d(true);
        a2.b = new tfq(18);
        a2.a = "remote_user_id_to_registration_id.tachyon_registration_id";
        a2.c = new wsy();
        thw thwVar2 = new thw(a2.a());
        this.a = thwVar2;
        this.b = new thw[]{thwVar, thwVar2};
    }

    public iji(char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.i(true);
        a.c(true);
        a.d(true);
        a.b = new tif(11);
        a.a = "satellite_emergency_details.message_id";
        a.e(true);
        a.c = new wsy();
        tkb tkbVar = new tkb(a.a());
        this.a = tkbVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.i(true);
        a2.a = "satellite_emergency_details.help_state";
        a2.c = new wsy();
        tkb tkbVar2 = new tkb(a2.a());
        this.c = tkbVar2;
        this.b = new tkb[]{tkbVar, tkbVar2};
    }

    public iji(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "trigger_flags._id";
        a.c = new wsy();
        tnp tnpVar = new tnp(a.a());
        this.a = tnpVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "trigger_flags.enabled";
        a2.c = new wsy();
        tnp tnpVar2 = new tnp(a2.a());
        this.c = tnpVar2;
        this.b = new tnp[]{tnpVar, tnpVar2};
    }

    public iji(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "verified_sms_senders.sender_id";
        a.c = new wsy();
        tpl tplVar = new tpl(a.a());
        this.a = tplVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "verified_sms_senders.brand_id";
        a2.c = new wsy();
        tpl tplVar2 = new tpl(a2.a());
        this.c = tplVar2;
        this.b = new tpl[]{tplVar, tplVar2};
    }
}
