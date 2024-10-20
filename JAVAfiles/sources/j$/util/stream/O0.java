package j$.util.stream;

import j$.util.C0096f;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* loaded from: classes5.dex */
public final /* synthetic */ class O0 implements LongFunction, IntFunction {
    public IntFunction a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object apply = this.a.apply(i);
        if (apply == null) {
            return null;
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (AbstractC0134f.w(apply)) {
            return IntStream.VivifiedWrapper.convert(AbstractC0134f.q(apply));
        }
        C0096f.a("java.util.stream.IntStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC0219w0.D(j, this.a);
    }
}
