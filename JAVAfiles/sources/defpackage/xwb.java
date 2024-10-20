package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class xwb<T, V> {
    public final Object a;

    public xwb(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((xwb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xwb(String str) {
        this((Object) str);
        str.getClass();
    }
}
