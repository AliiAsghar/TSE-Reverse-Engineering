package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolr extends apsd {
    public final apsd a;
    private final aktr b;

    public aolr(apsd apsdVar) {
        super(null);
        this.a = apsdVar;
        this.b = aktr.b();
    }

    private final void f(Runnable runnable) {
        if (!akqj.u()) {
            aktr.d(this.b, runnable).run();
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.apsd
    public final void a(Status status, aqut aqutVar) {
        f(new aofo(this, status, aqutVar, 11, (byte[]) null));
    }

    @Override // defpackage.apsd
    public final void c(aqut aqutVar) {
        f(new aofk(this, aqutVar, 18));
    }

    @Override // defpackage.apsd
    public final void d(Object obj) {
        f(new aofk(this, obj, 19));
    }

    @Override // defpackage.apsd
    public final void e() {
        apsd apsdVar = this.a;
        apsdVar.getClass();
        f(new aomp(apsdVar, 1));
    }
}
