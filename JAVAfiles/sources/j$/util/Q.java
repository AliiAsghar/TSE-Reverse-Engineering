package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class Q {
    public static void a(V v, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            v.forEachRemaining((DoubleConsumer) consumer);
        } else if (!w0.a) {
            consumer.getClass();
            v.forEachRemaining((DoubleConsumer) new C(consumer));
        } else {
            w0.a(v.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    public static void b(Y y, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            y.forEachRemaining((IntConsumer) consumer);
        } else if (!w0.a) {
            consumer.getClass();
            y.forEachRemaining((IntConsumer) new G(consumer));
        } else {
            w0.a(y.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    public static void c(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            c0Var.forEachRemaining((LongConsumer) consumer);
        } else if (!w0.a) {
            consumer.getClass();
            c0Var.forEachRemaining((LongConsumer) new K(consumer));
        } else {
            w0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        }
    }

    public static Spliterator d(java.util.SortedSet sortedSet) {
        return new S(sortedSet, sortedSet);
    }

    public static boolean e(V v, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return v.tryAdvance((DoubleConsumer) consumer);
        }
        if (!w0.a) {
            consumer.getClass();
            return v.tryAdvance((DoubleConsumer) new C(consumer));
        }
        w0.a(v.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    public static boolean f(Y y, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return y.tryAdvance((IntConsumer) consumer);
        }
        if (!w0.a) {
            consumer.getClass();
            return y.tryAdvance((IntConsumer) new G(consumer));
        }
        w0.a(y.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    public static boolean g(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return c0Var.tryAdvance((LongConsumer) consumer);
        }
        if (!w0.a) {
            consumer.getClass();
            return c0Var.tryAdvance((LongConsumer) new K(consumer));
        }
        w0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    public static Optional h(java.util.Optional optional) {
        boolean isPresent;
        Object obj;
        if (optional != null) {
            isPresent = optional.isPresent();
            if (isPresent) {
                obj = optional.get();
                return Optional.of(obj);
            }
            return Optional.empty();
        }
        return null;
    }

    public static OptionalDouble i(java.util.OptionalDouble optionalDouble) {
        boolean isPresent;
        double asDouble;
        if (optionalDouble != null) {
            isPresent = optionalDouble.isPresent();
            if (isPresent) {
                asDouble = optionalDouble.getAsDouble();
                return OptionalDouble.b(asDouble);
            }
            return OptionalDouble.a();
        }
        return null;
    }

    public static OptionalInt j(java.util.OptionalInt optionalInt) {
        boolean isPresent;
        int asInt;
        if (optionalInt != null) {
            isPresent = optionalInt.isPresent();
            if (isPresent) {
                asInt = optionalInt.getAsInt();
                return OptionalInt.of(asInt);
            }
            return OptionalInt.empty();
        }
        return null;
    }

    public static OptionalLong k(java.util.OptionalLong optionalLong) {
        boolean isPresent;
        long asLong;
        if (optionalLong != null) {
            isPresent = optionalLong.isPresent();
            if (isPresent) {
                asLong = optionalLong.getAsLong();
                return OptionalLong.of(asLong);
            }
            return OptionalLong.empty();
        }
        return null;
    }

    public static java.util.Optional l(Optional optional) {
        java.util.Optional empty;
        java.util.Optional of;
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            of = java.util.Optional.of(optional.get());
            return of;
        }
        empty = java.util.Optional.empty();
        return empty;
    }

    public static java.util.OptionalDouble m(OptionalDouble optionalDouble) {
        java.util.OptionalDouble empty;
        java.util.OptionalDouble of;
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            of = java.util.OptionalDouble.of(optionalDouble.getAsDouble());
            return of;
        }
        empty = java.util.OptionalDouble.empty();
        return empty;
    }

    public static java.util.OptionalInt n(OptionalInt optionalInt) {
        java.util.OptionalInt empty;
        java.util.OptionalInt of;
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            of = java.util.OptionalInt.of(optionalInt.getAsInt());
            return of;
        }
        empty = java.util.OptionalInt.empty();
        return empty;
    }

    public static java.util.OptionalLong o(OptionalLong optionalLong) {
        java.util.OptionalLong empty;
        java.util.OptionalLong of;
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            of = java.util.OptionalLong.of(optionalLong.getAsLong());
            return of;
        }
        empty = java.util.OptionalLong.empty();
        return empty;
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
