package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adqc implements aikm {
    final /* synthetic */ adqd a;
    private final adpo b;
    private final aijw c;
    private final String d;
    private boolean e;
    private final long f;

    public adqc(adqd adqdVar, long j, adpo adpoVar, aijw aijwVar, String str) {
        this.a = adqdVar;
        this.f = j;
        this.b = adpoVar;
        this.c = aijwVar;
        this.d = str;
    }

    private final void d() {
        try {
            adqd adqdVar = this.a;
            long j = this.f;
            String str = this.d;
            adqdVar.l.remove(str);
            Iterator it = adqdVar.g.iterator();
            while (it.hasNext()) {
                ((adpv) it.next()).l(j, str);
            }
        } catch (Exception e) {
            advr.i(e, "Error while calling listeners: %s", e.getMessage());
        }
    }

    @Override // defpackage.aikm
    public final void a(aikh aikhVar) {
        advr.k("OPTIONS response aborted", new Object[0]);
        d();
    }

    @Override // defpackage.aikm
    public final void b(aikh aikhVar) {
        int a = aikhVar.a();
        boolean z = true;
        if (a != 200 && a != 202) {
            if (a != 404) {
                if (a != 480) {
                    if (a != 604) {
                        if (a != 407) {
                            if (a != 408) {
                                advr.q("Received unknown response status to OPTIONS call: %d", Integer.valueOf(a));
                                d();
                                return;
                            }
                        } else {
                            if (!this.e) {
                                this.e = true;
                                this.a.o.c(aikhVar.b());
                                this.c.a();
                                try {
                                    adqd adqdVar = this.a;
                                    aikb aikbVar = ((aikc) adqdVar.k).a;
                                    aion s = adqdVar.e.s(aikbVar, this.c);
                                    adta.i(s.b(), this.b, this.a.r());
                                    adta.h(s, this.b, this.a.r());
                                    this.a.o.d(s);
                                    aikbVar.d(s, this);
                                    return;
                                } catch (aild e) {
                                    advr.i(e, "Error while sending SIP message", new Object[0]);
                                    d();
                                    return;
                                }
                            }
                            d();
                            return;
                        }
                    }
                }
                adqd adqdVar2 = this.a;
                adpo d = adqdVar2.p.d(aikhVar.b, adqdVar2.r());
                if (d.z()) {
                    d = new ImsCapabilities(this.a.m.c(this.d));
                }
                d.c = false;
                d.d = true;
                if (!this.a.a.d().mImCapAlwaysOn) {
                    advr.c("480 received with IM_CAP_ALWAYS_ON disabled!", new Object[0]);
                    d = this.a.n.a();
                    d.c = false;
                    d.d = false;
                }
                adqd.u(d, aikhVar);
                this.a.v(this.f, this.d, d);
                return;
            }
            adpo a2 = this.a.n.a();
            a2.c = false;
            a2.d = false;
            adqd.u(a2, aikhVar);
            this.a.v(this.f, this.d, a2);
            return;
        }
        aiom aiomVar = aikhVar.b;
        adqd adqdVar3 = this.a;
        adpo d2 = adqdVar3.p.d(aiomVar, adqdVar3.r());
        adqd.u(d2, aikhVar);
        if (((Boolean) adqd.i.a()).booleanValue() && aiomVar != null) {
            advp advpVar = adwf.a;
            aimi e2 = aiomVar.a.e("P-Asserted-Identity");
            String str = null;
            if (e2 != null) {
                Iterator it = e2.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    aimh aimhVar = (aimh) it.next();
                    try {
                        String a3 = aimhVar.a();
                        String str2 = aimhVar.c;
                        a3.getClass();
                        aiks aiksVar = ahji.h(a3).b;
                        if (aiksVar != null && aiksVar.l()) {
                            String aiksVar2 = aiksVar.toString();
                            if (adwf.v(aiksVar2)) {
                                str = aiksVar2.substring(4);
                                break;
                            }
                        }
                    } catch (ailb e3) {
                        advr.j(e3, adwf.a, "Error while parsing remote uri for bot: %s", e3.getMessage());
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                d2.j = Optional.of(str);
            }
        }
        if (aiomVar != null) {
            boolean w = aiomVar.w();
            d2.d = true;
            if ((!d2.y() && !d2.C() && !d2.K()) || w) {
                z = false;
            }
            d2.c = z;
            if (z) {
                d2.e = agkx.W().longValue();
            }
        }
        this.a.v(this.f, this.d, d2);
    }

    @Override // defpackage.aikm
    public final void c(aikh aikhVar) {
        advr.k("OPTIONS response timeout", new Object[0]);
        d();
    }
}
