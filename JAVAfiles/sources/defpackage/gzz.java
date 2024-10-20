package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzz implements Runnable {
    private final gud a;
    private final boolean b;
    private final int c;
    private final hgi d;

    public gzz(gud gudVar, hgi hgiVar, boolean z, int i) {
        gudVar.getClass();
        this.a = gudVar;
        this.d = hgiVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean f;
        lhm d;
        if (this.b) {
            gud gudVar = this.a;
            hgi hgiVar = this.d;
            int i = this.c;
            String str = ((gyg) hgiVar.a).a;
            synchronized (gudVar.j) {
                d = gudVar.d(str);
            }
            f = gud.f(str, d, i);
        } else {
            gud gudVar2 = this.a;
            hgi hgiVar2 = this.d;
            int i2 = this.c;
            String str2 = ((gyg) hgiVar2.a).a;
            synchronized (gudVar2.j) {
                if (gudVar2.e.get(str2) != null) {
                    gsy.a().c(gud.a, a.bW(str2, "Ignored stopWork. WorkerWrapper ", " is in foreground"));
                } else {
                    Set set = (Set) gudVar2.g.get(str2);
                    if (set != null && set.contains(hgiVar2)) {
                        f = gud.f(str2, gudVar2.d(str2), i2);
                    }
                }
                f = false;
            }
        }
        gsy.a().c(gsy.b("StopWorkRunnable"), "StopWorkRunnable for " + ((gyg) this.d.a).a + "; Processor.stopWork = " + f);
    }
}
