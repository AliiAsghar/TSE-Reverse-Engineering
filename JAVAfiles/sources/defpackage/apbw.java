package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apbw<T> implements apcj<T> {
    public static final int[] a = new int[0];
    public static final Unsafe b = apdb.j();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final apbt g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final apcv m;

    public apbw(int[] iArr, Object[] objArr, int i, int i2, apbt apbtVar, int[] iArr2, int i3, int i4, apcv apcvVar, aoue aoueVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = apbtVar instanceof apag;
        boolean z = false;
        if (aoueVar != null && (apbtVar instanceof apab)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = apcvVar;
        this.g = apbtVar;
    }

    private final Object A(Object obj, int i, Object obj2, apcv apcvVar, Object obj3) {
        int p = p(i);
        Object h = apdb.h(obj, w(v(i)));
        if (h == null) {
            return obj2;
        }
        apam y = y(i);
        if (y == null) {
            return obj2;
        }
        atii i2 = aove.i(B(i));
        Iterator it = ((apbo) h).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!y.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = apcvVar.b(obj3);
                }
                int L = aojh.L(i2, entry.getKey(), entry.getValue());
                aozb aozbVar = aozb.b;
                byte[] bArr = new byte[L];
                aozl ag = aozl.ag(bArr);
                try {
                    aojh.M(ag, i2, entry.getKey(), entry.getValue());
                    apcvVar.c(obj2, p, aowt.a(ag, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private final Object B(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object C(Object obj, int i) {
        apcj z = z(i);
        long w = w(v(i));
        if (!N(obj, i)) {
            return z.e();
        }
        Object object = b.getObject(obj, w);
        if (Q(object)) {
            return object;
        }
        Object e = z.e();
        if (object != null) {
            z.h(e, object);
        }
        return e;
    }

    private final Object D(Object obj, int i, int i2) {
        apcj z = z(i2);
        if (!R(obj, i, i2)) {
            return z.e();
        }
        Object object = b.getObject(obj, w(v(i2)));
        if (Q(object)) {
            return object;
        }
        Object e = z.e();
        if (object != null) {
            z.h(e, object);
        }
        return e;
    }

    private static void E(Object obj) {
        if (Q(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void F(Object obj, Object obj2, int i) {
        if (!N(obj2, i)) {
            return;
        }
        long w = w(v(i));
        Unsafe unsafe = b;
        Object object = unsafe.getObject(obj2, w);
        if (object != null) {
            apcj z = z(i);
            if (!N(obj, i)) {
                if (!Q(object)) {
                    unsafe.putObject(obj, w, object);
                } else {
                    Object e = z.e();
                    z.h(e, object);
                    unsafe.putObject(obj, w, e);
                }
                H(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, w);
            if (!Q(object2)) {
                Object e2 = z.e();
                z.h(e2, object2);
                unsafe.putObject(obj, w, e2);
                object2 = e2;
            }
            z.h(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
    }

    private final void G(Object obj, Object obj2, int i) {
        int p = p(i);
        if (!R(obj2, p, i)) {
            return;
        }
        long w = w(v(i));
        Unsafe unsafe = b;
        Object object = unsafe.getObject(obj2, w);
        if (object != null) {
            apcj z = z(i);
            if (!R(obj, p, i)) {
                if (!Q(object)) {
                    unsafe.putObject(obj, w, object);
                } else {
                    Object e = z.e();
                    z.h(e, object);
                    unsafe.putObject(obj, w, e);
                }
                I(obj, p, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, w);
            if (!Q(object2)) {
                Object e2 = z.e();
                z.h(e2, object2);
                unsafe.putObject(obj, w, e2);
                object2 = e2;
            }
            z.h(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
    }

    private final void H(Object obj, int i) {
        int s = s(i);
        long j = 1048575 & s;
        if (j == 1048575) {
            return;
        }
        apdb.s(obj, j, (1 << (s >>> 20)) | apdb.d(obj, j));
    }

    private final void I(Object obj, int i, int i2) {
        apdb.s(obj, s(i2) & 1048575, i);
    }

    private final void J(Object obj, int i, Object obj2) {
        b.putObject(obj, w(v(i)), obj2);
        H(obj, i);
    }

    private final void K(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, w(v(i2)), obj2);
        I(obj, i, i2);
    }

    private final boolean L(Object obj, Object obj2, int i) {
        if (N(obj, i) == N(obj2, i)) {
            return true;
        }
        return false;
    }

    private static boolean M(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private final boolean N(Object obj, int i) {
        int s = s(i);
        long j = 1048575 & s;
        if (j == 1048575) {
            int v = v(i);
            long w = w(v);
            switch (u(v)) {
                case 0:
                    if (Double.doubleToRawLongBits(apdb.b(obj, w)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(apdb.c(obj, w)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (apdb.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (apdb.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (apdb.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (apdb.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (apdb.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return apdb.w(obj, w);
                case 8:
                    Object h = apdb.h(obj, w);
                    if (h instanceof String) {
                        if (((String) h).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (h instanceof aozb) {
                        if (aozb.b.equals(h)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (apdb.h(obj, w) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (aozb.b.equals(apdb.h(obj, w))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (apdb.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (apdb.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (apdb.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (apdb.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (apdb.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (apdb.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (apdb.h(obj, w) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((apdb.d(obj, j) & (1 << (s >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean O(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return N(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean P(Object obj, int i, apcj apcjVar) {
        return apcjVar.k(apdb.h(obj, w(i)));
    }

    private static boolean Q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof apag) {
            return ((apag) obj).isMutable();
        }
        return true;
    }

    private final boolean R(Object obj, int i, int i2) {
        if (apdb.d(obj, s(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean S(Object obj, long j) {
        return ((Boolean) apdb.h(obj, j)).booleanValue();
    }

    private final void T(Object obj, int i, aozh aozhVar) {
        if (M(i)) {
            apdb.u(obj, w(i), aozhVar.v());
        } else if (this.i) {
            apdb.u(obj, w(i), aozhVar.u());
        } else {
            apdb.u(obj, w(i), aozhVar.o());
        }
    }

    private static final int U(byte[] bArr, int i, int i2, apdf apdfVar, Class cls, aoyp aoypVar) {
        int i3;
        boolean z;
        apdf apdfVar2 = apdf.DOUBLE;
        switch (apdfVar) {
            case DOUBLE:
                i3 = i + 8;
                aoypVar.c = Double.valueOf(aoyq.a(bArr, i));
                break;
            case FLOAT:
                i3 = i + 4;
                aoypVar.c = Float.valueOf(aoyq.b(bArr, i));
                break;
            case INT64:
            case UINT64:
                int w = aoyq.w(bArr, i, aoypVar);
                aoypVar.c = Long.valueOf(aoypVar.b);
                return w;
            case INT32:
            case UINT32:
            case ENUM:
                int t = aoyq.t(bArr, i, aoypVar);
                aoypVar.c = Integer.valueOf(aoypVar.a);
                return t;
            case FIXED64:
            case SFIXED64:
                i3 = i + 8;
                aoypVar.c = Long.valueOf(aoyq.A(bArr, i));
                break;
            case FIXED32:
            case SFIXED32:
                i3 = i + 4;
                aoypVar.c = Integer.valueOf(aoyq.d(bArr, i));
                break;
            case BOOL:
                int w2 = aoyq.w(bArr, i, aoypVar);
                if (aoypVar.b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                aoypVar.c = Boolean.valueOf(z);
                return w2;
            case STRING:
                return aoyq.r(bArr, i, aoypVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return aoyq.f(apcc.a.a(cls), bArr, i, i2, aoypVar);
            case BYTES:
                return aoyq.c(bArr, i, aoypVar);
            case SINT32:
                int t2 = aoyq.t(bArr, i, aoypVar);
                aoypVar.c = Integer.valueOf(aozg.H(aoypVar.a));
                return t2;
            case SINT64:
                int w3 = aoyq.w(bArr, i, aoypVar);
                aoypVar.c = Long.valueOf(aozg.I(aoypVar.b));
                return w3;
        }
        return i3;
    }

    private static final void V(int i, Object obj, aojj aojjVar) {
        if (obj instanceof String) {
            aojjVar.t(i, (String) obj);
        } else {
            aojjVar.e(i, (aozb) obj);
        }
    }

    static apcw d(Object obj) {
        apag apagVar = (apag) obj;
        apcw apcwVar = apagVar.unknownFields;
        if (apcwVar == apcw.a) {
            apcw apcwVar2 = new apcw();
            apagVar.unknownFields = apcwVar2;
            return apcwVar2;
        }
        return apcwVar;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static double n(Object obj, long j) {
        return ((Double) apdb.h(obj, j)).doubleValue();
    }

    private static float o(Object obj, long j) {
        return ((Float) apdb.h(obj, j)).floatValue();
    }

    private final int p(int i) {
        return this.c[i];
    }

    private static int q(Object obj, long j) {
        return ((Integer) apdb.h(obj, j)).intValue();
    }

    private final int r(int i) {
        if (i >= this.e && i <= this.f) {
            return t(i, 0);
        }
        return -1;
    }

    private final int s(int i) {
        return this.c[i + 2];
    }

    private final int t(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int p = p(i4);
            if (i == p) {
                return i4;
            }
            if (i < p) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int u(int i) {
        return (i >>> 20) & 255;
    }

    private final int v(int i) {
        return this.c[i + 1];
    }

    private static long w(int i) {
        return i & 1048575;
    }

    private static long x(Object obj, long j) {
        return ((Long) apdb.h(obj, j)).longValue();
    }

    private final apam y(int i) {
        int i2 = i / 3;
        return (apam) this.d[i2 + i2 + 1];
    }

    private final apcj z(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        apcj apcjVar = (apcj) objArr[i3];
        if (apcjVar != null) {
            return apcjVar;
        }
        apcj a2 = apcc.a.a((Class) objArr[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0051. Please report as an issue. */
    @Override // defpackage.apcj
    public final int a(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int at;
        int k;
        int m;
        int size;
        int size2;
        int m2;
        int Z;
        int Z2;
        int Y;
        int Y2;
        int Z3;
        int R;
        int i5;
        int Z4;
        int ab;
        int i6;
        int i7;
        Unsafe unsafe = b;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.c.length) {
            int v = v(i11);
            int u = u(v);
            int p = p(i11);
            int i13 = this.c[i11 + 2];
            int i14 = i13 & i8;
            if (u <= 17) {
                if (i14 != i9) {
                    if (i14 == i8) {
                        i7 = 0;
                    } else {
                        i7 = unsafe.getInt(obj, i14);
                    }
                    i10 = i7;
                    i9 = i14;
                }
                i = i9;
                i2 = i10;
                i3 = 1 << (i13 >>> 20);
            } else {
                i = i9;
                i2 = i10;
                i3 = 0;
            }
            long w = w(v);
            if (u >= aozv.DOUBLE_LIST_PACKED.Z) {
                int i15 = aozv.SINT64_LIST_PACKED.Z;
            }
            switch (u) {
                case 0:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.at(p);
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.aw(p);
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.M(p, unsafe.getLong(obj, w));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.ac(p, unsafe.getLong(obj, w));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.K(p, unsafe.getInt(obj, w));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.av(p);
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.au(p);
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.as(p);
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    int i16 = i11;
                    i4 = i16;
                    if (O(obj, i16, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, w);
                        if (object instanceof aozb) {
                            at = aozl.G(p, (aozb) object);
                        } else {
                            at = aozl.X(p, (String) object);
                        }
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = apck.c(p, unsafe.getObject(obj, w), z(i4));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.G(p, (aozb) unsafe.getObject(obj, w));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.aa(p, unsafe.getInt(obj, w));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.I(p, unsafe.getInt(obj, w));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.ax(p);
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.ay(p);
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i4 = i11;
                    if (O(obj, i4, i, i2, i3)) {
                        at = aozl.T(p, unsafe.getInt(obj, w));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int i17 = i11;
                    i4 = i17;
                    if (O(obj, i17, i, i2, i3)) {
                        at = aozl.V(p, unsafe.getLong(obj, w));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i4 = i11;
                    if (O(obj, i11, i, i2, i3)) {
                        at = aozl.J(p, (apbt) unsafe.getObject(obj, w), z(i4));
                        i12 += at;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    k = apck.k(p, (List) unsafe.getObject(obj, w));
                    i12 += k;
                    i4 = i11;
                    break;
                case 19:
                    k = apck.j(p, (List) unsafe.getObject(obj, w));
                    i12 += k;
                    i4 = i11;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, w);
                    apcv apcvVar = apck.a;
                    if (list.size() != 0) {
                        m = apck.m(list);
                        size = list.size() * aozl.Z(p);
                        i5 = m + size;
                        i12 += i5;
                        i4 = i11;
                        break;
                    }
                    i5 = 0;
                    i12 += i5;
                    i4 = i11;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar2 = apck.a;
                    size2 = list2.size();
                    if (size2 != 0) {
                        m2 = apck.m(list2);
                        Z = aozl.Z(p);
                        k = m2 + (size2 * Z);
                        i12 += k;
                        i4 = i11;
                        break;
                    }
                    k = 0;
                    i12 += k;
                    i4 = i11;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar3 = apck.a;
                    size2 = list3.size();
                    if (size2 != 0) {
                        m2 = apck.l(list3);
                        Z = aozl.Z(p);
                        k = m2 + (size2 * Z);
                        i12 += k;
                        i4 = i11;
                        break;
                    }
                    k = 0;
                    i12 += k;
                    i4 = i11;
                case 23:
                    k = apck.k(p, (List) unsafe.getObject(obj, w));
                    i12 += k;
                    i4 = i11;
                    break;
                case 24:
                    k = apck.j(p, (List) unsafe.getObject(obj, w));
                    i12 += k;
                    i4 = i11;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar4 = apck.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        k = size3 * aozl.as(p);
                        i12 += k;
                        i4 = i11;
                        break;
                    }
                    k = 0;
                    i12 += k;
                    i4 = i11;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar5 = apck.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        Z2 = aozl.Z(p) * size4;
                        if (list5 instanceof apbh) {
                            apbh apbhVar = (apbh) list5;
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object c = apbhVar.c();
                                if (c instanceof aozb) {
                                    Y2 = aozl.H((aozb) c);
                                } else {
                                    Y2 = aozl.Y((String) c);
                                }
                                Z2 += Y2;
                            }
                        } else {
                            for (int i19 = 0; i19 < size4; i19++) {
                                Object obj2 = list5.get(i19);
                                if (obj2 instanceof aozb) {
                                    Y = aozl.H((aozb) obj2);
                                } else {
                                    Y = aozl.Y((String) obj2);
                                }
                                Z2 += Y;
                            }
                        }
                        i12 += Z2;
                        i4 = i11;
                        break;
                    }
                    Z2 = 0;
                    i12 += Z2;
                    i4 = i11;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, w);
                    apcj z = z(i11);
                    apcv apcvVar6 = apck.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        Z3 = 0;
                    } else {
                        Z3 = aozl.Z(p) * size5;
                        for (int i20 = 0; i20 < size5; i20++) {
                            Object obj3 = list6.get(i20);
                            if (obj3 instanceof apbg) {
                                R = aozl.O((apbg) obj3);
                            } else {
                                R = aozl.R((apbt) obj3, z);
                            }
                            Z3 += R;
                        }
                    }
                    i12 += Z3;
                    i4 = i11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar7 = apck.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        i5 = size6 * aozl.Z(p);
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            i5 += aozl.H((aozb) list7.get(i21));
                        }
                        i12 += i5;
                        i4 = i11;
                        break;
                    }
                    i5 = 0;
                    i12 += i5;
                    i4 = i11;
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                    List list8 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar8 = apck.a;
                    size2 = list8.size();
                    if (size2 != 0) {
                        m2 = apck.f(list8);
                        Z = aozl.Z(p);
                        k = m2 + (size2 * Z);
                        i12 += k;
                        i4 = i11;
                        break;
                    }
                    k = 0;
                    i12 += k;
                    i4 = i11;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar9 = apck.a;
                    size2 = list9.size();
                    if (size2 != 0) {
                        m2 = apck.l(list9);
                        Z = aozl.Z(p);
                        k = m2 + (size2 * Z);
                        i12 += k;
                        i4 = i11;
                        break;
                    }
                    k = 0;
                    i12 += k;
                    i4 = i11;
                case 31:
                    k = apck.j(p, (List) unsafe.getObject(obj, w));
                    i12 += k;
                    i4 = i11;
                    break;
                case 32:
                    k = apck.k(p, (List) unsafe.getObject(obj, w));
                    i12 += k;
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                    List list10 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar10 = apck.a;
                    size2 = list10.size();
                    if (size2 != 0) {
                        m2 = apck.d(list10);
                        Z = aozl.Z(p);
                        k = m2 + (size2 * Z);
                        i12 += k;
                        i4 = i11;
                        break;
                    }
                    k = 0;
                    i12 += k;
                    i4 = i11;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                    List list11 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar11 = apck.a;
                    size2 = list11.size();
                    if (size2 != 0) {
                        m2 = apck.e(list11);
                        Z = aozl.Z(p);
                        k = m2 + (size2 * Z);
                        i12 += k;
                        i4 = i11;
                        break;
                    }
                    k = 0;
                    i12 += k;
                    i4 = i11;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                    size = apck.b((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                    size = apck.a((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                    size = apck.m((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                    size = apck.m((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case 39:
                    size = apck.l((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                    size = apck.b((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                    size = apck.a((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, w);
                    apcv apcvVar12 = apck.a;
                    size = list12.size();
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                    size = apck.f((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                    size = apck.l((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                    size = apck.a((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                    size = apck.b((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                    size = apck.d((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case 48:
                    size = apck.e((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Z4 = aozl.Z(p);
                        ab = aozl.ab(size);
                        m = Z4 + ab;
                        i5 = m + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, w);
                    apcj z2 = z(i11);
                    apcv apcvVar13 = apck.a;
                    int size7 = list13.size();
                    if (size7 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i22 = 0; i22 < size7; i22++) {
                            i6 += aozl.J(p, (apbt) list13.get(i22), z2);
                        }
                    }
                    i12 += i6;
                    i4 = i11;
                    break;
                case 50:
                    apbo apboVar = (apbo) unsafe.getObject(obj, w);
                    aojh aojhVar = (aojh) B(i11);
                    if (!apboVar.isEmpty()) {
                        Z2 = 0;
                        for (Map.Entry entry : apboVar.entrySet()) {
                            Z2 += aozl.Z(p) + aozl.P(aojh.L((atii) aojhVar.a, entry.getKey(), entry.getValue()));
                        }
                        i12 += Z2;
                        i4 = i11;
                        break;
                    }
                    Z2 = 0;
                    i12 += Z2;
                    i4 = i11;
                case 51:
                    if (R(obj, p, i11)) {
                        k = aozl.at(p);
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 52:
                    if (R(obj, p, i11)) {
                        k = aozl.aw(p);
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 53:
                    if (R(obj, p, i11)) {
                        k = aozl.M(p, x(obj, w));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 54:
                    if (R(obj, p, i11)) {
                        k = aozl.ac(p, x(obj, w));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 55:
                    if (R(obj, p, i11)) {
                        k = aozl.K(p, q(obj, w));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 56:
                    if (R(obj, p, i11)) {
                        k = aozl.av(p);
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 57:
                    if (R(obj, p, i11)) {
                        k = aozl.au(p);
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 58:
                    if (R(obj, p, i11)) {
                        k = aozl.as(p);
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 59:
                    if (R(obj, p, i11)) {
                        Object object2 = unsafe.getObject(obj, w);
                        if (object2 instanceof aozb) {
                            k = aozl.G(p, (aozb) object2);
                        } else {
                            k = aozl.X(p, (String) object2);
                        }
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 60:
                    if (R(obj, p, i11)) {
                        k = apck.c(p, unsafe.getObject(obj, w), z(i11));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 61:
                    if (R(obj, p, i11)) {
                        k = aozl.G(p, (aozb) unsafe.getObject(obj, w));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 62:
                    if (R(obj, p, i11)) {
                        k = aozl.aa(p, q(obj, w));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 63:
                    if (R(obj, p, i11)) {
                        k = aozl.I(p, q(obj, w));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 64:
                    if (R(obj, p, i11)) {
                        k = aozl.ax(p);
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 65:
                    if (R(obj, p, i11)) {
                        k = aozl.ay(p);
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 66:
                    if (R(obj, p, i11)) {
                        k = aozl.T(p, q(obj, w));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 67:
                    if (R(obj, p, i11)) {
                        k = aozl.V(p, x(obj, w));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                case 68:
                    if (R(obj, p, i11)) {
                        k = aozl.J(p, (apbt) unsafe.getObject(obj, w), z(i11));
                        i12 += k;
                    }
                    i4 = i11;
                    break;
                default:
                    i4 = i11;
                    break;
            }
            i11 = i4 + 3;
            i9 = i;
            i10 = i2;
            i8 = 1048575;
        }
        int a2 = i12 + apcv.f(obj).a();
        if (this.h) {
            aozu c2 = aoue.c(obj);
            int i23 = c2.b.b;
            int i24 = 0;
            for (int i25 = 0; i25 < i23; i25++) {
                apcl apclVar = (apcl) c2.b.d(i25);
                i24 += aozu.k((apad) apclVar.a, apclVar.b);
            }
            for (Map.Entry entry2 : c2.b.a()) {
                i24 += aozu.k((apad) entry2.getKey(), entry2.getValue());
            }
            return a2 + i24;
        }
        return a2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @Override // defpackage.apcj
    public final int b(Object obj) {
        int i;
        int A;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int v = v(i4);
            int p = p(i4);
            long w = w(v);
            int i5 = 37;
            switch (u(v)) {
                case 0:
                    i = i3 * 53;
                    A = a.A(Double.doubleToLongBits(apdb.b(obj, w)));
                    i3 = i + A;
                    break;
                case 1:
                    i = i3 * 53;
                    A = Float.floatToIntBits(apdb.c(obj, w));
                    i3 = i + A;
                    break;
                case 2:
                    i = i3 * 53;
                    A = a.A(apdb.f(obj, w));
                    i3 = i + A;
                    break;
                case 3:
                    i = i3 * 53;
                    A = a.A(apdb.f(obj, w));
                    i3 = i + A;
                    break;
                case 4:
                    i = i3 * 53;
                    A = apdb.d(obj, w);
                    i3 = i + A;
                    break;
                case 5:
                    i = i3 * 53;
                    A = a.A(apdb.f(obj, w));
                    i3 = i + A;
                    break;
                case 6:
                    i = i3 * 53;
                    A = apdb.d(obj, w);
                    i3 = i + A;
                    break;
                case 7:
                    i = i3 * 53;
                    A = a.v(apdb.w(obj, w));
                    i3 = i + A;
                    break;
                case 8:
                    i = i3 * 53;
                    A = ((String) apdb.h(obj, w)).hashCode();
                    i3 = i + A;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object h = apdb.h(obj, w);
                    if (h != null) {
                        i5 = h.hashCode();
                    }
                    i3 = i2 + i5;
                    break;
                case 10:
                    i = i3 * 53;
                    A = apdb.h(obj, w).hashCode();
                    i3 = i + A;
                    break;
                case 11:
                    i = i3 * 53;
                    A = apdb.d(obj, w);
                    i3 = i + A;
                    break;
                case 12:
                    i = i3 * 53;
                    A = apdb.d(obj, w);
                    i3 = i + A;
                    break;
                case 13:
                    i = i3 * 53;
                    A = apdb.d(obj, w);
                    i3 = i + A;
                    break;
                case 14:
                    i = i3 * 53;
                    A = a.A(apdb.f(obj, w));
                    i3 = i + A;
                    break;
                case 15:
                    i = i3 * 53;
                    A = apdb.d(obj, w);
                    i3 = i + A;
                    break;
                case 16:
                    i = i3 * 53;
                    A = a.A(apdb.f(obj, w));
                    i3 = i + A;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object h2 = apdb.h(obj, w);
                    if (h2 != null) {
                        i5 = h2.hashCode();
                    }
                    i3 = i2 + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                case 30:
                case 31:
                case 32:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                case 39:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                case 48:
                case 49:
                    i = i3 * 53;
                    A = apdb.h(obj, w).hashCode();
                    i3 = i + A;
                    break;
                case 50:
                    i = i3 * 53;
                    A = apdb.h(obj, w).hashCode();
                    i3 = i + A;
                    break;
                case 51:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = a.A(Double.doubleToLongBits(n(obj, w)));
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = Float.floatToIntBits(o(obj, w));
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = a.A(x(obj, w));
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = a.A(x(obj, w));
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = q(obj, w);
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = a.A(x(obj, w));
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = q(obj, w);
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = a.v(S(obj, w));
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = ((String) apdb.h(obj, w)).hashCode();
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = apdb.h(obj, w).hashCode();
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = apdb.h(obj, w).hashCode();
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = q(obj, w);
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = q(obj, w);
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = q(obj, w);
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = a.A(x(obj, w));
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = q(obj, w);
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = a.A(x(obj, w));
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (R(obj, p, i4)) {
                        i = i3 * 53;
                        A = apdb.h(obj, w).hashCode();
                        i3 = i + A;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + apcv.f(obj).hashCode();
        if (this.h) {
            return (hashCode * 53) + aoue.c(obj).hashCode();
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x09de, code lost:
    
        throw new defpackage.apba("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0fe9, code lost:
    
        if (r0 == r1) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0feb, code lost:
    
        r31.putInt(r7, r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0ff1, code lost:
    
        r10 = r9.k;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0ff7, code lost:
    
        if (r10 >= r9.l) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ff9, code lost:
    
        r3 = A(r34, r9.j[r10], r3, r9.m, r34);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x100c, code lost:
    
        if (r3 == null) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x100e, code lost:
    
        defpackage.apcv.g(r7, (defpackage.apcw) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x1013, code lost:
    
        if (r8 != 0) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x1017, code lost:
    
        if (r6 != r37) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x1021, code lost:
    
        throw new defpackage.apba(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x102a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x1022, code lost:
    
        r1 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x1026, code lost:
    
        if (r6 > r37) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x1028, code lost:
    
        if (r12 != r8) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x1030, code lost:
    
        throw new defpackage.apba(r1);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x0e15. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:274:0x03c9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0a0d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:564:0x00a9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x0d02. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0f9a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0fa0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x088c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x089f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0c82 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0c97 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v132, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, defpackage.aoyp r39) {
        /*
            Method dump skipped, instructions count: 4370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbw.c(java.lang.Object, byte[], int, int, int, aoyp):int");
    }

    @Override // defpackage.apcj
    public final Object e() {
        return ((apag) this.g).newMutableInstance();
    }

    @Override // defpackage.apcj
    public final void g(Object obj) {
        if (Q(obj)) {
            if (obj instanceof apag) {
                apag apagVar = (apag) obj;
                apagVar.clearMemoizedSerializedSize();
                apagVar.clearMemoizedHashCode();
                apagVar.markImmutable();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int v = v(i);
                long w = w(v);
                int u = u(v);
                if (u != 9) {
                    if (u != 60 && u != 68) {
                        switch (u) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                            case 39:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                            case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                            case 48:
                            case 49:
                                aove.d(obj, w).b();
                                break;
                            case 50:
                                Unsafe unsafe = b;
                                Object object = unsafe.getObject(obj, w);
                                if (object != null) {
                                    ((apbo) object).c();
                                    unsafe.putObject(obj, w, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (R(obj, p(i), i)) {
                        z(i).g(b.getObject(obj, w));
                    }
                }
                if (N(obj, i)) {
                    z(i).g(b.getObject(obj, w));
                }
            }
            this.m.e(obj);
            if (this.h) {
                aoue.f(obj);
            }
        }
    }

    @Override // defpackage.apcj
    public final void h(Object obj, Object obj2) {
        E(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int v = v(i);
            long w = w(v);
            int p = p(i);
            switch (u(v)) {
                case 0:
                    if (N(obj2, i)) {
                        apdb.q(obj, w, apdb.b(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (N(obj2, i)) {
                        apdb.r(obj, w, apdb.c(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (N(obj2, i)) {
                        apdb.t(obj, w, apdb.f(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (N(obj2, i)) {
                        apdb.t(obj, w, apdb.f(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (N(obj2, i)) {
                        apdb.s(obj, w, apdb.d(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (N(obj2, i)) {
                        apdb.t(obj, w, apdb.f(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (N(obj2, i)) {
                        apdb.s(obj, w, apdb.d(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (N(obj2, i)) {
                        apdb.m(obj, w, apdb.w(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (N(obj2, i)) {
                        apdb.u(obj, w, apdb.h(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    F(obj, obj2, i);
                    break;
                case 10:
                    if (N(obj2, i)) {
                        apdb.u(obj, w, apdb.h(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (N(obj2, i)) {
                        apdb.s(obj, w, apdb.d(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (N(obj2, i)) {
                        apdb.s(obj, w, apdb.d(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (N(obj2, i)) {
                        apdb.s(obj, w, apdb.d(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (N(obj2, i)) {
                        apdb.t(obj, w, apdb.f(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (N(obj2, i)) {
                        apdb.s(obj, w, apdb.d(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (N(obj2, i)) {
                        apdb.t(obj, w, apdb.f(obj2, w));
                        H(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    F(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                case 30:
                case 31:
                case 32:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                case 39:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                case 48:
                case 49:
                    apax d = aove.d(obj, w);
                    apax d2 = aove.d(obj2, w);
                    int size = d.size();
                    int size2 = d2.size();
                    if (size > 0 && size2 > 0) {
                        if (!d.c()) {
                            d = d.e(size2 + size);
                        }
                        d.addAll(d2);
                    }
                    if (size > 0) {
                        d2 = d;
                    }
                    apdb.u(obj, w, d2);
                    break;
                case 50:
                    apcv apcvVar = apck.a;
                    apdb.u(obj, w, aove.b(apdb.h(obj, w), apdb.h(obj2, w)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (R(obj2, p, i)) {
                        apdb.u(obj, w, apdb.h(obj2, w));
                        I(obj, p, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    G(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (R(obj2, p, i)) {
                        apdb.u(obj, w, apdb.h(obj2, w));
                        I(obj, p, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    G(obj, obj2, i);
                    break;
            }
        }
        apck.o(obj, obj2);
        if (this.h) {
            apck.n(obj, obj2);
        }
    }

    @Override // defpackage.apcj
    public final void i(Object obj, byte[] bArr, int i, int i2, aoyp aoypVar) {
        c(obj, bArr, i, i2, 0, aoypVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c4 A[SYNTHETIC] */
    @Override // defpackage.apcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbw.j(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.apcj
    public final boolean k(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.k) {
            int i6 = this.j[i4];
            int p = p(i6);
            int v = v(i6);
            int i7 = this.c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i3 = b.getInt(obj, i8);
                }
                i2 = i3;
                i = i8;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & v) != 0 && !O(obj, i6, i, i2, i9)) {
                return false;
            }
            int u = u(v);
            if (u != 9 && u != 17) {
                if (u != 27) {
                    if (u != 60 && u != 68) {
                        if (u != 49) {
                            if (u != 50) {
                                continue;
                            } else {
                                apbo apboVar = (apbo) apdb.h(obj, w(v));
                                if (!apboVar.isEmpty() && ((apdf) aove.i(B(i6)).d).s == apdg.MESSAGE) {
                                    apcj apcjVar = null;
                                    for (Object obj2 : apboVar.values()) {
                                        if (apcjVar == null) {
                                            apcjVar = apcc.a.a(obj2.getClass());
                                        }
                                        if (!apcjVar.k(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (R(obj, p, i6) && !P(obj, v, z(i6))) {
                        return false;
                    }
                }
                List list = (List) apdb.h(obj, w(v));
                if (list.isEmpty()) {
                    continue;
                } else {
                    apcj z = z(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!z.k(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (O(obj, i6, i, i2, i9) && !P(obj, v, z(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (this.h && !aoue.c(obj).j()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x04de, code lost:
    
        r1.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04e2, code lost:
    
        ((defpackage.aozg) r18.d).A(r3);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x02d8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:408:0x0155. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:498:0x006a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x026f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04d3 A[SYNTHETIC] */
    @Override // defpackage.apcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.lang.Object r17, defpackage.aozh r18, defpackage.aozs r19) {
        /*
            Method dump skipped, instructions count: 2570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbw.l(java.lang.Object, aozh, aozs):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // defpackage.apcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.Object r22, defpackage.aojj r23) {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apbw.m(java.lang.Object, aojj):void");
    }
}
