package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgc extends CancellationException {
    public cgc() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(cgd.a);
        return this;
    }
}
