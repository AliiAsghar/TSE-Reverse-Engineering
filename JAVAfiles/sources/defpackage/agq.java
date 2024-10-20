package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface agq {
    public static final /* synthetic */ int a = 0;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final zr a = zs.c(brg.a, brg.a, null, 7);
        public static final agq b = new agq() { // from class: agq.a.1
            @Override // defpackage.agq
            public final /* synthetic */ float a(float f, float f2, float f3) {
                int i = agp.a;
                float f4 = f2 + f;
                if ((f >= brg.a && f4 <= f3) || (f < brg.a && f4 > f3)) {
                    return brg.a;
                }
                float f5 = f4 - f3;
                if (Math.abs(f) >= Math.abs(f5)) {
                    return f5;
                }
                return f;
            }
        };
    }

    static {
        zr zrVar = a.a;
    }

    float a(float f, float f2, float f3);
}
