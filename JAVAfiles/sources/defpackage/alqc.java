package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alqc extends alor implements NavigableMap, Map {
    public static final Comparator a;
    private static final alqc e;
    private static final long serialVersionUID = 0;
    public final transient alth c;
    public final transient alog d;
    private transient alqc f;

    static {
        also alsoVar = also.a;
        a = alsoVar;
        alth G = alqf.G(alsoVar);
        int i = alog.d;
        e = new alqc(G, alsx.a);
    }

    public alqc(alth althVar, alog alogVar, alqc alqcVar) {
        this.c = althVar;
        this.d = alogVar;
        this.f = alqcVar;
    }

    private final alqc A(int i, int i2) {
        if (i == 0) {
            if (i2 != size()) {
                i = 0;
            } else {
                return this;
            }
        }
        if (i == i2) {
            return u(comparator());
        }
        return new alqc(this.c.K(i, i2), this.d.subList(i, i2));
    }

    public static alqc a(java.util.Map map, Comparator comparator) {
        boolean z = false;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 == null) {
                if (comparator == a) {
                    z = true;
                }
            } else {
                z = comparator.equals(comparator2);
            }
        }
        if (z && (map instanceof alqc)) {
            alqc alqcVar = (alqc) map;
            if (!alqcVar.gY()) {
                return alqcVar;
            }
        }
        return v(comparator, z, map.entrySet());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alqc u(Comparator comparator) {
        if (also.a.equals(comparator)) {
            return e;
        }
        alth G = alqf.G(comparator);
        int i = alog.d;
        return new alqc(G, alsx.a);
    }

    public static alqc v(Comparator comparator, boolean z, Iterable iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) alzz.aV(iterable, b);
        int length = entryArr.length;
        if (length != 0) {
            int i = 1;
            if (length != 1) {
                Object[] objArr = new Object[length];
                Object[] objArr2 = new Object[length];
                if (z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Map.Entry entry = entryArr[i2];
                        entry.getClass();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        albo.v(key, value);
                        objArr[i2] = key;
                        objArr2[i2] = value;
                    }
                } else {
                    Arrays.sort(entryArr, 0, length, new kdw(comparator, 12));
                    Map.Entry entry2 = entryArr[0];
                    entry2.getClass();
                    Object key2 = entry2.getKey();
                    objArr[0] = key2;
                    Object value2 = entry2.getValue();
                    objArr2[0] = value2;
                    albo.v(objArr[0], value2);
                    while (i < length) {
                        Map.Entry entry3 = entryArr[i - 1];
                        entry3.getClass();
                        Map.Entry entry4 = entryArr[i];
                        entry4.getClass();
                        Object key3 = entry4.getKey();
                        Object value3 = entry4.getValue();
                        albo.v(key3, value3);
                        objArr[i] = key3;
                        objArr2[i] = value3;
                        if (comparator.compare(key2, key3) != 0) {
                            i++;
                            key2 = key3;
                        } else {
                            throw new IllegalArgumentException(a.bY(entry4, entry3, "Multiple entries with same key: ", " and "));
                        }
                    }
                }
                return new alqc(new alth(alog.h(objArr), comparator), alog.h(objArr2));
            }
            Map.Entry entry5 = entryArr[0];
            entry5.getClass();
            return x(comparator, entry5.getKey(), entry5.getValue());
        }
        return u(comparator);
    }

    public static alqc x(Comparator comparator, Object obj, Object obj2) {
        return new alqc(new alth(alog.r(obj), comparator), alog.r(obj2));
    }

    @Override // defpackage.alor
    public final alnu c() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return alzz.ag(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((alqf) this.c).a;
    }

    @Override // defpackage.alor
    /* renamed from: d */
    public final alnu values() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        alqc alqcVar = this.f;
        if (alqcVar == null) {
            if (isEmpty()) {
                return u(alsr.b(comparator()).a());
            }
            return new alqc((alth) this.c.descendingSet(), this.d.a(), this);
        }
        return alqcVar;
    }

    @Override // defpackage.alor, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // defpackage.alor
    public final alpt f() {
        if (isEmpty()) {
            return altg.a;
        }
        return new alpz(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return alzz.ag(floorEntry(obj));
    }

    @Override // defpackage.alor
    public final alpt g() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.alor
    public final boolean gY() {
        if (!this.c.l() && !this.d.l()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // defpackage.alor, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            alth r0 = r3.c
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            alog r2 = r0.d     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.a     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            alog r0 = r3.d
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqc.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return alzz.ag(higherEntry(obj));
    }

    @Override // defpackage.alor, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return alzz.ag(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.alor
    /* renamed from: r */
    public final /* synthetic */ alpt keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // defpackage.alor, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final alqc headMap(Object obj, boolean z) {
        obj.getClass();
        return A(0, this.c.I(obj, z));
    }

    @Override // defpackage.alor
    public Object writeReplace() {
        return new alqb(this);
    }

    @Override // java.util.NavigableMap
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final alqc subMap(Object obj, boolean z, Object obj2, boolean z2) {
        boolean z3;
        obj.getClass();
        obj2.getClass();
        if (comparator().compare(obj, obj2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        albo.Q(z3, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final alqc tailMap(Object obj, boolean z) {
        obj.getClass();
        return A(this.c.J(obj, z), size());
    }

    public alqc(alth althVar, alog alogVar) {
        this(althVar, alogVar, null);
    }
}
