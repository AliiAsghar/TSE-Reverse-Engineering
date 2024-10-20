package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class argt implements arhe {
    public final aqsf a;
    private final Executor b;
    private final Executor c;
    private final arhd d;
    private arhe e;

    public argt(Executor executor, Executor executor2, arhd arhdVar, aqsf aqsfVar) {
        this.b = executor;
        this.c = executor2;
        this.d = arhdVar;
        this.a = aqsfVar;
    }

    @Override // defpackage.arhe
    public final void a(Status status) {
        int i = armc.a;
        if (!status.f()) {
            Throwable th = status.r;
            if (th == null) {
                th = new aqwb(Status.c.withDescription("RPC cancelled"), null, false);
            }
            this.c.execute(new gul(this.a, th, 6));
        }
        this.b.execute(new argp(this, status));
    }

    @Override // defpackage.arhe
    public final void b() {
        int i = armc.a;
        this.b.execute(new argq(this));
    }

    public final arhe c() {
        arhe arheVar = this.e;
        if (arheVar != null) {
            return arheVar;
        }
        throw new IllegalStateException("listener unset");
    }

    @Override // defpackage.arhq
    public final void d(arhp arhpVar) {
        int i = armc.a;
        this.b.execute(new argr(this, arhpVar));
    }

    @Override // defpackage.arhq
    public final void e() {
        int i = armc.a;
        this.b.execute(new args(this));
    }

    public final void f(Throwable th) {
        this.d.e(Status.d.withDescription("Application error processing RPC").d(th), new aqut());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(arhe arheVar) {
        boolean z;
        arheVar.getClass();
        if (this.e == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Listener already set");
        this.e = arheVar;
    }
}
