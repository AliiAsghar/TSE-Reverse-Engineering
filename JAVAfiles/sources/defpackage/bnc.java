package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnc extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ zj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnc(zj zjVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = zjVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bnc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            zj zjVar = this.b;
            Float f = new Float(brg.a);
            this.a = 1;
            if (zj.j(zjVar, f, null, this, 14) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bnc(this.b, arpeVar);
    }
}
