package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aqsm {
    public static final Logger c = Logger.getLogger(aqsm.class.getName());
    public static final aqsm d = new aqsm();
    final aqsf e;
    public final aqvm f;
    public final int g;

    private aqsm() {
        this.e = null;
        this.f = null;
        this.g = 0;
        e(0);
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static aqsm k() {
        aqsm a = aqsk.a.a();
        if (a == null) {
            return d;
        }
        return a;
    }

    public aqsm a() {
        aqsm b = aqsk.a.b(this);
        if (b == null) {
            return d;
        }
        return b;
    }

    public aqsn b() {
        aqsf aqsfVar = this.e;
        if (aqsfVar == null) {
            return null;
        }
        return aqsfVar.a;
    }

    public Throwable c() {
        aqsf aqsfVar = this.e;
        if (aqsfVar == null) {
            return null;
        }
        return aqsfVar.c();
    }

    public void d(aqsg aqsgVar, Executor executor) {
        d.aC(executor, "executor");
        aqsf aqsfVar = this.e;
        if (aqsfVar == null) {
            return;
        }
        aqsfVar.e(new aqsi(executor, aqsgVar, this));
    }

    public void f(aqsm aqsmVar) {
        d.aC(aqsmVar, "toAttach");
        aqsk.a.c(this, aqsmVar);
    }

    public void g(aqsg aqsgVar) {
        aqsf aqsfVar = this.e;
        if (aqsfVar == null) {
            return;
        }
        aqsfVar.h(aqsgVar, this);
    }

    public boolean i() {
        aqsf aqsfVar = this.e;
        if (aqsfVar == null) {
            return false;
        }
        return aqsfVar.i();
    }

    public final aqsm l(aqsj aqsjVar, Object obj) {
        aqvm c2;
        aqvm aqvmVar = this.f;
        if (aqvmVar == null) {
            c2 = new aqvl(aqsjVar, obj, 0);
        } else {
            c2 = aqvmVar.c(aqsjVar, obj, aqsjVar.hashCode(), 0);
        }
        return new aqsm(this, c2);
    }

    public aqsm(aqsm aqsmVar, aqvm aqvmVar) {
        this.e = aqsmVar instanceof aqsf ? (aqsf) aqsmVar : aqsmVar.e;
        this.f = aqvmVar;
        int i = aqsmVar.g + 1;
        this.g = i;
        e(i);
    }

    public aqsm(aqvm aqvmVar, int i) {
        this.e = null;
        this.f = aqvmVar;
        this.g = i;
        e(i);
    }
}
