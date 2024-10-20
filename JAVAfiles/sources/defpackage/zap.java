package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zap {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public zap(Context context, vjs vjsVar, vti vtiVar, armf armfVar, wfh wfhVar, armf armfVar2) {
        this.b = context;
        this.c = vjsVar;
        this.e = vtiVar;
        this.f = armfVar;
        this.a = wfhVar;
        this.d = armfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Integer n(ConversationIdType conversationIdType) {
        snf e = sni.e();
        e.w("MmsGroupUpgradeDatabaseOperations#getMmsGroupUpgradeRetriesBlocking");
        e.f(new vvi(1));
        e.h(new vte(conversationIdType, 10));
        e.u(1);
        alog t = e.b().t();
        t.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(t, 10));
        alur it = t.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((smr) it.next()).m()));
        }
        return (Integer) aqjn.ah(arrayList);
    }

    public static amfr q(amfv amfvVar) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_GROUP;
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
        amfvVar.getClass();
        amfrVar2.B = amfvVar;
        amfrVar2.b |= 4194304;
        return (amfr) amfqVar.s();
    }

    public static String s(rto rtoVar, vmr vmrVar) {
        if (rtoVar.S()) {
            return rtoVar.r();
        }
        return albo.ag(vmrVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    private final void u(amfv amfvVar, amxo amxoVar) {
        maq maqVar = (maq) this.d.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amgl amglVar = (amgl) amgu.a.createBuilder();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.aa = amxoVar.h;
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

    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    private final aozy v() {
        aozy createBuilder = amfv.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfv amfvVar = (amfv) createBuilder.b;
        amfvVar.c = 12;
        amfvVar.b |= 1;
        amhb x = ((lfl) this.c.b()).x(((yyt) this.e.b()).Q(vqk.u));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfv amfvVar2 = (amfv) createBuilder.b;
        amfvVar2.e = x;
        amfvVar2.b |= 4;
        amwt a = ((vru) this.a.b()).a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amfv amfvVar3 = (amfv) createBuilder.b;
        amfvVar3.f = a.E;
        amfvVar3.b |= 8;
        return createBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final void a() {
        this.c.f(null);
    }

    public final zck b(msh mshVar) {
        Recipient e = ((ndi) this.b).e(mshVar);
        akul b = e.x(1).b();
        b.getClass();
        return new zck(e, b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final zck c(msh mshVar) {
        zck zckVar;
        mshVar.getClass();
        synchronized (this.f) {
            ?? r1 = this.e;
            Object obj = r1.get(mshVar);
            if (obj == null) {
                obj = b(mshVar);
                r1.put(mshVar, obj);
            }
            zckVar = (zck) obj;
        }
        return zckVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public final abrd d() {
        ykw ykwVar = (ykw) this.f.b();
        ykwVar.getClass();
        ((mka) this.d.b()).getClass();
        ?? b = this.a.b();
        b.getClass();
        wjr wjrVar = (wjr) this.e.b();
        wjrVar.getClass();
        adtn adtnVar = (adtn) this.c.b();
        adtnVar.getClass();
        return new abrd(ykwVar, (apwt) b, wjrVar, adtnVar, (armf) this.b);
    }

    public final aqak e() {
        aqut aqutVar = (aqut) this.d;
        return (aqak) ((vco) this.b).b((vcq) this.f, aqutVar);
    }

    public final aqaq f() {
        aqut aqutVar = (aqut) this.d;
        return (aqaq) ((vco) this.e).b((vcq) this.f, aqutVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    public final boolean g(int i) {
        if (!((adji) this.f.b()).e(i).isEmpty() && ((adjc) this.a.b()).w(i)) {
            return ((zxy) this.b.b()).s();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    public final akul h(wzk wzkVar, aoia aoiaVar, Instant instant, int i) {
        akul ag;
        ajqk ajqkVar;
        aozy createBuilder = qft.a.createBuilder();
        qfs qfsVar = qfs.CONTROL;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qft qftVar = (qft) apagVar;
        qftVar.c = qfsVar.d;
        qftVar.b |= 1;
        qfr qfrVar = qfr.LOW;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        qft qftVar2 = (qft) apagVar2;
        qftVar2.d = qfrVar.e;
        qftVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        qft qftVar3 = (qft) createBuilder.b;
        int i2 = 4;
        qftVar3.b |= 4;
        qftVar3.e = false;
        qft qftVar4 = (qft) createBuilder.s();
        qei b = ((vpk) this.c.b()).b(i);
        Object obj = this.e;
        Object obj2 = this.d;
        apwq apwqVar = apwq.a;
        akrh e = aktp.e("ChatApiSender::sendTypingIndicator");
        try {
            rve a = ((wxz) obj).d.a();
            aozy createBuilder2 = qgj.a.createBuilder();
            String f = a.f();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgj qgjVar = (qgj) createBuilder2.b;
            qgjVar.b |= 1;
            qgjVar.e = f;
            aozy createBuilder3 = qgq.a.createBuilder();
            boolean equals = wzk.ACTIVE.equals(wzkVar);
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            qgq qgqVar = (qgq) createBuilder3.b;
            qgqVar.b |= 1;
            qgqVar.c = equals;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgj qgjVar2 = (qgj) createBuilder2.b;
            qgq qgqVar2 = (qgq) createBuilder3.s();
            qgqVar2.getClass();
            qgjVar2.d = qgqVar2;
            qgjVar2.c = 6;
            pvw pvwVar = ((wxz) obj).k;
            yyb yybVar = ((wxz) obj).l;
            qgr qgrVar = (qgr) pvwVar.fu(yyb.ba());
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qgj qgjVar3 = (qgj) createBuilder2.b;
            qgrVar.getClass();
            qgjVar3.g = qgrVar;
            qgjVar3.b |= 4;
            qgj qgjVar4 = (qgj) createBuilder2.s();
            try {
                arbj arbjVar = new arbj((byte[]) null, (short[]) null);
                int ordinal = wzkVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        ajqkVar = ajqk.STOP;
                    } else {
                        throw new IllegalArgumentException("Unsupported typing state ".concat(String.valueOf(wzkVar.name())));
                    }
                } else {
                    ajqkVar = ajqk.START;
                }
                arbjVar.w(ajqkVar);
                arbjVar.v(xak.a);
                arbjVar.x(instant);
                try {
                    ag = aktp.ag((qej) ((xak) obj2).c.fu(((xak) obj2).b.b(IsComposingMessage.class).b(arbjVar.u()))).i(new tua((wxz) obj, a, apwqVar, aoiaVar, qgjVar4, qftVar4, b, 4), ((wxz) obj).c).h(new wxv(obj, 3), ((wxz) obj).c);
                    if (((ozv) ((wxz) obj).j.b()).a()) {
                        ag = ag.e(IllegalArgumentException.class, new wxv(a, i2), ((wxz) obj).c);
                    }
                } catch (ajsh e2) {
                    throw new wyz(e2);
                }
            } catch (IllegalArgumentException e3) {
                ag = aktp.ag(wxz.n(e3, a, 5));
            }
            e.b(ag);
            e.close();
            return ag;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.Collection, java.lang.Object] */
    public final qfo i(MessageNotification messageNotification) {
        Conversation a = messageNotification.a();
        Message b = messageNotification.b();
        aozy createBuilder = qfo.b.createBuilder();
        qei b2 = ((vyv) this.a).b(b.a(), false);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar = (qfo) createBuilder.b;
        b2.getClass();
        qfoVar.d = b2;
        boolean z = true;
        qfoVar.c |= 1;
        Object obj = this.a;
        RcsDestinationId a2 = a.a();
        if (a.c() != 2) {
            z = false;
        }
        qei b3 = ((vyv) obj).b(a2, z);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qfo qfoVar2 = (qfo) apagVar;
        b3.getClass();
        qfoVar2.e = b3;
        qfoVar2.c |= 4;
        String h = b.h();
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        qfo qfoVar3 = (qfo) apagVar2;
        qfoVar3.c |= 32;
        qfoVar3.g = h;
        String b4 = a.b();
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar4 = (qfo) createBuilder.b;
        qfoVar4.c |= 64;
        qfoVar4.h = b4;
        alog c = b.c();
        HashMap hashMap = new HashMap();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            MessageExtensionHeader messageExtensionHeader = (MessageExtensionHeader) c.get(i);
            aozy aozyVar = (aozy) hashMap.get(messageExtensionHeader.b());
            if (aozyVar == null) {
                aozyVar = apws.a.createBuilder();
                hashMap.put(messageExtensionHeader.b(), aozyVar);
            }
            aozyVar.bJ(messageExtensionHeader.a(), messageExtensionHeader.c());
        }
        aozy createBuilder2 = apwq.a.createBuilder();
        Map.EL.forEach(hashMap, new lui(createBuilder2, 6));
        apwq apwqVar = (apwq) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar5 = (qfo) createBuilder.b;
        apwqVar.getClass();
        qfoVar5.i = apwqVar;
        qfoVar5.c |= 128;
        Optional g = b.g();
        Object obj2 = this.e;
        obj2.getClass();
        apct j = aotl.j((Instant) g.orElseGet(new uea(obj2, 18)));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar6 = (qfo) createBuilder.b;
        j.getClass();
        qfoVar6.k = j;
        qfoVar6.c |= 256;
        amgu d = ((vyv) this.c).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar7 = (qfo) createBuilder.b;
        d.getClass();
        qfoVar7.l = d;
        qfoVar7.c |= 512;
        ((vbu) this.f.b()).e().ifPresentOrElse(new vwq(createBuilder, 8), new eyg(13));
        alog b5 = b.b();
        int size2 = b5.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Message.MessageContent messageContent = (Message.MessageContent) b5.get(i2);
            if (ajqq.CHAT.equals(messageContent.a())) {
                createBuilder.J((qej) ((algf) this.b).m().fu(messageContent.b()));
            } else {
                throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(String.valueOf(messageContent.a()))));
            }
        }
        if (aczf.E() && messageNotification.b().d().isPresent()) {
            createBuilder.I((Iterable) Collection.EL.stream(messageNotification.b().d().get()).map(new vxg(this.d, 7)).collect(alls.b));
        } else {
            createBuilder.K(qfn.POSITIVE_DELIVERY);
            createBuilder.K(qfn.DISPLAY);
        }
        return (qfo) createBuilder.s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void j(ConversationIdType conversationIdType, int i) {
        String ag = albo.ag(((vqu) this.f.b()).r(conversationIdType));
        aozy v = v();
        if (!v.b.isMutable()) {
            v.u();
        }
        amfv amfvVar = (amfv) v.b;
        amfv amfvVar2 = amfv.a;
        amfvVar.b |= 32;
        amfvVar.h = ag;
        if (!v.b.isMutable()) {
            v.u();
        }
        amfv amfvVar3 = (amfv) v.b;
        amfvVar3.d = 1;
        amfvVar3.b |= 2;
        aozy createBuilder = amto.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amto amtoVar = (amto) createBuilder.b;
        amtoVar.c = i - 1;
        amtoVar.b |= 1;
        if (!v.b.isMutable()) {
            v.u();
        }
        amfv amfvVar4 = (amfv) v.b;
        amto amtoVar2 = (amto) createBuilder.s();
        amtoVar2.getClass();
        amfvVar4.l = amtoVar2;
        amfvVar4.b |= 4096;
        u((amfv) v.s(), ((hgj) this.b).n());
    }

    public final void k(String str, int i) {
        aozy v = v();
        if (!v.b.isMutable()) {
            v.u();
        }
        String ag = albo.ag(str);
        amfv amfvVar = (amfv) v.b;
        amfv amfvVar2 = amfv.a;
        amfvVar.b |= 32;
        amfvVar.h = ag;
        if (!v.b.isMutable()) {
            v.u();
        }
        amfv amfvVar3 = (amfv) v.b;
        amfvVar3.d = 1;
        amfvVar3.b |= 2;
        aozy createBuilder = amto.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amto amtoVar = (amto) createBuilder.b;
        amtoVar.d = i - 1;
        amtoVar.b |= 2;
        if (!v.b.isMutable()) {
            v.u();
        }
        amfv amfvVar4 = (amfv) v.b;
        amto amtoVar2 = (amto) createBuilder.s();
        amtoVar2.getClass();
        amfvVar4.l = amtoVar2;
        amfvVar4.b |= 4096;
        u((amfv) v.s(), ((hgj) this.b).n());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r12v2, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r11, defpackage.arpe r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.vvj
            if (r0 == 0) goto L13
            r0 = r12
            vvj r0 = (defpackage.vvj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            vvj r0 = new vvj
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r12)
            goto L48
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.aqil.P(r12)
            java.lang.Object r12 = r10.b
            uog r2 = new uog
            r8 = 7
            r9 = 0
            r7 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.b = r3
            java.lang.Object r12 = defpackage.arro.q(r12, r2, r0)
            if (r12 != r1) goto L48
            return r1
        L48:
            r12.getClass()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zap.l(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r15v0, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r19, java.lang.String r20, java.lang.String r21, defpackage.vtm r22, java.lang.String r23, defpackage.msh r24, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r25, java.util.List r26, defpackage.arpe r27) {
        /*
            r18 = this;
            r11 = r18
            r0 = r27
            boolean r1 = r0 instanceof defpackage.vvl
            if (r1 == 0) goto L17
            r1 = r0
            vvl r1 = (defpackage.vvl) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.b = r2
            goto L1c
        L17:
            vvl r1 = new vvl
            r1.<init>(r11, r0)
        L1c:
            r12 = r1
            java.lang.Object r0 = r12.a
            arpl r13 = defpackage.arpl.a
            int r1 = r12.b
            r14 = 1
            if (r1 == 0) goto L34
            if (r1 != r14) goto L2c
            defpackage.aqil.P(r0)
            goto L62
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            defpackage.aqil.P(r0)
            java.lang.Object r15 = r11.b
            vvn r10 = new vvn
            r16 = 0
            r0 = r10
            r1 = r18
            r2 = r20
            r3 = r21
            r4 = r25
            r5 = r22
            r6 = r24
            r7 = r19
            r8 = r23
            r9 = r26
            r17 = r10
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.b = r14
            r0 = r17
            java.lang.Object r0 = defpackage.arro.q(r15, r0, r12)
            if (r0 != r13) goto L62
            return r13
        L62:
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zap.m(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, java.lang.String, vtm, java.lang.String, msh, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul o(String str, amkt amktVar) {
        return r(str, 7).h(new vgd(amktVar, 19), this.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul p() {
        return aktp.ai(new vcr(11), this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul r(String str, int i) {
        akul ai = aktp.ai(new vib(this, 14), this.f);
        Object obj = this.d;
        obj.getClass();
        return ai.h(new vuu(obj, 1), this.f).h(new mtq(this, i, str, 7), this.a);
    }

    public final boolean t(rto rtoVar, alog alogVar, vmr vmrVar) {
        boolean z;
        if (!yhx.b && !yhx.e((Context) this.b)) {
            rry rryVar = (rry) alzz.aO(alogVar);
            if (alogVar.size() == 1 && rtoVar.I() == rryVar.i()) {
                z = true;
            } else {
                z = false;
            }
            String str = vmrVar.d;
            if (str != null && vmrVar.c != null && ((gh.m(str) || gh.z(vmrVar.d)) && z)) {
                return true;
            }
        }
        return false;
    }

    public zap(anen anenVar, xtf xtfVar, yyb yybVar, znj znjVar, armf armfVar, oel oelVar) {
        this.a = anenVar;
        this.c = xtfVar;
        this.b = yybVar;
        this.e = znjVar;
        this.d = armfVar;
        this.f = oelVar;
    }

    public zap(armf armfVar, armf armfVar2, armf armfVar3, apwt apwtVar, armf armfVar4, hgj hgjVar) {
        this.d = armfVar;
        this.f = armfVar2;
        this.e = armfVar3;
        this.c = apwtVar;
        this.a = armfVar4;
        this.b = hgjVar;
    }

    public zap(armf armfVar, wxz wxzVar, xak xakVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.b = armfVar;
        this.e = wxzVar;
        this.d = xakVar;
        this.c = armfVar2;
        this.a = armfVar3;
        this.f = armfVar4;
    }

    public zap(armf armfVar, yyt yytVar, lfl lflVar, apwt apwtVar, aneo aneoVar, aneo aneoVar2) {
        this.e = armfVar;
        this.c = yytVar;
        this.d = lflVar;
        this.b = apwtVar;
        this.f = aneoVar;
        this.a = aneoVar2;
    }

    public zap(pvy pvyVar, vyv vyvVar, xnv xnvVar, vyv vyvVar2, vzm vzmVar, armf armfVar) {
        this.b = pvyVar;
        this.a = vyvVar;
        this.e = xnvVar;
        this.c = vyvVar2;
        this.d = vzmVar;
        this.f = armfVar;
    }

    public zap(vco vcoVar, vco vcoVar2, vco vcoVar3, vco vcoVar4, vcq vcqVar, aqut aqutVar) {
        this.e = vcoVar;
        this.a = vcoVar2;
        this.b = vcoVar3;
        this.c = vcoVar4;
        this.f = vcqVar;
        this.d = aqutVar;
    }

    public zap() {
        agmi a = agmk.a();
        a.d = 2;
        a.c(true);
        a.d(true);
        a.b = new yaa(13);
        a.a = "spam_logging_ids_table.message_id";
        a.c = new wsy();
        ynv ynvVar = new ynv(a.a());
        this.c = ynvVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.a = "spam_logging_ids_table.message_logging_id";
        a2.c = new wsy();
        ynv ynvVar2 = new ynv(a2.a());
        this.a = ynvVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.c(true);
        a3.d(true);
        a3.b = new yaa(14);
        a3.a = "spam_logging_ids_table.conversation_id";
        a3.c = new wsy();
        ynv ynvVar3 = new ynv(a3.a());
        this.f = ynvVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "spam_logging_ids_table.conversation_logging_id";
        a4.c = new wsy();
        ynv ynvVar4 = new ynv(a4.a());
        this.b = ynvVar4;
        agmi a5 = agmk.a();
        a5.d = 2;
        a5.c(true);
        a5.a = "spam_logging_ids_table.generation_timestamp";
        a5.c = new wsy();
        ynv ynvVar5 = new ynv(a5.a());
        this.e = ynvVar5;
        this.d = new ynv[]{ynvVar, ynvVar2, ynvVar3, ynvVar4, ynvVar5};
    }

    public zap(agnq agnqVar, arpi arpiVar, arwe arweVar, armf armfVar, xnv xnvVar, pfx pfxVar) {
        agnqVar.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        xnvVar.getClass();
        this.f = agnqVar;
        this.b = arpiVar;
        this.e = arweVar;
        this.a = armfVar;
        this.c = xnvVar;
        this.d = pfxVar;
    }

    public zap(armf armfVar, anen anenVar, anen anenVar2, wus wusVar) {
        this.f = armfVar;
        this.d = anenVar;
        this.b = anenVar2;
        this.e = wusVar;
        this.c = new ConcurrentHashMap();
        this.a = new AtomicReference();
    }

    public zap(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, byte[] bArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
    }

    public zap(arwe arweVar, zcr zcrVar, zen zenVar, zeo zeoVar, okf okfVar) {
        arweVar.getClass();
        zcrVar.getClass();
        zenVar.getClass();
        zeoVar.getClass();
        okfVar.getClass();
        this.a = arweVar;
        this.d = zcrVar;
        this.f = zenVar;
        this.e = zeoVar;
        this.b = okfVar;
        this.c = ascy.a(null);
    }

    public zap(arwe arweVar, arpi arpiVar, zen zenVar, ndi ndiVar) {
        arweVar.getClass();
        arpiVar.getClass();
        zenVar.getClass();
        ndiVar.getClass();
        this.c = arweVar;
        this.a = arpiVar;
        this.d = zenVar;
        this.b = ndiVar;
        this.f = new Object();
        this.e = new LinkedHashMap();
        qjh.l(arweVar, arpiVar, new zcb(this, (arpe) null, 2), 2);
    }

    public zap(ConversationId conversationId, asai asaiVar, ndi ndiVar, armf armfVar, armf armfVar2, ytk ytkVar) {
        conversationId.getClass();
        asaiVar.getClass();
        ndiVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        ytkVar.getClass();
        this.f = conversationId;
        this.b = asaiVar;
        this.e = ndiVar;
        this.d = armfVar;
        this.c = armfVar2;
        this.a = ruy.b(conversationId.b());
    }

    public zap(asai asaiVar, asai asaiVar2, arwe arweVar, xwt xwtVar, armf armfVar, xbf xbfVar) {
        asaiVar.getClass();
        asaiVar2.getClass();
        arweVar.getClass();
        xwtVar.getClass();
        armfVar.getClass();
        xbfVar.getClass();
        this.d = asaiVar;
        this.b = asaiVar2;
        this.c = arweVar;
        this.e = xwtVar;
        this.a = armfVar;
        this.f = xbfVar;
    }

    public zap(arwe arweVar, asai asaiVar, asai asaiVar2, ConversationId conversationId, armf armfVar, armf armfVar2, armf armfVar3) {
        arweVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        conversationId.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.e = arweVar;
        this.c = asaiVar;
        this.a = asaiVar2;
        this.d = armfVar;
        this.f = armfVar2;
        this.b = armfVar3;
    }

    public zap(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        armfVar.getClass();
        this.f = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        this.a = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
        armfVar6.getClass();
        this.b = armfVar6;
    }
}
