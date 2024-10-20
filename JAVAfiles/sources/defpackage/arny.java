package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arny<T> {
    public final int a;
    public final Object b;

    public arny(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arny)) {
            return false;
        }
        arny arnyVar = (arny) obj;
        if (this.a == arnyVar.a && d.F(this.b, arnyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (this.a * 31) + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
