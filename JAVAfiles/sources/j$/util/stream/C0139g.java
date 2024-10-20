package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;

/* renamed from: j$.util.stream.g */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0139g implements BaseStream {
    public final /* synthetic */ java.util.stream.BaseStream a;

    private /* synthetic */ C0139g(java.util.stream.BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ BaseStream i(java.util.stream.BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C0144h ? ((C0144h) baseStream).a : j$.util.Z.D(baseStream) ? D.i(AbstractC0134f.o(baseStream)) : AbstractC0134f.w(baseStream) ? IntStream.VivifiedWrapper.convert(AbstractC0134f.q(baseStream)) : AbstractC0134f.B(baseStream) ? C0180o0.i(AbstractC0134f.s(baseStream)) : AbstractC0134f.D(baseStream) ? C0123c3.i(AbstractC0134f.t(baseStream)) : new C0139g(baseStream);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.BaseStream baseStream = this.a;
        if (obj instanceof C0139g) {
            obj = ((C0139g) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        boolean isParallel;
        isParallel = this.a.isParallel();
        return isParallel;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator iterator2() {
        Iterator it;
        it = this.a.iterator();
        return it;
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        java.util.stream.BaseStream onClose;
        onClose = this.a.onClose(runnable);
        return i(onClose);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ BaseStream parallel() {
        java.util.stream.BaseStream parallel;
        parallel = this.a.parallel();
        return i(parallel);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* synthetic */ BaseStream sequential() {
        java.util.stream.BaseStream sequential;
        sequential = this.a.sequential();
        return i(sequential);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        java.util.Spliterator spliterator;
        spliterator = this.a.spliterator();
        return j$.util.g0.a(spliterator);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        java.util.stream.BaseStream unordered;
        unordered = this.a.unordered();
        return i(unordered);
    }
}
