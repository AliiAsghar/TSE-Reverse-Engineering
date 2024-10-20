package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hry {
    public final String a;

    public hry(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hry) {
            return this.a.equals(((hry) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
