package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsc extends arrp implements arqv<cxn, cga, arnb> {
    public static final dsc a = new dsc();

    public dsc() {
        super(2);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        cga cgaVar = (cga) obj2;
        dsn a2 = dsa.a((cxn) obj);
        if (cgaVar != a2.i) {
            a2.i = cgaVar;
            arqr arqrVar = a2.j;
            if (arqrVar != null) {
                arqrVar.a(cgaVar);
            }
        }
        return arnb.a;
    }
}
