package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aqvh extends apsd {
    public final apsd j;

    /* JADX INFO: Access modifiers changed from: protected */
    public aqvh(apsd apsdVar) {
        super(null);
        this.j = apsdVar;
    }

    @Override // defpackage.apsd
    public void a(Status status, aqut aqutVar) {
        this.j.a(status, aqutVar);
    }

    @Override // defpackage.apsd
    public void c(aqut aqutVar) {
        this.j.c(aqutVar);
    }

    @Override // defpackage.apsd
    public void d(Object obj) {
        this.j.d(obj);
    }

    @Override // defpackage.apsd
    public final void e() {
        this.j.e();
    }

    public final String toString() {
        apsd apsdVar = this.j;
        algv aj = albo.aj(this);
        aj.b("delegate", apsdVar);
        return aj.toString();
    }
}
