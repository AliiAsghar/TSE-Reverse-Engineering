package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alvu extends Exception {
    public alvu(Throwable th, alwk alwkVar, StackTraceElement[] stackTraceElementArr) {
        super(alwkVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
