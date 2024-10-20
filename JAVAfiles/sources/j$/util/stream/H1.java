package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes5.dex */
final class H1 extends AbstractC0219w0 {
    final /* synthetic */ DoubleBinaryOperator h;
    final /* synthetic */ double i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H1(EnumC0148h3 enumC0148h3, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }

    @Override // j$.util.stream.AbstractC0219w0
    public final T1 Z() {
        return new C1(this.i, this.h);
    }
}
