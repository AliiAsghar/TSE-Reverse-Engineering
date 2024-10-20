package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vvx extends vvy {
    private final int a;

    public vvx(int i) {
        super(1);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vvx) && this.a == ((vvx) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Success(numUpgraded=" + this.a + ")";
    }
}
