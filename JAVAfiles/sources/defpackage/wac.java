package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wac extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        wdu wduVar = (wdu) obj;
        aozy createBuilder = qgr.a.createBuilder();
        if ((wduVar.b & 1) != 0) {
            String str = wduVar.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qgr qgrVar = (qgr) createBuilder.b;
            str.getClass();
            qgrVar.b |= 1;
            qgrVar.c = str;
        }
        return (qgr) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qgr qgrVar = (qgr) obj;
        aozy createBuilder = wdu.a.createBuilder();
        if ((qgrVar.b & 1) != 0) {
            String str = qgrVar.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdu wduVar = (wdu) createBuilder.b;
            str.getClass();
            wduVar.b |= 1;
            wduVar.c = str;
        }
        return (wdu) createBuilder.s();
    }
}
