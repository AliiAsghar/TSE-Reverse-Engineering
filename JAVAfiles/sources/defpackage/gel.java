package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gel {
    private static final Comparator e = new mm(4);
    final int[] a;
    final int[] b;
    public final List c;
    final nq[] d;
    private final float[] f = new float[3];

    public gel(int[] iArr, nq[] nqVarArr) {
        gek gekVar;
        int i;
        int i2;
        this.d = nqVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int g = g(Color.blue(i4), 8, 5) | (g(Color.red(i4), 8, 5) << 10) | (g(Color.green(i4), 8, 5) << 5);
            iArr[i3] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                eap.j(f(i6), this.f);
                if (h(this.f)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= 24) {
            this.c = new ArrayList();
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = iArr3[i9];
                this.c.add(new gem(f(i10), iArr2[i10]));
            }
            return;
        }
        PriorityQueue<gek> priorityQueue = new PriorityQueue(24, e);
        priorityQueue.offer(new gek(this, 0, this.a.length - 1));
        while (priorityQueue.size() < 24 && (gekVar = (gek) priorityQueue.poll()) != null && gekVar.c()) {
            if (gekVar.c()) {
                int i11 = gekVar.e - gekVar.d;
                int i12 = gekVar.g - gekVar.f;
                int i13 = gekVar.i - gekVar.h;
                if (i11 >= i12 && i11 >= i13) {
                    i = -3;
                } else if (i12 >= i11 && i12 >= i13) {
                    i = -2;
                } else {
                    i = -1;
                }
                gel gelVar = gekVar.j;
                int[] iArr4 = gelVar.a;
                int[] iArr5 = gelVar.b;
                e(iArr4, i, gekVar.a, gekVar.b);
                Arrays.sort(iArr4, gekVar.a, gekVar.b + 1);
                e(iArr4, i, gekVar.a, gekVar.b);
                int i14 = gekVar.c / 2;
                int i15 = gekVar.a;
                int i16 = 0;
                while (true) {
                    int i17 = gekVar.b;
                    if (i15 <= i17) {
                        i16 += iArr5[iArr4[i15]];
                        if (i16 >= i14) {
                            i2 = Math.min(i17 - 1, i15);
                            break;
                        }
                        i15++;
                    } else {
                        i2 = gekVar.a;
                        break;
                    }
                }
                gek gekVar2 = new gek(gekVar.j, i2 + 1, gekVar.b);
                gekVar.b = i2;
                gekVar.b();
                priorityQueue.offer(gekVar2);
                priorityQueue.offer(gekVar);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (gek gekVar3 : priorityQueue) {
            gel gelVar2 = gekVar3.j;
            int[] iArr6 = gelVar2.a;
            int[] iArr7 = gelVar2.b;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            for (int i22 = gekVar3.a; i22 <= gekVar3.b; i22++) {
                int i23 = iArr6[i22];
                int i24 = iArr7[i23];
                i19 += i24;
                i18 += d(i23) * i24;
                i20 += c(i23) * i24;
                i21 += i24 * b(i23);
            }
            float f = i19;
            gem gemVar = new gem(a(Math.round(i18 / f), Math.round(i20 / f), Math.round(i21 / f)), i19);
            if (!h(gemVar.a())) {
                arrayList.add(gemVar);
            }
        }
        this.c = arrayList;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(g(i, 5, 8), g(i2, 5, 8), g(i3, 5, 8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i) {
        return i & 31;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i) {
        return (i >> 5) & 31;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i) {
        return (i >> 10) & 31;
    }

    static void e(int[] iArr, int i, int i2, int i3) {
        if (i != -2) {
            if (i == -1) {
                while (i2 <= i3) {
                    int i4 = iArr[i2];
                    iArr[i2] = d(i4) | (b(i4) << 10) | (c(i4) << 5);
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = b(i5) | (c(i5) << 10) | (d(i5) << 5);
            i2++;
        }
    }

    private static int f(int i) {
        return a(d(i), c(i), b(i));
    }

    private static int g(int i, int i2, int i3) {
        int i4;
        if (i3 > i2) {
            i4 = i << (i3 - i2);
        } else {
            i4 = i >> (i2 - i3);
        }
        return i4 & ((1 << i3) - 1);
    }

    private final boolean h(float[] fArr) {
        int length;
        nq[] nqVarArr = this.d;
        if (nqVarArr != null && (length = nqVarArr.length) > 0) {
            for (int i = 0; i < length; i++) {
                nq nqVar = this.d[i];
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
