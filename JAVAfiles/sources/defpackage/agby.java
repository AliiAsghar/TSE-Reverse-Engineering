package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agby extends agcb {
    private final int a;

    public agby(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agby) && this.a == ((agby) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Closing(currentHeight=" + this.a + ")";
    }
}
