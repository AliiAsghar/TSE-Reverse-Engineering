package defpackage;

import android.net.Uri;
import android.telephony.ims.RcsUceAdapter;
import android.util.LruCache;
import com.google.android.ims.rcsservice.contacts.CapabilitiesUpdateEvent;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lse implements psz {
    public static final utz a = uuh.i(uuh.b, "always_send_single_reg_capability_exchange_over_network", false);
    public static final xze b = xze.g("Bugle", "SingleRegistrationRcsContactsAdapter");
    public final lru c;
    private final acnh d;
    private final adtn e;
    private final xyt f;
    private final anen g;
    private final anen h;
    private final lpg i;
    private final wfh j;

    public lse(acnh acnhVar, adtn adtnVar, xyt xytVar, anen anenVar, anen anenVar2, lru lruVar, wfh wfhVar, lpg lpgVar) {
        this.d = acnhVar;
        this.e = adtnVar;
        this.f = xytVar;
        this.g = anenVar;
        this.h = anenVar2;
        this.c = lruVar;
        this.j = wfhVar;
        this.i = lpgVar;
    }

    private final akul i(msh mshVar, Uri uri) {
        akul af;
        acnh acnhVar = this.d;
        int b2 = this.e.b();
        acnf acnfVar = (acnf) acnhVar;
        if (!((Boolean) acnfVar.b.a()).booleanValue()) {
            af = aktp.af(new UnsupportedOperationException());
        } else if (acnfVar.g()) {
            af = aktp.af(new acng("[SR] Cannot retry uce call yet. Still within backoff period."));
        } else {
            try {
                RcsUceAdapter a2 = ((acnf) acnhVar).a(b2);
                long nextLong = acnfVar.f.nextLong();
                af = akul.g(d.m(new acnd(acnfVar, nextLong, uri, a2, 1))).h(new tti(acnhVar, nextLong, 7), acnfVar.c);
            } catch (acng e) {
                af = aktp.af(e);
            }
        }
        return af.f(acng.class, new jab(3), this.g).h(new ijq(this, mshVar, 10), this.g).h(new ijq(this, mshVar, 11), this.g);
    }

    private final boolean j() {
        if (((vrn) this.f.a()).d() != amwt.AVAILABLE) {
            return true;
        }
        return false;
    }

    public final psv a(adpo adpoVar) {
        return psv.b(this.i.a(adpoVar.i));
    }

    @Override // defpackage.psz
    public final akul b(msh mshVar) {
        akul h;
        if (j()) {
            return aktp.af(new psx("Rcs is disabled"));
        }
        try {
            Uri i = lqn.i(mshVar);
            if (((Boolean) a.e()).booleanValue()) {
                h = i(mshVar, i);
            } else {
                acnf acnfVar = (acnf) this.d;
                h = acnfVar.c(this.e.b(), i, acnfVar.f.nextLong()).f(acng.class, new jab(4), this.g).h(new ijq(this, mshVar, 12), this.g);
            }
            return h.h(new itk(this, 16), this.g).h(new ijq(this, mshVar, 13), this.h);
        } catch (IllegalArgumentException e) {
            return aktp.af(e);
        }
    }

    @Override // defpackage.psz
    public final akul c(msh mshVar) {
        if (j()) {
            return aktp.af(new psx("Rcs is disabled"));
        }
        try {
            return i(mshVar, lqn.i(mshVar)).h(new its(16), this.h);
        } catch (IllegalArgumentException e) {
            return aktp.af(e);
        }
    }

    @Override // defpackage.psz
    public final ammd d(msh mshVar) {
        int i = 0;
        if (j()) {
            b.q("Failed to get cached last known rcs state because rcs is disabled.");
            aozy createBuilder = ammd.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ammd ammdVar = (ammd) createBuilder.b;
            ammdVar.c = 1;
            ammdVar.d = 0;
            return (ammd) createBuilder.s();
        }
        try {
            i = ((Integer) this.d.d(this.e.b(), lqn.i(mshVar)).map(new lcw(13)).orElse(0)).intValue();
        } catch (acng | IllegalArgumentException e) {
            xyo e2 = b.e();
            e2.H("Error getting cached capabilities from UceProvider for getLastKnownState(). Logging error and recovering by returning a default response code for the last known state.");
            e2.x("httpResponseCode", 0);
            e2.r(e);
        }
        aozy createBuilder2 = ammd.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ammd ammdVar2 = (ammd) createBuilder2.b;
        ammdVar2.c = 1;
        ammdVar2.d = Integer.valueOf(i);
        return (ammd) createBuilder2.s();
    }

    public final Optional e(msh mshVar) {
        try {
            Optional map = this.d.d(this.e.b(), lqn.i(mshVar)).map(new ldg(this, 19));
            map.ifPresent(new ksn(this, mshVar, 5));
            return map;
        } catch (acng e) {
            throw new psx("Unable to get cached capabilities from the uce provider", e);
        }
    }

    @Override // defpackage.psz
    public final Optional f(msh mshVar) {
        if (j()) {
            b.q("Failed to get cached capabilities because rcs is disabled.");
            return Optional.empty();
        }
        lru lruVar = this.c;
        mshVar.getClass();
        Optional map = Optional.ofNullable(((LruCache) lruVar.a).get(mshVar)).map(new ldg(new lnn(lruVar, 5), 18));
        map.getClass();
        if (map.isEmpty()) {
            return e(mshVar);
        }
        if (((lsc) map.get()).b) {
            aktp.ai(new haw(this, mshVar, 15), this.g).e(psx.class, new its(17), this.h).k(qiu.b(), andi.a);
        }
        return map.map(new lcw(14));
    }

    @Override // defpackage.psz
    public final Optional g(msh mshVar) {
        return f(mshVar);
    }

    public final void h(msh mshVar, adpo adpoVar) {
        String g = mshVar.g();
        if (g != null) {
            this.j.d(new CapabilitiesUpdateEvent(g, new ImsCapabilities(adpoVar)));
        } else {
            b.e().H("rcs destination is null, skipping dispatch of CapabilitiesUpdateEvent");
        }
    }
}
