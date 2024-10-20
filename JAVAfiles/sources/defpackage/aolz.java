package defpackage;

import android.app.Service;
import android.os.IBinder;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolz {
    private static final alvi a = alvi.m("com/google/frameworks/client/data/android/server/Endpoint");
    private final enq b;
    private final ScheduledExecutorService c;
    private final aqsx d;
    private final algw e;
    private final aqwr f;

    public aolz(Service service, ScheduledExecutorService scheduledExecutorService, aqsx aqsxVar, algw algwVar) {
        d.t(service instanceof enq, "A service hosting an Endpoint must be a LifecycleService");
        this.b = (enq) service;
        this.c = scheduledExecutorService;
        this.d = aqsxVar;
        this.e = algwVar;
        this.f = new aqwr();
        ((alvg) ((alvg) a.g()).h("com/google/frameworks/client/data/android/server/Endpoint", "<init>", 59, "Endpoint.java")).t("Created gRPC endpoint for service %s", service.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, android.os.IBinder] */
    public final IBinder a() {
        ?? r0 = this.f.a;
        r0.getClass();
        return r0;
    }

    public final void b(asmb asmbVar) {
        c(asmbVar, aqwt.a);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List, java.lang.Object] */
    public final void c(asmb asmbVar, aqwt aqwtVar) {
        arep arepVar;
        agqr.a();
        aqsv aqsvVar = new aqsv(aqwn.b(this.b), this.f);
        aqsvVar.n(asmbVar);
        aqxc aqxcVar = aqsvVar.e;
        aqwtVar.getClass();
        aqxcVar.e = aqwtVar;
        arhb arhbVar = aqsvVar.d;
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            arepVar = new arhm(scheduledExecutorService, 1);
        } else {
            arepVar = arhb.e;
        }
        arhbVar.k = arepVar;
        ScheduledExecutorService scheduledExecutorService2 = this.c;
        aqxc aqxcVar2 = aqsvVar.e;
        scheduledExecutorService2.getClass();
        aqxcVar2.d = new arhm(scheduledExecutorService2, 1);
        aqsx aqsxVar = this.d;
        arhb arhbVar2 = aqsvVar.d;
        if (aqsxVar == null) {
            aqsxVar = arhb.f;
        }
        arhbVar2.j = aqsxVar;
        aqsp aqspVar = new aqsp();
        arhb arhbVar3 = aqsvVar.d;
        arhbVar3.l = aqspVar;
        arhbVar3.m = aqsb.a();
        Iterator it = ((alha) this.e).a.iterator();
        while (it.hasNext()) {
            aqsvVar.j((aqvt) it.next());
        }
        aqvq m = aqsvVar.m();
        try {
            ((argz) m).d();
            aqam.n(this.b.N(), m);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to start Server for Endpoint Service ".concat(String.valueOf(String.valueOf(this.b.getClass()))), e);
        }
    }
}
