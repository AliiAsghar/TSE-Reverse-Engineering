package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgu implements lgw {
    public final String a;

    public lgu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lgu) && d.F(this.a, ((lgu) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Disabled(reason=" + this.a + ")";
    }
}
