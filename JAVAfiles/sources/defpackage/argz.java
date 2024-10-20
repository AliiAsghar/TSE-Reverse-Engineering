package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class argz extends aqvq implements aqte {
    public static final Logger b = Logger.getLogger(argz.class.getName());
    public static final arhe c = new argu();
    public Executor d;
    public final aqsx e;
    public final aqsx f;
    public final List g;
    public final aqvt[] h;
    public final long i;
    public Status j;
    public boolean k;
    public boolean m;
    public final aqsm o;
    public final aqsp p;
    public final aqtc q;
    public final aqzx r;
    public final arrj s;
    private final aqtf t;
    private final arep u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final arcj y;
    public final Object l = new Object();
    public final Set n = new HashSet();

    public argz(arhb arhbVar, arcj arcjVar, aqsm aqsmVar) {
        List unmodifiableList;
        arep arepVar = arhbVar.k;
        arepVar.getClass();
        this.u = arepVar;
        atoi atoiVar = arhbVar.u;
        HashMap hashMap = new HashMap();
        Iterator it = ((HashMap) atoiVar.a).values().iterator();
        while (it.hasNext()) {
            for (asmb asmbVar : ((asmb) it.next()).p()) {
                hashMap.put(((aqux) asmbVar.a).b, asmbVar);
            }
        }
        DesugarCollections.unmodifiableList(new ArrayList(((HashMap) atoiVar.a).values()));
        this.e = new arci(DesugarCollections.unmodifiableMap(hashMap));
        aqsx aqsxVar = arhbVar.j;
        aqsxVar.getClass();
        this.f = aqsxVar;
        this.y = arcjVar;
        synchronized (this.l) {
            unmodifiableList = DesugarCollections.unmodifiableList(alog.r(((aqxe) arcjVar).b));
        }
        this.t = aqtf.b("Server", String.valueOf(unmodifiableList));
        aqsmVar.getClass();
        this.o = new aqsm(aqsmVar.f, aqsmVar.g + 1);
        this.p = arhbVar.l;
        this.g = DesugarCollections.unmodifiableList(new ArrayList(arhbVar.g));
        List list = arhbVar.h;
        this.h = (aqvt[]) list.toArray(new aqvt[list.size()]);
        this.i = arhbVar.n;
        aqtc aqtcVar = arhbVar.s;
        this.q = aqtcVar;
        this.r = new aqzx(arhs.a);
        arrj arrjVar = arhbVar.v;
        arrjVar.getClass();
        this.s = arrjVar;
        aqtc.b(aqtcVar.c, this);
    }

    @Override // defpackage.aqvq
    public final /* bridge */ /* synthetic */ void a() {
        synchronized (this.l) {
            if (!this.w) {
                this.w = true;
                boolean z = this.v;
                if (!z) {
                    this.m = true;
                    b();
                }
                if (z) {
                    this.y.c();
                }
            }
        }
        Status withDescription = Status.n.withDescription("Server shutdownNow invoked");
        synchronized (this.l) {
            if (this.j != null) {
                return;
            }
            this.j = withDescription;
            ArrayList arrayList = new ArrayList(this.n);
            boolean z2 = this.k;
            if (z2) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((aqxg) arrayList.get(i)).k(withDescription);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.l) {
            if (this.w && this.n.isEmpty() && this.m) {
                if (!this.x) {
                    this.x = true;
                    aqtc aqtcVar = this.q;
                    aqtc.c(aqtcVar.c, this);
                    Executor executor = this.d;
                    if (executor != null) {
                        this.u.b(executor);
                        this.d = null;
                    }
                    this.l.notifyAll();
                } else {
                    throw new AssertionError("Server already terminated");
                }
            }
        }
    }

    @Override // defpackage.aqtk
    public final aqtf c() {
        return this.t;
    }

    public final void d() {
        synchronized (this.l) {
            albo.U(!this.v, "Already started");
            albo.U(!this.w, "Shutting down");
            this.y.d(new argv(this));
            Executor executor = (Executor) this.u.a();
            executor.getClass();
            this.d = executor;
            this.v = true;
        }
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.g("logId", this.t.a);
        aj.b("transportServer", this.y);
        return aj.toString();
    }
}
