package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrg implements aikm {
    final /* synthetic */ adrh a;
    private final adqu b;
    private final aijw c;

    public adrg(adrh adrhVar, adqu adquVar, aijw aijwVar) {
        this.a = adrhVar;
        this.b = adquVar;
        this.c = aijwVar;
    }

    @Override // defpackage.aikm
    public final void a(aikh aikhVar) {
        this.a.u(this.b, 5);
    }

    @Override // defpackage.aikm
    public final void b(aikh aikhVar) {
        String k;
        int a = aikhVar.a();
        aioo b = aikhVar.b();
        if (b == null) {
            advr.h(adrh.g, "SIP response is null.", new Object[0]);
            return;
        }
        if (a != 200 && a != 202) {
            if (a != 407) {
                if (a != 403) {
                    if (a != 404) {
                        this.a.u(this.b, adrh.p(a));
                        return;
                    }
                    advr.d(adrh.g, "Remote user is not RCS user.", new Object[0]);
                    String str = this.c.h;
                    if (str != null && (k = adwf.k(str, this.a.i)) != null) {
                        this.a.l.e(k);
                    }
                    this.a.u(this.b, adrh.p(a));
                    return;
                }
                this.a.u(this.b, adrh.p(a));
                adfa adfaVar = ((adet) this.a.a).b;
                if (Objects.isNull(adfaVar)) {
                    advr.h(adrh.g, "Reregistration required by registration controller not initialized", new Object[0]);
                    return;
                } else {
                    adfaVar.h(acok.REREGISTRATION_REQUIRED, a);
                    return;
                }
            }
            advr.l(adrh.g, "407 response received", new Object[0]);
            this.a.w.c(b);
            this.c.a();
            advr.l(adrh.g, "Send second MESSAGE", new Object[0]);
            try {
                byte[] y = adrh.y(this.b);
                adrh adrhVar = this.a;
                adwe adweVar = adrhVar.e;
                aikb q = adrhVar.q();
                aijw aijwVar = this.c;
                adqu adquVar = this.b;
                aion c = adweVar.c(q, aijwVar, adquVar.h, y, adquVar.b(), Optional.empty());
                this.a.w.d(c);
                this.a.q().r(c);
                return;
            } catch (aild | IOException e) {
                advr.h(adrh.g, "Unable to send second MESSAGE", new Object[0]);
                e.printStackTrace();
                return;
            }
        }
        adrh adrhVar2 = this.a;
        adqu adquVar2 = this.b;
        Iterator it = adrhVar2.p.iterator();
        while (it.hasNext()) {
            ((adqy) it.next()).b(adquVar2);
        }
    }

    @Override // defpackage.aikm
    public final void c(aikh aikhVar) {
        this.a.u(this.b, 3);
    }
}
