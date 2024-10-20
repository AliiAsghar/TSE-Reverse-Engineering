package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailf {
    public final int a;
    private final int b;
    private final int c;

    public ailf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ailf) {
            ailf ailfVar = (ailf) obj;
            if (this.a == ailfVar.a && this.b == ailfVar.b && this.c == ailfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "TimerConfiguration{t1=" + this.a + ", t2=" + this.b + ", t4=" + this.c + "}";
    }

    public ailf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
