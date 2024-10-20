package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cma {
    public static final cma a = new cma();
    public final long b;
    public final long c;
    public final float d;

    public cma(long j, long j2, float f) {
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cma)) {
            return false;
        }
        cma cmaVar = (cma) obj;
        if (a.bB(this.b, cmaVar.b) && a.bB(this.c, cmaVar.c) && this.d == cmaVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.A(this.b) * 31) + a.A(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "Shadow(color=" + ((Object) cku.g(this.b)) + ", offset=" + ((Object) cjn.f(this.c)) + ", blurRadius=" + this.d + ')';
    }

    public /* synthetic */ cma() {
        this(ckw.d(4278190080L), 0L, brg.a);
    }
}
