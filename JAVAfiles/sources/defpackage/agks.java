package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agks {
    public static int a(int i, boolean z, boolean z2) {
        int i2 = (i + i) | (z ? 1 : 0);
        return (i2 + i2) | (z2 ? 1 : 0);
    }

    public static final int b(int i) {
        return i >> 2;
    }

    public static final boolean c(int i) {
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean d(int i) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int e(int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = b(i);
        }
        if ((i3 & 2) != 0) {
            z = d(i);
        }
        if ((i3 & 4) != 0) {
            z2 = c(i);
        }
        return a(i2, z, z2);
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
