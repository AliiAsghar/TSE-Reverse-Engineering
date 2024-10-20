package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes5.dex */
final class H2 extends AbstractC0130e0 {
    @Override // j$.util.stream.AbstractC0114b
    public final I0 K(AbstractC0114b abstractC0114b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0143g3.SORTED.y(abstractC0114b.G())) {
            return abstractC0114b.s(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((E0) abstractC0114b.s(spliterator, true, intFunction)).d();
        Arrays.sort(iArr);
        return new C0131e1(iArr);
    }

    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        interfaceC0182o2.getClass();
        if (EnumC0143g3.SORTED.y(i)) {
            return interfaceC0182o2;
        }
        if (EnumC0143g3.SIZED.y(i)) {
            return new AbstractC0152i2(interfaceC0182o2);
        }
        return new AbstractC0152i2(interfaceC0182o2);
    }
}
