package defpackage;

import com.google.android.ims.rcsservice.contacts.CapabilitiesUpdateEvent;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.rcs.client.contacts.ContactsService;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wub implements psz, wny {
    public final ContactsService b;
    public final yxx c;
    public final Object d = new Object();
    public final Map e = new HashMap();
    private final anen g;
    private final anen h;
    private final mce i;
    private static final xze f = xze.g("Bugle", "BugleRcsContactsServiceImpl");
    public static final alwo a = alwo.o("BugleRcsCapabilities");

    public wub(anen anenVar, anen anenVar2, ContactsService contactsService, mce mceVar, yxx yxxVar) {
        this.g = anenVar;
        this.h = anenVar2;
        this.b = contactsService;
        this.i = mceVar;
        this.c = yxxVar;
    }

    public static String a(qei qeiVar, String str) {
        if (qeiVar != null) {
            return qeiVar.d;
        }
        return str;
    }

    private final Optional i(msh mshVar) {
        String g = mshVar.g();
        if (g == null) {
            return Optional.empty();
        }
        try {
            ImsCapabilities cachedCapabilities = this.b.getCachedCapabilities(g);
            if (cachedCapabilities != null && !cachedCapabilities.z()) {
                return Optional.of(cachedCapabilities);
            }
            return Optional.empty();
        } catch (ajny e) {
            this.i.f("Bugle.Rcs.Capability.CacheRetrieval.RcsEngine.Duration", g);
            throw new psu("Failed to get capabilities from ContactsService.", e);
        }
    }

    private final void j(qei qeiVar, String str, dtq dtqVar, boolean z) {
        synchronized (this.d) {
            String a2 = a(qeiVar, str);
            Set set = (Set) this.e.get(a2);
            if (set == null) {
                set = new HashSet();
                this.e.put(a2, set);
            }
            set.add(dtqVar);
        }
        qiu.h(aktp.ai(new wtz(this, z, qeiVar, str, 0), this.g).h(new wua(this, dtqVar, qeiVar, str, 1), this.h).e(ajny.class, new wua(this, dtqVar, qeiVar, str, 0), this.h));
    }

    @Override // defpackage.psz
    public final akul b(msh mshVar) {
        return akul.g(d.m(new gst(this, mshVar.g(), mshVar, 6, (char[]) null))).h(new woc(6), andi.a);
    }

    @Override // defpackage.psz
    public final akul c(msh mshVar) {
        return akul.g(d.m(new gst(this, mshVar.g(), mshVar, 5, (char[]) null))).h(new woc(5), andi.a);
    }

    @Override // defpackage.psz
    public final ammd d(msh mshVar) {
        Optional empty = Optional.empty();
        int i = 0;
        try {
            empty = i(mshVar);
        } catch (psu e) {
            xyo e2 = f.e();
            e2.H("Error getting cached capabilities from ContactsService for getLastKnownState(). Logging error and recovering by returning a default response code for the last known state.");
            e2.x("httpResponseCode", 0);
            e2.r(e);
        }
        if (empty.isPresent()) {
            i = ((adpo) empty.get()).g;
        }
        aozy createBuilder = ammd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ammd ammdVar = (ammd) createBuilder.b;
        ammdVar.c = 1;
        ammdVar.d = Integer.valueOf(i);
        return (ammd) createBuilder.s();
    }

    public final void e(msh mshVar, String str, dtq dtqVar, boolean z) {
        if (((Boolean) new mss(11).get()).booleanValue()) {
            albo.A(mshVar.e().isPresent(), "ChatEndpoint can't be null when flag enableChatEndpointAndMessagingIdentityInEtouffee is true", new Object[0]);
            j((qei) mshVar.e().get(), str, dtqVar, z);
        } else {
            j(null, str, dtqVar, z);
        }
    }

    @Override // defpackage.psz
    public final Optional f(msh mshVar) {
        Optional i = i(mshVar);
        if (i.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(psv.b(((adpo) i.get()).i));
    }

    @Override // defpackage.psz
    public final Optional g(msh mshVar) {
        return f(mshVar);
    }

    public final void h(Throwable th, dtq dtqVar, qei qeiVar, String str) {
        dtqVar.d(th);
        synchronized (this.d) {
            String a2 = a(qeiVar, str);
            Set set = (Set) this.e.get(a2);
            if (set == null) {
                return;
            }
            set.remove(dtqVar);
            if (set.isEmpty()) {
                this.e.remove(a2);
            }
        }
    }

    @Override // defpackage.wny
    public final void k(CapabilitiesUpdateEvent capabilitiesUpdateEvent) {
        throw null;
    }
}
