package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aam {
    public static final aak a;
    public static final aak b;
    public static final aak c;

    static {
        new aae(0.25f, 0.1f, 0.25f, 1.0f);
        a = new aae(brg.a, brg.a, 0.58f, 1.0f);
        b = new aae(0.42f, brg.a, 1.0f, 1.0f);
        new aae(0.42f, brg.a, 0.58f, 1.0f);
        new aae(0.12f, brg.a, 0.39f, brg.a);
        new aae(0.61f, 1.0f, 0.88f, 1.0f);
        new aae(0.37f, brg.a, 0.63f, 1.0f);
        new aae(0.32f, brg.a, 0.67f, brg.a);
        new aae(0.33f, 1.0f, 0.68f, 1.0f);
        new aae(0.65f, brg.a, 0.35f, 1.0f);
        new aae(0.64f, brg.a, 0.78f, brg.a);
        new aae(0.22f, 1.0f, 0.36f, 1.0f);
        new aae(0.83f, brg.a, 0.17f, 1.0f);
        new aae(0.55f, brg.a, 1.0f, 0.45f);
        new aae(brg.a, 0.55f, 0.45f, 1.0f);
        new aae(0.85f, brg.a, 0.15f, 1.0f);
        new aae(0.11f, brg.a, 0.5f, brg.a);
        new aae(0.5f, 1.0f, 0.89f, 1.0f);
        new aae(0.45f, brg.a, 0.55f, 1.0f);
        new aae(0.5f, brg.a, 0.75f, brg.a);
        new aae(0.25f, 1.0f, 0.5f, 1.0f);
        new aae(0.76f, brg.a, 0.24f, 1.0f);
        new aae(0.7f, brg.a, 0.84f, brg.a);
        new aae(0.16f, 1.0f, 0.3f, 1.0f);
        new aae(0.87f, brg.a, 0.13f, 1.0f);
        new aae(0.36f, brg.a, 0.66f, -0.56f);
        new aae(0.34f, 1.56f, 0.64f, 1.0f);
        new aae(0.68f, -0.6f, 0.32f, 1.6f);
        c = new aak() { // from class: aal
            @Override // defpackage.aak
            public final float a(float f) {
                aak aakVar = aam.a;
                if (f == brg.a) {
                    return brg.a;
                }
                if (f == 1.0f) {
                    return 1.0f;
                }
                return (float) ((((float) Math.pow(2.0d, (-10.0f) * f)) * Math.sin(((f * 10.0f) - 0.75f) * 2.0943951023931953d)) + 1.0d);
            }
        };
    }
}
