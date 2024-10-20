package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akht implements akhs {
    private static final int b(List list, List list2, int i, int i2, int i3, int i4, algj algjVar) {
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 * i4;
            if (!algjVar.d(list.get(i + i6), list2.get(i6 + i2))) {
                return i5;
            }
        }
        return i3;
    }

    private static final void c(List list, List list2, int i, int i2, no noVar) {
        int i3;
        if (i < 0) {
            i3 = list.size() + i;
        } else {
            i3 = i;
        }
        if (i < 0) {
            i += list2.size();
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + i4;
            if (!d.F(list.get(i5), list2.get(i + i4))) {
                noVar.q(i5);
            }
        }
    }

    @Override // defpackage.akhs
    public final void a(List list, List list2, algj algjVar, no noVar) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        List list3 = list;
        List list4 = list2;
        if (Log.isLoggable("TTDataService", 3)) {
            Log.d("TTDataService", "Source Items:      ".concat(list.toString()));
            Log.d("TTDataService", "Destination Items: ".concat(String.valueOf(String.valueOf(list2))));
        }
        int size = list.size();
        int size2 = list2.size();
        int min = Math.min(size, size2);
        int b = b(list, list2, 0, 0, min, 1, algjVar);
        if (b == size && size == size2) {
            c(list3, list4, 0, b, noVar);
            return;
        }
        int b2 = b(list, list2, size - 1, size2 - 1, min - b, -1, algjVar);
        if (Log.isLoggable("TTDataService", 3)) {
            Log.d("TTDataService", a.bV(b, "Start Index:  "));
            Log.d("TTDataService", a.bV(b2, "End Trim:     "));
        }
        int i3 = size - b2;
        int i4 = size2 - b2;
        if (b > Math.min(i3, i4)) {
            noVar.p();
            return;
        }
        c(list3, list4, 0, b, noVar);
        c(list3, list4, -b2, b2, noVar);
        int i5 = i4 - b;
        int[] iArr = new int[Math.min(i3 - b, i5)];
        int[] iArr2 = new int[i5];
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        int i8 = b;
        while (i8 < i3) {
            Object obj = list3.get(i8);
            int i9 = b;
            while (true) {
                if (i9 < i4) {
                    Object obj2 = list4.get(i9);
                    if (algjVar.d(obj, obj2)) {
                        int i10 = i9 - b;
                        i = i3;
                        if (iArr2[i10] == 1) {
                            noVar.p();
                            return;
                        }
                        iArr[i7] = i10;
                        iArr2[i10] = 1;
                        if (i8 != i9) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z3 |= !z2;
                        int i11 = i7 + 1;
                        if (!d.F(obj, obj2)) {
                            noVar.q(i8 - i6);
                        }
                        i2 = i11;
                        z = true;
                    } else {
                        i9++;
                        list4 = list2;
                    }
                } else {
                    i = i3;
                    i2 = i7;
                    z = false;
                    break;
                }
            }
            if (!z) {
                noVar.y(i8 - i6);
                i6++;
            }
            i8++;
            list4 = list2;
            i7 = i2;
            i3 = i;
            list3 = list;
        }
        if (i7 != 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < i5; i13++) {
                if (iArr2[i13] == 1) {
                    iArr2[i13] = i12;
                    i12++;
                } else {
                    iArr2[i13] = -1;
                }
            }
            for (int i14 = 0; i14 < i7; i14++) {
                iArr[i14] = iArr2[iArr[i14]];
            }
            if (i5 - i7 != 0) {
                int i15 = 0;
                for (int i16 = i5 - 1; i16 >= 0; i16--) {
                    if (iArr2[i16] == -1) {
                        i15++;
                        iArr2[i5 - i15] = i16;
                    }
                }
            }
            if (z3) {
                for (int i17 = 0; i17 < i7; i17++) {
                    iArr2[i17] = i17;
                }
                if (Log.isLoggable("TTDataService", 3)) {
                    Log.d("TTDataService", "Async Source Positions:      ".concat(String.valueOf(Arrays.toString(iArr2))));
                    Log.d("TTDataService", "Async Destination Positions: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
                int i18 = i7 - 1;
                int i19 = 0;
                while (i19 < i7) {
                    int i20 = i19 + 1;
                    for (int i21 = i20; i21 < i7; i21++) {
                        int i22 = iArr2[i19];
                        int i23 = iArr2[i21];
                        if (i22 < i23) {
                            iArr2[i21] = i23 - 1;
                        }
                    }
                    for (int i24 = i18; i24 >= 0; i24--) {
                        int i25 = iArr[i18];
                        int i26 = iArr[i24];
                        if (i25 < i26) {
                            iArr[i24] = i26 - 1;
                        }
                    }
                    i18--;
                    i19 = i20;
                }
                int i27 = 0;
                while (i27 < i7) {
                    int i28 = i27 + 1;
                    for (int i29 = i28; i29 < i7; i29++) {
                        int i30 = iArr[i27];
                        int i31 = iArr2[i29];
                        if (i30 > i31) {
                            iArr[i27] = i30 + 1;
                        } else {
                            iArr2[i29] = i31 + 1;
                        }
                    }
                    i27 = i28;
                }
                if (Log.isLoggable("TTDataService", 3)) {
                    Log.d("TTDataService", "Sync Source Positions:      ".concat(String.valueOf(Arrays.toString(iArr2))));
                    Log.d("TTDataService", "Sync Destination Positions: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
                for (int i32 = 0; i32 < i7; i32++) {
                    int i33 = iArr2[i32] + b;
                    int i34 = iArr[i32] + b;
                    if (i33 != i34) {
                        noVar.t(i33, i34);
                    }
                }
            }
            while (i7 < i5) {
                noVar.s(iArr2[i7] + b);
                i7++;
            }
            return;
        }
        noVar.w(b, i5);
    }
}
