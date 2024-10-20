package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajg implements aiw<Float, zv> {
    private final zr a;

    public ajg(zr zrVar) {
        this.a = zrVar;
    }

    @Override // defpackage.aiw
    public final /* bridge */ /* synthetic */ Object a(ahv ahvVar, Object obj, Object obj2, arqr arqrVar, arpe arpeVar) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        Object c = ajc.c(ahvVar, Math.abs(floatValue) * Math.signum(floatValue2), floatValue, zu.b(brg.a, floatValue2, 28), this.a, arqrVar, arpeVar);
        if (c == arpl.a) {
            return c;
        }
        return (aiv) c;
    }
}
