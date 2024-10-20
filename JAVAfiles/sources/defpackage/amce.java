package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amce {
    public final String a;

    public amce(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amce)) {
            return false;
        }
        return this.a.equals(((amce) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 867184553;
    }

    public final String toString() {
        return "SafeHtml{" + this.a + "}";
    }
}
