package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wxz {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/ChatApiSender");
    public static final vqh b = vqh.a(0, 0).a();
    public final anen c;
    public final qdx d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final pwa h;
    public final xcs i;
    public final armf j;
    public final pvw k;
    public final yyb l;
    private final pss m;
    private final pvx n;
    private final pst o;

    public wxz(pss pssVar, qdx qdxVar, pvx pvxVar, pst pstVar, armf armfVar, armf armfVar2, anen anenVar, armf armfVar3, pvw pvwVar, yyb yybVar, pwa pwaVar, xcs xcsVar, armf armfVar4) {
        this.m = pssVar;
        this.c = anenVar;
        this.d = qdxVar;
        this.n = pvxVar;
        this.o = pstVar;
        this.e = armfVar;
        this.g = armfVar2;
        this.f = armfVar3;
        this.k = pvwVar;
        this.l = yybVar;
        this.h = pwaVar;
        this.i = xcsVar;
        this.j = armfVar4;
    }

    public static boolean c(MessageCoreData messageCoreData, wyn wynVar) {
        return wynVar.a(messageCoreData);
    }

    public static vqh d(Exception exc, rve rveVar, int i) {
        amwx amwxVar;
        alvw i2 = a.i();
        i2.X(alwp.a, "BugleRcs");
        alvg alvgVar = (alvg) ((alvg) i2).g(exc);
        alvgVar.X(ydl.f, rveVar);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "exceptionToMessageStatusPlusUri", 1041, "ChatApiSender.java")).t("Sending message failed. Operation should not be retried. MessageType=%s", yyb.cW(i));
        if (exc instanceof wyz) {
            amwxVar = amwx.CHAT_API_SERIALIZATION_ERROR;
        } else {
            amwxVar = amwx.CHAT_API_GENERIC_TRANSPORT_ERROR;
        }
        vqg a2 = vqh.a(3, 10003);
        a2.b(1);
        aozy createBuilder = amxb.a.createBuilder();
        aozy createBuilder2 = amxc.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amxc amxcVar = (amxc) apagVar;
        amxcVar.d = 1;
        amxcVar.b |= 4;
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
        amxbVar.b = 1 | amxbVar.b;
        a2.d = (amxb) createBuilder.s();
        return a2.a();
    }

    public static boolean e(MessageCoreData messageCoreData) {
        if (!TextUtils.isEmpty(messageCoreData.at()) && !messageCoreData.ce()) {
            return true;
        }
        return false;
    }

    public static arjv n(Exception exc, rve rveVar, int i) {
        amwx amwxVar;
        alvw i2 = a.i();
        i2.X(alwp.a, "BugleRcs");
        alvg alvgVar = (alvg) ((alvg) i2).g(exc);
        alvgVar.X(ydl.f, rveVar);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "exceptionToInvocationResultAndDiagnostics", 1069, "ChatApiSender.java")).t("Sending message failed. Operation should not be retried. MessageType=%s", yyb.cW(i));
        arjv arjvVar = new arjv();
        arjvVar.a = false;
        if (exc instanceof wyz) {
            amwxVar = amwx.CHAT_API_SERIALIZATION_ERROR;
        } else {
            amwxVar = amwx.CHAT_API_GENERIC_TRANSPORT_ERROR;
        }
        aozy createBuilder = amxb.a.createBuilder();
        aozy createBuilder2 = amxc.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amxc amxcVar = (amxc) apagVar;
        amxcVar.d = 1;
        amxcVar.b |= 4;
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
        arjvVar.b = (amxb) createBuilder.s();
        return arjvVar;
    }

    private final amxb p(qeg qegVar) {
        aozy createBuilder = amxc.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxc amxcVar = (amxc) createBuilder.b;
        amxcVar.d = 1;
        amxcVar.b |= 4;
        pvx pvxVar = this.n;
        qee b2 = qee.b(qegVar.d);
        if (b2 == null) {
            b2 = qee.UNKNOWN_CAUSE;
        }
        amwx amwxVar = (amwx) pvxVar.fu(b2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxc amxcVar2 = (amxc) createBuilder.b;
        amxcVar2.e = amwxVar.x;
        amxcVar2.b |= 8;
        pst pstVar = this.o;
        qef b3 = qef.b(qegVar.c);
        if (b3 == null) {
            b3 = qef.UNKNOWN_STATUS;
        }
        amwy amwyVar = (amwy) pstVar.fu(b3);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxc amxcVar3 = (amxc) createBuilder.b;
        amxcVar3.f = amwyVar.f;
        amxcVar3.b |= 16;
        amxc amxcVar4 = (amxc) createBuilder.s();
        aozy createBuilder2 = amxb.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amxb amxbVar = (amxb) createBuilder2.b;
        amxcVar4.getClass();
        amxbVar.c = amxcVar4;
        amxbVar.b |= 1;
        return (amxb) createBuilder2.s();
    }

    public final qgr a(MessageCoreData messageCoreData) {
        return (qgr) this.k.fu((atok) Optional.ofNullable(messageCoreData.aF()).orElse(yyb.ba()));
    }

    public final vqh b(qgg qggVar) {
        qeg qegVar = qggVar.c;
        if (qegVar == null) {
            qegVar = qeg.a;
        }
        qee b2 = qee.b(qegVar.d);
        if (b2 == null) {
            b2 = qee.UNKNOWN_CAUSE;
        }
        qeg qegVar2 = qggVar.c;
        if (qegVar2 == null) {
            qegVar2 = qeg.a;
        }
        qef b3 = qef.b(qegVar2.c);
        if (b3 == null) {
            b3 = qef.UNKNOWN_STATUS;
        }
        int i = b2.p;
        int ordinal = b3.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        vqg a2 = vqh.a(3, i);
                        a2.b(1);
                        return a2.a();
                    }
                    vqg a3 = vqh.a(3, i);
                    a3.b(1);
                    qeg qegVar3 = qggVar.c;
                    if (qegVar3 == null) {
                        qegVar3 = qeg.a;
                    }
                    a3.d = p(qegVar3);
                    if (aczx.s()) {
                        qga qgaVar = qggVar.g;
                        if (qgaVar == null) {
                            qgaVar = qga.a;
                        }
                        a3.c(qgaVar);
                    }
                    return a3.a();
                }
                alvw i2 = a.i();
                i2.X(alwp.a, "BugleRcs");
                ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "responseToMessageStatusPlusUri", 1104, "ChatApiSender.java")).q("ChatAPI response returned transient failure, setting message send status to AUTO_RETRY");
                vqg a4 = vqh.a(1, i);
                a4.b(1);
                qeg qegVar4 = qggVar.c;
                if (qegVar4 == null) {
                    qegVar4 = qeg.a;
                }
                a4.d = p(qegVar4);
                if (aczx.s()) {
                    qga qgaVar2 = qggVar.g;
                    if (qgaVar2 == null) {
                        qgaVar2 = qga.a;
                    }
                    a4.c(qgaVar2);
                }
                return a4.a();
            }
            return vqh.a(-1, i).a();
        }
        return vqh.a(0, i).a();
    }

    public final akul f(MessageCoreData messageCoreData, rve rveVar, qej qejVar, apwq apwqVar, aoia aoiaVar, qgj qgjVar, qft qftVar) {
        return g(rveVar, qejVar, apwqVar, aoiaVar, qgjVar, qftVar, (qei) messageCoreData.ab().orElseThrow(new wxx(messageCoreData, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final akul g(rve rveVar, qej qejVar, apwq apwqVar, aoia aoiaVar, qgj qgjVar, qft qftVar, qei qeiVar) {
        Optional empty;
        qei b2;
        String q;
        qeh qehVar = qeh.PHONE;
        qeh b3 = qeh.b(qeiVar.c);
        if (b3 == null) {
            b3 = qeh.UNKNOWN_TYPE;
        }
        albo.U(qehVar.equals(b3), "Only phone identity supported.");
        if ((qgjVar.b & 4) != 0) {
            qgr qgrVar = qgjVar.g;
            if (qgrVar == null) {
                qgrVar = qgr.a;
            }
            empty = Optional.of(qgrVar);
        } else {
            empty = Optional.empty();
        }
        if (aoiaVar.e()) {
            b2 = aoiaVar.c().d;
            if (b2 == null) {
                b2 = qei.a;
            }
        } else {
            b2 = aoiaVar.b();
        }
        if (aoiaVar.e()) {
            q = aoiaVar.c().c;
        } else {
            q = qjh.q(b2);
        }
        aozy builder = qgjVar.toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        apag apagVar = builder.b;
        qgj qgjVar2 = (qgj) apagVar;
        q.getClass();
        qgjVar2.b |= 2;
        qgjVar2.f = q;
        if (!apagVar.isMutable()) {
            builder.u();
        }
        apag apagVar2 = builder.b;
        qgj qgjVar3 = (qgj) apagVar2;
        qeiVar.getClass();
        qgjVar3.i = qeiVar;
        qgjVar3.b |= 16;
        if (!apagVar2.isMutable()) {
            builder.u();
        }
        qgj qgjVar4 = (qgj) builder.b;
        b2.getClass();
        qgjVar4.h = b2;
        qgjVar4.b |= 8;
        qgj qgjVar5 = (qgj) builder.s();
        aozy createBuilder = qgf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        qgf qgfVar = (qgf) apagVar3;
        qeiVar.getClass();
        qgfVar.c = qeiVar;
        qgfVar.b |= 1;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        qgf qgfVar2 = (qgf) apagVar4;
        b2.getClass();
        qgfVar2.d = b2;
        qgfVar2.b |= 2;
        String e = rve.e(rveVar);
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        qgf qgfVar3 = (qgf) apagVar5;
        qgfVar3.b |= 8;
        qgfVar3.f = e;
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        apag apagVar6 = createBuilder.b;
        qgf qgfVar4 = (qgf) apagVar6;
        q.getClass();
        qgfVar4.b |= 16;
        qgfVar4.g = q;
        if (!apagVar6.isMutable()) {
            createBuilder.u();
        }
        apag apagVar7 = createBuilder.b;
        qgf qgfVar5 = (qgf) apagVar7;
        qejVar.getClass();
        qgfVar5.i = qejVar;
        qgfVar5.b |= 64;
        if (!apagVar7.isMutable()) {
            createBuilder.u();
        }
        qgf qgfVar6 = (qgf) createBuilder.b;
        apwqVar.getClass();
        qgfVar6.h = apwqVar;
        qgfVar6.b |= 32;
        aozb byteString = qgjVar5.toByteString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar8 = createBuilder.b;
        qgf qgfVar7 = (qgf) apagVar8;
        qgfVar7.b |= 128;
        qgfVar7.j = byteString;
        if (!apagVar8.isMutable()) {
            createBuilder.u();
        }
        qgf qgfVar8 = (qgf) createBuilder.b;
        qftVar.getClass();
        qgfVar8.k = qftVar;
        qgfVar8.b |= 256;
        if (aoiaVar.e() && aoiaVar.a) {
            qei qeiVar2 = (qei) aoiaVar.d().get(0);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qgf qgfVar9 = (qgf) createBuilder.b;
            qgfVar9.e = qeiVar2;
            qgfVar9.b |= 4;
        }
        empty.ifPresent(new wqw(createBuilder, 3));
        nej nejVar = (nej) this.f.b();
        if (!empty.isEmpty()) {
            nejVar.d((qgr) empty.get(), rveVar, 21, 8, 4);
        }
        akrh e2 = aktp.e("ChatApiSender::sendChatMessage::OutgoingChatApi::sendMessage");
        try {
            akul e3 = this.m.e((qgf) createBuilder.s());
            e2.b(e3);
            e2.close();
            return e3.h(new way((Object) this, (Object) empty, rveVar, 7), this.c);
        } finally {
        }
    }

    public final akul h(MessageCoreData messageCoreData, aoia aoiaVar, wzb wzbVar, algk algkVar, qeq qeqVar, qft qftVar) {
        akul ag;
        akrh e = aktp.e("ChatApiSender::sendFileTransferDetails");
        try {
            if (qeqVar == null) {
                alvw i = a.i();
                i.X(alwp.a, "BugleRcs");
                alvg alvgVar = (alvg) i;
                alvgVar.X(ydl.f, messageCoreData.E());
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendFileTransferDetailsNotTraced", 729, "ChatApiSender.java")).q("Missing file upload result while attempting to send file transfer details");
                vqg a2 = vqh.a(3, 10003);
                a2.b(1);
                aozy createBuilder = amxb.a.createBuilder();
                aozy createBuilder2 = amxc.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                amxc amxcVar = (amxc) apagVar;
                amxcVar.d = 1;
                amxcVar.b = 4 | amxcVar.b;
                amwx amwxVar = amwx.CHAT_API_INVALID_FILE_UPLOAD_RESULT;
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
                amxbVar.b = 1 | amxbVar.b;
                a2.d = (amxb) createBuilder.s();
                ag = aktp.ag(a2.a());
            } else {
                rve E = messageCoreData.E();
                aozy createBuilder3 = qgj.a.createBuilder();
                String f = E.f();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qgj qgjVar = (qgj) createBuilder3.b;
                qgjVar.b |= 1;
                qgjVar.e = f;
                aozy createBuilder4 = qgh.a.createBuilder();
                boolean e2 = aoiaVar.e();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qgh qghVar = (qgh) createBuilder4.b;
                qghVar.b |= 2;
                qghVar.d = e2;
                apct b2 = apds.b(messageCoreData.q());
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qgh qghVar2 = (qgh) createBuilder4.b;
                b2.getClass();
                qghVar2.c = b2;
                qghVar2.b = 1 | qghVar2.b;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qgj qgjVar2 = (qgj) createBuilder3.b;
                qgh qghVar3 = (qgh) createBuilder4.s();
                qghVar3.getClass();
                qgjVar2.d = qghVar3;
                qgjVar2.c = 4;
                qgr a3 = a(messageCoreData);
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qgj qgjVar3 = (qgj) createBuilder3.b;
                a3.getClass();
                qgjVar3.g = a3;
                qgjVar3.b = 4 | qgjVar3.b;
                try {
                    ag = wzbVar.c(qeqVar, messageCoreData, aoiaVar).i(new vki(this, messageCoreData, algkVar, aoiaVar, (qgj) createBuilder3.s(), qftVar, 3), this.c).h(new wxv(this, 5), this.c).e(IllegalArgumentException.class, new wxv(E, 0), this.c);
                } catch (IllegalArgumentException e3) {
                    ag = aktp.ag(d(e3, E, 3));
                }
            }
            e.b(ag);
            e.close();
            return ag;
        } finally {
        }
    }

    public final akul i(MessageCoreData messageCoreData, aoia aoiaVar, wyn wynVar, algk algkVar, qft qftVar) {
        akul ag;
        akrh e = aktp.e("ChatApiSender::sendLocationInformationNotTraced");
        try {
            if (!c(messageCoreData, wynVar)) {
                ag = aktp.ag(b);
            } else {
                rve E = messageCoreData.E();
                aozy createBuilder = qgj.a.createBuilder();
                String f = E.f();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgj qgjVar = (qgj) createBuilder.b;
                int i = 1;
                qgjVar.b |= 1;
                qgjVar.e = f;
                aozy createBuilder2 = qgi.a.createBuilder();
                boolean e2 = aoiaVar.e();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qgi qgiVar = (qgi) createBuilder2.b;
                qgiVar.b |= 2;
                qgiVar.d = e2;
                apct b2 = apds.b(messageCoreData.q());
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qgi qgiVar2 = (qgi) createBuilder2.b;
                b2.getClass();
                qgiVar2.c = b2;
                qgiVar2.b |= 1;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgj qgjVar2 = (qgj) createBuilder.b;
                qgi qgiVar3 = (qgi) createBuilder2.s();
                qgiVar3.getClass();
                qgjVar2.d = qgiVar3;
                qgjVar2.c = 3;
                qgr a2 = a(messageCoreData);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgj qgjVar3 = (qgj) createBuilder.b;
                a2.getClass();
                qgjVar3.g = a2;
                qgjVar3.b |= 4;
                try {
                    ag = wynVar.b(messageCoreData, aoiaVar).i(new vki(this, messageCoreData, algkVar, aoiaVar, (qgj) createBuilder.s(), qftVar, 2), this.c).h(new wxv(this, 5), this.c).e(IllegalArgumentException.class, new wxv(E, i), this.c);
                } catch (IllegalArgumentException e3) {
                    ag = aktp.ag(d(e3, E, 2));
                }
            }
            e.b(ag);
            e.close();
            return ag;
        } finally {
        }
    }

    public final akul j(MessageCoreData messageCoreData, akul akulVar, aoia aoiaVar, algk algkVar, qft qftVar, rve rveVar, qgj qgjVar, int i) {
        return akulVar.i(new vki(this, messageCoreData, algkVar, aoiaVar, qgjVar, qftVar, 4), this.c).h(new wxv(this, 5), this.c).e(IllegalArgumentException.class, new ikg(rveVar, i, 16), this.c);
    }

    public final akul k(final MessageCoreData messageCoreData, final aoia aoiaVar, final int i, wzd wzdVar, final algk algkVar, final qft qftVar) {
        akul ag;
        akrh e = aktp.e("ChatApiSender::sendMessageReceipt");
        try {
            final rve E = messageCoreData.E();
            try {
                ag = wzdVar.b(i, messageCoreData, aoiaVar).i(new ancs() { // from class: wxw
                    @Override // defpackage.ancs
                    public final ListenableFuture a(Object obj) {
                        String str;
                        algk algkVar2 = algkVar;
                        MessageCoreData messageCoreData2 = messageCoreData;
                        qej qejVar = (qej) obj;
                        apwq apwqVar = (apwq) algkVar2.apply(messageCoreData2);
                        wxz wxzVar = wxz.this;
                        rve a2 = wxzVar.d.a();
                        alvw g = wxz.a.g();
                        g.X(alwp.a, "BugleRcs");
                        alvg alvgVar = (alvg) g;
                        alvz alvzVar = ydl.f;
                        rve rveVar = E;
                        alvgVar.X(alvzVar, rveVar);
                        alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendSerializedMessageReceipt", 887, "ChatApiSender.java");
                        String f = a2.f();
                        int i2 = i;
                        if (i2 != 2) {
                            str = "DISPLAYED";
                        } else {
                            str = "DELIVERY";
                        }
                        qft qftVar2 = qftVar;
                        aoia aoiaVar2 = aoiaVar;
                        alvgVar2.D("Generated new RCS Message ID %s for outgoing report type: %s", f, str);
                        if (i2 == 2) {
                            ((qya) wxzVar.e.b()).p(rveVar, a2);
                        }
                        aozy createBuilder = qgj.a.createBuilder();
                        String f2 = a2.f();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qgj qgjVar = (qgj) createBuilder.b;
                        qgjVar.b |= 1;
                        qgjVar.e = f2;
                        aozy createBuilder2 = qgl.a.createBuilder();
                        String f3 = rveVar.f();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar = createBuilder2.b;
                        qgl qglVar = (qgl) apagVar;
                        qglVar.b |= 1;
                        qglVar.c = f3;
                        if (!apagVar.isMutable()) {
                            createBuilder2.u();
                        }
                        qgl qglVar2 = (qgl) createBuilder2.b;
                        qglVar2.d = i2;
                        qglVar2.b |= 2;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qgj qgjVar2 = (qgj) createBuilder.b;
                        qgl qglVar3 = (qgl) createBuilder2.s();
                        qglVar3.getClass();
                        qgjVar2.d = qglVar3;
                        qgjVar2.c = 5;
                        qgr qgrVar = (qgr) wxzVar.k.fu(yyb.ba());
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qgj qgjVar3 = (qgj) createBuilder.b;
                        qgrVar.getClass();
                        qgjVar3.g = qgrVar;
                        qgjVar3.b |= 4;
                        wxzVar.i.d(rveVar.f(), qgrVar.c);
                        try {
                            return wxzVar.f(messageCoreData2, a2, qejVar, apwqVar, aoiaVar2, (qgj) createBuilder.s(), qftVar2).h(new wop(wxzVar, 19), wxzVar.c).e(IllegalArgumentException.class, new wop(rveVar, 20), wxzVar.c);
                        } catch (IllegalArgumentException e2) {
                            return aktp.ag(wxz.n(e2, rveVar, 4));
                        }
                    }
                }, this.c).e(IllegalArgumentException.class, new wxv(E, 2), this.c);
            } catch (IllegalArgumentException e2) {
                ag = aktp.ag(n(e2, E, 4));
            }
            e.b(ag);
            e.close();
            return ag;
        } finally {
        }
    }

    public final akul l(MessageCoreData messageCoreData, aoia aoiaVar, wzc wzcVar, algk algkVar, qft qftVar) {
        akul ag;
        akrh e = aktp.e("ChatApiSender::sendBasicText");
        try {
            if (!e(messageCoreData)) {
                ag = aktp.ag(b);
            } else {
                rve E = messageCoreData.E();
                aozy createBuilder = qgj.a.createBuilder();
                String f = E.f();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgj qgjVar = (qgj) createBuilder.b;
                qgjVar.b |= 1;
                qgjVar.e = f;
                aozy createBuilder2 = qge.a.createBuilder();
                boolean e2 = aoiaVar.e();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qge qgeVar = (qge) createBuilder2.b;
                qgeVar.b |= 2;
                qgeVar.d = e2;
                apct b2 = apds.b(messageCoreData.q());
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qge qgeVar2 = (qge) createBuilder2.b;
                b2.getClass();
                qgeVar2.c = b2;
                qgeVar2.b |= 1;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgj qgjVar2 = (qgj) createBuilder.b;
                qge qgeVar3 = (qge) createBuilder2.s();
                qgeVar3.getClass();
                qgjVar2.d = qgeVar3;
                qgjVar2.c = 2;
                qgr a2 = a(messageCoreData);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgj qgjVar3 = (qgj) createBuilder.b;
                a2.getClass();
                qgjVar3.g = a2;
                qgjVar3.b |= 4;
                try {
                    ag = j(messageCoreData, wzcVar.e(messageCoreData, aoiaVar), aoiaVar, algkVar, qftVar, E, (qgj) createBuilder.s(), 1);
                } catch (IllegalArgumentException e3) {
                    ag = aktp.ag(d(e3, E, 1));
                }
            }
            e.b(ag);
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

    public final akul m(rve rveVar, aoia aoiaVar, Instant instant, wzd wzdVar, qft qftVar, qei qeiVar) {
        akul ag;
        akrh e = aktp.e("ChatApiSender::sendMessageReceiptForUnsavedMessage");
        try {
            try {
                qej a2 = wzdVar.a(2, rveVar, instant);
                apwq apwqVar = apwq.a;
                rve a3 = this.d.a();
                alvw g = a.g();
                g.X(alwp.a, "BugleRcs");
                alvg alvgVar = (alvg) g;
                alvgVar.X(ydl.f, rveVar);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/sms/ChatApiSender", "sendSerializedMessageReceipt", 943, "ChatApiSender.java")).D("Generated new RCS Message ID %s for outgoing report type: %s", a3.f(), "DELIVERY");
                ((qya) this.e.b()).p(rveVar, a3);
                aozy createBuilder = qgj.a.createBuilder();
                String f = a3.f();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgj qgjVar = (qgj) createBuilder.b;
                qgjVar.b |= 1;
                qgjVar.e = f;
                aozy createBuilder2 = qgl.a.createBuilder();
                String f2 = rveVar.f();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                qgl qglVar = (qgl) apagVar;
                qglVar.b |= 1;
                qglVar.c = f2;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                qgl qglVar2 = (qgl) createBuilder2.b;
                qglVar2.d = 2;
                qglVar2.b = 2 | qglVar2.b;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgj qgjVar2 = (qgj) createBuilder.b;
                qgl qglVar3 = (qgl) createBuilder2.s();
                qglVar3.getClass();
                qgjVar2.d = qglVar3;
                qgjVar2.c = 5;
                qgr qgrVar = (qgr) this.k.fu(yyb.ba());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qgj qgjVar3 = (qgj) createBuilder.b;
                qgrVar.getClass();
                qgjVar3.g = qgrVar;
                qgjVar3.b |= 4;
                this.i.d(rveVar.f(), qgrVar.c);
                try {
                    ag = g(a3, a2, apwqVar, aoiaVar, (qgj) createBuilder.s(), qftVar, qeiVar).h(new wop(this, 17), this.c).e(IllegalArgumentException.class, new wop(rveVar, 18), this.c);
                } catch (IllegalArgumentException e2) {
                    ag = aktp.ag(n(e2, rveVar, 4));
                }
            } finally {
            }
        } catch (IllegalArgumentException e3) {
            ag = aktp.ag(n(e3, rveVar, 4));
        }
        e.b(ag);
        e.close();
        return ag;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r1 != 4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.arjv o(defpackage.qgg r7, int r8) {
        /*
            r6 = this;
            arjv r0 = new arjv
            r0.<init>()
            amgu r1 = r7.h
            if (r1 != 0) goto Lb
            amgu r1 = defpackage.amgu.a
        Lb:
            int r1 = r1.aa
            amxo r1 = defpackage.amxo.b(r1)
            if (r1 != 0) goto L15
            amxo r1 = defpackage.amxo.UNKNOWN_RCS_TYPE
        L15:
            r0.c = r1
            amxb r1 = defpackage.amxb.a
            r0.b = r1
            qeg r1 = r7.c
            if (r1 != 0) goto L21
            qeg r1 = defpackage.qeg.a
        L21:
            int r1 = r1.c
            qef r1 = defpackage.qef.b(r1)
            if (r1 != 0) goto L2b
            qef r1 = defpackage.qef.UNKNOWN_STATUS
        L2b:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L41
            r8 = 1
            if (r1 == r8) goto L3e
            r2 = 2
            if (r1 == r2) goto L3e
            r8 = 3
            if (r1 == r8) goto L7b
            r8 = 4
            if (r1 == r8) goto L7b
            goto L8a
        L3e:
            r0.a = r8
            return r0
        L41:
            alvi r1 = defpackage.wxz.a
            alvw r1 = r1.i()
            alvz r2 = defpackage.alwp.a
            java.lang.String r3 = "BugleRcs"
            r1.X(r2, r3)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r2 = "responseToInvocationResultAndDiagnostics"
            r3 = 1146(0x47a, float:1.606E-42)
            java.lang.String r4 = "com/google/android/apps/messaging/shared/sms/ChatApiSender"
            java.lang.String r5 = "ChatApiSender.java"
            alvw r1 = r1.h(r4, r2, r3, r5)
            alvg r1 = (defpackage.alvg) r1
            qeg r2 = r7.c
            if (r2 != 0) goto L64
            qeg r2 = defpackage.qeg.a
        L64:
            int r2 = r2.c
            qef r2 = defpackage.qef.b(r2)
            if (r2 != 0) goto L6e
            qef r2 = defpackage.qef.UNKNOWN_STATUS
        L6e:
            java.lang.String r8 = defpackage.yyb.cW(r8)
            java.lang.String r3 = "Received unknown status: %s while sending message. MessageType=%s"
            java.lang.String r2 = r2.name()
            r1.D(r3, r2, r8)
        L7b:
            qeg r7 = r7.c
            if (r7 != 0) goto L81
            qeg r7 = defpackage.qeg.a
        L81:
            amxb r7 = r6.p(r7)
            r0.b = r7
            r7 = 0
            r0.a = r7
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxz.o(qgg, int):arjv");
    }
}
