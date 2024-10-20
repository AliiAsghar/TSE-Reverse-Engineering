package defpackage;

import com.android.vcard.VCardConfig;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.BiFunction;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alzz {
    private alzz() {
    }

    public static Collection A(Collection collection, Object obj) {
        if (collection instanceof SortedSet) {
            return new alun((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return new alum((Set) collection, obj);
        }
        if (collection instanceof List) {
            return B((List) collection, obj);
        }
        return new alug(collection, obj);
    }

    public static List B(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return new alul(list, obj);
        }
        return new aluh(list, obj);
    }

    public static Stream C(Iterable iterable) {
        if (iterable instanceof Collection) {
            return Collection.EL.stream((java.util.Collection) iterable);
        }
        return StreamSupport.stream(Iterable$EL.spliterator(iterable), false);
    }

    public static Stream D(Stream stream, Stream stream2, BiFunction biFunction) {
        stream.getClass();
        stream2.getClass();
        boolean z = true;
        if (!stream.isParallel() && !stream2.isParallel()) {
            z = false;
        }
        Spliterator<T> spliterator = stream.spliterator();
        Spliterator<T> spliterator2 = stream2.spliterator();
        Stream stream3 = StreamSupport.stream(new altz(Math.min(spliterator.estimateSize(), spliterator2.estimateSize()), spliterator.characteristics() & spliterator2.characteristics() & 80, Spliterators.iterator(spliterator), Spliterators.iterator(spliterator2), biFunction), z);
        int i = 5;
        return stream3.onClose(new akwm(stream, i)).onClose(new akwm(stream2, i));
    }

    public static boolean E(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = also.a;
            }
        } else if (iterable instanceof alty) {
            comparator2 = ((alty) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }

    public static int F(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public static altw G(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new altq(set, set2);
    }

    public static altw H(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new alto(set, set2);
    }

    public static altw I(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new altm(set, set2);
    }

    public static HashSet J(Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return new HashSet((java.util.Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet hashSet = new HashSet();
        aE(hashSet, it);
        return hashSet;
    }

    public static HashSet K(Object... objArr) {
        HashSet L = L(objArr.length);
        Collections.addAll(L, objArr);
        return L;
    }

    public static HashSet L(int i) {
        return new HashSet(ac(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set M(Set set, algy algyVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof altt) {
                altt alttVar = (altt) sortedSet;
                return new altu((SortedSet) alttVar.a, albo.J(alttVar.b, algyVar));
            }
            sortedSet.getClass();
            return new altu(sortedSet, algyVar);
        }
        if (set instanceof altt) {
            altt alttVar2 = (altt) set;
            return new altt(alttVar2.a, albo.J(alttVar2.b, algyVar));
        }
        set.getClass();
        return new altt(set, algyVar);
    }

    public static Set N() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set O() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static boolean P(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean Q(Set set, java.util.Collection collection) {
        collection.getClass();
        if (collection instanceof alsj) {
            collection = ((alsj) collection).i();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return aG(set.iterator(), collection);
        }
        return R(set, collection.iterator());
    }

    public static boolean R(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static void S(alrz alrzVar, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            java.util.Collection z = alrzVar.z(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                z.add(objectInputStream.readObject());
            }
        }
    }

    public static void T(alrz alrzVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(alrzVar.t().size());
        for (Map.Entry entry : alrzVar.t().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((java.util.Collection) entry.getValue()).size());
            Iterator it = ((java.util.Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static Object[] U(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static Object[] V(Object[] objArr, Object[] objArr2, Class cls) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] W = W(cls, length + length2);
        System.arraycopy(objArr, 0, W, 0, length);
        System.arraycopy(objArr2, 0, W, length, length2);
        return W;
    }

    public static Object[] W(Class cls, int i) {
        return (Object[]) Array.newInstance((Class<?>) cls, i);
    }

    public static void X(Object obj, int i) {
        if (obj != null) {
        } else {
            throw new NullPointerException(a.bV(i, "at index "));
        }
    }

    public static void Y(Object... objArr) {
        Z(objArr, objArr.length);
    }

    public static void Z(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            X(objArr[i2], i2);
        }
    }

    public static Object aA(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object aB(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static Iterator aC(Iterator it, algk algkVar) {
        algkVar.getClass();
        return new alqo(it, algkVar);
    }

    public static void aD(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean aE(java.util.Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r2.hasNext() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (r3.equals(r2.next()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0001, code lost:
    
        if (r3 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r2.hasNext() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r2.next() != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean aF(java.util.Iterator r2, java.lang.Object r3) {
        /*
            r0 = 1
            if (r3 != 0) goto L10
        L3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            if (r3 != 0) goto L3
            return r0
        L10:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L10
            return r0
        L21:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alzz.aF(java.util.Iterator, java.lang.Object):boolean");
    }

    public static boolean aG(Iterator it, java.util.Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static int aH(Iterable iterable, algy algyVar) {
        return av(iterable.iterator(), algyVar);
    }

    public static int aI(Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return albo.cu(j);
    }

    public static algw aJ(Iterable iterable, algy algyVar) {
        Iterator it = iterable.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (algyVar.a(next)) {
                return algw.i(next);
            }
        }
        return alfd.a;
    }

    public static Iterable aK(Iterable iterable, algy algyVar) {
        iterable.getClass();
        return new alqi(iterable, algyVar);
    }

    public static Iterable aL(Iterable iterable, algk algkVar) {
        iterable.getClass();
        return new alqj(iterable, algkVar);
    }

    public static Object aM(Iterable iterable, int i) {
        Iterator it = iterable.iterator();
        int au = au(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException(a.cl(au, i, "position (", ") must be less than the number of elements that remained (", ")"));
    }

    public static Object aN(Iterable iterable, Object obj) {
        return az(iterable.iterator(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object aO(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            if (!iterable.isEmpty()) {
                return iterable.get(iterable.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object aP(Iterable iterable) {
        return aA(iterable.iterator());
    }

    public static Object aQ(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return aA(it);
        }
        return obj;
    }

    public static String aR(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static boolean aS(java.util.Collection collection, Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return collection.addAll((java.util.Collection) iterable);
        }
        return aE(collection, iterable.iterator());
    }

    public static boolean aT(Iterable iterable, algy algyVar) {
        if (av(iterable.iterator(), algyVar) != -1) {
            return true;
        }
        return false;
    }

    public static Object[] aU(Iterable iterable) {
        return bu(iterable).toArray();
    }

    public static Object[] aV(Iterable iterable, Object[] objArr) {
        return bu(iterable).toArray(objArr);
    }

    public static void aW(List list, algy algyVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!algyVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        bv(list, algyVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        bv(list, algyVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public static alpo aX(List list) {
        Collections.sort(list, new allq(alrq.KEY, alss.a));
        alob alobVar = new alob(list.size());
        alob alobVar2 = new alob(list.size());
        for (int i = 0; i < list.size(); i++) {
            alst alstVar = (alst) ((Map.Entry) list.get(i)).getKey();
            if (i > 0) {
                alst alstVar2 = (alst) ((Map.Entry) list.get(i - 1)).getKey();
                if (alstVar.h(alstVar2) && !alstVar.f(alstVar2).i()) {
                    throw new IllegalArgumentException(a.ct(alstVar, alstVar2, "Overlapping ranges: range ", " overlaps with entry "));
                }
            }
            alobVar.h(alstVar);
            alobVar2.h(((Map.Entry) list.get(i)).getValue());
        }
        return new alpo(alobVar.g(), alobVar2.g());
    }

    public static void aY(alst alstVar, Object obj, List list) {
        alstVar.getClass();
        obj.getClass();
        albo.N(!alstVar.i(), "Range must not be empty, but was %s", alstVar);
        list.add(new alnv(alstVar, obj));
    }

    public static /* synthetic */ alog aZ(java.util.Collection collection) {
        collection.getClass();
        alog n = alog.n(collection);
        n.getClass();
        return n;
    }

    public static void aa(Iterable iterable, Object[] objArr) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public static boolean ab(alsj alsjVar, Object obj) {
        if (obj == alsjVar) {
            return true;
        }
        if (obj instanceof alsj) {
            alsj alsjVar2 = (alsj) obj;
            if (alsjVar.size() == alsjVar2.size() && alsjVar.j().size() == alsjVar2.j().size()) {
                for (alsk alskVar : alsjVar2.j()) {
                    if (alsjVar.b(alskVar.a) != alskVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static int ac(int i) {
        if (i < 3) {
            albo.x(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static algk ad(alrs alrsVar) {
        alrsVar.getClass();
        return new alrg(alrsVar, 0);
    }

    public static alor ae(Map map) {
        if (map instanceof alnx) {
            return (alnx) map;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return altc.a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        albo.v(r1, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(r1, value));
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r12 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            albo.v(r12, value2);
            enumMap.put((EnumMap) r12, (Enum) value2);
        }
        int size = enumMap.size();
        if (size != 0) {
            if (size != 1) {
                return new alnx(enumMap);
            }
            Map.Entry entry3 = (Map.Entry) aP(enumMap.entrySet());
            return alor.l((Enum) entry3.getKey(), entry3.getValue());
        }
        return altc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static alor af(Iterable iterable, algk algkVar) {
        if (iterable instanceof java.util.Collection) {
            return bt(iterable.iterator(), algkVar, alor.h(iterable.size()));
        }
        return bt(iterable.iterator(), algkVar, new alok());
    }

    public static Object ag(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static Object ah(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String ai(Map map) {
        int size = map.size();
        albo.x(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static HashMap aj(int i) {
        return new HashMap(ac(i));
    }

    public static LinkedHashMap ak(int i) {
        return new LinkedHashMap(ac(i));
    }

    public static Map.Entry al(Map.Entry entry) {
        entry.getClass();
        return new alrl(entry);
    }

    public static boolean am(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ArrayList an(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return new ArrayList((java.util.Collection) iterable);
        }
        return ao(iterable.iterator());
    }

    public static ArrayList ao(Iterator it) {
        ArrayList arrayList = new ArrayList();
        aE(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList ap(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        albo.x(length, "arraySize");
        ArrayList arrayList = new ArrayList(albo.cu(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList aq(int i) {
        albo.x(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List ar(List list) {
        if (list instanceof alog) {
            return ((alog) list).a();
        }
        if (list instanceof alqz) {
            return ((alqz) list).a;
        }
        if (list instanceof RandomAccess) {
            return new alqx(list);
        }
        return new alqz(list);
    }

    public static List as(List list, algk algkVar) {
        if (list instanceof RandomAccess) {
            return new alrb(list, algkVar);
        }
        return new alrd(list, algkVar);
    }

    public static boolean at(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!d.B(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !d.B(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static int au(Iterator it, int i) {
        boolean z;
        it.getClass();
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static int av(Iterator it, algy algyVar) {
        algyVar.getClass();
        int i = 0;
        while (it.hasNext()) {
            if (algyVar.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static aluq aw(Iterator it, algy algyVar) {
        it.getClass();
        algyVar.getClass();
        return new alqn(it, algyVar);
    }

    public static aluq ax(Iterator it) {
        it.getClass();
        if (it instanceof aluq) {
            return (aluq) it;
        }
        return new alqm(it);
    }

    public static Object ay(Iterator it, algy algyVar) {
        it.getClass();
        algyVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (algyVar.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object az(Iterator it, Object obj) {
        if (it.hasNext()) {
            return it.next();
        }
        return obj;
    }

    public static void b(String str, Object... objArr) {
        System.err.println(alzz.class.toString() + ": " + String.format(str, objArr));
    }

    public static /* synthetic */ alog ba(artx artxVar) {
        alog o = alog.o(new aruj((artt) artxVar, 1));
        o.getClass();
        return o;
    }

    public static /* synthetic */ alog bb(Object[] objArr) {
        alog p = alog.p(objArr);
        p.getClass();
        return p;
    }

    public static /* synthetic */ alor bc(Map map) {
        alor j = alor.j(map);
        j.getClass();
        return j;
    }

    public static /* synthetic */ alpt bd(java.util.Collection collection) {
        collection.getClass();
        alpt o = alpt.o(collection);
        o.getClass();
        return o;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object be(defpackage.asai r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.aloa
            if (r0 == 0) goto L13
            r0 = r6
            aloa r0 = (defpackage.aloa) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aloa r0 = new aloa
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            alob r5 = r0.c
            defpackage.aqil.P(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            alob r6 = new alob
            r6.<init>()
            agco r2 = new agco
            r4 = 10
            r2.<init>(r6, r4)
            r0.c = r6
            r0.b = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 == r1) goto L53
            r5 = r6
        L4b:
            alog r5 = r5.g()
            r5.getClass()
            return r5
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alzz.be(asai, arpe):java.lang.Object");
    }

    public static int bf(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int bg(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return bf(hashCode);
    }

    public static int bh(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > highestOneBit) {
            int i2 = highestOneBit + highestOneBit;
            if (i2 > 0) {
                return i2;
            }
            return 1073741824;
        }
        return highestOneBit;
    }

    public static Comparable bi(Comparable comparable, Comparable comparable2) {
        if (comparable.compareTo(comparable2) <= 0) {
            return comparable;
        }
        return comparable2;
    }

    public static int bj(int i, int i2) {
        return i & (~i2);
    }

    public static int bk(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int bl(int i) {
        int i2;
        if (i < 32) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        return i2 * (i + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r4 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        br(r10, r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r11[r4] = bk(r11[r4], r6, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int bm(java.lang.Object r7, java.lang.Object r8, int r9, java.lang.Object r10, int[] r11, java.lang.Object[] r12, java.lang.Object[] r13) {
        /*
            int r0 = bg(r7)
            r1 = r0 & r9
            int r2 = bn(r10, r1)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r0 = bj(r0, r9)
            r4 = r3
        L13:
            int r2 = r2 + r3
            r5 = r11[r2]
            r6 = r5 & r9
            int r5 = bj(r5, r9)
            if (r5 != r0) goto L3f
            r5 = r12[r2]
            boolean r5 = defpackage.d.B(r7, r5)
            if (r5 == 0) goto L3f
            if (r13 == 0) goto L30
            r5 = r13[r2]
            boolean r5 = defpackage.d.B(r8, r5)
            if (r5 == 0) goto L3f
        L30:
            if (r4 != r3) goto L36
            br(r10, r1, r6)
            goto L3e
        L36:
            r7 = r11[r4]
            int r7 = bk(r7, r6, r9)
            r11[r4] = r7
        L3e:
            return r2
        L3f:
            if (r6 == 0) goto L44
            r4 = r2
            r2 = r6
            goto L13
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alzz.bm(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static int bn(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static int bo(int i) {
        return Math.max(4, bh(i + 1));
    }

    public static Object bp(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        throw new IllegalArgumentException(a.bV(i, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static void bq(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static void br(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static ahlp bs(Class cls, String str) {
        try {
            return new ahlp(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    private static alor bt(Iterator it, algk algkVar, alok alokVar) {
        while (it.hasNext()) {
            Object next = it.next();
            alokVar.h(algkVar.apply(next), next);
        }
        try {
            return alokVar.b();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    private static java.util.Collection bu(Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return (java.util.Collection) iterable;
        }
        return ao(iterable.iterator());
    }

    private static void bv(List list, algy algyVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (algyVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    public static void c(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void e(String str) {
        if (!str.isEmpty()) {
            if (a.ad(str.charAt(0))) {
                for (int i = 1; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (!a.ad(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                        throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(String.valueOf(str)));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("identifier must not be empty");
    }

    public static amce f(String str) {
        return new amce(amcc.a(aotl.m(str)));
    }

    public static void g(String str, aozy aozyVar) {
        str.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amfv amfvVar = (amfv) aozyVar.b;
        amfv amfvVar2 = amfv.a;
        amfvVar.b |= 16384;
        amfvVar.n = str;
    }

    public static /* synthetic */ amfr h(amfq amfqVar) {
        apag s = amfqVar.s();
        s.getClass();
        return (amfr) s;
    }

    public static void i(amog amogVar, amfq amfqVar) {
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.bF = amogVar;
        amfrVar.h |= 524288;
    }

    public static void j(ameo ameoVar, amfq amfqVar) {
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.j = ameoVar;
        amfrVar.b |= 2;
    }

    public static void k(amgu amguVar, amfq amfqVar) {
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.k = amguVar;
        amfrVar.b |= 4;
    }

    public static void l(aplp aplpVar, amfq amfqVar) {
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.bu = aplpVar;
        amfrVar.h |= 4;
    }

    public static void m(amut amutVar, amfq amfqVar) {
        amutVar.getClass();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.bz = amutVar;
        amfrVar.h |= 2048;
    }

    public static void n(amfp amfpVar, amfq amfqVar) {
        amfpVar.getClass();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
    }

    public static void o(amxn amxnVar, amfq amfqVar) {
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.bw = amxnVar;
        amfrVar.h |= 16;
    }

    public static void p(amxs amxsVar, amfq amfqVar) {
        amxsVar.getClass();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.bE = amxsVar;
        amfrVar.h |= 262144;
    }

    public static void q(amnd amndVar, amfq amfqVar) {
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.bG = amndVar;
        amfrVar.h |= 2097152;
    }

    public static void r(amtv amtvVar, amfq amfqVar) {
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfr amfrVar2 = amfr.a;
        amfrVar.bt = amtvVar;
        amfrVar.g |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
    }

    public static /* synthetic */ ameo s(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (ameo) s;
    }

    public static void t(int i, aozy aozyVar) {
        if (i != 0) {
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            ameo ameoVar = (ameo) aozyVar.b;
            ameo ameoVar2 = ameo.a;
            ameoVar.d = i - 1;
            ameoVar.b |= 64;
            return;
        }
        throw null;
    }

    public static /* synthetic */ int u(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            default:
                return 0;
        }
    }

    public static alzc v() {
        return alxu.i().c().a();
    }

    public static int w(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        if (intValue >= Level.FINE.intValue()) {
            return 3;
        }
        return 2;
    }

    public static String x(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(String.valueOf(str));
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static /* synthetic */ boolean y(int i, alvr alvrVar, StringBuilder sb) {
        if (i - 1 != 0 || alvrVar == alvr.a) {
            return false;
        }
        sb.append(alvrVar.b());
        sb.append('.');
        sb.append(alvrVar.d());
        sb.append(':');
        sb.append(alvrVar.a());
        return true;
    }

    public static void z(char c, String str, Map map) {
        map.put(Character.valueOf(c), str);
    }

    public String a(alwv alwvVar, alxr alxrVar) {
        throw null;
    }

    public alzz(char[] cArr) {
    }
}
