package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrf {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public static final alwo b = alwo.o("BugleNotifications");
    public final armf A;
    public final xqc B;
    public final armf C;
    public final xrk D;
    public final armf E;
    public final armf F;
    public final armf G;
    public final armf H;
    public final armf I;
    public final tzn J;
    public final zai K;
    public final qnu L;
    public final uac M;
    public final lpg N;
    private final vqm O;
    private final armf P;
    private final armf Q;
    private final armf R;
    private final armf S;
    private final zxy T;
    public final anen c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final wze j;
    public final vsh k;
    public final armf l;
    public final agnq m;
    public final tqx n;
    public final armf o;
    public final rys p;
    public final xnv q;
    public final rjm r;
    public final yxx s;
    public final prd t;
    public final armf u;
    public final armf v;
    public final apwt w;
    public final armf x;
    public final armf y;
    public final armf z;

    public xrf(anen anenVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, wze wzeVar, qnu qnuVar, vsh vshVar, armf armfVar8, agnq agnqVar, tqx tqxVar, armf armfVar9, zai zaiVar, tzn tznVar, rys rysVar, xnv xnvVar, vqm vqmVar, rjm rjmVar, zxy zxyVar, yxx yxxVar, prd prdVar, uac uacVar, armf armfVar10, armf armfVar11, apwt apwtVar, armf armfVar12, armf armfVar13, lpg lpgVar, armf armfVar14, armf armfVar15, armf armfVar16, xqc xqcVar, armf armfVar17, xrk xrkVar, armf armfVar18, armf armfVar19, armf armfVar20, armf armfVar21, armf armfVar22, armf armfVar23, armf armfVar24) {
        this.c = anenVar;
        this.d = armfVar;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
        this.i = armfVar7;
        this.j = wzeVar;
        this.L = qnuVar;
        this.k = vshVar;
        this.l = armfVar8;
        this.m = agnqVar;
        this.n = tqxVar;
        this.o = armfVar9;
        this.K = zaiVar;
        this.J = tznVar;
        this.p = rysVar;
        this.q = xnvVar;
        this.O = vqmVar;
        this.r = rjmVar;
        this.T = zxyVar;
        this.s = yxxVar;
        this.t = prdVar;
        this.M = uacVar;
        this.u = armfVar10;
        this.v = armfVar11;
        this.w = apwtVar;
        this.x = armfVar12;
        this.y = armfVar13;
        this.N = lpgVar;
        this.z = armfVar14;
        this.P = armfVar15;
        this.A = armfVar16;
        this.B = xqcVar;
        this.C = armfVar17;
        this.D = xrkVar;
        this.Q = armfVar18;
        this.E = armfVar19;
        this.F = armfVar20;
        this.G = armfVar2;
        this.R = armfVar21;
        this.H = armfVar22;
        this.I = armfVar23;
        this.S = armfVar24;
    }

    public static boolean f(qei qeiVar) {
        qeh qehVar = qeh.BOT;
        qeh b2 = qeh.b(qeiVar.c);
        if (b2 == null) {
            b2 = qeh.UNKNOWN_TYPE;
        }
        return qehVar.equals(b2);
    }

    public static boolean g(qei qeiVar) {
        qeh qehVar = qeh.GROUP;
        qeh b2 = qeh.b(qeiVar.c);
        if (b2 == null) {
            b2 = qeh.UNKNOWN_TYPE;
        }
        return qehVar.equals(b2);
    }

    public static boolean h(qei qeiVar, ParticipantsTable.BindData bindData) {
        if (f(qeiVar)) {
            return true;
        }
        if (bindData != null) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "isRbmBot", 1200, "IncomingFileTransferProcessor.java")).q("Server and client mismatch in whether this is a bot participant. Assume thisis a server mishap.");
            return true;
        }
        return false;
    }

    public static /* synthetic */ void i(xrf xrfVar, MessageCoreData messageCoreData) {
        Iterator it = ((Set) xrfVar.w.b()).iterator();
        while (it.hasNext()) {
            ((rwo) it.next()).c(messageCoreData);
        }
    }

    public final ParticipantsTable.BindData a(ParticipantsTable.BindData bindData, BusinessInfoData businessInfoData) {
        return (ParticipantsTable.BindData) this.m.c("IncomingRcsFileTransferHandler#getOrCreateParticipantInBugleDb", new tdw(this, bindData, businessInfoData, 14, (char[]) null));
    }

    public final akul b(final MessageCoreData messageCoreData, final xqn xqnVar, final FileTransferInformation fileTransferInformation, final boolean z, final amgu amguVar) {
        akul e;
        final xpz z2 = this.T.z();
        MessageIdType B = messageCoreData.B();
        Optional c = fileTransferInformation.c();
        if (c.isEmpty()) {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "downloadThumbnail", 1360, "IncomingFileTransferProcessor.java")).q("Thumbnail is not present.");
            e = aktp.ag(null);
        } else {
            e = z2.a(B, (FileInformation) c.get(), xqnVar.toByteString()).h(new xqp(3), this.c).e(xpt.class, new xqp(4), this.c);
        }
        return e.i(new ancs() { // from class: xrc
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                xrf xrfVar = xrf.this;
                MessageCoreData messageCoreData2 = messageCoreData;
                FileTransferInformation fileTransferInformation2 = fileTransferInformation;
                if (!z) {
                    return aktp.ai(new xfb(messageCoreData2, fileTransferInformation2.a(), 9, null), xrfVar.c).h(new xqi(messageCoreData2, 8), xrfVar.c);
                }
                amgu amguVar2 = amguVar;
                xqn xqnVar2 = xqnVar;
                xpz xpzVar = z2;
                FileInformation a2 = fileTransferInformation2.a();
                return aktp.ah(new vri((Object) xrfVar, (Object) messageCoreData2, (Object) a2, 14, (short[]) null), xrfVar.c).i(new vug((Object) xpzVar, (Object) messageCoreData2, (Object) a2, (apag) xqnVar2, 9), xrfVar.c).h(new xqi(messageCoreData2, 7), xrfVar.c).e(xpt.class, new way(xrfVar, messageCoreData2, amguVar2, 15, (short[]) null), xrfVar.c);
            }
        }, this.c).h(new xqi(messageCoreData, 9), this.c);
    }

    public final akul c(MessageCoreData messageCoreData, xwa xwaVar, ParticipantsTable.BindData bindData, qei qeiVar, qwm qwmVar) {
        String str;
        int e = qwmVar.e();
        String O = bindData.O();
        if (O == null) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "insertRcsFileTransferInTelephony", 1612, "IncomingFileTransferProcessor.java")).q("Not storing rcs file transfer in Telephony. Sender msisdn is null.");
            return aktp.ag(Optional.empty());
        }
        msh t = ((msk) this.x.b()).t(O, e);
        vqm vqmVar = this.O;
        long cE = yyb.cE(xwaVar.a());
        if (g(qeiVar)) {
            str = qeiVar.d;
        } else {
            str = null;
        }
        return vqmVar.h(messageCoreData, cE, t, str, e).h(new xqp(2), this.c);
    }

    public final akul d(final rve rveVar, final qei qeiVar, final qei qeiVar2, final ParticipantsTable.BindData bindData, final xwa xwaVar, final Instant instant, final Instant instant2, final qei qeiVar3, final FileTransferInformation fileTransferInformation, qfo qfoVar, final Bundle bundle) {
        int i;
        try {
            final qwm F = ((wpp) this.Q.b()).F(qeiVar2);
            aozy createBuilder = xqn.a.createBuilder();
            String str = rveVar.b;
            str.getClass();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((xqn) createBuilder.b).b = str;
            final xqn xqnVar = (xqn) createBuilder.s();
            int a2 = fileTransferInformation.a().a();
            yde e = ((zai) this.P.b()).e(fileTransferInformation.a().b(), r4.a());
            final boolean a3 = e.a();
            long j = e.a;
            alwo alwoVar = a;
            ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "isAutoDownload", 746, "IncomingFileTransferProcessor.java")).J("Calculating message status. FileSize: %d. Auto downloadable file size: %d.  Auto downloading: %b", Integer.valueOf(a2), Long.valueOf(j), Boolean.valueOf(a3));
            if (!a3) {
                ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "isAutoDownload", 751, "IncomingFileTransferProcessor.java")).t("File is not auto downloading b/c %s.", e.b);
            }
            amgu amguVar = qfoVar.l;
            if (amguVar == null) {
                amguVar = amgu.a;
            }
            final amgu amguVar2 = amguVar;
            final ConversationIdType conversationIdType = xwaVar.a;
            apwq apwqVar = qfoVar.i;
            if (apwqVar == null) {
                apwqVar = apwq.a;
            }
            final apwq apwqVar2 = apwqVar;
            final apaq apaqVar = new apaq(qfoVar.n, qfo.a);
            final FileInformation a4 = fileTransferInformation.a();
            if (a3) {
                i = 105;
            } else if (((peh) this.S.b()).a()) {
                i = 115;
            } else {
                i = 101;
            }
            final int i2 = i;
            return aktp.ai(new Callable() { // from class: xrb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    tqp tqpVar;
                    tqp tqpVar2;
                    FileInformation fileInformation = a4;
                    String contentType = ydh.b(fileInformation.b()).toString();
                    long a5 = fileInformation.a();
                    long epochMilli = fileInformation.d().toEpochMilli();
                    Instant instant3 = instant2;
                    Instant instant4 = instant;
                    qwm qwmVar = F;
                    String M = bindData.M();
                    SelfIdentityId g = qwmVar.g();
                    xrf xrfVar = xrf.this;
                    zai zaiVar = xrfVar.K;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    MessageCoreData q = xrfVar.n.q(contentType, null, a5, epochMilli, rveVar, -1L, M, g, conversationIdType2, null, i2, zaiVar.b(conversationIdType2), instant4.toEpochMilli(), instant3.toEpochMilli(), (String) fileInformation.h().orElse(""), (String) fileTransferInformation.c().map(new xos(4)).orElse(null));
                    xrfVar.M.r(q, bundle);
                    q.bD(((msk) xrfVar.x.b()).b(qeiVar));
                    msh b2 = ((msk) xrfVar.x.b()).b(qeiVar2);
                    d.s(b2.e().isPresent());
                    qeh b3 = qeh.b(((qei) b2.e().get()).c);
                    if (b3 == null) {
                        b3 = qeh.UNKNOWN_TYPE;
                    }
                    apwq apwqVar3 = apwqVar2;
                    d.s(b3.equals(qeh.PHONE));
                    q.bA(b2);
                    q.bj(apwqVar3);
                    if (aczf.E()) {
                        List list = apaqVar;
                        if (list.contains(qfn.POSITIVE_DELIVERY)) {
                            tqpVar = tqp.NOT_SENT;
                        } else {
                            tqpVar = tqp.NOT_REQUESTED;
                        }
                        q.bv(tqpVar);
                        if (list.contains(qfn.DISPLAY)) {
                            tqpVar2 = tqp.NOT_SENT;
                        } else {
                            tqpVar2 = tqp.NOT_REQUESTED;
                        }
                        q.bw(tqpVar2);
                    }
                    return q;
                }
            }, this.c).h(new xqi(this, 6), this.c).i(new xqx(this, qfoVar, rveVar, bindData, xwaVar, qeiVar3, instant2, a3, F, 0), this.c).i(new ancs() { // from class: xqy
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj) {
                    xre xreVar = (xre) obj;
                    int b2 = xreVar.b();
                    rve rveVar2 = rveVar;
                    xwa xwaVar2 = xwaVar;
                    if (b2 == 2) {
                        alwl alwlVar = (alwl) xrf.a.g();
                        alwlVar.X(ydl.e, rveVar2.toString());
                        alwlVar.X(ydl.o, xwaVar2.a.toString());
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForValidParticipant", 706, "IncomingFileTransferProcessor.java")).q("Skipping the file download.");
                        return aktp.ag(xreVar.c());
                    }
                    qwm qwmVar = F;
                    amgu amguVar3 = amguVar2;
                    boolean z = a3;
                    FileTransferInformation fileTransferInformation2 = fileTransferInformation;
                    qei qeiVar4 = qeiVar3;
                    xqn xqnVar2 = xqnVar;
                    ParticipantsTable.BindData bindData2 = bindData;
                    xrf xrfVar = xrf.this;
                    if (((Boolean) ((utz) pyl.a.get()).e()).booleanValue()) {
                        MessageCoreData a5 = xreVar.a();
                        akul aj = aktp.aj(new ttt(xrfVar, a5, xwaVar2, bindData2, qeiVar4, qwmVar, 4), xrfVar.c);
                        xrk xrkVar = xrfVar.D;
                        alwl alwlVar2 = (alwl) xrk.a.g();
                        alwlVar2.X(ydl.e, rveVar2.b);
                        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "addFutureForRcsMessage", 46, "TelephonyInsertionFutureRepository.java")).q("Adding Telephony insertion future to the repository.");
                        xrkVar.b.put(rveVar2, aj.h(new xpm(xrkVar, rveVar2, 7), andi.a));
                        return aktp.an(xrfVar.b(a5, xqnVar2, fileTransferInformation2, z, amguVar3).h(new xqi(xrfVar, 2), xrfVar.c), aj).i(new tvp(xrfVar, a5, rveVar2, bindData2, aj, 6), xrfVar.c);
                    }
                    return xrfVar.b(xreVar.a(), xqnVar2, fileTransferInformation2, z, amguVar3).h(new xqi(xrfVar, 4), xrfVar.c).i(new vki(xrfVar, rveVar2, xwaVar2, bindData2, qeiVar4, qwmVar, 5), xrfVar.c);
                }
            }, this.c);
        } catch (IllegalStateException unused) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(ydl.e, rveVar.toString());
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForValidParticipant", 644, "IncomingFileTransferProcessor.java")).q("Cannot process incoming FT message because the subscription was not found");
            ((qya) this.R.b()).r(rveVar, qeiVar2);
            return aktp.ag(pwh.FAIL_RETRY);
        }
    }

    public final akul e(MessageCoreData messageCoreData, rve rveVar, ParticipantsTable.BindData bindData, Optional optional) {
        return aktp.aj(new tvp(this, optional, rveVar, messageCoreData, bindData, 7), this.c).i(new xfv(this, bindData, 7, null), this.c);
    }
}
