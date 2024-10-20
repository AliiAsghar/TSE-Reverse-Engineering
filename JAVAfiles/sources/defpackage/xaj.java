package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xaj implements wze {
    private static final xze a = xze.g("BugleRcs", "RcsMessageReceiptSender");
    private final wxz b;
    private final xai c;
    private final vqu d;

    public xaj(wxz wxzVar, xai xaiVar, vqu vquVar) {
        this.b = wxzVar;
        this.c = xaiVar;
        this.d = vquVar;
    }

    @Override // defpackage.wze
    public final boolean a(MessageCoreData messageCoreData) {
        if (messageCoreData.cn()) {
            xyo e = a.e();
            e.H("Not sending regular read report for etouffee message");
            e.g(messageCoreData.E());
            e.q();
            return false;
        }
        return this.d.Q(messageCoreData);
    }

    @Override // defpackage.wze
    public final akul b(MessageCoreData messageCoreData, aoia aoiaVar) {
        aozy createBuilder = qft.a.createBuilder();
        qfs qfsVar = qfs.CONTROL;
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
        return this.b.k(messageCoreData, aoiaVar, 2, this.c, new woc(16), (qft) createBuilder.s());
    }

    @Override // defpackage.wze
    public final akul c(rve rveVar, Instant instant, aoia aoiaVar, Optional optional, qei qeiVar) {
        aozy createBuilder = qft.a.createBuilder();
        qfs qfsVar = qfs.CONTROL;
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
        return this.b.m(rveVar, aoiaVar, instant, this.c, (qft) createBuilder.s(), qeiVar);
    }

    @Override // defpackage.wze
    public final akul d(MessageCoreData messageCoreData, aoia aoiaVar) {
        aozy createBuilder = qft.a.createBuilder();
        qfs qfsVar = qfs.CONTROL;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qft qftVar = (qft) apagVar;
        qftVar.c = qfsVar.d;
        qftVar.b |= 1;
        qfr qfrVar = qfr.NORMAL;
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
        return this.b.k(messageCoreData, aoiaVar, 3, this.c, new woc(16), (qft) createBuilder.s());
    }
}
