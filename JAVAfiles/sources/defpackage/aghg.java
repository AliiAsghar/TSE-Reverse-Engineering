package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghg implements aghk {
    public final int a;

    public aghg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aghg) && this.a == ((aghg) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Error(errorMessage=" + this.a + ")";
    }
}
