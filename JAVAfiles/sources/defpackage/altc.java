package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class altc extends alor {
    public static final alor a = new altc(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;

    private altc(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    public static altc a(int i, Object[] objArr) {
        return u(i, objArr, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static altc u(int i, Object[] objArr, alok alokVar) {
        if (i == 0) {
            return (altc) a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            albo.v(obj, obj2);
            return new altc(null, objArr, 1);
        }
        albo.ae(i, objArr.length >> 1);
        Object x = x(objArr, i, alpt.d(i), 0);
        if (x instanceof Object[]) {
            Object[] objArr2 = (Object[]) x;
            asqe asqeVar = (asqe) objArr2[2];
            if (alokVar != null) {
                alokVar.c = asqeVar;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue + intValue);
                x = obj3;
                i = intValue;
            } else {
                throw asqeVar.m();
            }
        }
        return new altc(x, objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object v(Object[] objArr, int i, int i2, int i3) {
        Object x = x(objArr, i, i2, i3);
        if (!(x instanceof Object[])) {
            return x;
        }
        throw ((asqe) ((Object[]) x)[2]).m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object w(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 != null) {
            if (i == 1) {
                Object obj3 = objArr[i2];
                obj3.getClass();
                if (obj3.equals(obj2)) {
                    Object obj4 = objArr[i2 ^ 1];
                    obj4.getClass();
                    return obj4;
                }
                return null;
            }
            if (obj != null) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length - 1;
                    int bf = alzz.bf(obj2.hashCode());
                    while (true) {
                        int i3 = bf & length;
                        int i4 = bArr[i3] & 255;
                        if (i4 != 255) {
                            if (obj2.equals(objArr[i4])) {
                                return objArr[i4 ^ 1];
                            }
                            bf = i3 + 1;
                        } else {
                            return null;
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length - 1;
                    int bf2 = alzz.bf(obj2.hashCode());
                    while (true) {
                        int i5 = bf2 & length2;
                        char c = (char) sArr[i5];
                        if (c != 65535) {
                            if (obj2.equals(objArr[c])) {
                                return objArr[c ^ 1];
                            }
                            bf2 = i5 + 1;
                        } else {
                            return null;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length - 1;
                    int bf3 = alzz.bf(obj2.hashCode());
                    while (true) {
                        int i6 = bf3 & length3;
                        int i7 = iArr[i6];
                        if (i7 != -1) {
                            if (obj2.equals(objArr[i7])) {
                                return objArr[i7 ^ 1];
                            }
                            bf3 = i6 + 1;
                        } else {
                            return null;
                        }
                    }
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private static Object x(Object[] objArr, int i, int i2, int i3) {
        asqe asqeVar = null;
        if (i == 1) {
            Object obj = objArr[i3];
            obj.getClass();
            Object obj2 = objArr[i3 ^ 1];
            obj2.getClass();
            albo.v(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = -1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = i7 + i7 + i3;
                int i9 = i6 + i6 + i3;
                Object obj3 = objArr[i8];
                obj3.getClass();
                Object obj4 = objArr[i8 ^ 1];
                obj4.getClass();
                albo.v(obj3, obj4);
                int bf = alzz.bf(obj3.hashCode());
                while (true) {
                    int i10 = bf & i4;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj3;
                            objArr[i9 ^ 1] = obj4;
                        }
                        i6++;
                    } else {
                        if (obj3.equals(objArr[i11])) {
                            int i12 = i11 ^ 1;
                            Object obj5 = objArr[i12];
                            obj5.getClass();
                            asqe asqeVar2 = new asqe(obj3, obj4, obj5);
                            objArr[i12] = obj4;
                            asqeVar = asqeVar2;
                            break;
                        }
                        bf = i10 + 1;
                    }
                }
            }
            if (i6 == i) {
                return bArr;
            }
            return new Object[]{bArr, Integer.valueOf(i6), asqeVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = i14 + i14 + i3;
                int i16 = i13 + i13 + i3;
                Object obj6 = objArr[i15];
                obj6.getClass();
                Object obj7 = objArr[i15 ^ 1];
                obj7.getClass();
                albo.v(obj6, obj7);
                int bf2 = alzz.bf(obj6.hashCode());
                while (true) {
                    int i17 = bf2 & i4;
                    char c = (char) sArr[i17];
                    if (c == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj6;
                            objArr[i16 ^ 1] = obj7;
                        }
                        i13++;
                    } else {
                        if (obj6.equals(objArr[c])) {
                            int i18 = c ^ 1;
                            Object obj8 = objArr[i18];
                            obj8.getClass();
                            asqe asqeVar3 = new asqe(obj6, obj7, obj8);
                            objArr[i18] = obj7;
                            asqeVar = asqeVar3;
                            break;
                        }
                        bf2 = i17 + 1;
                    }
                }
            }
            if (i13 == i) {
                return sArr;
            }
            return new Object[]{sArr, Integer.valueOf(i13), asqeVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i19 = 0;
        int i20 = 0;
        while (i19 < i) {
            int i21 = i19 + i19 + i3;
            int i22 = i20 + i20 + i3;
            Object obj9 = objArr[i21];
            obj9.getClass();
            Object obj10 = objArr[i21 ^ 1];
            obj10.getClass();
            albo.v(obj9, obj10);
            int bf3 = alzz.bf(obj9.hashCode());
            while (true) {
                int i23 = bf3 & i4;
                int i24 = iArr[i23];
                if (i24 == i5) {
                    iArr[i23] = i22;
                    if (i20 < i19) {
                        objArr[i22] = obj9;
                        objArr[i22 ^ 1] = obj10;
                    }
                    i20++;
                } else {
                    if (obj9.equals(objArr[i24])) {
                        int i25 = i24 ^ 1;
                        Object obj11 = objArr[i25];
                        obj11.getClass();
                        asqe asqeVar4 = new asqe(obj9, obj10, obj11);
                        objArr[i25] = obj10;
                        asqeVar = asqeVar4;
                        break;
                    }
                    bf3 = i23 + 1;
                    i5 = -1;
                }
            }
            i19++;
            i5 = -1;
        }
        if (i20 == i) {
            return iArr;
        }
        return new Object[]{iArr, Integer.valueOf(i20), asqeVar};
    }

    @Override // defpackage.alor
    public final alnu c() {
        return new altb(this.c, 1, this.d);
    }

    @Override // defpackage.alor
    public final alpt f() {
        return new alsz(this, this.c, 0, this.d);
    }

    @Override // defpackage.alor
    public final alpt g() {
        return new alta(this, new altb(this.c, 0, this.d));
    }

    @Override // defpackage.alor
    public final boolean gY() {
        return false;
    }

    @Override // defpackage.alor, java.util.Map
    public final Object get(Object obj) {
        Object w = w(this.e, this.c, this.d, 0, obj);
        if (w == null) {
            return null;
        }
        return w;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.alor
    public Object writeReplace() {
        return super.writeReplace();
    }
}
