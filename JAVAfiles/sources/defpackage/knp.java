package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knp extends lga {
    public final String a;
    public final String b;

    public knp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof knp) {
            knp knpVar = (knp) obj;
            if (this.a.equals(knpVar.a) && this.b.equals(knpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GServicesPhenotypeScenarioOptions{bugleGservices=" + this.a + ", phenotypeValues=" + this.b + "}";
    }

    public knp(String str, String str2) {
        super((short[]) null);
        this.a = str;
        this.b = str2;
    }
}
