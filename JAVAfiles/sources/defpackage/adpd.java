package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpd implements aikm {
    final /* synthetic */ adpe a;
    private final /* synthetic */ int b;

    public adpd(adpe adpeVar, int i) {
        this.b = i;
        this.a = adpeVar;
    }

    @Override // defpackage.aikm
    public final void a(aikh aikhVar) {
        if (this.b != 0) {
            this.a.g(408, "timeout");
        } else {
            this.a.g(408, "timeout");
        }
    }

    @Override // defpackage.aikm
    public final void b(aikh aikhVar) {
        int parseInt;
        if (this.b == 0) {
            this.a.h(null);
            return;
        }
        if (aikhVar.g()) {
            aioo b = aikhVar.b();
            if (b == null) {
                advr.g("SIP response is null.", new Object[0]);
                return;
            }
            int a = aikhVar.a();
            if (a != 200 && a != 202) {
                if (a == 403) {
                    adpe adpeVar = this.a;
                    if (adpeVar.g) {
                        adpeVar.g(403, b.A());
                        return;
                    } else {
                        adpeVar.g = true;
                        adpeVar.n(false);
                        return;
                    }
                }
                if (a == 407) {
                    adpe adpeVar2 = this.a;
                    try {
                        advr.k("407 response received", new Object[0]);
                        adpeVar2.q(b);
                        adpeVar2.m.c(b);
                        adpeVar2.d.a();
                        advr.k("Send second Subscribe", new Object[0]);
                        String[] strArr = adpeVar2.i;
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                        aion e = adpeVar2.l.e(adpeVar2.b(), adpeVar2.d, 3600, adpeVar2.b, strArr);
                        adpeVar2.m.d(e);
                        aimy aimyVar = e.y().f;
                        if (aimyVar != null) {
                            aimyVar.e();
                            adpeVar2.l(e);
                            return;
                        }
                        throw new aild("subscribe.getStackRequest().getToHeader() returned null");
                    } catch (Exception e2) {
                        advr.i(e2, "Subscription failed", new Object[0]);
                        adpeVar2.h(new aduh(e2));
                        return;
                    }
                }
                if (a == 423) {
                    adpe adpeVar3 = this.a;
                    try {
                        advr.k("423 response received", new Object[0]);
                        String j = b.j("Min-Expires");
                        adpeVar3.d = adpeVar3.a(adpeVar3.c);
                        advr.k("Send second Subscribe", new Object[0]);
                        String[] strArr2 = adpeVar3.i;
                        if (strArr2 == null) {
                            strArr2 = new String[0];
                        }
                        String[] strArr3 = strArr2;
                        adwe adweVar = adpeVar3.l;
                        aikb b2 = adpeVar3.b();
                        aijw aijwVar = adpeVar3.d;
                        if (j == null) {
                            parseInt = 0;
                        } else {
                            parseInt = Integer.parseInt(j);
                        }
                        adpeVar3.l(adweVar.e(b2, aijwVar, parseInt, adpeVar3.b, strArr3));
                        return;
                    } catch (Exception e3) {
                        advr.i(e3, "Subscription failed", new Object[0]);
                        adpeVar3.h(new aduh(e3));
                        return;
                    }
                }
                this.a.g(a, b.A());
                return;
            }
            adpe adpeVar4 = this.a;
            adpeVar4.q(b);
            Iterator it = adpeVar4.a.iterator();
            while (it.hasNext()) {
                ((adpg) it.next()).t();
            }
            return;
        }
        this.a.g(408, "timeout");
    }

    @Override // defpackage.aikm
    public final void c(aikh aikhVar) {
        if (this.b == 0) {
            this.a.h(null);
        } else {
            this.a.g(408, "timeout");
        }
    }
}
