package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqjn {
    public static volatile aqux a;
    public static volatile aqux b;
    public static volatile aqux c;
    public static volatile aqux d;
    public static volatile aqux e;

    private aqjn() {
    }

    public static ArrayList A(Object... objArr) {
        return new ArrayList(new arnq(objArr, true));
    }

    public static List B(Object... objArr) {
        objArr.getClass();
        if (objArr.length > 0) {
            return aqil.c(objArr);
        }
        return arnv.a;
    }

    public static List C(Object obj) {
        if (obj != null) {
            return y(obj);
        }
        return arnv.a;
    }

    public static List D(Object... objArr) {
        return new ArrayList(new arnq(objArr, true));
    }

    public static List E(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return y(list.get(0));
        }
        return arnv.a;
    }

    public static void F() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void G() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static /* synthetic */ int H(List list, Comparable comparable) {
        int size = list.size();
        int size2 = list.size();
        if (size >= 0) {
            if (size <= size2) {
                int i = size - 1;
                int i2 = 0;
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    int q = arrj.q((Comparable) list.get(i3), comparable);
                    if (q < 0) {
                        i2 = i3 + 1;
                    } else if (q > 0) {
                        i = i3 - 1;
                    } else {
                        return i3;
                    }
                }
                return -(i2 + 1);
            }
            throw new IndexOutOfBoundsException(a.cl(size2, size, "toIndex (", ") is greater than size (", ")."));
        }
        throw new IllegalArgumentException(a.cb(size, "fromIndex (0) is greater than toIndex (", ")."));
    }

    public static final void I(int i, Object[] objArr) {
        objArr.getClass();
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static int J(Iterable iterable, int i) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static List K(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            S(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static void L(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void M(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static Object N(List list) {
        if (!list.isEmpty()) {
            return list.remove(z(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Collection O(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return ax(iterable);
    }

    public static boolean P(Iterable iterable, arqr arqrVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) arqrVar.a(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean Q(List list, arqr arqrVar) {
        list.getClass();
        arqrVar.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof arse) && !(list instanceof arsg)) {
                arsd.c(list, "kotlin.collections.MutableIterable");
            }
            return P(list, arqrVar, true);
        }
        arob it = new artb(0, z(list)).iterator();
        int i = 0;
        while (it.a) {
            int a2 = it.a();
            Object obj = list.get(a2);
            if (!((Boolean) arqrVar.a(obj)).booleanValue()) {
                if (i != a2) {
                    list.set(i, obj);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int z = z(list);
        if (i > z) {
            return true;
        }
        while (true) {
            list.remove(z);
            if (z == i) {
                return true;
            }
            z--;
        }
    }

    public static int R(List list, int i) {
        return z(list) - i;
    }

    public static void S(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void T(Collection collection, Iterable iterable) {
        collection.getClass();
        collection.removeAll(O(iterable));
    }

    public static int U(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    public static Iterable V(Iterable iterable) {
        return new arnz(new arih(iterable, 2));
    }

    public static Object W(Iterable iterable) {
        if (iterable instanceof List) {
            return X((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object X(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object Y(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object Z(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static aqjm a(aqrs aqrsVar) {
        return (aqjm) aqjm.g(new wci(13), aqrsVar);
    }

    public static List aA(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(J(iterable, 10), J(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new armo(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Set aB(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set aD = aD(iterable);
        aD.retainAll(O(iterable2));
        return aD;
    }

    public static Set aC(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set aD = aD(iterable);
        T(aD, iterable2);
        return aD;
    }

    public static Set aD(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        aL(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set aE(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i(collection.size()));
                    aL(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return e(next);
            }
            return arnx.a;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        aL(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            return e(linkedHashSet2.iterator().next());
        }
        return arnx.a;
    }

    public static artx aF(Iterable iterable) {
        iterable.getClass();
        return new een(iterable, 3);
    }

    public static boolean aG(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            if (!((Collection) iterable).isEmpty()) {
                return true;
            }
            return false;
        }
        return iterable.iterator().hasNext();
    }

    public static boolean aH(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            if (iterable instanceof List) {
                i = ((List) iterable).indexOf(obj);
            } else {
                int i2 = 0;
                for (Object obj2 : iterable) {
                    if (i2 < 0) {
                        G();
                    }
                    if (!d.F(obj, obj2)) {
                        i2++;
                    } else {
                        i = i2;
                    }
                }
                return false;
            }
            if (i < 0) {
                return false;
            }
            return true;
        }
        return ((Collection) iterable).contains(obj);
    }

    public static int[] aI(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static void aJ(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, arqr arqrVar) {
        iterable.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            d.n(appendable, next, arqrVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String aK(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, arqr arqrVar, int i) {
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        arqr arqrVar2;
        int i2;
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence7 = charSequence;
        charSequence7.getClass();
        if ((i & 2) != 0) {
            charSequence4 = "";
        } else {
            charSequence4 = charSequence2;
        }
        charSequence4.getClass();
        if ((i & 4) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence3;
        }
        charSequence5.getClass();
        if ((i & 16) != 0) {
            charSequence6 = "...";
        } else {
            charSequence6 = null;
        }
        charSequence6.getClass();
        StringBuilder sb = new StringBuilder();
        if ((i & 32) != 0) {
            arqrVar2 = null;
        } else {
            arqrVar2 = arqrVar;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        aJ(iterable, sb, charSequence7, charSequence4, charSequence5, i2, charSequence6, arqrVar2);
        return sb.toString();
    }

    public static void aL(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static List aM(Iterable iterable, int i, boolean z, arqr arqrVar) {
        c(2, i);
        int i2 = 1;
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i3 = size / i;
            int i4 = 0;
            if (size % i == 0) {
                i2 = 0;
            }
            ArrayList arrayList = new ArrayList(i3 + i2);
            arod arodVar = new arod(list);
            while (i4 >= 0 && i4 < size) {
                int s = arrn.s(2, size - i4);
                if (!z && s < 2) {
                    break;
                }
                int i5 = s + i4;
                a.P(i4, i5, arodVar.a.size());
                arodVar.b = i4;
                arodVar.c = i5 - i4;
                arrayList.add(arqrVar.a(arodVar));
                i4 += i;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator b2 = b(iterable.iterator(), 2, i, z, true);
        while (b2.hasNext()) {
            arrayList2.add(arqrVar.a((List) b2.next()));
        }
        return arrayList2;
    }

    public static /* synthetic */ void aN(Iterable iterable, Appendable appendable, arqr arqrVar, int i) {
        arqr arqrVar2;
        CharSequence charSequence;
        int i2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        if ((i & 64) != 0) {
            arqrVar2 = null;
        } else {
            arqrVar2 = arqrVar;
        }
        if ((i & 32) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i & 16) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        if ((i & 8) != 0) {
            charSequence2 = "";
        } else {
            charSequence2 = null;
        }
        if ((i & 4) != 0) {
            charSequence3 = "";
        } else {
            charSequence3 = null;
        }
        if ((i & 2) != 0) {
            str = ", ";
        } else {
            str = "\n";
        }
        aJ(iterable, appendable, str, charSequence3, charSequence2, i3, charSequence, arqrVar2);
    }

    public static Object aa(List list, int i) {
        list.getClass();
        if (arrn.B(0, list.size()).e(i)) {
            return list.get(i);
        }
        return null;
    }

    public static Object ab(Iterable iterable) {
        if (iterable instanceof List) {
            return ac((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object ac(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(z(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object ad(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Object ae(Iterable iterable, Comparator comparator) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Object af(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ag((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object ag(List list) {
        list.getClass();
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object ah(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static HashSet ai(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(i(J(iterable, 12)));
        aL(iterable, hashSet);
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List aj(Iterable iterable, int i) {
        iterable.getClass();
        c(i, i);
        int i2 = 1;
        if (iterable instanceof RandomAccess) {
            int size = iterable.size();
            int i3 = size / i;
            if (size % i == 0) {
                i2 = 0;
            }
            ArrayList arrayList = new ArrayList(i3 + i2);
            int i4 = 0;
            while (i4 >= 0 && i4 < size) {
                int s = arrn.s(i, size - i4);
                ArrayList arrayList2 = new ArrayList(s);
                for (int i5 = 0; i5 < s; i5++) {
                    arrayList2.add(iterable.get(i5 + i4));
                }
                arrayList.add(arrayList2);
                i4 += i;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator b2 = b(iterable.iterator(), i, i, true, false);
        while (b2.hasNext()) {
            arrayList3.add((List) b2.next());
        }
        return arrayList3;
    }

    public static List ak(Iterable iterable) {
        return ax(aD(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List al(Iterable iterable, int i) {
        iterable.getClass();
        int size = iterable.size() - i;
        if (size <= 0) {
            return arnv.a;
        }
        if (size == 1) {
            return y(ab(iterable));
        }
        ArrayList arrayList = new ArrayList(size);
        if (iterable instanceof RandomAccess) {
            int size2 = iterable.size();
            while (i < size2) {
                arrayList.add(iterable.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = iterable.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List am(List list, int i) {
        if (i >= 0) {
            return av(list, arrn.r(list.size() - i, 0));
        }
        throw new IllegalArgumentException(a.cb(i, "Requested element count ", " is less than zero."));
    }

    public static List an(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List ao(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection O = O(iterable2);
        if (O.isEmpty()) {
            return ax(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!O.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List ap(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(J(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && d.F(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List aq(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        S(arrayList2, iterable);
        return arrayList2;
    }

    public static List ar(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List as(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return ax(iterable);
        }
        List ay = ay(iterable);
        Collections.reverse(ay);
        return ay;
    }

    public static List at(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return ax(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return aqil.c(array);
        }
        List ay = ay(iterable);
        L(ay);
        return ay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List au(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return ax(iterable);
        }
        Object[] array = iterable.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return aqil.c(array);
    }

    public static List av(Iterable iterable, int i) {
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return arnv.a;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return ax(iterable);
                }
                if (i == 1) {
                    return y(W(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return E(arrayList);
        }
        throw new IllegalArgumentException(a.cb(i, "Requested element count ", " is less than zero."));
    }

    public static List aw(List list, int i) {
        if (i >= 0) {
            if (i == 0) {
                return arnv.a;
            }
            int size = list.size();
            if (i >= size) {
                return ax(list);
            }
            if (i == 1) {
                return y(ac(list));
            }
            int i2 = size - i;
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                while (i2 < size) {
                    arrayList.add(list.get(i2));
                    i2++;
                }
            } else {
                ListIterator listIterator = list.listIterator(i2);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(a.cb(i, "Requested element count ", " is less than zero."));
    }

    public static List ax(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return az(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return y(next);
            }
            return arnv.a;
        }
        return E(ay(iterable));
    }

    public static List ay(Iterable iterable) {
        if (iterable instanceof Collection) {
            return az((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        aL(iterable, arrayList);
        return arrayList;
    }

    public static List az(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final Iterator b(Iterator it, int i, int i2, boolean z, boolean z2) {
        it.getClass();
        if (!it.hasNext()) {
            return arnu.a;
        }
        return arrn.b(new aroj(i, i2, it, z2, z, null));
    }

    public static final void c(int i, int i2) {
        String cb;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            cb = a.cl(i2, i, "Both size ", " and step ", " must be greater than zero.");
        } else {
            cb = a.cb(i, "size ", " must be greater than zero.");
        }
        throw new IllegalArgumentException(cb);
    }

    public static final Set d(Set set) {
        ((aroy) set).b.e();
        if (((arno) set).c() > 0) {
            return set;
        }
        return aroy.a;
    }

    public static final Set e(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static Set f(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(i(1));
        aqil.J(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set g(Set set, Iterable iterable) {
        Collection<?> O = O(iterable);
        if (O.isEmpty()) {
            return aE(set);
        }
        if (O instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!O.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(O);
        return linkedHashSet2;
    }

    public static Set h(Set set, Iterable iterable) {
        Integer num;
        int i;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            i = set.size() + num.intValue();
        } else {
            int size = set.size();
            i = size + size;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i(i));
        linkedHashSet.addAll(set);
        S(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static int i(int i) {
        if (i >= 0) {
            if (i < 3) {
                return i + 1;
            }
            if (i >= 1073741824) {
                return Integer.MAX_VALUE;
            }
            return (int) ((i / 0.75f) + 1.0f);
        }
        return i;
    }

    public static Map j(armo armoVar) {
        armoVar.getClass();
        Map singletonMap = Collections.singletonMap(armoVar.a, armoVar.b);
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map k(Map map) {
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static Object l(Map map, Object obj) {
        Object obj2;
        map.getClass();
        if (map instanceof aroe) {
            aroe aroeVar = (aroe) map;
            Map map2 = aroeVar.a;
            obj2 = map2.get(obj);
            if (obj2 == null && !map2.containsKey(obj)) {
                return aroeVar.b.a(obj);
            }
        } else {
            obj2 = map.get(obj);
            if (obj2 == null && !map.containsKey(obj)) {
                throw new NoSuchElementException(a.cc(obj, "Key ", " is missing in the map."));
            }
        }
        return obj2;
    }

    public static Map m(armo... armoVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i(armoVarArr.length));
        u(linkedHashMap, armoVarArr);
        return linkedHashMap;
    }

    public static Map n(armo... armoVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(i(armoVarArr.length));
        u(linkedHashMap, armoVarArr);
        return linkedHashMap;
    }

    public static Map o(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return map;
            }
            return k(map);
        }
        return arnw.a;
    }

    public static Map p(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map q(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i(collection.size()));
                    t(linkedHashMap, iterable);
                    return linkedHashMap;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return j((armo) next);
            }
            return arnw.a;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        t(linkedHashMap2, iterable);
        return o(linkedHashMap2);
    }

    public static Map r(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return s(map);
            }
            return k(map);
        }
        return arnw.a;
    }

    public static Map s(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static void t(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            armo armoVar = (armo) it.next();
            map.put(armoVar.a, armoVar.b);
        }
    }

    public static void u(Map map, armo[] armoVarArr) {
        for (armo armoVar : armoVarArr) {
            map.put(armoVar.a, armoVar.b);
        }
    }

    public static void v(armo... armoVarArr) {
        u(new LinkedHashMap(i(armoVarArr.length)), armoVarArr);
    }

    public static List w(Map map) {
        map.getClass();
        if (map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return y(new armo(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new armo(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new armo(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return arnv.a;
    }

    public static final List x(List list) {
        list.getClass();
        aron aronVar = (aron) list;
        aronVar.h();
        aronVar.d = true;
        if (aronVar.c > 0) {
            return aronVar;
        }
        return aron.a;
    }

    public static final List y(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static int z(List list) {
        list.getClass();
        return list.size() - 1;
    }
}
