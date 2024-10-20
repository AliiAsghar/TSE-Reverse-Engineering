package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bx extends rw {
    final /* synthetic */ AtomicReference a;

    public bx(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.rw
    public final void a() {
        rw rwVar = (rw) this.a.getAndSet(null);
        if (rwVar != null) {
            rwVar.a();
        }
    }

    @Override // defpackage.rw
    public final void b(Object obj, efu efuVar) {
        rw rwVar = (rw) this.a.get();
        if (rwVar != null) {
            rwVar.b(obj, efuVar);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
