package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kja extends arrp implements arqr {
    final /* synthetic */ float a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kja(float f, int i) {
        super(1);
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                ((dqv) obj).getClass();
                return new dre(arsk.g(this.a) << 32);
            }
            ((Number) obj).floatValue();
            double d = this.a;
            if (d < 0.0d || d > 1.0d || aqil.t(new Float[]{Float.valueOf(brg.a), Float.valueOf(1.0f)}, Float.valueOf(this.a))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        zxk zxkVar = (zxk) obj;
        zxkVar.getClass();
        aozy builder = zxkVar.toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        float f = this.a;
        zxk zxkVar2 = (zxk) builder.b;
        zxkVar2.b = 1 | zxkVar2.b;
        zxkVar2.c = f;
        apag s = builder.s();
        s.getClass();
        return (zxk) s;
    }
}
