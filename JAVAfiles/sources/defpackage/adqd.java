package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqd extends adpw {
    static final acyz i = acyy.b("enable_rbm_bot_id_in_capabilities");
    static final acyz j = aczd.a(161540993);
    public final armf k;
    public final Map l;
    public final adps m;
    public final adpu n;
    public final adsj o;
    public final adta p;
    private final yjr q;

    public adqd(adew adewVar, adqg adqgVar, adqa adqaVar, armf armfVar, yjr yjrVar, adps adpsVar, adpu adpuVar, adta adtaVar, adwe adweVar) {
        super(adewVar, adqgVar, adqaVar, adweVar);
        this.l = DesugarCollections.synchronizedMap(new HashMap());
        this.k = armfVar;
        this.q = yjrVar;
        this.o = new adsj(adewVar.c());
        this.m = adpsVar;
        this.n = adpuVar;
        this.p = adtaVar;
        this.e = adweVar;
    }

    public static final void u(adpo adpoVar, aikh aikhVar) {
        adpoVar.g = aikhVar.a();
        aiom aiomVar = aikhVar.b;
        if (aiomVar != null) {
            w(adpoVar, aiomVar);
        }
    }

    private static final void w(adpo adpoVar, aiom aiomVar) {
        String j2 = aiomVar.j("User-Agent");
        if (j2 != null) {
            adpoVar.h.put(adpn.a, j2);
        }
    }

    @Override // defpackage.adou
    protected final void g(acok acokVar) {
        this.l.clear();
    }

    @Override // defpackage.adpw
    public final void q(aion aionVar) {
        String str;
        advr.k("Receive an OPTIONS request", new Object[0]);
        yjr yjrVar = this.q;
        aiks b = adwf.b(aionVar, yjrVar);
        String str2 = null;
        if (b instanceof aikp) {
            str2 = (String) ((aikp) b).a.a().map(new aegk(1)).orElse(null);
            if (!adwf.w(str2)) {
                str = adwf.n(b.toString(), yjrVar);
                if (str == null && !str.isEmpty()) {
                    aionVar.j("P-Application-ID");
                    adpo c = this.p.c(aionVar.j("Contact"), r());
                    c.c = !aionVar.w();
                    if (c.e <= 0) {
                        c.e = System.currentTimeMillis();
                    }
                    w(c, aionVar);
                    adpo adpoVar = new adpo(this.h.a());
                    Iterator it = adpoVar.i.iterator();
                    while (it.hasNext()) {
                        if (!c.i.contains((String) it.next())) {
                            it.remove();
                        }
                    }
                    v(0L, str, c);
                    try {
                        aikb aikbVar = ((aikc) this.k).a;
                        adwe adweVar = this.e;
                        try {
                            ainj b2 = adwe.b(BasePaymentResult.ERROR_REQUEST_FAILED, (aini) aionVar.a);
                            aimy aimyVar = (aimy) b2.d("To");
                            if (aimyVar != null) {
                                aimyVar.f(aikx.a());
                                b2.k(adwf.e(adweVar.b.a()));
                                b2.k(adwf.F());
                                aioo aiooVar = new aioo(b2);
                                ailx ailxVar = new ailx(ahji.l(aikbVar.c, false, this.a.c().mUserName, aikbVar.k()), aikbVar.m(), aikbVar.a(), Optional.ofNullable(aikbVar.n()), new String[0]);
                                adta.i(ailxVar, adpoVar, r());
                                aiooVar.a.k(ailxVar);
                                aikbVar.r(aiooVar);
                                return;
                            }
                            throw new aild("To header is null.");
                        } catch (Exception e) {
                            advr.i(e, "Can't create SIP message", new Object[0]);
                            throw new aild("Can't create SIP response");
                        }
                    } catch (Exception e2) {
                        advr.g("Can't send 200 OK for OPTIONS: %s", e2.getMessage());
                        return;
                    }
                }
                throw new IllegalArgumentException("Invalid MSISDN in capability request");
            }
        } else if (b instanceof aikq) {
            aikq aikqVar = (aikq) b;
            str2 = aikqVar.a();
            if (aikqVar.e()) {
                str2 = "+".concat(String.valueOf(str2));
            }
        }
        if (adwf.w(str2) && !aczf.w()) {
            str = yjrVar.q(str2);
        } else {
            str = str2;
        }
        if (str == null) {
        }
        throw new IllegalArgumentException("Invalid MSISDN in capability request");
    }

    @Override // defpackage.adpw
    public final void s(String str, long j2, String str2) {
        if (str2 != null) {
            if (((Boolean) j.a()).booleanValue() && this.l.containsKey(str2)) {
                advr.c("Options Capabilities request for %s already pending", advq.PHONE_NUMBER.c(str2));
                return;
            }
            if (l()) {
                adqa adqaVar = this.h;
                if (adqaVar != null) {
                    adew adewVar = this.a;
                    adpo a = adqaVar.a();
                    if (adcx.r(adewVar).isPresent()) {
                        advr.c("Requesting Options capabilities for %s", advq.PHONE_NUMBER.c(str2));
                        armf armfVar = this.k;
                        adew adewVar2 = this.a;
                        yjr yjrVar = this.q;
                        aikb aikbVar = ((aikc) armfVar).a;
                        String l = adwf.l(str2, adewVar2.c(), yjrVar);
                        aikb aikbVar2 = ((aikc) this.k).a;
                        if (!aikbVar2.u()) {
                            String v = aikb.v();
                            if (!Objects.isNull(v)) {
                                String e = this.a.e();
                                if (!Objects.isNull(e)) {
                                    aijw aijwVar = new aijw(v, 1, l, e, l, aikbVar2.p());
                                    aion s = this.e.s(aikbVar, aijwVar);
                                    adta.h(s, a, r());
                                    adta.i(s.b(), a, r());
                                    adqc adqcVar = new adqc(this, j2, a, aijwVar, str2);
                                    this.l.put(str2, adqcVar);
                                    aikbVar.d(s, adqcVar);
                                    return;
                                }
                                throw new aild("Public User Identity is null in ImsModule. Can't create dialog path.");
                            }
                            throw new aild("CallId is null. Can't create dialog path.");
                        }
                        throw new aild("SipStack is null. Can't create dialog path.");
                    }
                    throw new aild("Network interface unavailable [AppId=" + str + ", id=" + j2 + ", MSISDN=" + advq.PHONE_NUMBER.c(str2) + "]");
                }
                throw new aild("Failed to request options capability: no capabilities factory available");
            }
            throw new aild("Unable to request options capabilities, capability service is not started!");
        }
        throw new IllegalArgumentException("MSISDN must not be null.");
    }

    @Override // defpackage.adpw
    public final void t(String str) {
        if (!((Boolean) j.a()).booleanValue() && this.l.containsKey(str)) {
            advr.c("Options Capabilities request for %s already pending", advq.PHONE_NUMBER.c(str));
        } else {
            s(null, 0L, str);
        }
    }

    public final void v(long j2, String str, adpo adpoVar) {
        this.l.remove(str);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((adpv) it.next()).k(j2, str, adpoVar);
        }
    }

    @Override // defpackage.adou
    public final void m() {
    }

    @Override // defpackage.adou
    public final void n() {
    }
}
