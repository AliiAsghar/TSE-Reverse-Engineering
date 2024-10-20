package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zma {
    public final int a;
    public final String b;
    public final msh c;

    public zma() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zma) {
            zma zmaVar = (zma) obj;
            if (this.a == zmaVar.a && this.b.equals(zmaVar.b) && this.c.equals(zmaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "SimSelectionSettingsData{subscriptionId=" + this.a + ", simName=" + this.b + ", messagingIdentity=" + String.valueOf(this.c) + "}";
    }

    public zma(int i, String str, msh mshVar) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null simName");
        }
        this.b = str;
        this.c = mshVar;
    }
}
