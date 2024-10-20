package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erq {
    private final eql a;

    public erq(eql eqlVar) {
        this.a = eqlVar;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.c(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erq)) {
            return false;
        }
        return this.a.equals(((erq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
