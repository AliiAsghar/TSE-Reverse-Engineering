package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqal extends arkz {
    public aqal(aqrs aqrsVar, aqrr aqrrVar) {
        super(aqrsVar, aqrrVar);
    }

    @Override // defpackage.arlb
    public final /* synthetic */ arlb a(aqrs aqrsVar, aqrr aqrrVar) {
        return new aqal(aqrsVar, aqrrVar);
    }

    public final ListenableFuture b(aqdj aqdjVar) {
        aqux aquxVar = aqam.c;
        if (aquxVar == null) {
            synchronized (aqam.class) {
                aquxVar = aqam.c;
                if (aquxVar == null) {
                    aquu a = aqux.a();
                    a.e = aquw.UNARY;
                    a.a = aqux.c("google.internal.communications.instantmessaging.v1.Messaging", "AckMessages");
                    a.b();
                    aqdj aqdjVar2 = aqdj.a;
                    aozs aozsVar = arkx.a;
                    a.c = new arkw(aqdjVar2);
                    a.d = new arkw(aqdk.a);
                    aquxVar = a.a();
                    aqam.c = aquxVar;
                }
            }
        }
        return arlj.a(this.a.a(aquxVar, this.b), aqdjVar);
    }

    public final ListenableFuture c(aqdm aqdmVar) {
        aqux aquxVar = aqam.g;
        if (aquxVar == null) {
            synchronized (aqam.class) {
                aquxVar = aqam.g;
                if (aquxVar == null) {
                    aquu a = aqux.a();
                    a.e = aquw.UNARY;
                    a.a = aqux.c("google.internal.communications.instantmessaging.v1.Messaging", "Echo");
                    a.b();
                    aqdm aqdmVar2 = aqdm.a;
                    aozs aozsVar = arkx.a;
                    a.c = new arkw(aqdmVar2);
                    a.d = new arkw(aqdn.a);
                    aquxVar = a.a();
                    aqam.g = aquxVar;
                }
            }
        }
        return arlj.a(this.a.a(aquxVar, this.b), aqdmVar);
    }

    public final ListenableFuture d(aqea aqeaVar) {
        aqux aquxVar = aqam.b;
        if (aquxVar == null) {
            synchronized (aqam.class) {
                aquxVar = aqam.b;
                if (aquxVar == null) {
                    aquu a = aqux.a();
                    a.e = aquw.UNARY;
                    a.a = aqux.c("google.internal.communications.instantmessaging.v1.Messaging", "PullMessages");
                    a.b();
                    aqea aqeaVar2 = aqea.a;
                    aozs aozsVar = arkx.a;
                    a.c = new arkw(aqeaVar2);
                    a.d = new arkw(aqeb.a);
                    aquxVar = a.a();
                    aqam.b = aquxVar;
                }
            }
        }
        return arlj.a(this.a.a(aquxVar, this.b), aqeaVar);
    }

    public final ListenableFuture e(aqew aqewVar) {
        aqux aquxVar = aqam.e;
        if (aquxVar == null) {
            synchronized (aqam.class) {
                aquxVar = aqam.e;
                if (aquxVar == null) {
                    aquu a = aqux.a();
                    a.e = aquw.UNARY;
                    a.a = aqux.c("google.internal.communications.instantmessaging.v1.Messaging", "RevokeMessagesBySender");
                    a.b();
                    aqew aqewVar2 = aqew.a;
                    aozs aozsVar = arkx.a;
                    a.c = new arkw(aqewVar2);
                    a.d = new arkw(aqex.a);
                    aquxVar = a.a();
                    aqam.e = aquxVar;
                }
            }
        }
        return arlj.a(this.a.a(aquxVar, this.b), aqewVar);
    }

    public final ListenableFuture f(aqdt aqdtVar) {
        return arlj.a(this.a.a(aqam.b(), this.b), aqdtVar);
    }
}
