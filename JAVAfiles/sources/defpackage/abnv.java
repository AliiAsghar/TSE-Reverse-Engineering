package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnv {
    public final apwc a;

    public abnv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof abnv) && this.a.equals(((abnv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1344810917;
    }

    public final String toString() {
        return "ComplianceProductData{productId=127232436, productIdOrigin=" + this.a.toString() + "}";
    }

    public abnv(apwc apwcVar) {
        this.a = apwcVar;
    }
}
