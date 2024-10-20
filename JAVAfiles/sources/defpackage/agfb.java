package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfb implements agfc {
    private final int a;

    public agfb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agfb) && this.a == ((agfb) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Open(selectedItemCount=" + this.a + ")";
    }
}
