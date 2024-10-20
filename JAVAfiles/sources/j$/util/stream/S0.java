package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class S0 extends T0 implements G0 {
    @Override // j$.util.stream.H0
    public final Object c(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0219w0.s(this, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0219w0.v(this, j, j2);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC0219w0.p(this, (Long[]) objArr, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.f0, j$.util.stream.m1] */
    @Override // j$.util.stream.I0
    public final j$.util.f0 spliterator() {
        return new AbstractC0171m1(this);
    }

    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return new AbstractC0171m1(this);
    }
}
