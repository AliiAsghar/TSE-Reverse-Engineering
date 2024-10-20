package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adoy extends Thread {
    final /* synthetic */ adoz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adoy(adoz adozVar) {
        super("SessionUpdate");
        this.a = adozVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        adoz adozVar;
        aikb v;
        aion aionVar;
        int s;
        try {
            try {
                adozVar = this.a;
                try {
                    v = adozVar.v();
                    aionVar = adozVar.l.i;
                    aionVar.getClass();
                    advr.l(adoz.f, "Updating session as terminating, invitation state = %s", Integer.valueOf(adozVar.n));
                    s = adozVar.s();
                } catch (Exception e) {
                    advr.j(e, adoz.f, "Session initiation has failed", new Object[0]);
                    adozVar.L(new adug(e));
                }
            } finally {
                this.a.s = null;
            }
        } catch (Exception e2) {
            advr.j(e2, adoz.f, "Error while updating session: %s", e2.getMessage());
        }
        if (s != 2 && s != 0) {
            adozVar.D(null);
            adozVar.l.r = null;
            advr.l(adoz.f, "Send 200 OK", new Object[0]);
            aioo f = adozVar.B.f(v, adozVar.l);
            if (f == null) {
                advr.h(adoz.f, "Error generating 200 OK to INVITE.", new Object[0]);
                adozVar.n(9, 55);
            } else {
                adwf.u(f, adozVar.x(), adozVar.an());
                adozVar.v.c(adozVar.l, aionVar, f);
                Iterator it = adozVar.g.iterator();
                while (it.hasNext()) {
                    try {
                        ((adpb) it.next()).o();
                    } catch (Exception e3) {
                        advr.j(e3, adoz.f, "handleSessionUpdating: Call to listener failed with error: ", new Object[0]);
                    }
                }
                aikh e4 = v.e(f);
                e4.h(30);
                if (e4.f()) {
                    advr.l(adoz.f, "ACK request received", new Object[0]);
                    aijw aijwVar = adozVar.l;
                    aijwVar.s = aijwVar.t;
                    Iterator it2 = adozVar.g.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((adpb) it2.next()).n();
                        } catch (Exception e5) {
                            advr.j(e5, adoz.f, "handleSessionUpdated: Call to listener failed with error", new Object[0]);
                        }
                    }
                } else {
                    advr.d(adoz.f, "No ACK received for INVITE", new Object[0]);
                    Iterator it3 = adozVar.g.iterator();
                    while (it3.hasNext()) {
                        try {
                            ((adpb) it3.next()).q();
                        } catch (Exception e6) {
                            advr.j(e6, adoz.f, "handleSessionUpdateFailed: Call to listener failed with error", new Object[0]);
                        }
                    }
                }
            }
        }
        advr.d(adoz.f, "Session has been rejected on timeout", new Object[0]);
        aijw aijwVar2 = adozVar.l;
        aijwVar2.t = null;
        adozVar.as(aionVar, aijwVar2.d, 11);
    }
}
