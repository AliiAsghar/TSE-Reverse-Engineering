package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arxn extends CancellationException implements arvz {
    public final transient arxm a;

    public arxn(String str, Throwable th, arxm arxmVar) {
        super(str);
        this.a = arxmVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.arvz
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (arwh.a) {
            String message = getMessage();
            message.getClass();
            return new arxn(message, this, this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arxn) {
            arxn arxnVar = (arxn) obj;
            if (d.F(arxnVar.getMessage(), getMessage()) && d.F(arxnVar.a, this.a)) {
                if (d.F(arxnVar.getCause(), getCause())) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (arwh.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        message.getClass();
        int hashCode = (message.hashCode() * 31) + this.a.hashCode();
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
