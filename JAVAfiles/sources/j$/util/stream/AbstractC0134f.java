package j$.util.stream;

/* renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC0134f {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof java.util.stream.LongStream;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof java.util.stream.Stream;
    }

    public static /* bridge */ /* synthetic */ java.util.stream.BaseStream l(java.util.stream.BaseStream baseStream, Runnable runnable) {
        return baseStream.onClose(runnable);
    }

    public static /* bridge */ /* synthetic */ java.util.stream.DoubleStream o(Object obj) {
        return (java.util.stream.DoubleStream) obj;
    }

    public static /* bridge */ /* synthetic */ java.util.stream.IntStream q(Object obj) {
        return (java.util.stream.IntStream) obj;
    }

    public static /* bridge */ /* synthetic */ java.util.stream.LongStream s(Object obj) {
        return (java.util.stream.LongStream) obj;
    }

    public static /* bridge */ /* synthetic */ java.util.stream.Stream t(Object obj) {
        return (java.util.stream.Stream) obj;
    }

    public static /* bridge */ /* synthetic */ void u(java.util.stream.BaseStream baseStream) {
        baseStream.close();
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof java.util.stream.IntStream;
    }

    public static /* bridge */ /* synthetic */ boolean x(java.util.stream.BaseStream baseStream) {
        return baseStream.isParallel();
    }

    public static /* bridge */ /* synthetic */ java.util.stream.BaseStream z(java.util.stream.BaseStream baseStream) {
        return baseStream.unordered();
    }
}
