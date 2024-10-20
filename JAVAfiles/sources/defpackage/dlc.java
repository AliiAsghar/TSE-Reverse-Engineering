package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlc {
    public static final int a(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return 3;
            }
        } else if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    public static final int b(dlx dlxVar, int i) {
        boolean z;
        if (dlxVar.compareTo(dlx.c) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return a(z, a.bA(i, 1));
    }
}
