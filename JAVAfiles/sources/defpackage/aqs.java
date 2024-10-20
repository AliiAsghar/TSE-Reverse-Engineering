package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqs extends arpw implements arqv<ahv, arpe<? super arnb>, Object> {
    final /* synthetic */ aqr a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqs(aqr aqrVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.a = aqrVar;
        this.b = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqs) c((ahv) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        aqr aqrVar = this.a;
        int a = aqrVar.c.a();
        int i = this.b;
        if (a != i || aqrVar.c.b() != 0) {
            aqrVar.j.d();
        }
        aqn aqnVar = aqrVar.c;
        aqnVar.e(i, 0);
        aqnVar.b = null;
        cve cveVar = aqrVar.g;
        if (cveVar != null) {
            cveVar.e();
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aqs(this.a, this.b, arpeVar);
    }
}
