package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class age {
    public static final int a(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            return c(i2, i3, z);
        }
        boolean z2 = !z;
        if (d(i, i2, i3, z2)) {
            return b(i, i2, z);
        }
        if (d(i, i2, i3, z)) {
            return b(i, i2, z2);
        }
        return c(i2, i3, z2);
    }

    private static final int b(int i, int i2, boolean z) {
        if (z) {
            return i;
        }
        return i - i2;
    }

    private static final int c(int i, int i2, boolean z) {
        if (z) {
            return 0;
        }
        return i2 - i;
    }

    private static final boolean d(int i, int i2, int i3, boolean z) {
        if (z) {
            if (i2 <= i) {
                return true;
            }
            return false;
        }
        if (i3 - i2 > i) {
            return true;
        }
        return false;
    }
}
