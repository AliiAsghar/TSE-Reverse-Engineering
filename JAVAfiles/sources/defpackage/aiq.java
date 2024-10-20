package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiq {
    public static final float a(cqq cqqVar, boolean z) {
        long d;
        long j;
        long j2;
        List list = cqqVar.a;
        int size = list.size();
        long j3 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            crc crcVar = (crc) list.get(i2);
            if (crcVar.d && crcVar.h) {
                if (z) {
                    j2 = crcVar.c;
                } else {
                    j2 = crcVar.g;
                }
                j3 = d.aH(j3, j2);
                i++;
            }
        }
        if (i == 0) {
            d = 9205357640488583168L;
        } else {
            d = cjn.d(j3, i);
        }
        boolean bB = a.bB(d, 9205357640488583168L);
        float f = brg.a;
        if (bB) {
            return brg.a;
        }
        List list2 = cqqVar.a;
        int size2 = list2.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            crc crcVar2 = (crc) list2.get(i4);
            if (crcVar2.d && crcVar2.h) {
                if (z) {
                    j = crcVar2.c;
                } else {
                    j = crcVar2.g;
                }
                f += cjn.a(a.Q(j, d));
                i3++;
            }
        }
        return f / i3;
    }
}
