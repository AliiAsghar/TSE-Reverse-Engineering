package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qdn implements ajqv {
    public static final alwo a = alwo.o("Bugle");
    public final qdk b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final qdq i;
    private final armf j;
    private final anen k;
    private final pwb l = new pwb();
    private final xnv m;
    private final Bundle n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;
    private final armf u;

    public qdn(qdk qdkVar, qdq qdqVar, Bundle bundle, anen anenVar, xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14) {
        this.b = qdkVar;
        this.i = qdqVar;
        this.n = bundle;
        this.g = armfVar10;
        this.s = armfVar11;
        this.h = armfVar12;
        this.t = armfVar14;
        this.k = anenVar;
        this.m = xnvVar;
        this.o = armfVar2;
        this.c = armfVar3;
        this.d = armfVar;
        this.p = armfVar4;
        this.j = armfVar5;
        this.q = armfVar6;
        this.r = armfVar7;
        this.e = armfVar8;
        this.u = armfVar13;
        this.f = armfVar9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int h() {
        String str;
        apwq apwqVar = this.b.a.i;
        if (apwqVar == null) {
            apwqVar = apwq.a;
        }
        apws apwsVar = apws.a;
        apbo apboVar = apwqVar.b;
        if (apboVar.containsKey("http://id.messages.google.com")) {
            apwsVar = (apws) apboVar.get("http://id.messages.google.com");
        }
        apbo apboVar2 = apwsVar.b;
        if (apboVar2.containsKey("warn-level")) {
            str = (String) apboVar2.get("warn-level");
        } else {
            str = "";
        }
        if ("warn".equals(str)) {
            return 1;
        }
        return 0;
    }

    private final akul i() {
        akrh e = aktp.e("UnencryptedIncomingChatMessageVisitor::clearTypingIndicatorAsync");
        try {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "clearTypingIndicator", 803, "UnencryptedIncomingChatMessageVisitor.java")).q("Clearing typing indicator on incoming message async.");
            akul aj = aktp.aj(new ikm(this, 14), this.k);
            e.b(aj);
            aj.k(qiu.b(), andi.a);
            akul ag = aktp.ag(null);
            e.close();
            return ag;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void j(MessageReceipt messageReceipt, int i) {
        qfo qfoVar = this.b.a;
        String d = messageReceipt.d();
        apct apctVar = qfoVar.k;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        long epochMilli = aotl.l(apctVar).toEpochMilli();
        qei qeiVar = this.b.a.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        qfo qfoVar2 = this.b.a;
        String str = qeiVar.d;
        qeh qehVar = qeh.GROUP;
        qei qeiVar2 = qfoVar2.e;
        if (qeiVar2 == null) {
            qeiVar2 = qei.a;
        }
        qeh b = qeh.b(qeiVar2.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        ChatSessionMessageEvent chatSessionMessageEvent = new ChatSessionMessageEvent(0L, d, epochMilli, i, str, qehVar.equals(b));
        vxz vxzVar = (vxz) this.s.b();
        qfo qfoVar3 = this.b.a;
        rve a2 = rve.a(qfoVar3.g);
        amgu amguVar = qfoVar3.l;
        if (amguVar == null) {
            amguVar = amgu.a;
        }
        vxzVar.a(chatSessionMessageEvent, false, a2, amguVar).k(qiu.c(new qdm(this, 0)), this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vqx a() {
        int h;
        String str;
        Bundle bundle = new Bundle();
        amgu amguVar = this.b.a.l;
        if (amguVar == null) {
            amguVar = amgu.a;
        }
        bundle.putByteArray("chat.extra.logData", amguVar.toByteArray());
        bundle.putAll(this.n);
        if (((oet) this.u.b()).a()) {
            apwq apwqVar = this.b.a.i;
            if (apwqVar == null) {
                apwqVar = apwq.a;
            }
            apws apwsVar = apws.a;
            apbo apboVar = apwqVar.b;
            if (apboVar.containsKey("http://www.gsma.com/rcs/")) {
                apwsVar = (apws) apboVar.get("http://www.gsma.com/rcs/");
            }
            apbo apboVar2 = apwsVar.b;
            if (apboVar2.containsKey("advised-action")) {
                str = (String) apboVar2.get("advised-action");
            } else {
                str = "";
            }
            if (str.equals("warn")) {
                h = 1;
            } else if (str.equals("hide")) {
                h = 2;
            } else {
                h = h();
            }
        } else {
            h = h();
        }
        qfo qfoVar = this.b.a;
        vqx a2 = vqy.a();
        a2.h(rve.a(qfoVar.g));
        qei qeiVar = this.b.a.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        a2.l(qeiVar.d);
        qei qeiVar2 = this.b.a.d;
        if (qeiVar2 == null) {
            qeiVar2 = qei.a;
        }
        a2.k(qeiVar2);
        a2.b = null;
        apct apctVar = this.b.a.k;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        a2.n(apds.a(apctVar));
        a2.j(this.m.f().toEpochMilli());
        pwb pwbVar = this.l;
        qel qelVar = this.b.a().c;
        if (qelVar == null) {
            qelVar = qel.a;
        }
        a2.e = ((ContentType) pwbVar.fu(qelVar)).toString();
        a2.i(-1L);
        a2.f = null;
        qfo qfoVar2 = this.b.a;
        qeh qehVar = qeh.GROUP;
        qei qeiVar3 = qfoVar2.e;
        if (qeiVar3 == null) {
            qeiVar3 = qei.a;
        }
        qeh b = qeh.b(qeiVar3.c);
        if (b == null) {
            b = qeh.UNKNOWN_TYPE;
        }
        a2.e(qehVar.equals(b));
        a2.o(h);
        qfo qfoVar3 = this.b.a;
        qeh qehVar2 = qeh.BOT;
        qei qeiVar4 = qfoVar3.d;
        if (qeiVar4 == null) {
            qeiVar4 = qei.a;
        }
        qeh b2 = qeh.b(qeiVar4.c);
        if (b2 == null) {
            b2 = qeh.UNKNOWN_TYPE;
        }
        a2.f(qehVar2.equals(b2));
        apwq apwqVar2 = this.b.a.i;
        if (apwqVar2 == null) {
            apwqVar2 = apwq.a;
        }
        a2.h = apwqVar2;
        qei qeiVar5 = this.b.a.f;
        if (qeiVar5 == null) {
            qeiVar5 = qei.a;
        }
        a2.m(qeiVar5);
        a2.b(bundle);
        qei qeiVar6 = this.b.a.e;
        if (qeiVar6 == null) {
            qeiVar6 = qei.a;
        }
        qeh b3 = qeh.b(qeiVar6.c);
        if (b3 == null) {
            b3 = qeh.UNKNOWN_TYPE;
        }
        if (b3.equals(qeh.GROUP)) {
            qfo qfoVar4 = this.b.a;
            a2.c = qfoVar4.h;
            qei qeiVar7 = qfoVar4.e;
            if (qeiVar7 == null) {
                qeiVar7 = qei.a;
            }
            a2.d = qeiVar7.d;
        }
        if (aczf.E()) {
            apaq apaqVar = new apaq(this.b.a.n, qfo.a);
            a2.c(apaqVar.contains(qfn.POSITIVE_DELIVERY));
            a2.d(apaqVar.contains(qfn.DISPLAY));
        } else {
            a2.c(false);
            a2.d(false);
        }
        return a2;
    }

    @Override // defpackage.ajqv
    public final void b(BasicTextMessage basicTextMessage) {
        i().i(new qdl(this, basicTextMessage, 2), this.k).h(new puy(this, 9), this.k).e(qdd.class, new puy(this, 10), this.k).e(vnn.class, new puy(this, 11), this.k).k(qiu.b(), andi.a);
    }

    @Override // defpackage.ajqv
    public final void c(ChatMessage chatMessage) {
        boolean z = false;
        if (ajru.f.e(chatMessage.a())) {
            i().i(new qdl(this, chatMessage, 0), this.k).h(new puy(this, 14), this.k).k(qiu.b(), andi.a);
            return;
        }
        if (ajru.g.e(chatMessage.a())) {
            psd psdVar = (psd) this.j.b();
            qdk qdkVar = this.b;
            aktp.ai(new hbd(psdVar, qdkVar, chatMessage, 13), psdVar.c).i(new pri(psdVar, qdkVar, 4), psdVar.b).k(qiu.c(new ptf(this.i, 20)), this.k);
            return;
        }
        if (adai.a.e(chatMessage.a())) {
            i().i(new qdl(this, chatMessage, 4), this.k).h(new puy(this, 16), this.k).k(qiu.b(), andi.a);
            return;
        }
        if (((trz) this.e.b()).h()) {
            ContentType a2 = chatMessage.a();
            if (adah.a(a2) || adah.c(a2)) {
                z = true;
            }
        } else {
            z = adah.a(chatMessage.a());
        }
        if (z) {
            alwl alwlVar = (alwl) a.i();
            alwlVar.X(ydl.f, rve.a(this.b.a.g));
            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visitUnsupportedEncryptedMessage", 631, "UnencryptedIncomingChatMessageVisitor.java")).q("Incoming Etouffee message. Check if the release was compiled with the Etouffee module. Message will be processed as a basic text message.");
            i().i(new qdl(this, chatMessage, 3), this.k).k(qiu.c(new qdm(this, 2)), this.k);
            return;
        }
        rve a3 = rve.a(this.b.a.g);
        alwl alwlVar2 = (alwl) a.i();
        alwlVar2.X(ydl.f, a3);
        alwlVar2.X(ydl.p, ruy.b(this.b.a.h));
        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 225, "UnencryptedIncomingChatMessageVisitor.java")).D("Ignoring received message with unknown content type. type: %s, subType: %s", chatMessage.a().c(), chatMessage.a().b());
        qya qyaVar = (qya) this.q.b();
        String contentType = chatMessage.a().toString();
        amgu amguVar = this.b.a.l;
        if (amguVar == null) {
            amguVar = amgu.a;
        }
        amxo b = amxo.b(amguVar.aa);
        if (b == null) {
            b = amxo.UNKNOWN_RCS_TYPE;
        }
        amgl amglVar = (amgl) amgu.a.createBuilder();
        String f = a3.f();
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar2 = (amgu) amglVar.b;
        amguVar2.b |= Integer.MIN_VALUE;
        amguVar2.H = f;
        if (b == null) {
            b = ((hgj) qyaVar.b).n();
        }
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar3 = (amgu) amglVar.b;
        amguVar3.aa = b.h;
        amguVar3.c |= 2097152;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar4 = (amgu) amglVar.b;
        amguVar4.g = 8;
        amguVar4.b = 1 | amguVar4.b;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar5 = (amgu) amglVar.b;
        amguVar5.h = 22;
        amguVar5.b = 2 | amguVar5.b;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar6 = (amgu) amglVar.b;
        amguVar6.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        amguVar6.ah = contentType;
        qyaVar.s((amgu) amglVar.s());
        this.i.a(pwh.FAIL_NO_RETRY);
    }

    @Override // defpackage.ajqv
    public final void d(final FileTransferInformation fileTransferInformation) {
        final Instant f;
        final xrf xrfVar = (xrf) this.p.b();
        final qfo qfoVar = this.b.a;
        final rve a2 = rve.a(qfoVar.g);
        qei qeiVar = qfoVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        final qei qeiVar2 = qeiVar;
        qei qeiVar3 = qfoVar.e;
        if (qeiVar3 == null) {
            qeiVar3 = qei.a;
        }
        final qei qeiVar4 = qeiVar3;
        qei qeiVar5 = qfoVar.f;
        if (qeiVar5 == null) {
            qeiVar5 = qei.a;
        }
        final qei qeiVar6 = qeiVar5;
        ((vev) xrfVar.G.b()).a(qeiVar2.d, 24);
        ((vev) xrfVar.G.b()).a(qeiVar6.d, 25);
        apct apctVar = qfoVar.k;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        final Instant ofEpochSecond = Instant.ofEpochSecond(apctVar.b, apctVar.c);
        if (xrf.f(qeiVar2) && ofEpochSecond.isAfter(Instant.MIN)) {
            f = ofEpochSecond;
        } else {
            f = xrfVar.q.f();
        }
        final Bundle bundle = this.n;
        aktp.ai(new xfb(xrfVar, qeiVar2, 8), xrfVar.c).i(new ancs() { // from class: xqs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                String str;
                Optional of;
                aoia aoiaVar;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final xrf xrfVar2 = xrf.this;
                final rve rveVar = a2;
                final qfo qfoVar2 = qfoVar;
                final Bundle bundle2 = bundle;
                final qei qeiVar7 = qeiVar2;
                final qei qeiVar8 = qeiVar6;
                final qei qeiVar9 = qeiVar4;
                final Instant instant = ofEpochSecond;
                if (booleanValue) {
                    if (aczf.E() && !new apaq(qfoVar2.n, qfo.a).contains(qfn.POSITIVE_DELIVERY)) {
                        alvw m = xrf.a.m();
                        m.X(ydl.e, rveVar.toString());
                        m.X(ydl.n, yyb.bh(qeiVar7.d));
                        ((alwl) m.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1003, "IncomingFileTransferProcessor.java")).q("Do not send a delivery report as it is not requested.");
                        return aktp.ag(pwh.SUCCESS);
                    }
                    alwl alwlVar = (alwl) xrf.a.g();
                    alwlVar.X(ydl.e, rveVar.toString());
                    alwlVar.X(ydl.n, yyb.bh(qeiVar7.d));
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "sendDeliveryReportForBlockedUser", 1010, "IncomingFileTransferProcessor.java")).q("Received a file transfer message from a blocked user. Sending delivery report");
                    if (xrf.g(qeiVar9)) {
                        aoiaVar = xrfVar2.L.f(qfoVar2.h, qeiVar9.d, qeiVar7);
                    } else {
                        aoiaVar = new aoia(qeiVar7);
                    }
                    return aktp.aj(new ttt(xrfVar2, rveVar, instant, aoiaVar, bundle2, qeiVar8, 5), xrfVar2.c).i(new xrd(xrfVar2, rveVar, qeiVar7, 0), xrfVar2.c);
                }
                final akul ai = aktp.ai(new vwu(xrfVar2, qeiVar7, 3), xrfVar2.c);
                final akul h = xrfVar2.t.a(qeiVar7.d).h(new xpm(xrfVar2, qeiVar7, 5), xrfVar2.c);
                apwq apwqVar = qfoVar2.i;
                if (apwqVar == null) {
                    apwqVar = apwq.a;
                }
                if (apwqVar == null) {
                    of = Optional.empty();
                } else {
                    ((alwl) ((alwl) xrf.a.g()).h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getAgentNameFromCpimHeader", 1217, "IncomingFileTransferProcessor.java")).q("Trying to get Agent Name from custom CPIM header");
                    apws apwsVar = apws.a;
                    apbo apboVar = apwqVar.b;
                    if (apboVar.containsKey("urn:rcs:google:")) {
                        apwsVar = (apws) apboVar.get("urn:rcs:google:");
                    }
                    apbo apboVar2 = apwsVar.b;
                    if (apboVar2.containsKey("Agent-Name")) {
                        str = (String) apboVar2.get("Agent-Name");
                    } else {
                        str = "";
                    }
                    if (TextUtils.isEmpty(str)) {
                        of = Optional.empty();
                    } else {
                        of = Optional.of(str);
                    }
                }
                Optional optional = of;
                final FileTransferInformation fileTransferInformation2 = fileTransferInformation;
                final Instant instant2 = f;
                final akul h2 = aktp.ap(ai, h).h(new imh(ai, h, (Object) optional, (Object) qeiVar7, 15), xrfVar2.c);
                return aktp.ap(h2, ai).h(new Callable() { // from class: xqz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) albo.bQ(h2);
                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) albo.bQ(ai);
                        qfo qfoVar3 = qfoVar2;
                        String str2 = qfoVar3.h;
                        apwq apwqVar2 = qfoVar3.i;
                        if (apwqVar2 == null) {
                            apwqVar2 = apwq.a;
                        }
                        qei qeiVar10 = qeiVar9;
                        qeh b = qeh.b(qeiVar10.c);
                        if (b == null) {
                            b = qeh.UNKNOWN_TYPE;
                        }
                        qei qeiVar11 = qeiVar7;
                        xrf xrfVar3 = xrf.this;
                        boolean equals = b.equals(qeh.GROUP);
                        vsi a3 = vsj.a();
                        a3.b(!equals);
                        a3.g(xrf.h(qeiVar11, bindData2));
                        a3.h(equals);
                        a3.n(amku.INCOMING_FILE_TRANSFER);
                        a3.i(alog.r(bindData));
                        a3.c(apwqVar2);
                        if (equals) {
                            d.t(!str2.isEmpty(), "RCS group ID missing");
                            d.t(true ^ qeiVar10.d.isEmpty(), "Conference URI is missing");
                            a3.k(str2);
                            a3.j(qeiVar10.d);
                        } else {
                            if (xrfVar3.M.s(bundle2)) {
                                a3.q(true);
                                a3.e = 2;
                            }
                        }
                        rve rveVar2 = rveVar;
                        xwa c = xrfVar3.k.c(a3.a());
                        if (c == null) {
                            alwl alwlVar2 = (alwl) xrf.a.i();
                            alwlVar2.X(ydl.e, rveVar2.b);
                            alwlVar2.X(ydl.n, yyb.bh(qeiVar11.d));
                            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getConversation", 1178, "IncomingFileTransferProcessor.java")).q("Incoming RCS file transfer but we could not get/create the conversation");
                            c = null;
                        } else {
                            alwl alwlVar3 = (alwl) xrf.a.g();
                            alwlVar3.X(ydl.e, rveVar2.b);
                            alwlVar3.X(ydl.n, yyb.bh(qeiVar11.d));
                            alwlVar3.X(ydl.o, c.a.toString());
                            ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "getConversation", 1189, "IncomingFileTransferProcessor.java")).q("Conversation found for incoming RCS file transfer");
                        }
                        return Optional.ofNullable(c);
                    }
                }, xrfVar2.c).i(new ancs() { // from class: xra
                    @Override // defpackage.ancs
                    public final ListenableFuture a(Object obj2) {
                        Bundle bundle3;
                        int i;
                        akul ag;
                        Optional optional2 = (Optional) obj2;
                        boolean isEmpty = optional2.isEmpty();
                        final rve rveVar2 = rveVar;
                        final qei qeiVar10 = qeiVar7;
                        if (isEmpty) {
                            alwl alwlVar2 = (alwl) xrf.a.h();
                            alwlVar2.X(ydl.e, rveVar2.toString());
                            alwlVar2.X(ydl.n, yyb.bh(qeiVar10.d));
                            ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "processFileTransferPushMessageForNonBlockedUser", 541, "IncomingFileTransferProcessor.java")).q("Failed to process incoming file transfer push message. Could not retrieve the conversation for this message.");
                            return aktp.ag(pwh.FAIL_RETRY);
                        }
                        final Bundle bundle4 = bundle2;
                        final qfo qfoVar3 = qfoVar2;
                        final FileTransferInformation fileTransferInformation3 = fileTransferInformation2;
                        final qei qeiVar11 = qeiVar9;
                        akul akulVar = h;
                        final Instant instant3 = instant2;
                        final Instant instant4 = instant;
                        akul akulVar2 = h2;
                        final qei qeiVar12 = qeiVar8;
                        final xrf xrfVar3 = xrf.this;
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) albo.bQ(akulVar2);
                        final xwa xwaVar = (xwa) optional2.get();
                        BusinessInfoData businessInfoData = (BusinessInfoData) albo.bQ(akulVar);
                        if (((okf) xrfVar3.E.b()).a()) {
                            final akul ai2 = aktp.ai(new xqt(xrfVar3, bindData, businessInfoData, 0), xrfVar3.c);
                            ConversationIdType conversationIdType = xwaVar.a;
                            if (xrf.g(qeiVar11) && ((old) xrfVar3.H.b()).a()) {
                                vyb vybVar = (vyb) xrfVar3.I.b();
                                qeiVar12.getClass();
                                bundle3 = bundle4;
                                i = 2;
                                ag = qjh.c(vybVar.b, arpj.a, arwf.a, new qka(vybVar, conversationIdType, qeiVar12, (arpe) null, 18, (byte[]) null));
                            } else {
                                bundle3 = bundle4;
                                i = 2;
                                ag = aktp.ag(qeiVar12);
                            }
                            final akul akulVar3 = ag;
                            ListenableFuture[] listenableFutureArr = new ListenableFuture[i];
                            listenableFutureArr[0] = ai2;
                            listenableFutureArr[1] = akulVar3;
                            final Bundle bundle5 = bundle3;
                            return aktp.an(listenableFutureArr).i(new ancr() { // from class: xqu
                                @Override // defpackage.ancr
                                public final ListenableFuture a() {
                                    qei qeiVar13 = (qei) albo.bQ(akulVar3);
                                    ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) albo.bQ(ai2);
                                    xwa xwaVar2 = xwaVar;
                                    Instant instant5 = instant4;
                                    Instant instant6 = instant3;
                                    qei qeiVar14 = qeiVar11;
                                    xrf xrfVar4 = xrf.this;
                                    FileTransferInformation fileTransferInformation4 = fileTransferInformation3;
                                    return xrfVar4.d(rveVar2, qeiVar10, qeiVar13, bindData2, xwaVar2, instant5, instant6, qeiVar14, fileTransferInformation4, qfoVar3, bundle5);
                                }
                            }, xrfVar3.c);
                        }
                        return aktp.ai(new xqt(xrfVar3, bindData, businessInfoData, 2), xrfVar3.c).i(new ancs() { // from class: xqv
                            @Override // defpackage.ancs
                            public final ListenableFuture a(Object obj3) {
                                return xrf.this.d(rveVar2, qeiVar10, qeiVar12, (ParticipantsTable.BindData) obj3, xwaVar, instant4, instant3, qeiVar11, fileTransferInformation3, qfoVar3, bundle4);
                            }
                        }, xrfVar3.c);
                    }
                }, xrfVar2.c);
            }
        }, xrfVar.c).e(IllegalStateException.class, new qda(6), this.k).e(vnn.class, new puy(this, 15), this.k).k(qiu.c(new qdm(this, 1)), this.k);
    }

    @Override // defpackage.ajqv
    public final void e(IsComposingMessage isComposingMessage) {
        ((qcv) this.d.b()).a(isComposingMessage, this.b.a).k(qiu.c(new ksn(this, isComposingMessage, 13)), this.k);
    }

    @Override // defpackage.ajqv
    public final void f(LocationInformation locationInformation) {
        com.google.android.ims.rcsservice.locationsharing.LocationInformation locationInformation2 = new com.google.android.ims.rcsservice.locationsharing.LocationInformation();
        locationInformation2.d = locationInformation.a();
        locationInformation2.c = locationInformation.b();
        if (locationInformation.d().isPresent()) {
            locationInformation2.f = ((Instant) locationInformation.d().get()).toEpochMilli();
        }
        locationInformation.g().ifPresent(new ptf(locationInformation2, 18));
        locationInformation.e().ifPresent(new ptf(locationInformation2, 19));
        vxx vxxVar = (vxx) this.g.b();
        vqx a2 = a();
        a2.i = locationInformation2;
        vxxVar.d(a2.a()).h(new puy(this, 12), this.k).e(qdd.class, new puy(this, 13), this.k).k(qiu.b(), andi.a);
    }

    @Override // defpackage.ajqv
    public final void g(MessageReceipt messageReceipt) {
        String str;
        ajqu ajquVar = ajqu.UNKNOWN;
        int ordinal = messageReceipt.a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        int i = 4;
                        if (ordinal != 4) {
                            return;
                        }
                        rve a2 = rve.a(messageReceipt.d());
                        qfo qfoVar = this.b.a;
                        qeh qehVar = qeh.GROUP;
                        qei qeiVar = qfoVar.e;
                        if (qeiVar == null) {
                            qeiVar = qei.a;
                        }
                        qeh b = qeh.b(qeiVar.c);
                        if (b == null) {
                            b = qeh.UNKNOWN_TYPE;
                        }
                        if (qehVar.equals(b)) {
                            alwl alwlVar = (alwl) a.i();
                            alwlVar.X(ydl.f, rve.a(this.b.a.g));
                            alwlVar.X(ydl.p, ruy.b(this.b.a.h));
                            ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "processInterworkingReceipt", 520, "UnencryptedIncomingChatMessageVisitor.java")).q("Ignoring Interworking Message Receipt received for group conversation.");
                            this.i.a(pwh.FAIL_NO_RETRY);
                            return;
                        }
                        boolean equals = ajqu.INTERWORKING.f.equals(messageReceipt.e());
                        if (true != equals) {
                            str = "Bugle.Rcs.Chat.Message.Interworked.Mms.Fallback.Counts";
                        } else {
                            str = "Bugle.Rcs.Chat.Message.Interworked.Sms.Fallback.Counts";
                        }
                        if (true != equals) {
                            i = 5;
                        }
                        qzg qzgVar = (qzg) this.o.b();
                        amgu amguVar = this.b.a.l;
                        if (amguVar == null) {
                            amguVar = amgu.a;
                        }
                        amxo b2 = amxo.b(amguVar.aa);
                        if (b2 == null) {
                            b2 = amxo.UNKNOWN_RCS_TYPE;
                        }
                        qzgVar.a(a2, i, b2).q().k(qiu.c(new ksn(this, str, 14)), this.k);
                        return;
                    }
                } else {
                    j(messageReceipt, 50032);
                    return;
                }
            } else {
                if (messageReceipt.a().equals(ajqu.DELIVERY) && messageReceipt.e().equals("failed")) {
                    qdk qdkVar = this.b;
                    rdg rdgVar = (rdg) this.r.b();
                    rve a3 = rve.a(messageReceipt.d());
                    qfo qfoVar2 = qdkVar.a;
                    qei qeiVar2 = qfoVar2.f;
                    if (qeiVar2 == null) {
                        qeiVar2 = qei.a;
                    }
                    int E = ((wpp) this.t.b()).E(qeiVar2);
                    Instant f = this.m.f();
                    amgu amguVar2 = qfoVar2.l;
                    if (amguVar2 == null) {
                        amguVar2 = amgu.a;
                    }
                    amgu amguVar3 = amguVar2;
                    armf armfVar = rdgVar.a;
                    qga qgaVar = qga.a;
                    vid vidVar = (vid) armfVar.b();
                    vidVar.getClass();
                    f.getClass();
                    amguVar3.getClass();
                    qgaVar.getClass();
                    new ProcessSentMessageAction(vidVar, a3, E, f, amguVar3, qgaVar).q().k(qiu.c(new iqp(this, messageReceipt, qfoVar2, 6, (short[]) null)), this.k);
                    return;
                }
                j(messageReceipt, 50035);
                return;
            }
        }
        alwl alwlVar2 = (alwl) a.i();
        alwlVar2.X(ydl.f, rve.a(this.b.a.g));
        alwlVar2.X(ydl.p, ruy.b(this.b.a.h));
        ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/incoming/UnencryptedIncomingChatMessageVisitor", "visit", 401, "UnencryptedIncomingChatMessageVisitor.java")).t("Ignoring unknown Message Receipt with type: %s", messageReceipt.a().name());
        this.i.a(pwh.FAIL_NO_RETRY);
    }
}
