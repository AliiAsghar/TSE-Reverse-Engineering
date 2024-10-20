package defpackage;

import com.google.android.rcs.client.messaging.data.MessageClass;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class vzi extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        MessageClass messageClass = (MessageClass) obj;
        aozy createBuilder = qft.a.createBuilder();
        qfs qfsVar = (qfs) vzn.a.m().fu(messageClass.b());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qft qftVar = (qft) createBuilder.b;
        qftVar.c = qfsVar.d;
        qftVar.b |= 1;
        qfr qfrVar = (qfr) vzn.b.m().fu(messageClass.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qft qftVar2 = (qft) apagVar;
        qftVar2.d = qfrVar.e;
        qftVar2.b |= 2;
        boolean d = messageClass.d();
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        qft qftVar3 = (qft) apagVar2;
        qftVar3.b |= 4;
        qftVar3.e = d;
        boolean c = messageClass.c();
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        qft qftVar4 = (qft) createBuilder.b;
        qftVar4.b |= 8;
        qftVar4.f = c;
        return (qft) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qft qftVar = (qft) obj;
        ajqr e = MessageClass.e();
        if ((qftVar.b & 1) != 0) {
            algf algfVar = vzn.a;
            qfs b = qfs.b(qftVar.c);
            if (b == null) {
                b = qfs.UNKNOWN_MESSAGE_SOURCE;
            }
            e.e((ajqt) algfVar.fu(b));
        }
        if ((qftVar.b & 2) != 0) {
            algf algfVar2 = vzn.b;
            qfr b2 = qfr.b(qftVar.d);
            if (b2 == null) {
                b2 = qfr.UNKNOWN_MESSAGE_PRIORITY;
            }
            e.d((ajqs) algfVar2.fu(b2));
        }
        if ((qftVar.b & 4) != 0) {
            e.c(qftVar.e);
        }
        if ((qftVar.b & 8) != 0) {
            e.b(qftVar.f);
        }
        return e.a();
    }
}
