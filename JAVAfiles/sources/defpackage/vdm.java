package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdm {
    public static final utz a = uuh.f(uuh.b, "verified_sms_registration_deadline_timeout_ms", TimeUnit.SECONDS.toMillis(60));
    private anmd b;
    private final Object c = new Object();
    private final vcv d;

    public vdm(vcv vcvVar) {
        this.d = vcvVar;
    }

    public final anmd a() {
        anmd anmdVar;
        aquc aqucVar;
        synchronized (this.c) {
            if (this.b == null) {
                vcv vcvVar = this.d;
                synchronized (vcvVar.w) {
                    aqucVar = vcvVar.v;
                    if (aqucVar == null) {
                        alvw d = vcv.a.d();
                        d.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getVerifiedSmsChannel", 323, "GrpcChannelManager.java")).q("Creating Verified SMS Channel gRPC Channel");
                        aqucVar = vcvVar.b((String) utw.U.e(), ((Long) vcv.g.e()).longValue(), ((Long) vcv.h.e()).longValue(), vcvVar.f(8));
                        vcvVar.v = aqucVar;
                    }
                }
                anmd anmdVar2 = (anmd) anmd.g(new wci(2), aqucVar);
                aqut aqutVar = new aqut();
                aqutVar.h(new aquj("X-Goog-Api-Key", aqut.c), "AIzaSyAKnDfiZeg6YM0hdZq29oAdumr3VXOcYJc");
                this.b = (anmd) anmdVar2.i(new arll(aqutVar, 0));
            }
            anmdVar = this.b;
        }
        return anmdVar;
    }
}
