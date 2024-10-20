package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Icon a(Notification notification) {
        return notification.getLargeIcon();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Icon b(Notification notification) {
        return notification.getSmallIcon();
    }

    public static int c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static final eoz d(arml armlVar) {
        return (eoz) armlVar.a();
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] f(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }
}
