package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xa extends arrp implements arqr<cle, arnb> {
    final /* synthetic */ cas a;
    final /* synthetic */ cas b;
    final /* synthetic */ cas c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(cas casVar, cas casVar2, cas casVar3) {
        super(1);
        this.a = casVar;
        this.b = casVar2;
        this.c = casVar3;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        float f;
        float f2;
        long j;
        cle cleVar = (cle) obj;
        cas casVar = this.a;
        float f3 = 1.0f;
        if (casVar != null) {
            f = ((Number) casVar.a()).floatValue();
        } else {
            f = 1.0f;
        }
        cleVar.o(f);
        cas casVar2 = this.b;
        if (casVar2 != null) {
            f2 = ((Number) casVar2.a()).floatValue();
        } else {
            f2 = 1.0f;
        }
        cleVar.x(f2);
        cas casVar3 = this.b;
        if (casVar3 != null) {
            f3 = ((Number) casVar3.a()).floatValue();
        }
        cleVar.y(f3);
        cas casVar4 = this.c;
        if (casVar4 != null) {
            j = ((cmg) casVar4.a()).b;
        } else {
            j = cmg.a;
        }
        cleVar.C(j);
        return arnb.a;
    }
}
