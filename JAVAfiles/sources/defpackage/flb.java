package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flb {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3;
        if (i >= 0 && i < 3 && i2 >= 0 && (i3 = i2 >> 1) < 19) {
            int i4 = b[i];
            if (i4 == 44100) {
                int i5 = f[i3] + (i2 & 1);
                return i5 + i5;
            }
            int i6 = e[i3];
            if (i4 == 32000) {
                return i6 * 6;
            }
            return i6 * 4;
        }
        return -1;
    }
}
