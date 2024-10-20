package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class vzq extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        wcd wcdVar = (wcd) obj;
        aozy createBuilder = qft.a.createBuilder();
        if ((wcdVar.b & 1) != 0) {
            algf m = waj.a.m();
            wcc b = wcc.b(wcdVar.c);
            if (b == null) {
                b = wcc.UNKNOWN_MESSAGE_SOURCE;
            }
            qfs qfsVar = (qfs) m.fu(b);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qft qftVar = (qft) createBuilder.b;
            qftVar.c = qfsVar.d;
            qftVar.b |= 1;
        }
        if ((wcdVar.b & 2) != 0) {
            algf m2 = waj.b.m();
            wcb b2 = wcb.b(wcdVar.d);
            if (b2 == null) {
                b2 = wcb.UNKNOWN_MESSAGE_PRIORITY;
            }
            qfr qfrVar = (qfr) m2.fu(b2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qft qftVar2 = (qft) createBuilder.b;
            qftVar2.d = qfrVar.e;
            qftVar2.b |= 2;
        }
        if ((wcdVar.b & 4) != 0) {
            boolean z = wcdVar.e;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qft qftVar3 = (qft) createBuilder.b;
            qftVar3.b |= 4;
            qftVar3.e = z;
        }
        if ((wcdVar.b & 8) != 0) {
            boolean z2 = wcdVar.f;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qft qftVar4 = (qft) createBuilder.b;
            qftVar4.b |= 8;
            qftVar4.f = z2;
        }
        return (qft) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qft qftVar = (qft) obj;
        aozy createBuilder = wcd.a.createBuilder();
        if ((qftVar.b & 1) != 0) {
            algf algfVar = waj.a;
            qfs b = qfs.b(qftVar.c);
            if (b == null) {
                b = qfs.UNKNOWN_MESSAGE_SOURCE;
            }
            wcc wccVar = (wcc) algfVar.fu(b);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcd wcdVar = (wcd) createBuilder.b;
            wcdVar.c = wccVar.d;
            wcdVar.b |= 1;
        }
        if ((qftVar.b & 2) != 0) {
            algf algfVar2 = waj.b;
            qfr b2 = qfr.b(qftVar.d);
            if (b2 == null) {
                b2 = qfr.UNKNOWN_MESSAGE_PRIORITY;
            }
            wcb wcbVar = (wcb) algfVar2.fu(b2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcd wcdVar2 = (wcd) createBuilder.b;
            wcdVar2.d = wcbVar.e;
            wcdVar2.b |= 2;
        }
        if ((qftVar.b & 4) != 0) {
            boolean z = qftVar.e;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcd wcdVar3 = (wcd) createBuilder.b;
            wcdVar3.b |= 4;
            wcdVar3.e = z;
        }
        if ((qftVar.b & 8) != 0) {
            boolean z2 = qftVar.f;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wcd wcdVar4 = (wcd) createBuilder.b;
            wcdVar4.b |= 8;
            wcdVar4.f = z2;
        }
        return (wcd) createBuilder.s();
    }
}
