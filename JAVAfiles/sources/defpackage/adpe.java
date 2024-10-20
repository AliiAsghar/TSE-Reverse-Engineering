package defpackage;

import j$.util.Objects;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adpe {
    public final String b;
    public final armf c;
    public aijw d;
    public boolean g;
    public String h;
    public String[] i;
    public final adwe l;
    public final adsj m;
    private final adul n;
    private final adul o;
    private final adew p;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public String e = "application/pidf+xml,application/rlmi+xml,multipart/related";
    protected String f = "eventlist";
    public int j = 3600;
    public long k = agkx.W().longValue() + (this.j * 1000);
    private final aikm q = new adpd(this, 1);
    private final aikm r = new adpd(this, 0);

    public adpe(adew adewVar, armf armfVar, String str, String str2, adul adulVar, adul adulVar2, adwe adweVar) {
        this.p = adewVar;
        this.c = armfVar;
        this.b = str2;
        this.n = adulVar;
        this.o = adulVar2;
        this.l = adweVar;
        this.m = new adsj(adewVar.c());
        this.h = str;
        this.d = a(armfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final String s(aion aionVar) {
        String j = aionVar.j("Subscription-State");
        if (j == null) {
            return null;
        }
        int indexOf = j.indexOf(59);
        if (indexOf > 0) {
            return j.substring(0, indexOf);
        }
        return j;
    }

    public final aijw a(armf armfVar) {
        adew adewVar = this.p;
        adewVar.getClass();
        aikb aikbVar = ((aikc) armfVar).a;
        if (!aikbVar.u()) {
            ArrayList p = aikbVar.p();
            if (!Objects.isNull(adewVar.c())) {
                String str = this.h;
                if (!Objects.isNull(str)) {
                    String e = adewVar.e();
                    if (!Objects.isNull(e)) {
                        return new aijw(aikb.v(), 1, str, e, str, p);
                    }
                    throw new aild("Public User Identity is null. Failed to create dialog path.");
                }
                throw new aild("Remote URI is null. Failed to create dialog path.");
            }
            throw new aild("ims.getConfiguration() failed");
        }
        throw new aild("The sip stack is not available");
    }

    public final aikb b() {
        aikb aikbVar = ((aikc) this.c).a;
        if (!aikbVar.u()) {
            return aikbVar;
        }
        throw new aild("imsModule.getSipStack() returned null");
    }

    public final void c(aion aionVar) {
        aionVar.r("Event: ".concat(String.valueOf(this.b)));
        aionVar.r("Accept: ".concat(String.valueOf(this.e)));
        if (!agkx.ae(this.f)) {
            aionVar.r("Supported: ".concat(String.valueOf(this.f)));
        }
    }

    public final void d(adpg adpgVar) {
        this.a.add(adpgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(String str) {
        if (str != null && str.startsWith("terminated")) {
            h(null);
        }
    }

    public final void f(aduf adufVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((adpg) it.next()).s(adufVar);
        }
    }

    public final void g(int i, String str) {
        n(false);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((adpg) it.next()).r(i, str);
        }
    }

    public final void h(aduf adufVar) {
        n(false);
        if (adufVar == null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((adpg) it.next()).u();
            }
        } else {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((adpg) it2.next()).v(adufVar);
            }
        }
    }

    public void i(aion aionVar) {
        try {
            k(aionVar);
            String s = s(aionVar);
            List<aiok> o = aionVar.o();
            advr.c("Got notify containing: %d parts", Integer.valueOf(o.size()));
            if (aionVar.h() != null) {
                if (o.size() == 0) {
                    t(null, new byte[0]);
                } else {
                    for (aiok aiokVar : o) {
                        t(aiokVar.b, aiokVar.a);
                    }
                }
            } else {
                t(null, new byte[0]);
            }
            e(s);
        } catch (Exception e) {
            advr.i(e, "Error while processing notify: %s", e.getMessage());
        }
    }

    public final void j(adpg adpgVar) {
        if (Objects.isNull(adpgVar)) {
            return;
        }
        this.a.remove(adpgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(aion aionVar) {
        b().r(this.l.n(aionVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(aion aionVar) {
        c(aionVar);
        m(aionVar);
        b().d(aionVar, this.q);
    }

    public final void m(aion aionVar) {
        String[] strArr = this.i;
        if (strArr != null && strArr.length != 0) {
            StringBuilder sb = new StringBuilder("Accept-Contact: *");
            for (int i = 0; i < this.i.length; i++) {
                sb.append(';');
                sb.append(this.i[i]);
            }
            aionVar.r(sb.toString());
        }
    }

    public final void n(boolean z) {
        advr.c("Stop refreshing subscription for %s", advq.URI.c(this.h));
        advr.c("Remove subscription %s", this);
        adpf adpfVar = (adpf) this.n;
        adpfVar.a.remove(this);
        aduk adukVar = adpfVar.b;
        advr.d(adukVar.c, "removing refreshable: %s", this);
        synchronized (adukVar.b) {
            adukVar.b.remove(new aduj(this));
            if (adukVar.b.isEmpty()) {
                if (yhx.d) {
                    if (adukVar.e.get() != null) {
                        advr.d(adukVar.c, "Removed last refreshable - stopping timer", new Object[0]);
                        DesugarAtomicReference.getAndUpdate(adukVar.e, new adie(2));
                    }
                } else if (adukVar.d != null) {
                    advr.d(adukVar.c, "Removed last refreshable - stopping timer", new Object[0]);
                    adukVar.a.b();
                    adukVar.d = null;
                }
            }
        }
        if (z) {
            adpm adpmVar = (adpm) this.o;
            adpmVar.a();
            adpmVar.a.add(this);
        }
    }

    public final void o() {
        advr.c("Sending subscribe for event: %s to %s", this.b, advq.URI.c(this.h));
        this.d.a();
        try {
            String[] strArr = this.i;
            if (strArr == null) {
                strArr = new String[0];
            }
            aion e = this.l.e(b(), this.d, this.j, this.b, strArr);
            adul adulVar = this.n;
            advr.c("Adding subscription %s", this);
            ((adpf) adulVar).a.add(this);
            ((adpf) adulVar).b.b(this);
            l(e);
        } catch (Exception e2) {
            advr.i(e2, "Error while subscribing: %s", e2.getMessage());
            f(new aduh("Error while subscribing refer: ".concat(String.valueOf(e2.getMessage())), e2));
        }
    }

    public final void p() {
        this.d.a();
        try {
            String[] strArr = this.i;
            if (strArr == null) {
                strArr = new String[0];
            }
            b().d(this.l.e(b(), this.d, 0, this.b, strArr), this.r);
        } catch (Exception e) {
            advr.i(e, "Error while unsubscribing: %s", e.getMessage());
            h(new aduh("Error while unsubscribing refer: ".concat(String.valueOf(e.getMessage())), e));
        }
    }

    public final void q(aioo aiooVar) {
        String l = aiooVar.l();
        this.d.e = adwf.i(l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(String str, byte[] bArr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((adpg) it.next()).p(this, str, bArr);
        }
    }
}
