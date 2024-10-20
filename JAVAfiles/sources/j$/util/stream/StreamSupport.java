package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes5.dex */
public final class StreamSupport {
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.IntStream, j$.util.stream.b] */
    public static IntStream a(j$.util.Y y) {
        return new AbstractC0114b(y, EnumC0143g3.u(y), false);
    }

    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean z) {
        spliterator.getClass();
        return (Stream<T>) new AbstractC0114b(spliterator, EnumC0143g3.u(spliterator), z);
    }
}
