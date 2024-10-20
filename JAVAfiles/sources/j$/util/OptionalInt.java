package j$.util;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* loaded from: classes5.dex */
public final class OptionalInt {
    private static final OptionalInt c = new OptionalInt();
    private final boolean a;
    private final int b;

    private OptionalInt() {
        this.a = false;
        this.b = 0;
    }

    public static OptionalInt empty() {
        return c;
    }

    public static OptionalInt of(int i) {
        return new OptionalInt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalInt)) {
            return false;
        }
        OptionalInt optionalInt = (OptionalInt) obj;
        boolean z = this.a;
        if (z && optionalInt.a) {
            if (this.b == optionalInt.b) {
                return true;
            }
        } else if (z == optionalInt.a) {
            return true;
        }
        return false;
    }

    public int getAsInt() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public void ifPresent(IntConsumer intConsumer) {
        if (this.a) {
            intConsumer.accept(this.b);
        }
    }

    public boolean isPresent() {
        return this.a;
    }

    public int orElse(int i) {
        if (this.a) {
            return this.b;
        }
        return i;
    }

    public int orElseThrow() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final String toString() {
        if (this.a) {
            return "OptionalInt[" + this.b + "]";
        }
        return "OptionalInt.empty";
    }

    private OptionalInt(int i) {
        this.a = true;
        this.b = i;
    }
}
