package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aews {
    public final int a;

    public aews(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aews) && this.a == ((aews) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Static(resId=" + this.a + ")";
    }
}
