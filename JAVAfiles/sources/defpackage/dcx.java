package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcx extends arpw implements arqr<arpe, Object> {
    int a;
    final /* synthetic */ arqr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcx(arqr arqrVar, arpe arpeVar) {
        super(1, arpeVar);
        this.b = arqrVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new dcx(this.b, (arpe) obj).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            arqr arqrVar = this.b;
            this.a = 1;
            obj = byf.c(arqrVar, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        return obj;
    }
}
