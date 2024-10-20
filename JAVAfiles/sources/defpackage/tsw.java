package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class tsw extends tsx {
    static final tsw a = new tsw();

    private tsw() {
    }

    @Override // defpackage.tvf
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "ResultOrSkipped{skipped}";
    }
}
