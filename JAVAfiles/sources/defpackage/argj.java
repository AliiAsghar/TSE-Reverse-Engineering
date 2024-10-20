package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class argj extends argi {
    private final AtomicIntegerFieldUpdater a;

    public argj(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.argi
    public final boolean a(argl arglVar) {
        return this.a.compareAndSet(arglVar, 0, -1);
    }

    @Override // defpackage.argi
    public final void b(argl arglVar) {
        this.a.set(arglVar, 0);
    }
}
