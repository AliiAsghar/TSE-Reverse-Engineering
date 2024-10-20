package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bne extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ bpq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bne(bpq bpqVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = bpqVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bne) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            bpq bpqVar = this.b;
            this.a = 1;
            if (bpqVar.e(this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bne(this.b, arpeVar);
    }
}
