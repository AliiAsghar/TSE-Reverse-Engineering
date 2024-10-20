package defpackage;

import android.net.Network;
import android.telephony.ims.ImsManager;
import android.telephony.ims.ImsRcsManager;
import android.telephony.ims.RcsUceAdapter;
import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateManager;
import j$.util.Objects;
import j$.util.Optional;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfu implements adfa {
    static final acyz a = aczd.a(190970850);
    private final advp b;
    private final adgq c;
    private adgp d;

    @Deprecated
    private final adjv e;
    private final adjq f;
    private final acnx g;
    private int h = -1;
    private final adeu i = new adft();
    private final adwg j;

    public adfu(advp advpVar, adgq adgqVar, adwg adwgVar, adjv adjvVar, adjq adjqVar, acnx acnxVar) {
        this.b = advpVar;
        this.c = adgqVar;
        this.j = adwgVar;
        this.e = adjvVar;
        this.f = adjqVar;
        this.g = acnxVar;
    }

    @Override // defpackage.adfa
    public final adeu a() {
        return this.i;
    }

    @Override // defpackage.adfa
    public final adey b() {
        return null;
    }

    @Override // defpackage.adfa
    public final Optional c() {
        return Optional.of(adex.a((String) Optional.ofNullable(this.j.c).map(new addg(7)).orElse(null), (Network) Optional.ofNullable(this.j.b).orElse(null), l()));
    }

    @Override // defpackage.adfa
    public final String d() {
        adju adjuVar;
        if (!l()) {
            if (aczf.K()) {
                adjuVar = this.f.a.c();
            } else {
                adjuVar = this.e.a;
            }
            return adjuVar.l;
        }
        adgp adgpVar = this.d;
        adgpVar.getClass();
        return adgpVar.z();
    }

    @Override // defpackage.adfa
    public final synchronized void e() {
        adgp adgpVar = this.d;
        advr.l(this.b, "Destroying RegistrationEngine.", new Object[0]);
        if (!Objects.isNull(adgpVar)) {
            adgpVar.F();
            adgpVar.m();
            this.d = null;
        }
    }

    @Override // defpackage.adfa
    public final void f(PrintWriter printWriter) {
        String str;
        if (((Boolean) a.a()).booleanValue()) {
            printWriter.println("    - SingleRegistrationRegistrationController: ".concat(this.b.a));
            adgp adgpVar = this.d;
            if (adgpVar != null) {
                printWriter.println("     - SingleRegistrationStateMachine ".concat(String.valueOf(String.valueOf(adgpVar.i))));
                adgd adgdVar = (adgd) adgpVar.d();
                if (adgdVar != null) {
                    str = adgdVar.a();
                } else {
                    str = "UnknownState";
                }
                printWriter.println("       state: ".concat(str));
                SipDelegateConfiguration sipDelegateConfiguration = adgpVar.E;
                if (sipDelegateConfiguration != null) {
                    printWriter.println("       - SipDelegateConfiguration");
                    printWriter.println("         p_access_network_info_header: ".concat(String.valueOf(advq.GENERIC.c(sipDelegateConfiguration.getSipPaniHeader()))));
                    printWriter.println("         security_verify_header: ".concat(String.valueOf(advq.GENERIC.c(Optional.ofNullable(sipDelegateConfiguration.getIpSecConfiguration()).map(new addg(13)).orElse("")))));
                    printWriter.println("         home_domain: ".concat(String.valueOf(sipDelegateConfiguration.getHomeDomain())));
                    printWriter.println("         ue_public_user_id: ".concat(String.valueOf(advq.USER_ID.c(sipDelegateConfiguration.getPublicUserIdentifier()))));
                    printWriter.println("         server_default_ipaddress: ".concat(String.valueOf(advq.IP_ADDRESS.c(sipDelegateConfiguration.getSipServerAddress().getAddress().getHostAddress()))));
                    printWriter.println("         server_default_port: " + sipDelegateConfiguration.getSipServerAddress().getPort());
                    printWriter.println("         ue_default_ipaddress: ".concat(String.valueOf(advq.IP_ADDRESS.c(sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress()))));
                    printWriter.println("         ue_default_port: " + sipDelegateConfiguration.getLocalAddress().getPort());
                    printWriter.println("         p_associated_uri_header: ".concat(String.valueOf(advq.URI_SIP.c(sipDelegateConfiguration.getSipAssociatedUriHeader()))));
                    printWriter.println("         service_route_header: ".concat(String.valueOf(advq.IP_ADDRESS.c(sipDelegateConfiguration.getSipServiceRouteHeader()))));
                    printWriter.println("         uri_user_part: ".concat(String.valueOf(advq.USER_ID.c(sipDelegateConfiguration.getSipContactUserParameter()))));
                    printWriter.println("         user_agent: ".concat(String.valueOf(advq.GENERIC.c(sipDelegateConfiguration.getSipUserAgentHeader()))));
                }
            }
        }
    }

    @Override // defpackage.adfa
    public final void g(acok acokVar) {
        advr.l(this.b, "Restarting IMS registration. reason=%s", acokVar);
        int i = this.h;
        j(acokVar);
        i(i);
    }

    @Override // defpackage.adfa
    public final void h(acok acokVar, int i) {
        advr.l(this.b, "Restarting IMS registration. reason=%s sipCode=%d", acokVar, Integer.valueOf(i));
        if (acokVar == acok.REREGISTRATION_REQUIRED) {
            adgp adgpVar = this.d;
            if (adgpVar != null) {
                adgpVar.r(18, i);
                return;
            }
            return;
        }
        g(acokVar);
    }

    @Override // defpackage.adfa
    public final synchronized void i(int i) {
        ImsRcsManager imsRcsManager;
        ImsRcsManager imsRcsManager2;
        RcsUceAdapter uceAdapter;
        Optional empty;
        advr.l(this.b, "Request to start registration to IMS network.", new Object[0]);
        adgp adgpVar = this.d;
        if (adgpVar == null || adgpVar.d() == adgpVar.t) {
            if (!Objects.isNull(adgpVar)) {
                adgpVar.F();
            }
            advr.l(this.b, "Starting RegistrationStateMachine.", new Object[0]);
            adgq adgqVar = this.c;
            int b = adgqVar.d.b();
            ImsManager m69m = anf$$ExternalSyntheticApiModelOutline0.m69m(adgqVar.a.getSystemService(anf$$ExternalSyntheticApiModelOutline0.m77m()));
            imsRcsManager = m69m.getImsRcsManager(b);
            SipDelegateManager sipDelegateManager = m69m.getSipDelegateManager(b);
            imsRcsManager2 = m69m.getImsRcsManager(b);
            uceAdapter = imsRcsManager2.getUceAdapter();
            if (((Boolean) adaa.p().a.N.a()).booleanValue()) {
                empty = Optional.of(new adcx((byte[]) null));
            } else {
                empty = Optional.empty();
            }
            adgpVar = new adgp(uceAdapter, adgqVar.h, adgqVar.e, adgqVar.f, adgqVar.c, adgqVar.b, sipDelegateManager, adgqVar.g, adgqVar.r, adgqVar.i, adgqVar.n, adgqVar.j, adgqVar.o, adgqVar.p, imsRcsManager, adgqVar.k, adgqVar.l, empty, adgqVar.m, adgqVar.q);
            if (Objects.isNull(adgpVar)) {
                advr.g("Failed to create RegistrationEngineStateMachine.", new Object[0]);
                return;
            } else {
                adgpVar.o(new adgt(adgpVar.A(), this.g));
                adgpVar.v();
                this.d = adgpVar;
            }
        }
        if (!Objects.isNull(adgpVar)) {
            if (adgpVar.N()) {
                advr.d(this.b, "Already registered", new Object[0]);
            } else {
                this.h = i;
                adgpVar.q(3);
            }
        }
    }

    @Override // defpackage.adfa
    public final synchronized void j(acok acokVar) {
        advr.l(this.b, "Unregistering from IMS network. reason=%s", acokVar);
        adgp adgpVar = this.d;
        if (!Objects.isNull(adgpVar)) {
            adgpVar.F();
            this.d = null;
            this.h = -1;
        }
    }

    @Override // defpackage.adfa
    public final boolean k() {
        adgp adgpVar = this.d;
        if (Objects.isNull(adgpVar)) {
            return false;
        }
        if (!adgpVar.O() && !adgpVar.N()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.adfa
    public final boolean l() {
        adgp adgpVar = this.d;
        if (Objects.isNull(adgpVar)) {
            return false;
        }
        return adgpVar.N();
    }

    @Override // defpackage.adfa
    public final boolean m() {
        adgp adgpVar = this.d;
        if (Objects.isNull(adgpVar)) {
            return false;
        }
        return adgpVar.O();
    }

    @Override // defpackage.adfa
    public final boolean n() {
        return false;
    }
}
