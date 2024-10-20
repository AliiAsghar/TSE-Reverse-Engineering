package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aigs {
    private static final aigq a = new aigr();
    private final anen b;
    private final adwt c;
    private final adeo d;
    private final adwp e;
    private final agrk f;

    public aigs(anen anenVar, adwp adwpVar, adwt adwtVar, agrk agrkVar, adeo adeoVar) {
        this.b = anenVar;
        this.e = adwpVar;
        this.c = adwtVar;
        this.f = agrkVar;
        this.d = adeoVar;
    }

    public final aigq a(Optional optional, asqc asqcVar) {
        String str;
        if (((Boolean) aczf.o().a.y.a()).booleanValue() && !aczf.o().M()) {
            if (!this.d.f()) {
                advr.c("SIP connection type is Dual Registration, won't establish dedicated bearer.", new Object[0]);
                return a;
            }
            if (optional.isEmpty()) {
                advr.g("No network present, can't establish dedicated bearer.", new Object[0]);
                return a;
            }
            try {
                NetworkInfo e = this.e.e((Network) optional.get());
                e.getClass();
                advr.c("Creating QosHandler. Current network: %s", e.getTypeName());
            } catch (adwk unused) {
            }
            try {
                NetworkCapabilities c = this.e.c((Network) optional.get());
                c.getClass();
                if (!c.hasCapability(4)) {
                    advr.c("Not on IMS network, shouldn't establish dedicated bearer.", new Object[0]);
                    return a;
                }
                int a2 = this.c.a();
                if (a2 != 13 && a2 != 20) {
                    advr.c("Not on LTE nor 5G, shouldn't establish dedicated bearer.", new Object[0]);
                    return a;
                }
                if (a2 == 13) {
                    str = "LTE";
                } else {
                    str = "5G";
                }
                advr.c("Current data network type: %s", str);
                return new aigu(this.b, this.e, (Network) optional.get(), asqcVar, this.f);
            } catch (adwk e2) {
                advr.i(e2, "Can't establish dedicated bearer.", new Object[0]);
                return a;
            }
        }
        advr.c("Flag enableMsrpOverDedicatedBearer is false, won't establish dedicated bearer.", new Object[0]);
        return a;
    }
}
