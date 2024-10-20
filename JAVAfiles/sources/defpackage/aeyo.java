package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeyo {
    public final char a;
    public final int b;

    public aeyo(char c, int i) {
        this.a = c;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeyo)) {
            return false;
        }
        aeyo aeyoVar = (aeyo) obj;
        if (this.a == aeyoVar.a && this.b == aeyoVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SimIconUiData(iconChar=" + this.a + ", iconTint=" + this.b + ")";
    }
}
