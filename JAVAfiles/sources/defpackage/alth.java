package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alth extends alqf {
    public static final alth c;
    public final transient alog d;

    static {
        int i = alog.d;
        c = new alth(alsx.a, also.a);
    }

    public alth(alog alogVar, Comparator comparator) {
        super(comparator);
        this.d = alogVar;
    }

    @Override // defpackage.alqf
    public final alqf B(Object obj, boolean z) {
        return K(0, I(obj, z));
    }

    @Override // defpackage.alqf
    public final alqf D(Object obj, boolean z, Object obj2, boolean z2) {
        return F(obj, z).B(obj2, z2);
    }

    @Override // defpackage.alqf
    public final alqf F(Object obj, boolean z) {
        return K(J(obj, z), size());
    }

    @Override // defpackage.alqf, java.util.NavigableSet
    /* renamed from: H */
    public final aluq descendingIterator() {
        return this.d.a().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int I(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.d, obj, ((alqf) this).a);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int J(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.d, obj, ((alqf) this).a);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alth K(int i, int i2) {
        if (i == 0) {
            if (i2 != size()) {
                i = 0;
            } else {
                return this;
            }
        }
        if (i < i2) {
            alog alogVar = this.d;
            return new alth(alogVar.subList(i, i2), this.a);
        }
        return G(this.a);
    }

    @Override // defpackage.alnu
    public final int c(Object[] objArr, int i) {
        return this.d.c(objArr, i);
    }

    @Override // defpackage.alqf, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int J = J(obj, true);
        if (J == size()) {
            return null;
        }
        return this.d.get(J);
    }

    @Override // defpackage.alnu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof alsj) {
            collection = ((alsj) collection).i();
        }
        if (alzz.E(((alqf) this).a, collection) && collection.size() > 1) {
            aluq listIterator = listIterator();
            Iterator it = collection.iterator();
            if (!listIterator.hasNext()) {
                return false;
            }
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int a = a(next2, next);
                    if (a < 0) {
                        if (!listIterator.hasNext()) {
                            return false;
                        }
                        next2 = listIterator.next();
                    } else {
                        if (a != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    @Override // defpackage.alnu
    public final int e() {
        return this.d.e();
    }

    @Override // defpackage.alpt, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (alzz.E(this.a, set)) {
            Iterator it = set.iterator();
            try {
                aluq listIterator = listIterator();
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    Object next2 = it.next();
                    if (next2 == null || a(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // defpackage.alnu
    public final int f() {
        return this.d.f();
    }

    @Override // defpackage.alqf, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.d.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.alqf, java.util.NavigableSet
    public final Object floor(Object obj) {
        int I = I(obj, true) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.alpt, defpackage.alnu
    public final alog g() {
        return this.d;
    }

    @Override // defpackage.alqf, java.util.NavigableSet
    public final Object higher(Object obj) {
        int J = J(obj, false);
        if (J == size()) {
            return null;
        }
        return this.d.get(J);
    }

    @Override // defpackage.alqf, defpackage.alpt, defpackage.alnu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final aluq listIterator() {
        return this.d.iterator();
    }

    @Override // defpackage.alnu
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.alqf, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            return this.d.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.alqf, java.util.NavigableSet
    public final Object lower(Object obj) {
        int I = I(obj, false) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.alnu
    public final Object[] m() {
        return this.d.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.alqf, defpackage.alpt, defpackage.alnu
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.alqf
    public final alqf y() {
        Comparator reverseOrder = Collections.reverseOrder(this.a);
        if (isEmpty()) {
            return G(reverseOrder);
        }
        return new alth(this.d.a(), reverseOrder);
    }
}
