package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awh {
    public static final awg a = d();

    public static final awg a(float f) {
        awd awdVar = new awd(f);
        return new awg(awdVar, awdVar, awdVar, awdVar);
    }

    public static final awg b(float f, float f2, float f3, float f4) {
        return new awg(new awd(f), new awd(f2), new awd(f3), new awd(f4));
    }

    public static /* synthetic */ awg c(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return b(f, f2, f3, f4);
    }

    public static final awg d() {
        awb a2 = awc.a(50);
        return new awg(a2, a2, a2, a2);
    }
}
