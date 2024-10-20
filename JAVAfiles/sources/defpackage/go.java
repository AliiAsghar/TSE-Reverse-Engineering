package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class go {
    public final int a;
    public final String b;

    public go() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof go) {
            go goVar = (go) obj;
            if (this.a == goVar.a && this.b.equals(goVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PduHeaderValue{value=" + this.a + ", valueName=" + this.b + "}";
    }

    public go(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
