package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amcg {
    public static final amcg a = new amcg("about:invalid#zGuavaz");
    public final String b;

    public amcg(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amcg)) {
            return false;
        }
        return this.b.equals(((amcg) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 18288376;
    }

    public final String toString() {
        return "SafeUrl{" + this.b + "}";
    }
}
