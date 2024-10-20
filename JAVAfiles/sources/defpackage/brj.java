package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brj {
    public final float a;
    public final float b;
    private final float c;

    public brj(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a() {
        return this.a + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brj)) {
            return false;
        }
        brj brjVar = (brj) obj;
        if (dqy.b(this.a, brjVar.a) && dqy.b(this.b, brjVar.b) && dqy.b(this.c, brjVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TabPosition(left=" + ((Object) dqy.a(this.a)) + ", right=" + ((Object) dqy.a(a())) + ", width=" + ((Object) dqy.a(this.b)) + ", contentWidth=" + ((Object) dqy.a(this.c)) + ')';
    }
}
