package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxu {
    public final gqg a;

    public jxu(gqg gqgVar) {
        gqgVar.getClass();
        this.a = gqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jxu) && d.F(this.a, ((jxu) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LazyPagingWrapper(items=" + this.a + ")";
    }
}
