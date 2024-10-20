package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yau {
    public final int a;
    public final yap b;

    public yau() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yau) {
            yau yauVar = (yau) obj;
            if (this.a == yauVar.a && this.b.equals(yauVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "NetworkTypePair{networkCapabilities=" + this.a + ", networkTransport=" + this.b.toString() + "}";
    }

    public yau(int i, yap yapVar) {
        this.a = i;
        if (yapVar == null) {
            throw new NullPointerException("Null networkTransport");
        }
        this.b = yapVar;
    }
}
