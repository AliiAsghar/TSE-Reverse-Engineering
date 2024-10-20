package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvr extends arvx {
    public final arvb a;

    public arvr(arpe arpeVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException(a.cc(arpeVar, "Continuation ", " was cancelled normally")) : th, z);
        this.a = new arvb(false, arvf.a);
    }
}
