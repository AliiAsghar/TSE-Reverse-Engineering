package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wen {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender");
    public final wfe b;
    private final ykw c;
    private final Context d;
    private final armf e;
    private final armf f;
    private final wze g;
    private final agnq h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final qnu l;
    private final hgj m;

    public wen(ykw ykwVar, Context context, armf armfVar, armf armfVar2, wze wzeVar, qnu qnuVar, hgj hgjVar, agnq agnqVar, wfe wfeVar, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.c = ykwVar;
        this.d = context;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = wzeVar;
        this.l = qnuVar;
        this.m = hgjVar;
        this.h = agnqVar;
        this.b = wfeVar;
        this.i = armfVar3;
        this.j = armfVar4;
        this.k = armfVar5;
    }

    static final void e(MessageIdType messageIdType) {
        f().e(messageIdType);
    }

    private static sya f() {
        sya syaVar = new sya();
        syaVar.aa("report_attempt_acounter", agkx.h(MessagesTable.c.U));
        return syaVar;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [msh, java.lang.Object] */
    private final wem g(MessageCoreData messageCoreData, int i, int i2) {
        wem wemVar;
        aoia d;
        arjv arjvVar;
        ((mho) this.f.b()).A(messageCoreData.E(), messageCoreData, i2, this.m.n());
        akrh e = aktp.e("SendReportAction#sendReportForMessage_dsdrGroupsFlag");
        try {
            if (((okf) this.k.b()).a()) {
                try {
                    wzi wziVar = (wzi) this.j.b();
                    int ordinal = ((wzj) qjh.a(arrn.I(wziVar.a, null, null, new ras(wziVar, messageCoreData, i, i2, (arpe) null, 3), 3)).get()).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                wemVar = wem.SKIPPED;
                            } else {
                                throw new IllegalArgumentException("Unknown RcsMessageReceiptSenderWrapperResult");
                            }
                        } else {
                            wemVar = wem.FAILED;
                        }
                    } else {
                        wemVar = wem.SUCCEEDED;
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    psp pspVar = new psp("Failed to get the send message receipt future result.", e2);
                    qiu.d(pspVar);
                    throw pspVar;
                }
            } else {
                Optional ac = messageCoreData.ac();
                if (ac.isEmpty()) {
                    alvg alvgVar = (alvg) a.i();
                    alvgVar.X(ydl.f, messageCoreData.E());
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportWithChatApiLegacy", 373, "RcsReportSender.java")).q("Original message sender messaging identity is empty");
                    h(messageCoreData, i2);
                    wemVar = wem.FAILED;
                } else {
                    if (tvu.e(i)) {
                        if (!vtn.a(messageCoreData.z())) {
                            alvg alvgVar2 = (alvg) a.i();
                            alvgVar2.X(ydl.f, messageCoreData.E());
                            alvgVar2.X(ydl.b, messageCoreData.B());
                            alvgVar2.X(ydl.p, messageCoreData.z());
                            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportWithChatApiLegacy", 386, "RcsReportSender.java")).q("Not sending report. RCS group does not have valid global identifiers and we are using ChatAPI.");
                            h(messageCoreData, i2);
                            wemVar = wem.SKIPPED;
                        } else {
                            alvg alvgVar3 = (alvg) a.d();
                            alvgVar3.X(ydl.f, messageCoreData.E());
                            alvgVar3.X(ydl.p, messageCoreData.z());
                            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportWithChatApiLegacy", 397, "RcsReportSender.java")).q("Attempt to use senderSendDestination to send report");
                            qnu qnuVar = this.l;
                            ConversationIdType z = messageCoreData.z();
                            d = qnuVar.e(((hgj) qnuVar.b).p(z), albo.ag(ac.get().g()));
                        }
                    } else {
                        alvg alvgVar4 = (alvg) a.d();
                        alvgVar4.X(ydl.f, messageCoreData.E());
                        alvgVar4.X(ydl.p, messageCoreData.z());
                        ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportWithChatApiLegacy", 407, "RcsReportSender.java")).q("Attempt to use senderSendDestination to send report");
                        d = this.l.d(albo.ag(ac.get().g()));
                    }
                    if (i2 != 1) {
                        if (i2 == 10) {
                            if (!this.g.a(messageCoreData)) {
                                alvg alvgVar5 = (alvg) a.g();
                                alvgVar5.X(ydl.f, messageCoreData.E());
                                ((alvg) alvgVar5.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportWithChatApiLegacy", 438, "RcsReportSender.java")).q("Not sending read report");
                                wemVar = wem.FAILED;
                            } else if (messageCoreData.cs()) {
                                alvg alvgVar6 = (alvg) a.g();
                                alvgVar6.X(ydl.f, messageCoreData.E());
                                ((alvg) alvgVar6.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportWithChatApiLegacy", 444, "RcsReportSender.java")).q("Not sending read report for a hidden message");
                                wemVar = wem.SUCCEEDED;
                            } else {
                                try {
                                    arjvVar = (arjv) this.g.d(messageCoreData, d).get();
                                } catch (InterruptedException | ExecutionException e3) {
                                    psp pspVar2 = new psp("Failed to get the send displayed message receipt future result.", e3);
                                    qiu.d(pspVar2);
                                    throw pspVar2;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException(a.bV(i2, "Unexpected report type: "));
                        }
                    } else {
                        try {
                            arjvVar = (arjv) this.g.b(messageCoreData, d).get();
                        } catch (InterruptedException | ExecutionException e4) {
                            psp pspVar3 = new psp("Failed to get the send delivered message receipt future result.", e4);
                            qiu.d(pspVar3);
                            throw pspVar3;
                        }
                    }
                    Object obj = arjvVar.b;
                    if (!arjvVar.a && obj != null) {
                        ((mho) this.f.b()).C(messageCoreData.E(), messageCoreData, i2, (amxb) obj, (amxo) arjvVar.c);
                    }
                    if (arjvVar.a) {
                        wemVar = wem.SUCCEEDED;
                    } else {
                        wemVar = wem.FAILED;
                    }
                }
            }
            e.close();
            return wemVar;
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
    private final void h(MessageCoreData messageCoreData, int i) {
        aozy createBuilder = amxb.a.createBuilder();
        aozy createBuilder2 = amxc.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amxc amxcVar = (amxc) apagVar;
        amxcVar.d = 1;
        amxcVar.b |= 4;
        amwx amwxVar = amwx.CHAT_API_INVALID_REMOTE_PARTICIPANT;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        amxc amxcVar2 = (amxc) createBuilder2.b;
        amxcVar2.e = amwxVar.x;
        amxcVar2.b |= 8;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxb amxbVar = (amxb) createBuilder.b;
        amxc amxcVar3 = (amxc) createBuilder2.s();
        amxcVar3.getClass();
        amxbVar.c = amxcVar3;
        amxbVar.b |= 1;
        ((mho) this.f.b()).C(messageCoreData.E(), messageCoreData, i, (amxb) createBuilder.s(), this.m.n());
    }

    public final wem a(MessageCoreData messageCoreData, boolean z, int i) {
        ConversationIdType z2 = messageCoreData.z();
        MessageIdType B = messageCoreData.B();
        rve E = messageCoreData.E();
        tqp K = messageCoreData.K();
        if (K.equals(tqp.NOT_SENT)) {
            alvi alviVar = a;
            alvg alvgVar = (alvg) alviVar.d();
            alvgVar.X(ydl.f, E);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 234, "RcsReportSender.java")).q("Try to send delivery report.");
            wem g = g(messageCoreData, i, 1);
            alvg alvgVar2 = (alvg) alviVar.g();
            alvgVar2.X(ydl.f, E);
            ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 241, "RcsReportSender.java")).t("Finished queuing delivery report. result: %s", g);
            if (!g.a()) {
                e(B);
                return g;
            }
            sya f = f();
            f.aj("updateDeliveryReportStatusSent");
            f.q(tqp.SENT);
            ((rwd) this.e.b()).J(z2, B, f);
        } else if (K.equals(tqp.NOT_REQUESTED)) {
            alvg alvgVar3 = (alvg) a.g();
            alvgVar3.X(ydl.f, E);
            ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 257, "RcsReportSender.java")).q("Delivery report is not requested.");
        }
        tqp L = messageCoreData.L();
        Context context = this.d;
        ykw ykwVar = this.c;
        Resources resources = context.getResources();
        if (ykwVar.q(resources.getString(R.string.send_seen_report_rcs_pref_key), resources.getBoolean(R.bool.send_seen_report_rcs_pref_default)) && !z && messageCoreData.cA() && L.equals(tqp.NOT_SENT)) {
            alvi alviVar2 = a;
            alvg alvgVar4 = (alvg) alviVar2.d();
            alvgVar4.X(ydl.f, E);
            ((alvg) alvgVar4.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 268, "RcsReportSender.java")).q("Try to send display report.");
            wem g2 = g(messageCoreData, i, 10);
            alvg alvgVar5 = (alvg) alviVar2.g();
            alvgVar5.X(ydl.f, E);
            ((alvg) alvgVar5.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 274, "RcsReportSender.java")).t("Finished queuing display report. result: %s", g2);
            if (!g2.a()) {
                e(B);
                return g2;
            }
            sya f2 = f();
            f2.aj("updateReadReportStatusSent");
            f2.r(tqp.SENT);
            ((rwd) this.e.b()).J(z2, B, f2);
        } else if (L.equals(tqp.NOT_REQUESTED)) {
            alvg alvgVar6 = (alvg) a.g();
            alvgVar6.X(ydl.f, E);
            ((alvg) alvgVar6.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageInternal", 288, "RcsReportSender.java")).q("Read report is not requested.");
        }
        return wem.SUCCEEDED;
    }

    public final boolean b() {
        ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendAllUnsentReports", 106, "RcsReportSender.java")).q("Try to resend all unsent reports.");
        Set h = this.b.h();
        smv[] smvVarArr = rtk.a;
        sxy d = MessagesTable.d();
        d.w("getAllUnsentMessagesQuery");
        d.q();
        d.k(rtk.b);
        rtk.a(h, d);
        d.h(new atkn((Object) MessagesTable.c.i, false));
        snf e = sni.e();
        e.c(rtk.a);
        d.A(agoh.b(e.b(), sni.c.a, MessagesTable.c.b).a());
        return d(d.b().t());
    }

    public final boolean c(MessageIdType messageIdType) {
        akrh e = aktp.e("SendReportAction#sendMessageReportInternal");
        try {
            alvg alvgVar = (alvg) a.d();
            alvgVar.X(ydl.b, messageIdType);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessage", 131, "RcsReportSender.java")).q("Try to send DELIVERY/DISPLAY report for message.");
            boolean booleanValue = ((Boolean) this.h.b(new ubu(this, messageIdType, 14, null))).booleanValue();
            e.close();
            return booleanValue;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(alog alogVar) {
        boolean z = true;
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) alogVar.get(i);
            rve D = bindData.D();
            Optional flatMap = Optional.ofNullable(bindData.P()).flatMap(new vvi(15));
            if (flatMap.isEmpty()) {
                alvg alvgVar = (alvg) a.i();
                alvgVar.X(ydl.f, bindData.D());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "getParticipantData", 532, "RcsReportSender.java")).q("Can't find sender.");
            }
            if (!flatMap.isEmpty()) {
                boolean R = ((ParticipantsTable.BindData) flatMap.get()).R();
                smr[] smrVarArr = (smr[]) bindData.au("conversations", new smr[0]);
                if (smrVarArr.length == 0) {
                    alvg alvgVar2 = (alvg) a.i();
                    alvgVar2.X(ydl.f, D);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageListInternal", 192, "RcsReportSender.java")).q("Can't find conversation.");
                } else {
                    int h = smrVarArr[0].h();
                    if (tvu.f(h)) {
                        alvg alvgVar3 = (alvg) a.i();
                        alvgVar3.X(ydl.f, D);
                        ((alvg) alvgVar3.h("com/google/android/apps/messaging/shared/rcs/outgoing/RcsReportSender", "sendReportsForMessageListInternal", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "RcsReportSender.java")).q("Unexpected conversation type");
                    } else {
                        MessageCoreData a2 = ((tqx) this.i.b()).a();
                        a2.aI(bindData);
                        wem a3 = a(a2, R, h);
                        z &= a3.a();
                        if (a3 == wem.FAILED) {
                            break;
                        }
                    }
                }
            }
        }
        return z;
    }
}
