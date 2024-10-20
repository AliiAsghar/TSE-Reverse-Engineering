package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxr {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public qxr(armf armfVar, apwt apwtVar, armf armfVar2, xyt xytVar, hgj hgjVar, pvw pvwVar, pvx pvxVar, pst pstVar) {
        this.d = armfVar;
        this.f = apwtVar;
        this.e = armfVar2;
        this.c = xytVar;
        this.b = hgjVar;
        this.h = pvwVar;
        this.a = pvxVar;
        this.g = pstVar;
    }

    public static final Optional e(long j) {
        if (j >= -1) {
            if (j == -1) {
                return Optional.empty();
            }
            return Optional.of(Duration.ofSeconds(j));
        }
        throw new IllegalStateException(a.ck(j, "Must be non-negative or '-1' to indicate not set. "));
    }

    private static final long s(ConversationIdType conversationIdType) {
        sge a = sgh.a();
        a.w("business_conversations_metadata.queryOnConversationId");
        sgg sggVar = new sgg();
        sggVar.b(conversationIdType);
        a.k(new agpw(sggVar));
        sga sgaVar = (sga) agnc.b(a.b());
        if (sgaVar != null) {
            sgaVar.ao(5, "conversation_toolstone_timestamp_ms");
            return sgaVar.f;
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r10v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    private final psk t(int i, ConversationIdType conversationIdType, long j) {
        Integer num;
        psk pskVar;
        utz utzVar = psn.a;
        if (i == 3) {
            num = (Integer) psn.j.e();
        } else {
            num = (Integer) psn.e.e();
        }
        num.getClass();
        int max = Math.max(0, Math.min(30, num.intValue()));
        if (max <= 1) {
            return psk.SHOW;
        }
        sbf n = ((ibi) this.c.b()).n(conversationIdType, max, 0);
        n.f(new atkn(sbi.c.j, true));
        sbd sbdVar = (sbd) n.b().n();
        try {
            if (sbdVar.getCount() < max) {
                pskVar = psk.HIDE;
            } else {
                long s = s(conversationIdType);
                if (sbdVar.moveToFirst() && d.y(sbdVar.r())) {
                    long C = sbdVar.C();
                    long j2 = C;
                    while (true) {
                        if (sbdVar.moveToNext()) {
                            if (!d.y(sbdVar.r())) {
                                pskVar = psk.HIDE;
                                break;
                            }
                            if (sbdVar.C() < s) {
                                pskVar = psk.HIDE;
                                break;
                            }
                            j2 = sbdVar.C();
                        } else {
                            long j3 = j2 - C;
                            if (j3 > j) {
                                pskVar = psk.HIDE;
                            } else {
                                int count = sbdVar.getCount();
                                aozy createBuilder = amtm.a.createBuilder();
                                if (!createBuilder.b.isMutable()) {
                                    createBuilder.u();
                                }
                                apag apagVar = createBuilder.b;
                                amtm amtmVar = (amtm) apagVar;
                                amtmVar.b |= 4;
                                amtmVar.e = count;
                                if (j > 0 && j != Long.MAX_VALUE) {
                                    if (!apagVar.isMutable()) {
                                        createBuilder.u();
                                    }
                                    amtm amtmVar2 = (amtm) createBuilder.b;
                                    amtmVar2.c = 3;
                                    amtmVar2.b |= 1;
                                    long seconds = Duration.ofMillis(j3).toSeconds();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    amtm amtmVar3 = (amtm) createBuilder.b;
                                    amtmVar3.b |= 2;
                                    amtmVar3.d = seconds;
                                    ((psi) this.f.b()).g((amtm) createBuilder.s());
                                    pskVar = psk.SHOW;
                                }
                                if (!apagVar.isMutable()) {
                                    createBuilder.u();
                                }
                                amtm amtmVar4 = (amtm) createBuilder.b;
                                amtmVar4.c = 2;
                                amtmVar4.b |= 1;
                                ((psi) this.f.b()).g((amtm) createBuilder.s());
                                pskVar = psk.SHOW;
                            }
                        }
                    }
                }
                pskVar = psk.HIDE;
            }
            armd.i(sbdVar, null);
            return pskVar;
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public final qxq a(agna agnaVar) {
        ((Context) this.a.b()).getClass();
        Map map = (Map) this.d.b();
        map.getClass();
        qif qifVar = (qif) this.g.b();
        qifVar.getClass();
        qyd qydVar = (qyd) this.h.b();
        qydVar.getClass();
        agnaVar.getClass();
        return new qxq(this.b, this.c, map, this.e, this.f, qifVar, qydVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    public final qqq b() {
        Function m329m = d$$ExternalSyntheticApiModelOutline0.m329m(this.e.b());
        m329m.getClass();
        uac uacVar = (uac) this.g.b();
        uacVar.getClass();
        return new qqq(this.f, this.b, this.h, m329m, this.c, this.a, this.d, uacVar, "");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final Duration c() {
        Object b = this.g.b();
        b.getClass();
        Duration ofSeconds = Duration.ofSeconds(((Number) b).longValue());
        ofSeconds.getClass();
        return ofSeconds;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final Duration d() {
        Object b = this.f.b();
        b.getClass();
        Duration ofSeconds = Duration.ofSeconds(((Number) b).longValue());
        ofSeconds.getClass();
        return ofSeconds;
    }

    public final void f(String str, qeg qegVar, qgr qgrVar) {
        qef b = qef.b(qegVar.c);
        if (b == null) {
            b = qef.UNKNOWN_STATUS;
        }
        amwy amwyVar = (amwy) ((algf) this.g).fu(b);
        Object obj = this.a;
        qee b2 = qee.b(qegVar.d);
        if (b2 == null) {
            b2 = qee.UNKNOWN_CAUSE;
        }
        i(str, 2, amwyVar, (amwx) ((algf) obj).fu(b2), qgrVar);
    }

    public final void g(String str, amwx amwxVar, qgr qgrVar) {
        i(str, 2, amwy.CHAT_API_FAILED_PERMANENTLY, amwxVar, qgrVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void h(amfv amfvVar) {
        maq maqVar = (maq) this.d.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amgl amglVar = (amgl) amgu.a.createBuilder();
        amxo n = ((hgj) this.b).n();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.aa = n.h;
        amguVar.c |= 2097152;
        amgu amguVar2 = (amgu) amglVar.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amguVar2.getClass();
        amfrVar.k = amguVar2;
        amfrVar.b |= 4;
        amfp amfpVar = amfp.BUGLE_GROUP;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amfrVar2.i = amfpVar.dg;
        amfrVar2.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar3 = (amfr) amfqVar.b;
        amfvVar.getClass();
        amfrVar3.B = amfvVar;
        amfrVar3.b |= 4194304;
        maqVar.j(amfqVar);
    }

    public final void i(String str, int i, amwy amwyVar, amwx amwxVar, qgr qgrVar) {
        aozy k = k(str);
        if (!k.b.isMutable()) {
            k.u();
        }
        amfv amfvVar = (amfv) k.b;
        amfv amfvVar2 = amfv.a;
        amfvVar.c = 14;
        amfvVar.b |= 1;
        if (!k.b.isMutable()) {
            k.u();
        }
        amfv amfvVar3 = (amfv) k.b;
        amfvVar3.d = 2;
        amfvVar3.b = 2 | amfvVar3.b;
        aozy createBuilder = amvs.a.createBuilder();
        atok atokVar = (atok) ((algf) this.h).m().fu(qgrVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amvs amvsVar = (amvs) createBuilder.b;
        atokVar.getClass();
        amvsVar.c = atokVar;
        amvsVar.b |= 1;
        aozy createBuilder2 = amxb.a.createBuilder();
        aozy createBuilder3 = amxc.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar = createBuilder3.b;
        amxc amxcVar = (amxc) apagVar;
        amxcVar.d = i - 1;
        amxcVar.b |= 4;
        if (!apagVar.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar2 = createBuilder3.b;
        amxc amxcVar2 = (amxc) apagVar2;
        amxcVar2.f = amwyVar.f;
        amxcVar2.b |= 16;
        if (!apagVar2.isMutable()) {
            createBuilder3.u();
        }
        amxc amxcVar3 = (amxc) createBuilder3.b;
        amxcVar3.e = amwxVar.x;
        amxcVar3.b |= 8;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amxb amxbVar = (amxb) createBuilder2.b;
        amxc amxcVar4 = (amxc) createBuilder3.s();
        amxcVar4.getClass();
        amxbVar.c = amxcVar4;
        amxbVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amvs amvsVar2 = (amvs) createBuilder.b;
        amxb amxbVar2 = (amxb) createBuilder2.s();
        amxbVar2.getClass();
        amvsVar2.e = amxbVar2;
        amvsVar2.b |= 4;
        if (!k.b.isMutable()) {
            k.u();
        }
        amfv amfvVar4 = (amfv) k.b;
        amvs amvsVar3 = (amvs) createBuilder.s();
        amvsVar3.getClass();
        amfvVar4.m = amvsVar3;
        amfvVar4.b |= 8192;
        h((amfv) k.s());
    }

    public final void j(String str, int i, int i2, qgr qgrVar) {
        aozy k = k(str);
        if (!k.b.isMutable()) {
            k.u();
        }
        amfv amfvVar = (amfv) k.b;
        amfv amfvVar2 = amfv.a;
        amfvVar.c = 13;
        amfvVar.b |= 1;
        aozy createBuilder = amfu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfu amfuVar = (amfu) createBuilder.b;
        amfuVar.b |= 2;
        amfuVar.d = i;
        if (!k.b.isMutable()) {
            k.u();
        }
        amfv amfvVar3 = (amfv) k.b;
        amfu amfuVar2 = (amfu) createBuilder.s();
        amfuVar2.getClass();
        amfvVar3.g = amfuVar2;
        amfvVar3.b |= 16;
        aozy createBuilder2 = amvs.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amvs amvsVar = (amvs) createBuilder2.b;
        amvsVar.d = i2 - 1;
        amvsVar.b |= 2;
        atok atokVar = (atok) ((algf) this.h).m().fu(qgrVar);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amvs amvsVar2 = (amvs) createBuilder2.b;
        atokVar.getClass();
        amvsVar2.c = atokVar;
        amvsVar2.b |= 1;
        if (!k.b.isMutable()) {
            k.u();
        }
        amfv amfvVar4 = (amfv) k.b;
        amvs amvsVar3 = (amvs) createBuilder2.s();
        amvsVar3.getClass();
        amfvVar4.m = amvsVar3;
        amfvVar4.b |= 8192;
        h((amfv) k.s());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [xyt, java.lang.Object] */
    public final aozy k(String str) {
        aozy createBuilder = amfv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfv amfvVar = (amfv) createBuilder.b;
        str.getClass();
        amfvVar.b |= 32;
        amfvVar.h = str;
        amhb x = ((lfl) this.f.b()).x(((yyt) this.e.b()).Q(vqk.h));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfv amfvVar2 = (amfv) createBuilder.b;
        amfvVar2.e = x;
        amfvVar2.b |= 4;
        amwt d = ((vrn) this.c.a()).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfv amfvVar3 = (amfv) createBuilder.b;
        amfvVar3.f = d.E;
        amfvVar3.b |= 8;
        return createBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [arwe, java.lang.Object] */
    public final akul l(ConversationIdType conversationIdType) {
        akul c;
        if (((Boolean) psn.b.e()).booleanValue()) {
            c = qjh.c(this.e, arpj.a, arwf.a, new mlg(this, conversationIdType, (arpe) null, 8));
            return c;
        }
        akul ag = aktp.ag(psk.HIDE);
        ag.getClass();
        return ag;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.psm
            if (r0 == 0) goto L13
            r0 = r6
            psm r0 = (defpackage.psm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            psm r0 = new psm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qxr r5 = r0.d
            defpackage.aqil.P(r6)
            goto L54
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r4.d
            java.lang.Object r6 = r6.b()
            ndi r6 = (defpackage.ndi) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = new com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            r2.<init>(r5)
            ncq r5 = r6.d(r2)
            akul r5 = r5.b()
            r0.d = r4
            r0.b = r3
            java.lang.Object r6 = defpackage.arro.F(r5, r0)
            if (r6 == r1) goto Lbd
            r5 = r4
        L54:
            alog r6 = (defpackage.alog) r6
            int r0 = r6.size()
            r1 = 0
            if (r0 > 0) goto L62
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L62:
            java.lang.Object r0 = r6.get(r1)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r0
            msh r0 = r0.f()
            java.lang.Object r6 = r6.get(r1)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            boolean r6 = r6.t()
            if (r6 == 0) goto L7d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L7d:
            java.lang.String r6 = r0.m()
            if (r6 != 0) goto L85
            java.lang.String r6 = ""
        L85:
            java.lang.String r6 = defpackage.msx.c(r6)
            r6.getClass()
            int r0 = r6.length()
            if (r0 != 0) goto La0
            java.lang.Object r5 = r5.b
            xze r5 = (defpackage.xze) r5
            java.lang.String r6 = "RBM toolstone is not shown as bot id is malformed."
            r5.m(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        La0:
            java.util.List r0 = defpackage.psn.c()
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto Lb8
            java.lang.Object r5 = r5.b
            xze r5 = (defpackage.xze) r5
            java.lang.String r6 = "RBM toolstone is not shown as it is not enabled on the bot domain."
            r5.q(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        Lb8:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxr.m(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, arpe):java.lang.Object");
    }

    public final void n(ConversationIdType conversationIdType) {
        Object e = psn.f.e();
        e.getClass();
        if (((Boolean) e).booleanValue()) {
            o(conversationIdType, psk.SHOW, false);
        } else {
            q(3, conversationIdType);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [arwe, java.lang.Object] */
    public final void o(ConversationIdType conversationIdType, psk pskVar, boolean z) {
        pskVar.getClass();
        qjh.l(this.e, null, new jyo(this, z, pskVar, conversationIdType, (arpe) null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [armf, java.lang.Object] */
    public final psk p(int i, ConversationIdType conversationIdType) {
        Integer num;
        Instant ofEpochMilli;
        psk pskVar;
        utz utzVar = psn.a;
        if (i == 3) {
            num = (Integer) psn.g.e();
        } else {
            num = (Integer) psn.c.e();
        }
        num.getClass();
        int T = a.T(num.intValue());
        if (T == 0) {
            T = 3;
        }
        int i2 = T - 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    pskVar = psk.HIDE;
                } else {
                    pskVar = t(i, conversationIdType, psn.d(i));
                }
            } else {
                pskVar = t(i, conversationIdType, Long.MAX_VALUE);
            }
        } else {
            long s = s(conversationIdType);
            long d = psn.d(i);
            if (s <= 0) {
                ibi ibiVar = (ibi) this.c.b();
                String str = scq.a;
                sda sdaVar = new sda(sdc.a);
                sdaVar.w("queryFirstMessageIds");
                sdaVar.o(scq.h, "messages.received_timestamp");
                sdaVar.o(scq.b, "ASC");
                sdaVar.o(scq.a, conversationIdType.a());
                sdaVar.o(scq.c, "messages.message_status <> 3");
                sdaVar.u(1);
                sbd sbdVar = (sbd) ibiVar.m(true, sdaVar.b()).b().n();
                try {
                    sbdVar.moveToFirst();
                    ofEpochMilli = Instant.ofEpochMilli(sbdVar.C());
                    armd.i(sbdVar, null);
                } finally {
                }
            } else {
                ofEpochMilli = Instant.ofEpochMilli(s);
            }
            Instant plus = ofEpochMilli.plus(Duration.ofMillis(d));
            Instant f = ((xnv) this.a.b()).f();
            if (plus.isBefore(f)) {
                psi psiVar = (psi) this.f.b();
                aozy createBuilder = amtm.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amtm amtmVar = (amtm) createBuilder.b;
                amtmVar.c = 1;
                amtmVar.b = 1 | amtmVar.b;
                long seconds = Duration.ofMillis(f.toEpochMilli() - ofEpochMilli.toEpochMilli()).toSeconds();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amtm amtmVar2 = (amtm) createBuilder.b;
                amtmVar2.b = 2 | amtmVar2.b;
                amtmVar2.d = seconds;
                psiVar.g((amtm) createBuilder.s());
                pskVar = psk.SHOW;
            } else {
                pskVar = psk.HIDE;
            }
        }
        if (pskVar == psk.SHOW) {
            o(conversationIdType, pskVar, false);
        }
        return pskVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    public final void q(int i, ConversationIdType conversationIdType) {
        qjh.l(this.e, null, new psl(this, i, conversationIdType, (arpe) null, 0), 3);
    }

    public qxr(ansy ansyVar, armf armfVar, agnq agnqVar, armf armfVar2, armf armfVar3, armf armfVar4, arwe arweVar) {
        ansyVar.getClass();
        armfVar.getClass();
        agnqVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        arweVar.getClass();
        this.h = ansyVar;
        this.a = armfVar;
        this.g = agnqVar;
        this.c = armfVar2;
        this.f = armfVar3;
        this.d = armfVar4;
        this.e = arweVar;
        this.b = xze.g("Bugle", "RbmToolstoneDatabaseOperations");
    }

    public qxr(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        this.f = armfVar;
        this.g = armfVar2;
        this.a = armfVar3;
        this.d = armfVar4;
        this.c = armfVar5;
        this.h = armfVar6;
        this.b = armfVar8;
        this.e = armfVar9;
    }

    public qxr() {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "file_processing.processing_id";
        a.c = new wsy();
        qad qadVar = new qad(a.a());
        this.b = qadVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.j(true);
        a2.f(true);
        a2.c(true);
        a2.a = "file_processing.file_type";
        a2.c = new wsy();
        qad qadVar2 = new qad(a2.a());
        this.c = qadVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "file_processing.file_uri";
        a3.c = new wsy();
        qad qadVar3 = new qad(a3.a());
        this.e = qadVar3;
        agmi a4 = agmk.a();
        a4.d = 5;
        a4.a = "file_processing.content_type";
        a4.c = new wsy();
        qad qadVar4 = new qad(a4.a());
        this.g = qadVar4;
        agmi a5 = agmk.a();
        a5.d = 5;
        a5.a = "file_processing.encryption_metadata";
        a5.c = new wsy();
        qad qadVar5 = new qad(a5.a());
        this.f = qadVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "file_processing.transfer_handle";
        a6.c = new wsy();
        qad qadVar6 = new qad(a6.a());
        this.h = qadVar6;
        agmi a7 = agmk.a();
        a7.d = 5;
        a7.a = "file_processing.upload_result";
        a7.c = new wsy();
        qad qadVar7 = new qad(a7.a());
        this.d = qadVar7;
        this.a = new qad[]{qadVar, qadVar2, qadVar3, qadVar4, qadVar5, qadVar6, qadVar7};
    }

    public qxr(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, byte[] bArr) {
        armfVar.getClass();
        this.f = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.h = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
        armfVar6.getClass();
        this.a = armfVar6;
        armfVar7.getClass();
        this.d = armfVar7;
        armfVar8.getClass();
        this.g = armfVar8;
    }

    public qxr(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
    }

    public qxr(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, char[] cArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.f = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.g = armfVar6;
        armfVar7.getClass();
        this.d = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
    }

    public qxr(char[] cArr, byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "cms_restore_dependency_cache_table._id";
        a.c = new wsy();
        sii siiVar = new sii(a.a());
        this.g = siiVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.i(true);
        a2.a = "cms_restore_dependency_cache_table.dependent_id";
        a2.c = new wsy();
        sii siiVar2 = new sii(a2.a());
        this.h = siiVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.i(true);
        a3.c(true);
        a3.a = "cms_restore_dependency_cache_table.dependent_cms_id";
        a3.c = new wsy();
        sii siiVar3 = new sii(a3.a());
        this.b = siiVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.i(true);
        a4.c(true);
        a4.a = "cms_restore_dependency_cache_table.dependency_cms_id";
        a4.c = new wsy();
        sii siiVar4 = new sii(a4.a());
        this.e = siiVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.i(true);
        a5.a = "cms_restore_dependency_cache_table.cms_data_provider_type";
        a5.c = new wsy();
        sii siiVar5 = new sii(a5.a());
        this.c = siiVar5;
        agmi a6 = agmk.a();
        a6.d = 5;
        a6.i(true);
        a6.a = "cms_restore_dependency_cache_table.payload";
        a6.c = new wsy();
        sii siiVar6 = new sii(a6.a());
        this.a = siiVar6;
        agmi a7 = agmk.a();
        a7.d = 2;
        a7.i(true);
        a7.c(true);
        a7.a = "cms_restore_dependency_cache_table.inserted_at_timestamp";
        a7.c = new wsy();
        sii siiVar7 = new sii(a7.a());
        this.d = siiVar7;
        this.f = new sii[]{siiVar, siiVar2, siiVar3, siiVar4, siiVar5, siiVar6, siiVar7};
    }

    public qxr(byte[] bArr, char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversation_classifications_table._id";
        a.c = new wsy();
        sjo sjoVar = new sjo(a.a());
        this.a = sjoVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.i(true);
        a2.c(true);
        a2.d(true);
        a2.b = new shg(15);
        a2.a = "conversation_classifications_table.conversation_id";
        a2.c = new wsy();
        sjo sjoVar2 = new sjo(a2.a());
        this.e = sjoVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.a = "conversation_classifications_table.classification_type";
        a3.c = new wsy();
        sjo sjoVar3 = new sjo(a3.a());
        this.c = sjoVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.i(true);
        a4.a = "conversation_classifications_table.classification_state";
        a4.c = new wsy();
        sjo sjoVar4 = new sjo(a4.a());
        this.f = sjoVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.c(true);
        a5.a = "conversation_classifications_table.date";
        a5.c = new wsy();
        sjo sjoVar5 = new sjo(a5.a());
        this.b = sjoVar5;
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.a = "conversation_classifications_table.impression_count";
        a6.c = new wsy();
        sjo sjoVar6 = new sjo(a6.a());
        this.d = sjoVar6;
        agmi a7 = agmk.a();
        a7.d = 2;
        a7.a = "conversation_classifications_table.generated_timestamp";
        a7.c = new wsy();
        sjo sjoVar7 = new sjo(a7.a());
        this.h = sjoVar7;
        this.g = new sjo[]{sjoVar, sjoVar2, sjoVar3, sjoVar4, sjoVar5, sjoVar6, sjoVar7};
    }

    public qxr(short[] sArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversation_to_participants_audit_log._id";
        a.c = new wsy();
        smb smbVar = new smb(a.a());
        this.a = smbVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.i(true);
        a2.a = "conversation_to_participants_audit_log.operation_datetime";
        a2.c = new wsy();
        smb smbVar2 = new smb(a2.a());
        this.e = smbVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.i(true);
        a3.a = "conversation_to_participants_audit_log.operation_type";
        a3.c = new wsy();
        smb smbVar3 = new smb(a3.a());
        this.b = smbVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.i(true);
        a4.a = "conversation_to_participants_audit_log.conversation_id";
        a4.c = new wsy();
        smb smbVar4 = new smb(a4.a());
        this.f = smbVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.i(true);
        a5.a = "conversation_to_participants_audit_log.participant_id";
        a5.c = new wsy();
        smb smbVar5 = new smb(a5.a());
        this.h = smbVar5;
        agmi a6 = agmk.a();
        a6.d = 1;
        a6.a = "conversation_to_participants_audit_log.rcs_group_join_status";
        a6.c = new wsy();
        smb smbVar6 = new smb(a6.a());
        this.d = smbVar6;
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "conversation_to_participants_audit_log.last_modified_by_key";
        a7.c = new wsy();
        smb smbVar7 = new smb(a7.a());
        this.c = smbVar7;
        this.g = new smb[]{smbVar, smbVar2, smbVar3, smbVar4, smbVar5, smbVar6, smbVar7};
    }

    public qxr(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.i(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.b = new spk(1);
        a.a = "drafts.conversation_id";
        a.c = new wsy();
        spc spcVar = new spc(a.a());
        this.f = spcVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "drafts.text";
        a2.c = new wsy();
        spc spcVar2 = new spc(a2.a());
        this.d = spcVar2;
        agmi a3 = agmk.a();
        a3.d = 5;
        a3.a = "drafts.attachments";
        a3.c = new wsy();
        spc spcVar3 = new spc(a3.a());
        this.g = spcVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "drafts.subject";
        a4.c = new wsy();
        spc spcVar4 = new spc(a4.a());
        this.h = spcVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.i(true);
        a5.a = "drafts.is_urgent";
        a5.c = new wsy();
        spc spcVar5 = new spc(a5.a());
        this.e = spcVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.a = "drafts.replied_to_message_id";
        a6.c = new wsy();
        spc spcVar6 = new spc(a6.a());
        this.b = spcVar6;
        agmi a7 = agmk.a();
        a7.d = 1;
        a7.i(true);
        a7.a = "drafts.is_encrypted";
        a7.c = new wsy();
        spc spcVar7 = new spc(a7.a());
        this.c = spcVar7;
        this.a = new spc[]{spcVar, spcVar2, spcVar3, spcVar4, spcVar5, spcVar6, spcVar7};
    }

    public qxr(char[] cArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "message_labels._id";
        a.c = new wsy();
        suu suuVar = new suu(a.a());
        this.d = suuVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.b = new ssv(20);
        a2.a = "message_labels.message_id";
        a2.e(true);
        a2.c = new wsy();
        suu suuVar2 = new suu(a2.a());
        this.e = suuVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.d(true);
        a3.b = new svc(1);
        a3.a = "message_labels.label";
        a3.e(true);
        a3.c = new wsy();
        suu suuVar3 = new suu(a3.a());
        this.c = suuVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "message_labels.confidence";
        a4.c = new wsy();
        suu suuVar4 = new suu(a4.a());
        this.g = suuVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "message_labels.source";
        a5.c = new wsy();
        suu suuVar5 = new suu(a5.a());
        this.h = suuVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.c(true);
        a6.a = "message_labels.intent";
        a6.c = new wsy();
        suu suuVar6 = new suu(a6.a());
        this.f = suuVar6;
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "message_labels.model_id";
        a7.c = new wsy();
        suu suuVar7 = new suu(a7.a());
        this.b = suuVar7;
        this.a = new suu[]{suuVar, suuVar2, suuVar3, suuVar4, suuVar5, suuVar6, suuVar7};
    }

    public qxr(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "message_reactions._id";
        a.c = new wsy();
        svk svkVar = new svk(a.a());
        this.d = svkVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.j(true);
        a2.i(true);
        a2.c(true);
        a2.d(true);
        a2.b = new svc(7);
        a2.a = "message_reactions.message_id";
        a2.c = new wsy();
        svk svkVar2 = new svk(a2.a());
        this.c = svkVar2;
        agmi a3 = agmk.a();
        a3.d = 5;
        a3.a = "message_reactions.reactions_data";
        a3.c = new wsy();
        svk svkVar3 = new svk(a3.a());
        this.h = svkVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.c(true);
        a4.d(true);
        a4.b = new svc(8);
        a4.a = "message_reactions.reacted_message_id";
        a4.c = new wsy();
        svk svkVar4 = new svk(a4.a());
        this.e = svkVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "message_reactions.reaction";
        a5.c = new wsy();
        svk svkVar5 = new svk(a5.a());
        this.b = svkVar5;
        agmi a6 = agmk.a();
        a6.d = 5;
        a6.a = "message_reactions.applied_reaction";
        a6.c = new wsy();
        svk svkVar6 = new svk(a6.a());
        this.f = svkVar6;
        agmi a7 = agmk.a();
        a7.d = 5;
        a7.c(true);
        a7.a = "message_reactions.animation_effect";
        a7.c = new wsy();
        svk svkVar7 = new svk(a7.a());
        this.g = svkVar7;
        this.a = new svk[]{svkVar, svkVar2, svkVar3, svkVar4, svkVar5, svkVar6, svkVar7};
    }

    public qxr(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "p2p_suggestions._id";
        a.c = new wsy();
        szo szoVar = new szo(a.a());
        this.d = szoVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.c(true);
        a2.d(true);
        a2.a = "p2p_suggestions.target_message_id";
        a2.c = new wsy();
        szo szoVar2 = new szo(a2.a());
        this.h = szoVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.a = "p2p_suggestions.generated_timestamp";
        a3.c = new wsy();
        szo szoVar3 = new szo(a3.a());
        this.f = szoVar3;
        agmi a4 = agmk.a();
        a4.d = 5;
        a4.a = "p2p_suggestions.suggestion";
        a4.c = new wsy();
        szo szoVar4 = new szo(a4.a());
        this.e = szoVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.a = "p2p_suggestions.smart_suggestion_type";
        a5.c = new wsy();
        szo szoVar5 = new szo(a5.a());
        this.c = szoVar5;
        agmi a6 = agmk.a();
        a6.d = 2;
        a6.a = "p2p_suggestions.suggestion_status";
        a6.c = new wsy();
        szo szoVar6 = new szo(a6.a());
        this.b = szoVar6;
        agmi a7 = agmk.a();
        a7.d = 2;
        a7.a = "p2p_suggestions.consumption_state";
        a7.c = new wsy();
        szo szoVar7 = new szo(a7.a());
        this.g = szoVar7;
        this.a = new szo[]{szoVar, szoVar2, szoVar3, szoVar4, szoVar5, szoVar6, szoVar7};
    }
}
