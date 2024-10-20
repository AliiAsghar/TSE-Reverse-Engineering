package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xcz {
    public final int a;
    public final int b;

    public xcz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcz)) {
            return false;
        }
        xcz xczVar = (xcz) obj;
        if (this.a == xczVar.a && this.b == xczVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SuggestionCombinationBounds(min=" + this.a + ", max=" + this.b + ")";
    }
}
