package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yps extends arpw implements arqv {
    final /* synthetic */ ypt a;
    final /* synthetic */ ypm b;
    final /* synthetic */ ypi c;
    final /* synthetic */ amzf d;
    final /* synthetic */ int e;
    final /* synthetic */ amzq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yps(ypt yptVar, ypm ypmVar, ypi ypiVar, amzf amzfVar, int i, amzq amzqVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = yptVar;
        this.b = ypmVar;
        this.c = ypiVar;
        this.d = amzfVar;
        this.e = i;
        this.f = amzqVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yps) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [arwe, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        yyt yytVar = (yyt) this.a.c.b();
        amzq amzqVar = this.f;
        amzqVar.getClass();
        aiut.b();
        aiqj aiqjVar = (aiqj) yytVar.d.b();
        ypm ypmVar = this.b;
        qjh.l(yytVar.a, null, new ymz(yytVar, ypmVar, aiqjVar.m(ypmVar), this.c, this.d, this.e, amzqVar, null), 3);
        ypr yprVar = (ypr) this.a.b.b();
        amzq amzqVar2 = this.f;
        amzqVar2.getClass();
        ypr.d(yprVar, this.b.a, this.c, null, this.d, this.e, null, null, amzqVar2, 100);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new yps(this.a, this.b, this.c, this.d, this.e, this.f, arpeVar);
    }
}
