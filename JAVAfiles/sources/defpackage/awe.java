package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awe implements awb {
    private final float a;

    public awe(float f) {
        this.a = f;
        if (f >= brg.a && f <= 100.0f) {
            return;
        }
        aju.c("The percent should be in the range of [0, 100]");
    }

    @Override // defpackage.awb
    public final float a(long j, dqv dqvVar) {
        return cjt.b(j) * (this.a / 100.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof awe) && Float.compare(this.a, ((awe) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
