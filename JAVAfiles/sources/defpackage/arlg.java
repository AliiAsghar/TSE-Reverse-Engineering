package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arlg extends arlf {
    private final arlq a;
    private final arld b;

    public arlg(arlq arlqVar, arld arldVar) {
        this.a = arlqVar;
        this.b = arldVar;
        ((vfu) arlqVar).a = arldVar;
    }

    @Override // defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        if (status.f()) {
            arlq arlqVar = this.a;
            vfv vfvVar = ((vfu) arlqVar).c;
            if (vfvVar.C) {
                akrh e = aktp.e("ReceiveMessagesResponseObserver::onCompleted");
                try {
                    ((vfu) arlqVar).b.a();
                    e.close();
                    return;
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            akrc b = vfvVar.h.b("ReceiveMessagesResponseObserver#onCompleted");
            try {
                ((vfu) arlqVar).b.a();
                b.close();
                return;
            } catch (Throwable th3) {
                try {
                    b.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        arlq arlqVar2 = this.a;
        aqwb aqwbVar = new aqwb(status, aqutVar);
        vfv vfvVar2 = ((vfu) arlqVar2).c;
        if (vfvVar2.C) {
            akrh e2 = aktp.e("ReceiveMessagesResponseObserver::onError");
            try {
                ((vfu) arlqVar2).b.b(aqwbVar);
                e2.close();
                return;
            } catch (Throwable th5) {
                try {
                    e2.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        }
        akrc b2 = vfvVar2.h.b("ReceiveMessagesResponseObserver#onError");
        try {
            ((vfu) arlqVar2).b.b(aqwbVar);
            b2.close();
        } catch (Throwable th7) {
            try {
                b2.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    @Override // defpackage.apsd
    public final void d(Object obj) {
        arlq arlqVar = this.a;
        aqel aqelVar = (aqel) obj;
        vfv vfvVar = ((vfu) arlqVar).c;
        if (vfvVar.C) {
            akrh e = aktp.e("ReceiveMessagesResponseObserver::onNext");
            try {
                ((vfu) arlqVar).b.c(aqelVar);
                e.close();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            akrc b = vfvVar.h.b("ReceiveMessagesResponseObserver#onNext");
            try {
                ((vfu) arlqVar).b.c(aqelVar);
                b.close();
            } catch (Throwable th3) {
                try {
                    b.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        arld arldVar = this.b;
        if (arldVar.b) {
            arldVar.e();
        }
    }

    @Override // defpackage.arlf
    public final void f() {
        arld arldVar = this.b;
        if (arldVar.a > 0) {
            arldVar.e();
        }
    }

    @Override // defpackage.apsd
    public final void e() {
    }

    @Override // defpackage.apsd
    public final void c(aqut aqutVar) {
    }
}
