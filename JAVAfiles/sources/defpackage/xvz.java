package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvz {
    public static final xze a = xze.g("BugleNetwork", "ChatContentDecoratorGrpc");
    private final vcv b;
    private aqav c;

    public xvz(vcv vcvVar) {
        this.b = vcvVar;
    }

    public final synchronized aqav a() {
        aquc aqucVar;
        if (this.c == null) {
            try {
                vcv vcvVar = this.b;
                synchronized (vcvVar.l) {
                    aqucVar = vcvVar.k;
                    if (aqucVar == null) {
                        alvw d = vcv.a.d();
                        d.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getSmartTachyonGrpcChannel", 233, "GrpcChannelManager.java")).q("Creating Tachyon gRPC Channel");
                        aqucVar = vcvVar.a((String) vcv.c.e(), vcvVar.f(5));
                        vcvVar.k = aqucVar;
                    }
                }
                this.c = (aqav) ((aqav) aqav.g(new wci(11), aqucVar)).i(new arll(this.b.d(), 0));
            } catch (Exception e) {
                a.r("ChatContentDecoratorGrpc: Exception in creating a new stub: ", e);
                this.c = null;
            }
        }
        return this.c;
    }
}
