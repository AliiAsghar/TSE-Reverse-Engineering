package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arfw {
    public final Object a;
    public boolean b;
    Object c;

    public arfw() {
        this.a = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Future, java.lang.Object] */
    public final Future a() {
        this.b = true;
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.b;
            if (!z) {
                this.c = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    public final void c(acis acisVar) {
        synchronized (this.a) {
            if (this.c == null) {
                this.c = new ArrayDeque();
            }
            this.c.add(acisVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final void d(acir acirVar) {
        acis acisVar;
        synchronized (this.a) {
            if (this.c != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.a) {
                        acisVar = (acis) this.c.poll();
                        if (acisVar == null) {
                            this.b = false;
                            return;
                        }
                    }
                    acisVar.a(acirVar);
                }
            }
        }
    }

    public arfw(Object obj) {
        this.a = obj;
    }
}
