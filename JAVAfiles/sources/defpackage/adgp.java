package defpackage;

import android.content.Context;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.DelegateRequest;
import android.telephony.ims.ImsException;
import android.telephony.ims.ImsRcsManager;
import android.telephony.ims.RcsUceAdapter;
import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateConnection;
import android.telephony.ims.SipDelegateManager;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgp extends acyj {
    public static final /* synthetic */ int L = 0;
    public final RcsUceAdapter A;
    public final adwe B;
    public final acnx C;
    public SipDelegateConnection D;
    public SipDelegateConfiguration E;
    public adgs F;
    public String G;
    public RcsUceAdapter.OnPublishStateChangedListener H;
    public final Optional I;
    public final UUID J;
    public final adgu K;
    private final adgb N;
    private final aikc O;

    @Deprecated
    private final adjv P;

    @Deprecated
    private final InstantMessageConfiguration Q;
    private final ImsRcsManager R;
    private final AtomicInteger S;
    private final RcsUceAdapter.OnPublishStateChangedListener T;
    private final adjq U;
    private adfp V;
    private SettableFuture W;
    private alpt X;
    private final adih Y;
    private final adwg Z;
    private final agrk aa;
    public final advp i;
    final adgd j;
    final adgd k;
    final adgd l;
    final adgd m;
    final adgd n;
    final adgd o;
    final adgd p;
    final adgd q;
    final adgd r;
    final adgd s;
    final adgd t;
    final alpt u;
    public final adfk v;
    public final aijx w;
    public final adfq x;
    public final SipDelegateManager y;
    public final aneo z;
    static final acyz d = aczd.a(190037064);
    static final acyz e = aczd.a(190018698);
    static final acyz f = aczd.a(172413462);
    static final acyz g = aczd.a(189380557);
    static final acyz h = acyy.b("enable_processing_registering_feature_tags");
    private static final String M = adta.g();

    public adgp(RcsUceAdapter rcsUceAdapter, adfk adfkVar, aikc aikcVar, adfq adfqVar, aijx aijxVar, advp advpVar, SipDelegateManager sipDelegateManager, aneo aneoVar, adwg adwgVar, adjv adjvVar, adjq adjqVar, InstantMessageConfiguration instantMessageConfiguration, acqj acqjVar, adih adihVar, ImsRcsManager imsRcsManager, adfr adfrVar, adwe adweVar, Optional optional, acnx acnxVar, final addp addpVar) {
        super("SingleRegistrationStatemachine");
        alpt r;
        adgh adghVar = new adgh(this);
        this.j = adghVar;
        adge adgeVar = new adge(this);
        this.k = adgeVar;
        adgk adgkVar = new adgk(this);
        this.l = adgkVar;
        adgj adgjVar = new adgj(this);
        this.m = adgjVar;
        adgm adgmVar = new adgm(this);
        this.n = adgmVar;
        adgl adglVar = new adgl(this);
        this.o = adglVar;
        adgi adgiVar = new adgi(this);
        this.p = adgiVar;
        adgf adgfVar = new adgf(this);
        this.q = adgfVar;
        adgg adggVar = new adgg(this);
        this.r = adggVar;
        adgn adgnVar = new adgn(this);
        this.s = adgnVar;
        adgo adgoVar = new adgo(this);
        this.t = adgoVar;
        if (P()) {
            r = alpt.s(adgeVar, adgmVar, adglVar);
        } else {
            r = alpt.r(adgeVar, adgmVar);
        }
        this.u = r;
        new CopyOnWriteArrayList();
        this.S = new AtomicInteger(0);
        this.X = altg.a;
        this.A = rcsUceAdapter;
        this.v = adfkVar;
        this.i = advpVar.b("[SRRSM]");
        this.w = aijxVar;
        this.O = aikcVar;
        this.x = adfqVar;
        this.y = sipDelegateManager;
        this.z = aneoVar;
        this.Z = adwgVar;
        this.P = adjvVar;
        this.U = adjqVar;
        this.Q = instantMessageConfiguration;
        this.Y = adihVar;
        this.R = imsRcsManager;
        this.N = new adgb(adfrVar);
        this.B = adweVar;
        this.I = optional;
        this.C = acnxVar;
        this.J = UUID.randomUUID();
        this.aa = new agrk(advpVar, acqjVar);
        this.K = new adgu();
        this.T = new RcsUceAdapter.OnPublishStateChangedListener() { // from class: adfw
            public final void onPublishStateChange(int i) {
                String uuid = adgp.this.J.toString();
                aozy createBuilder = apgv.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                apgv apgvVar = (apgv) apagVar;
                int i2 = 7;
                apgvVar.f = 7;
                apgvVar.b |= 2;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apgv apgvVar2 = (apgv) createBuilder.b;
                apgvVar2.g = 2;
                apgvVar2.b |= 4;
                aozy createBuilder2 = apgn.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                apgn apgnVar = (apgn) apagVar2;
                uuid.getClass();
                apgnVar.b |= 1;
                apgnVar.c = uuid;
                switch (i) {
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        break;
                    case 7:
                        i2 = 8;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                apgn apgnVar2 = (apgn) createBuilder2.b;
                apgnVar2.d = i2 - 1;
                apgnVar2.b |= 2;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                addp addpVar2 = addpVar;
                apgv apgvVar3 = (apgv) createBuilder.b;
                apgn apgnVar3 = (apgn) createBuilder2.s();
                apgnVar3.getClass();
                apgvVar3.d = apgnVar3;
                apgvVar3.c = 10;
                ((acoc) addpVar2.b).h((Context) addpVar2.a, (apgv) createBuilder.s());
            }
        };
        e(adghVar);
        e(adgeVar);
        e(adgmVar);
        e(adgjVar);
        e(adgkVar);
        e(adglVar);
        f(adgiVar, adglVar);
        e(adggVar);
        e(adgfVar);
        e(adgnVar);
        e(adgoVar);
        u(adghVar);
    }

    public static boolean P() {
        if ((aczf.I() || ((Boolean) aczf.o().a.p.a()).booleanValue()) && ((Boolean) g.a()).booleanValue()) {
            return true;
        }
        return false;
    }

    private final void Q() {
        adjt adjtVar;
        boolean z;
        String str;
        int i;
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        if (aczf.K()) {
            adjtVar = new adjt(this.U.a.c());
        } else {
            adjtVar = new adjt(this.P.a);
        }
        String homeDomain = sipDelegateConfiguration.getHomeDomain();
        homeDomain.getClass();
        adjtVar.k(homeDomain);
        int port = sipDelegateConfiguration.getSipServerAddress().getPort();
        if (port > 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        adjtVar.l(port);
        String homeDomain2 = sipDelegateConfiguration.getHomeDomain();
        homeDomain2.getClass();
        adjtVar.f(homeDomain2);
        String z2 = z();
        try {
            aiks aiksVar = new ailc(z2).f().b;
            if (aiksVar.l()) {
                str = ((aikp) aiksVar).e();
                if (albo.ah(str)) {
                    throw new IllegalArgumentException(a.cp(z2, "Given public identity does not have a user part: "));
                }
            } else {
                aikq aikqVar = (aikq) aiksVar;
                String a = aikqVar.a();
                if (aikqVar.e()) {
                    str = a.cp(a, "+");
                } else {
                    str = a;
                }
            }
            adjtVar.r(z2);
            adjtVar.z(str);
            if (aczf.K()) {
                i = this.U.b;
            } else {
                i = this.P.b;
            }
            if (aczf.K()) {
                Configuration configuration = this.U.a;
                configuration.h(ImsConfiguration.a(adjtVar.a()));
                this.U.a(configuration, i);
                return;
            }
            this.P.a(adjtVar.a(), i);
        } catch (ailb e2) {
            throw new IllegalArgumentException("Can't parse: ".concat(String.valueOf(z2)), e2);
        }
    }

    private final void R(aikb aikbVar) {
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        String str = (String) Optional.ofNullable(sipDelegateConfiguration.getIpSecConfiguration()).map(new addg(13)).orElse("");
        if (!TextUtils.isEmpty(str)) {
            aikbVar.e = Optional.ofNullable(str);
        } else {
            advr.d(this.i, "Security-Verify header in configuration is null or empty", new Object[0]);
        }
    }

    private final void S(aikb aikbVar) {
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        String sipServiceRouteHeader = sipDelegateConfiguration.getSipServiceRouteHeader();
        if (!TextUtils.isEmpty(sipServiceRouteHeader)) {
            List<String> c = anna.e(',').c(sipServiceRouteHeader);
            ArrayList arrayList = new ArrayList();
            for (String str : c) {
                try {
                    aimh X = ahmc.X("Route", str);
                    advr.d(this.i, "service route headers are %s", advq.IP_ADDRESS.c(str));
                    arrayList.add((aimt) X);
                } catch (ailb e2) {
                    advr.j(e2, this.i, "Invalid ServiceRoute header: %s", advq.IP_ADDRESS.c(str));
                }
            }
            aikbVar.s(arrayList);
            return;
        }
        advr.d(this.i, "Route header in configuration is null or empty", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String A() {
        return this.J.toString();
    }

    public final void B() {
        if (this.D != null) {
            advr.l(this.i, "Already connected", new Object[0]);
            return;
        }
        int incrementAndGet = this.S.incrementAndGet();
        String uuid = UUID.randomUUID().toString();
        String A = A();
        alpt x = x();
        DelegateRequest delegateRequest = new DelegateRequest(x);
        SettableFuture create = SettableFuture.create();
        this.W = create;
        adfz adfzVar = new adfz(this, this.Y, uuid, create);
        adfy adfyVar = new adfy(this, this.Y, uuid);
        t(16, TimeUnit.SECONDS.toMillis(((Long) adaa.p().a.D.a()).longValue()));
        advr.d(this.i, "creating SipDelegate for instanceId:[%s], featureTags:[%s]", uuid, x);
        try {
            this.y.createSipDelegate(delegateRequest, this.z, adfzVar, adfyVar);
            if (((Boolean) d.a()).booleanValue()) {
                adih adihVar = this.Y;
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
                uuid.getClass();
                aphaVar2.b |= 1;
                aphaVar2.c = uuid;
                aozy createBuilder2 = apgx.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                apgx apgxVar = (apgx) apagVar2;
                apgxVar.b |= 1;
                apgxVar.c = incrementAndGet;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                apgx apgxVar2 = (apgx) createBuilder2.b;
                apgxVar2.d = 1;
                apgxVar2.b |= 2;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apha aphaVar3 = (apha) createBuilder.b;
                apgx apgxVar3 = (apgx) createBuilder2.s();
                apgxVar3.getClass();
                aphaVar3.i = apgxVar3;
                aphaVar3.b |= 64;
                adihVar.g((apha) createBuilder.s());
            }
        } catch (ImsException e2) {
            int min = Math.min(incrementAndGet * 3, 3600);
            if (((Boolean) d.a()).booleanValue()) {
                this.Y.f(A, uuid, incrementAndGet);
            }
            advr.j(e2, this.i, "Error while creating delegate connection. Reconnecting in %s", Integer.valueOf(min));
            I(adgc.RESET_FROM_CONNECT_IMS_EXCEPTION);
            w(this.j);
            t(3, TimeUnit.SECONDS.toMillis(min));
        } catch (Exception e3) {
            if (((Boolean) d.a()).booleanValue()) {
                this.Y.f(A, uuid, incrementAndGet);
            }
            advr.j(e3, this.i, "Error while creating delegate connection. Terminating state machine.", new Object[0]);
            w(this.t);
        }
    }

    public final void C(int i) {
        this.D = null;
        if (i == 2) {
            w(this.t);
        } else {
            w(this.s);
        }
    }

    public final void D() {
        alog g2;
        adju adjuVar;
        try {
            this.S.set(0);
            Q();
            SipDelegateConfiguration sipDelegateConfiguration = this.E;
            sipDelegateConfiguration.getClass();
            SipDelegateConnection sipDelegateConnection = this.D;
            sipDelegateConnection.getClass();
            adgs adgsVar = new adgs(sipDelegateConnection, sipDelegateConfiguration);
            this.F = adgsVar;
            SipDelegateConfiguration sipDelegateConfiguration2 = this.E;
            if (sipDelegateConfiguration2 != null) {
                String sipContactUserParameter = sipDelegateConfiguration2.getSipContactUserParameter();
                sipContactUserParameter.getClass();
                String homeDomain = sipDelegateConfiguration2.getHomeDomain();
                homeDomain.getClass();
                String imei = sipDelegateConfiguration2.getImei();
                imei.getClass();
                String Z = agkx.Z(imei);
                this.G = Z;
                SipDelegateConfiguration sipDelegateConfiguration3 = this.E;
                sipDelegateConfiguration3.getClass();
                M(sipDelegateConfiguration3);
                alob alobVar = new alob();
                alobVar.h(new aijy() { // from class: adfx
                    @Override // defpackage.aijy
                    public final void a(aiom aiomVar) {
                        adgp adgpVar = adgp.this;
                        SipDelegateConfiguration sipDelegateConfiguration4 = adgpVar.E;
                        sipDelegateConfiguration4.getClass();
                        String sipPaniHeader = sipDelegateConfiguration4.getSipPaniHeader();
                        if (!TextUtils.isEmpty(sipPaniHeader)) {
                            try {
                                aiomVar.q(ahmc.X("P-Access-Network-Info", sipPaniHeader));
                            } catch (ailb e2) {
                                advr.j(e2, adgpVar.i, "Exception while adding PANI header", new Object[0]);
                            }
                        } else {
                            advr.l(adgpVar.i, "No PANI header in configuration", new Object[0]);
                        }
                        SipDelegateConfiguration sipDelegateConfiguration5 = adgpVar.E;
                        sipDelegateConfiguration5.getClass();
                        String sipPlaniHeader = sipDelegateConfiguration5.getSipPlaniHeader();
                        if (!TextUtils.isEmpty(sipPlaniHeader)) {
                            try {
                                aiomVar.q(ahmc.X("P-Last-Access-Network-Info", sipPlaniHeader));
                            } catch (ailb e3) {
                                advr.j(e3, adgpVar.i, "Exception while adding PLANI header", new Object[0]);
                            }
                        } else {
                            advr.l(adgpVar.i, "No PLANI header in configuration", new Object[0]);
                        }
                        SipDelegateConfiguration sipDelegateConfiguration6 = adgpVar.E;
                        sipDelegateConfiguration6.getClass();
                        String sipUserAgentHeader = sipDelegateConfiguration6.getSipUserAgentHeader();
                        if (!TextUtils.isEmpty(sipUserAgentHeader)) {
                            adwe adweVar = adgpVar.B;
                            String str = sipUserAgentHeader + ((String) aczf.o().a.H.a()) + adwg.c(adweVar.b.b());
                            try {
                                if (((Boolean) adgp.f.a()).booleanValue()) {
                                    aiomVar.t("User-Agent");
                                    aiomVar.q(adwf.f(str));
                                    return;
                                } else {
                                    if (!aiomVar.v("User-Agent")) {
                                        aiomVar.q(adwf.f(str));
                                        return;
                                    }
                                    return;
                                }
                            } catch (ailb e4) {
                                advr.j(e4, adgpVar.i, "Exception while adding User-Agent header", new Object[0]);
                                return;
                            }
                        }
                        advr.l(adgpVar.i, "No User-Agent header in configuration", new Object[0]);
                    }
                });
                alobVar.h(new adwa(this.x));
                if (aczf.I()) {
                    alobVar.h(new adwh(new altx("INVITE"), 1));
                    g2 = alobVar.g();
                } else {
                    g2 = alobVar.g();
                }
                if (aczf.K()) {
                    adjuVar = this.U.a.c();
                } else {
                    adjuVar = this.P.a;
                }
                aiki F = this.aa.F(adgsVar, new ailf(adjuVar.g, adjuVar.h, adjuVar.i));
                aikd x = aike.x();
                x.d(this.i);
                x.g(sipContactUserParameter);
                x.c(homeDomain);
                x.a = F;
                x.f(ailh.TCP);
                x.e(Z);
                x.b(g2);
                aike a = x.a();
                aijx aijxVar = this.w;
                if (aijxVar != null) {
                    a.q(aijxVar);
                }
                a.t();
                S(a);
                R(a);
                this.O.a = a;
                SipDelegateConfiguration sipDelegateConfiguration4 = this.E;
                sipDelegateConfiguration4.getClass();
                InetSocketAddress localAddress = sipDelegateConfiguration4.getLocalAddress();
                this.Z.d(localAddress.getHostString());
                advr.d(this.i, "IMS PDN addresses: %s", advq.IP_ADDRESS.c(localAddress.getHostString()));
                w(this.o);
                return;
            }
            throw new IllegalStateException("No IMS configuration available");
        } catch (Exception e2) {
            advr.j(e2, this.i, "Error while starting SIP stack!", new Object[0]);
            w(this.t);
        }
    }

    public final void E() {
        adfk adfkVar = this.v;
        if (adfkVar != null) {
            adfkVar.f(acok.UNKNOWN);
        }
        w(this.s);
    }

    public final void F() {
        q(4);
        SettableFuture settableFuture = this.W;
        if (settableFuture != null) {
            try {
                if (((SipDelegateConnection) settableFuture.get(10L, TimeUnit.SECONDS)) == null) {
                    advr.q("Timeout on waiting for callback.", new Object[0]);
                }
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                advr.q("Interrupted waiting for connection termination.", new Object[0]);
            }
        }
        try {
            this.A.removeOnPublishStateChangedListener(this.T);
        } catch (ImsException e2) {
            advr.j(e2, this.i, "Failed to unregister publish state change listener logger", new Object[0]);
        }
    }

    public final void G(acok acokVar) {
        adfk adfkVar = this.v;
        if (adfkVar != null) {
            adfkVar.h(acokVar);
        }
    }

    public final void H() {
        p(16);
    }

    public final void I(adgc adgcVar) {
        String str;
        if (this.D != null) {
            str = "with-connection";
        } else {
            str = "without-connection";
        }
        adgc adgcVar2 = adgc.RESET_FROM_STATE_RETRY;
        advr.d(this.i, "stateMachine#resetStateMachine [%s] with reason: [%s]", str, adgcVar.c);
        SipDelegateConnection sipDelegateConnection = this.D;
        if (sipDelegateConnection != null) {
            this.y.destroySipDelegate(sipDelegateConnection, 2);
            this.D = null;
        }
        H();
        this.E = null;
        this.F = null;
        this.O.a();
    }

    public final void J(int i) {
        if (i >= 100 && i <= 699) {
            SipDelegateConnection sipDelegateConnection = this.D;
            if (sipDelegateConnection != null) {
                this.y.triggerFullNetworkRegistration(sipDelegateConnection, i, (String) null);
                return;
            }
            return;
        }
        advr.h(this.i, "Invalid sipCode %d", Integer.valueOf(i));
    }

    public final synchronized void K(SipDelegateConfiguration sipDelegateConfiguration) {
        Optional map = Optional.ofNullable(this.E).map(new addg(14));
        long version = sipDelegateConfiguration.getVersion();
        if (map.isPresent() && version < ((Long) map.get()).longValue()) {
            advr.r(this.i, "invalid configuration downgrade from version[%d] to version[%d], ignoring configuration update", map.get(), Long.valueOf(version));
            return;
        }
        advr.l(this.i, "updating configuration from version %d -> %d", map.orElse(-1L), Long.valueOf(version));
        this.E = sipDelegateConfiguration;
        aikb aikbVar = this.O.a;
        R(aikbVar);
        S(aikbVar);
        Q();
        this.Z.d(sipDelegateConfiguration.getLocalAddress().getHostString());
        adgs adgsVar = this.F;
        if (adgsVar != null) {
            advr.l(adgs.a, "updating SipTransport configuration from version %d -> %d", Long.valueOf(adgsVar.b.getVersion()), Long.valueOf(sipDelegateConfiguration.getVersion()));
            adgsVar.b = sipDelegateConfiguration;
        }
    }

    public final void L(DelegateRegistrationState delegateRegistrationState) {
        this.X = alpt.o(delegateRegistrationState.getRegisteredFeatureTags());
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        if (sipDelegateConfiguration != null) {
            M(sipDelegateConfiguration);
        }
    }

    public final void M(SipDelegateConfiguration sipDelegateConfiguration) {
        ailh ailhVar;
        String str;
        String imei = sipDelegateConfiguration.getImei();
        imei.getClass();
        this.G = agkx.Z(imei);
        if (sipDelegateConfiguration.getTransportType() == 1) {
            ailhVar = ailh.TCP;
        } else {
            ailhVar = ailh.UDP;
        }
        ajqc a = adfp.a();
        if (sipDelegateConfiguration.getPublicGruuUri() != null) {
            str = String.valueOf(sipDelegateConfiguration.getPublicGruuUri());
        } else {
            str = null;
        }
        a.b = Optional.ofNullable(str);
        String sipContactUserParameter = sipDelegateConfiguration.getSipContactUserParameter();
        sipContactUserParameter.getClass();
        a.a = sipContactUserParameter;
        String hostAddress = sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress();
        hostAddress.getClass();
        a.m(hostAddress);
        a.n(ailhVar);
        a.l(sipDelegateConfiguration.getLocalAddress().getPort());
        a.k(albo.ag(this.G));
        a.c = Optional.of(albo.ag(sipDelegateConfiguration.getSipPaniHeader()));
        a.o(this.X);
        adfp j = a.j();
        this.V = j;
        this.x.a = j;
    }

    public final boolean N() {
        acyh d2 = d();
        if (P()) {
            if (d2 != this.p) {
                return false;
            }
            return true;
        }
        if (d2 != this.o && d2 != this.p) {
            return false;
        }
        return true;
    }

    public final boolean O() {
        return this.u.contains(d());
    }

    @Override // defpackage.acyj
    public final void v() {
        super.v();
        advr.l(this.i, "starting SingleRegistrationRegistrationStateMachine[%s]", A());
        aijx aijxVar = this.w;
        if (aijxVar != null) {
            aijxVar.d();
        }
        if (((Boolean) e.a()).booleanValue()) {
            try {
                this.R.registerImsRegistrationCallback(this.z, this.N);
            } catch (ImsException e2) {
                advr.j(e2, this.i, "Failed to register ImsRegistrationCallback.", new Object[0]);
            }
        }
        try {
            this.A.addOnPublishStateChangedListener(this.z, this.T);
        } catch (ImsException e3) {
            advr.j(e3, this.i, "Failed to register publish state change listener logger", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alpt x() {
        boolean F;
        String str;
        alpt y = y();
        if (y.contains(adsg.b)) {
            alpr alprVar = new alpr();
            alprVar.j(y);
            alprVar.i(adsg.e, adsg.f);
            if (((Boolean) aczf.o().a.w.a()).booleanValue()) {
                alprVar.c(adsg.g);
            }
            if (((Boolean) adaa.p().a.K.a()).booleanValue()) {
                if (!TextUtils.isEmpty(adaa.q())) {
                    str = String.format("+g.gsma.rcs.botversion=\"%s\"", adaa.q());
                } else {
                    str = M;
                }
                alprVar.i(adsg.h, str);
            }
            if (aczf.K()) {
                F = this.U.a.mServicesConfiguration.mStandaloneMsgAuth;
            } else {
                F = aczf.F();
            }
            if (F) {
                alprVar.i(adsg.c, adsg.d);
            }
            return alprVar.g();
        }
        return y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alpt y() {
        InstantMessageConfiguration instantMessageConfiguration;
        String str;
        if (aczf.K()) {
            instantMessageConfiguration = this.U.a.mInstantMessageConfiguration;
        } else {
            instantMessageConfiguration = this.Q;
        }
        advp advpVar = adwf.a;
        if (instantMessageConfiguration.a()) {
            str = adsg.b;
        } else {
            str = "+g.oma.sip-im";
        }
        return new altx(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String z() {
        Optional empty;
        SipDelegateConfiguration sipDelegateConfiguration = this.E;
        sipDelegateConfiguration.getClass();
        alog a = this.K.a(sipDelegateConfiguration);
        Optional findFirst = Collection.EL.stream(a).filter(new addf(8)).findFirst();
        if (findFirst.isPresent()) {
            return (String) findFirst.get();
        }
        String ag = albo.ag(sipDelegateConfiguration.getHomeDomain());
        if (!ag.isEmpty()) {
            empty = Collection.EL.stream(a).filter(new zko(ag, 6)).filter(new addf(7)).findFirst();
        } else {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            return (String) empty.get();
        }
        Optional findFirst2 = Collection.EL.stream(a).filter(new addf(9)).findFirst();
        if (findFirst2.isPresent()) {
            return (String) findFirst2.get();
        }
        String publicUserIdentifier = sipDelegateConfiguration.getPublicUserIdentifier();
        if (!albo.ah(publicUserIdentifier)) {
            return publicUserIdentifier;
        }
        throw new IllegalStateException("No proper public identity can be calculated.");
    }
}
