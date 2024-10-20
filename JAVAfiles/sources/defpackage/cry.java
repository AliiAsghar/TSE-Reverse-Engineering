package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cry {
    public long a;
    public float b;

    public cry(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cry)) {
            return false;
        }
        cry cryVar = (cry) obj;
        if (this.a == cryVar.a && Float.compare(this.b, cryVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.A(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ')';
    }
}
