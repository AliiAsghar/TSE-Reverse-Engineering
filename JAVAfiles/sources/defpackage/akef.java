package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akef extends arpw implements arqv {
    int a;
    final /* synthetic */ asai b;
    final /* synthetic */ arqv c;
    final /* synthetic */ ascd d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akef(arpe arpeVar, asai asaiVar, arqv arqvVar, ascd ascdVar) {
        super(2, arpeVar);
        this.b = asaiVar;
        this.c = arqvVar;
        this.d = ascdVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akef) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            asai n = armd.n(armd.m(new asae(new akea(new akej(), new akee(this.b, this.c, 0), akeb.a, agdl.k, null))), arws.b);
            yzp yzpVar = new yzp(this.d, 15);
            this.a = 1;
            if (n.a(yzpVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        akef akefVar = new akef(arpeVar, this.b, this.c, this.d);
        akefVar.e = obj;
        return akefVar;
    }
}
