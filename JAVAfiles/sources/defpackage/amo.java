package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v25 */
    public static final cuf a(amn amnVar, int i, int i2, int i3, int i4, int i5, cuh cuhVar, List list, cvc[] cvcVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        int i11;
        long j;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ?? r2;
        int i18 = i3;
        int i19 = i4;
        List list2 = list;
        int i20 = i7;
        int i21 = i20 - i6;
        int[] iArr2 = new int[i21];
        float f = brg.a;
        int i22 = i6;
        float f2 = 0.0f;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i22 < i20) {
            cuc cucVar = (cuc) list2.get(i22);
            float a = amm.a(amm.b(cucVar));
            if (a > f) {
                f2 += a;
                i23++;
                i15 = i21;
            } else {
                int i27 = i18 - i24;
                if (i19 == Integer.MAX_VALUE) {
                    i14 = Integer.MAX_VALUE;
                } else {
                    i14 = i19;
                }
                cvc cvcVar = cvcVarArr[i22];
                if (cvcVar == null) {
                    if (i18 == Integer.MAX_VALUE) {
                        i15 = i21;
                        i17 = i14;
                        r2 = 0;
                        i16 = Integer.MAX_VALUE;
                    } else {
                        i15 = i21;
                        if (i27 < 0) {
                            i17 = i14;
                            r2 = 0;
                            i16 = 0;
                        } else {
                            i16 = i27;
                            i17 = i14;
                            r2 = 0;
                        }
                    }
                    cvcVar = cucVar.e(amnVar.i(r2, i16, i17, r2));
                } else {
                    i15 = i21;
                }
                cvc cvcVar2 = cvcVar;
                int g = amnVar.g(cvcVar2);
                int f3 = amnVar.f(cvcVar2);
                iArr2[i22 - i6] = g;
                int i28 = i27 - g;
                if (i28 < 0) {
                    i28 = 0;
                }
                i25 = Math.min(i5, i28);
                i24 += g + i25;
                i26 = Math.max(i26, f3);
                cvcVarArr[i22] = cvcVar2;
            }
            i22++;
            i19 = i4;
            list2 = list;
            i21 = i15;
            f = brg.a;
        }
        int i29 = i21;
        if (i23 == 0) {
            i24 -= i25;
            i9 = 0;
        } else {
            int i30 = i18 - i24;
            long j2 = i5;
            if (i18 == Integer.MAX_VALUE) {
                i18 = i;
            }
            long j3 = j2 * (i23 - 1);
            long j4 = (i18 - i24) - j3;
            if (j4 < 0) {
                j4 = 0;
            }
            float f4 = ((float) j4) / f2;
            for (int i31 = i6; i31 < i20; i31++) {
                j4 -= Math.round(amm.a(amm.b((cuc) list.get(i31))) * f4);
            }
            List list3 = list;
            int i32 = i6;
            int i33 = 0;
            while (i32 < i20) {
                if (cvcVarArr[i32] == null) {
                    cuc cucVar2 = (cuc) list3.get(i32);
                    amp b = amm.b(cucVar2);
                    float a2 = amm.a(b);
                    if (i4 == Integer.MAX_VALUE) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = i4;
                    }
                    if (a2 <= brg.a) {
                        ann.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j4);
                    i11 = i30;
                    j = j3;
                    j4 -= signum;
                    int max = Math.max(0, Math.round(a2 * f4) + signum);
                    if ((b == null || b.b) && max != Integer.MAX_VALUE) {
                        i13 = max;
                        cvc e = cucVar2.e(amnVar.i(i13, max, i12, true));
                        int g2 = amnVar.g(e);
                        int f5 = amnVar.f(e);
                        iArr2[i32 - i6] = g2;
                        i33 += g2;
                        i26 = Math.max(i26, f5);
                        cvcVarArr[i32] = e;
                    }
                    i13 = 0;
                    cvc e2 = cucVar2.e(amnVar.i(i13, max, i12, true));
                    int g22 = amnVar.g(e2);
                    int f52 = amnVar.f(e2);
                    iArr2[i32 - i6] = g22;
                    i33 += g22;
                    i26 = Math.max(i26, f52);
                    cvcVarArr[i32] = e2;
                } else {
                    i11 = i30;
                    j = j3;
                }
                i32++;
                list3 = list;
                i20 = i7;
                i30 = i11;
                j3 = j;
            }
            int i34 = i30;
            int i35 = (int) (i33 + j3);
            if (i35 < 0) {
                i10 = i34;
                i9 = 0;
            } else {
                i9 = i35;
                i10 = i34;
            }
            if (i9 > i10) {
                i9 = i10;
            }
        }
        int i36 = i9 + i24;
        if (i36 < 0) {
            i36 = 0;
        }
        int max2 = Math.max(i36, i);
        int max3 = Math.max(i26, Math.max(i2, 0));
        int[] iArr3 = new int[i29];
        amnVar.h(max2, iArr2, iArr3, cuhVar);
        return amnVar.j(cvcVarArr, cuhVar, iArr3, max2, max3, iArr, i8, i6, i7);
    }
}
