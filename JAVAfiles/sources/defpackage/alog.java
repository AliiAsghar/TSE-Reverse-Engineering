package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alog<E> extends alnu<E> implements List<E>, RandomAccess, j$.util.List<E> {
    private static final alur a = new aloc(alsx.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static alog A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public static alog B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @SafeVarargs
    public static alog C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        d.t(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return H(objArr2);
    }

    public static alog D(Iterable iterable) {
        Comparable[] comparableArr = (Comparable[]) alzz.aV(iterable, new Comparable[0]);
        alzz.Y(comparableArr);
        Arrays.sort(comparableArr);
        return h(comparableArr);
    }

    public static alog E(Comparator comparator, Iterable iterable) {
        Object[] aU = alzz.aU(iterable);
        alzz.Y(aU);
        Arrays.sort(aU, comparator);
        return h(aU);
    }

    private static alog H(Object... objArr) {
        alzz.Y(objArr);
        return h(objArr);
    }

    public static alob d(int i) {
        albo.x(i, "expectedSize");
        return new alob(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alog h(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alog i(Object[] objArr, int i) {
        if (i == 0) {
            return alsx.a;
        }
        return new alsx(objArr, i);
    }

    public static alog j(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return n((Collection) iterable);
        }
        return o(iterable.iterator());
    }

    public static alog n(Collection collection) {
        if (collection instanceof alnu) {
            alog g = ((alnu) collection).g();
            if (g.l()) {
                return h(g.toArray());
            }
            return g;
        }
        return H(collection.toArray());
    }

    public static alog o(Iterator it) {
        if (!it.hasNext()) {
            return alsx.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        alob alobVar = new alob();
        alobVar.h(next);
        alobVar.k(it);
        return alobVar.g();
    }

    public static alog p(Object[] objArr) {
        if (objArr.length == 0) {
            return alsx.a;
        }
        return H((Object[]) objArr.clone());
    }

    public static alog q() {
        return alsx.a;
    }

    public static alog r(Object obj) {
        return H(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static alog s(Object obj, Object obj2) {
        return H(obj, obj2);
    }

    public static alog t(Object obj, Object obj2, Object obj3) {
        return H(obj, obj2, obj3);
    }

    public static alog u(Object obj, Object obj2, Object obj3, Object obj4) {
        return H(obj, obj2, obj3, obj4);
    }

    public static alog v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return H(obj, obj2, obj3, obj4, obj5);
    }

    public static alog w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return H(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static alog x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static alog y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static alog z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // java.util.List
    /* renamed from: F, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final alur listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final alur listIterator(int i) {
        albo.ae(i, size());
        if (isEmpty()) {
            return a;
        }
        return new aloc(this, i);
    }

    public alog a() {
        if (size() <= 1) {
            return this;
        }
        return new alod(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public alog subList(int i, int i2) {
        albo.S(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return alsx.a;
        }
        return new alof(this, i, i3);
    }

    @Override // defpackage.alnu
    public int c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return alzz.at(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.alnu
    /* renamed from: k */
    public final aluq listIterator() {
        return iterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // defpackage.alnu
    public Object writeReplace() {
        return new aloe(toArray());
    }

    @Override // defpackage.alnu
    @Deprecated
    public final alog g() {
        return this;
    }
}
