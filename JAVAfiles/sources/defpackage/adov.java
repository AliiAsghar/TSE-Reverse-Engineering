package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adov {
    public static final /* synthetic */ int b = 0;
    private static final advp c = new advp("ImsServiceManager");
    private static final acyz d = aczd.a(177222621);
    public final List a;
    private volatile boolean e;
    private final advp f;

    public adov() {
        List arrayList;
        if (((Boolean) d.a()).booleanValue()) {
            arrayList = new CopyOnWriteArrayList();
        } else {
            arrayList = new ArrayList(12);
        }
        this.a = arrayList;
        this.e = false;
        this.f = c;
    }

    public final adou a(Class cls) {
        for (adou adouVar : this.a) {
            if (cls.isInstance(adouVar)) {
                return (adou) cls.cast(adouVar);
            }
        }
        return null;
    }

    public final adou b(Class cls) {
        adou a = a(cls);
        if (a != null) {
            return a;
        }
        throw new aduf(1, "Service not available: ".concat(String.valueOf(cls.getName())));
    }

    public final Optional c(String str) {
        if (str == null) {
            advr.k("No session can be found for null callId", new Object[0]);
            return Optional.empty();
        }
        Optional findAny = Collection.EL.stream(this.a).flatMap(new adof(5)).filter(new zko(str, 12)).findAny();
        if (findAny.isEmpty()) {
            advr.k("No session can be found for callId: %s", str);
        }
        return findAny;
    }

    public final Optional d(String str) {
        if (str == null) {
            return Optional.empty();
        }
        return Collection.EL.stream(this.a).flatMap(new adof(4)).filter(new zko(str, 11)).findAny();
    }

    public final void e(adou adouVar) {
        this.a.add(adouVar);
    }

    public final synchronized void f() {
        if (this.e) {
            advr.r(this.f, "Services already started", new Object[0]);
            return;
        }
        this.e = true;
        for (adou adouVar : this.a) {
            String name = adouVar.getClass().getName();
            advr.d(this.f, "Start IMS service: %s", name);
            try {
                adouVar.j();
            } catch (Exception e) {
                advr.j(e, this.f, "Error while starting service: %s", name);
            }
        }
    }

    public final synchronized void g(acok acokVar) {
        if (!this.e) {
            advr.d(this.f, "Not stopping, services already stopped", new Object[0]);
            return;
        }
        advr.d(this.f, "Stopping all IMS services due to %s", acokVar);
        try {
            for (adou adouVar : alzz.ar(this.a)) {
                String name = adouVar.getClass().getName();
                if (acokVar == acok.NETWORK_CHANGE || acokVar == acok.VPN_SETUP || acokVar == acok.VPN_TEARDOWN || acokVar == acok.ACTIVE_MEDIA_NETWORK_INTERFACE_CHANGE || acokVar == acok.CONNECTIVITY_CHANGE) {
                    adouVar.m();
                }
                if (acokVar == acok.NETWORK_ERROR) {
                    adouVar.n();
                }
                advr.d(this.f, "Stopping IMS service: %s", name);
                try {
                    adouVar.k(acokVar);
                } catch (Exception e) {
                    advr.j(e, this.f, "Error while stopping service: %s", name);
                }
            }
        } finally {
            this.e = false;
        }
    }
}
