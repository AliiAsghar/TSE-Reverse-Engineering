package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdz extends arpv implements arqv<cqg, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ arqr b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdz(arqr arqrVar, arpe arpeVar) {
        super(arpeVar);
        this.b = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdz) c((cqg) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            cqg cqgVar = (cqg) this.c;
            this.a = 1;
            obj = aik.i(cqgVar, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        crc crcVar = (crc) obj;
        if (crcVar != null) {
            this.b.a(new cjn(crcVar.c));
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        bdz bdzVar = new bdz(this.b, arpeVar);
        bdzVar.c = obj;
        return bdzVar;
    }
}
