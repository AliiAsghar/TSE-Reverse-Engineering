package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class D1 extends AbstractC0219w0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;
    final /* synthetic */ Object j;
    final /* synthetic */ Object k;

    public /* synthetic */ D1(EnumC0148h3 enumC0148h3, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.AbstractC0219w0
    public final T1 Z() {
        switch (this.h) {
            case 0:
                return new A1((Supplier) this.i, (ObjLongConsumer) this.k, (C0208u) this.j);
            case 1:
                return new G1((Supplier) this.i, (ObjDoubleConsumer) this.k, (C0208u) this.j);
            case 2:
                return new I1(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new M1((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new Q1((Supplier) this.i, (ObjIntConsumer) this.k, (C0208u) this.j);
        }
    }
}
