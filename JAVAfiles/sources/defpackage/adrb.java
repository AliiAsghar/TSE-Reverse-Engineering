package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrb implements adpg {
    final /* synthetic */ adrc a;
    private final long b;

    public adrb(adrc adrcVar, long j) {
        this.a = adrcVar;
        this.b = j;
    }

    @Override // defpackage.adpg
    public final void p(adpe adpeVar, String str, byte[] bArr) {
        Optional a = this.a.R.a(this.b);
        if (a.isEmpty()) {
            advr.h(adrc.C, "GroupSessionData is not found with sessionId %d. Cannot process conference event.", Long.valueOf(this.b));
            return;
        }
        Optional optional = ((adum) a.get()).b;
        if (optional.isEmpty()) {
            advr.h(adrc.C, "No valid conference info. Not firing conference state changed from InstantMessageSession", new Object[0]);
            return;
        }
        adrc adrcVar = this.a;
        if (adrcVar.H == null) {
            adrcVar.H = new ArrayList();
        }
        Object obj = optional.get();
        Iterator it = this.a.H.iterator();
        while (it.hasNext()) {
            Optional a2 = ((acop) obj).d.a((String) it.next(), this.a.m);
            if (a2.isPresent() && ((acpk) a2.get()).b().isEmpty()) {
                throw new IllegalStateException("There is no endpoint present");
            }
            if (a2.isEmpty() || ((acpk) a2.get()).h == acpg.DELETED || ((acpk) a2.get()).b().isEmpty() || (((acpk) a2.get()).a() == acoy.DISCONNECTED && ((acox) ((acpk) a2.get()).b().get()).f != acow.BOOTED)) {
                it.remove();
            }
        }
        adrc adrcVar2 = this.a;
        Object obj2 = optional.get();
        aduo aduoVar = adrcVar2.R;
        try {
            ((acop) obj2).c();
            aduoVar.d();
        } catch (Exception e) {
            advr.i(e, "Error while saving groups after resetting conference : %s", e.getMessage());
        }
        for (adpb adpbVar : ((adoz) this.a).g) {
            if (adpbVar instanceof acnn) {
                acnn acnnVar = (acnn) adpbVar;
                advr.c("Received conference NOTIFY. Notifying updated group state", new Object[0]);
                Optional a3 = acnnVar.c.j.a(acnnVar.a);
                if (a3.isPresent()) {
                    Optional optional2 = ((adum) a3.get()).b;
                    if (optional2.isPresent() && ((acop) optional2.get()).a.isPresent() && ((acom) ((acop) optional2.get()).a.get()).b.isPresent()) {
                        Object obj3 = ((acom) ((acop) optional2.get()).a.get()).b.get();
                        acnnVar.b.q = (String) obj3;
                        aduo aduoVar2 = acnnVar.c.j;
                        long j = acnnVar.a;
                        synchronized (aduoVar2.b) {
                            Long valueOf = Long.valueOf(j);
                            advr.c("Updating subject for session %d to %s", valueOf, advq.MESSAGE_CONTENT.c(obj3));
                            adum adumVar = (adum) aduoVar2.b.get(valueOf);
                            if (adumVar == null) {
                                advr.g("No group found for ID %d. Cannot update subject.", valueOf);
                            } else {
                                adumVar.f = Optional.of(obj3);
                                try {
                                    aduoVar2.d();
                                } catch (IOException e2) {
                                    advr.i(e2, "Error while saving groups: %s", e2.getMessage());
                                }
                            }
                        }
                    }
                }
                acnnVar.c.g.c(acnnVar.p(50046, acnnVar.a), advy.IMS_CHAT_SESSION_PROVIDER);
            }
        }
    }

    @Override // defpackage.adpg
    public final void r(int i, String str) {
        advr.h(adrc.C, "Subscription for conference failed: %d:%s", Integer.valueOf(i), str);
    }

    @Override // defpackage.adpg
    public final void s(aduf adufVar) {
        advr.j(adufVar, adrc.C, "Subscription for conference failed: %s", adufVar.getMessage());
    }

    @Override // defpackage.adpg
    public final void t() {
    }

    @Override // defpackage.adpg
    public final void u() {
    }

    @Override // defpackage.adpg
    public final void v(aduf adufVar) {
    }
}
