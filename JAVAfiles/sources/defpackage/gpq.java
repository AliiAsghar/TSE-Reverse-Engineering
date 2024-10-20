package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpq extends gps {
    public final int a;

    public gpq(int i) {
        super(a.bV(i, "dimension in pixel:"));
        this.a = i;
        if (i > 0) {
        } else {
            throw new IllegalArgumentException("Pixel value must be a positive integer.");
        }
    }
}
