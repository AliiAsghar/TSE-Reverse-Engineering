package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeud extends arrp implements arqv {
    final /* synthetic */ float a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeud(float f, arqv arqvVar, int i, int i2) {
        super(2);
        this.d = i2;
        this.a = f;
        this.c = arqvVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqv] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            ((Number) obj2).intValue();
            Object obj3 = this.c;
            aenm aenmVar = (aenm) obj3;
            adom.aD(aenmVar, this.a, (bwj) obj, bzh.a(this.b | 1));
            return arnb.a;
        }
        ((Number) obj2).intValue();
        adcx.cp(this.a, this.c, (bwj) obj, bzh.a(this.b | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeud(aenm aenmVar, float f, int i, int i2) {
        super(2);
        this.d = i2;
        this.c = aenmVar;
        this.a = f;
        this.b = i;
    }
}
