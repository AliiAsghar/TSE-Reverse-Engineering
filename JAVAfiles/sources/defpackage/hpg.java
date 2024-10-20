package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpg implements Runnable {
    public final Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hpg(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [hxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [hxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [hxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [hxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [hxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [hxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [hxd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        hop hopVar;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        try {
                            this.a.run();
                            return;
                        } finally {
                            ((ahis) this.b).a();
                        }
                    }
                    Object obj = this.b;
                    Object obj2 = ((alce) obj).e;
                    ?? r2 = this.a;
                    synchronized (obj2) {
                        try {
                            ((alce) obj).f = (alcc) albo.bQ(r2);
                            throw null;
                        } catch (Exception unused) {
                            alcd alcdVar = ((alce) obj).g;
                            if (alcdVar != null && alcdVar.a == r2) {
                                ((alce) obj).g = null;
                            }
                            return;
                        } catch (Throwable th) {
                            alcd alcdVar2 = ((alce) obj).g;
                            if (alcdVar2 != null && alcdVar2.a == r2) {
                                ((alce) obj).g = null;
                            }
                            throw th;
                        }
                    }
                }
                synchronized (this.a.a()) {
                    synchronized (this.b) {
                        if (((hpj) this.b).a.c(this.a)) {
                            ((hpj) this.b).j.d();
                            Object obj3 = this.b;
                            try {
                                this.a.e(((hpj) obj3).j, ((hpj) obj3).l);
                                ((hpj) this.b).g(this.a);
                            } finally {
                            }
                        }
                        ((hpj) this.b).c();
                    }
                }
                return;
            }
            fzu fzuVar = (fzu) ((AtomicReference) this.a).get();
            if (fzuVar != null) {
                Iterator it = ((fzi) this.b).l.iterator();
                while (it.hasNext()) {
                    ((arqr) it.next()).a(fzuVar);
                }
                return;
            }
            return;
        }
        synchronized (this.a.a()) {
            synchronized (this.b) {
                if (((hpj) this.b).a.c(this.a)) {
                    Object obj4 = this.b;
                    try {
                        this.a.d(((hpj) obj4).h);
                    } finally {
                    }
                }
                ((hpj) this.b).c();
            }
        }
    }

    public hpg(fzi fziVar, int i) {
        this.c = i;
        this.b = fziVar;
        this.a = new AtomicReference(null);
    }
}
