package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awf implements awb {
    private final float a;

    public awf(float f) {
        this.a = f;
    }

    @Override // defpackage.awb
    public final float a(long j, dqv dqvVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof awf) && Float.compare(this.a, ((awf) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
