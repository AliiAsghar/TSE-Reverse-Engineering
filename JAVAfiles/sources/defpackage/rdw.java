package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class rdw extends arpw implements arqv {
    final /* synthetic */ rut a;
    final /* synthetic */ reb b;
    final /* synthetic */ tap c;
    final /* synthetic */ boolean d;
    final /* synthetic */ xaz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdw(rut rutVar, reb rebVar, tap tapVar, boolean z, xaz xazVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = rutVar;
        this.b = rebVar;
        this.c = tapVar;
        this.d = z;
        this.e = xazVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rdw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        aqil.P(obj);
        if (this.a != null) {
            return ((rwd) this.b.g.b()).A(this.a.a, this.c.f, this.d, false);
        }
        rwd rwdVar = (rwd) this.b.g.b();
        xaz xazVar = this.e;
        xazVar.getClass();
        tap tapVar = this.c;
        boolean z2 = this.d;
        String str = tapVar.f;
        if (xazVar.b.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        return rwdVar.z(xazVar.a, str, z2, z);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new rdw(this.a, this.b, this.c, this.d, this.e, arpeVar);
    }
}
