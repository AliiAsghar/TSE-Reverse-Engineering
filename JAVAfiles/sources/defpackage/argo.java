package defpackage;

import io.grpc.Status;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class argo extends aqvr {
    private static final Logger d = Logger.getLogger(argo.class.getName());
    public final aqux a;
    public final aqsf b;
    public volatile boolean c;
    private final arhd e;
    private final byte[] f;
    private final aqsp g;
    private final aqzx h;
    private boolean i;
    private boolean j;
    private aqsa k;
    private boolean l;

    public argo(arhd arhdVar, aqux aquxVar, aqut aqutVar, aqsf aqsfVar, aqsp aqspVar, aqzx aqzxVar) {
        this.e = arhdVar;
        this.a = aquxVar;
        this.b = aqsfVar;
        this.f = (byte[]) aqutVar.b(arcb.d);
        this.g = aqspVar;
        this.h = aqzxVar;
        aqzxVar.b();
    }

    public static /* bridge */ /* synthetic */ void h(argo argoVar) {
        argoVar.c = true;
    }

    private final void i(Throwable th) {
        Status withDescription;
        d.logp(Level.WARNING, "io.grpc.internal.ServerCallImpl", "handleInternalError", "Cancelling the stream because of internal error", th);
        if (th instanceof aqwb) {
            withDescription = ((aqwb) th).a;
        } else {
            withDescription = Status.m.d(th).withDescription("Internal error so cancelling stream.");
        }
        this.e.c(withDescription);
        this.h.a(false);
    }

    private final void j(Object obj) {
        albo.U(this.i, "sendHeaders has not been called");
        albo.U(!this.j, "call is closed");
        aqux aquxVar = this.a;
        if (aquxVar.a.b() && this.l) {
            i(new aqwb(Status.m.withDescription("Too many responses")));
            return;
        }
        this.l = true;
        try {
            this.e.n(aquxVar.e.a(obj));
            aquw aquwVar = this.a.a;
        } catch (Error e) {
            a(Status.c.withDescription("Server sendMessage() failed with Error"), new aqut());
            throw e;
        } catch (RuntimeException e2) {
            i(e2);
        }
    }

    @Override // defpackage.aqvr
    public final void a(Status status, aqut aqutVar) {
        int i = armc.a;
        albo.U(!this.j, "call already closed");
        try {
            this.j = true;
            if (status.f() && this.a.a.b() && !this.l) {
                i(new aqwb(Status.m.withDescription("Completed without a response")));
            } else {
                this.e.e(status, aqutVar);
            }
        } finally {
            this.h.a(status.f());
        }
    }

    @Override // defpackage.aqvr
    public final void b(aqut aqutVar) {
        int i = armc.a;
        albo.U(!this.i, "sendHeaders has already been called");
        albo.U(!this.j, "call is closed");
        aqutVar.e(arcb.g);
        aqutVar.e(arcb.c);
        if (this.k == null) {
            this.k = aqry.a;
        } else {
            byte[] bArr = this.f;
            if (bArr != null) {
                Iterator it = arcb.q.a(new String(bArr, arcb.a)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (d.B(it.next(), "identity")) {
                            break;
                        }
                    } else {
                        this.k = aqry.a;
                        break;
                    }
                }
            } else {
                this.k = aqry.a;
            }
        }
        aqutVar.h(arcb.c, "identity");
        aqutVar.e(arcb.d);
        byte[] bArr2 = this.g.c;
        if (bArr2.length != 0) {
            aqutVar.h(arcb.d, bArr2);
        }
        this.i = true;
        arhd arhdVar = this.e;
        aquw aquwVar = this.a.a;
        arhdVar.j(aqutVar);
    }

    @Override // defpackage.aqvr
    public final aqrm c() {
        return this.e.a();
    }

    @Override // defpackage.aqvr
    public final void d(int i) {
        int i2 = armc.a;
        this.e.g(i);
    }

    @Override // defpackage.aqvr
    public final boolean e() {
        if (this.j) {
            return false;
        }
        return this.e.o();
    }

    @Override // defpackage.aqvr
    public final aqux f() {
        return this.a;
    }

    @Override // defpackage.aqvr
    public final void g(Object obj) {
        int i = armc.a;
        j(obj);
    }
}
