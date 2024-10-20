package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlp extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ dld b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlp(dld dldVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = dldVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlp) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            dld dldVar = this.b;
            this.a = 1;
            if (dldVar.b(this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new dlp(this.b, arpeVar);
    }
}
