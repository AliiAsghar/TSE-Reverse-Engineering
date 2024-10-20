package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class geo {
    public static final geo a;
    public static final geo b;
    public static final geo c;
    public static final geo d;
    public static final geo e;
    public static final geo f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final boolean j = true;

    static {
        geo geoVar = new geo();
        a = geoVar;
        e(geoVar);
        h(geoVar);
        geo geoVar2 = new geo();
        b = geoVar2;
        g(geoVar2);
        h(geoVar2);
        geo geoVar3 = new geo();
        c = geoVar3;
        d(geoVar3);
        h(geoVar3);
        geo geoVar4 = new geo();
        d = geoVar4;
        e(geoVar4);
        f(geoVar4);
        geo geoVar5 = new geo();
        e = geoVar5;
        g(geoVar5);
        f(geoVar5);
        geo geoVar6 = new geo();
        f = geoVar6;
        d(geoVar6);
        f(geoVar6);
    }

    public geo() {
        float[] fArr = new float[3];
        this.g = fArr;
        float[] fArr2 = new float[3];
        this.h = fArr2;
        this.i = r0;
        i(fArr);
        i(fArr2);
        float[] fArr3 = {0.24f, 0.52f, 0.24f};
    }

    private static void d(geo geoVar) {
        float[] fArr = geoVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void e(geo geoVar) {
        float[] fArr = geoVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void f(geo geoVar) {
        float[] fArr = geoVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void g(geo geoVar) {
        float[] fArr = geoVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void h(geo geoVar) {
        float[] fArr = geoVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void i(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public final float a() {
        return this.i[1];
    }

    public final float b() {
        return this.i[2];
    }

    public final float c() {
        return this.i[0];
    }
}
