package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class afhh extends arrp implements arqr {
    final /* synthetic */ dqv a;
    final /* synthetic */ float b;
    final /* synthetic */ aki c;
    final /* synthetic */ byj d;
    final /* synthetic */ afhp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afhh(dqv dqvVar, float f, afhp afhpVar, aki akiVar, byj byjVar) {
        super(1);
        this.a = dqvVar;
        this.b = f;
        this.e = afhpVar;
        this.c = akiVar;
        this.d = byjVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        cti ctiVar = (cti) obj;
        ctiVar.getClass();
        float c = this.c.c() - this.a.eg(Float.intBitsToFloat((int) (ctj.a(ctiVar) & 4294967295L)));
        afhp afhpVar = this.e;
        float f = this.b;
        float f2 = afhpVar.a;
        this.d.d(arrn.q(((c - f2) + 36.0f) / (f - f2), brg.a, 1.0f));
        return arnb.a;
    }
}
