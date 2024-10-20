package defpackage;

import android.os.PowerManager;
import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhw extends acyj {
    public static final acyz d = aczd.a(168944779);
    public static final acyz e = aczd.a(177952078);
    public static final acyz f = aczd.a(185722655);
    public static final acyz g = aczd.a(186900101);
    public static final acyz h = aczd.a(187006179);
    static final acyz i = acyy.b("clear_termination_reason_on_start");
    static final acyz j = acyy.b("set_timeout_for_connecting_state");
    static final acyz k = acyy.b("reset_network_callback_listener_when_callback_is_not_registered");
    public final String A;
    public acok B;
    public int C;
    int D;
    public final adgv E;
    public long F;
    public final adju G;
    public final int H;
    public final adif I;
    public final yjr J;
    public final List K;
    public final List L;
    public final adev M;
    final ScheduledExecutorService N;
    public final PowerManager O;
    public final adwq P;
    public final boolean Q;
    public final AtomicBoolean R;
    final adhd S;
    final adhd T;
    final adhd U;
    final adhd V;
    final adhd W;
    final adhd X;
    final adhd Y;
    final adhd Z;
    final adhd aa;
    final adhd ab;
    final adhd ac;
    final adhd ad;
    final adhd ae;
    final adhd af;
    final adhd ag;
    final adhd ah;
    public final adwp ai;
    final aquu aj;
    public final adaw ak;
    public final afxz al;
    private final adwt am;
    private final adwe an;
    private final acqj ao;
    private final adqa ap;
    private final adtg aq;
    private final AtomicReference ar;
    private final alpt as;
    private final alpt at;
    private final int au;
    private final agrk av;
    public final boolean l;
    public final advp m;
    public final String n;
    public final int o;
    public final aijx p;
    public final adfq q;
    public final aikc r;
    public final aiot s;
    aijw t;
    volatile adey u;
    aior v;
    String w;
    List x;
    final AtomicReference y;
    adfn z;

    public adhw(String str, int i2, aikc aikcVar, adfq adfqVar, aijx aijxVar, afxz afxzVar, adif adifVar, aquu aquuVar, adju adjuVar, int i3, String str2, adqa adqaVar, adev adevVar, adgv adgvVar, yjr yjrVar, advp advpVar, acqj acqjVar, adtg adtgVar, ScheduledExecutorService scheduledExecutorService, aiot aiotVar, adwe adweVar, adaw adawVar, PowerManager powerManager, adwq adwqVar, adwp adwpVar, adwt adwtVar, boolean z) {
        super("RegistrationStateMachine");
        int i4 = alog.d;
        this.x = alsx.a;
        this.y = new AtomicReference();
        this.z = null;
        this.B = acok.UNKNOWN;
        this.F = 0L;
        this.K = new CopyOnWriteArrayList();
        this.L = new CopyOnWriteArrayList();
        this.R = new AtomicBoolean();
        adhs adhsVar = new adhs(this);
        this.S = adhsVar;
        adhj adhjVar = new adhj(this);
        this.T = adhjVar;
        adhv adhvVar = new adhv(this);
        this.U = adhvVar;
        adhf adhfVar = new adhf(this);
        this.V = adhfVar;
        adhm adhmVar = new adhm(this);
        this.W = adhmVar;
        adhl adhlVar = new adhl(this);
        this.X = adhlVar;
        adhu adhuVar = new adhu(this);
        this.Y = adhuVar;
        adht adhtVar = new adht(this);
        this.Z = adhtVar;
        adho adhoVar = new adho(this);
        this.aa = adhoVar;
        adhn adhnVar = new adhn(this);
        this.ab = adhnVar;
        adhh adhhVar = new adhh(this);
        this.ac = adhhVar;
        adhg adhgVar = new adhg(this);
        this.ad = adhgVar;
        adhk adhkVar = new adhk(this);
        this.ae = adhkVar;
        adhr adhrVar = new adhr(this);
        this.af = adhrVar;
        adhq adhqVar = new adhq(this);
        this.ag = adhqVar;
        adhi adhiVar = new adhi(this);
        this.ah = adhiVar;
        alok alokVar = new alok();
        alokVar.h("StoppedState", adhsVar);
        alokVar.h("ReadyState", adhjVar);
        alokVar.h("WaitForNetworkState", adhvVar);
        alokVar.h("ConnectingState", adhfVar);
        alokVar.h("RegisteringState", adhmVar);
        alokVar.h("RegisteredState", adhlVar);
        alokVar.h("SubscribingState", adhuVar);
        alokVar.h("SubscribedState", adhtVar);
        alokVar.h("ReregisteringState", adhoVar);
        alokVar.h("ReregisteredState", adhnVar);
        alokVar.h("DeregisteringState", adhhVar);
        alokVar.h("DeregisteredState", adhgVar);
        alokVar.h("ReconfigurationRequiredState", adhkVar);
        alokVar.h("SimRemovedState", adhrVar);
        alokVar.h("RetryState", adhqVar);
        alokVar.h("DisabledState", adhiVar);
        alokVar.b();
        this.as = alpt.u(adhlVar, adhoVar, adhnVar, adhuVar, adhtVar);
        this.at = alpt.t(adhjVar, adhvVar, adhfVar, adhmVar);
        this.m = advpVar;
        this.n = str;
        this.o = i2;
        this.ao = acqjVar;
        this.p = aijxVar;
        this.q = adfqVar;
        this.al = afxzVar;
        this.aj = aquuVar;
        this.G = adjuVar;
        this.H = i3;
        this.A = str2;
        this.au = 1;
        this.ap = adqaVar;
        this.M = adevVar;
        this.I = adifVar;
        this.E = adgvVar;
        this.J = yjrVar;
        this.N = scheduledExecutorService;
        this.ar = new AtomicReference();
        this.r = aikcVar;
        this.aq = adtgVar;
        this.s = aiotVar;
        this.an = adweVar;
        this.Q = z;
        this.av = new agrk(advpVar, acqjVar);
        this.ak = adawVar;
        this.O = powerManager;
        this.P = adwqVar;
        this.ai = adwpVar;
        this.am = adwtVar;
        this.l = ((Boolean) adaa.p().a.y.a()).booleanValue();
    }

    public final void A() {
        aikb aikbVar = this.r.a;
        if (aikbVar != aike.f) {
            advr.d(this.m, "Resetting SipStack.", new Object[0]);
            aikbVar.a.clear();
            aikbVar.f().c();
            this.r.a();
        }
    }

    public final void B(acok acokVar) {
        advr.d(this.m, "deregister: reason=%s", acokVar);
        if (acok.DISABLED.equals(acokVar)) {
            this.E.c();
        }
        if (Q() && acok.FCM_TICKLE_KEEP_ALIVE.equals(acokVar)) {
            advr.d(this.m, "Registration is in progress. Ignore tickle messages.", new Object[0]);
        } else {
            s(8, acokVar);
        }
    }

    public final void C(String str, Throwable th) {
        aior aiorVar = this.v;
        if (!Objects.isNull(aiorVar) && !Objects.isNull(str) && !Objects.isNull(th)) {
            advr.d(this.m, "SIP transport error from %s - %s", str, th.getMessage());
            if (!str.equals(aiorVar.d())) {
                advr.d(this.m, "Ignore transport error from other network interfaces.", new Object[0]);
            } else {
                N(acok.NETWORK_ERROR);
                w(this.ad);
            }
        }
    }

    public final void D(acok acokVar) {
        advr.d(this.m, "Notify Failed. reason=%s", acokVar);
        this.N.execute(new adha(this, 6));
        this.N.execute(new adhc(this, acokVar, 0));
    }

    public final void E() {
        advr.d(this.m, "Notify ReconfigurationRequired.", new Object[0]);
        this.N.execute(new adha(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(Runnable runnable) {
        s(101, runnable);
    }

    public final void G(boolean z) {
        if (aczx.o()) {
            if (z) {
                this.R.set(true);
                q(16);
            } else {
                this.R.set(false);
                q(17);
            }
        }
    }

    public final void H(adez adezVar) {
        this.L.add(adezVar);
    }

    public final void I() {
        this.t = null;
    }

    public final void J(Runnable runnable, long j2, TimeUnit timeUnit) {
        z();
        this.ar.set(this.N.schedule(runnable, j2, timeUnit));
    }

    public final void K() {
        long j2;
        int i2 = this.D;
        if (i2 > 1200) {
            j2 = i2 - 600;
        } else {
            j2 = i2 >> 1;
        }
        p(14);
        if (j2 > 0) {
            advr.d(this.m, "Scheduling Refresh registration in %ds", Long.valueOf(j2));
            J(new adha(this, 4), j2, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L() {
        aijw aijwVar = this.t;
        if (!Objects.isNull(aijwVar)) {
            aikb aikbVar = this.r.a;
            if (!Objects.isNull(aikbVar)) {
                aijwVar.a();
                aion y = y(aikbVar, aijwVar, 0, this.G.o, false, false, null);
                advr.d(this.m, "sending SIP deregistration request: %s", y);
                R(aikbVar, y);
                return;
            }
            throw new adfj("Null SipStack. Can't send De-REGISTER.");
        }
        throw new aild("Null SipDialogPath. Can't send De-REGISTER.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M() {
        aikb aikbVar = this.r.a;
        if (!aikbVar.u()) {
            aijw aijwVar = this.t;
            if (aijwVar == null) {
                adju adjuVar = this.G;
                String valueOf = String.valueOf(adjuVar.n);
                String v = aikb.v();
                String str = adjuVar.l;
                if (!Objects.isNull(str)) {
                    if (aikbVar.d.isEmpty()) {
                        try {
                            aikbVar.w();
                            aikp i2 = ahji.i(aikbVar.h().f(), aikbVar.h().b(), aikbVar.m());
                            aikbVar.w();
                            aikbVar.d.add(new aimt(ahji.g(i2)));
                        } catch (ailb e2) {
                            advr.i(e2, "Can't create default Route header", new Object[0]);
                        }
                    }
                    aijwVar = new aijw(v, 1, "sip:".concat(valueOf), str, str, aikbVar.d);
                    this.t = aijwVar;
                } else {
                    throw new aild("Empty public identity in ImsConfiguration.");
                }
            } else {
                aijwVar.a();
            }
            aijw aijwVar2 = aijwVar;
            int i3 = this.C;
            if (i3 <= 0) {
                i3 = this.D;
            }
            int i4 = i3;
            if (Objects.isNull(this.w)) {
                this.w = this.G.l;
            }
            adju adjuVar2 = this.G;
            aion y = y(aikbVar, aijwVar2, i4, adjuVar2.o, adjuVar2.r, ((Boolean) adaa.p().a.p.a()).booleanValue(), (String) this.aq.a);
            advr.d(this.m, "sending SIP registration request: %s", y);
            R(aikbVar, y);
            return;
        }
        throw new adfj("Null SipStack. Can't send REGISTER.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(Object obj) {
        acok acokVar;
        if (obj instanceof acok) {
            acokVar = (acok) obj;
        } else {
            acokVar = acok.UNKNOWN;
        }
        this.B = acokVar;
    }

    public final void O() {
        adgw adgwVar = (adgw) this.y.getAndSet(null);
        if (adgwVar != null) {
            this.ai.h(adgwVar);
        }
        this.z = null;
    }

    public final boolean P() {
        acyh d2 = d();
        if (d2 == null) {
            return false;
        }
        return this.as.contains(d2);
    }

    public final boolean Q() {
        acyh d2 = d();
        if (d2 == null) {
            return false;
        }
        return this.at.contains(d2);
    }

    protected final void R(aikb aikbVar, aion aionVar) {
        try {
            aikh d2 = aikbVar.d(aionVar, new adpc(this, aionVar, 1));
            int i2 = this.G.g * 60;
            advr.d(this.m, "Set SIP request timeout to %dms", Integer.valueOf(i2));
            long j2 = i2;
            acyr acyrVar = this.b;
            if (acyrVar != null) {
                acyrVar.sendMessageDelayed(b(3, d2), j2);
            }
            advr.d(this.m, "Wait SIP response for %s, CallId=%s", aionVar.z(), aionVar.y().h());
            Optional.of(d2);
        } catch (aild e2) {
            s(2, e2);
            Optional.empty();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aikb x(ailh ailhVar, aior aiorVar, aijx aijxVar) {
        alob alobVar = new alob();
        if (this.l) {
            adfn adfnVar = this.z;
            adfnVar.getClass();
            alobVar.h(new adwc(adfnVar, this.am));
        } else {
            alobVar.h(new adwb(this.au, this.u));
        }
        alobVar.h(new adol());
        try {
            alobVar.h(new adwh(adwf.f(this.an.b.a()), 0));
        } catch (ailb e2) {
            advr.g("Can't add UserAgentHeaderMessageFilter. %s", e2.getMessage());
        }
        adju adjuVar = this.G;
        aiki F = this.av.F(aiorVar, new ailf(adjuVar.g, adjuVar.h, adjuVar.i));
        advp advpVar = this.m;
        aikd x = aike.x();
        x.d(advpVar);
        x.g(this.G.m);
        x.c(this.G.n);
        x.a = F;
        x.f(ailhVar);
        x.e(this.A);
        x.b(alobVar.g());
        aike a = x.a();
        if (aijxVar != null) {
            a.q(aijxVar);
        }
        a.b = this.I;
        a.t();
        return a;
    }

    final aion y(aikb aikbVar, aijw aijwVar, int i2, float f2, boolean z, boolean z2, String str) {
        int i3;
        advp advpVar = adwf.a;
        adwe adweVar = this.an;
        try {
            String str2 = aijwVar.f;
            String str3 = aijwVar.a;
            String str4 = aijwVar.g;
            String str5 = aijwVar.h;
            adwe.m(str3, str4, str5);
            aiks j2 = ahji.j(str2);
            ailu S = ahmc.S(str3);
            ailt R = ahmc.R(aijwVar.b, "REGISTER");
            aikn h2 = ahji.h(str4);
            aimg W = ahmc.W(h2, aijwVar.d);
            aimy Z = ahmc.Z(ahji.h(str5), null);
            ainb aa = ahmc.aa(aikbVar.k(), aikbVar.a(), aikbVar.m(), adwf.p());
            if (z) {
                try {
                    aa.f();
                } catch (Exception e2) {
                    e = e2;
                    i3 = 0;
                    advr.i(e, "Can't create SIP message", new Object[i3]);
                    throw new aild("Can't create SIP REGISTER message. ", e);
                }
            }
            if (z2) {
                aa.o();
            }
            aa.g();
            ArrayList arrayList = new ArrayList();
            arrayList.add(aa);
            aini f3 = ahji.f(j2, "REGISTER", S, R, W, Z, arrayList, adwf.g());
            ailx a = adwe.a(aikbVar, true, new String[0]);
            a.j(new aikz("expires", Integer.valueOf(i2)));
            if (f2 > brg.a && f2 <= 1.0f) {
                a.j(new aikz("q", Float.valueOf(f2)));
            }
            f3.k(a);
            f3.k(ahmc.X("Supported", "path,gruu"));
            f3.k(ahmc.X("P-Preferred-Identity", h2.c()));
            f3.k(adwf.f(adweVar.b.a()));
            f3.k(adwf.F());
            f3.k(ahmc.T(0));
            aion aionVar = new aion(f3);
            adta.i(aionVar.b(), this.ap.b(), this.Q);
            aquu aquuVar = this.aj;
            String str6 = aquuVar.a;
            Object obj = aquuVar.d;
            Object obj2 = aquuVar.e;
            if (agkx.ae(str6)) {
                advr.q("Empty username for security header.", new Object[0]);
            }
            if (agkx.ae((String) obj)) {
                advr.q("Empty password for security header.", new Object[0]);
            }
            String str7 = (String) obj2;
            if (agkx.ae(str7)) {
                advr.q("Empty realm for security header.", new Object[0]);
            }
            Object obj3 = aquuVar.c;
            if (((adtv) obj3).d == null) {
                aionVar.r("Authorization: Digest username=\"" + str6 + "\",uri=\"" + aionVar.A() + "\",algorithm=MD5,realm=\"" + str7 + "\",nonce=\"\",response=\"\"");
            } else {
                try {
                    ((adtv) obj3).c();
                    String b = ((adtv) aquuVar.c).b(str6, (String) obj, aionVar.z(), aionVar.A(), ((adtv) aquuVar.c).a(), aionVar.g());
                    String A = aionVar.A();
                    Object obj4 = aquuVar.c;
                    String str8 = "Authorization: Digest username=\"" + str6 + "\",uri=\"" + A + "\",algorithm=MD5,realm=\"" + albo.ag(((adtv) obj4).b) + "\",nonce=\"" + albo.ag(((adtv) obj4).c) + "\",response=\"" + b + "\"";
                    String str9 = ((adtv) aquuVar.c).e;
                    if (str9 != null && str9.startsWith("auth")) {
                        str8 = str8 + ",nc=" + ((adtv) aquuVar.c).a() + ",qop=" + str9 + ",cnonce=\"" + ((adtv) aquuVar.c).a + "\"";
                    }
                    aionVar.r(str8);
                } catch (Exception e3) {
                    advr.i(e3, "Can't create the authorization header", new Object[0]);
                    throw new adfj("Can't write the security header".concat(String.valueOf(e3.getMessage())), e3);
                }
            }
            try {
                int i4 = this.au;
                if (((Boolean) adaa.p().a.x.a()).booleanValue() && !TextUtils.isEmpty(str)) {
                    if (i4 != 0) {
                        aionVar.q(ahmc.X("X-Google-Self-Service-Message-ID", str.replace("\n", "").replace("\r", "")));
                    } else {
                        throw null;
                    }
                }
            } catch (ailb e4) {
                advr.j(e4, this.m, "Failed to add SelfServiceMessageId header.", new Object[0]);
            }
            return aionVar;
        } catch (Exception e5) {
            e = e5;
            i3 = 0;
        }
    }

    public final void z() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.ar.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
