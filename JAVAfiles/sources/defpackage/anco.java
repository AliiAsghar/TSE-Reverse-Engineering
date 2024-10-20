package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class anco extends ancn {
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;

    public anco(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.ancn
    public final int a(ancq ancqVar) {
        return this.b.decrementAndGet(ancqVar);
    }

    @Override // defpackage.ancn
    public final void b(ancq ancqVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.a;
            if (atomicReferenceFieldUpdater.compareAndSet(ancqVar, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(ancqVar) == null);
    }
}
