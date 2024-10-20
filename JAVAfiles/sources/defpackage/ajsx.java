package defpackage;

import com.google.android.rcs.client.messaging.data.MessageClass;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajsx extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        MessageClass messageClass = (MessageClass) obj;
        aozy createBuilder = wcd.a.createBuilder();
        wcc wccVar = (wcc) ajtq.a.m().fu(messageClass.b());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wcd wcdVar = (wcd) createBuilder.b;
        wcdVar.c = wccVar.d;
        wcdVar.b |= 1;
        wcb wcbVar = (wcb) ajtq.b.m().fu(messageClass.a());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        wcd wcdVar2 = (wcd) apagVar;
        wcdVar2.d = wcbVar.e;
        wcdVar2.b |= 2;
        boolean d = messageClass.d();
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        wcd wcdVar3 = (wcd) apagVar2;
        wcdVar3.b |= 4;
        wcdVar3.e = d;
        boolean c = messageClass.c();
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        wcd wcdVar4 = (wcd) createBuilder.b;
        wcdVar4.b |= 8;
        wcdVar4.f = c;
        return (wcd) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wcd wcdVar = (wcd) obj;
        ajqr e = MessageClass.e();
        if ((wcdVar.b & 1) != 0) {
            algf algfVar = ajtq.a;
            wcc b = wcc.b(wcdVar.c);
            if (b == null) {
                b = wcc.UNKNOWN_MESSAGE_SOURCE;
            }
            e.e((ajqt) algfVar.fu(b));
        }
        if ((wcdVar.b & 2) != 0) {
            algf algfVar2 = ajtq.b;
            wcb b2 = wcb.b(wcdVar.d);
            if (b2 == null) {
                b2 = wcb.UNKNOWN_MESSAGE_PRIORITY;
            }
            e.d((ajqs) algfVar2.fu(b2));
        }
        if ((wcdVar.b & 4) != 0) {
            e.c(wcdVar.e);
        }
        if ((wcdVar.b & 8) != 0) {
            e.b(wcdVar.f);
        }
        return e.a();
    }
}
