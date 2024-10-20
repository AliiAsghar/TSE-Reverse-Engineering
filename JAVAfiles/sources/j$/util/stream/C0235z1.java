package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0235z1 extends AbstractC0219w0 {
    final /* synthetic */ LongBinaryOperator h;
    final /* synthetic */ long i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0235z1(EnumC0148h3 enumC0148h3, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.AbstractC0219w0
    public final T1 Z() {
        return new R1(this.i, this.h);
    }
}
