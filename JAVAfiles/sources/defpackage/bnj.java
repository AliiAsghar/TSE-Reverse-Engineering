package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnj extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ bpq b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnj(bpq bpqVar, float f, arpe arpeVar) {
        super(2, arpeVar);
        this.b = bpqVar;
        this.c = f;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bnj) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            bpq bpqVar = this.b;
            float f = this.c;
            this.a = 1;
            if (bpqVar.g(f, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bnj(this.b, this.c, arpeVar);
    }
}
