package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymz extends arpw implements arqv {
    int a;
    final /* synthetic */ ypm b;
    final /* synthetic */ yni c;
    final /* synthetic */ ypi d;
    final /* synthetic */ amzf e;
    final /* synthetic */ int f;
    final /* synthetic */ amzq g;
    final /* synthetic */ yyt h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymz(yyt yytVar, ypm ypmVar, yni yniVar, ypi ypiVar, amzf amzfVar, int i, amzq amzqVar, arpe arpeVar) {
        super(2, arpeVar);
        this.h = yytVar;
        this.b = ypmVar;
        this.c = yniVar;
        this.d = ypiVar;
        this.e = amzfVar;
        this.f = i;
        this.g = amzqVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ymz) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            aiqj aiqjVar = (aiqj) this.h.d.b();
            ypm ypmVar = this.b;
            yni yniVar = this.c;
            this.a = 1;
            obj = aiqjVar.o(ypmVar.a, ypmVar.b, yniVar, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        ypi ypiVar = this.d;
        amzf amzfVar = this.e;
        int i2 = this.f;
        amzq amzqVar = this.g;
        aozy aozyVar = (aozy) obj;
        aozy d = yyt.d(ypiVar, amzfVar, i2);
        if (!d.b.isMutable()) {
            d.u();
        }
        amze amzeVar = (amze) d.b;
        amze amzeVar2 = amze.a;
        amzeVar.j = amzqVar.a();
        amzeVar.b |= 64;
        amze amzeVar3 = (amze) d.s();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amzo amzoVar = (amzo) aozyVar.b;
        amzo amzoVar2 = amzo.a;
        amzeVar3.getClass();
        amzoVar.d = amzeVar3;
        amzoVar.c = 4;
        ynb ynbVar = (ynb) this.h.c.b();
        aozy createBuilder = amyy.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amyy amyyVar = (amyy) createBuilder.b;
        amzo amzoVar3 = (amzo) aozyVar.s();
        amzoVar3.getClass();
        amyyVar.c = amzoVar3;
        amyyVar.b = 1;
        apag s = createBuilder.s();
        s.getClass();
        ynbVar.b((amyy) s);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new ymz(this.h, this.b, this.c, this.d, this.e, this.f, this.g, arpeVar);
    }
}
