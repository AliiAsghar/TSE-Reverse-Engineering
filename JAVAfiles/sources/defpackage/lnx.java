package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnx implements akvv {
    private final String a;

    public lnx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lnx) && d.F(this.a, ((lnx) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Renamed(newName=" + this.a + ")";
    }
}
