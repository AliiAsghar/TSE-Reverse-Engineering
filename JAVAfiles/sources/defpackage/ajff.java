package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajff {
    public float a;
    public float b;

    public static float a(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            iArr2[i] = i2 + i2;
        }
        return iArr2;
    }
}
