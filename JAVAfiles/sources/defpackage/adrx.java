package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrx extends adou {
    public final CopyOnWriteArrayList g;
    public final armf h;
    public adrz i;
    public adop j;
    public adxr k;
    public final yjr l;
    public final adpu m;
    public final adxs n;
    public final adze o;
    public final adpg p;
    public final ahjj q;

    public adrx(adew adewVar, adqg adqgVar, armf armfVar, yjr yjrVar, adpu adpuVar, adwe adweVar, adxs adxsVar, adze adzeVar) {
        super(adewVar, adqgVar, adweVar);
        this.g = new CopyOnWriteArrayList();
        this.q = new ahjj(this, (byte[]) null);
        this.p = new adrw(this);
        this.h = armfVar;
        this.l = yjrVar;
        this.m = adpuVar;
        this.n = adxsVar;
        this.o = adzeVar;
    }

    @Override // defpackage.adou
    protected final void e() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            advr.c("Presence service has started", new Object[0]);
        }
    }

    @Override // defpackage.adou
    protected final void f() {
        if (!((adet) this.a).g.mPresenceConfiguration.mUsePresence) {
            if (!aczx.q()) {
                advr.c("Capability Discovery via Presence is disabled by Google.", new Object[0]);
            } else if (!this.a.a().mCapabilityDiscoveryConfiguration.mPresenceDiscovery) {
                advr.c("Capability Discovery via Presence is disabled by configuration.", new Object[0]);
            } else {
                return;
            }
            advr.c("Presence is disabled by configuration! Stopping PresenceService...", new Object[0]);
            k(acok.UNKNOWN);
        }
    }

    @Override // defpackage.adou
    protected final void g(acok acokVar) {
        if (!acokVar.b()) {
            try {
                adrz adrzVar = this.i;
                if (adrzVar == null) {
                    return;
                }
                try {
                    if (adrzVar.j == 0) {
                        this.i = null;
                        return;
                    } else {
                        adrzVar.p();
                        return;
                    }
                } catch (Exception e) {
                    throw new adry("Error while sending presence un-subscription ", e);
                }
            } catch (adry e2) {
                advr.i(e2, "Error while unsubscribing: %s", e2.getMessage());
                return;
            }
        }
        advr.c("Skipping call to unsubscribe due to %s", acokVar);
    }

    @Override // defpackage.adou
    public final void m() {
    }

    @Override // defpackage.adou
    public final void n() {
    }
}
