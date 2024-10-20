package j$.util;

import java.util.Spliterator;
import java.util.stream.DoubleStream;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class Z {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof Spliterator.OfInt;
    }

    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof Spliterator.OfLong;
    }

    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof Spliterator.OfPrimitive;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof DoubleStream;
    }

    public static /* bridge */ /* synthetic */ Spliterator.OfDouble b(Object obj) {
        return (Spliterator.OfDouble) obj;
    }

    public static /* bridge */ /* synthetic */ Spliterator.OfInt c(Object obj) {
        return (Spliterator.OfInt) obj;
    }

    public static /* bridge */ /* synthetic */ Spliterator.OfLong d(Object obj) {
        return (Spliterator.OfLong) obj;
    }

    public static /* bridge */ /* synthetic */ Spliterator.OfPrimitive f(Object obj) {
        return (Spliterator.OfPrimitive) obj;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof Spliterator.OfDouble;
    }
}
