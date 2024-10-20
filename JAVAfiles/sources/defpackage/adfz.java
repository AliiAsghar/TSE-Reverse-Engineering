package defpackage;

import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateConnection;
import android.telephony.ims.stub.DelegateConnectionStateCallback;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfz implements DelegateConnectionStateCallback {
    public static final /* synthetic */ int a = 0;
    private final adgp b;
    private final String c;
    private final SettableFuture d;
    private final adih e;

    public adfz(adgp adgpVar, adih adihVar, String str, SettableFuture settableFuture) {
        this.b = adgpVar;
        this.e = adihVar;
        this.c = str;
        this.d = settableFuture;
    }

    public final void onConfigurationChanged(SipDelegateConfiguration sipDelegateConfiguration) {
        int i;
        advr.l(this.b.i, "ConnectionStateCallback[%s]#onConfigurationChanged, version: %d", this.c, Long.valueOf(sipDelegateConfiguration.getVersion()));
        if (advr.v()) {
            alok alokVar = new alok();
            alokVar.h("p_access_network_info_header", advq.GENERIC.c(sipDelegateConfiguration.getSipPaniHeader()));
            alokVar.h("security_verify_header", advq.GENERIC.c(Optional.ofNullable(sipDelegateConfiguration.getIpSecConfiguration()).map(new addg(15)).orElse("")));
            alokVar.h("home_domain", Optional.ofNullable(sipDelegateConfiguration.getHomeDomain()).orElse(""));
            alokVar.h("ue_public_user_id", advq.USER_ID.c(sipDelegateConfiguration.getPublicUserIdentifier()));
            alokVar.h("server_default_ipaddress", advq.IP_ADDRESS.c(sipDelegateConfiguration.getSipServerAddress().getAddress().getHostAddress()));
            alokVar.h("server_default_port", Integer.valueOf(sipDelegateConfiguration.getSipServerAddress().getPort()));
            alokVar.h("ue_default_ipaddress", advq.IP_ADDRESS.c(sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress()));
            alokVar.h("ue_default_port", Integer.valueOf(sipDelegateConfiguration.getLocalAddress().getPort()));
            alokVar.h("p_associated_uri_header", advq.URI_SIP.c(sipDelegateConfiguration.getSipAssociatedUriHeader()));
            alokVar.h("service_route_header", advq.IP_ADDRESS.c(sipDelegateConfiguration.getSipServiceRouteHeader()));
            alokVar.h("sip_instance", albo.ag(this.b.G));
            alokVar.h("uri_user_part", advq.USER_ID.c(albo.ag(sipDelegateConfiguration.getSipContactUserParameter())));
            advr.d(this.b.i, "SipDelegateConfiguration changed: %s", Collection.EL.stream(alokVar.b().entrySet()).map(new addg(16)).collect(Collectors.joining("\n")));
        }
        if (albo.ah(sipDelegateConfiguration.getImei())) {
            advr.h(this.b.i, "Invalid SipDelegateConfiguration with an empty IMEI", new Object[0]);
            i = 4;
        } else if (albo.ah(sipDelegateConfiguration.getSipContactUserParameter())) {
            advr.h(this.b.i, "Invalid SipDelegateConfiguration with an empty Contact Username", new Object[0]);
            i = 5;
        } else if (albo.ah(sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress())) {
            advr.h(this.b.i, "Invalid SipDelegateConfiguration with an empty HostAddress", new Object[0]);
            i = 6;
        } else {
            i = 2;
        }
        if (((Boolean) adgp.d.a()).booleanValue()) {
            int i2 = i - 1;
            adih adihVar = this.e;
            adgp adgpVar = this.b;
            String str = this.c;
            String A = adgpVar.A();
            long version = sipDelegateConfiguration.getVersion();
            aozy createBuilder = apha.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apha aphaVar = (apha) apagVar;
            A.getClass();
            aphaVar.b |= 2;
            aphaVar.d = A;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apha aphaVar2 = (apha) createBuilder.b;
            str.getClass();
            aphaVar2.b |= 1;
            aphaVar2.c = str;
            aozy createBuilder2 = apgw.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            apgw apgwVar = (apgw) apagVar2;
            apgwVar.b |= 1;
            apgwVar.c = version;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            apgw apgwVar2 = (apgw) createBuilder2.b;
            apgwVar2.d = i2;
            apgwVar2.b |= 2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apha aphaVar3 = (apha) createBuilder.b;
            apgw apgwVar3 = (apgw) createBuilder2.s();
            apgwVar3.getClass();
            aphaVar3.f = apgwVar3;
            aphaVar3.b |= 8;
            adihVar.g((apha) createBuilder.s());
        }
        if (i != 2) {
            advr.h(this.b.i, "Invalid SipDelegateConfiguration. state=%d", Integer.valueOf(i - 1));
        } else {
            this.b.s(2, sipDelegateConfiguration);
        }
    }

    public final void onCreated(SipDelegateConnection sipDelegateConnection) {
        advr.d(this.b.i, "ConnectionStateCallback[%s]#onCreated", this.c);
        if (((Boolean) adgp.d.a()).booleanValue()) {
            adih adihVar = this.e;
            adgp adgpVar = this.b;
            String str = this.c;
            String A = adgpVar.A();
            aozy createBuilder = apha.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apha aphaVar = (apha) apagVar;
            A.getClass();
            aphaVar.b |= 2;
            aphaVar.d = A;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apha aphaVar2 = (apha) createBuilder.b;
            str.getClass();
            aphaVar2.b |= 1;
            aphaVar2.c = str;
            aozy createBuilder2 = apgx.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apgx apgxVar = (apgx) createBuilder2.b;
            apgxVar.d = 2;
            apgxVar.b |= 2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apha aphaVar3 = (apha) createBuilder.b;
            apgx apgxVar2 = (apgx) createBuilder2.s();
            apgxVar2.getClass();
            aphaVar3.i = apgxVar2;
            aphaVar3.b |= 64;
            adihVar.g((apha) createBuilder.s());
        }
        this.b.s(1, sipDelegateConnection);
    }

    public final void onDestroyed(int i) {
        String str;
        String str2 = this.c;
        Integer valueOf = Integer.valueOf(i);
        int i2 = adfs.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "SIP_DELEGATE_DESTROY_REASON_UNKNOWN";
                    } else {
                        str = "SIP_DELEGATE_DESTROY_REASON_SUBSCRIPTION_TORN_DOWN";
                    }
                } else {
                    str = "SIP_DELEGATE_DESTROY_REASON_USER_DISABLED_RCS";
                }
            } else {
                str = "SIP_DELEGATE_DESTROY_REASON_REQUESTED_BY_APP";
            }
        } else {
            str = "SIP_DELEGATE_DESTROY_REASON_SERVICE_DEAD";
        }
        advr.l(this.b.i, "ConnectionStateCallback[%s]#onDestroyed: code: %d, name: %s}", str2, valueOf, str);
        if (((Boolean) adgp.d.a()).booleanValue()) {
            adih adihVar = this.e;
            adgp adgpVar = this.b;
            String str3 = this.c;
            String A = adgpVar.A();
            aozy createBuilder = apha.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apha aphaVar = (apha) apagVar;
            A.getClass();
            aphaVar.b |= 2;
            aphaVar.d = A;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apha aphaVar2 = (apha) createBuilder.b;
            str3.getClass();
            aphaVar2.b |= 1;
            aphaVar2.c = str3;
            aozy createBuilder2 = apgy.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apgy apgyVar = (apgy) createBuilder2.b;
            apgyVar.b = 1 | apgyVar.b;
            apgyVar.c = i;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apha aphaVar3 = (apha) createBuilder.b;
            apgy apgyVar2 = (apgy) createBuilder2.s();
            apgyVar2.getClass();
            aphaVar3.g = apgyVar2;
            aphaVar3.b |= 16;
            adihVar.g((apha) createBuilder.s());
        }
        this.d.set(this.b.D);
        if (i != 2) {
            this.b.r(8, i);
        }
    }

    public final void onFeatureTagStatusChanged(DelegateRegistrationState delegateRegistrationState, Set set) {
        alpt alptVar;
        alpt alptVar2;
        if (yhx.f) {
            alptVar = alpt.o(delegateRegistrationState.getRegisteringFeatureTags());
        } else {
            alptVar = altg.a;
        }
        alpt o = alpt.o(delegateRegistrationState.getRegisteredFeatureTags());
        int i = 10;
        alpt alptVar3 = (alpt) Collection.EL.stream(set).map(new addg(i)).collect(alls.b);
        alpt alptVar4 = (alpt) Collection.EL.stream(delegateRegistrationState.getDeregisteredFeatureTags()).map(new addg(i)).collect(alls.b);
        alpt alptVar5 = (alpt) Collection.EL.stream(delegateRegistrationState.getDeregisteringFeatureTags()).map(new addg(i)).collect(alls.b);
        int i2 = 0;
        int i3 = 1;
        advr.l(this.b.i, "ConnectionStateCallback[%s]#onFeatureTagStatusChanged: registering=[%s], registered=[%s], deregistering=[%s], deregistered=[%s], denied=[%s]", this.c, alptVar, o, alptVar5, alptVar4, alptVar3);
        if (((Boolean) adgp.d.a()).booleanValue()) {
            adih adihVar = this.e;
            adgp adgpVar = this.b;
            String str = this.c;
            String A = adgpVar.A();
            if (((Boolean) adgp.h.a()).booleanValue()) {
                alptVar2 = alptVar;
            } else {
                alptVar2 = altg.a;
            }
            aozy createBuilder = apgz.a.createBuilder();
            Collection.EL.stream(o).forEach(new acsa(createBuilder, 19));
            Collection.EL.stream(alptVar4).forEach(new acsa(createBuilder, 20));
            Collection.EL.stream(alptVar3).forEach(new adgr(createBuilder, i3));
            Collection.EL.stream(alptVar2).forEach(new adgr(createBuilder, i2));
            Collection.EL.stream(alptVar5).forEach(new adgr(createBuilder, 2));
            aozy createBuilder2 = apha.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            apha aphaVar = (apha) apagVar;
            A.getClass();
            aphaVar.b |= 2;
            aphaVar.d = A;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            apha aphaVar2 = (apha) apagVar2;
            str.getClass();
            aphaVar2.b |= 1;
            aphaVar2.c = str;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            apha aphaVar3 = (apha) createBuilder2.b;
            apgz apgzVar = (apgz) createBuilder.s();
            apgzVar.getClass();
            aphaVar3.e = apgzVar;
            aphaVar3.b |= 4;
            adihVar.g((apha) createBuilder2.s());
        }
        boolean containsAll = o.containsAll(this.b.y());
        boolean containsAll2 = o.containsAll(this.b.x());
        boolean isEmpty = alptVar3.isEmpty();
        boolean isEmpty2 = alptVar.isEmpty();
        boolean isEmpty3 = alptVar5.isEmpty();
        if (containsAll) {
            if (!containsAll2) {
                advr.r(this.b.i, "transitioning to REGISTERED state with pending unregistered feature tags", new Object[0]);
            }
            this.b.s(5, delegateRegistrationState);
        } else if (((Boolean) adgp.h.a()).booleanValue() && !isEmpty2) {
            advr.l(this.b.i, "#onFeatureTagStatusChange still awaiting required feature tag registrations: [%s]", alptVar);
        } else if (!isEmpty) {
            advr.r(this.b.i, "#onFeatureTagStatusChanged missing required feature tags, registration failed", new Object[0]);
            this.b.q(7);
        } else if (!isEmpty3) {
            advr.l(this.b.i, "#onFeatureTagStatusChanged deregistering feature tags are ignored, waiting until feature tags become deregistered for further processing", new Object[0]);
        } else {
            advr.r(this.b.i, "#onFeatureTagStatusChanged missing required feature tags, registration deactivated", new Object[0]);
            this.b.q(6);
        }
    }
}
