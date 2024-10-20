package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class afbi extends arpv implements arqv {
    int a;
    private /* synthetic */ Object b;

    public afbi(arpe arpeVar) {
        super(arpeVar);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afbi) c((cqg) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            cqg cqgVar = (cqg) this.b;
            this.a = 1;
            obj = adom.bo(cqgVar, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        return obj;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        afbi afbiVar = new afbi(arpeVar);
        afbiVar.b = obj;
        return afbiVar;
    }
}
