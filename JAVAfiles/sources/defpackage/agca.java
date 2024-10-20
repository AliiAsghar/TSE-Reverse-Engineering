package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agca extends agcb {
    private final int a;
    private final int b;

    public agca(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agca)) {
            return false;
        }
        agca agcaVar = (agca) obj;
        if (this.a == agcaVar.a && this.b == agcaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Opening(currentHeight=" + this.a + ", finalHeight=" + this.b + ")";
    }
}
