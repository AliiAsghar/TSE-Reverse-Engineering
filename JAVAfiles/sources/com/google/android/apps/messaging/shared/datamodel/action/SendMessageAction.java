package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.adjc;
import defpackage.agkg;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.akul;
import defpackage.albo;
import defpackage.alhr;
import defpackage.alls;
import defpackage.alog;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amdy;
import defpackage.amgt;
import defpackage.amrl;
import defpackage.amwx;
import defpackage.amxb;
import defpackage.amxc;
import defpackage.anen;
import defpackage.aoia;
import defpackage.aozy;
import defpackage.apag;
import defpackage.apds;
import defpackage.armf;
import defpackage.asgt;
import defpackage.d;
import defpackage.hgj;
import defpackage.mgi;
import defpackage.msh;
import defpackage.mst;
import defpackage.qdl;
import defpackage.qei;
import defpackage.qiu;
import defpackage.qjh;
import defpackage.qnu;
import defpackage.qos;
import defpackage.qpf;
import defpackage.qwq;
import defpackage.raw;
import defpackage.rbg;
import defpackage.rbs;
import defpackage.rfv;
import defpackage.rfw;
import defpackage.rhc;
import defpackage.rhl;
import defpackage.rve;
import defpackage.smr;
import defpackage.sna;
import defpackage.snf;
import defpackage.snh;
import defpackage.sni;
import defpackage.ugy;
import defpackage.val;
import defpackage.vof;
import defpackage.vqg;
import defpackage.vqh;
import defpackage.vqs;
import defpackage.wyl;
import defpackage.wzp;
import defpackage.wzs;
import defpackage.xhv;
import defpackage.xnv;
import defpackage.xro;
import defpackage.xrz;
import defpackage.xsq;
import defpackage.yck;
import defpackage.ydl;
import defpackage.yjy;
import defpackage.yyb;
import defpackage.yyt;
import defpackage.zxy;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendMessageAction extends Action<Void> implements Parcelable {
    private final armf A;
    private final armf B;
    private final anen C;
    private final alhr D;
    private final armf E;
    private final alhr F;
    private final alhr G;
    private final armf H;
    private final armf I;
    private final armf J;
    private final armf K;
    private final armf L;
    private final armf M;
    private final armf N;
    private final armf O;
    private final armf P;
    private final armf Q;
    private final armf R;
    private final alhr S;
    private final armf T;
    private final armf U;
    private final armf V;
    private final alhr W;
    private final armf X;
    private final armf Y;
    private final armf Z;
    public final alhr a;
    private final armf aa;
    private final armf ab;
    private final armf ac;
    public final armf b;
    public final armf c;
    public final armf d;
    private final Context f;
    private final armf g;
    private final alhr h;
    private final armf i;
    private final armf j;
    private final xnv k;
    private final armf l;
    private final armf m;
    private final alhr n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf z;
    private static final alvi e = alvi.m("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(0);

    public SendMessageAction(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, xnv xnvVar, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, anen anenVar, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, armf armfVar38, armf armfVar39, armf armfVar40, armf armfVar41, armf armfVar42, armf armfVar43) {
        super(amdy.SEND_MESSAGE_ACTION);
        this.f = context;
        this.g = armfVar;
        this.o = armfVar2;
        this.h = albo.D(new rfv(armfVar4, 0));
        this.a = albo.D(new qwq(armfVar5, 15));
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = xnvVar;
        this.l = armfVar8;
        this.m = armfVar9;
        this.n = albo.D(new qwq(armfVar10, 16));
        this.p = armfVar11;
        this.q = armfVar12;
        this.z = armfVar13;
        this.A = armfVar14;
        this.B = armfVar15;
        this.C = anenVar;
        this.D = albo.D(new qwq(armfVar16, 17));
        this.E = armfVar17;
        this.F = albo.D(new qwq(armfVar18, 18));
        this.G = albo.D(new qwq(armfVar19, 19));
        this.H = armfVar20;
        this.I = armfVar21;
        this.J = armfVar22;
        this.K = armfVar3;
        this.L = armfVar23;
        this.M = armfVar24;
        this.b = armfVar25;
        this.N = armfVar26;
        this.O = armfVar27;
        this.P = armfVar28;
        this.Q = armfVar29;
        this.R = armfVar30;
        this.S = albo.D(new qwq(armfVar31, 20));
        this.T = armfVar32;
        this.U = armfVar33;
        this.V = armfVar34;
        this.W = albo.D(new rfv(armfVar35, 1));
        this.X = armfVar38;
        this.Y = armfVar37;
        this.Z = armfVar36;
        this.c = armfVar39;
        this.d = armfVar40;
        this.aa = armfVar41;
        this.ab = armfVar42;
        this.ac = armfVar43;
    }

    private final Optional G(Uri uri, int i) {
        if (((yck) this.A.b()).p) {
            alvw i2 = e.i();
            i2.X(alwp.a, "BugleDataModel");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRcsPreconditionsError", 1149, "SendMessageAction.java")).q("Emulate RCS send failure for debugging");
            return Optional.of(vqs.b(true, uri));
        }
        if (((yck) this.A.b()).q) {
            alvw i3 = e.i();
            i3.X(alwp.a, "BugleDataModel");
            ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRcsPreconditionsError", 1155, "SendMessageAction.java")).q("Emulate RCS send permanent failure for debugging");
            return Optional.of(vqs.b(false, uri));
        }
        int a = ((yjy) this.n.get()).h(i).a();
        if (((adjc) this.o.b()).w(a)) {
            return Optional.empty();
        }
        alvw h = e.h();
        h.X(alwp.a, "BugleDataModel");
        alvg alvgVar = (alvg) h;
        alvgVar.X(ydl.t, Integer.valueOf(a));
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRcsPreconditionsError", 1165, "SendMessageAction.java")).q("Cannot send RCS on non-RCS.");
        vqg a2 = vqh.a(2, 10002);
        a2.c = uri;
        a2.b(4);
        aozy createBuilder = amxb.a.createBuilder();
        aozy createBuilder2 = amxc.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amxc amxcVar = (amxc) apagVar;
        amxcVar.d = 1;
        amxcVar.b = 4 | amxcVar.b;
        amwx amwxVar = amwx.CHAT_API_NO_RCS_SUBSCRIPTION;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amxc amxcVar2 = (amxc) createBuilder2.b;
        amxcVar2.e = amwxVar.x;
        amxcVar2.b |= 8;
        amxc amxcVar3 = (amxc) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxb amxbVar = (amxb) createBuilder.b;
        amxcVar3.getClass();
        amxbVar.c = amxcVar3;
        amxbVar.b |= 1;
        a2.d = (amxb) createBuilder.s();
        return Optional.of(a2.a());
    }

    private final Optional H(boolean z, ConversationIdType conversationIdType, List list) {
        if (list.isEmpty()) {
            alvw i = e.i();
            i.X(alwp.a, "BugleDataModel");
            alvg alvgVar = (alvg) i;
            alvgVar.X(ydl.p, conversationIdType);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRecipientsDescriptor", 1396, "SendMessageAction.java")).q("No messaging identities in conversation");
            return Optional.empty();
        }
        if (z) {
            qnu qnuVar = (qnu) this.L.b();
            return Optional.of(qnuVar.g(((hgj) qnuVar.b).p(conversationIdType), list));
        }
        Optional e2 = ((msh) list.get(0)).e();
        if (e2.isEmpty()) {
            alvw i2 = e.i();
            i2.X(alwp.a, "BugleDataModel");
            alvg alvgVar2 = (alvg) i2;
            alvgVar2.X(ydl.p, conversationIdType);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRecipientsDescriptor", 1416, "SendMessageAction.java")).q("RCS messaging identity missing in one to one conversation");
            return Optional.empty();
        }
        return Optional.of(new aoia((qei) e2.get()));
    }

    private static String I(ConversationIdType conversationIdType) {
        snf e2 = sni.e();
        e2.w("getRcsConferenceUriForConversation");
        e2.c(sni.c.ab);
        snh snhVar = new snh();
        snhVar.j(conversationIdType);
        e2.g(snhVar);
        return ((smr) ((sna) e2.b().n()).cP()).U();
    }

    private final void J(MessageCoreData messageCoreData, akul akulVar) {
        akrh e2 = aktp.e("SendMessageAction::saveForEarlySend");
        try {
            alvw g = e.g();
            g.X(alwp.a, "BugleDataModel");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "saveForEarlySend", 1710, "SendMessageAction.java")).q("Starting save for early send");
            if (akulVar == null) {
                akulVar = aktp.ag(null);
            }
            akul i = akulVar.i(new qdl(this, messageCoreData, 16), this.C);
            qiu.h(i);
            wyl wylVar = (wyl) this.aa.b();
            rve E = messageCoreData.E();
            E.getClass();
            wylVar.a.put(E, qjh.e(i));
            qiu.h(i.h(new raw(this, messageCoreData, 6), this.C));
            e2.close();
        } catch (Throwable th) {
            try {
                e2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void K(rhc rhcVar, asgt asgtVar) {
        rhcVar.f = asgtVar;
        rhcVar.g = apds.b(this.k.f().toEpochMilli());
    }

    private static boolean L(MessageCoreData messageCoreData) {
        if (((Boolean) vof.a.e()).booleanValue() && messageCoreData.O() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|3|4|(4:9|(1:11)|13|14)|16|17|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r4 = com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.e.h();
        r4.X(defpackage.alwp.a, "BugleDataModel");
        ((defpackage.alvg) ((defpackage.alvg) ((defpackage.alvg) r4).g(r0)).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "updateMessageUriInSpan", 1363, "SendMessageAction.java")).q("Exception when inserting sending RCS message in telephony");
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0094 A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #2 {all -> 0x00c6, blocks: (B:3:0x0007, B:6:0x001b, B:9:0x002a, B:11:0x0094, B:17:0x004a, B:21:0x0079), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.net.Uri M(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r13, defpackage.aknw r14, defpackage.alog r15, long r16, int r18) {
        /*
            r12 = this;
            r1 = r12
            java.lang.String r0 = "SendMessageAction::updateMessageUri"
            akrh r2 = defpackage.aktp.e(r0)
            mst r0 = new mst     // Catch: java.lang.Throwable -> Lc6
            r3 = 4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = "BugleDataModel"
            if (r0 != 0) goto L4a
            alhr r0 = r1.D     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lc6
            trz r0 = (defpackage.trz) r0     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.o()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L2a
            goto L4a
        L2a:
            armf r0 = r1.p     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> Lc6
            r4 = r0
            vqm r4 = (defpackage.vqm) r4     // Catch: java.lang.Throwable -> Lc6
            alog r7 = n(r15)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r13.z()     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r10 = I(r0)     // Catch: java.lang.Throwable -> Lc6
            r5 = r13
            r6 = r14
            r8 = r16
            r11 = r18
            android.net.Uri r0 = r4.i(r5, r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> Lc6
            goto L92
        L4a:
            armf r0 = r1.p     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.b()     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            r4 = r0
            vqm r4 = (defpackage.vqm) r4     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r13.z()     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            java.lang.String r10 = I(r0)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r11 = r18
            akul r0 = r4.k(r5, r6, r7, r8, r10, r11)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            alhr r4 = r1.S     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            java.lang.Object r4 = r4.get()     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            rzx r4 = (defpackage.rzx) r4     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            java.lang.Object r0 = defpackage.agkg.a(r0)     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.InterruptedException -> L75 java.util.concurrent.ExecutionException -> L77 java.lang.Throwable -> Lc6
            goto L92
        L75:
            r0 = move-exception
            goto L78
        L77:
            r0 = move-exception
        L78:
            r10 = r0
            alvi r0 = com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.e     // Catch: java.lang.Throwable -> Lc6
            alvw r4 = r0.h()     // Catch: java.lang.Throwable -> Lc6
            alvz r0 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Lc6
            r4.X(r0, r3)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = "com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction"
            java.lang.String r7 = "updateMessageUriInSpan"
            java.lang.String r9 = "SendMessageAction.java"
            java.lang.String r5 = "Exception when inserting sending RCS message in telephony"
            r8 = 1363(0x553, float:1.91E-42)
            defpackage.a.cj(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lc6
            r0 = 0
        L92:
            if (r0 == 0) goto Lc2
            alvi r4 = com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.e     // Catch: java.lang.Throwable -> Lc6
            alvw r4 = r4.f()     // Catch: java.lang.Throwable -> Lc6
            alvz r5 = defpackage.alwp.a     // Catch: java.lang.Throwable -> Lc6
            r4.X(r5, r3)     // Catch: java.lang.Throwable -> Lc6
            alvg r4 = (defpackage.alvg) r4     // Catch: java.lang.Throwable -> Lc6
            alvz r3 = defpackage.ydl.b     // Catch: java.lang.Throwable -> Lc6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = r13.B()     // Catch: java.lang.Throwable -> Lc6
            r4.X(r3, r5)     // Catch: java.lang.Throwable -> Lc6
            alvz r3 = defpackage.ydl.R     // Catch: java.lang.Throwable -> Lc6
            r4.X(r3, r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction"
            java.lang.String r5 = "updateMessageUriInSpan"
            java.lang.String r6 = "SendMessageAction.java"
            r7 = 1383(0x567, float:1.938E-42)
            alvw r3 = r4.h(r3, r5, r7, r6)     // Catch: java.lang.Throwable -> Lc6
            alvg r3 = (defpackage.alvg) r3     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r4 = "Updated message with new URI."
            r3.q(r4)     // Catch: java.lang.Throwable -> Lc6
        Lc2:
            r2.close()
            return r0
        Lc6:
            r0 = move-exception
            r3 = r0
            r2.close()     // Catch: java.lang.Throwable -> Lcc
            goto Ld1
        Lcc:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)
        Ld1:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.M(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, aknw, alog, long, int):android.net.Uri");
    }

    private final Uri l(MessageCoreData messageCoreData, alog alogVar) {
        xhv a;
        rhl rhlVar = this.u;
        int b = rhlVar.b("sub_id", -1);
        String l = rhlVar.l("sub_phone_number");
        long n = messageCoreData.n();
        ((wzp) this.B.b()).i(n);
        int d = messageCoreData.d();
        ConversationIdType z = messageCoreData.z();
        if (((Boolean) qpf.a.e()).booleanValue()) {
            a = ((qos) this.Q.b()).a(z);
        } else {
            a = ((ugy) this.K.b()).a(z);
        }
        xhv xhvVar = a;
        boolean z2 = true;
        if (d != 1 && d != 2) {
            if (d == 0 && L(messageCoreData)) {
                if (alogVar.size() != 1) {
                    z2 = false;
                }
                albo.V(z2, "Expected 1 recipient, got %s", alogVar.size());
                wzs wzsVar = (wzs) this.i.b();
                Context context = this.f;
                Uri uri = Telephony.Sms.CONTENT_URI;
                String j = ((msh) alogVar.get(0)).j(((Boolean) new mst(4).get()).booleanValue());
                String aw = d.aw(messageCoreData);
                long epochMilli = messageCoreData.X().toEpochMilli();
                messageCoreData.aE();
                return wzsVar.ag(context, uri, b, j, aw, epochMilli, -1, 2, xhvVar, messageCoreData.Z());
            }
            return M(messageCoreData, ((val) this.j.b()).b(this.f, messageCoreData, b), alogVar, yyb.cE(xhvVar), b);
        }
        return ((wzs) this.i.b()).aj(this.f, n(alogVar), messageCoreData, ((val) this.j.b()).b(this.f, messageCoreData, b), yyb.cE(xhvVar), b, l, n);
    }

    private final vqh m(MessageCoreData messageCoreData, Uri uri, alog alogVar, rhc rhcVar) {
        int i;
        ((yyt) this.O.b()).E(messageCoreData);
        try {
            xrz a = ((xro) this.F.get()).a(messageCoreData, alogVar);
            if (messageCoreData != null) {
                xsq xsqVar = new xsq(messageCoreData, a);
                K(rhcVar, asgt.BUGLE_SENDING_INTERNAL_STATUS_PASSING_TO_FILE_TRANSFER);
                try {
                    akul c = ((zxy) this.G.get()).A().c(xsqVar);
                    vqh vqhVar = (vqh) agkg.a(c);
                    int i2 = vqhVar.b;
                    if (i2 != 0 && i2 != -1) {
                        aozy createBuilder = amrl.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amrl amrlVar = (amrl) createBuilder.b;
                        amrlVar.e = 0;
                        amrlVar.b |= 1;
                        ((yyt) this.O.b()).C(messageCoreData, (amrl) createBuilder.s(), Optional.empty());
                    }
                    return vqhVar;
                } catch (InterruptedException | ExecutionException e2) {
                    alvw h = e.h();
                    h.X(alwp.a, "BugleDataModel");
                    alvg alvgVar = (alvg) h;
                    alvgVar.X(ydl.f, messageCoreData.E());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "startFileTransfer", 1493, "SendMessageAction.java")).q("Cannot start RCS FT, failed to get active transport.");
                    aozy createBuilder2 = amrl.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    amrl amrlVar2 = (amrl) createBuilder2.b;
                    amrlVar2.e = 16;
                    amrlVar2.b |= 1;
                    ((yyt) this.O.b()).C(messageCoreData, (amrl) createBuilder2.s(), Optional.empty());
                    if (e2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    throw new IllegalStateException("Failed to get active transport.", e2);
                }
            }
            throw new NullPointerException("Null messageCoreData");
        } catch (IOException | IllegalArgumentException e3) {
            alvw h2 = e.h();
            h2.X(alwp.a, "BugleDataModel");
            alvg alvgVar2 = (alvg) h2;
            alvgVar2.X(ydl.f, messageCoreData.E());
            ((alvg) ((alvg) alvgVar2.g(e3)).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "startFileTransfer", 1442, "SendMessageAction.java")).q("Unable to prepare file for uploading to content server.");
            aozy createBuilder3 = amrl.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar = createBuilder3.b;
            amrl amrlVar3 = (amrl) apagVar;
            amrlVar3.e = 15;
            amrlVar3.b |= 1;
            if (true != (e3 instanceof IllegalArgumentException)) {
                i = 3;
            } else {
                i = 2;
            }
            if (!apagVar.isMutable()) {
                createBuilder3.u();
            }
            amrl amrlVar4 = (amrl) createBuilder3.b;
            amrlVar4.d = Integer.valueOf(i - 1);
            amrlVar4.c = 8;
            ((yyt) this.O.b()).C(messageCoreData, (amrl) createBuilder3.s(), Optional.empty());
            vqg a2 = vqh.a(3, 10001);
            a2.c = uri;
            a2.b(1);
            aozy createBuilder4 = amxb.a.createBuilder();
            aozy createBuilder5 = amxc.a.createBuilder();
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            apag apagVar2 = createBuilder5.b;
            amxc amxcVar = (amxc) apagVar2;
            amxcVar.d = 1;
            amxcVar.b |= 4;
            amwx amwxVar = amwx.CHAT_API_UPLOAD_START_FAILED;
            if (!apagVar2.isMutable()) {
                createBuilder5.u();
            }
            amxc amxcVar2 = (amxc) createBuilder5.b;
            amxcVar2.e = amwxVar.x;
            amxcVar2.b = 8 | amxcVar2.b;
            amxc amxcVar3 = (amxc) createBuilder5.s();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            amxb amxbVar = (amxb) createBuilder4.b;
            amxcVar3.getClass();
            amxbVar.c = amxcVar3;
            amxbVar.b |= 1;
            a2.d = (amxb) createBuilder4.s();
            return a2.a();
        }
    }

    private static alog n(alog alogVar) {
        Stream map = Collection.EL.stream(alogVar).map(new rbs(13));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("SendMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SendMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akul e() {
        return aktp.ai(new rbg(this, 4), this.C);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fA() {
        return false;
    }

    public final amgt h(MessageCoreData messageCoreData) {
        return (amgt) ((mgi) this.W.get()).fu(messageCoreData.N());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(5:514|(1:516)|(1:518)(1:530)|519|(17:527|(1:513)(1:48)|49|(3:392|393|(11:395|396|(9:470|471|472|473|474|475|476|477|478)(22:398|399|400|401|402|403|404|405|406|407|408|409|410|411|412|413|415|416|417|(1:419)|420|421)|58|(1:60)(2:68|(9:84|85|(3:87|88|89)(1:92)|90|62|63|64|65|66)(7:70|71|(1:73)|74|(2:76|(1:78))(1:83)|(1:80)(1:82)|81))|61|62|63|64|65|66))|51|52|(2:54|55)(4:104|105|106|(12:108|(1:110)(3:112|113|114)|111|57|58|(0)(0)|61|62|63|64|65|66)(2:122|(12:(1:125)(2:137|(1:139))|(3:127|128|129)|111|57|58|(0)(0)|61|62|63|64|65|66)(2:140|(1:142)(11:143|144|(4:(1:147)|148|149|(9:151|(1:153)(1:164)|154|(1:156)|157|(1:159)|160|(1:162)|163)(8:165|166|(7:338|339|(3:341|342|343)(1:349)|344|345|(0)(0)|61)(16:168|169|170|(3:291|292|(10:294|295|296|297|298|299|300|(1:302)|303|(3:305|(0)(0)|61)(14:306|(3:308|(2:315|(1:317)(1:318))(1:310)|311)(1:319)|312|173|174|175|176|(2:252|253)|178|179|(19:181|183|184|185|(3:187|188|189)|200|201|202|(1:204)(2:232|(2:234|(1:236)(1:237))(4:238|(1:240)|241|(1:243)(3:244|245|246)))|205|206|207|208|209|210|211|212|213|214)(1:250)|215|(1:(1:218)(1:219))|220)))|172|173|174|175|176|(0)|178|179|(0)(0)|215|(0)|220)|62|63|64|65|66))(3:356|(4:360|(1:362)(1:371)|363|(1:365)(3:366|367|368))|372)|221|(0)(0)|61|62|63|64|65|66))))|56|57|58|(0)(0)|61|62|63|64|65|66))|52|(0)(0)|56|57|58|(0)(0)|61|62|63|64|65|66) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:(10:(3:291|292|(10:294|295|296|297|298|299|300|(1:302)|303|(3:305|(0)(0)|61)(14:306|(3:308|(2:315|(1:317)(1:318))(1:310)|311)(1:319)|312|173|174|175|176|(2:252|253)|178|179|(19:181|183|184|185|(3:187|188|189)|200|201|202|(1:204)(2:232|(2:234|(1:236)(1:237))(4:238|(1:240)|241|(1:243)(3:244|245|246)))|205|206|207|208|209|210|211|212|213|214)(1:250)|215|(1:(1:218)(1:219))|220)))|175|176|(0)|178|179|(0)(0)|215|(0)|220)|173|174) */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0a96, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0a82, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0a83, code lost:
    
        r31 = r11;
        r29 = r12;
        r30 = "com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction";
        r12 = r5;
        r47 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0ac0, code lost:
    
        r15 = r3;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0bb6, code lost:
    
        r1 = r0;
        r11 = r11;
        r12 = r12;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0a98, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0a8e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0a8f, code lost:
    
        r31 = r11;
        r29 = r12;
        r30 = "com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction";
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0acf, code lost:
    
        r12 = r5;
        r15 = r3;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0b83, code lost:
    
        r1 = r0;
        r3 = r23;
        r14 = r29;
        r9 = r30;
        r13 = r38;
        r11 = r11;
        r12 = r12;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x03f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x03f9, code lost:
    
        r1 = r0;
        r47 = r6;
        r31 = r11;
        r29 = r12;
        r30 = "com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction";
        r23 = "sendMessage";
        r15 = r3;
        r20 = null;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x040b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x040c, code lost:
    
        r1 = r0;
        r31 = r11;
        r9 = "com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction";
        r3 = "sendMessage";
        r13 = r38;
        r15 = r3;
        r11 = r4;
        r12 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0872 A[Catch: SecurityException -> 0x0a82, xys -> 0x0a8e, InterruptedException -> 0x0a96, ExecutionException -> 0x0a98, all -> 0x0b47, TRY_LEAVE, TryCatch #13 {all -> 0x0b47, blocks: (B:106:0x0419, B:122:0x04bd, B:140:0x054b, B:143:0x0579, B:148:0x0593, B:165:0x0654, B:170:0x06b1, B:174:0x07f0, B:179:0x083d, B:181:0x0872), top: B:105:0x0419 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0819 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x035a A[Catch: SecurityException -> 0x0371, xys -> 0x0373, all -> 0x037b, TryCatch #30 {all -> 0x037b, blocks: (B:400:0x0272, B:403:0x0278, B:406:0x0283, B:408:0x0297, B:416:0x02d1, B:417:0x0330, B:419:0x035a, B:420:0x035e, B:426:0x02f5, B:428:0x0324, B:429:0x032b, B:440:0x02e9, B:439:0x02e6), top: B:399:0x0272 }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0324 A[Catch: SecurityException -> 0x0371, xys -> 0x0373, all -> 0x037b, TryCatch #30 {all -> 0x037b, blocks: (B:400:0x0272, B:403:0x0278, B:406:0x0283, B:408:0x0297, B:416:0x02d1, B:417:0x0330, B:419:0x035a, B:420:0x035e, B:426:0x02f5, B:428:0x0324, B:429:0x032b, B:440:0x02e9, B:439:0x02e6), top: B:399:0x0272 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0be6 A[Catch: all -> 0x0e1c, TryCatch #99 {all -> 0x0e1c, blocks: (B:60:0x0be6, B:61:0x0d58, B:68:0x0c1b, B:89:0x0c64, B:90:0x0c6b, B:71:0x0cae, B:73:0x0cbc, B:74:0x0ce0, B:76:0x0cfb, B:78:0x0d08, B:80:0x0d14, B:81:0x0d1a, B:281:0x0bd7, B:290:0x0d8c, B:572:0x0e1b, B:571:0x0e18, B:566:0x0e12), top: B:12:0x005e, inners: #96 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0c1b A[Catch: all -> 0x0e1c, TRY_LEAVE, TryCatch #99 {all -> 0x0e1c, blocks: (B:60:0x0be6, B:61:0x0d58, B:68:0x0c1b, B:89:0x0c64, B:90:0x0c6b, B:71:0x0cae, B:73:0x0cbc, B:74:0x0ce0, B:76:0x0cfb, B:78:0x0d08, B:80:0x0d14, B:81:0x0d1a, B:281:0x0bd7, B:290:0x0d8c, B:572:0x0e1b, B:571:0x0e18, B:566:0x0e12), top: B:12:0x005e, inners: #96 }] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v14, types: [aluw, alvi] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r18v6, types: [rdg] */
    /* JADX WARN: Type inference failed for: r1v165, types: [alvg] */
    /* JADX WARN: Type inference failed for: r1v212, types: [alvg] */
    /* JADX WARN: Type inference failed for: r1v252, types: [alvg] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v2, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [amxb] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v87, types: [alvg] */
    /* JADX WARN: Type inference failed for: r2v93, types: [alvg] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 3907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.j():void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SendMessageAction(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, xnv xnvVar, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, anen anenVar, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24, armf armfVar25, armf armfVar26, armf armfVar27, armf armfVar28, armf armfVar29, armf armfVar30, armf armfVar31, armf armfVar32, armf armfVar33, armf armfVar34, armf armfVar35, armf armfVar36, armf armfVar37, armf armfVar38, armf armfVar39, armf armfVar40, armf armfVar41, armf armfVar42, armf armfVar43, Parcel parcel) {
        super(parcel, amdy.SEND_MESSAGE_ACTION);
        this.f = context;
        this.g = armfVar;
        this.o = armfVar2;
        this.h = albo.D(new rfv(armfVar4, 0));
        this.a = albo.D(new qwq(armfVar5, 15));
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = xnvVar;
        this.l = armfVar8;
        this.m = armfVar9;
        this.n = albo.D(new qwq(armfVar10, 16));
        this.p = armfVar11;
        this.q = armfVar12;
        this.z = armfVar13;
        this.A = armfVar14;
        this.B = armfVar15;
        this.C = anenVar;
        this.D = albo.D(new qwq(armfVar16, 17));
        this.E = armfVar17;
        this.F = albo.D(new qwq(armfVar18, 18));
        this.G = albo.D(new qwq(armfVar19, 19));
        this.H = armfVar20;
        this.I = armfVar21;
        this.J = armfVar22;
        this.K = armfVar3;
        this.L = armfVar23;
        this.M = armfVar24;
        this.b = armfVar25;
        this.N = armfVar26;
        this.O = armfVar27;
        this.P = armfVar28;
        this.Q = armfVar29;
        this.R = armfVar30;
        this.S = albo.D(new qwq(armfVar31, 20));
        this.T = armfVar32;
        this.U = armfVar33;
        this.V = armfVar34;
        this.W = albo.D(new rfv(armfVar35, 1));
        this.Y = armfVar36;
        this.X = armfVar37;
        this.Z = armfVar38;
        this.c = armfVar39;
        this.d = armfVar40;
        this.aa = armfVar41;
        this.ab = armfVar42;
        this.ac = armfVar43;
    }
}
