package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajkp extends ajki {
    public final float a;

    public ajkp() {
        super(null);
        this.a = -1.0f;
    }

    @Override // defpackage.ajki
    public final void a(ajlb ajlbVar, float f, float f2) {
        float f3 = f2 * f;
        ajlbVar.f(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        ajkx ajkxVar = new ajkx(brg.a, brg.a, f4, f4);
        ajkxVar.e = 180.0f;
        ajkxVar.f = 90.0f;
        ajlbVar.f.add(ajkxVar);
        ajlbVar.b(new ajkv(ajkxVar), 180.0f, 270.0f);
        float cos = (float) Math.cos(Math.toRadians(270.0d));
        float f5 = f4 + brg.a;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        ajlbVar.b = (cos * f6) + f7;
        ajlbVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
