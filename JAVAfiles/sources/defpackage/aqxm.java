package defpackage;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqxm {
    private static final int a;
    private static final Queue b;

    static {
        int max = Math.max(16384, 8192);
        a = max;
        b = new LinkedBlockingQueue(131072 / max);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(byte[] bArr) {
        if (bArr.length == a) {
            b.offer(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b() {
        return c(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(int i) {
        byte[] bArr;
        if (i == a && (bArr = (byte[]) b.poll()) != null) {
            return bArr;
        }
        return new byte[i];
    }
}
