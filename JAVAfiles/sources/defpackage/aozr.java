package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aozr {
    private final Object a;
    private final int b;

    public aozr(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aozr)) {
            return false;
        }
        aozr aozrVar = (aozr) obj;
        if (this.a != aozrVar.a || this.b != aozrVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
