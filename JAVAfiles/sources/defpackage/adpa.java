package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpa extends TimerTask {
    final /* synthetic */ adoz a;
    final /* synthetic */ boolean b;
    final /* synthetic */ adqg c;

    public adpa(adqg adqgVar, adoz adozVar, boolean z) {
        this.a = adozVar;
        this.b = z;
        this.c = adqgVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        String str;
        if (this.a.a == adpk.RUNNING) {
            if (this.b) {
                adpl adplVar = this.a.v;
                try {
                    aijw aijwVar = adplVar.a.l;
                    aijwVar.a();
                    aikb aikbVar = ((aikc) adplVar.c).a;
                    adwe adweVar = adplVar.d;
                    adew adewVar = adplVar.b;
                    aion r = adweVar.r(aikbVar, aijwVar);
                    adoz adozVar = adplVar.a;
                    adoz b = adozVar.i.f.b(adozVar.y(), adplVar.a);
                    if (b != null) {
                        str = b.x();
                    } else {
                        str = null;
                    }
                    adwf.u(r, str, adplVar.a.an());
                    aikh e = aikbVar.e(r);
                    advr.c("Created: %s", advr.a(e.c));
                    if (e.h(10) != 2) {
                        if (e.g()) {
                            aioo b2 = e.b();
                            if (b2 != null) {
                                aijwVar.q = b2;
                                adwe adweVar2 = adplVar.d;
                                adew adewVar2 = adplVar.b;
                                aikbVar.r(adweVar2.q(aikbVar, aijwVar));
                                if (b2.y() == 200) {
                                    adplVar.b(aijwVar, b2);
                                } else {
                                    b2.y();
                                }
                            } else {
                                throw new aild("SIP response is null");
                            }
                        } else {
                            advr.g("Refreshing session failed - time out", new Object[0]);
                            adplVar.a.o(new aduf(408, "Timeout"), 1, 1);
                        }
                    }
                } catch (Exception e2) {
                    String format = String.format("Error while refreshing session: %s", e2.getMessage());
                    advr.i(e2, "%s", format);
                    adplVar.a.o(new aduf(0, format), 1, 1);
                }
            } else {
                adoz adozVar2 = this.a;
                long currentTimeMillis = System.currentTimeMillis();
                adpl adplVar2 = adozVar2.v;
                if (currentTimeMillis - adplVar2.f > adplVar2.e * 1000) {
                    advr.c("Session inactivity detected - terminating", new Object[0]);
                    adplVar2.a.n(1, 1);
                }
            }
        }
        ((ConcurrentHashMap) this.c.a).remove(this.a);
    }
}
