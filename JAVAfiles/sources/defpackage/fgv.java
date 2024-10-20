package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgv {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    private fgv(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final fgv a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new fgv(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgv)) {
            return false;
        }
        fgv fgvVar = (fgv) obj;
        if (this.a.equals(fgvVar.a) && this.b == fgvVar.b && this.c == fgvVar.c && this.d == fgvVar.d && this.e == fgvVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public fgv(Object obj) {
        this(obj, -1L);
    }

    public fgv(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public fgv(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public fgv(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
