package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpr extends gps {
    private final float a;

    public gpr(float f) {
        super("dimension in ratio:" + f);
        this.a = f;
        double d = (double) f;
        if (d > 0.0d && d <= 1.0d) {
        } else {
            throw new IllegalArgumentException("Ratio must be in range (0.0, 1.0]");
        }
    }

    public final int a(int i) {
        return (int) (this.a * i);
    }
}
