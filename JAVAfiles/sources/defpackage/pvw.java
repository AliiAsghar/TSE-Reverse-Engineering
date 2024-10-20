package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pvw extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        qgr qgrVar = (qgr) obj;
        aozy createBuilder = atok.a.createBuilder();
        if ((qgrVar.b & 1) != 0) {
            String str = qgrVar.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            atok atokVar = (atok) createBuilder.b;
            str.getClass();
            atokVar.b = str;
        }
        return (atok) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aozy createBuilder = qgr.a.createBuilder();
        String str = ((atok) obj).b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgr qgrVar = (qgr) createBuilder.b;
        str.getClass();
        qgrVar.b |= 1;
        qgrVar.c = str;
        return (qgr) createBuilder.s();
    }
}
