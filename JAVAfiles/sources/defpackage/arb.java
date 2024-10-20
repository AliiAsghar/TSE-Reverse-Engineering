package defpackage;

import defpackage.ara;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arb {
    public static final int a(cbh cbhVar, int i) {
        int i2 = cbhVar.b - 1;
        int i3 = 0;
        while (i3 < i2) {
            Object[] objArr = cbhVar.a;
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = ((ara.a) objArr[i4]).a;
            if (i5 == i) {
                return i4;
            }
            if (i5 < i) {
                i3 = i4 + 1;
                if (i < ((ara.a) objArr[i3]).a) {
                    return i4;
                }
            } else {
                i2 = i4 - 1;
            }
        }
        return i3;
    }
}
