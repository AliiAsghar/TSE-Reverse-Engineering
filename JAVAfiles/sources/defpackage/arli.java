package defpackage;

import io.grpc.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arli extends arlf {
    private final arle a;
    private Object b;
    private boolean c = false;

    public arli(arle arleVar) {
        this.a = arleVar;
    }

    @Override // defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        if (status.f()) {
            if (!this.c) {
                this.a.setException(new aqwb(Status.m.withDescription("No value received for unary call"), aqutVar));
            }
            this.a.set(this.b);
            return;
        }
        this.a.setException(new aqwb(status, aqutVar));
    }

    @Override // defpackage.apsd
    public final void d(Object obj) {
        if (!this.c) {
            this.b = obj;
            this.c = true;
            return;
        }
        throw new aqwb(Status.m.withDescription("More than one value received for unary call"));
    }

    @Override // defpackage.arlf
    public final void f() {
        this.a.a.e(2);
    }

    @Override // defpackage.apsd
    public final void c(aqut aqutVar) {
    }
}
