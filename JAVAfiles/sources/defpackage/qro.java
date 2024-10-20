package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qro {
    public final int a;
    private final int b = 40;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qro)) {
            return false;
        }
        qro qroVar = (qro) obj;
        if (this.a != qroVar.a) {
            return false;
        }
        int i = qroVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + 40;
    }

    public final String toString() {
        return "InMemoryCacheConfig(sizeLimit=" + this.a + ", evictLevel=40)";
    }
}
