package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agkm {
    public static final int[] a;

    static {
        "ranchu".equals(Build.HARDWARE);
        a = new int[]{19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            int[] iArr = a;
            int length = iArr.length;
            i2 = 10;
            if (i3 >= 10) {
                break;
            }
            i2 = i3 + 1;
            if (i >= iArr[i3]) {
                break;
            }
            i3 = i2;
        }
        return i2;
    }
}
