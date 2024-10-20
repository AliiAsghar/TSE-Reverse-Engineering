package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rsr extends rqz implements mys, rtr {
    private static final alvz H = new alvz("rcs_one_on_one_conditions", ammc.class, false, false);
    private static final alvi I = alvi.m("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData");
    public static final xze a = xze.g("Bugle", "DraftMessageData");
    public static final Pattern b = Pattern.compile("^[ -_\\x0A\\x0C\\x0D\\x61-\\x7E\\u0400-\\u1CC0\\u2C00-\\u2C5F\\u2D00-\\u2DFF\\u2E80-\\u3370\\u33E0-\\uD7FF\\uA000-\\uD7FF\\uD800-\\uDFFF]*$");
    static final uuf c = uuh.i(uuh.b, "enable_warn_of_exceeding_sms_message_length_to_emergency_number_dialog", false);
    public final ydf A;
    public final wyp B;
    public final xav C;
    public final armf D;
    public final armf E;
    public final ifb F;

    @Deprecated
    public final ahmv G;
    private amjk J;
    private amjz K;
    private boolean M;
    private boolean N;
    private SelfIdentityId Q;
    private final xnv S;
    private final vqu T;
    private final armf U;
    private final yep V;
    private final yjy W;
    private final rsv X;
    private final nct Y;
    private final rys Z;
    private final rtg aa;
    private final tqx ab;
    private final rvp ac;
    private final armf ad;
    private final armf af;
    private final armf ag;
    private final armf ah;
    private final lgg ai;
    private final wfh aj;
    public final ConversationIdType d;
    final rsl e;
    public rsn f;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public boolean m;
    public boolean p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public rsj v;
    public lua w;
    public final xbf x;
    public final xbi y;
    public final Context z;
    public boolean g = false;
    private final AtomicReference L = new AtomicReference();
    private Optional O = Optional.empty();
    private String P = "text/plain";
    public int n = -2;
    private final AtomicReference R = new AtomicReference();
    public Optional o = Optional.empty();
    private final eny ae = new eny();

    public rsr(xnv xnvVar, ahmv ahmvVar, vqu vquVar, xbf xbfVar, xbi xbiVar, Context context, yep yepVar, yjy yjyVar, ydf ydfVar, wyp wypVar, xav xavVar, wfh wfhVar, rsv rsvVar, nct nctVar, rys rysVar, rtg rtgVar, tqx tqxVar, ifb ifbVar, rvp rvpVar, armf armfVar, armf armfVar2, ConversationIdType conversationIdType, boolean z, armf armfVar3, armf armfVar4, lgg lggVar, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.S = xnvVar;
        this.G = ahmvVar;
        this.T = vquVar;
        this.x = xbfVar;
        this.y = xbiVar;
        this.z = context;
        this.V = yepVar;
        this.W = yjyVar;
        this.A = ydfVar;
        this.B = wypVar;
        this.C = xavVar;
        this.aj = wfhVar;
        this.X = rsvVar;
        this.Y = nctVar;
        this.Z = rysVar;
        this.aa = rtgVar;
        this.ab = tqxVar;
        this.F = ifbVar;
        this.ac = rvpVar;
        this.ad = armfVar;
        this.U = armfVar2;
        this.af = armfVar3;
        this.D = armfVar4;
        this.ai = lggVar;
        this.E = armfVar5;
        this.ag = armfVar6;
        this.ah = armfVar7;
        this.d = conversationIdType;
        M(z);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = DesugarCollections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.s = arrayList2;
        this.t = DesugarCollections.unmodifiableList(arrayList2);
        this.u = new ArrayList();
        this.e = new rsl();
        this.m = false;
    }

    private final int am(boolean z) {
        if (this.g) {
            if (this.i) {
                return 40;
            }
            return 30;
        }
        if (!z) {
            if (this.h && !this.y.d(q())) {
                return 11;
            }
            return 10;
        }
        return 20;
    }

    @Deprecated
    private final int an() {
        return this.V.b("bugle_mms_attachment_limit", 10);
    }

    @Deprecated
    private final int ao() {
        return this.V.b("bugle_rcs_attachment_limit", 10);
    }

    private final qei ap() {
        qei a2 = ((vpk) this.ad.b()).a(this.n);
        if (a2 != null) {
            return a2;
        }
        qei qeiVar = (qei) this.R.get();
        if (qeiVar != null) {
            return qeiVar;
        }
        throw new rsp(this.n);
    }

    private final alog aq(Predicate predicate, List list) {
        Stream filter = Collection.EL.stream(list).filter(predicate);
        int i = alog.d;
        alog alogVar = (alog) filter.collect(alls.a);
        int size = alogVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) alogVar.get(i2);
            if (af(messagePartCoreData)) {
                uin uinVar = (uin) this.D.b();
                Uri t = messagePartCoreData.t();
                t.getClass();
                uinVar.b(t, this.A.b(-1));
            }
        }
        if (!alogVar.isEmpty()) {
            list.removeAll(alogVar);
            this.u.removeAll(alogVar);
            Collection.EL.stream(alogVar).forEach(new rbc(6));
            I(1);
        }
        return alogVar;
    }

    private final String ar(String str) {
        if (!TextUtils.isEmpty(str) && this.O.isPresent()) {
            return String.valueOf(str).concat((String) this.O.get());
        }
        return str;
    }

    private final void as(amjk amjkVar) {
        xyo a2 = a.a();
        a2.H("set emptyDraftRcsConditions");
        a2.b(this.d);
        amfg b2 = amfg.b(amjkVar.f);
        if (b2 == null) {
            b2 = amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
        }
        a2.z("conversationType", b2.name());
        a2.A("hasRbmRecipient", amjkVar.j);
        amjj b3 = amjj.b(amjkVar.k);
        if (b3 == null) {
            b3 = amjj.UNKNOWN_SEND_MODE;
        }
        a2.z("sendMode", b3.name());
        a2.q();
        this.J = amjkVar;
    }

    private final void at() {
        if (this.n < 0) {
            alvw i = I.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData", "updateLocalRcsSender", 861, "DraftMessageData.java")).q("Unable to update local RCS sender as selfSubId is not valid.");
            return;
        }
        this.R.set(((vpk) this.ad.b()).b(this.n));
    }

    private final boolean au(MessagePartCoreData messagePartCoreData) {
        return Collection.EL.stream(this.u).anyMatch(new qxp(messagePartCoreData, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r0 != defpackage.amjj.SEND_MODE_XMS_LATCH) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean av(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsr.av(boolean, boolean):boolean");
    }

    private final boolean aw() {
        if (!this.s.isEmpty()) {
            return true;
        }
        return false;
    }

    private final boolean ax(MessagePartCoreData messagePartCoreData) {
        int k = k();
        if (((Boolean) vof.a.e()).booleanValue()) {
            k -= B().size();
        }
        if (k < l()) {
            return false;
        }
        if (((Boolean) vof.a.e()).booleanValue() && messagePartCoreData.bi()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r5.y.d(r1) != false) goto L11;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean ay() {
        /*
            r5 = this;
            java.lang.String r0 = "DraftMessageData::requiresMmsForRecipients"
            akrh r0 = defpackage.aktp.e(r0)
            int r1 = r5.q()     // Catch: java.lang.Throwable -> L2e
            wfh r2 = r5.aj     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r5.M     // Catch: java.lang.Throwable -> L2e
            ahmv r4 = r5.G     // Catch: java.lang.Throwable -> L2e
            int r4 = r4.k()     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r2.l(r3, r1, r4)     // Catch: java.lang.Throwable -> L2e
            r3 = 1
            if (r2 != 0) goto L2a
            boolean r2 = r5.h     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            if (r2 == 0) goto L29
            xbi r2 = r5.y     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r2.d(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L29
            goto L2a
        L29:
            r3 = r4
        L2a:
            r0.close()
            return r3
        L2e:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            r1.addSuppressed(r0)
        L37:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsr.ay():boolean");
    }

    public static int p(int i) {
        if (i != 20) {
            if (i != 30 && i != 40) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    public final List A(List list) {
        Stream filter = Collection.EL.stream(this.u).filter(new qxp(list, 7));
        int i = alog.d;
        return (List) filter.collect(alls.a);
    }

    public final List B() {
        Stream filter = Collection.EL.stream(this.u).filter(new rsi(2));
        int i = alog.d;
        return (List) filter.collect(alls.a);
    }

    public final void C(rsm rsmVar) {
        this.e.add(rsmVar);
    }

    public final void D(PendingAttachmentData pendingAttachmentData, rrc rrcVar) {
        if (U(pendingAttachmentData, rrcVar.b())) {
            H();
        }
        I(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0166, code lost:
    
        if (r8.matcher(r0).matches() != false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(boolean r6, boolean r7, int r8, defpackage.rsk r9, defpackage.rrc r10) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsr.E(boolean, boolean, int, rsk, rrc):void");
    }

    public final void F() {
        G(false);
    }

    public final void G(boolean z) {
        this.q.clear();
        this.s.clear();
        this.u.clear();
        Q(null);
        P(null);
        this.m = false;
        this.w = null;
        if (z) {
            I(255);
        }
    }

    public final void H() {
        this.e.bp(this);
    }

    public final void I(int i) {
        akrh e = aktp.e("DraftMessageData::dispatchChanged");
        try {
            rsj rsjVar = this.v;
            if (rsjVar != null) {
                rsjVar.cancel(true);
                this.v = null;
            }
            this.e.ai(this, i);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void J(boolean z) {
        av(z, true);
    }

    public final void K(ikl iklVar, ammc ammcVar) {
        boolean z;
        amfg amfgVar;
        if (iklVar.c != 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        this.M = iklVar.f;
        this.N = iklVar.e;
        this.i = iklVar.d;
        aozy createBuilder = amjk.a.createBuilder();
        alvi alviVar = nct.a;
        int i = iklVar.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    amfgVar = amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
                } else {
                    amfgVar = amfg.CONVERSATION_TYPE_GROUP_RCS;
                }
            } else {
                amfgVar = amfg.CONVERSATION_TYPE_GROUP_MMS;
            }
        } else {
            amfgVar = amfg.CONVERSATION_TYPE_ONE_ON_ONE;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amjk amjkVar = (amjk) apagVar;
        amjkVar.f = amfgVar.f;
        amjkVar.b |= 8;
        boolean z2 = iklVar.e;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amjk amjkVar2 = (amjk) apagVar2;
        amjkVar2.b |= 256;
        amjkVar2.j = z2;
        amjj a2 = nct.a(iklVar.m);
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amjk amjkVar3 = (amjk) createBuilder.b;
        amjkVar3.k = a2.e;
        amjkVar3.b |= 512;
        if (iklVar.c == 0 && !iklVar.e) {
            if (ammcVar != null) {
                int q = q();
                nct nctVar = this.Y;
                if (q < 0) {
                    alvw i2 = nct.a.i();
                    i2.X(alwp.a, "BugleDataModel");
                    alvg alvgVar = (alvg) i2;
                    alvgVar.X(ydl.t, Integer.valueOf(q));
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isSubscriptionRcsAvailable", 105, "ConversationRcsSelector.java")).q("Passing invalid subId to the rcs availability check.");
                } else {
                    alvw d = nct.a.d();
                    d.X(alwp.a, "BugleDataModel");
                    alvg alvgVar2 = (alvg) d;
                    alvgVar2.X(ydl.t, Integer.valueOf(q));
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isSubscriptionRcsAvailable", 110, "ConversationRcsSelector.java")).q("Check RCS availability in convo v1.");
                }
                boolean w = ((adjc) nctVar.b.b()).w(q);
                amwt amwtVar = ((adjc) this.U.b()).d(q).a;
                aozy createBuilder2 = ammc.a.createBuilder(ammcVar);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                ammc ammcVar2 = (ammc) apagVar3;
                ammcVar2.k = amwtVar.E;
                ammcVar2.b |= 256;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar4 = createBuilder2.b;
                ammc ammcVar3 = (ammc) apagVar4;
                ammcVar3.b = 1 | ammcVar3.b;
                ammcVar3.c = w;
                if (!apagVar4.isMutable()) {
                    createBuilder2.u();
                }
                ammc ammcVar4 = (ammc) createBuilder2.b;
                ammcVar4.b |= 128;
                ammcVar4.j = w;
                ammc ammcVar5 = (ammc) createBuilder2.s();
                alvw d2 = I.d();
                d2.X(alwp.a, "Bugle");
                alvg alvgVar3 = (alvg) d2;
                alvgVar3.X(ydl.t, Integer.valueOf(q));
                alvgVar3.X(ydl.p, this.d);
                alvgVar3.X(H, ammcVar5);
                ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData", "overwriteRcsAvailability", 1787, "DraftMessageData.java")).q("Overwrite self_rcs_available.");
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amjk amjkVar4 = (amjk) createBuilder.b;
                ammcVar5.getClass();
                amjkVar4.l = ammcVar5;
                amjkVar4.b |= 1024;
            } else {
                amjk amjkVar5 = this.J;
                if (amjkVar5 != null && (amjkVar5.b & 1024) != 0) {
                    ammc ammcVar6 = amjkVar5.l;
                    if (ammcVar6 == null) {
                        ammcVar6 = ammc.a;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjk amjkVar6 = (amjk) createBuilder.b;
                    ammcVar6.getClass();
                    amjkVar6.l = ammcVar6;
                    amjkVar6.b |= 1024;
                }
            }
            as((amjk) createBuilder.s());
            return;
        }
        as((amjk) createBuilder.s());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (defpackage.d.F(r8.w, r10.u()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r10.cq() == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(java.lang.Object r9, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r10, defpackage.rto r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsr.L(java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, rto, android.content.Context):void");
    }

    @Override // defpackage.rtr
    public final void M(boolean z) {
        this.g = z;
        this.ae.h(Boolean.valueOf(z));
    }

    public final void N(String str) {
        if (TextUtils.isEmpty(str)) {
            this.P = "text/plain";
        } else {
            this.P = str;
        }
    }

    public final void O(Optional optional) {
        if (optional.isEmpty()) {
            this.O = Optional.empty();
        } else {
            this.O = Optional.of("\n".concat((String) optional.get()));
        }
    }

    @Override // defpackage.rtr
    public final void P(String str) {
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.l = str;
    }

    @Override // defpackage.rtr
    public final void Q(String str) {
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        if (agkx.ab(this.k, str)) {
            return;
        }
        this.k = str;
        if (this.o.isEmpty()) {
            this.o = Optional.of(this.S.f());
        }
        ahmv ahmvVar = this.G;
        xzq.a((Context) ahmvVar.i, new utg(ahmvVar, q(), albo.ag(ar(str)), akto.j(new nau(this, 20))));
    }

    public final void R(SelfIdentityId selfIdentityId, int i) {
        if (agkx.ab(lga.Y(this.Q), lga.Y(selfIdentityId)) && this.n == i) {
            return;
        }
        xyo a2 = a.a();
        a2.H("set:");
        a2.z("selfId", selfIdentityId);
        a2.l(i);
        a2.b(this.d);
        a2.q();
        this.Q = selfIdentityId;
        this.n = i;
        int i2 = 1;
        if (!this.h) {
            if (!((adjc) this.U.b()).w(i)) {
                J(false);
            } else if (this.f.b()) {
                ag(true);
            }
        } else if (this.g) {
            at();
        }
        this.ai.g(new wog(selfIdentityId, i, i2));
        I(8);
    }

    public final boolean S(java.util.Collection collection, String str) {
        boolean T;
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            Uri t = messagePartCoreData.t();
            if (messagePartCoreData instanceof PendingAttachmentData) {
                T = U((PendingAttachmentData) messagePartCoreData, str);
            } else if (ydk.u(t)) {
                xyo a2 = a.a();
                a2.H("adding attachment uri:");
                a2.H(t);
                a2.q();
                PendingAttachmentData d = this.aa.d(messagePartCoreData.U(), messagePartCoreData.t(), messagePartCoreData.v(), messagePartCoreData.c(), messagePartCoreData.b(), messagePartCoreData.k(), messagePartCoreData.M(), messagePartCoreData.ac(), messagePartCoreData.ab(), messagePartCoreData.m(), messagePartCoreData.W(), null);
                d.f = messagePartCoreData.N();
                T = U(d, str);
            } else {
                T = T(messagePartCoreData);
            }
            z |= T;
        }
        if (z) {
            H();
        }
        I(1);
        if (z) {
            return false;
        }
        return true;
    }

    public final boolean T(MessagePartCoreData messagePartCoreData) {
        xyl.k(messagePartCoreData.aV());
        boolean ax = ax(messagePartCoreData);
        if (au(messagePartCoreData)) {
            return false;
        }
        if (ax) {
            messagePartCoreData.aj();
            return true;
        }
        this.q.add(messagePartCoreData);
        this.u.add(messagePartCoreData);
        return false;
    }

    public final boolean U(PendingAttachmentData pendingAttachmentData, String str) {
        boolean ax = ax(pendingAttachmentData);
        if (!ax && !au(pendingAttachmentData)) {
            xyl.k(!this.s.contains(pendingAttachmentData));
            xyl.a(0, pendingAttachmentData.i);
            this.s.add(pendingAttachmentData);
            this.u.add(pendingAttachmentData);
            pendingAttachmentData.bL();
            if (pendingAttachmentData.i == 0) {
                pendingAttachmentData.i = 1;
                rtf rtfVar = new rtf(pendingAttachmentData, PendingAttachmentData.h, this, str);
                rtfVar.e(new Void[0]);
                pendingAttachmentData.j = rtfVar;
            }
            return false;
        }
        pendingAttachmentData.aj();
        return ax;
    }

    public final boolean V() {
        if (!this.u.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rtr
    public final boolean W(boolean z) {
        int i = 1;
        if (!z) {
            if (!this.q.isEmpty()) {
                return true;
            }
            return false;
        }
        return Collection.EL.stream(this.q).anyMatch(new rsi(i));
    }

    public final boolean X() {
        if (this.w != null) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        rsj rsjVar = this.v;
        if (rsjVar != null && !rsjVar.isCancelled()) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if (TextUtils.isEmpty(this.k) && this.q.isEmpty() && TextUtils.isEmpty(this.l) && this.w == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.myr
    public final /* synthetic */ alog a() {
        int i = alog.d;
        return alsx.a;
    }

    public final boolean aa() {
        if (this.g && this.h) {
            return true;
        }
        return false;
    }

    public final boolean ab() {
        if (this.g) {
            return false;
        }
        if (!ay()) {
            akrh e = aktp.e("DraftMessageData::requiresMmsForContent");
            try {
                if (!this.m && TextUtils.isEmpty(this.l) && !this.G.m()) {
                    if (!W(true)) {
                        e.close();
                    } else if (((adjc) this.U.b()).w(q())) {
                        int d = this.T.d();
                        e.close();
                        if (d != 1) {
                        }
                    }
                    return false;
                }
                e.close();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return true;
    }

    public final boolean ac() {
        amjk amjkVar = this.J;
        if (amjkVar != null) {
            nct nctVar = this.Y;
            amfg b2 = amfg.b(amjkVar.f);
            if (b2 == null) {
                b2 = amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
            }
            if (b2 != amfg.CONVERSATION_TYPE_GROUP_RCS && !amjkVar.j) {
                amjj b3 = amjj.b(amjkVar.k);
                if (b3 == null) {
                    b3 = amjj.UNKNOWN_SEND_MODE;
                }
                if (nct.g(b3)) {
                    boolean z = amjkVar.j;
                    int i = amjkVar.f;
                    amfg b4 = amfg.b(i);
                    if (b4 == null) {
                        b4 = amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
                    }
                    amfg amfgVar = amfg.CONVERSATION_TYPE_GROUP_RCS;
                    amfg b5 = amfg.b(i);
                    if (b5 == null) {
                        b5 = amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
                    }
                    amfg amfgVar2 = amfg.CONVERSATION_TYPE_ONE_ON_ONE;
                    if (!z && b4 != amfgVar) {
                        if (b5 == amfgVar2 && (amjkVar.b & 1024) != 0) {
                            ammc ammcVar = amjkVar.l;
                            if (ammcVar == null) {
                                ammcVar = ammc.a;
                            }
                            if (nctVar.e(ammcVar)) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean ad() {
        return this.Y.f(y());
    }

    public final boolean ae() {
        if (!this.g && !ab()) {
            return true;
        }
        return false;
    }

    public final boolean af(MessagePartCoreData messagePartCoreData) {
        if (((ojb) this.af.b()).a()) {
            if ((messagePartCoreData.bk() || messagePartCoreData.bz()) && this.g && messagePartCoreData.M() != ameb.FILE_CHOOSER) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean ag(boolean z) {
        boolean z2 = true;
        if (!this.h && !this.N) {
            z2 = false;
        }
        return av(z, z2);
    }

    public final boolean ah(boolean z) {
        boolean anyMatch = Collection.EL.stream(this.u).anyMatch(new rsi(0));
        rso rsoVar = new rso(anyMatch, z);
        xyo a2 = a.a();
        a2.H("updateLocationSupportConditions");
        a2.b(this.d);
        a2.A("hasLocationAttachment", anyMatch);
        a2.A("locationPushSupported", z);
        a2.q();
        this.L.set(rsoVar);
        if (rsoVar.a && !rsoVar.b) {
            return false;
        }
        return true;
    }

    public final void ai() {
        xyo e = a.e();
        e.H("draft not loaded.");
        e.b(this.d);
        e.q();
    }

    public final void aj(List list) {
        qxp qxpVar = new qxp(list, 10);
        alog aq = aq(qxpVar, this.q);
        if (aq.size() == list.size()) {
            aq.size();
        } else {
            aq(qxpVar, this.s).size();
            aq.size();
        }
    }

    public final void ak(rsm rsmVar) {
        this.e.remove(rsmVar);
    }

    public final void al(MessagePartCoreData messagePartCoreData) {
    }

    @Override // defpackage.myr
    public final String b() {
        return albo.ag(this.k);
    }

    @Override // defpackage.mys
    public final String c() {
        return albo.ag(this.l);
    }

    @Override // defpackage.mys
    public final boolean d() {
        return this.m;
    }

    @Override // defpackage.rqz
    protected final void g() {
        this.e.clear();
    }

    @Override // defpackage.myr, defpackage.mym
    public final /* synthetic */ String j() {
        return "text/plain";
    }

    @Override // defpackage.rtr
    public final int k() {
        return this.u.size();
    }

    public final int l() {
        if (!this.g && !ae()) {
            return an();
        }
        return ao();
    }

    public final int m() {
        akrh e = aktp.e("DraftMessageData::getDraftMessageType");
        try {
            int am = am(ab());
            e.close();
            return am;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int n() {
        boolean ay;
        if (this.g) {
            ay = false;
        } else {
            ay = ay();
        }
        return am(ay);
    }

    public final int o() {
        return p(m());
    }

    public final int q() {
        int a2;
        rsn rsnVar = this.f;
        if (rsnVar == null) {
            a2 = -1;
        } else {
            a2 = rsnVar.a();
        }
        this.n = a2;
        if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
            xyo d = a.d();
            d.H("getSelfSubId");
            d.x("selfSubId", this.n);
            d.q();
        }
        return this.n;
    }

    public final int r(MessagePartCoreData messagePartCoreData) {
        Iterator it = this.u.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MessagePartCoreData) it.next()).bD(messagePartCoreData)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final SelfIdentityId s() {
        if (((Boolean) ((utz) jbh.a.get()).e()).booleanValue()) {
            xyo d = a.d();
            d.H("getSelfId");
            d.z("selfId", this.Q);
            d.q();
        }
        return this.Q;
    }

    public final MessageCoreData t(boolean z) {
        MessageCoreData g;
        akrh e = aktp.e("DraftMessageData::createMessageWithCurrentAttachments");
        try {
            if (this.g) {
                g = this.ab.o(this.d, this.Q, ap(), this.k, this.P);
                if (this.i) {
                    g.bn();
                }
            } else if (ab()) {
                g = this.ab.f(this.d, this.Q, this.k, this.l, this.m);
            } else if (((oge) this.ag.b()).a() && ((oee) this.ah.b()).a() && !this.q.isEmpty()) {
                try {
                    g = this.ab.d(this.d, this.Q, this.k, ap());
                } catch (RuntimeException e2) {
                    alvw i = I.i();
                    i.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData", "createMessageWithCurrentAttachments", (char) 635, "DraftMessageData.java")).q("failed to draft as sms link file transfer, drafting without chat endpoint instead");
                    g = this.ab.g(this.d, this.Q, this.k);
                }
            } else {
                g = this.ab.g(this.d, this.Q, this.k);
            }
            ArrayList arrayList = new ArrayList(this.q.size());
            Iterator it = this.q.iterator();
            while (it.hasNext()) {
                arrayList.add(((MessagePartCoreData) it.next()).C());
            }
            ((MessageData) g).i.addAll(0, arrayList);
            ((MessageData) g).l = this.w;
            if (z) {
                G(true);
            }
            e.close();
            return g;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessageCoreData u(long j) {
        return v(j, true);
    }

    public final MessageCoreData v(long j, boolean z) {
        akrh e = aktp.e("DraftMessageData::prepareMessageForSending");
        try {
            xyl.k(!aw());
            this.k = ar(this.k);
            MessageCoreData t = t(z);
            t.bS(t.z(), t.t(), j);
            ((MessageData) t).n = y();
            e.close();
            return t;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessagePartCoreData w(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        int i = 9;
        alog aq = aq(new qxp(messagePartCoreData, i), this.q);
        if (aq.isEmpty()) {
            aq = aq(new qxp(messagePartCoreData, i), this.s);
        }
        return (MessagePartCoreData) Collection.EL.stream(aq).findFirst().orElse(null);
    }

    public final amfg x() {
        amfg amfgVar;
        akrh e = aktp.e("DraftMessageData::getConversationType");
        try {
            if (aa()) {
                amfgVar = amfg.CONVERSATION_TYPE_GROUP_RCS;
            } else if (this.h) {
                amfgVar = amfg.CONVERSATION_TYPE_GROUP_MMS;
            } else {
                amfgVar = amfg.CONVERSATION_TYPE_ONE_ON_ONE;
            }
            xyo a2 = a.a();
            a2.H("messageConversationType:");
            a2.H(amfgVar);
            a2.q();
            e.close();
            return amfgVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rtr
    public final amjk y() {
        amjk amjkVar;
        akrh e = aktp.e("DraftMessageData::getDraftProtocolConditions");
        try {
            rso rsoVar = (rso) this.L.get();
            if (this.J == null && this.K == null && rsoVar == null) {
                amjkVar = null;
            } else {
                aozy createBuilder = amjk.a.createBuilder();
                boolean z = !this.u.isEmpty();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amjk amjkVar2 = (amjk) createBuilder.b;
                amjkVar2.b |= 16384;
                amjkVar2.p = z;
                amjk amjkVar3 = this.J;
                if (amjkVar3 != null) {
                    createBuilder.w(amjkVar3);
                }
                amjz amjzVar = this.K;
                if (amjzVar != null) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amjk amjkVar4 = (amjk) createBuilder.b;
                    amjkVar4.m = amjzVar;
                    amjkVar4.b |= 2048;
                }
                if (rsoVar != null) {
                    boolean z2 = rsoVar.a;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    amjk amjkVar5 = (amjk) apagVar;
                    amjkVar5.b |= 4096;
                    amjkVar5.n = z2;
                    boolean z3 = rsoVar.b;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    amjk amjkVar6 = (amjk) createBuilder.b;
                    amjkVar6.b |= 8192;
                    amjkVar6.o = z3;
                }
                amjkVar = (amjk) createBuilder.s();
            }
            e.close();
            return amjkVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Stream z() {
        return Collection.EL.stream(this.u).filter(new qxi(18));
    }
}
