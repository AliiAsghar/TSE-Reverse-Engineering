package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csc {
    public static final float a(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = brg.a;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void b(csb csbVar, crc crcVar) {
        if (cqr.e(crcVar)) {
            csbVar.b();
        }
        if (!cqr.g(crcVar)) {
            List a = crcVar.a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                cqi cqiVar = (cqi) a.get(i);
                csbVar.a(cqiVar.a, cqiVar.c);
            }
            csbVar.a(crcVar.b, crcVar.k);
        }
        if (cqr.g(crcVar) && crcVar.b - csbVar.c > 40) {
            csbVar.b();
        }
        csbVar.c = crcVar.b;
    }
}
