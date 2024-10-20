package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class argn implements arhe {
    public final argo a;
    private final aqsf b;
    private final apzj c;

    public argn(argo argoVar, apzj apzjVar, aqsf aqsfVar) {
        this.a = argoVar;
        this.c = apzjVar;
        this.b = aqsfVar;
        aqsfVar.d(new argm(this, 0), andi.a);
    }

    @Override // defpackage.arhe
    public final void a(Status status) {
        int i = armc.a;
        aqwb aqwbVar = null;
        try {
            if (!status.f()) {
                this.a.c = true;
                this.c.a();
                aqwbVar = new aqwb(Status.c.withDescription("RPC cancelled"), null, false);
            } else {
                this.c.b();
            }
        } finally {
            this.b.j(null);
        }
    }

    @Override // defpackage.arhe
    public final void b() {
        int i = armc.a;
        if (this.a.c) {
            return;
        }
        this.c.c();
    }

    @Override // defpackage.arhq
    public final void d(arhp arhpVar) {
        int i = armc.a;
        if (this.a.c) {
            arcb.g(arhpVar);
            return;
        }
        while (true) {
            try {
                InputStream g = arhpVar.g();
                if (g != null) {
                    try {
                        this.c.d(this.a.a.d.b(g));
                        g.close();
                    } finally {
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                arcb.g(arhpVar);
                alhx.b(th);
                throw new RuntimeException(th);
            }
        }
    }

    @Override // defpackage.arhq
    public final void e() {
        int i = armc.a;
        if (this.a.c) {
            return;
        }
        this.c.e();
    }
}
