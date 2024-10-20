package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adyu {
    public adyw a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof adyu)) {
            return false;
        }
        adyw adywVar = this.a;
        adyw adywVar2 = ((adyu) obj).a;
        if (adywVar == null) {
            if (adywVar2 != null) {
                return false;
            }
        } else if (!adywVar.equals(adywVar2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        adyw adywVar = this.a;
        if (adywVar == null) {
            hashCode = 0;
        } else {
            hashCode = adywVar.hashCode();
        }
        return hashCode + 31;
    }
}
