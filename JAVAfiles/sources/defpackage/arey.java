package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arey extends aqtz {
    public static final Logger f = Logger.getLogger(arey.class.getName());
    public final aqtr g;
    public final Map h = new HashMap();
    public final aret i;
    public int j;
    public boolean k;
    public aqsd l;
    public aqsd m;
    public boolean n;
    public arbp o;
    public asmb p;
    public asmb q;
    private final boolean r;
    private final boolean s;

    public arey(aqtr aqtrVar) {
        int i = alog.d;
        this.i = new aret(alsx.a);
        boolean z = false;
        this.j = 0;
        this.k = true;
        this.p = null;
        aqsd aqsdVar = aqsd.IDLE;
        this.l = aqsdVar;
        this.m = aqsdVar;
        if (!j()) {
            int i2 = arfe.a;
            if (arcb.j("GRPC_PF_USE_HAPPY_EYEBALLS")) {
                z = true;
            }
        }
        this.r = z;
        this.n = true;
        this.q = null;
        this.s = j();
        this.g = aqtrVar;
    }

    static boolean j() {
        return arcb.j("GRPC_SERIALIZE_RETRIES");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r3.size() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.SocketAddress k(defpackage.aqtw r3) {
        /*
            aqzj r3 = (defpackage.aqzj) r3
            ardr r0 = r3.i
            aqwe r0 = r0.m
            r0.c()
            boolean r0 = r3.g
            java.lang.String r1 = "not started"
            defpackage.albo.U(r0, r1)
            java.util.List r3 = r3.e
            r0 = 0
            if (r3 == 0) goto L1d
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r0
        L1e:
            java.lang.String r1 = "%s does not have exactly one group"
            defpackage.albo.X(r2, r1, r3)
            java.lang.Object r3 = r3.get(r0)
            aqsq r3 = (defpackage.aqsq) r3
            java.util.List r3 = r3.b
            java.lang.Object r3 = r3.get(r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arey.k(aqtw):java.net.SocketAddress");
    }

    private final void l() {
        if (this.r) {
            asmb asmbVar = this.p;
            if (asmbVar == null || !asmbVar.n()) {
                aqtr aqtrVar = this.g;
                this.p = aqtrVar.c().d(new arer(this, 2), 250L, TimeUnit.MILLISECONDS, aqtrVar.d());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aqtz
    public final Status a(aqtv aqtvVar) {
        boolean z;
        areu areuVar;
        Boolean bool;
        if (this.l != aqsd.SHUTDOWN) {
            Boolean bool2 = (Boolean) aqtvVar.b.a(e);
            if (bool2 != null && bool2.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            this.n = z;
            List<aqsq> list = aqtvVar.a;
            if (list.isEmpty()) {
                List list2 = aqtvVar.a;
                Status withDescription = Status.n.withDescription("NameResolver returned no usable address. addrs=" + String.valueOf(list2) + ", attrs=" + aqtvVar.b.toString());
                b(withDescription);
                return withDescription;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((aqsq) it.next()) == null) {
                    List list3 = aqtvVar.a;
                    Status withDescription2 = Status.n.withDescription("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(list3) + ", attrs=" + aqtvVar.b.toString());
                    b(withDescription2);
                    return withDescription2;
                }
            }
            this.k = true;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (aqsq aqsqVar : list) {
                ArrayList arrayList2 = new ArrayList();
                for (SocketAddress socketAddress : aqsqVar.b) {
                    if (hashSet.add(socketAddress)) {
                        arrayList2.add(socketAddress);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new aqsq(arrayList2, aqsqVar.c));
                }
            }
            Object obj = aqtvVar.c;
            if ((obj instanceof areu) && (bool = (areuVar = (areu) obj).a) != null && bool.booleanValue()) {
                Long l = areuVar.b;
                Collections.shuffle(arrayList, new Random());
            }
            alob alobVar = new alob();
            alobVar.j(arrayList);
            alog g = alobVar.g();
            if (this.l == aqsd.READY) {
                aret aretVar = this.i;
                SocketAddress b = aretVar.b();
                aretVar.d(g);
                if (this.i.g(b)) {
                    aqtw aqtwVar = ((arex) this.h.get(b)).a;
                    aret aretVar2 = this.i;
                    aqtwVar.d(Collections.singletonList(new aqsq(aretVar2.b(), aretVar2.a())));
                    return Status.b;
                }
            } else {
                this.i.d(g);
            }
            HashSet<SocketAddress> hashSet2 = new HashSet(this.h.keySet());
            HashSet hashSet3 = new HashSet();
            int i = ((alsx) g).c;
            for (int i2 = 0; i2 < i; i2++) {
                hashSet3.addAll(((aqsq) g.get(i2)).b);
            }
            for (SocketAddress socketAddress2 : hashSet2) {
                if (!hashSet3.contains(socketAddress2)) {
                    ((arex) this.h.remove(socketAddress2)).a.b();
                }
            }
            if (hashSet2.size() == 0) {
                aqsd aqsdVar = aqsd.CONNECTING;
                this.l = aqsdVar;
                h(aqsdVar, new arev(aqtt.a));
            }
            aqsd aqsdVar2 = this.l;
            if (aqsdVar2 == aqsd.READY) {
                aqsd aqsdVar3 = aqsd.IDLE;
                this.l = aqsdVar3;
                h(aqsdVar3, new arew(this, this));
            } else if (aqsdVar2 == aqsd.CONNECTING || aqsdVar2 == aqsd.TRANSIENT_FAILURE) {
                f();
                d();
            }
            return Status.b;
        }
        return Status.k.withDescription("Already shut down");
    }

    @Override // defpackage.aqtz
    public final void b(Status status) {
        if (this.l == aqsd.SHUTDOWN) {
            return;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((arex) it.next()).a.b();
        }
        this.h.clear();
        aret aretVar = this.i;
        int i = alog.d;
        aretVar.d(alsx.a);
        aqsd aqsdVar = aqsd.TRANSIENT_FAILURE;
        this.l = aqsdVar;
        h(aqsdVar, new arev(aqtt.a(status)));
    }

    @Override // defpackage.aqtz
    public final void d() {
        if (this.i.f() && this.l != aqsd.SHUTDOWN) {
            aret aretVar = this.i;
            Map map = this.h;
            SocketAddress b = aretVar.b();
            arex arexVar = (arex) map.get(b);
            if (arexVar == null) {
                aqrm a = this.i.a();
                ares aresVar = new ares(this);
                aqtr aqtrVar = this.g;
                aqtm aqtmVar = new aqtm();
                int i = 1;
                aqtmVar.c(alzz.ap(new aqsq(b, a)));
                aqtmVar.b(b, aresVar);
                aqtmVar.b(aqtz.c, Boolean.valueOf(this.s));
                aqtw b2 = aqtrVar.b(aqtmVar.a());
                arex arexVar2 = new arex(b2, aqsd.IDLE);
                aresVar.a = arexVar2;
                this.h.put(b, arexVar2);
                aqto aqtoVar = ((aqzj) b2).a;
                if (this.n || aqtoVar.b.a(aqtz.d) == null) {
                    arexVar2.d = aqse.a(aqsd.READY);
                }
                b2.c(new arez(this, arexVar2, i));
                arexVar = arexVar2;
            }
            int ordinal = arexVar.b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        arexVar.a.a();
                        arexVar.b(aqsd.CONNECTING);
                        l();
                        return;
                    }
                    return;
                }
                if (!this.s) {
                    this.i.e();
                    d();
                    return;
                } else if (!this.i.f()) {
                    g();
                    return;
                } else {
                    arexVar.a.a();
                    arexVar.b(aqsd.CONNECTING);
                    return;
                }
            }
            l();
        }
    }

    @Override // defpackage.aqtz
    public final void e() {
        f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(this.h.size()));
        aqsd aqsdVar = aqsd.SHUTDOWN;
        this.l = aqsdVar;
        this.m = aqsdVar;
        f();
        asmb asmbVar = this.q;
        if (asmbVar != null) {
            asmbVar.m();
            this.q = null;
        }
        this.o = null;
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((arex) it.next()).a.b();
        }
        this.h.clear();
    }

    public final void f() {
        asmb asmbVar = this.p;
        if (asmbVar != null) {
            asmbVar.m();
            this.p = null;
        }
    }

    public final void g() {
        if (this.s && this.q == null) {
            if (this.o == null) {
                this.o = new arbp();
            }
            long a = this.o.a();
            aqtr aqtrVar = this.g;
            this.q = aqtrVar.c().d(new arer(this, 0), a, TimeUnit.NANOSECONDS, aqtrVar.d());
        }
    }

    public final void h(aqsd aqsdVar, aqtx aqtxVar) {
        if (aqsdVar == this.m && (aqsdVar == aqsd.IDLE || aqsdVar == aqsd.CONNECTING)) {
            return;
        }
        this.m = aqsdVar;
        this.g.f(aqsdVar, aqtxVar);
    }

    public final void i(arex arexVar) {
        if (arexVar.b == aqsd.READY) {
            if (!this.n && arexVar.a() != aqsd.READY) {
                aqsd a = arexVar.a();
                aqsd aqsdVar = aqsd.TRANSIENT_FAILURE;
                if (a == aqsdVar) {
                    h(aqsdVar, new arev(aqtt.a(arexVar.d.b)));
                    return;
                } else {
                    if (this.m != aqsdVar) {
                        h(arexVar.a(), new arev(aqtt.a));
                        return;
                    }
                    return;
                }
            }
            h(aqsd.READY, new aqtq(aqtt.b(arexVar.a)));
        }
    }
}
