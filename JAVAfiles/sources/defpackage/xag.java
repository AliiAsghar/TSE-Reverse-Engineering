package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xag implements wza {
    public final xaf a;
    public final wxz b;
    public final wzc c;
    private final xah d;
    private final anen e;
    private final hgj f;

    public xag(wzc wzcVar, xaf xafVar, xah xahVar, hgj hgjVar, wxz wxzVar, anen anenVar) {
        this.c = wzcVar;
        this.a = xafVar;
        this.d = xahVar;
        this.f = hgjVar;
        this.b = wxzVar;
        this.e = anenVar;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.wza
    public final akul a(MessageCoreData messageCoreData, aoia aoiaVar, Optional optional) {
        akrh akrhVar;
        Throwable th;
        akrh akrhVar2;
        Throwable th2;
        akul j;
        akrh e = aktp.e("UnencryptedRcsChatMessageSender#sendChatMessage");
        try {
            aozy createBuilder = qft.a.createBuilder();
            qfs qfsVar = qfs.USER;
            if (!createBuilder.b.isMutable()) {
                try {
                    createBuilder.u();
                } catch (Throwable th3) {
                    th = th3;
                    akrhVar = e;
                    try {
                        akrhVar.close();
                        throw th;
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                        throw th;
                    }
                }
            }
            apag apagVar = createBuilder.b;
            qft qftVar = (qft) apagVar;
            qftVar.c = qfsVar.d;
            qftVar.b |= 1;
            qfr qfrVar = qfr.HIGH;
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
            qftVar3.b |= 4;
            qftVar3.e = true;
            qft qftVar4 = (qft) createBuilder.s();
            if (messageCoreData.bZ() && !messageCoreData.cq()) {
                j = this.b.h(messageCoreData, aoiaVar, this.d, new woc(15), (qeq) optional.orElse(null), qftVar4);
                akrhVar = e;
            } else if (messageCoreData.ce()) {
                try {
                    try {
                        wxz wxzVar = this.b;
                        hgj hgjVar = this.f;
                        woc wocVar = new woc(15);
                        akrh e2 = aktp.e("ChatApiSender::sendRbmSuggestionResponse");
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                            akrhVar2 = e;
                        }
                        try {
                            if (!messageCoreData.ce()) {
                                j = aktp.ag(wxz.b);
                                akrhVar2 = e;
                            } else {
                                rve E = messageCoreData.E();
                                aozy createBuilder2 = qgj.a.createBuilder();
                                String f = E.f();
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                qgj qgjVar = (qgj) createBuilder2.b;
                                qgjVar.b |= 1;
                                qgjVar.e = f;
                                aozy createBuilder3 = qgp.a.createBuilder();
                                apct b = apds.b(messageCoreData.q());
                                if (!createBuilder3.b.isMutable()) {
                                    createBuilder3.u();
                                }
                                qgp qgpVar = (qgp) createBuilder3.b;
                                b.getClass();
                                qgpVar.c = b;
                                qgpVar.b = 1 | qgpVar.b;
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                qgj qgjVar2 = (qgj) createBuilder2.b;
                                qgp qgpVar2 = (qgp) createBuilder3.s();
                                qgpVar2.getClass();
                                qgjVar2.d = qgpVar2;
                                qgjVar2.c = 7;
                                qgr a = wxzVar.a(messageCoreData);
                                if (!createBuilder2.b.isMutable()) {
                                    createBuilder2.u();
                                }
                                qgj qgjVar3 = (qgj) createBuilder2.b;
                                a.getClass();
                                qgjVar3.g = a;
                                qgjVar3.b |= 4;
                                akrhVar2 = e;
                                try {
                                    j = wxzVar.j(messageCoreData, aktp.ai(new mig(messageCoreData, 14), hgjVar.a), aoiaVar, wocVar, qftVar4, E, (qgj) createBuilder2.s(), 6);
                                } catch (Throwable th6) {
                                    th = th6;
                                    th2 = th;
                                    try {
                                        e2.close();
                                        throw th2;
                                    } catch (Throwable th7) {
                                        th2.addSuppressed(th7);
                                        throw th2;
                                    }
                                }
                            }
                            e2.b(j);
                            e2.close();
                            akrhVar = akrhVar2;
                        } catch (Throwable th8) {
                            th2 = th8;
                            akrhVar2 = e;
                            e2.close();
                            throw th2;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        akrhVar2 = e;
                        th = th;
                        akrhVar = akrhVar2;
                        akrhVar.close();
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    th = th;
                    akrhVar = akrhVar2;
                    akrhVar.close();
                    throw th;
                }
            } else {
                try {
                    akrhVar = e;
                } catch (Throwable th11) {
                    th = th11;
                    akrhVar = e;
                    th = th;
                    akrhVar.close();
                    throw th;
                }
                try {
                    j = this.b.l(messageCoreData, aoiaVar, this.c, new woc(15), qftVar4).i(new vug(this, messageCoreData, aoiaVar, qftVar4, 3, null), this.e).h(new whh(this, messageCoreData, 8), this.e);
                } catch (Throwable th12) {
                    th = th12;
                    th = th;
                    akrhVar.close();
                    throw th;
                }
            }
            akrhVar.b(j);
            akrhVar.close();
            return j;
        } catch (Throwable th13) {
            th = th13;
            akrhVar = e;
        }
    }
}
