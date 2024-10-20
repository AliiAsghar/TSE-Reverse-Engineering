package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klm extends kmg {
    private final int a;

    public klm(int i) {
        this.a = i;
    }

    @Override // defpackage.kmg
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof kmg) && this.a == ((kmg) obj).a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.bm(i);
        return i ^ 1000003;
    }

    public final String toString() {
        return a.bW(Integer.toString(a.M(this.a)), "EndActivityEvent{status=", "}");
    }
}
