package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aic extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ aia b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aic(aia aiaVar, float f, float f2, arpe arpeVar) {
        super(2, arpeVar);
        this.b = aiaVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aic) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            aia aiaVar = this.b;
            float f = this.c;
            float f2 = this.d;
            long floatToRawIntBits = Float.floatToRawIntBits(f);
            long floatToRawIntBits2 = Float.floatToRawIntBits(f2);
            this.a = 1;
            if (ahy.b(aiaVar.k, (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32), this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aic(this.b, this.c, this.d, arpeVar);
    }
}
