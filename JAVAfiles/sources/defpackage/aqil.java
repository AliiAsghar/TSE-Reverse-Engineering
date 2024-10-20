package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqil {
    public static volatile aqux a;
    public static volatile aqux b;

    private aqil() {
    }

    public static /* synthetic */ void A(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        x(iArr, iArr2, i, 0, i2);
    }

    public static byte[] B(byte[] bArr, int i) {
        bArr.getClass();
        a(i, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void C(int[] iArr, int i, int i2) {
        iArr.getClass();
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void D(long[] jArr, long j, int i) {
        jArr.getClass();
        Arrays.fill(jArr, 0, i, j);
    }

    public static void H(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static /* synthetic */ String I(Object[] objArr, CharSequence charSequence, int i) {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        charSequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            d.n(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static void J(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static /* synthetic */ void K(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        y(objArr, objArr2, 0, i, i2);
    }

    public static final void L(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            } else {
                throw new IllegalArgumentException(a.bU(i2, i, "startIndex: ", " > endIndex: "));
            }
        }
        throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
    }

    public static final int M(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if ((-2147483639) + i3 > 0) {
            if (i2 <= 2147483639) {
                return 2147483639;
            }
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public static final double N(long j) {
        return j + 0.0d;
    }

    public static final Object O(Throwable th) {
        th.getClass();
        return new armp(th);
    }

    public static final void P(Object obj) {
        if (!(obj instanceof armp)) {
        } else {
            throw ((armp) obj).a;
        }
    }

    public static final void a(int i, int i2) {
        if (i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(a.cl(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        int length = objArr.length;
        if (length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!b((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    if ((obj instanceof armu) && (obj2 instanceof armu)) {
                        throw null;
                    }
                    if ((obj instanceof armz) && (obj2 instanceof armz)) {
                        throw null;
                    }
                    if ((obj instanceof armv) && (obj2 instanceof armv)) {
                        throw null;
                    }
                    if ((obj instanceof armx) && (obj2 instanceof armx)) {
                        throw null;
                    }
                    if (!d.F(obj, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static List c(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void d(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static Object[] e(Object[] objArr, int i, int i2) {
        objArr.getClass();
        a(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static Object[] f(Object[] objArr, Object obj) {
        objArr.getClass();
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        copyOf.getClass();
        return copyOf;
    }

    public static int g(int[] iArr) {
        return iArr.length - 1;
    }

    public static int h(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int i(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static int j(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int k(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (d.F(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Object l(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object m(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Object n(Object[] objArr, int i) {
        objArr.getClass();
        if (i >= 0 && i < objArr.length) {
            return objArr[i];
        }
        return null;
    }

    public static List o(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        H(objArr, arrayList);
        return arrayList;
    }

    public static List p(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return q(objArr);
            }
            return aqjn.y(objArr[0]);
        }
        return arnv.a;
    }

    public static List q(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new arnq(objArr, false));
    }

    public static Set r(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(aqjn.i(length));
                J(objArr, linkedHashSet);
                return linkedHashSet;
            }
            return aqjn.e(objArr[0]);
        }
        return arnx.a;
    }

    public static artb s(int[] iArr) {
        return new artb(0, g(iArr));
    }

    public static boolean t(Object[] objArr, Object obj) {
        if (k(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static void u(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void v(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void w(float[] fArr, float[] fArr2, int i) {
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, 0, fArr2, 0, i);
    }

    public static void x(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void y(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }
}
