package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpc extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ bpd b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpc(bpd bpdVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.b = bpdVar;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bpc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            bpd bpdVar = this.b;
            int i2 = this.c;
            this.a = 1;
            if (bpdVar.a.d(i2, bpdVar.c, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bpc(this.b, this.c, arpeVar);
    }
}
