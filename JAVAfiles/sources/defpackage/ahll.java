package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahll extends ahlh {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.ahlh
    public final void i(ahka ahkaVar) {
        ((alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitBackgroundSignal", 148, "ForegroundTracker.java")).q("App transition to background");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ahlj) it.next()).i(ahkaVar);
        }
    }

    @Override // defpackage.ahlh
    public final void j(ahka ahkaVar) {
        ((alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitForegroundSignal", 140, "ForegroundTracker.java")).q("App transition to foreground");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ahlj) it.next()).j(ahkaVar);
        }
    }
}
