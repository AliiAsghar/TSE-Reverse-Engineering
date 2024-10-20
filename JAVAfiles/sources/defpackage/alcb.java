package defpackage;

import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alcb implements andy {
    private final atpk a;

    public alcb(atpk atpkVar) {
        this.a = atpkVar;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (th instanceof ExecutionException) {
            th = th.getCause();
        }
        atpk atpkVar = this.a;
        if ((th instanceof albw) && ((albw) th).a()) {
            ((aqro) atpkVar.b).a(Status.n.withDescription("Credentials failed to obtain metadata").d(th));
        } else {
            ((aqro) atpkVar.b).a(Status.i.withDescription("Failed computing credential metadata").d(th));
        }
    }

    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        aqut aqutVar;
        Map map = ((alcc) obj).b;
        atpk atpkVar = this.a;
        try {
            synchronized (atpkVar.a) {
                Object obj2 = atpkVar.a;
                Map map2 = ((aqwm) obj2).e;
                if (map2 == null || map2 != map) {
                    aqut aqutVar2 = new aqut();
                    for (String str : map.keySet()) {
                        if (str.endsWith("-bin")) {
                            aqul aqulVar = new aqul(str, aqut.b);
                            Iterator it = ((List) map.get(str)).iterator();
                            while (it.hasNext()) {
                                aqutVar2.h(aqulVar, amcn.e.k((String) it.next()));
                            }
                        } else {
                            aquj aqujVar = new aquj(str, aqut.c);
                            Iterator it2 = ((List) map.get(str)).iterator();
                            while (it2.hasNext()) {
                                aqutVar2.h(aqujVar, (String) it2.next());
                            }
                        }
                    }
                    ((aqwm) obj2).d = aqutVar2;
                    ((aqwm) atpkVar.a).e = map;
                }
                aqutVar = ((aqwm) atpkVar.a).d;
            }
            Object obj3 = atpkVar.b;
            aqro aqroVar = (aqro) obj3;
            albo.U(!aqroVar.i, "apply() or fail() already called");
            aqutVar.getClass();
            aqroVar.c.f(aqutVar);
            aqsm a = aqroVar.e.a();
            try {
                araj b = ((aqro) obj3).a.b(((aqro) obj3).b, ((aqro) obj3).c, ((aqro) obj3).d, ((aqro) obj3).f);
                aqroVar.e.f(a);
                aqroVar.b(b);
            } catch (Throwable th) {
                aqroVar.e.f(a);
                throw th;
            }
        } catch (Throwable th2) {
            ((aqro) atpkVar.b).a(Status.i.withDescription("Failed to convert credential metadata").d(th2));
        }
    }
}
