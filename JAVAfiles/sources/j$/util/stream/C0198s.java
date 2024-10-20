package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0198s extends AbstractC0137f2 {
    static M0 U(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        C0169m c0169m = new C0169m(9);
        C0169m c0169m2 = new C0169m(10);
        return new M0((Collection) new D1(EnumC0148h3.REFERENCE, new C0169m(11), c0169m2, c0169m, 3).c(abstractC0114b, spliterator));
    }

    @Override // j$.util.stream.AbstractC0114b
    final I0 K(AbstractC0114b abstractC0114b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0143g3.DISTINCT.y(abstractC0114b.G())) {
            return abstractC0114b.s(spliterator, false, intFunction);
        }
        if (EnumC0143g3.ORDERED.y(abstractC0114b.G())) {
            return U(abstractC0114b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new P(new C0164l(5, atomicBoolean, concurrentHashMap), false).c(abstractC0114b, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new M0(keySet);
    }

    @Override // j$.util.stream.AbstractC0114b
    final Spliterator L(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        if (EnumC0143g3.DISTINCT.y(abstractC0114b.G())) {
            return abstractC0114b.T(spliterator);
        }
        if (EnumC0143g3.ORDERED.y(abstractC0114b.G())) {
            return U(abstractC0114b, spliterator).spliterator();
        }
        return new C0188p3(abstractC0114b.T(spliterator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        interfaceC0182o2.getClass();
        if (EnumC0143g3.DISTINCT.y(i)) {
            return interfaceC0182o2;
        }
        if (EnumC0143g3.SORTED.y(i)) {
            return new C0189q(interfaceC0182o2);
        }
        return new r(interfaceC0182o2);
    }
}
