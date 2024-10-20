package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdr {
    public final zdv a;
    public final zdv b;

    public zdr(zdv zdvVar, zdv zdvVar2) {
        this.a = zdvVar;
        this.b = zdvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdr)) {
            return false;
        }
        zdr zdrVar = (zdr) obj;
        if (d.F(this.a, zdrVar.a) && d.F(this.b, zdrVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        zdv zdvVar = this.a;
        int i = 0;
        if (zdvVar == null) {
            hashCode = 0;
        } else {
            hashCode = zdvVar.hashCode();
        }
        zdv zdvVar2 = this.b;
        if (zdvVar2 != null) {
            i = zdvVar2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "ProfileSuggestionUiData(profileSuggestionRow=" + this.a + ", phoneSuggestionRow=" + this.b + ")";
    }
}
