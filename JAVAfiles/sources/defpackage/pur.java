package defpackage;

import com.google.android.ims.rcsservice.contacts.CapabilitiesUpdateEvent;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.rcs.client.contacts.ContactsService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pur implements wny, puu, pvk {
    public static final xze a = xze.g("BugleRcsCapabilities", "DualRegistrationNetworkCapabilitiesProvider");
    public static final alwo b = alwo.o("BugleRcsCapabilities");
    public final ContactsService c;
    public final armf d;
    public final xnv e;
    public final Map f = new HashMap();
    public final Object g = new Object();
    private final anen h;
    private final anen i;
    private final lgg j;

    public pur(anen anenVar, anen anenVar2, ContactsService contactsService, lgg lggVar, armf armfVar, xnv xnvVar) {
        this.c = contactsService;
        this.j = lggVar;
        this.d = armfVar;
        this.h = anenVar2;
        this.i = anenVar;
        this.e = xnvVar;
    }

    @Override // defpackage.puu
    public final akul a(Iterable iterable) {
        return aktp.af(new IllegalStateException("getBatchCapabilities not supported for DualReg."));
    }

    @Override // defpackage.puu
    public final akul b(qei qeiVar) {
        ((alwl) b.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "getCapabilities", 96, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: start getCapabilities with chatEndpoint %s", yyb.bh(qeiVar.d));
        if ((qeiVar.b & 2) != 0) {
            return akul.g(d.m(new mfg(this, qeiVar.d, 3))).h(new ndd(this, 20), this.h);
        }
        return aktp.af(new psx("[Dual Registration] Getting capabilities failed since remote user id is null"));
    }

    @Override // defpackage.pvk
    public final akul c(qei qeiVar) {
        int i = 2;
        if ((qeiVar.b & 2) != 0) {
            return akul.g(d.m(new mfg(this, qeiVar.d, i))).i(new pri(this, qeiVar, 10), this.h);
        }
        return aktp.af(new pvi());
    }

    public final akul d(qei qeiVar, ImsCapabilities imsCapabilities) {
        pvm pvmVar = new pvm();
        pvmVar.i(puc.a(imsCapabilities.i));
        pvmVar.h(this.e.f());
        return this.j.d(new mut(qeiVar, pvmVar.g(), 8));
    }

    public final void e(String str, dtq dtqVar, boolean z) {
        alwo alwoVar = b;
        ((alwl) alwoVar.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "putPendingCompleter", 262, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: start putPendingCompleter for remoteUserId %s and completer", yyb.bh(str));
        synchronized (this.g) {
            List list = (List) this.f.get(str);
            ((alwl) alwoVar.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "putPendingCompleter", 268, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: userPendingEvents %s", list);
            if (list == null) {
                list = new ArrayList();
                this.f.put(str, list);
            }
            list.add(dtqVar);
            ((alwl) alwoVar.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "putPendingCompleter", 275, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: completer added to userPendingEvents %s", list);
        }
        qiu.h(aktp.ai(new mzn(this, str, 14, null), this.i).h(new kxr(this, str, dtqVar, 12, (char[]) null), this.h).e(ajny.class, new puq(this, str, dtqVar, z, 0), this.h));
    }

    public final void g(String str, dtq dtqVar, Throwable th) {
        alwo alwoVar = b;
        ((alwl) alwoVar.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "removePendingCompleter", 282, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: start removePendingCompleter for remoteUserId %s and completer", yyb.bh(str));
        synchronized (this.g) {
            List list = (List) this.f.get(str);
            if (list != null) {
                list.remove(dtqVar);
                ((alwl) alwoVar.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "removePendingCompleter", 292, "DualRegistrationNetworkCapabilitiesProvider.java")).t("DualRegistrationNetworkCapabilitiesProvider: completer removed from userPendingEvents %s", list);
                if (list.isEmpty()) {
                    this.f.remove(str);
                    ((alwl) alwoVar.m().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/DualRegistrationNetworkCapabilitiesProvider", "removePendingCompleter", 298, "DualRegistrationNetworkCapabilitiesProvider.java")).D("DualRegistrationNetworkCapabilitiesProvider: remoteUserId %s removed from pendingEvents %s", yyb.bh(str), this.f);
                }
            }
        }
        dtqVar.d(th);
    }

    @Override // defpackage.wny
    public final void k(CapabilitiesUpdateEvent capabilitiesUpdateEvent) {
        throw null;
    }
}
