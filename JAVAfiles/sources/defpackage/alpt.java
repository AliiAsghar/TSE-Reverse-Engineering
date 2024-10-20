package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alpt<E> extends alnu<E> implements Set<E>, j$.util.Set<E> {
    private static final long serialVersionUID = 912559;
    private transient alog a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i) {
        boolean z;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "collection too large");
        return 1073741824;
    }

    public static alpr i(int i) {
        albo.x(i, "expectedSize");
        return new alpr(i);
    }

    public static alpt j(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int d = d(i);
                Object[] objArr2 = new Object[d];
                int i2 = d - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    alzz.X(obj, i5);
                    int hashCode = obj.hashCode();
                    int bf = alzz.bf(hashCode);
                    while (true) {
                        int i6 = bf & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        }
                        if (!obj2.equals(obj)) {
                            bf++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new altx(obj3);
                }
                if (d(i4) < d / 2) {
                    return j(i4, objArr);
                }
                if (w(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new altg(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new altx(obj4);
        }
        return altg.a;
    }

    public static alpt n(Iterable iterable) {
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return altg.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new altx(next);
        }
        alpr alprVar = new alpr();
        alprVar.c(next);
        it.getClass();
        while (it.hasNext()) {
            alprVar.c(it.next());
        }
        return alprVar.g();
    }

    public static alpt o(Collection collection) {
        if ((collection instanceof alpt) && !(collection instanceof SortedSet)) {
            alpt alptVar = (alpt) collection;
            if (!alptVar.l()) {
                return alptVar;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static alpt p(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return j(length, (Object[]) objArr.clone());
            }
            return new altx(objArr[0]);
        }
        return altg.a;
    }

    public static alpt q() {
        return altg.a;
    }

    public static alpt r(Object obj, Object obj2) {
        return j(2, obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static alpt s(Object obj, Object obj2, Object obj3) {
        return j(3, obj, obj2, obj3);
    }

    public static alpt t(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(4, obj, obj2, obj3, obj4);
    }

    public static alpt u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return j(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static alpt v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        d.t(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return j(i, objArr2);
    }

    public static boolean w(int i, int i2) {
        if (i < (i2 >> 1) + (i2 >> 2)) {
            return true;
        }
        return false;
    }

    public boolean b() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof alpt) && b() && ((alpt) obj).b() && hashCode() != obj.hashCode()) {
            return false;
        }
        return alzz.P(this, obj);
    }

    @Override // defpackage.alnu
    public alog g() {
        alog alogVar = this.a;
        if (alogVar == null) {
            alog h = h();
            this.a = h;
            return h;
        }
        return alogVar;
    }

    public alog h() {
        return alog.h(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return alzz.F(this);
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract aluq listIterator();

    @Override // defpackage.alnu
    public Object writeReplace() {
        return new alps(toArray());
    }
}
