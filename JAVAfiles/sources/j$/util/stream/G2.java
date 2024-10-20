package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes5.dex */
final class G2 extends A {
    @Override // j$.util.stream.AbstractC0114b
    public final I0 K(AbstractC0114b abstractC0114b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0143g3.SORTED.y(abstractC0114b.G())) {
            return abstractC0114b.s(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((C0) abstractC0114b.s(spliterator, true, intFunction)).d();
        Arrays.sort(dArr);
        return new V0(dArr);
    }

    @Override // j$.util.stream.AbstractC0114b
    public final InterfaceC0182o2 N(int i, InterfaceC0182o2 interfaceC0182o2) {
        interfaceC0182o2.getClass();
        if (EnumC0143g3.SORTED.y(i)) {
            return interfaceC0182o2;
        }
        if (EnumC0143g3.SIZED.y(i)) {
            return new AbstractC0147h2(interfaceC0182o2);
        }
        return new AbstractC0147h2(interfaceC0182o2);
    }
}
