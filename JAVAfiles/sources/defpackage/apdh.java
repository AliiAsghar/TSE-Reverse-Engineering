package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apdh {
    static final int a = c(1, 3);
    static final int b = c(1, 4);
    static final int c = c(2, 0);
    static final int d = c(3, 2);

    public static int a(int i) {
        return i >>> 3;
    }

    public static int b(int i) {
        return i & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, int i2) {
        return (i << 3) | i2;
    }
}
