package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akek extends akec {
    public final Object a;

    public akek(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof akek) && d.F(this.a, ((akek) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Read(response=" + this.a + ")";
    }
}
