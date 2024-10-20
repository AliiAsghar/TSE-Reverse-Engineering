package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqar extends arkz {
    public aqar(aqrs aqrsVar, aqrr aqrrVar) {
        super(aqrsVar, aqrrVar);
    }

    @Override // defpackage.arlb
    public final /* synthetic */ arlb a(aqrs aqrsVar, aqrr aqrrVar) {
        return new aqar(aqrsVar, aqrrVar);
    }

    public final ListenableFuture b(aqeq aqeqVar) {
        aqux aquxVar = aqas.c;
        if (aquxVar == null) {
            synchronized (aqas.class) {
                aquxVar = aqas.c;
                if (aquxVar == null) {
                    aquu a = aqux.a();
                    a.e = aquw.UNARY;
                    a.a = aqux.c("google.internal.communications.instantmessaging.v1.Registration", "RegisterRefresh");
                    a.b();
                    aqeq aqeqVar2 = aqeq.a;
                    aozs aozsVar = arkx.a;
                    a.c = new arkw(aqeqVar2);
                    a.d = new arkw(aqer.a);
                    aquxVar = a.a();
                    aqas.c = aquxVar;
                }
            }
        }
        return arlj.a(this.a.a(aquxVar, this.b), aqeqVar);
    }
}
