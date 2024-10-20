package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asck {
    public static final asfn a = new asfn("NO_VALUE");

    public static final Object a(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final asai c(ascg ascgVar, arpi arpiVar, int i, int i2) {
        if ((i == 0 || i == -3) && i2 == 1) {
            return ascgVar;
        }
        return new asdl(ascgVar, arpiVar, i, i2);
    }

    public static final ascc d(int i, int i2, int i3) {
        if (i2 >= 0) {
            if (i <= 0 && i2 <= 0 && i3 != 1) {
                Objects.toString(arwi.p(i3));
                throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(arwi.p(i3)));
            }
            int i4 = i2 + i;
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            return new ascj(i, i4, i3);
        }
        throw new IllegalArgumentException(a.bV(i2, "extraBufferCapacity cannot be negative, but was "));
    }

    public static /* synthetic */ ascc e(int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return d(i & ((i4 & 1) ^ 1), i2, i3);
    }
}
