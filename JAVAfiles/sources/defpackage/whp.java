package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whp extends arpw implements arqv {
    final /* synthetic */ amlx a;
    final /* synthetic */ amlw b;
    final /* synthetic */ amlu c;
    final /* synthetic */ int d;
    final /* synthetic */ String e;
    final /* synthetic */ int f;
    final /* synthetic */ wyp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whp(wyp wypVar, amlx amlxVar, amlw amlwVar, int i, amlu amluVar, int i2, String str, arpe arpeVar) {
        super(2, arpeVar);
        this.g = wypVar;
        this.a = amlxVar;
        this.b = amlwVar;
        this.f = i;
        this.c = amluVar;
        this.d = i2;
        this.e = str;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((whp) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        aozy createBuilder = amly.a.createBuilder();
        createBuilder.getClass();
        akec.ay(this.a, createBuilder);
        akec.ax(this.b, createBuilder);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        int i = this.f;
        amly amlyVar = (amly) createBuilder.b;
        amlyVar.h = a.ak(i);
        amlyVar.b |= 64;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amlu amluVar = this.c;
        apag apagVar = createBuilder.b;
        amly amlyVar2 = (amly) apagVar;
        amlyVar2.g = amluVar;
        amlyVar2.b |= 32;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        String str = this.e;
        wyp wypVar = this.g;
        int i2 = this.d;
        amly amlyVar3 = (amly) createBuilder.b;
        amlyVar3.b |= 16;
        amlyVar3.f = i2;
        akec.aw(((acnu) wypVar.e.b()).a(new adiw(str)), createBuilder);
        this.g.l(akec.av(createBuilder));
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new whp(this.g, this.a, this.b, this.f, this.c, this.d, this.e, arpeVar);
    }
}
