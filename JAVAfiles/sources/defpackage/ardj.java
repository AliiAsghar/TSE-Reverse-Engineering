package defpackage;

import io.grpc.Status;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ardj extends apzj {
    final ardi d;
    final aqvd e;
    final /* synthetic */ ardr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ardj(ardr ardrVar, ardi ardiVar, aqvd aqvdVar) {
        super(null);
        this.f = ardrVar;
        this.d = ardiVar;
        aqvdVar.getClass();
        this.e = aqvdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0224, code lost:
    
        if (r15.a.c().equals(r0.c()) == false) goto L81;
     */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.apzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.grpc.Status k(defpackage.aqvb r15) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ardj.k(aqvb):io.grpc.Status");
    }

    public final void m(Status status) {
        ardr.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{this.f.h, status});
        ardo ardoVar = this.f.J;
        if (ardoVar.a.get() == ardr.e) {
            ared aredVar = ardoVar.c.L;
            if (aredVar != null) {
                ardoVar.d(aredVar.a());
                ardr ardrVar = ardoVar.c;
                ardrVar.K = ardrVar.L;
                ardrVar.H.a(4, "Initial Name Resolution error, using default service config");
            } else {
                ardoVar.d(null);
            }
        }
        ardr ardrVar2 = this.f;
        if (ardrVar2.T != 3) {
            ardrVar2.H.b(3, "Failed to resolve name: {0}", status);
            this.f.T = 3;
        }
        ardi ardiVar = this.d;
        if (ardiVar != this.f.u) {
            return;
        }
        ardiVar.a.b.b(status);
    }
}
