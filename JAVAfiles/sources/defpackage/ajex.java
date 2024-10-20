package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajex {
    final int a;
    public float b;
    public int c;
    public int d;
    public float e;
    public float f;
    public final int g;
    final float h;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ajex(int r3, float r4, float r5, float r6, int r7, float r8, int r9, float r10, int r11, float r12) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajex.<init>(int, float, float, float, int, float, int, float, int, float):void");
    }

    public static ajex b(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        int i = 1;
        ajex ajexVar = null;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = i5;
                    int i7 = length2;
                    int i8 = i3;
                    int i9 = length;
                    ajex ajexVar2 = new ajex(i, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (ajexVar == null || ajexVar2.h < ajexVar.h) {
                        if (ajexVar2.h == brg.a) {
                            return ajexVar2;
                        }
                        ajexVar = ajexVar2;
                    }
                    i++;
                    i5 = i6 + 1;
                    length2 = i7;
                    i3 = i8;
                    length = i9;
                }
                i3++;
            }
        }
        return ajexVar;
    }

    public final int a() {
        return this.c + this.d + this.g;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.a + ", smallCount=" + this.c + ", smallSize=" + this.b + ", mediumCount=" + this.d + ", mediumSize=" + this.e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.h + "]";
    }
}
