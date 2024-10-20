package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqzf extends aqzi implements araj, arem {
    public static final Logger q = Logger.getLogger(aqzf.class.getName());
    private aqut a;
    private volatile boolean b;
    private final aren c;
    public final arhu r;
    public final boolean s;

    /* JADX INFO: Access modifiers changed from: protected */
    public aqzf(arhw arhwVar, arhn arhnVar, arhu arhuVar, aqut aqutVar, aqrr aqrrVar) {
        arhuVar.getClass();
        this.r = arhuVar;
        this.s = arcb.i(aqrrVar);
        this.c = new aren(this, arhwVar, arhnVar);
        this.a = aqutVar;
    }

    @Override // defpackage.araj
    public final void b(arch archVar) {
        archVar.b("remote_addr", a().a(aqsw.a));
    }

    @Override // defpackage.araj
    public final void c(Status status) {
        d.t(!status.f(), "Should not cancel with OK status");
        this.b = true;
        p().a(status);
    }

    @Override // defpackage.araj
    public final void e() {
        if (!t().s) {
            t().s = true;
            aren v = v();
            if (!v.h) {
                v.h = true;
                arhv arhvVar = v.b;
                if (arhvVar != null && arhvVar.a() == 0 && v.b != null) {
                    v.b = null;
                }
                v.b(true, true);
            }
        }
    }

    @Override // defpackage.araj
    public final void i(aqsn aqsnVar) {
        this.a.e(arcb.b);
        this.a.h(arcb.b, Long.valueOf(Math.max(0L, aqsnVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.araj
    public final void j(aqsp aqspVar) {
        boolean z;
        aqzh t = t();
        if (t.q == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Already called start");
        aqspVar.getClass();
        t.r = aqspVar;
    }

    @Override // defpackage.araj
    public final void k(int i) {
        ((arej) t().j).b = i;
    }

    @Override // defpackage.araj
    public final void l(int i) {
        boolean z;
        aren arenVar = this.c;
        if (arenVar.a == -1) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "max size already set");
        arenVar.a = i;
    }

    @Override // defpackage.araj
    public final void m(aral aralVar) {
        boolean z;
        aqzh t = t();
        if (t.q == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Already called setListener");
        t.q = aralVar;
        p().c(this.a);
        this.a = null;
    }

    @Override // defpackage.aqzi, defpackage.arho
    public final boolean o() {
        if (q().i() && !this.b) {
            return true;
        }
        return false;
    }

    protected abstract aqze p();

    @Override // defpackage.aqzi
    protected /* bridge */ /* synthetic */ aqzh q() {
        throw null;
    }

    protected abstract aqzh t();

    @Override // defpackage.arem
    public final void u(arhv arhvVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (arhvVar == null && !z) {
            z3 = false;
        }
        d.t(z3, "null frame before EOS");
        p().b(arhvVar, z, z2, i);
    }

    @Override // defpackage.aqzi
    protected final aren v() {
        return this.c;
    }
}
