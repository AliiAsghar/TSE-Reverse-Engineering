package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0209u0 implements P3 {
    final EnumC0204t0 a;
    final Supplier b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0209u0(EnumC0148h3 enumC0148h3, EnumC0204t0 enumC0204t0, Supplier supplier) {
        this.a = enumC0204t0;
        this.b = supplier;
    }

    @Override // j$.util.stream.P3
    public final Object b(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        AbstractC0199s0 abstractC0199s0 = (AbstractC0199s0) this.b.get();
        abstractC0114b.R(spliterator, abstractC0199s0);
        return Boolean.valueOf(abstractC0199s0.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.P3
    public final Object c(AbstractC0114b abstractC0114b, Spliterator spliterator) {
        return (Boolean) new C0214v0(this, abstractC0114b, spliterator).invoke();
    }

    @Override // j$.util.stream.P3
    public final int d() {
        return EnumC0143g3.u | EnumC0143g3.r;
    }
}
