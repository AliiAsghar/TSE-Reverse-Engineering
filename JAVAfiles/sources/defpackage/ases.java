package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ases extends RuntimeException {
    private final transient arpi a;

    public ases(arpi arpiVar) {
        this.a = arpiVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
