package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbg extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ bbh b;
    final /* synthetic */ arqv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbg(bbh bbhVar, arqv arqvVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = bbhVar;
        this.c = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbg) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            bbh bbhVar = this.b;
            arqv arqvVar = this.c;
            this.a = 1;
            if (ddo.a(bbhVar, arqvVar, this) == arplVar) {
                return arplVar;
            }
        }
        throw new armj();
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bbg(this.b, this.c, arpeVar);
    }
}
