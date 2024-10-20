package j$.util;

import java.util.NoSuchElementException;
import java.util.function.LongConsumer;

/* loaded from: classes5.dex */
public final class OptionalLong {
    private static final OptionalLong c = new OptionalLong();
    private final boolean a;
    private final long b;

    private OptionalLong() {
        this.a = false;
        this.b = 0L;
    }

    public static OptionalLong empty() {
        return c;
    }

    public static OptionalLong of(long j) {
        return new OptionalLong(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalLong)) {
            return false;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        boolean z = this.a;
        if (z && optionalLong.a) {
            if (this.b == optionalLong.b) {
                return true;
            }
        } else if (z == optionalLong.a) {
            return true;
        }
        return false;
    }

    public long getAsLong() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (this.a) {
            long j = this.b;
            return (int) (j ^ (j >>> 32));
        }
        return 0;
    }

    public void ifPresent(LongConsumer longConsumer) {
        if (this.a) {
            longConsumer.accept(this.b);
        }
    }

    public boolean isPresent() {
        return this.a;
    }

    public long orElse(long j) {
        if (this.a) {
            return this.b;
        }
        return j;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalLong[" + this.b + "]";
        }
        return "OptionalLong.empty";
    }

    private OptionalLong(long j) {
        this.a = true;
        this.b = j;
    }
}
