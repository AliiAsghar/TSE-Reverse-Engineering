package defpackage;

import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsr implements lsq {
    public static final uuf a = uuh.e(uuh.b, "setup_vendor_ims_delay_ms", 5000);
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final aneo f;
    private final aneo g;
    private final armf h;

    public lsr(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, aneo aneoVar, aneo aneoVar2, armf armfVar5) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = aneoVar;
        this.g = aneoVar2;
        this.h = armfVar5;
    }

    @Override // defpackage.lsq
    public final akul a(lss lssVar) {
        akul ag;
        if (!((adnk) this.c.b()).F(lssVar.b)) {
            advr.q("[SR]: There's no valid configuration available. Skipping RcsEngine init.", new Object[0]);
            ag = aktp.ag(new RcsEngineLifecycleServiceResult(0));
        } else if (aczx.u()) {
            advr.k("[SR]: Called RcsEngineLifecycleManagerV2 to init RcsEngine in SR mode.", new Object[0]);
            vsz vszVar = (vsz) this.h.b();
            final int i = lssVar.c;
            ag = vszVar.a(new vsy() { // from class: vsv
                @Override // defpackage.vsy
                public final RcsEngineLifecycleServiceResult a(RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2) {
                    return rcsEngineLifecycleServiceV2.initialize(i, 2);
                }
            }, true);
        } else {
            advr.c("RcsSettings__enableRcsEngineInitializationByBugle is disabled. Skipping RcsEngine init.", new Object[0]);
            ag = aktp.ag(new RcsEngineLifecycleServiceResult(0));
        }
        return ag.i(new ikd(this, lssVar, 11), this.g);
    }
}
