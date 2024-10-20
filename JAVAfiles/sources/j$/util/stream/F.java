package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
final class F implements P3 {
    final int a;
    final Object b;
    final Predicate c;
    final Supplier d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(boolean z, EnumC0148h3 enumC0148h3, Object obj, Predicate predicate, Supplier supplier) {
        int i;
        int i2 = EnumC0143g3.u;
        if (z) {
            i = 0;
        } else {
            i = EnumC0143g3.r;
        }
        this.a = i | i2;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.P3
    public final Object b(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        Q3 q3 = (Q3) this.d.get();
        abstractC0114b.R(spliterator, q3);
        Object obj = q3.get();
        if (obj == null) {
            return this.b;
        }
        return obj;
    }

    @Override // j$.util.stream.P3
    public final Object c(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        return new L(this, EnumC0143g3.ORDERED.y(abstractC0114b.G()), abstractC0114b, spliterator).invoke();
    }

    @Override // j$.util.stream.P3
    public final int d() {
        return this.a;
    }
}
