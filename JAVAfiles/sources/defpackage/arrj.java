package defpackage;

import io.grpc.Status;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arrj {
    private static arrj a;

    public arrj() {
    }

    public static Object[] A(Object[] objArr, int i) {
        objArr.getClass();
        Object[] copyOf = Arrays.copyOf(objArr, i);
        copyOf.getClass();
        return copyOf;
    }

    public static synchronized void B() {
        synchronized (arrj.class) {
            if (a == null) {
                a = new arrj(null);
            }
        }
    }

    public static void C() {
        atoi.f().e();
    }

    public static void D() {
        Iterator it = atoi.f().d().iterator();
        while (it.hasNext()) {
            ((aqsc) it.next()).a();
        }
    }

    public static Status E(aqsm aqsmVar) {
        aqsmVar.getClass();
        if (!aqsmVar.i()) {
            return null;
        }
        Throwable c = aqsmVar.c();
        if (c == null) {
            return Status.c.withDescription("io.grpc.Context was cancelled without error");
        }
        if (c instanceof TimeoutException) {
            return Status.f.withDescription(c.getMessage()).d(c);
        }
        Status c2 = Status.c(c);
        if (Status.Code.UNKNOWN.equals(c2.getCode()) && c2.r == c) {
            return Status.c.withDescription("Context cancelled").d(c);
        }
        return c2.d(c);
    }

    public static Iterator a(Object[] objArr) {
        objArr.getClass();
        return new artq(objArr, 1);
    }

    public static int b(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int c(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static String d(Object obj, Object obj2) {
        return a.ce(obj2, obj, "Random range is empty: [", ", ", ").");
    }

    public static arst e(long j) {
        return new arsu((int) j, (int) (j >> 32));
    }

    public static int f(double d) {
        if (!Double.isNaN(d)) {
            if (d > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static int g(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long h(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long i(float f) {
        return arsk.h(f);
    }

    public static Object j(Collection collection, arpe arpeVar) {
        if (collection.isEmpty()) {
            return arnv.a;
        }
        return new asmb((arwl[]) collection.toArray(new arwl[0])).a(arpeVar);
    }

    public static Object k(arwl[] arwlVarArr, arpe arpeVar) {
        return new asmb(arwlVarArr).a(arpeVar);
    }

    public static long l(long j) {
        if (j < 0) {
            return arut.b;
        }
        return arut.a;
    }

    public static long m(long j, long j2, aruv aruvVar) {
        long j3 = j - j2;
        if (((~(j3 ^ j2)) & (j3 ^ j)) < 0) {
            if (aruvVar.compareTo(aruv.c) < 0) {
                long n = n(1L, aruv.c, aruvVar);
                long j4 = (j / n) - (j2 / n);
                long j5 = (j % n) - (j2 % n);
                long j6 = arut.a;
                return arut.i(arsd.p(j4, aruv.c), arsd.p(j5, aruvVar));
            }
            return arut.k(l(j3));
        }
        return arsd.p(j3, aruvVar);
    }

    public static long n(long j, aruv aruvVar, aruv aruvVar2) {
        aruvVar.getClass();
        aruvVar2.getClass();
        return aruvVar2.h.convert(j, aruvVar.h);
    }

    public static long o(long j, aruv aruvVar, aruv aruvVar2) {
        aruvVar.getClass();
        aruvVar2.getClass();
        return aruvVar2.h.convert(j, aruvVar.h);
    }

    public static arpi p(arpi arpiVar, arpi arpiVar2) {
        arpiVar2.getClass();
        if (arpiVar2 == arpj.a) {
            return arpiVar;
        }
        return (arpi) arpiVar2.fold(arpiVar, afup.p);
    }

    public static int q(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int r(int i, int... iArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            i = Math.max(i, iArr[i2]);
        }
        return i;
    }

    public static Object s(Object obj, Object obj2, Comparator comparator) {
        if (comparator.compare(obj, obj2) <= 0) {
            return obj;
        }
        return obj2;
    }

    public static int t(int i) {
        return Integer.highestOneBit(arrn.r(i, 1) * 3);
    }

    public static int u(int i) {
        return Integer.numberOfLeadingZeros(i) + 1;
    }

    public static int v(Object[] objArr, int i, int i2) {
        int i3;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj = objArr[i + i5];
            int i6 = i4 * 31;
            if (obj != null) {
                i3 = obj.hashCode();
            } else {
                i3 = 0;
            }
            i4 = i6 + i3;
        }
        return i4;
    }

    public static String w(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void x(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static void y(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            x(objArr, i);
            i++;
        }
    }

    public static boolean z(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!d.F(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public arrj(byte[] bArr, byte[] bArr2) {
    }

    public arrj(char[] cArr) {
        new HashSet();
    }
}
