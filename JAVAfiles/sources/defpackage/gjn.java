package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjn extends arpw implements arqv {
    int a;
    final /* synthetic */ gid b;
    final /* synthetic */ boolean c;
    final /* synthetic */ arqr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjn(arpe arpeVar, gid gidVar, boolean z, arqr arqrVar) {
        super(2, arpeVar);
        this.b = gidVar;
        this.c = z;
        this.d = arqrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gjn) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            gid gidVar = this.b;
            gjp gjpVar = new gjp(this.c, gidVar, null, this.d);
            this.a = 1;
            obj = gidVar.t(gjpVar, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        return obj;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new gjn(arpeVar, this.b, this.c, this.d);
    }
}
