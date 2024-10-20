package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awd implements awb {
    private final float a;

    public awd(float f) {
        this.a = f;
    }

    @Override // defpackage.awb
    public final float a(long j, dqv dqvVar) {
        return dqvVar.em(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof awd) && dqy.b(this.a, ((awd) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
