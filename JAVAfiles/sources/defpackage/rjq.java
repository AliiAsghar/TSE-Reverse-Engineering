package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer");
    public final msk b;
    private final Context c;
    private final xnv d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final mho l;
    private final apwt m;
    private final Optional n;
    private final agnq o;
    private final yck p;
    private final Optional q;
    private final armf r;
    private final wjk s;
    private final armf t;
    private final orj u;
    private final oge v;
    private final armf w;
    private final rfy x;
    private final tzn y;

    public rjq(Context context, armf armfVar, xnv xnvVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, mho mhoVar, apwt apwtVar, Optional optional, rfy rfyVar, agnq agnqVar, yck yckVar, msk mskVar, tzn tznVar, Optional optional2, wjk wjkVar, armf armfVar9, orj orjVar, oge ogeVar, armf armfVar10) {
        this.c = context;
        this.r = armfVar;
        this.d = xnvVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.l = mhoVar;
        this.m = apwtVar;
        this.n = optional;
        this.x = rfyVar;
        this.o = agnqVar;
        this.p = yckVar;
        this.b = mskVar;
        this.y = tznVar;
        this.q = optional2;
        this.k = armfVar8;
        this.s = wjkVar;
        this.t = armfVar9;
        this.u = orjVar;
        this.v = ogeVar;
        this.w = armfVar10;
    }

    public static void a(Action action, long j, Optional optional, boolean z, boolean z2) {
        action.u.s("rcs_session_id", j);
        if (j == -1) {
            action.u.v("conversation_name", (String) optional.orElse(null));
        }
        action.u.p("is_rcs_group", z);
        action.u.p("is_rbm_conversation", z2);
    }

    private final int g(MessageCoreData messageCoreData, long j, qwm qwmVar) {
        int j2 = messageCoreData.j();
        if (messageCoreData.cU()) {
            this.l.Y(amrs.UMA_MESSAGE_SENDING_START, messageCoreData, qwmVar.e());
            messageCoreData.bb(j);
        } else {
            messageCoreData.aZ(j);
        }
        return j2;
    }

    private final Action h(MessageCoreData messageCoreData, qwm qwmVar) {
        alog n = alog.n(((rtz) this.g.b()).K(messageCoreData.z()));
        if (messageCoreData.ak() != null) {
            ParticipantsTable.BindData a2 = ((rxq) this.e.b()).a(messageCoreData.ak());
            if (a2 != null && a2.P() != null) {
                n = alog.r(a2);
            } else {
                alvw i = a.i();
                i.X(alwp.a, "BugleDataModel");
                alvg alvgVar = (alvg) i;
                alvgVar.X(ydl.f, messageCoreData.E());
                alvgVar.X(ydl.p, messageCoreData.z());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "createSendMessageAction", 583, "SendMessageActionQueuer.java")).t("Participant for the group private message does not exist, groupPrivateParticipant: %s", messageCoreData.ak());
                return null;
            }
        }
        Action a3 = this.x.a();
        if (messageCoreData.cI()) {
            Optional ofNullable = Optional.ofNullable(((rtz) this.g.b()).q(messageCoreData.z()));
            ofNullable.ifPresentOrElse(new rgd(a3, 10), new nau(a3, 18));
            qei w = messageCoreData.w();
            if (!((Boolean) ofNullable.map(new rhr(11)).orElse(true)).booleanValue()) {
                n = (alog) Collection.EL.stream(n).filter(new qxp(w, 3)).collect(alls.a);
            }
        }
        akrh e = aktp.e("SendMessageActionQueuer::buildMessageIdentityProtos");
        try {
            alog alogVar = (alog) Collection.EL.stream(n).map(new rbp(this, messageCoreData, 7)).map(new rhr(12)).collect(alls.a);
            e.close();
            a3.u.t("message", messageCoreData);
            a3.u.r("sub_id", qwmVar.e());
            a3.u.v("sub_phone_number", (String) qwmVar.b().map(new rhr(13)).orElse(null));
            a3.u.u("remote_messaging_identities", new ArrayList(alogVar));
            if (messageCoreData.cQ()) {
                if (alogVar.size() == 1) {
                    a3.u.v("sms_service_center", (String) this.n.map(new rbp(qwmVar, messageCoreData, 6)).orElse(null));
                    a3.u.t("remote_messaging_identity", (Parcelable) alogVar.get(0));
                } else {
                    throw new IllegalStateException("Trying to resend a broadcast SMS - not allowed");
                }
            }
            alvw d = a.d();
            d.X(alwp.a, "BugleDataModel");
            alvg alvgVar2 = (alvg) d;
            alvgVar2.X(ydl.b, messageCoreData.B());
            alvgVar2.X(ydl.x, MessageData.as(messageCoreData.d()));
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "populateSendMessageAction", 626, "SendMessageActionQueuer.java")).q("Queued for sending");
            return a3;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    private final Action i(MessageCoreData messageCoreData, qwm qwmVar) {
        List<ParticipantsTable.BindData> K;
        msh s;
        armf armfVar = this.i;
        ConversationIdType z = messageCoreData.z();
        ArrayList b = ((rus) armfVar.b()).b(z, messageCoreData.ci());
        akrh e = aktp.e("SendMessageActionQueuer#createSendMessageAction_dsdrGroupsFlag");
        try {
            if (((okf) this.r.b()).a()) {
                K = ((rtz) this.g.b()).y(messageCoreData.ab(), z);
            } else {
                K = ((rtz) this.g.b()).K(z);
            }
            e.close();
            ArrayList arrayList = new ArrayList();
            e = aktp.e("SendMessageActionQueuer::buildMessageIdentityProtos");
            try {
                for (ParticipantsTable.BindData bindData : K) {
                    if (messageCoreData.ci()) {
                        s = this.b.q(bindData);
                    } else {
                        s = this.b.s(bindData);
                    }
                    arrayList.add(lqn.n(s));
                }
                e.close();
                String ak = messageCoreData.ak();
                if (ak != null) {
                    ParticipantsTable.BindData a2 = ((rxq) this.e.b()).a(ak);
                    if (a2 != null && a2.P() != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(a2.P());
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(lqn.n(this.b.s(a2)));
                        b = arrayList2;
                        arrayList = arrayList3;
                    } else {
                        alvw i = a.i();
                        i.X(alwp.a, "BugleDataModel");
                        alvg alvgVar = (alvg) i;
                        alvgVar.X(ydl.f, messageCoreData.E());
                        alvgVar.X(ydl.p, z);
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "createSendMessageActionLegacy", 472, "SendMessageActionQueuer.java")).t("Participant for the group private message does not exist, groupPrivateParticipant: %s", ak);
                        return null;
                    }
                }
                Action a3 = this.x.a();
                a3.u.t("message", messageCoreData);
                a3.u.u("remote_messaging_identities", arrayList);
                int e2 = qwmVar.e();
                Optional map = qwmVar.b().map(new rhr(15));
                a3.u.r("sub_id", e2);
                a3.u.v("sub_phone_number", (String) map.orElse(null));
                MessageIdType B = messageCoreData.B();
                int i2 = 2;
                if (messageCoreData.d() == 0) {
                    a3.u.v("sms_service_center", (String) this.n.map(new rbe(e2, z, i2)).orElse(null));
                    if (b.size() == 1) {
                        a3.u.t("remote_messaging_identity", (apdj) arrayList.get(0));
                        alvw d = a.d();
                        d.X(alwp.a, "BugleDataModel");
                        alvg alvgVar2 = (alvg) d;
                        alvgVar2.X(ydl.b, B);
                        ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "createSendMessageActionLegacy", 520, "SendMessageActionQueuer.java")).q("Queued SMS message for sending");
                        return a3;
                    }
                    alvw i3 = a.i();
                    i3.X(alwp.a, "BugleDataModel");
                    alvg alvgVar3 = (alvg) i3;
                    alvgVar3.X(ydl.b, B);
                    ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "createSendMessageActionLegacy", 530, "SendMessageActionQueuer.java")).q("Trying to resend a broadcast SMS - not allowed");
                    throw new IllegalStateException("Trying to resend a broadcast SMS - not allowed");
                }
                boolean z2 = false;
                if (messageCoreData.d() == 3) {
                    long f = ((rtz) this.g.b()).f(z);
                    if (((rtz) this.g.b()).c(z) == 2) {
                        z2 = true;
                    }
                    boolean ab = ((rtz) this.g.b()).ab(z);
                    a3.u.s("rcs_session_id", f);
                    a3.u.p("is_rcs_group", z2);
                    a3.u.p("is_rbm_conversation", ab);
                    if (f == -1) {
                        a3.u.v("conversation_name", ((rtz) this.g.b()).I(z));
                    }
                }
                alvw d2 = a.d();
                d2.X(alwp.a, "BugleDataModel");
                alvg alvgVar4 = (alvg) d2;
                alvgVar4.X(ydl.b, B);
                alvgVar4.X(ydl.x, MessageData.as(messageCoreData.d()));
                ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "createSendMessageActionLegacy", 557, "SendMessageActionQueuer.java")).q("Queued for sending");
                return a3;
            } finally {
            }
        } finally {
        }
    }

    private final boolean j(MessageCoreData messageCoreData, Uri uri, boolean z, Optional optional) {
        boolean e = e(messageCoreData, z);
        this.o.e("SendMessageActionQueuer#updateLocalDatabaseInTransaction", new abpd(this, messageCoreData, uri, z, optional, 1));
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (r5.y.o(r6, r7, r9) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, android.net.Uri r7, boolean r8, j$.util.Optional r9) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L10
            boolean r7 = r6.ci()
            if (r7 != 0) goto L10
            tzn r7 = r5.y
            r7.k(r6)
            goto Lb1
        L10:
            sya r7 = new sya
            r7.<init>()
            java.lang.String r1 = "updateLocalDatabase"
            r7.aj(r1)
            rhr r1 = new rhr
            r2 = 10
            r1.<init>(r2)
            r7.P(r1)
            int r1 = r6.j()
            r7.L(r1)
            if (r8 == 0) goto L30
            r7.o(r0)
        L30:
            long r1 = r6.n()
            r7.z(r1)
            int r8 = r6.f()
            r7.u(r8)
            int r8 = r6.i()
            r7.H(r8)
            java.lang.String r8 = r6.ax()
            r7.I(r8)
            rve r8 = r6.E()
            r7.x(r8)
            int r8 = r6.h()
            r7.A(r8)
            alhr r8 = defpackage.mku.a
            java.lang.Object r8 = r8.get()
            utz r8 = (defpackage.utz) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L75
            tqu r8 = r6.N()
            r7.N(r8)
        L75:
            boolean r8 = r6.ci()
            if (r8 == 0) goto La9
            java.lang.String r8 = r6.ad()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto La9
            java.lang.String r8 = r6.ad()
            java.lang.Integer r1 = defpackage.a.ba()
            int r1 = r1.intValue()
            java.lang.Integer r2 = defpackage.a.ba()
            int r2 = r2.intValue()
            java.lang.String r3 = "cloud_sync_id"
            r4 = 8500(0x2134, float:1.1911E-41)
            if (r2 >= r4) goto La2
            defpackage.agnc.t(r3, r2)
        La2:
            if (r1 < r4) goto La9
            android.content.ContentValues r1 = r7.a
            defpackage.agnc.r(r1, r3, r8)
        La9:
            tzn r8 = r5.y
            boolean r7 = r8.o(r6, r7, r9)
            if (r7 == 0) goto Lc2
        Lb1:
            armf r7 = r5.h
            java.lang.Object r7 = r7.b()
            ruq r7 = (defpackage.ruq) r7
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = r6.z()
            tqc r9 = defpackage.tqc.UNARCHIVED
            r7.a(r8, r0, r9)
        Lc2:
            alvi r7 = defpackage.rjq.a
            alvw r7 = r7.f()
            alvz r8 = defpackage.alwp.a
            java.lang.String r9 = "BugleDataModel"
            r7.X(r8, r9)
            alvg r7 = (defpackage.alvg) r7
            alvz r8 = defpackage.ydl.x
            java.lang.String r9 = r6.ar()
            r7.X(r8, r9)
            alvz r8 = defpackage.ydl.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9 = r6.B()
            r7.X(r8, r9)
            java.lang.String r8 = "updateMessageInLocalDatabaseAndRefreshConvMetadata"
            r9 = 1024(0x400, float:1.435E-42)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer"
            java.lang.String r1 = "SendMessageActionQueuer.java"
            alvw r7 = r7.h(r0, r8, r9, r1)
            alvg r7 = (defpackage.alvg) r7
            long r8 = r6.n()
            java.lang.String r6 = "Updated message in local db. receivedTimeStamp: %s"
            r7.s(r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjq.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, android.net.Uri, boolean, j$.util.Optional):void");
    }

    public final boolean c(MessageCoreData messageCoreData, Uri uri, boolean z) {
        akrh e = aktp.e("SendMessageActionQueuer::updateMessageAndStatus");
        try {
            boolean j = j(messageCoreData, uri, z, Optional.empty());
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean d(MessageCoreData messageCoreData, Uri uri, boolean z, Optional optional) {
        akrh e = aktp.e("SendMessageActionQueuer::updateMessageAndStatusWithLogContent");
        try {
            boolean j = j(messageCoreData, uri, z, optional);
            e.close();
            return j;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0110 A[Catch: all -> 0x019c, TRY_LEAVE, TryCatch #3 {all -> 0x019c, blocks: (B:3:0x000a, B:15:0x0029, B:18:0x002f, B:22:0x0110, B:25:0x0126, B:26:0x018f, B:33:0x0158, B:35:0x015e, B:37:0x003f, B:39:0x0045, B:42:0x0053, B:44:0x0069, B:47:0x0073, B:50:0x007b, B:52:0x008d, B:54:0x0099, B:59:0x00c3, B:61:0x00f8, B:73:0x0107, B:72:0x0104, B:67:0x00fe, B:56:0x00a7, B:60:0x00c7), top: B:2:0x000a, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0126 A[Catch: all -> 0x019c, TRY_ENTER, TryCatch #3 {all -> 0x019c, blocks: (B:3:0x000a, B:15:0x0029, B:18:0x002f, B:22:0x0110, B:25:0x0126, B:26:0x018f, B:33:0x0158, B:35:0x015e, B:37:0x003f, B:39:0x0045, B:42:0x0053, B:44:0x0069, B:47:0x0073, B:50:0x007b, B:52:0x008d, B:54:0x0099, B:59:0x00c3, B:61:0x00f8, B:73:0x0107, B:72:0x0104, B:67:0x00fe, B:56:0x00a7, B:60:0x00c7), top: B:2:0x000a, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158 A[Catch: all -> 0x019c, TryCatch #3 {all -> 0x019c, blocks: (B:3:0x000a, B:15:0x0029, B:18:0x002f, B:22:0x0110, B:25:0x0126, B:26:0x018f, B:33:0x0158, B:35:0x015e, B:37:0x003f, B:39:0x0045, B:42:0x0053, B:44:0x0069, B:47:0x0073, B:50:0x007b, B:52:0x008d, B:54:0x0099, B:59:0x00c3, B:61:0x00f8, B:73:0x0107, B:72:0x0104, B:67:0x00fe, B:56:0x00a7, B:60:0x00c7), top: B:2:0x000a, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjq.e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (java.lang.Integer.parseInt(r1.substring(6)) == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.messaging.shared.datamodel.action.common.Action f(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r18, int r19) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjq.f(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int):com.google.android.apps.messaging.shared.datamodel.action.common.Action");
    }
}
