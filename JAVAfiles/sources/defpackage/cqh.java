package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqh extends CancellationException {
    public static final cqh a = new cqh();

    private cqh() {
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(crv.a);
        return this;
    }
}
