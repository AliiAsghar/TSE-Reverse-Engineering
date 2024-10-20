package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvg {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b2 : bArr) {
            char[] cArr2 = b;
            cArr[i] = cArr2[(b2 & 255) >>> 4];
            cArr[i + 1] = cArr2[b2 & 15];
            i += 2;
        }
        return new String(cArr);
    }
}
