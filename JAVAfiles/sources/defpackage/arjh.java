package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arjh implements arau, ariq, arjr {
    private static final Map G;
    public static final Logger a;
    public final Runnable A;
    public final int B;
    public final arhu C;
    final aqsy D;
    int E;
    public adfg F;
    private final aqtf H;
    private int I;
    private final argl J;
    private final ScheduledExecutorService K;
    private final int L;
    private boolean M;
    private boolean N;
    private final arcg O;
    public final InetSocketAddress b;
    public final String c;
    public final String d;
    public final Random e = new Random();
    public final int f;
    public aree g;
    public arir h;
    public final Object i;
    public final Map j;
    public final Executor k;
    public int l;
    public arjg m;
    public aqrm n;
    public Status o;
    public arcf p;
    public boolean q;
    public final SocketFactory r;
    public SSLSocketFactory s;
    public int t;
    public final Deque u;
    public final arjw v;
    public arcu w;
    public boolean x;
    public long y;
    public long z;

    static {
        EnumMap enumMap = new EnumMap(arkh.class);
        enumMap.put((EnumMap) arkh.NO_ERROR, (arkh) Status.m.withDescription("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) arkh.PROTOCOL_ERROR, (arkh) Status.m.withDescription("Protocol error"));
        enumMap.put((EnumMap) arkh.INTERNAL_ERROR, (arkh) Status.m.withDescription("Internal error"));
        enumMap.put((EnumMap) arkh.FLOW_CONTROL_ERROR, (arkh) Status.m.withDescription("Flow control error"));
        enumMap.put((EnumMap) arkh.STREAM_CLOSED, (arkh) Status.m.withDescription("Stream closed"));
        enumMap.put((EnumMap) arkh.FRAME_TOO_LARGE, (arkh) Status.m.withDescription("Frame too large"));
        enumMap.put((EnumMap) arkh.REFUSED_STREAM, (arkh) Status.n.withDescription("Refused stream"));
        enumMap.put((EnumMap) arkh.CANCEL, (arkh) Status.c.withDescription("Cancelled"));
        enumMap.put((EnumMap) arkh.COMPRESSION_ERROR, (arkh) Status.m.withDescription("Compression error"));
        enumMap.put((EnumMap) arkh.CONNECT_ERROR, (arkh) Status.m.withDescription("Connect error"));
        enumMap.put((EnumMap) arkh.ENHANCE_YOUR_CALM, (arkh) Status.j.withDescription("Enhance your calm"));
        enumMap.put((EnumMap) arkh.INADEQUATE_SECURITY, (arkh) Status.h.withDescription("Inadequate security"));
        G = DesugarCollections.unmodifiableMap(enumMap);
        a = Logger.getLogger(arjh.class.getName());
    }

    public arjh(arix arixVar, InetSocketAddress inetSocketAddress, String str, String str2, aqrm aqrmVar, alhr alhrVar, aqsy aqsyVar, Runnable runnable) {
        Object obj = new Object();
        this.i = obj;
        this.j = new HashMap();
        this.t = 0;
        this.u = new LinkedList();
        this.O = new arjd(this);
        this.E = 30000;
        inetSocketAddress.getClass();
        this.b = inetSocketAddress;
        this.c = str;
        this.L = arixVar.e;
        this.f = arixVar.f;
        Executor executor = arixVar.a;
        executor.getClass();
        this.k = executor;
        this.J = new argl(arixVar.a);
        ScheduledExecutorService scheduledExecutorService = arixVar.b;
        scheduledExecutorService.getClass();
        this.K = scheduledExecutorService;
        this.I = 3;
        this.r = SocketFactory.getDefault();
        this.s = arixVar.c;
        arjw arjwVar = arixVar.d;
        arjwVar.getClass();
        this.v = arjwVar;
        alhrVar.getClass();
        this.d = arcb.e("okhttp", str2);
        this.D = aqsyVar;
        this.A = runnable;
        this.B = arixVar.g;
        this.C = arixVar.h.b();
        this.H = aqtf.a(getClass(), inetSocketAddress.toString());
        aqrm aqrmVar2 = aqrm.a;
        aqrk aqrkVar = new aqrk(aqrm.a);
        aqrkVar.b(arbx.b, aqrmVar);
        this.n = aqrkVar.a();
        synchronized (obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Status e(arkh arkhVar) {
        Status status = (Status) G.get(arkhVar);
        if (status != null) {
            return status;
        }
        return Status.d.withDescription("Unknown http2 error code: " + arkhVar.s);
    }

    public static String f(asrq asrqVar) {
        asqu asquVar = new asqu();
        while (asrqVar.b(asquVar, 1L) != -1) {
            if (asquVar.c(asquVar.b - 1) == 10) {
                long i = asquVar.i((byte) 10, 0L, Long.MAX_VALUE);
                if (i != -1) {
                    return asrt.b(asquVar, i);
                }
                asqu asquVar2 = new asqu();
                asquVar.G(asquVar2, 0L, Math.min(32L, asquVar.b));
                throw new EOFException("\\n not found: limit=" + Math.min(asquVar.b, Long.MAX_VALUE) + " content=" + asquVar2.s().d() + "…");
            }
        }
        throw new EOFException("\\n not found: ".concat(asquVar.s().d()));
    }

    private final void t() {
        if (this.o != null && this.j.isEmpty() && this.u.isEmpty() && !this.q) {
            this.q = true;
            arcu arcuVar = this.w;
            if (arcuVar != null) {
                arcuVar.e();
            }
            arcf arcfVar = this.p;
            if (arcfVar != null) {
                Throwable g = g();
                synchronized (arcfVar) {
                    if (!arcfVar.d) {
                        arcfVar.d = true;
                        arcfVar.e = g;
                        Map map = arcfVar.c;
                        arcfVar.c = null;
                        for (Map.Entry entry : map.entrySet()) {
                            arcf.b((asqc) entry.getKey(), (Executor) entry.getValue());
                        }
                    }
                }
                this.p = null;
            }
            if (!this.M) {
                this.M = true;
                this.h.g(arkh.NO_ERROR, new byte[0]);
            }
            this.h.close();
        }
    }

    @Override // defpackage.ariq
    public final void a(Throwable th) {
        l(0, arkh.INTERNAL_ERROR, Status.n.d(th));
    }

    @Override // defpackage.aram
    public final /* bridge */ /* synthetic */ araj b(aqux aquxVar, aqut aqutVar, aqrr aqrrVar, aqrx[] aqrxVarArr) {
        arhn g = arhn.g(aqrxVarArr, this.n);
        synchronized (this.i) {
            try {
                try {
                    return new arjc(aquxVar, aqutVar, this.h, this, this.F, this.i, this.L, this.f, this.c, this.d, g, this.C, aqrrVar);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // defpackage.aqtk
    public final aqtf c() {
        return this.H;
    }

    @Override // defpackage.aref
    public final Runnable d(aree areeVar) {
        this.g = areeVar;
        if (this.x) {
            arcu arcuVar = new arcu(new atoi(this), this.K, this.y, this.z);
            this.w = arcuVar;
            arcuVar.d();
        }
        arip aripVar = new arip(this.J, this);
        aris arisVar = new aris(aripVar, new arkq(new asri(aripVar)));
        synchronized (this.i) {
            this.h = new arir(this, arisVar);
            this.F = new adfg(this, this.h);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.J.execute(new arjf(this, countDownLatch, cyclicBarrier, aripVar, countDownLatch2));
        this.k.execute(new ardm(cyclicBarrier, countDownLatch2, 8));
        try {
            synchronized (this.i) {
                arir arirVar = this.h;
                try {
                    ((aris) arirVar.b).a.a();
                } catch (IOException e) {
                    arirVar.a.a(e);
                }
                asnn asnnVar = new asnn();
                asnnVar.f(7, this.f);
                arir arirVar2 = this.h;
                arirVar2.c.h(2, asnnVar);
                try {
                    ((aris) arirVar2.b).a.j(asnnVar);
                } catch (IOException e2) {
                    arirVar2.a.a(e2);
                }
            }
            countDownLatch.countDown();
            this.J.execute(new arer(this, 15));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    public final Throwable g() {
        synchronized (this.i) {
            Status status = this.o;
            if (status != null) {
                return status.asException();
            }
            return Status.n.withDescription("Connection closed").asException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i, Status status, arak arakVar, boolean z, arkh arkhVar, aqut aqutVar) {
        synchronized (this.i) {
            arjc arjcVar = (arjc) this.j.remove(Integer.valueOf(i));
            if (arjcVar != null) {
                if (arkhVar != null) {
                    this.h.e(i, arkh.CANCEL);
                }
                if (status != null) {
                    arjb arjbVar = arjcVar.f;
                    if (aqutVar == null) {
                        aqutVar = new aqut();
                    }
                    arjbVar.m(status, arakVar, z, aqutVar);
                }
                if (!q()) {
                    t();
                }
                i(arjcVar);
            }
        }
    }

    public final void i(arjc arjcVar) {
        if (this.N && this.u.isEmpty() && this.j.isEmpty()) {
            this.N = false;
            arcu arcuVar = this.w;
            if (arcuVar != null) {
                arcuVar.c();
            }
        }
        if (arjcVar.s) {
            this.O.c(arjcVar, false);
        }
    }

    public final void j(arkh arkhVar, String str) {
        l(0, arkhVar, e(arkhVar).b(str));
    }

    public final void k(arjc arjcVar) {
        if (!this.N) {
            this.N = true;
            arcu arcuVar = this.w;
            if (arcuVar != null) {
                arcuVar.b();
            }
        }
        if (arjcVar.s) {
            this.O.c(arjcVar, true);
        }
    }

    public final void l(int i, arkh arkhVar, Status status) {
        synchronized (this.i) {
            if (this.o == null) {
                this.o = status;
                this.g.c(status);
            }
            if (arkhVar != null && !this.M) {
                this.M = true;
                this.h.g(arkhVar, new byte[0]);
            }
            Iterator it = this.j.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((arjc) entry.getValue()).f.m(status, arak.REFUSED, false, new aqut());
                    i((arjc) entry.getValue());
                }
            }
            for (arjc arjcVar : this.u) {
                arjcVar.f.m(status, arak.MISCARRIED, true, new aqut());
                i(arjcVar);
            }
            this.u.clear();
            t();
        }
    }

    public final void m(arjc arjcVar) {
        boolean z;
        boolean z2 = true;
        if (arjcVar.f.w == -1) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "StreamId already assigned");
        this.j.put(Integer.valueOf(this.I), arjcVar);
        k(arjcVar);
        arjb arjbVar = arjcVar.f;
        int i = this.I;
        if (arjbVar.w != -1) {
            z2 = false;
        }
        albo.V(z2, "the stream has been started with id %s", i);
        arjbVar.w = i;
        adfg adfgVar = arjbVar.y;
        arjbVar.v = new arjq(adfgVar, i, adfgVar.a, arjbVar);
        arjbVar.x.f.d();
        if (arjbVar.i) {
            arir arirVar = arjbVar.g;
            arjc arjcVar2 = arjbVar.x;
            try {
                ((aris) arirVar.b).a.h(false, arjbVar.w, arjbVar.b);
            } catch (IOException e) {
                arirVar.a.a(e);
            }
            arjbVar.x.d.a();
            arjbVar.b = null;
            asqu asquVar = arjbVar.c;
            if (asquVar.b > 0) {
                arjbVar.y.e(arjbVar.d, arjbVar.v, asquVar, arjbVar.e);
            }
            arjbVar.i = false;
        }
        if (arjcVar.r() != aquw.UNARY && arjcVar.r() != aquw.SERVER_STREAMING) {
            this.h.c();
        } else {
            boolean z3 = arjcVar.g;
        }
        int i2 = this.I;
        if (i2 >= 2147483645) {
            this.I = Integer.MAX_VALUE;
            l(Integer.MAX_VALUE, arkh.NO_ERROR, Status.n.withDescription("Stream ids exhausted"));
        } else {
            this.I = i2 + 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(int i) {
        boolean z;
        synchronized (this.i) {
            z = false;
            if (i < this.I && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aref
    public final void o(Status status) {
        synchronized (this.i) {
            if (this.o != null) {
                return;
            }
            this.o = status;
            this.g.c(status);
            t();
        }
    }

    @Override // defpackage.aref
    public final void p(Status status) {
        o(status);
        synchronized (this.i) {
            Iterator it = this.j.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((arjc) entry.getValue()).f.l(status, false, new aqut());
                i((arjc) entry.getValue());
            }
            for (arjc arjcVar : this.u) {
                arjcVar.f.m(status, arak.MISCARRIED, true, new aqut());
                i(arjcVar);
            }
            this.u.clear();
            t();
        }
    }

    public final boolean q() {
        boolean z = false;
        while (!this.u.isEmpty() && this.j.size() < this.t) {
            m((arjc) this.u.poll());
            z = true;
        }
        return z;
    }

    @Override // defpackage.arau
    public final aqrm r() {
        return this.n;
    }

    @Override // defpackage.arjr
    public final arjq[] s() {
        arjq[] arjqVarArr;
        synchronized (this.i) {
            arjqVarArr = new arjq[this.j.size()];
            Iterator it = this.j.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                arjqVarArr[i] = ((arjc) it.next()).f.f();
                i++;
            }
        }
        return arjqVarArr;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.g("logId", this.H.a);
        aj.b("address", this.b);
        return aj.toString();
    }
}
