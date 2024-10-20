package j$.util.stream;

import j$.util.C0096f;
import j$.util.stream.Collector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0128d3 {
    public static Set a(Set set) {
        Collector.Characteristics characteristics;
        Collector.Characteristics characteristics2;
        Collector.Characteristics characteristics3;
        Collector.Characteristics characteristics4;
        if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Object next = set.iterator().next();
            if (next instanceof Collector.Characteristics) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        Collector.Characteristics characteristics5 = (Collector.Characteristics) it.next();
                        if (characteristics5 == null) {
                            characteristics4 = null;
                        } else if (characteristics5 == Collector.Characteristics.CONCURRENT) {
                            characteristics4 = Collector.Characteristics.CONCURRENT;
                        } else {
                            characteristics4 = characteristics5 == Collector.Characteristics.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                        }
                        hashSet.add(characteristics4);
                    } catch (ClassCastException e) {
                        C0096f.a("java.util.stream.Collector.Characteristics", e);
                        throw null;
                    }
                }
                return hashSet;
            }
            if (AbstractC0118b3.v(next)) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics h = AbstractC0118b3.h(it2.next());
                        if (h != null) {
                            characteristics = Collector.Characteristics.CONCURRENT;
                            if (h != characteristics) {
                                characteristics2 = Collector.Characteristics.UNORDERED;
                                if (h == characteristics2) {
                                    characteristics3 = Collector.Characteristics.UNORDERED;
                                } else {
                                    characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
                                }
                            } else {
                                characteristics3 = Collector.Characteristics.CONCURRENT;
                            }
                        } else {
                            characteristics3 = null;
                        }
                        hashSet.add(characteristics3);
                    } catch (ClassCastException e2) {
                        C0096f.a("java.util.stream.Collector.Characteristics", e2);
                        throw null;
                    }
                }
                return hashSet;
            }
            C0096f.a("java.util.stream.Collector.Characteristics", next.getClass());
            throw null;
        }
        return set;
    }
}
