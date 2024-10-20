package defpackage;

import defpackage.dob;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bao {
    public static final dob a = new ban(dob.a.a, 0, 0);

    public static final dow a(doy doyVar, dhv dhvVar) {
        dow a2 = doyVar.a(dhvVar);
        dhv dhvVar2 = a2.a;
        int a3 = dhvVar.a();
        int a4 = dhvVar2.a();
        int min = Math.min(a3, 100);
        for (int i = 0; i < min; i++) {
            b(a2.b.a(i), a4, i);
        }
        b(a2.b.a(a3), a4, a3);
        int min2 = Math.min(a4, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            c(a2.b.b(i2), a3, i2);
        }
        c(a2.b.b(a4), a3, a4);
        return new dow(a2.a, new ban(a2.b, dhvVar.a(), a2.a.a()));
    }

    public static final void b(int i, int i2, int i3) {
        if (i >= 0 && i <= i2) {
            return;
        }
        aju.d("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + ']');
    }

    public static final void c(int i, int i2, int i3) {
        if (i >= 0 && i <= i2) {
            return;
        }
        aju.d("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + ']');
    }
}
