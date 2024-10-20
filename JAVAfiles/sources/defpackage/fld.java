package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fld {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    private fld(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static fld a(euf eufVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        float f;
        try {
            eufVar.K(4);
            int j = (eufVar.j() & 3) + 1;
            if (j != 3) {
                ArrayList arrayList = new ArrayList();
                int j2 = eufVar.j() & 31;
                for (int i9 = 0; i9 < j2; i9++) {
                    arrayList.add(b(eufVar));
                }
                int j3 = eufVar.j();
                for (int i10 = 0; i10 < j3; i10++) {
                    arrayList.add(b(eufVar));
                }
                if (j2 > 0) {
                    euv f2 = euw.f((byte[]) arrayList.get(0), j, ((byte[]) arrayList.get(0)).length);
                    int i11 = f2.e;
                    int i12 = f2.f;
                    int i13 = f2.h + 8;
                    int i14 = f2.i + 8;
                    int i15 = f2.j;
                    int i16 = f2.k;
                    int i17 = f2.l;
                    int i18 = f2.m;
                    float f3 = f2.g;
                    str = etj.c(f2.a, f2.b, f2.c);
                    i7 = i17;
                    i8 = i18;
                    f = f3;
                    i4 = i14;
                    i5 = i15;
                    i6 = i16;
                    i = i11;
                    i2 = i12;
                    i3 = i13;
                } else {
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = -1;
                    i7 = -1;
                    i8 = 16;
                    str = null;
                    f = 1.0f;
                }
                return new fld(arrayList, j, i, i2, i3, i4, i5, i6, i7, i8, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new erm("Error parsing AVC config", e, true, 1);
        }
    }

    private static byte[] b(euf eufVar) {
        int n = eufVar.n();
        int i = eufVar.b;
        eufVar.K(n);
        byte[] bArr = eufVar.a;
        byte[] bArr2 = etj.a;
        byte[] bArr3 = new byte[n + 4];
        System.arraycopy(etj.a, 0, bArr3, 0, 4);
        System.arraycopy(bArr, i, bArr3, 4, n);
        return bArr3;
    }
}
