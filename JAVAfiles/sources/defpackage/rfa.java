package defpackage;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfa {
    public final armf A;
    public final armf B;
    public final armf C;
    public final armf D;
    public final armf E;
    public final anen F;
    public final armf G;
    public final apwt H;
    public final armf I;
    public final armf J;
    public final ahqr K;
    public final armf L;
    public final armf M;
    public final armf N;
    public final armf O;
    public final armf P;
    public final armf Q;
    public final armf R;
    public final armf S;
    private final armf U;
    private final armf V;
    private final armf W;
    private final armf X;
    private final armf Y;
    private final armf Z;
    private final armf aa;
    private final armf ab;
    private final armf ac;
    private final armf ad;
    private final armf ae;
    private final armf af;
    private final Optional ag;
    private final armf ah;
    private final armf ai;
    private final armf aj;
    private final armf ak;
    private final armf al;
    private final Optional am;
    private final armf an;
    private final armf ao;
    private final armf ap;
    private final pmz aq;
    private final vco ar;
    public final Context d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final armf s;
    public final armf t;
    public final armf u;
    public final armf v;
    public final armf w;
    public final armf x;
    public final armf y;
    public final armf z;
    public static final alhr a = uuh.w("update_participant_with_received_sms_v2");
    public static final xze b = xze.g("BugleDataModel", "ReceiveSmsMessageHelper");
    public static final alwo c = alwo.o("Bugle");
    private static final alwo T = alwo.o("BugleNotifications");

    public rfa(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, Optional optional, armf armfVar38, armf armfVar39, anen anenVar, armf armfVar40, armf armfVar41, apwt apwtVar, armf armfVar42, armf armfVar43, armf armfVar44, ahqr ahqrVar, armf armfVar45, armf armfVar46, armf armfVar47, armf armfVar48, armf armfVar49, Optional optional2, armf armfVar50, armf armfVar51, armf armfVar52, armf armfVar53, armf armfVar54, armf armfVar55, armf armfVar56, armf armfVar57, armf armfVar58, vco vcoVar, pmz pmzVar) {
        this.d = context;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = armfVar6;
        this.ac = armfVar13;
        this.ad = armfVar15;
        this.ae = armfVar24;
        this.k = armfVar7;
        this.U = armfVar8;
        this.l = armfVar9;
        this.V = armfVar10;
        this.m = armfVar11;
        this.n = armfVar12;
        this.W = armfVar14;
        this.X = armfVar16;
        this.Y = armfVar17;
        this.Z = armfVar18;
        this.o = armfVar19;
        this.aa = armfVar20;
        this.p = armfVar21;
        this.ab = armfVar22;
        this.q = armfVar23;
        this.r = armfVar25;
        this.s = armfVar26;
        this.t = armfVar27;
        this.u = armfVar28;
        this.v = armfVar29;
        this.w = armfVar30;
        this.x = armfVar31;
        this.y = armfVar32;
        this.z = armfVar33;
        this.A = armfVar34;
        this.B = armfVar35;
        this.C = armfVar36;
        this.af = armfVar37;
        this.ag = optional;
        this.D = armfVar39;
        this.E = armfVar40;
        this.F = anenVar;
        this.ah = armfVar38;
        this.G = armfVar41;
        this.H = apwtVar;
        this.I = armfVar42;
        this.J = armfVar43;
        this.ai = armfVar44;
        this.K = ahqrVar;
        this.L = armfVar46;
        this.M = armfVar47;
        this.ak = armfVar48;
        this.al = armfVar49;
        this.am = optional2;
        this.N = armfVar50;
        this.O = armfVar51;
        this.an = armfVar52;
        this.aj = armfVar45;
        this.P = armfVar53;
        this.R = armfVar54;
        this.S = armfVar55;
        this.ao = armfVar56;
        this.Q = armfVar57;
        this.ap = armfVar58;
        this.ar = vcoVar;
        this.aq = pmzVar;
    }

    public final Cursor a(msh mshVar) {
        try {
            return ((yce) this.aa.b()).c(mshVar);
        } catch (IllegalArgumentException e) {
            xyo b2 = b.b();
            b2.H("IllegalArgumentException when performing query");
            b2.r(e);
            return null;
        } catch (SecurityException e2) {
            xyo b3 = b.b();
            b3.H("SecurityException when performing query");
            b3.r(e2);
            return null;
        }
    }

    public final Uri b(final ContentValues contentValues, boolean z, boolean z2) {
        int i;
        Optional a2;
        akrh e = aktp.e("ReceiveSmsMessageHelper.saveToTelephony");
        try {
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            contentValues.put("read", i);
            contentValues.put("seen", (Integer) 1);
            Integer num = 0;
            try {
                Integer asInteger = contentValues.getAsInteger("m_cls");
                if (asInteger != null) {
                    num = asInteger;
                }
                contentValues.remove("m_cls");
                a2 = ((wzx) this.ao.b()).a(new arqg() { // from class: req
                    @Override // defpackage.arqg
                    public final Object a() {
                        return rfa.this.d.getContentResolver().insert(Telephony.Sms.Inbox.CONTENT_URI, contentValues);
                    }
                });
            } catch (NullPointerException e2) {
                b.r("Failed to insert SMS into telephony: got NPE from platform", e2);
                contentValues.put("m_cls", num);
            }
            if (a2.isPresent()) {
                Uri uri = (Uri) a2.get();
                contentValues.put("m_cls", num);
                Uri withAppendedId = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, ContentUris.parseId(uri));
                xyo a3 = b.a();
                a3.H("Inserted SMS message into telephony.");
                a3.z("inbox uri", uri);
                a3.z("messageUri", withAppendedId);
                a3.A("read", z);
                a3.A("notified", z2);
                a3.z("threadId", contentValues.getAsString("thread_id"));
                a3.q();
                this.ag.ifPresent(new rbc(2));
                ((Optional) ((apxx) this.ah).a).ifPresent(new rbc(3));
                e.close();
                return withAppendedId;
            }
            ((alwl) ((alwl) c.i()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "saveToTelephony", 2316, "ReceiveSmsMessageHelper.java")).q("Failed to save to telephony. Returning null URI");
            e.close();
            return null;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [apwt, java.lang.Object] */
    public final ret c(final res resVar) {
        Throwable th;
        long j;
        String str;
        int i;
        int i2;
        ibi ibiVar;
        akrh e;
        Throwable th2;
        MessageIdType B;
        ConversationIdType z;
        rfa rfaVar;
        res resVar2;
        ParticipantsTable.BindData bindData;
        ashu ashuVar;
        ConversationIdType conversationIdType;
        ret retVar;
        ParticipantsTable.BindData bindData2;
        String str2;
        akrh h;
        akrh e2 = aktp.e("ReceiveSmsMessageHelper.insertMessageInBugleDb");
        try {
            xze xzeVar = b;
            xzeVar.l("insertMessageInBugleDb");
            ahqq d = this.K.d();
            try {
                if (resVar.l) {
                    xyo c2 = xzeVar.c();
                    c2.H("skip writing to local database.");
                    c2.z("messageUri", resVar.h);
                    c2.q();
                    retVar = null;
                } else {
                    xyl.f(yhx.g(this.d));
                    ContentValues contentValues = resVar.b;
                    final ParticipantsTable.BindData bindData3 = resVar.c;
                    final ConversationIdType conversationIdType2 = resVar.e;
                    final Uri uri = resVar.h;
                    final tqc tqcVar = resVar.k;
                    final long j2 = resVar.g;
                    final boolean z2 = resVar.i;
                    final boolean z3 = resVar.j;
                    final tqr tqrVar = resVar.m;
                    final long j3 = resVar.n;
                    final String asString = contentValues.getAsString("body");
                    final String asString2 = contentValues.getAsString("subject");
                    Long asLong = contentValues.getAsLong("date_sent");
                    if (asLong != null) {
                        j = asLong.longValue();
                    } else {
                        j = 0;
                    }
                    final int i3 = resVar.a;
                    final qwm f = ((ryg) this.U.b()).f(i3);
                    Integer asInteger = contentValues.getAsInteger("reply_path_present");
                    String asString3 = contentValues.getAsString("service_center");
                    if (asInteger != null && asInteger.intValue() == 1 && !TextUtils.isEmpty(asString3)) {
                        str = asString3;
                    } else {
                        str = null;
                    }
                    final String P = bindData3.P();
                    Integer asInteger2 = contentValues.getAsInteger("m_cls");
                    if (asInteger2 != null) {
                        i = a.ag(asInteger2.intValue());
                    } else {
                        i = 1;
                    }
                    if (i == 0) {
                        i2 = 1;
                    } else {
                        i2 = i;
                    }
                    try {
                        ((rwd) this.g.b()).k(conversationIdType2);
                        qiu.h(yyb.ax(amgj.INCOMING));
                        ibiVar = (ibi) this.H.b();
                        e = aktp.e("OnSmsMessageReceivedCompositeListener.beforeMessageInserted");
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        try {
                            e2.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                            throw th;
                        }
                    }
                    try {
                        Iterator it = ((Set) ibiVar.a.b()).iterator();
                        while (it.hasNext()) {
                            try {
                                rwp rwpVar = (rwp) it.next();
                                Iterator it2 = it;
                                h = rwpVar.h();
                                try {
                                    rwpVar.j();
                                    armd.i(h, null);
                                    it = it2;
                                } catch (Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                                try {
                                    throw th2;
                                } catch (Throwable th8) {
                                    armd.i(e, th2);
                                    throw th8;
                                }
                            }
                        }
                        armd.i(e, null);
                        final long j4 = j;
                        final String str3 = str;
                        try {
                            MessageCoreData messageCoreData = (MessageCoreData) ((agnq) this.ae.b()).c("ReceiveSmsMessageHelper#insertMessageInBugleDb", new alhr() { // from class: reo
                                /* JADX WARN: Type inference failed for: r4v8, types: [apwt, java.lang.Object] */
                                @Override // defpackage.alhr
                                public final Object get() {
                                    rfa rfaVar2 = rfa.this;
                                    rxq rxqVar = (rxq) rfaVar2.e.b();
                                    ParticipantsTable.BindData bindData4 = bindData3;
                                    rxqVar.g(bindData4);
                                    boolean booleanValue = ((Boolean) qpf.a.e()).booleanValue();
                                    ConversationIdType conversationIdType3 = conversationIdType2;
                                    tqc tqcVar2 = tqcVar;
                                    res resVar3 = resVar;
                                    if (booleanValue) {
                                        if (sni.a(conversationIdType3) == null) {
                                            int i4 = i3;
                                            ((alwl) rfa.c.a(Level.WARNING).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "insertMessageInBugleDb", 1369, "ReceiveSmsMessageHelper.java")).t("Conversation disappeared, %s", conversationIdType3);
                                            ((alwl) rfa.c.a(Level.INFO).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "getOrCreateConversationWithBcm", 1677, "ReceiveSmsMessageHelper.java")).q("Attempting to recreate conversation with BCM");
                                            qpj qpjVar = (qpj) rfaVar2.G.b();
                                            String P2 = bindData4.P();
                                            P2.getClass();
                                            conversationIdType3 = qpjVar.b(P2, new rek(rfaVar2, bindData4, i4, tqcVar2, 0)).x();
                                            ((alwl) rfa.c.a(Level.WARNING).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "insertMessageInBugleDb", 1375, "ReceiveSmsMessageHelper.java")).t("Created conversation with BCM, created conversationId: %s", conversationIdType3);
                                        }
                                    } else {
                                        ConversationIdType j5 = ((ibi) rfaVar2.i.b()).j(resVar3.d, tqcVar2, bindData4);
                                        if (!j5.equals(conversationIdType3)) {
                                            xyo e3 = rfa.b.e();
                                            e3.H("conversation is changed while inserting message.");
                                            e3.b(conversationIdType3);
                                            e3.H("->");
                                            e3.b(j5);
                                            e3.q();
                                        }
                                        conversationIdType3 = j5;
                                    }
                                    if (uzz.f() && resVar3.f) {
                                        if (!resVar3.p) {
                                            lpg.y(conversationIdType3);
                                        }
                                    }
                                    long j6 = j3;
                                    boolean z4 = z3;
                                    boolean z5 = z2;
                                    long j7 = j2;
                                    long j8 = j4;
                                    String str4 = asString2;
                                    String str5 = asString;
                                    qwm qwmVar = f;
                                    MessageCoreData j9 = ((tqx) rfaVar2.y.b()).j(uri, conversationIdType3, bindData4.M(), qwmVar.g(), str5, str4, j8, j7, z5, z4, j6);
                                    ibi ibiVar2 = (ibi) rfaVar2.H.b();
                                    akrh e4 = aktp.e("OnSmsMessageReceivedCompositeListener.onBeforeInsertedInTransaction");
                                    try {
                                        for (rwp rwpVar2 : (Set) ibiVar2.a.b()) {
                                            akrh h2 = rwpVar2.h();
                                            try {
                                                rwpVar2.g();
                                                armd.i(h2, null);
                                            } finally {
                                            }
                                        }
                                        armd.i(e4, null);
                                        ((tzn) rfaVar2.B.b()).i(j9);
                                        MessageIdType a2 = ((rvw) rfaVar2.N.b()).a(j9);
                                        if (!j9.cs()) {
                                            akrh e5 = aktp.e("ReceiveSmsMessageHelper.extractAndPersistOtp");
                                            try {
                                                ((xwj) rfaVar2.n.b()).c(j9);
                                                String str6 = str3;
                                                e5.close();
                                                ((ruq) rfaVar2.h.b()).f(conversationIdType3, j9.B(), Long.valueOf(j9.n()), tqcVar2, str6, true);
                                                ((weo) rfaVar2.J.b()).a(conversationIdType3);
                                                ((uhj) rfaVar2.v.b()).e(conversationIdType3, true);
                                            } finally {
                                            }
                                        }
                                        tqr tqrVar2 = tqrVar;
                                        String M = bindData4.M();
                                        uuf uufVar = rxn.a;
                                        ParticipantsTable.BindData a3 = ParticipantsTable.a(M);
                                        if (tqrVar2.a() && a3 != null && a3.A().a()) {
                                            sya syaVar = new sya();
                                            syaVar.aj("insertMessageInBugleDb-messages");
                                            syc sycVar = new syc();
                                            sycVar.i(a2);
                                            syaVar.O(sycVar);
                                            syaVar.M(tqrVar2);
                                            syaVar.a().e();
                                            tbb f2 = ParticipantsTable.f();
                                            f2.aj("insertMessageInBugleDb-participants");
                                            tbd tbdVar = new tbd();
                                            tbdVar.h(a3.M());
                                            f2.L(tbdVar);
                                            f2.D(((xvc) rfaVar2.s.b()).b(null, tqrVar2));
                                            if (f2.a().e() > 0) {
                                                ((rtz) rfaVar2.f.b()).P(a3.M());
                                            }
                                        }
                                        ParticipantsTable.BindData e6 = rxn.e(rfaVar2.d, a3, P);
                                        if (e6 != null && !tqrVar2.a()) {
                                            if (e6.s() == -3) {
                                                ((rjj) rfaVar2.u.b()).a(e6).x(115, TimeUnit.SECONDS.toMillis(10L));
                                            }
                                            ((uhg) rfaVar2.x.b()).c(e6);
                                            ((rtz) rfaVar2.f.b()).P(bindData4.M());
                                            a3 = e6;
                                        }
                                        ((rys) rfaVar2.w.b()).b(conversationIdType3, a3, j9);
                                        return j9;
                                    } catch (Throwable th9) {
                                        try {
                                            throw th9;
                                        } catch (Throwable th10) {
                                            armd.i(e4, th9);
                                            throw th10;
                                        }
                                    }
                                }
                            });
                            if (messageCoreData == null) {
                                B = rvc.a;
                            } else {
                                B = messageCoreData.B();
                            }
                            xyo c3 = b.c();
                            c3.H("Received SMS message.");
                            c3.c(B);
                            c3.t(',');
                            if (messageCoreData == null) {
                                z = ruy.a;
                            } else {
                                z = messageCoreData.z();
                            }
                            c3.b(z);
                            c3.z(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
                            c3.q();
                            if (messageCoreData != null) {
                                rfaVar = this;
                                ibi ibiVar2 = (ibi) rfaVar.H.b();
                                akrh e3 = aktp.e("OnSmsMessageReceivedCompositeListener.afterMessageInsertedInCriticalPath");
                                try {
                                    for (rwp rwpVar2 : (Set) ibiVar2.a.b()) {
                                        h = rwpVar2.h();
                                        try {
                                            rwpVar2.i(messageCoreData);
                                            armd.i(h, null);
                                        } finally {
                                        }
                                    }
                                    ashuVar = null;
                                    armd.i(e3, null);
                                    rfaVar.am.isPresent();
                                    bindData = bindData3;
                                    qiu.h(((ptb) rfaVar.ai.b()).b(((msk) rfaVar.I.b()).s(bindData), messageCoreData));
                                    String aw = messageCoreData.aw();
                                    if (aw != null) {
                                        uuf uufVar = rxn.a;
                                        bindData2 = ParticipantsTable.a(aw);
                                    } else {
                                        bindData2 = null;
                                    }
                                    ((ahmv) rfaVar.V.b()).j(messageCoreData, null);
                                    mho mhoVar = (mho) rfaVar.W.b();
                                    resVar2 = resVar;
                                    int i4 = resVar2.a;
                                    amgl amglVar = (amgl) amgu.a.createBuilder();
                                    if (!amglVar.b.isMutable()) {
                                        amglVar.u();
                                    }
                                    amgu amguVar = (amgu) amglVar.b;
                                    amguVar.h = 2;
                                    amguVar.b = 2 | amguVar.b;
                                    boolean cz = messageCoreData.cz();
                                    if (!amglVar.b.isMutable()) {
                                        amglVar.u();
                                    }
                                    amgu amguVar2 = (amgu) amglVar.b;
                                    amguVar2.c |= 1073741824;
                                    amguVar2.aj = cz;
                                    if (!amglVar.b.isMutable()) {
                                        amglVar.u();
                                    }
                                    amgu amguVar3 = (amgu) amglVar.b;
                                    amguVar3.aw = i2 - 1;
                                    amguVar3.d |= 2048;
                                    mhoVar.M(messageCoreData, i4, amglVar);
                                    alwo alwoVar = T;
                                    ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "insertMessageInBugleDb", 1577, "ReceiveSmsMessageHelper.java")).q("Creating notification from ReceiveSmsMessageHelper");
                                    if (!rfaVar.aq.a() || !messageCoreData.cs()) {
                                        if (uzz.g() && !resVar2.p) {
                                            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "insertMessageInBugleDb", 1581, "ReceiveSmsMessageHelper.java")).q("Conversation is not allowed by parents. Posting unapproved notification.");
                                            rfaVar.ar.r(new BugleConversationId(messageCoreData.z()));
                                        } else {
                                            ((wpp) rfaVar.aj.b()).I(messageCoreData.z(), Duration.ofMillis(messageCoreData.n()), false);
                                        }
                                    }
                                    ((Optional) rfaVar.Y.b()).ifPresent(new ksn(messageCoreData, bindData2, 18));
                                    tqr tqrVar2 = tqr.VERIFICATION_NA;
                                    if (bindData2 != null) {
                                        tqrVar2 = bindData2.A();
                                    }
                                    if (!tqrVar.a() && !tqrVar2.a()) {
                                        str2 = P;
                                        if (((xca) rfaVar.o.b()).k(str2)) {
                                        }
                                    } else {
                                        str2 = P;
                                    }
                                    ((mho) rfaVar.W.b()).q(albo.ag(str2), resVar2.a, B.a(), albo.ag(asString), tqrVar);
                                    if (z3) {
                                        ((mho) rfaVar.W.b()).p(albo.ag(str2), resVar2.a, B.a(), albo.ag(asString), tqrVar);
                                    }
                                    if (!tqrVar.a() && tqrVar2.a()) {
                                        ((mho) rfaVar.W.b()).Z(albo.ag(str2), resVar2.a, B.a());
                                    }
                                } finally {
                                }
                            } else {
                                rfaVar = this;
                                resVar2 = resVar;
                                bindData = bindData3;
                                ashuVar = null;
                            }
                            if (((Boolean) qpf.a.e()).booleanValue()) {
                                conversationIdType = messageCoreData.z();
                            } else {
                                conversationIdType = conversationIdType2;
                            }
                            ((uhj) rfaVar.v.b()).j(conversationIdType, B, new String[0]);
                            xzb.b = false;
                            ((mgv) rfaVar.Z.b()).c(new ahka("SMS received"));
                            rfaVar.K.f(d, new ahka("ReceiveSmsMessageHelper#insertMessageInBugleDb"), ashuVar, ahqp.SUCCESS);
                            retVar = new ret(messageCoreData, bindData, B, conversationIdType, new xhv(resVar2.d), resVar2.f, resVar2.g, resVar2.a, resVar2.o);
                        } catch (Throwable th9) {
                            th = th9;
                            th = th;
                            e2.close();
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                e2.close();
                return retVar;
            } catch (Throwable th11) {
                th = th11;
                e2.close();
                throw th;
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }

    public final reu d(ret retVar, wng wngVar) {
        if (!yhx.g(this.d) && wngVar != null) {
            rbk.f(2, wngVar);
        }
        ParticipantsTable.BindData bindData = retVar.b;
        ConversationIdType conversationIdType = retVar.d;
        ((vjs) this.ap.b()).f();
        return new reu(retVar.a, retVar.c, conversationIdType, bindData, retVar.e, retVar.f, retVar.g, retVar.h, retVar.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r8 = defpackage.rfa.b;
        r8.q("Received an SMS with an invalid address, attempting to fetch matching contact.");
        r0 = a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c0, code lost:
    
        r0 = r2.r(r1, ((java.lang.Boolean) new defpackage.mss(16).get()).booleanValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (r2.w() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d9, code lost:
    
        if (r0 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        r8.q("Failed to find a better address from matching contact.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r0.moveToNext() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        r2 = r0.getString(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        r2 = ((defpackage.msk) r7.I.b()).v(((defpackage.msk) r7.I.b()).c(r2, new defpackage.qwq(r1, 13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        r8.addSuppressed(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0070, code lost:
    
        if (defpackage.msx.g(r8) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (r1.E() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rew e(android.content.ContentValues r8, int r9) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfa.e(android.content.ContentValues, int):rew");
    }

    public final tqc f(msh mshVar, boolean z) {
        String o = mshVar.o(((Boolean) new mss(15).get()).booleanValue());
        if (((xbf) this.r.b()).b().contains(o)) {
            return tqc.SPAM_FOLDER;
        }
        if (o == null) {
            return tqc.UNARCHIVED;
        }
        return ((rwd) this.g.b()).A(ruy.a, o, z, false);
    }

    public final akul g(final int i, final ContentValues contentValues, final tqr tqrVar, final long j, final rev revVar) {
        akul a2;
        akrh e = aktp.e("ReceiveSmsMessageHelper#insertMessageInTelephonyFuture");
        try {
            final ahqq d = this.K.d();
            rew e2 = e(contentValues, i);
            msh g = ((msk) this.I.b()).g(e2.a, new qwq(e2.b, 14));
            wnq wnqVar = (wnq) this.ab.b();
            String asString = contentValues.getAsString("body");
            if (TextUtils.isEmpty(asString)) {
                a2 = aktp.ag(false);
            } else {
                a2 = wnqVar.a(asString, i, 0);
            }
            final akul akulVar = a2;
            final akul i2 = akulVar.i(new tuy(this, contentValues, i, g, 1), this.F);
            final akul i3 = aktp.an(akulVar, i2).i(new ancr() { // from class: rel
                @Override // defpackage.ancr
                public final ListenableFuture a() {
                    Boolean bool = (Boolean) albo.bQ(akulVar);
                    bool.booleanValue();
                    final Optional optional = (Optional) albo.bQ(i2);
                    final boolean booleanValue = ((Boolean) new mss(15).get()).booleanValue();
                    akrh e3 = aktp.e("ReceiveSmsMessageHelper.insertMessageInTelephony");
                    final int i4 = i;
                    final tqr tqrVar2 = tqrVar;
                    final long j2 = j;
                    final rev revVar2 = revVar;
                    final rfa rfaVar = rfa.this;
                    final ContentValues contentValues2 = contentValues;
                    try {
                        rfa.b.l("insertMessageInTelephony");
                        akul h = aktp.ag(bool).h(new algk() { // from class: rej
                            @Override // defpackage.algk
                            public final Object apply(Object obj) {
                                long j3;
                                boolean z;
                                tqc z2;
                                long j4;
                                rut rutVar;
                                tqc tqcVar;
                                boolean z3;
                                boolean z4;
                                boolean z5;
                                boolean z6;
                                boolean z7;
                                Boolean bool2 = (Boolean) obj;
                                xzb.b = true;
                                rfa rfaVar2 = rfa.this;
                                ContentValues contentValues3 = contentValues2;
                                int i5 = i4;
                                rew e4 = rfaVar2.e(contentValues3, i5);
                                String o = e4.a.o(((Boolean) new mss(15).get()).booleanValue());
                                ParticipantsTable.BindData bindData = e4.b;
                                contentValues3.put("address", o);
                                Long asLong = contentValues3.getAsLong("date");
                                if (asLong == null) {
                                    rfa.b.q("Received an SMS without a received date/time.");
                                }
                                if (asLong != null) {
                                    j3 = asLong.longValue();
                                } else {
                                    j3 = 0;
                                }
                                long j5 = j3;
                                rev revVar3 = revVar2;
                                long j6 = j2;
                                tqr tqrVar3 = tqrVar2;
                                ((wzp) rfaVar2.C.b()).i(j5);
                                long j7 = -1;
                                if (bool2.booleanValue()) {
                                    long f = ((wyt) rfaVar2.l.b()).f(wxr.a, o);
                                    if (f == -1) {
                                        rfa.b.m("Resolved thread to an INVALID_THREAD_ID!");
                                        f = -1;
                                    }
                                    contentValues3.put("thread_id", Long.valueOf(f));
                                    return new res(i5, contentValues3, bindData, f, ruy.a, false, j5, rfaVar2.b(contentValues3, true, true), true, true, tqc.UNARCHIVED, true, tqrVar3, j6, revVar3, true);
                                }
                                boolean z8 = booleanValue;
                                msh g2 = ((msk) rfaVar2.I.b()).g(e4.a, new qwq(bindData, 14));
                                if (!g2.x(z8) && ((xxh) rfaVar2.D.b()).d(g2)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (((Boolean) qpf.a.e()).booleanValue()) {
                                    Optional optional2 = optional;
                                    albo.y(optional2.isPresent());
                                    if (uzz.f()) {
                                        aibf aibfVar = new aibf();
                                        aibfVar.j(((rer) optional2.get()).a.x());
                                        aibfVar.k(((rer) optional2.get()).b);
                                        rutVar = aibfVar.i();
                                    } else {
                                        rutVar = rut.a(((rer) optional2.get()).a.x());
                                    }
                                    tqc f2 = rfaVar2.f(g2, z);
                                    smr smrVar = ((rer) optional2.get()).a;
                                    armf armfVar = rfaVar2.L;
                                    ConversationIdType x = smrVar.x();
                                    xhv a3 = ((qos) armfVar.b()).a(x);
                                    if (a3.c()) {
                                        j7 = a3.a();
                                    } else {
                                        rfa.b.q(hht.b(x, "Unable to find threadId for conversation [", "]"));
                                    }
                                    tqcVar = f2;
                                    j4 = j5;
                                } else {
                                    j7 = ((wyt) rfaVar2.l.b()).e(o);
                                    contentValues3.put("thread_id", Long.valueOf(j7));
                                    albo.y(!((Boolean) qpf.a.e()).booleanValue());
                                    String o2 = g2.o(((Boolean) new mss(15).get()).booleanValue());
                                    if (((xbf) rfaVar2.r.b()).b().contains(o2)) {
                                        z2 = tqc.SPAM_FOLDER;
                                    } else if (TextUtils.isEmpty(o2)) {
                                        z2 = tqc.UNARCHIVED;
                                    } else {
                                        z2 = ((rwd) rfaVar2.g.b()).z(j7, o2, z, false);
                                    }
                                    j4 = j5;
                                    rex rexVar = new rex(((ibi) rfaVar2.i.b()).g(j7, z2, bindData, -1L), z2);
                                    rutVar = rexVar.a;
                                    tqcVar = rexVar.b;
                                }
                                long j8 = j7;
                                ConversationIdType conversationIdType = rutVar.a;
                                xyl.l(conversationIdType);
                                xyl.l(rutVar);
                                boolean c2 = ((ubl) rfaVar2.j.b()).c(conversationIdType);
                                boolean c3 = ((ubl) rfaVar2.j.b()).c(conversationIdType);
                                if (yhx.g(rfaVar2.d)) {
                                    rfa.b.l("Not inserting received SMS message for secondary user.");
                                    return new res(i5, contentValues3, bindData, j8, conversationIdType, rutVar.b, j4, null, false, false, tqcVar, false, tqrVar3, j6, revVar3, true);
                                }
                                Boolean asBoolean = contentValues3.getAsBoolean("read");
                                if (asBoolean != null && asBoolean.booleanValue()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!c2 && !bool2.booleanValue()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                boolean z9 = (!qrl.a()) & (z3 | z4);
                                if (!z9 && !c3 && !z && !bool2.booleanValue() && !((zai) rfaVar2.m.b()).b(conversationIdType)) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (c2) {
                                    if (qrl.a()) {
                                        rfa.b.o("New SMS is in focus");
                                    } else {
                                        rfa.b.o("New SMS is read because messageInFocused");
                                    }
                                } else if (z9) {
                                    rfa.b.o("New SMS is read because Sms.Inbox.READ");
                                } else if (c3) {
                                    rfa.b.o("New SMS is notified because messageInObservable");
                                } else if (z) {
                                    rfa.b.o("New SMS is notified because blocked");
                                }
                                if (uzz.f()) {
                                    if (uzz.g()) {
                                        z6 = ((mnb) rfaVar2.Q.b()).c(conversationIdType, alog.r(g2), rutVar.b);
                                    } else {
                                        new uxg(conversationIdType, alog.r(g2), rutVar.b);
                                        z6 = true;
                                    }
                                    if (!z5 && z6) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    return new res(i5, contentValues3, bindData, j8, rutVar.a, rutVar.b, j4, rfaVar2.b(contentValues3, z9, z7), z7, z9, tqcVar, bool2.booleanValue(), tqrVar3, j6, revVar3, z6);
                                }
                                return new res(i5, contentValues3, bindData, j8, rutVar.a, rutVar.b, j4, rfaVar2.b(contentValues3, z9, z5), z5, z9, tqcVar, bool2.booleanValue(), tqrVar3, j6, revVar3, true);
                            }
                        }, rfaVar.F);
                        e3.close();
                        return h;
                    } catch (Throwable th) {
                        try {
                            e3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.F);
            akul h = aktp.ap(i2, i3).h(new Callable() { // from class: rem
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    akul a3;
                    akul akulVar2 = i3;
                    rfa rfaVar = rfa.this;
                    if (qpi.a()) {
                        int i4 = i;
                        ContentValues contentValues2 = contentValues;
                        Optional optional = (Optional) albo.bQ(i2);
                        res resVar = (res) albo.bQ(akulVar2);
                        rew e3 = rfaVar.e(contentValues2, i4);
                        Optional map = optional.map(new rbs(10));
                        if (((Boolean) qpf.a.e()).booleanValue()) {
                            a3 = aktp.ag(null);
                        } else if (!qpi.a()) {
                            a3 = aktp.ag(null);
                        } else if (resVar.l) {
                            a3 = aktp.ag(null);
                        } else {
                            a3 = ((qrj) rfaVar.E.b()).a(resVar.e, resVar.f, map, alog.r(albo.ag(e3.a.o(((Boolean) new mss(15).get()).booleanValue()))), amra.RECEIVE_SMS_MESSAGE_HELPER);
                        }
                        qiu.h(a3);
                    }
                    rfaVar.K.f(d, new ahka("ReceiveSmsMessageHelper#InsertMessageInTelephonyByBlockingExecutor"), null, ahqp.SUCCESS);
                    return (res) albo.bQ(akulVar2);
                }
            }, this.F);
            e.b(h);
            e.close();
            return h;
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [msh, java.lang.Object] */
    public final void h(reu reuVar) {
        tqs tqsVar;
        String str;
        MessageIdType messageIdType = reuVar.a;
        if (messageIdType.b()) {
            xyo e = b.e();
            e.H("Null messageId. Bailing out of launchNonCriticalActionsForReceivedMessage");
            e.q();
            return;
        }
        ((rzc) this.X.b()).a(messageIdType);
        rev revVar = reuVar.h;
        UUID randomUUID = UUID.randomUUID();
        if (revVar.c) {
            tqsVar = tqs.SMS_EMAIL;
        } else {
            tqsVar = tqs.SMS_TELEPHONY;
        }
        tqs tqsVar2 = tqsVar;
        Optional b2 = ((ryg) this.U.b()).f(reuVar.g).b();
        if (b2.isPresent()) {
            str = b2.get().m();
        } else {
            str = "UNKNOWN_MI";
        }
        alob alobVar = new alob();
        alobVar.h(new rwi(tqk.FROM_SMS_ORIGINATING, reuVar.h.a));
        alobVar.h(new rwi(tqk.SELF, albo.ag(str)));
        rev revVar2 = reuVar.h;
        if (!albo.ar(revVar2.b, revVar2.a)) {
            alobVar.h(new rwi(tqk.FROM_SMS_DISPLAY_ORIGINATING, reuVar.h.b));
        }
        ((rwj) this.an.b()).c(randomUUID, reuVar.a, reuVar.f, alobVar.g(), tqsVar2, reuVar.g);
        xhv xhvVar = reuVar.d;
        if (((Boolean) qpf.a.e()).booleanValue() && xhvVar.d()) {
            alwo alwoVar = c;
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "launchNonCriticalActionsForReceivedMessage", 1847, "ReceiveSmsMessageHelper.java")).t("second chance lookup for thread id for conversation [%s]", reuVar.b);
            xhv a2 = ((qos) this.L.b()).a(reuVar.b);
            if (a2.c()) {
                ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "launchNonCriticalActionsForReceivedMessage", 1854, "ReceiveSmsMessageHelper.java")).D("Found thread id [%s] for conversation [%s]", a2, reuVar.b);
            } else {
                ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "launchNonCriticalActionsForReceivedMessage", 1857, "ReceiveSmsMessageHelper.java")).t("Still unable to find thread id for conversation [%s]", reuVar.b);
            }
            xhvVar = a2;
        }
        if (((Boolean) ((utz) a.get()).e()).booleanValue() && !reuVar.e) {
            if (((Boolean) ((utz) rxz.b.get()).e()).booleanValue()) {
                ((xhi) this.ak.b()).b(reuVar.c, xhvVar, reuVar.b);
            } else {
                ((xhi) this.ak.b()).a(reuVar.c, xhvVar, reuVar.b);
                ((rxz) this.al.b()).d(reuVar.c, reuVar.b);
            }
        }
    }
}
