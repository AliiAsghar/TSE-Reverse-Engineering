package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khf {
    private final int a;
    private final int b;

    public khf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khf)) {
            return false;
        }
        khf khfVar = (khf) obj;
        if (this.a == khfVar.a && this.b == khfVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SelectionOffset(x=" + this.a + ", y=" + this.b + ")";
    }

    public khf() {
        this(0, 0);
    }
}
