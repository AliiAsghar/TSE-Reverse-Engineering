package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeo extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ aen b;
    final /* synthetic */ avi c;
    final /* synthetic */ cti d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeo(aen aenVar, avi aviVar, cti ctiVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = aenVar;
        this.c = aviVar;
        this.d = ctiVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0 && this.b.z) {
            avi aviVar = this.c;
            cti ctiVar = this.d;
            this.a = 1;
            if (avq.a(aviVar, ctiVar, null, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aeo(this.b, this.c, this.d, arpeVar);
    }
}
