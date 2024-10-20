package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dut {
    int[] a = new int[10];
    int[] b = new int[10];
    int c = 0;
    int[] d = new int[10];
    float[] e = new float[10];
    int f = 0;
    int[] g = new int[5];
    String[] h = new String[5];
    int i = 0;

    public final void a(int i, float f) {
        int i2 = this.f;
        int[] iArr = this.d;
        int length = iArr.length;
        if (i2 >= length) {
            this.d = Arrays.copyOf(iArr, length + length);
            float[] fArr = this.e;
            int length2 = fArr.length;
            this.e = Arrays.copyOf(fArr, length2 + length2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i3 >= length) {
            this.a = Arrays.copyOf(iArr, length + length);
            int[] iArr2 = this.b;
            int length2 = iArr2.length;
            this.b = Arrays.copyOf(iArr2, length2 + length2);
        }
        int[] iArr3 = this.a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        int length = iArr.length;
        if (i2 >= length) {
            this.g = Arrays.copyOf(iArr, length + length);
            String[] strArr = this.h;
            int length2 = strArr.length;
            this.h = (String[]) Arrays.copyOf(strArr, length2 + length2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public final String toString() {
        return "TypedBundle{mCountInt=" + this.c + ", mCountFloat=" + this.f + ", mCountString=" + this.i + ", mCountBoolean=0}";
    }
}
