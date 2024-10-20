package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hni {
    public static final hnh a = new hng();
    public final Object b;
    public final hnh c;
    public final String d;
    public volatile byte[] e;

    public hni(String str, Object obj, hnh hnhVar) {
        hwr.g(str);
        this.d = str;
        this.b = obj;
        hwr.i(hnhVar);
        this.c = hnhVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hni) {
            return this.d.equals(((hni) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
