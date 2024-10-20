package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crj extends CancellationException {
    public crj() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(crv.a);
        return this;
    }
}
