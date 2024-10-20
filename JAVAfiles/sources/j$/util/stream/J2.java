package j$.util.stream;

import j$.util.Comparator;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes5.dex */
final class J2 extends AbstractC0137f2 {
    private final boolean m;
    private final Comparator n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J2(AbstractC0142g2 abstractC0142g2) {
        super(abstractC0142g2, EnumC0143g3.q | EnumC0143g3.o, 0);
        this.m = true;
        this.n = Comparator.CC.naturalOrder();
    }

    @Override // j$.util.stream.AbstractC0114b
    public final I0 K(AbstractC0114b abstractC0114b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0143g3.SORTED.y(abstractC0114b.G()) && this.m) {
            return abstractC0114b.s(spliterator, false, intFunction);
        }
        Object[] p = abstractC0114b.s(spliterator, true, intFunction).p(intFunction);
        Arrays.sort(p, this.n);
        return new L0(p);
    }

    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        interfaceC0182o2.getClass();
        if (EnumC0143g3.SORTED.y(i) && this.m) {
            return interfaceC0182o2;
        }
        boolean y = EnumC0143g3.SIZED.y(i);
        java.util.Comparator comparator = this.n;
        if (y) {
            return new C2(interfaceC0182o2, comparator);
        }
        return new C2(interfaceC0182o2, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J2(AbstractC0142g2 abstractC0142g2, java.util.Comparator comparator) {
        super(abstractC0142g2, EnumC0143g3.q | EnumC0143g3.p, 0);
        this.m = false;
        comparator.getClass();
        this.n = comparator;
    }
}
