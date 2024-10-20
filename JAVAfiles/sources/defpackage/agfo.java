package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfo {
    public final float a;
    public final long b;

    public agfo(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agfo)) {
            return false;
        }
        agfo agfoVar = (agfo) obj;
        if (dqy.b(this.a, agfoVar.a) && a.bB(this.b, agfoVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + a.A(this.b);
    }

    public final String toString() {
        long j = this.b;
        return "DotData(dotSize=" + dqy.a(this.a) + ", dotColor=" + cku.g(j) + ")";
    }
}
