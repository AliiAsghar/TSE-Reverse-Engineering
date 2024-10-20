package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ares implements aqty {
    public arex a;
    final /* synthetic */ arey b;

    public ares(arey areyVar) {
        this.b = areyVar;
    }

    @Override // defpackage.aqty
    public final void a(aqse aqseVar) {
        if (!this.b.n) {
            arey.f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{aqseVar, this.a.a});
            this.a.d = aqseVar;
            if (this.b.i.f()) {
                arex arexVar = this.a;
                arey areyVar = this.b;
                if (arexVar == areyVar.h.get(areyVar.i.b())) {
                    this.b.i(this.a);
                    return;
                }
                return;
            }
            return;
        }
        arey.f.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{aqseVar, this.a.a});
    }
}
