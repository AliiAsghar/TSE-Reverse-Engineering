package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tuh implements wza {
    public final ttz a;
    public final ttq b;
    public final wxz c;
    private final ttv d;
    private final xag e;
    private final anen f;
    private final twu g;

    public tuh(anen anenVar, ttz ttzVar, ttq ttqVar, ttv ttvVar, xag xagVar, wxz wxzVar, twu twuVar) {
        this.a = ttzVar;
        this.b = ttqVar;
        this.d = ttvVar;
        this.e = xagVar;
        this.c = wxzVar;
        this.f = anenVar;
        this.g = twuVar;
    }

    @Override // defpackage.wza
    public final akul a(MessageCoreData messageCoreData, aoia aoiaVar, Optional optional) {
        akul h;
        akrh e = aktp.e("EtouffeeRcsChatMessageSender#sendChatMessage");
        try {
            if (!messageCoreData.cn()) {
                h = this.e.a(messageCoreData, aoiaVar, optional);
            } else {
                aozy createBuilder = qft.a.createBuilder();
                qfs qfsVar = qfs.USER;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
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
                qftVar3.e = false;
                qft qftVar4 = (qft) createBuilder.s();
                if (tte.e() && this.g.c(messageCoreData)) {
                    twu twuVar = this.g;
                    if (twuVar.c(messageCoreData)) {
                        Optional i = wam.i(messageCoreData.V(), vxt.ETOUFFEE_NAMESPACE, "recipient");
                        if (i.isPresent()) {
                            xyo a = twu.a.a();
                            a.H("Switch to 1:1 channel for the message retry.");
                            a.g(messageCoreData.E());
                            a.q();
                            aozy createBuilder2 = qei.a.createBuilder();
                            qeh qehVar = qeh.PHONE;
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            qei qeiVar = (qei) createBuilder2.b;
                            qeiVar.c = qehVar.e;
                            qeiVar.b |= 1;
                            Object obj = i.get();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            qei qeiVar2 = (qei) createBuilder2.b;
                            qeiVar2.b |= 2;
                            qeiVar2.d = (String) obj;
                            qei qeiVar3 = (qei) createBuilder2.s();
                            aoiaVar = new aoia(qeiVar3);
                        } else {
                            twu.a.o("Remote user Id is not available.");
                        }
                    } else {
                        twu.a.l("The message is not a retry message.");
                    }
                }
                if (messageCoreData.cJ()) {
                    h = this.c.h(messageCoreData, aoiaVar, this.d, new ttu(12), (qeq) optional.orElse(null), qftVar4);
                } else {
                    h = this.c.l(messageCoreData, aoiaVar, this.a, new ttu(12), qftVar4).i(new mmc(this, messageCoreData, aoiaVar, qftVar4, 11), this.f).h(new raw(this, messageCoreData, 13, null), this.f);
                }
            }
            e.b(h);
            e.close();
            return h;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
