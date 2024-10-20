package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtq {
    public Object a;
    public dtu b;
    public dtw c = new dtw();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        dtw dtwVar = this.c;
        if (dtwVar != null) {
            dtwVar.c(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        boolean z = true;
        this.d = true;
        dtu dtuVar = this.b;
        if (dtuVar == null || !dtuVar.b.f(obj)) {
            z = false;
        }
        if (z) {
            e();
        }
        return z;
    }

    public final void c() {
        this.d = true;
        dtu dtuVar = this.b;
        if (dtuVar != null && dtuVar.b.cancel(true)) {
            e();
        }
    }

    public final void d(Throwable th) {
        this.d = true;
        dtu dtuVar = this.b;
        if (dtuVar != null && dtuVar.a(th)) {
            e();
        }
    }

    protected final void finalize() {
        dtw dtwVar;
        dtu dtuVar = this.b;
        if (dtuVar != null && !dtuVar.isDone()) {
            Object obj = this.a;
            Objects.toString(obj);
            dtuVar.a(new dtr("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (!this.d && (dtwVar = this.c) != null) {
            dtwVar.f(null);
        }
    }
}
