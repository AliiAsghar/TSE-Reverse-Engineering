package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vbs {
    public final Object b = new Object();
    public final ConcurrentMap c = new ConcurrentHashMap();
    private final armf e;
    private final armf f;
    private final anen g;
    private final yzk h;
    private static final xze d = xze.g("BugleNetwork", "PhoneRegistrationProviderCache");
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache");

    public vbs(armf armfVar, yzk yzkVar, armf armfVar2, anen anenVar) {
        this.f = armfVar;
        this.h = yzkVar;
        this.e = armfVar2;
        this.g = anenVar;
    }

    @Deprecated
    public final akul a(vgm vgmVar) {
        return d(vgmVar.a, 11);
    }

    public final akul b(String str) {
        akul af;
        ((vev) this.f.b()).a(str, 4);
        synchronized (this.b) {
            akul akulVar = (akul) this.c.get(str);
            if (akulVar != null) {
                d.p("Using cached phone registration providerFuture");
                return akulVar;
            }
            if (((adjc) this.e.b()).v(str)) {
                alvw d2 = a.d();
                d2.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache", "createProvider", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "PhoneRegistrationProviderCache.java")).q("Creating phone registration providerFuture by phone number.");
                af = aktp.ag(this.h.b(new vgm(str)));
            } else {
                alvw i = a.i();
                i.X(alwp.a, "BugleNetwork");
                alvg alvgVar = (alvg) i;
                alvgVar.X(ydl.D, str);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache", "createProvider", 209, "PhoneRegistrationProviderCache.java")).q("The provided phone number is not RCS available.");
                af = aktp.af(new vbc());
            }
            af.k(new vbr(this, str, 0), this.g);
            this.c.putIfAbsent(str, af);
            return (akul) this.c.get(str);
        }
    }

    public final akul c(String str) {
        synchronized (this.b) {
            akul akulVar = (akul) this.c.get(str);
            if (akulVar != null) {
                d.p("Using cached phone registration providerFuture");
                return akulVar;
            }
            d.p("Creating phone registration providerFuture by phone number without validating RCS.");
            akul ag = aktp.ag(this.h.b(new vgm(str)));
            this.c.putIfAbsent(str, ag);
            return ag;
        }
    }

    public final akul d(String str, int i) {
        ((vev) this.f.b()).a(str, i);
        return b(str);
    }
}
