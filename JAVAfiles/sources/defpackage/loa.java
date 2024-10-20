package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class loa implements lkg {
    public final String a;

    public loa(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof loa) && d.F(this.a, ((loa) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RetrievePendingActivityResult(key=" + this.a + ")";
    }
}
