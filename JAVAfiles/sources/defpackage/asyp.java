package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asyp {
    public static final asyp a = new asyp(3, 1);
    public static final asyp b = new asyp(3, 2);
    public static final asyp c = new asyp(3, 3);
    public static final asyp d = new asyp(5, 1);
    public static final asyp e = new asyp(5, 2);
    public static final asyp f = new asyp(5, 3);
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final assy l;
    public final int m;

    private asyp(int i, int i2) {
        if (i != 3) {
            if (i == 5) {
                this.g = 96;
                this.h = 36;
                this.i = 64;
                this.l = new asth();
            } else {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
        } else {
            this.g = 68;
            this.h = 32;
            this.i = 48;
            this.l = new astf();
        }
        int i3 = this.g;
        int i4 = this.h;
        int i5 = this.i;
        this.j = i3 + i4 + i5;
        this.k = i4 + i5;
        this.m = i2;
    }
}
