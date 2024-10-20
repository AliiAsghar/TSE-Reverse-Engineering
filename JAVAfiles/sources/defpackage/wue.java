package defpackage;

import com.google.android.ims.rcsservice.contacts.CapabilitiesUpdateEvent;
import com.google.android.rcs.client.contacts.ContactsService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wue implements vps, wny {
    public static final xze a = xze.g("Bugle", "RbmBotIdResolverServiceImpl");
    public final anen b;
    public final anen c;
    public final ScheduledExecutorService d;
    public final ContactsService e;
    public final armf f;
    public final psi g;
    public final Object h = new Object();
    public final Map i = new HashMap();

    public wue(anen anenVar, anen anenVar2, aneo aneoVar, ContactsService contactsService, armf armfVar, psi psiVar) {
        this.b = anenVar;
        this.c = anenVar2;
        this.d = aneoVar;
        this.e = contactsService;
        this.f = armfVar;
        this.g = psiVar;
    }

    @Override // defpackage.vps
    public final akul a(msh mshVar) {
        xze xzeVar = a;
        xyo a2 = xzeVar.a();
        a2.C("remoteMessagingIdentity", mshVar.toString());
        a2.q();
        byte[] bArr = null;
        if (mshVar != null && !mshVar.x(false)) {
            String i = mshVar.i();
            this.g.b(i);
            return akul.g(d.m(new mfg(this, i, 5))).j(12L, TimeUnit.SECONDS, this.d).h(new whh(this, i, 7, bArr), andi.a);
        }
        this.g.b(null);
        xzeVar.q("Shortcode does not exist!");
        return aktp.af(new psx("[Dual Registration] Getting capabilities failed since remote user id is null"));
    }

    public final void b(Throwable th, dtq dtqVar, String str) {
        a.r("Error getting capabilities for bot id resolving.", th);
        this.g.j(str, 4);
        dtqVar.d(th);
        c(str, dtqVar);
    }

    public final void c(String str, dtq dtqVar) {
        synchronized (this.h) {
            Set set = (Set) this.i.get(str);
            if (set == null) {
                return;
            }
            set.remove(dtqVar);
            if (set.isEmpty()) {
                this.i.remove(str);
            }
        }
    }

    @Override // defpackage.wny
    public final void k(CapabilitiesUpdateEvent capabilitiesUpdateEvent) {
        throw null;
    }
}
