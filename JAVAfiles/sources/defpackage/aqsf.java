package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsf extends aqsm implements Closeable {
    public final aqsn a;
    public ScheduledFuture b;
    private final aqsm h;
    private ArrayList i;
    private aqsg j;
    private Throwable k;
    private boolean l;

    public aqsf(aqsm aqsmVar) {
        super(aqsmVar, aqsmVar.f);
        this.a = aqsmVar.b();
        this.h = new aqsm(this, this.f);
    }

    @Override // defpackage.aqsm
    public final aqsm a() {
        return this.h.a();
    }

    @Override // defpackage.aqsm
    public final aqsn b() {
        return this.a;
    }

    @Override // defpackage.aqsm
    public final Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.aqsm
    public final void d(aqsg aqsgVar, Executor executor) {
        d.aC(executor, "executor");
        e(new aqsi(executor, aqsgVar, this));
    }

    public final void e(aqsi aqsiVar) {
        synchronized (this) {
            if (i()) {
                aqsiVar.a();
            } else {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(aqsiVar);
                    aqsf aqsfVar = this.e;
                    if (aqsfVar != null) {
                        this.j = new argm(this, 1);
                        aqsfVar.e(new aqsi(aqsh.a, this.j, this));
                    }
                } else {
                    arrayList.add(aqsiVar);
                }
            }
        }
    }

    @Override // defpackage.aqsm
    public final void f(aqsm aqsmVar) {
        this.h.f(aqsmVar);
    }

    @Override // defpackage.aqsm
    public final void g(aqsg aqsgVar) {
        h(aqsgVar, this);
    }

    public final void h(aqsg aqsgVar, aqsm aqsmVar) {
        synchronized (this) {
            ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    aqsi aqsiVar = (aqsi) this.i.get(size);
                    if (aqsiVar.a == aqsgVar && aqsiVar.b == aqsmVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    aqsf aqsfVar = this.e;
                    if (aqsfVar != null) {
                        aqsfVar.h(this.j, aqsfVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.aqsm
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (super.i()) {
                j(super.c());
                return true;
            }
            return false;
        }
    }

    public final void j(Throwable th) {
        int i;
        boolean z;
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            if (!this.l) {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            } else {
                z = false;
                scheduledFuture = null;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                aqsg aqsgVar = this.j;
                this.j = null;
                this.i = null;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    aqsi aqsiVar = (aqsi) arrayList.get(i2);
                    if (aqsiVar.b == this) {
                        aqsiVar.a();
                    }
                }
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    aqsi aqsiVar2 = (aqsi) arrayList.get(i);
                    if (aqsiVar2.b != this) {
                        aqsiVar2.a();
                    }
                }
                aqsf aqsfVar = this.e;
                if (aqsfVar != null) {
                    aqsfVar.h(aqsgVar, aqsfVar);
                }
            }
        }
    }

    public aqsf(aqsm aqsmVar, aqsn aqsnVar) {
        super(aqsmVar, aqsmVar.f);
        this.a = aqsnVar;
        this.h = new aqsm(this, this.f);
    }
}
