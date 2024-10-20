package defpackage;

import android.content.Intent;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwc implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;

    public gwc(gwd gwdVar, int i) {
        this.a = i;
        this.b = gwdVar;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        boolean isEmpty2;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                Process.setThreadPriority(0);
                this.b.run();
                return;
            }
            fhm fhmVar = (fhm) this.b;
            for (fhu fhuVar : fhmVar.i) {
                fhuVar.k(true);
                fhuVar.i();
            }
            lxs lxsVar = fhmVar.w;
            if (lxsVar.b != null) {
                lxsVar.b = null;
            }
            lxsVar.a = null;
            return;
        }
        gsy.a().c(gwd.a, "Checking if commands are complete.");
        gwd.e();
        Object obj = this.b;
        synchronized (((gwd) obj).g) {
            if (((gwd) obj).h != null) {
                gsy.a().c(gwd.a, "Removing command " + ((gwd) obj).h);
                if (((Intent) ((gwd) obj).g.remove(0)).equals(((gwd) obj).h)) {
                    ((gwd) obj).h = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            Object obj2 = ((gwd) obj).j.b;
            gvw gvwVar = ((gwd) obj).f;
            synchronized (gvwVar.d) {
                isEmpty = gvwVar.c.isEmpty();
            }
            if (isEmpty && ((gwd) obj).g.isEmpty()) {
                synchronized (((gzx) obj2).b) {
                    isEmpty2 = ((gzx) obj2).a.isEmpty();
                }
                if (isEmpty2) {
                    gsy.a().c(gwd.a, "No more commands & intents.");
                    gwb gwbVar = ((gwd) obj).i;
                    if (gwbVar != null) {
                        gwbVar.a();
                    }
                }
            }
            if (!((gwd) obj).g.isEmpty()) {
                ((gwd) obj).c();
            }
        }
    }

    public gwc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
