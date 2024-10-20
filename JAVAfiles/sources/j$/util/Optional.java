package j$.util;

import j$.util.stream.Stream;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        if (t == null) {
            return empty();
        }
        return of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        return Objects.equals(this.a, ((Optional) obj).a);
    }

    public Optional<T> filter(Predicate<? super T> predicate) {
        predicate.getClass();
        if (!isPresent()) {
            return this;
        }
        if (predicate.test((Object) this.a)) {
            return this;
        }
        return empty();
    }

    public <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> function) {
        function.getClass();
        if (!isPresent()) {
            return empty();
        }
        Optional<? extends U> apply = function.apply((Object) this.a);
        apply.getClass();
        return apply;
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        defpackage.a aVar = (Object) this.a;
        if (aVar != null) {
            consumer.accept(aVar);
        }
    }

    public void ifPresentOrElse(Consumer<? super T> consumer, Runnable runnable) {
        defpackage.a aVar = (Object) this.a;
        if (aVar != null) {
            consumer.accept(aVar);
        } else {
            runnable.run();
        }
    }

    public boolean isEmpty() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    public boolean isPresent() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        function.getClass();
        if (!isPresent()) {
            return empty();
        }
        return ofNullable(function.apply((Object) this.a));
    }

    public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier) {
        supplier.getClass();
        if (isPresent()) {
            return this;
        }
        Optional<? extends T> optional = supplier.get();
        optional.getClass();
        return optional;
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t = (T) this.a;
        if (t == null) {
            return supplier.get();
        }
        return t;
    }

    public T orElseThrow() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public Stream<T> stream() {
        if (!isPresent()) {
            return Stream.CC.empty();
        }
        return Stream.CC.of(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }

    private Optional(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw supplier.get();
    }
}
