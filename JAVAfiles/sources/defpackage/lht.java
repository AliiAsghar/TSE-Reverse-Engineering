package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lht implements lhv {
    public final String a;

    public lht(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lht) && d.F(this.a, ((lht) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Header(value=" + this.a + ")";
    }
}
