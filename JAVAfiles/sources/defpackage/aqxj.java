package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxj implements aqvt {
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.aqvt
    public final apzj a(aqvr aqvrVar, aqut aqutVar, aqvs aqvsVar) {
        ListenableFuture bH;
        Status status;
        aksr aksrVar = (aksr) aqvrVar.c().a(aqxk.a);
        aqux f = aqvrVar.f();
        String str = f.c;
        boolean z = f.f;
        if (!z || (bH = (ListenableFuture) ((ConcurrentHashMap) aksrVar.c).get(str)) == null) {
            Object obj = aksrVar.b;
            int i = aksrVar.a;
            asmb asmbVar = (asmb) ((asqc) obj).a;
            aqww aqwwVar = (aqww) ((alor) asmbVar.a).getOrDefault(str, asmbVar.b);
            if (aqwwVar instanceof aqwo) {
                bH = ((aqwo) aqwwVar).b(i);
            } else {
                try {
                    bH = albo.bI(aqwwVar.a(i));
                } catch (Exception e) {
                    bH = albo.bH(e);
                }
            }
            if (z) {
                ((ConcurrentHashMap) aksrVar.c).putIfAbsent(str, bH);
                albo.bR(bH, new ahjd(aksrVar, str, bH, 8), andi.a);
            }
        }
        if (!bH.isDone()) {
            ?? r0 = aksrVar.d;
            aqyl aqylVar = new aqyl();
            albo.bR(bH, new aqxi(aqvrVar, aqylVar, aqutVar, aqvsVar, 0), r0);
            return aqylVar;
        }
        try {
            status = (Status) albo.bQ(bH);
        } catch (CancellationException | ExecutionException e2) {
            Status d = Status.m.d(e2);
            String message = e2.getMessage();
            if (message != null) {
                status = d.withDescription(message);
            } else {
                status = d;
            }
        }
        if (status.f()) {
            return aqvsVar.a(aqvrVar, aqutVar);
        }
        aqvrVar.a(status, new aqut());
        return new apzj(null);
    }
}
