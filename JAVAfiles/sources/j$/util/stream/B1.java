package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class B1 extends AbstractC0219w0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;

    public /* synthetic */ B1(EnumC0148h3 enumC0148h3, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.AbstractC0219w0
    public final T1 Z() {
        switch (this.h) {
            case 0:
                return new S1((LongBinaryOperator) this.i);
            case 1:
                return new E1((DoubleBinaryOperator) this.i);
            case 2:
                return new J1((BinaryOperator) this.i);
            default:
                return new P1((IntBinaryOperator) this.i);
        }
    }
}
