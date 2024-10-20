package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asxo {
    public final int a;

    public asxo(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof asxo) || ((asxo) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
