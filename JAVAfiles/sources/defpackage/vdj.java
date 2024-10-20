package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdj implements vcw {
    private final vcv a;
    private final /* synthetic */ int b;

    public vdj(vcv vcvVar, int i) {
        this.b = i;
        this.a = vcvVar;
    }

    @Override // defpackage.vcw
    public final aquc a() {
        aquc aqucVar;
        aquc aqucVar2;
        if (this.b != 0) {
            vcv vcvVar = this.a;
            synchronized (vcvVar.q) {
                aqucVar2 = vcvVar.p;
                if (aqucVar2 == null) {
                    alvw d = vcv.a.d();
                    d.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getDittoGrpcChannel", 220, "GrpcChannelManager.java")).q("Creating Ditto gRPC Channel");
                    vcvVar.p = vcvVar.a((String) vcv.b.e(), vcvVar.f(2));
                    aqucVar2 = vcvVar.p;
                }
            }
            return aqucVar2;
        }
        vcv vcvVar2 = this.a;
        synchronized (vcvVar2.n) {
            aqucVar = vcvVar2.m;
            if (aqucVar == null) {
                String e = vcvVar2.e();
                alvw d2 = vcv.a.d();
                d2.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getTachyonPhoneGrpcChannel", 266, "GrpcChannelManager.java")).q("Creating Tachyon Phone gRPC Channel");
                aqucVar = vcvVar2.c(e);
                vcvVar2.m = aqucVar;
            }
        }
        return aqucVar;
    }

    @Override // defpackage.vcw
    public final aqut b() {
        if (this.b != 0) {
            return this.a.d();
        }
        return this.a.d();
    }
}
