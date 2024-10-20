package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agbz extends agcb {
    private final int a;

    public agbz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agbz) && this.a == ((agbz) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Open(height=" + this.a + ")";
    }
}
