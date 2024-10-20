package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqo {
    public final eqd a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    public eqo(eqd eqdVar, int i, int i2, float f, long j) {
        boolean z;
        String bV = a.bV(i, "width must be positive, but is: ");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, bV);
        d.t(i2 > 0, a.bV(i2, "height must be positive, but is: "));
        this.a = eqdVar;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = j;
    }
}
