package defpackage;

import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aipg {
    public final aipj a;
    public final long b = System.nanoTime();
    private final Throwable c;

    public aipg(aipj aipjVar, Throwable th) {
        this.a = aipjVar;
        this.c = th;
    }

    public static aipg a(aipj aipjVar, Throwable th) {
        th.getClass();
        return new aipg(aipjVar, th);
    }

    public final Optional b() {
        return Optional.ofNullable(this.c);
    }

    public final boolean c() {
        if (this.c == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format(Locale.US, "StateTransition<%s>(state: %s, isValid: %s, transitionTimeNanos: %d, failureCause: %s)", this.a.getClass().getName(), this.a, Boolean.valueOf(c()), Long.valueOf(this.b), b().orElse(null));
    }
}
