package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajkh extends ajki {
    public final float a;

    public ajkh() {
        super(null);
        this.a = -1.0f;
    }

    @Override // defpackage.ajki
    public final void a(ajlb ajlbVar, float f, float f2) {
        float f3 = f2 * f;
        ajlbVar.f(f3, 180.0f, 90.0f);
        double d = f3;
        ajlbVar.d((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
