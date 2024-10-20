package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aewb extends arrp implements arqr {
    final /* synthetic */ float a;
    final /* synthetic */ cod b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewb(float f, cod codVar) {
        super(1);
        this.a = f;
        this.b = codVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.getClass();
        cntVar.p();
        long j = cku.a;
        float b = cjt.b(cntVar.o()) / 2.0f;
        cnw.g(cntVar, j, b - (this.a / 2.0f), cju.a(cntVar.o()), this.b, 40);
        return arnb.a;
    }
}
