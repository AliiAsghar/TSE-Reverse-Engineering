package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class O1 extends AbstractC0219w0 {
    final /* synthetic */ IntBinaryOperator h;
    final /* synthetic */ int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O1(EnumC0148h3 enumC0148h3, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.AbstractC0219w0
    public final T1 Z() {
        return new N1(this.i, this.h);
    }
}
