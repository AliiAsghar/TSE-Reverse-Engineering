package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwn {
    public final String a;

    public rwn(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rwn) && d.F(this.a, ((rwn) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Caption(content=" + this.a + ")";
    }
}
