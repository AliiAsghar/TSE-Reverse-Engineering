package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahit {
    public final String a;
    private final int b;

    public ahit() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahit) {
            ahit ahitVar = (ahit) obj;
            if (this.b == ahitVar.b && this.a.equals(ahitVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.aS(i);
        return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public ahit(String str) {
        this.b = 2;
        this.a = str;
    }
}
