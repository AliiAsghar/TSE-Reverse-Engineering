package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import io.grpc.Status;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ardr extends aquc implements aqte {
    static final Logger a = Logger.getLogger(ardr.class.getName());
    static final Status b;
    static final Status c;
    public static final ared d;
    public static final aqtd e;
    public static final aqts f;
    public static final aqru g;
    public final ardq A;
    public final AtomicBoolean B;
    public boolean C;
    public volatile boolean D;
    public final aqzw E;
    public final aqzx F;
    public final aqzz G;
    public final aqrt H;
    public final aqtc I;
    public final ardo J;
    public ared K;
    public final ared L;
    public boolean M;
    public final boolean N;
    public final long O;
    public final long P;
    public final boolean Q;
    final arcg R;
    public final ardc S;
    public int T;
    public final atoi U;
    private final String V;
    private final URI W;
    private final aqve X;
    private final aquy Y;
    private final arep Z;
    private final ardg aa;
    private final ardg ab;
    private final long ac;
    private final aqrs ad;
    private volatile aqtx ae;
    private final Set af;
    private final CountDownLatch ag;
    private final aree ah;
    private final arfn ai;
    private final asmb aj;
    public final aqtf h;
    public final arao i;
    public final ardp j;
    public final Executor k;
    public final arhs l;
    final aqwe m;
    public final aqsp n;
    public final aqsb o;
    public final arav p;
    public final List q;
    public final String r;
    public aqvd s;
    public boolean t;
    public ardi u;
    public boolean v;
    public final Set w;
    public Collection x;
    public final Object y;
    public final arbf z;

    static {
        Status.n.withDescription("Channel shutdownNow invoked");
        b = Status.n.withDescription("Channel shutdown invoked");
        c = Status.n.withDescription("Subchannel shutdown invoked");
        d = new ared(null, new HashMap(), new HashMap(), null, null, null);
        e = new arcx();
        f = new areq();
        g = new ardb();
    }

    public ardr(ardy ardyVar, arao araoVar, URI uri, aqve aqveVar, arep arepVar, alhr alhrVar, List list, arhs arhsVar) {
        boolean z;
        aqwe aqweVar = new aqwe(new arda(this));
        this.m = aqweVar;
        this.p = new arav();
        this.w = new HashSet(16, 0.75f);
        this.y = new Object();
        this.af = new HashSet(1, 0.75f);
        this.A = new ardq(this);
        this.B = new AtomicBoolean(false);
        this.ag = new CountDownLatch(1);
        this.T = 1;
        this.K = d;
        this.M = false;
        this.U = new atoi((char[]) null, (byte[]) null);
        arrj arrjVar = aqsn.c;
        ardf ardfVar = new ardf(this);
        this.ah = ardfVar;
        this.R = new ardh(this);
        this.S = new ardc(this);
        String str = ardyVar.h;
        str.getClass();
        this.V = str;
        aqtf b2 = aqtf.b("Channel", str);
        this.h = b2;
        this.l = arhsVar;
        arep arepVar2 = ardyVar.d;
        arepVar2.getClass();
        this.Z = arepVar2;
        Executor executor = (Executor) arepVar2.a();
        executor.getClass();
        this.k = executor;
        arep arepVar3 = ardyVar.e;
        arepVar3.getClass();
        ardg ardgVar = new ardg(arepVar3);
        this.ab = ardgVar;
        aqzv aqzvVar = new aqzv(araoVar, ardgVar);
        this.i = aqzvVar;
        new aqzv(araoVar, ardgVar);
        ardp ardpVar = new ardp(aqzvVar.c());
        this.j = ardpVar;
        aqzz aqzzVar = new aqzz(b2, arhsVar.a(), "Channel for '" + str + "'");
        this.G = aqzzVar;
        aqzy aqzyVar = new aqzy(aqzzVar, arhsVar);
        this.H = aqzyVar;
        aqvo aqvoVar = arcb.l;
        this.Q = true;
        asmb asmbVar = new asmb(aqub.b());
        this.aj = asmbVar;
        this.W = uri;
        this.X = aqveVar;
        aqvc aqvcVar = new aqvc(true, asmbVar);
        Integer valueOf = Integer.valueOf(ardyVar.p.a());
        aqvoVar.getClass();
        aquy aquyVar = new aquy(valueOf, aqvoVar, aqweVar, aqvcVar, ardpVar, aqzyVar, ardgVar);
        this.Y = aquyVar;
        this.s = o(uri, aqveVar, aquyVar);
        this.aa = new ardg(arepVar);
        arbf arbfVar = new arbf(executor, aqweVar);
        this.z = arbfVar;
        arbfVar.f = ardfVar;
        arbfVar.c = new aomp(ardfVar, 16, null);
        arbfVar.d = new aomp(ardfVar, 17, null);
        arbfVar.e = new aomp(ardfVar, 18, null);
        this.L = null;
        this.N = true;
        ardo ardoVar = new ardo(this, this.s.a());
        this.J = ardoVar;
        this.ad = apsd.q(ardoVar, list);
        this.q = new ArrayList(ardyVar.g);
        alhrVar.getClass();
        long j = ardyVar.m;
        if (j == -1) {
            this.ac = -1L;
        } else {
            if (j >= ardy.b) {
                z = true;
            } else {
                z = false;
            }
            albo.M(z, "invalid idleTimeoutMillis %s", j);
            this.ac = ardyVar.m;
        }
        this.ai = new arfn(new arbg(this, 16), aqweVar, aqzvVar.c(), new alhp());
        aqsp aqspVar = ardyVar.k;
        aqspVar.getClass();
        this.n = aqspVar;
        aqsb aqsbVar = ardyVar.l;
        aqsbVar.getClass();
        this.o = aqsbVar;
        this.r = ardyVar.i;
        this.P = 16777216L;
        this.O = 1048576L;
        arcy arcyVar = new arcy(arhsVar);
        this.E = arcyVar;
        this.F = arcyVar.a();
        aqtc aqtcVar = ardyVar.o;
        aqtcVar.getClass();
        this.I = aqtcVar;
        aqtc.b(aqtcVar.d, this);
        arrj.B();
    }

    static aqvd o(URI uri, aqve aqveVar, aquy aquyVar) {
        aqvd a2 = aqveVar.a(uri, aquyVar);
        if (a2 != null) {
            aqzt aqztVar = new aqzt(aquyVar.e, aquyVar.c);
            aqwe aqweVar = aquyVar.c;
            return new argg(a2, aqztVar);
        }
        throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.aqrs
    public final aqru a(aqux aquxVar, aqrr aqrrVar) {
        return this.ad.a(aquxVar, aqrrVar);
    }

    @Override // defpackage.aqrs
    public final String b() {
        return this.ad.b();
    }

    @Override // defpackage.aqtk
    public final aqtf c() {
        return this.h;
    }

    @Override // defpackage.aquc
    public final /* bridge */ /* synthetic */ aquc d() {
        p();
        return this;
    }

    @Override // defpackage.aquc
    public final void e() {
        this.m.execute(new arbg(this, 14));
    }

    @Override // defpackage.aquc
    public final aqsd f() {
        aqsd aqsdVar = this.p.a;
        if (aqsdVar != null) {
            return aqsdVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    public final Executor g(aqrr aqrrVar) {
        Executor executor = aqrrVar.c;
        if (executor == null) {
            return this.k;
        }
        return executor;
    }

    public final void h(boolean z) {
        ScheduledFuture scheduledFuture;
        arfn arfnVar = this.ai;
        arfnVar.e = false;
        if (z && (scheduledFuture = arfnVar.f) != null) {
            scheduledFuture.cancel(false);
            arfnVar.f = null;
        }
    }

    public final void i() {
        m(true);
        this.z.a(null);
        this.H.a(2, "Entering IDLE state");
        this.p.a(aqsd.IDLE);
        Object[] objArr = {this.y, this.z};
        for (int i = 0; i < 2; i++) {
            if (this.R.a.contains(objArr[i])) {
                j();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.m.c();
        if (!this.B.get() && !this.v) {
            if (!this.R.a.isEmpty()) {
                h(false);
            } else {
                l();
            }
            if (this.u == null) {
                this.H.a(2, "Exiting idle mode");
                ardi ardiVar = new ardi(this);
                ardiVar.a = new aqzo(this.aj, ardiVar);
                this.u = ardiVar;
                this.p.a(aqsd.CONNECTING);
                this.s.d(new ardj(this, ardiVar, this.s));
                this.t = true;
            }
        }
    }

    public final void k() {
        if (!this.D && this.B.get() && this.w.isEmpty() && this.af.isEmpty()) {
            this.H.a(2, "Terminated");
            aqtc.c(this.I.d, this);
            this.Z.b(this.k);
            this.aa.b();
            this.ab.b();
            this.i.close();
            this.D = true;
            this.ag.countDown();
        }
    }

    public final void l() {
        long j = this.ac;
        if (j == -1) {
            return;
        }
        arfn arfnVar = this.ai;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a2 = arfnVar.a() + nanos;
        arfnVar.e = true;
        if (a2 - arfnVar.d < 0 || arfnVar.f == null) {
            ScheduledFuture scheduledFuture = arfnVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            arfnVar.f = arfnVar.a.schedule(new arer(arfnVar, 6), nanos, TimeUnit.NANOSECONDS);
        }
        arfnVar.d = a2;
    }

    public final void m(boolean z) {
        boolean z2;
        this.m.c();
        if (z) {
            albo.U(this.t, "nameResolver is not started");
            if (this.u != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            albo.U(z2, "lbHelper is null");
        }
        aqvd aqvdVar = this.s;
        if (aqvdVar != null) {
            aqvdVar.c();
            this.t = false;
            if (z) {
                this.s = o(this.W, this.X, this.Y);
            } else {
                this.s = null;
            }
        }
        ardi ardiVar = this.u;
        if (ardiVar != null) {
            aqzo aqzoVar = ardiVar.a;
            aqzoVar.b.e();
            aqzoVar.b = null;
            this.u = null;
        }
        this.ae = null;
    }

    public final void n(aqtx aqtxVar) {
        this.ae = aqtxVar;
        this.z.a(aqtxVar);
    }

    public final void p() {
        this.H.a(1, "shutdown() called");
        if (!this.B.compareAndSet(false, true)) {
            return;
        }
        this.m.execute(new arbg(this, 15));
        ardo ardoVar = this.J;
        ardoVar.c.m.execute(new arbg(ardoVar, 18));
        this.m.execute(new arbg(this, 13));
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.g("logId", this.h.a);
        aj.b(GroupManagementRequest.TARGET_ATTRIBUTE, this.V);
        return aj.toString();
    }
}
