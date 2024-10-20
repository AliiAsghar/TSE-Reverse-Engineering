package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfe extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ dfi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfe(dfi dfiVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = dfiVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dfe) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            dfi dfiVar = this.b;
            this.a = 1;
            Object r = dfiVar.a.k.r(this);
            if (r != arpl.a) {
                r = arnb.a;
            }
            if (r == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new dfe(this.b, arpeVar);
    }
}
