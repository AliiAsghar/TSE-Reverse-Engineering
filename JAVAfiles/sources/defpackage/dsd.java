package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsd extends arrp implements arqv<cxn, dqv, arnb> {
    public static final dsd a = new dsd();

    public dsd() {
        super(2);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        dqv dqvVar = (dqv) obj2;
        dsn a2 = dsa.a((cxn) obj);
        if (dqvVar != a2.k) {
            a2.k = dqvVar;
            arqr arqrVar = a2.l;
            if (arqrVar != null) {
                arqrVar.a(dqvVar);
            }
        }
        return arnb.a;
    }
}
