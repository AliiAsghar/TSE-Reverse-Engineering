package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.CapabilityConfiguration;
import com.google.android.ims.provisioning.config.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpz implements adpx {
    private final adqa a;
    private final yjr b;
    private final adpu c;
    private final aikc d;
    private final adps e;
    private final adqg f;
    private final adta g;
    private final adta h;
    private final adqg i;

    public adpz(adqg adqgVar, adqa adqaVar, yjr yjrVar, adpu adpuVar, aikc aikcVar, adps adpsVar, adta adtaVar, adqg adqgVar2, adta adtaVar2) {
        this.i = adqgVar;
        this.a = adqaVar;
        this.b = yjrVar;
        this.c = adpuVar;
        this.d = aikcVar;
        this.e = adpsVar;
        this.g = adtaVar;
        this.f = adqgVar2;
        this.h = adtaVar2;
    }

    @Override // defpackage.adpx
    public final adpw a(adew adewVar, adqg adqgVar, adwe adweVar, Configuration configuration, adrx adrxVar, Context context) {
        CapabilityConfiguration capabilityConfiguration;
        if (!aczf.R() && aczx.q() && (capabilityConfiguration = configuration.mCapabilityDiscoveryConfiguration) != null && capabilityConfiguration.mPresenceDiscovery) {
            advr.k("Using Capabilities Discovery over Presence.", new Object[0]);
            return new adqf(adewVar, adqgVar, this.a, this.i, adrxVar, context, this.b, this.c, adweVar, this.f, this.h);
        }
        advr.k("Using OPTIONS Capabilities Discovery.", new Object[0]);
        return new adqd(adewVar, adqgVar, this.a, this.d, this.b, this.e, this.c, this.g, adweVar);
    }
}
