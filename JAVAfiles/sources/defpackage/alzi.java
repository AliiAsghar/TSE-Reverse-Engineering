package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alzi extends AbstractMap {
    public static final Comparator a = new zyv(13);
    private static final int[] e = {1, 2};
    public final Object[] b;
    public final int[] c;
    public final Set d;
    private Integer f;
    private String g;

    public alzi(alzi alziVar, alzi alziVar2) {
        int i;
        Object obj;
        Object[] objArr;
        int i2 = -1;
        this.d = new alzh(this, -1);
        this.f = null;
        this.g = null;
        int size = alziVar.size() + alziVar2.size();
        int b = alziVar.b() + alziVar2.b();
        int i3 = size + 1;
        Object[] objArr2 = new Object[b];
        int[] iArr = new int[i3];
        int i4 = 0;
        iArr[0] = size;
        int i5 = size;
        Map.Entry c = alziVar.c(0);
        Map.Entry c2 = alziVar2.c(0);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (c == null && c2 == null) {
                break;
            }
            int i9 = i6 + 1;
            int i10 = c == null ? 1 : c2 == null ? i2 : i4;
            if (i10 == 0 && (i10 = ((String) c.getKey()).compareTo((String) c2.getKey())) == 0) {
                int i11 = i8 + 1;
                int i12 = i7 + 1;
                objArr2[i6] = d((String) c.getKey(), i6);
                alzh alzhVar = (alzh) c.getValue();
                alzh alzhVar2 = (alzh) c2.getValue();
                int i13 = i4;
                int i14 = i13;
                while (true) {
                    if (i14 >= alzhVar.size() && i13 >= alzhVar2.size()) {
                        break;
                    }
                    int i15 = i14 == alzhVar.size() ? 1 : i13 == alzhVar2.size() ? -1 : i4;
                    if (i15 == 0) {
                        i = i11;
                        i15 = alzk.a.compare(alzhVar.c(i14), alzhVar2.c(i13));
                    } else {
                        i = i11;
                    }
                    if (i15 < 0) {
                        obj = alzhVar.c(i14);
                        i14++;
                    } else {
                        int i16 = i13 + 1;
                        Object c3 = alzhVar2.c(i13);
                        i14 = i15 == 0 ? i14 + 1 : i14;
                        obj = c3;
                        i13 = i16;
                    }
                    objArr2[i5] = obj;
                    i5++;
                    i11 = i;
                    i4 = 0;
                }
                iArr[i9] = i5;
                c = alziVar.c(i12);
                c2 = alziVar2.c(i11);
                i8 = i11;
                i7 = i12;
                i6 = i9;
                i2 = -1;
            } else {
                if (i10 < 0) {
                    int i17 = i7 + 1;
                    int a2 = a(c, i6, i5, objArr2, iArr);
                    c = alziVar.c(i17);
                    i5 = a2;
                    i7 = i17;
                } else {
                    int i18 = i8 + 1;
                    int a3 = a(c2, i6, i5, objArr2, iArr);
                    c2 = alziVar2.c(i18);
                    i5 = a3;
                    i8 = i18;
                }
                i6 = i9;
                i2 = -1;
                i4 = 0;
            }
        }
        int i19 = iArr[i4];
        int i20 = i19 - i6;
        if (i20 != 0) {
            for (int i21 = i4; i21 <= i6; i21++) {
                iArr[i21] = iArr[i21] - i20;
            }
            int i22 = iArr[i6];
            int i23 = i22 - i6;
            if (e(b, i22)) {
                objArr = new Object[i22];
                System.arraycopy(objArr2, i4, objArr, i4, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i19, objArr, i6, i23);
            objArr2 = objArr;
        }
        this.b = objArr2;
        int i24 = iArr[i4] + 1;
        this.c = e(i3, i24) ? Arrays.copyOf(iArr, i24) : iArr;
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        alzh alzhVar = (alzh) entry.getValue();
        int a2 = alzhVar.a() - alzhVar.b();
        System.arraycopy(alzhVar.b.b, alzhVar.b(), objArr, i2, a2);
        objArr[i] = d((String) entry.getKey(), i);
        int i3 = i2 + a2;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new alzh(this, i));
    }

    private static boolean e(int i, int i2) {
        if (i > 16 && i * 9 > i2 * 10) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f == null) {
            this.f = Integer.valueOf(super.hashCode());
        }
        return this.f.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.g == null) {
            this.g = super.toString();
        }
        return this.g;
    }

    public alzi(String str, Object obj) {
        this.d = new alzh(this, -1);
        this.f = null;
        this.g = null;
        this.c = e;
        this.b = new Object[]{d(str, 0), obj};
    }

    public alzi(List list) {
        this.d = new alzh(this, -1);
        this.f = null;
        this.g = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.c = iArr;
                return;
            }
            Object obj = ((ahlp) it2.next()).a;
            throw null;
        }
        Object obj2 = ((ahlp) it.next()).a;
        throw null;
    }
}
