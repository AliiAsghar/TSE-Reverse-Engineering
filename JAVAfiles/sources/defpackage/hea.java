package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hea implements hed {
    public final String a;

    public /* synthetic */ hea(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof hea) && d.F(this.a, ((hea) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "JsonString(jsonString=" + this.a + ")";
    }
}
