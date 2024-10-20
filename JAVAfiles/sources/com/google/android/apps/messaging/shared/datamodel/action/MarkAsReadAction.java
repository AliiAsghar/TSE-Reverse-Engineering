package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.agnq;
import defpackage.agxw;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.albo;
import defpackage.alia;
import defpackage.alwo;
import defpackage.amdy;
import defpackage.amhc;
import defpackage.amwh;
import defpackage.aozy;
import defpackage.armf;
import defpackage.mbl;
import defpackage.mho;
import defpackage.qih;
import defpackage.qik;
import defpackage.qxs;
import defpackage.qza;
import defpackage.ray;
import defpackage.rix;
import defpackage.rjm;
import defpackage.rto;
import defpackage.ruy;
import defpackage.rvc;
import defpackage.rvy;
import defpackage.rwd;
import defpackage.sxy;
import defpackage.sya;
import defpackage.syb;
import defpackage.syc;
import defpackage.uac;
import defpackage.ugy;
import defpackage.uhj;
import defpackage.uyh;
import defpackage.via;
import defpackage.viq;
import defpackage.vjr;
import defpackage.vjs;
import defpackage.wzs;
import defpackage.xca;
import defpackage.xhv;
import defpackage.xnv;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yjr;
import defpackage.yyb;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MarkAsReadAction extends Action<Void> implements Parcelable {
    private final yjr A;
    private final armf B;
    private final armf C;
    private final mbl D;
    private final wzs E;
    private final agnq F;
    private final xca G;
    private final qik H;
    private final ugy I;
    private final viq J;
    private final armf K;
    private final vjs L;
    public final via c;
    public final rjm d;
    public final uhj e;
    public final xnv f;
    public final armf g;
    public final armf h;
    public final mho i;
    public final Optional j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public amwh o;
    public final agxw p;
    private final Context q;
    private final vjs z;
    public static final xze a = xze.g("BugleDataModel", "MarkAsReadAction");
    public static final alwo b = alwo.o("BugleNotifications");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(0);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        armf LJ();

        armf LR();

        vjs Pz();

        rix cQ();

        uhj dL();

        rjm dd();

        via eu();

        vjs ev();
    }

    public MarkAsReadAction(Context context, xnv xnvVar, yjr yjrVar, mbl mblVar, mho mhoVar, wzs wzsVar, agnq agnqVar, xca xcaVar, qik qikVar, ugy ugyVar, viq viqVar, Optional optional, armf armfVar, armf armfVar2, armf armfVar3, agxw agxwVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, Parcel parcel) {
        super(parcel, amdy.MARK_AS_READ_ACTION);
        this.o = amwh.MESSAGE_TYPE_UNKNOWN;
        this.q = context;
        this.f = xnvVar;
        this.A = yjrVar;
        this.D = mblVar;
        this.i = mhoVar;
        this.E = wzsVar;
        this.F = agnqVar;
        this.G = xcaVar;
        this.H = qikVar;
        this.I = ugyVar;
        this.J = viqVar;
        this.j = optional;
        this.K = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.p = agxwVar;
        this.k = armfVar4;
        this.l = armfVar5;
        this.m = armfVar6;
        this.n = armfVar7;
        a aVar = (a) yyb.aL(a.class);
        this.c = aVar.eu();
        this.d = aVar.dd();
        this.z = aVar.ev();
        this.L = aVar.Pz();
        this.e = aVar.dL();
        this.B = aVar.LJ();
        this.C = aVar.LR();
    }

    private final void h(Exception exc) {
        if (this.u.y("from_notification")) {
            this.J.g(this.o, 3, viq.c(exc), Optional.of(true));
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("MarkAsReadAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            xze xzeVar = a;
            xzeVar.l("Starting MarkAsReadAction");
            if (!this.A.y()) {
                xzeVar.q("Not default SMS app. Can't mark as read.");
                return null;
            }
            final boolean z = this.u.z("should_mark_as_notified", true);
            this.F.e("MarkAsReadAction#executeAction", new Runnable() { // from class: rax
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v18 */
                /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    alog n;
                    boolean z2;
                    Object apply;
                    agnw d;
                    Object apply2;
                    int i;
                    rax raxVar = this;
                    MarkAsReadAction markAsReadAction = MarkAsReadAction.this;
                    String str = "conversation_ids";
                    if (markAsReadAction.u.y("mark_all_as_read")) {
                        n = ((rtz) markAsReadAction.g.b()).A();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(ruy.c(Arrays.asList(markAsReadAction.u.B("conversation_ids"))));
                        ConversationIdType b2 = ruy.b(markAsReadAction.u.l("conversation_id"));
                        if (!b2.b()) {
                            arrayList.add(b2);
                        }
                        n = alog.n(arrayList);
                    }
                    MarkAsReadAction.a.l("Setting markAsUnread to false for " + n.size() + " conversation(s).");
                    ?? r7 = 0;
                    ums.j((rtz) markAsReadAction.g.b(), markAsReadAction.e, n, false);
                    int i2 = 15;
                    if (uyh.a()) {
                        srw a2 = srz.a();
                        a2.w("+markConversationAsReadInLighter");
                        a2.d(new qwz(n, i2));
                        sru sruVar = (sru) a2.b().m((agmh) srz.e.g);
                        try {
                            alob alobVar = new alob();
                            while (sruVar.moveToNext()) {
                                if (sruVar.j() != null) {
                                    alobVar.h(sruVar.j());
                                }
                            }
                            alog g = alobVar.g();
                            sruVar.close();
                            if (g.isEmpty()) {
                                MarkAsReadAction.a.l("LighterConversationIds is empty.");
                            } else {
                                int i3 = ((alsx) g).c;
                                MarkAsReadAction.a.l("Marking " + i3 + " Lighter conversation as read.");
                                qiu.h(akul.g(markAsReadAction.p.k(markAsReadAction.u.a("account_id_int"))).h(new raw(markAsReadAction, g, 0 == true ? 1 : 0), andi.a));
                            }
                        } finally {
                        }
                    }
                    markAsReadAction.u.J(new ArrayList());
                    int i4 = 0;
                    while (i4 < n.size()) {
                        ConversationIdType conversationIdType = (ConversationIdType) n.get(i4);
                        akrh e = aktp.e("MarkAsReadAction::markConversationAsRead");
                        try {
                            sya syaVar = new sya();
                            syaVar.aj("markConversationAsRead#update");
                            syaVar.i(conversationIdType);
                            syaVar.y(true);
                            boolean z3 = z;
                            if (z3) {
                                syaVar.o(true);
                            }
                            String.valueOf(conversationIdType);
                            boolean z4 = xzb.b;
                            syc sycVar = new syc();
                            if (z3) {
                                syc[] sycVarArr = new syc[2];
                                syc sycVar2 = new syc();
                                sycVar2.A(r7);
                                sycVarArr[r7] = sycVar2;
                                syc sycVar3 = new syc();
                                sycVar3.s();
                                sycVarArr[1] = sycVar3;
                                sycVar.V(sycVarArr);
                            } else {
                                sycVar.A(r7);
                            }
                            sycVar.f(conversationIdType);
                            String l = markAsReadAction.u.l("message_id");
                            if (l != null) {
                                MessageIdType b3 = rvc.b(l);
                                sxy d2 = MessagesTable.d();
                                d2.w("markConversationAsReadInLighter-messages1");
                                d2.e(new qza(12));
                                d2.g(new qwz(b3, 16));
                                sycVar.U(new agme("messages.received_timestamp", 10, d2.b()));
                            }
                            sxy d3 = MessagesTable.d();
                            d3.w("+markConversationAsReadInLighter-messages2");
                            d3.e(new qza(13));
                            d3.f(sycVar);
                            List list = (List) Collection.EL.stream(d3.b().g()).collect(Collectors.toCollection(new qxs(7)));
                            if (!list.isEmpty()) {
                                markAsReadAction.u.G().addAll((java.util.Collection) Collection.EL.stream(list).map(new qza(14)).collect(Collectors.toCollection(new qxs(7))));
                                syaVar.O(sycVar);
                                if (syaVar.a().e() > 0) {
                                    markAsReadAction.e.k(conversationIdType, list, "read");
                                }
                            }
                            if (!list.isEmpty()) {
                                markAsReadAction.e.d(conversationIdType);
                            }
                            slw slwVar = new slw();
                            slwVar.aj("markConversationAsRead-conversationsuggestions");
                            slwVar.c();
                            akrh e2 = aktp.e("ConversationSuggestionDatabaseOperations#updateConversationSuggestionRowsFromConversationId");
                            try {
                                xyl.h();
                                slx slxVar = new slx();
                                tnx tnxVar = new tnx(tnz.a);
                                apply = new ybe(10).apply(tnz.c);
                                tnv[] tnvVarArr = {(tnv) apply};
                                d = agnc.d("$primary");
                                int c = d.W().c();
                                Integer.valueOf(c).getClass();
                                String str2 = str;
                                alog alogVar = n;
                                if (((Integer) tnz.b.getOrDefault(tnvVarArr[0].toString(), -1)).intValue() > c) {
                                    agnc.t("columnReference.toString()", c);
                                }
                                tnxVar.m(tnvVarArr);
                                apply2 = new yec(conversationIdType, 6).apply(new tny());
                                tnxVar.k(new agpw((tny) apply2));
                                slxVar.U(new agme("conversation_suggestions._id", 3, tnxVar.b()));
                                slwVar.Z(new agpw(slxVar));
                                slwVar.a().e();
                                e2.close();
                                if (z3) {
                                    alwl alwlVar = (alwl) MarkAsReadAction.b.g();
                                    alwlVar.X(ydl.o, conversationIdType.toString());
                                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/datamodel/action/MarkAsReadAction", "markConversationAsRead", 557, "MarkAsReadAction.java")).q("Canceling incoming message notification from mark as read");
                                    ((wpp) markAsReadAction.k.b()).H(conversationIdType);
                                }
                                if (markAsReadAction.u.y("from_notification")) {
                                    maq maqVar = (maq) markAsReadAction.l.b();
                                    amfq amfqVar = (amfq) amfr.a.createBuilder();
                                    amfp amfpVar = amfp.BUGLE_CONVERSATION;
                                    if (!amfqVar.b.isMutable()) {
                                        amfqVar.u();
                                    }
                                    amfr amfrVar = (amfr) amfqVar.b;
                                    amfrVar.i = amfpVar.dg;
                                    amfrVar.b |= 1;
                                    aozy createBuilder = amfh.a.createBuilder();
                                    long a3 = ((lzz) markAsReadAction.m.b()).a(conversationIdType);
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    amfh amfhVar = (amfh) createBuilder.b;
                                    i = i4;
                                    amfhVar.b |= 65536;
                                    amfhVar.r = a3;
                                    if (!amfqVar.b.isMutable()) {
                                        amfqVar.u();
                                    }
                                    amfr amfrVar2 = (amfr) amfqVar.b;
                                    amfh amfhVar2 = (amfh) createBuilder.s();
                                    amfhVar2.getClass();
                                    amfrVar2.l = amfhVar2;
                                    amfrVar2.b |= 8;
                                    maqVar.k(amfqVar, amrs.ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE);
                                } else {
                                    i = i4;
                                }
                                markAsReadAction.d.e(rvc.a, conversationIdType, 2).B(markAsReadAction);
                                alwl alwlVar2 = (alwl) MarkAsReadAction.b.g();
                                alwlVar2.X(ydl.o, conversationIdType.toString());
                                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/datamodel/action/MarkAsReadAction", "markConversationAsRead", 583, "MarkAsReadAction.java")).J("Marking %d message(s) as read (shouldMarkAsNotified = %b, fromNotification = %b)", Integer.valueOf(list.size()), Boolean.valueOf(z3), Boolean.valueOf(markAsReadAction.u.y("from_notification")));
                                e.close();
                                i4 = i + 1;
                                raxVar = this;
                                str = str2;
                                n = alogVar;
                                r7 = 0;
                            } catch (Throwable th) {
                                try {
                                    e2.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } finally {
                        }
                    }
                    alog alogVar2 = n;
                    String str3 = str;
                    if (((pne) markAsReadAction.n.b()).a()) {
                        if (markAsReadAction.o == amwh.MESSAGE_TYPE_RCS) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        markAsReadAction.i.ah(z2);
                    }
                    markAsReadAction.u.w(str3, (String[]) ((ArrayList) Collection.EL.stream(alogVar2).map(new qza(15)).collect(Collectors.toCollection(new qxs(7)))).toArray(new String[0]));
                    markAsReadAction.u.s("timestamp", markAsReadAction.f.f().toEpochMilli());
                }
            });
            aozy createBuilder = vjr.a.createBuilder();
            if (this.u.y("from_notification")) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                vjr vjrVar = (vjr) createBuilder.b;
                vjrVar.c = 3;
                vjrVar.b = 1 | vjrVar.b;
            }
            this.z.a((vjr) createBuilder.s());
            this.L.f();
            v();
            return null;
        } catch (RuntimeException e) {
            h(e);
            throw e;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.MarkAsRead.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        ParticipantsTable.BindData a2;
        String[] f;
        xhv xhvVar;
        try {
            ConversationIdType[] conversationIdTypeArr = (ConversationIdType[]) ruy.d(Arrays.asList(this.u.B("conversation_ids"))).toArray(new ConversationIdType[0]);
            int length = conversationIdTypeArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                try {
                    xhvVar = this.I.a(conversationIdTypeArr[i]);
                } catch (alia e) {
                    xhv xhvVar2 = new xhv();
                    h(e);
                    xhvVar = xhvVar2;
                }
                jArr[i] = yyb.cE(xhvVar);
            }
            long d = this.u.d("timestamp");
            boolean y = this.u.y("should_mark_as_notified");
            for (int i2 = 0; i2 < length; i2++) {
                ConversationIdType conversationIdType = conversationIdTypeArr[i2];
                syc sycVar = new syc();
                sycVar.A(false);
                if (y) {
                    syc sycVar2 = new syc();
                    syc sycVar3 = new syc();
                    sycVar3.s();
                    sycVar2.V(sycVar, sycVar3);
                    sycVar = sycVar2;
                }
                if (((qih) this.B.b()).d(conversationIdType, xhv.b(jArr[i2])) && (f = ((qih) this.B.b()).f(conversationIdType, new syb(sycVar))) != null) {
                    this.H.f(this.q, f, y);
                }
            }
            for (int i3 = 0; i3 < length; i3++) {
                long j = jArr[i3];
                if (j != -1) {
                    this.E.j(j, d);
                }
            }
            this.o = amwh.MESSAGE_TYPE_UNKNOWN;
            ArrayList G = this.u.G();
            if (G != null) {
                HashMap hashMap = new HashMap();
                int size = G.size();
                for (int i4 = 0; i4 < size; i4++) {
                    String str = (String) G.get(i4);
                    if (!TextUtils.isEmpty(str)) {
                        MessageIdType b2 = rvc.b(str);
                        MessageCoreData q = ((rwd) this.C.b()).q(b2);
                        if (q == null) {
                            xyo e2 = a.e();
                            e2.c(b2);
                            e2.H("no longer exists.");
                            e2.q();
                        } else {
                            this.o = viq.a(this.o, q);
                            Optional empty = Optional.empty();
                            ConversationIdType z = q.z();
                            if (!hashMap.containsKey(z)) {
                                rto z2 = ((uac) this.K.b()).z(z);
                                if (z2 != null) {
                                    empty = Optional.of(Integer.valueOf(z2.G()));
                                }
                                hashMap.put(z, empty);
                            }
                            this.i.ar(q, (Optional) hashMap.get(z));
                            String aw = q.aw();
                            if (aw != null && (a2 = ParticipantsTable.a(aw)) != null) {
                                String O = a2.O();
                                if (!TextUtils.isEmpty(O) && (q.M().a() || this.G.k(a2.O()))) {
                                    this.i.p(O, -1, q.B().a(), albo.ag(q.am()), q.M());
                                }
                            }
                        }
                    }
                }
                int size2 = G.size();
                if (this.u.y("mark_all_as_read")) {
                    akrh e3 = aktp.e("MessageDatabaseOperations#hasUnreadMessages");
                    try {
                        sxy d2 = MessagesTable.d();
                        d2.w("hasUnreadMessages");
                        d2.g(new rvy(15));
                        boolean K = d2.b().K();
                        e3.close();
                        if (K) {
                            a.q("Forcing remaining unread msgs to be read.");
                            sya syaVar = new sya();
                            syaVar.aj("MarkAsReadAction#runBackgroundWork");
                            syaVar.y(true);
                            syaVar.o(true);
                            syc sycVar4 = new syc();
                            sycVar4.A(false);
                            size2 += syaVar.Y(new syb(sycVar4), "messages-buildAndUpdateForRead");
                        }
                        this.e.c();
                    } finally {
                    }
                }
                this.u.r("total_messages_marked_as_read", size2);
            }
            if (this.u.y("from_notification")) {
                this.D.c("Bugle.Notification.MarkAsRead.Count");
                this.i.aK(amhc.INCOMING_MSG_NOTIFICATION, 2, (List) DesugarArrays.stream(conversationIdTypeArr).collect(Collectors.toCollection(new qxs(7))));
                this.J.f(Optional.of(this.o), 2, Duration.between(Instant.ofEpochMilli(this.u.d("start_timestamp")), this.f.f()));
                return null;
            }
            return null;
        } catch (RuntimeException e4) {
            h(e4);
            throw e4;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public MarkAsReadAction(Context context, xnv xnvVar, yjr yjrVar, mbl mblVar, mho mhoVar, wzs wzsVar, agnq agnqVar, xca xcaVar, qik qikVar, ugy ugyVar, viq viqVar, Optional optional, armf armfVar, armf armfVar2, armf armfVar3, agxw agxwVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType, boolean z, boolean z2, int i, int i2) {
        super(amdy.MARK_AS_READ_ACTION);
        this.o = amwh.MESSAGE_TYPE_UNKNOWN;
        this.q = context;
        this.f = xnvVar;
        this.A = yjrVar;
        this.D = mblVar;
        this.i = mhoVar;
        this.E = wzsVar;
        this.F = agnqVar;
        this.G = xcaVar;
        this.H = qikVar;
        this.I = ugyVar;
        this.K = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
        this.J = viqVar;
        this.j = optional;
        this.p = agxwVar;
        this.k = armfVar4;
        this.l = armfVar5;
        this.m = armfVar6;
        this.n = armfVar7;
        this.u.w("conversation_ids", (String[]) ((ArrayList) DesugarArrays.stream(conversationIdTypeArr).map(new qza(11)).collect(Collectors.toCollection(new qxs(7)))).toArray(new String[0]));
        if (!messageIdType.b()) {
            this.u.v("message_id", messageIdType.a());
        }
        this.u.p("should_mark_as_notified", z);
        this.u.p("from_notification", z2);
        this.u.s("start_timestamp", xnvVar.f().toEpochMilli());
        if (uyh.a()) {
            this.u.r("account_id_int", i2);
        }
        if (i == 1) {
            this.u.p("mark_all_as_read", true);
        } else if (i == 2) {
            this.u.p("should_mark_payment_requests_read", true);
        }
        a aVar = (a) yyb.aL(a.class);
        this.c = aVar.eu();
        this.d = aVar.dd();
        this.e = aVar.dL();
        this.z = aVar.ev();
        this.L = aVar.Pz();
        this.B = aVar.LJ();
        this.C = aVar.LR();
    }
}
