package defpackage;

import java.util.Arrays;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class assc {
    public static final Byte[] a = new Byte[0];

    public static Byte[] a(final byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length == 0) {
            return a;
        }
        Byte[] bArr2 = new Byte[length];
        Arrays.setAll(bArr2, new IntFunction() { // from class: assb
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return Byte.valueOf(bArr[i]);
            }
        });
        return bArr2;
    }
}
