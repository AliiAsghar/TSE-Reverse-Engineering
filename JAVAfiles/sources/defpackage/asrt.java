package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrt {
    public static final byte[] a = aotl.O("0123456789abcdef");

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r1 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int a(defpackage.asqu r16, defpackage.asrf r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asrt.a(asqu, asrf, boolean):int");
    }

    public static final String b(asqu asquVar, long j) {
        if (j > 0) {
            long j2 = (-1) + j;
            if (asquVar.c(j2) == 13) {
                String n = asquVar.n(j2);
                asquVar.B(2L);
                return n;
            }
        }
        String n2 = asquVar.n(j);
        asquVar.B(1L);
        return n2;
    }

    public static final boolean c(asrl asrlVar, int i, byte[] bArr, int i2) {
        asrlVar.getClass();
        bArr.getClass();
        byte[] bArr2 = asrlVar.a;
        int i3 = asrlVar.c;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                asrlVar = asrlVar.f;
                asrlVar.getClass();
                byte[] bArr3 = asrlVar.a;
                int i5 = asrlVar.b;
                i3 = asrlVar.c;
                bArr2 = bArr3;
                i = i5;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
