package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nab extends arpw implements arqv {
    long a;
    int b;
    final /* synthetic */ nad c;
    final /* synthetic */ nam d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nab(nad nadVar, nam namVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.c = nadVar;
        this.d = namVar;
        this.e = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((nab) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        mjb mjbVar;
        long j;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            j = this.a;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            nad nadVar = this.c;
            nam namVar = this.d;
            long a = nadVar.e.a();
            if (namVar != null) {
                mjbVar = namVar.a;
            } else {
                mjbVar = null;
            }
            akul f = nadVar.b.f(mjbVar, this.e);
            f.getClass();
            this.a = a;
            this.b = 1;
            obj = arro.F(f, this);
            if (obj != arplVar) {
                j = a;
            } else {
                return arplVar;
            }
        }
        nad nadVar2 = this.c;
        int i = this.e;
        nae naeVar = (nae) obj;
        naeVar.getClass();
        return nadVar2.e.c(i, j, naeVar);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new nab(this.c, this.d, this.e, arpeVar);
    }
}
