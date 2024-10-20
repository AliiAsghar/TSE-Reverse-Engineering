package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzi {
    public final String a;
    public final akec b;

    public ajzi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzi) {
            ajzi ajziVar = (ajzi) obj;
            if (this.a.equals(ajziVar.a) && this.b.equals(ajziVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccountProviderConfig{type=" + this.a + ", provider=" + String.valueOf(this.b) + "}";
    }

    public ajzi(String str, akec akecVar) {
        this.a = str;
        this.b = akecVar;
    }
}
