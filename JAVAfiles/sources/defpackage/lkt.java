package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkt {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl");
    public final arwe b;
    public final AtomicInteger c;
    public final ascd d;

    public lkt(arwe arweVar) {
        arweVar.getClass();
        this.b = arweVar;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.c = atomicInteger;
        this.d = ascy.a(new lkp(atomicInteger.get()));
    }

    public final void a(lkr lkrVar, lkr lkrVar2) {
        Level level;
        try {
            lkh b = lkrVar2.b();
            int a2 = lkrVar2.a();
            alvi alviVar = a;
            ((alvg) alviVar.g().h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl$Companion", "logTransitioning", 204, "NavigationStateMachineImpl.kt")).N("Transition:\n   from: %s (%s)\n   to: %s (%s)\n   target: %s (%s)\n   requestId: %s", lkrVar.c(), new ahlg(lkrVar.getClass()), lkrVar2.c(), new ahlg(lkrVar2.getClass()), b, new ahlg(b.getClass()), new ahlc(a2));
            lkrVar2.d(lkrVar);
            try {
                boolean g = this.d.g(lkrVar, lkrVar2);
                lkh b2 = lkrVar2.b();
                int a3 = lkrVar2.a();
                String str = "succeeded";
                if (true != g) {
                    str = "failed";
                }
                ahlg ahlgVar = new ahlg(str);
                if (g) {
                    level = Level.INFO;
                } else {
                    level = Level.WARNING;
                }
                ((alvg) alviVar.a(level).h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl$Companion", "logTransitionCompleted", 236, "NavigationStateMachineImpl.kt")).O("Transition completed:\n   from: %s (%s)\n   to: %s (%s)\n   target: %s (%s)\n   requestId: %s\n   update: %s", lkrVar.c(), new ahlg(lkrVar.getClass()), lkrVar2.c(), new ahlg(lkrVar2.getClass()), b2, new ahlg(b2.getClass()), new ahlc(a3), ahlgVar);
            } catch (Exception e) {
                e = e;
                lga.h(lkrVar, lkrVar.b(), lkrVar2.c(), lkrVar2.getClass(), lkrVar2.b(), lkrVar2.a(), e);
                if ((e instanceof lkq) && (lkrVar2 instanceof lki) && !(lkrVar instanceof lkp)) {
                    ((alvg) a.i().h("com/google/android/apps/messaging/navigation/statemachine/NavigationStateMachineImpl", "executeTransition", 185, "NavigationStateMachineImpl.kt")).q("Disregarding duplicate navigation request due to ongoing navigation.");
                    return;
                }
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void b() {
        a((lkr) this.d.c(), new lkp(this.c.incrementAndGet()));
    }
}
