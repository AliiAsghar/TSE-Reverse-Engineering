package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vzy extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        wbt wbtVar = (wbt) obj;
        aozy createBuilder = wxp.a.createBuilder();
        if ((wbtVar.b & 1) != 0) {
            String str = wbtVar.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wxp wxpVar = (wxp) createBuilder.b;
            str.getClass();
            wxpVar.b |= 1;
            wxpVar.c = str;
        }
        return (wxp) createBuilder.s();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wxp wxpVar = (wxp) obj;
        aozy createBuilder = wbt.a.createBuilder();
        if ((wxpVar.b & 1) != 0) {
            String str = wxpVar.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbt wbtVar = (wbt) createBuilder.b;
            str.getClass();
            wbtVar.b |= 1;
            wbtVar.c = str;
        }
        return (wbt) createBuilder.s();
    }
}
