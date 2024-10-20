package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aqvi extends aqvr {
    private final aqvr a;

    /* JADX INFO: Access modifiers changed from: protected */
    public aqvi(aqvr aqvrVar) {
        this.a = aqvrVar;
    }

    @Override // defpackage.aqvr
    public void a(Status status, aqut aqutVar) {
        this.a.a(status, aqutVar);
    }

    @Override // defpackage.aqvr
    public void b(aqut aqutVar) {
        this.a.b(aqutVar);
    }

    @Override // defpackage.aqvr
    public final aqrm c() {
        return this.a.c();
    }

    @Override // defpackage.aqvr
    public final void d(int i) {
        this.a.d(i);
    }

    @Override // defpackage.aqvr
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.aqvr
    public final aqux f() {
        return this.a.f();
    }

    @Override // defpackage.aqvr
    public final void g(Object obj) {
        this.a.g(obj);
    }

    public final String toString() {
        aqvr aqvrVar = this.a;
        algv aj = albo.aj(this);
        aj.b("delegate", aqvrVar);
        return aj.toString();
    }
}
