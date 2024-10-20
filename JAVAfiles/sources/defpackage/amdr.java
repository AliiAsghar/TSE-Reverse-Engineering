package defpackage;

import j$.time.Duration;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class amdr implements Serializable {
    public static int c(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        albo.P(z, "%s (%s) must be > 0", "numAttempts", i);
        return Math.min(i, 131072);
    }

    public static amdr d(Duration duration, double d, int i) {
        return new amdn(f(duration), d, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void e(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.P(z, "%s (%s) must be >= 0", "tries", i);
    }

    private static long f(Duration duration) {
        if (duration.compareTo(Duration.ofMillis(Long.MAX_VALUE)) >= 0) {
            return Long.MAX_VALUE;
        }
        if (duration.compareTo(Duration.ofMillis(Long.MIN_VALUE)) <= 0) {
            return Long.MIN_VALUE;
        }
        try {
            return duration.toMillis();
        } catch (ArithmeticException unused) {
            if (!duration.isNegative()) {
                return Long.MAX_VALUE;
            }
            return Long.MIN_VALUE;
        }
    }

    @Deprecated
    public abstract long a(int i);

    public boolean b(int i) {
        throw null;
    }
}
