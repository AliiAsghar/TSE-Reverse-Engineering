package defpackage;

import android.util.Log;
import defpackage.ces;
import defpackage.cet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzj extends bwr {
    public static final ascd a = ascy.a(cdc.a);
    private static final AtomicReference q = new AtomicReference(false);
    public long b;
    public final bwd c;
    public final Object d;
    public arxm e;
    public Throwable f;
    public final cbh g;
    public final List h;
    public final Map i;
    public final Map j;
    public Set k;
    public arvo l;
    public boolean m;
    public final ascd n;
    public final c o;
    public vh p;
    private final List r;
    private List s;
    private final List t;
    private List u;
    private b v;
    private final arpi w;
    private final arxo x;

    /* compiled from: PG */
    /* renamed from: bzj$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            arvo t;
            bzj bzjVar = bzj.this;
            synchronized (bzjVar.d) {
                t = bzjVar.t();
                if (((d) bzjVar.n.c()).compareTo(d.b) <= 0) {
                    throw arsd.ao("Recomposer shutdown; frame clock awaiter will never resume", bzjVar.f);
                }
            }
            if (t != null) {
                t.w(arnb.a);
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bzj$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Throwable, arnb> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            Throwable th = (Throwable) obj;
            CancellationException ao = arsd.ao("Recomposer effect job completed", th);
            bzj bzjVar = bzj.this;
            synchronized (bzjVar.d) {
                arxm arxmVar = bzjVar.e;
                if (arxmVar != null) {
                    bzjVar.n.f(d.b);
                    arxmVar.v(ao);
                    bzjVar.l = null;
                    arxmVar.s(new bzk(bzjVar, th));
                } else {
                    bzjVar.f = ao;
                    bzjVar.n.f(d.a);
                }
            }
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final void a(c cVar) {
            cbo cboVar;
            cbo c;
            do {
                cboVar = (cbo) bzj.a.c();
                c = cboVar.c(cVar);
                if (cboVar == c) {
                    return;
                }
            } while (!bzj.a.g(cboVar, c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
        public final Exception a;

        public b(Exception exc) {
            this.a = exc;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        private static final /* synthetic */ d[] g;

        static {
            d dVar = new d("ShutDown", 0);
            a = dVar;
            d dVar2 = new d("ShuttingDown", 1);
            b = dVar2;
            d dVar3 = new d("Inactive", 2);
            c = dVar3;
            d dVar4 = new d("InactivePendingWork", 3);
            d = dVar4;
            d dVar5 = new d("Idle", 4);
            e = dVar5;
            d dVar6 = new d("PendingWork", 5);
            f = dVar6;
            d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
            g = dVarArr;
            arhi.f(dVarArr);
        }

        private d(String str, int i) {
        }

        public static d[] values() {
            return (d[]) g.clone();
        }
    }

    public bzj(arpi arpiVar) {
        bwd bwdVar = new bwd(new AnonymousClass1());
        this.c = bwdVar;
        this.d = new Object();
        this.r = new ArrayList();
        this.p = new vh((byte[]) null);
        this.g = new cbh(new bxc[16]);
        this.t = new ArrayList();
        this.h = new ArrayList();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.n = ascy.a(d.c);
        new cdq();
        arxo arxoVar = new arxo((arxm) arpiVar.get(arxm.c));
        arxoVar.s(new AnonymousClass2());
        this.x = arxoVar;
        this.w = arpiVar.plus(bwdVar).plus(arxoVar);
        this.o = new c();
    }

    public static final void C(cem cemVar) {
        try {
            if (!(cemVar.c() instanceof cet.a)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cemVar.d();
        }
    }

    private static final void E(List list, bzj bzjVar, bxc bxcVar) {
        list.clear();
        synchronized (bzjVar.d) {
            Iterator it = bzjVar.h.iterator();
            while (it.hasNext()) {
                byi byiVar = (byi) it.next();
                if (defpackage.d.F(byiVar.c, bxcVar)) {
                    list.add(byiVar);
                    it.remove();
                }
            }
        }
    }

    private final void F(bxc bxcVar) {
        this.r.remove(bxcVar);
        this.s = null;
    }

    private final boolean G() {
        if (this.g.b == 0 && !x()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Exception exc, bxc bxcVar) {
        if (((Boolean) q.get()).booleanValue() && !(exc instanceof bwi)) {
            synchronized (this.d) {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.t.clear();
                this.g.g();
                this.p = new vh((byte[]) null);
                this.h.clear();
                this.i.clear();
                this.j.clear();
                this.v = new b(exc);
                if (bxcVar != null) {
                    w(bxcVar);
                }
                t();
            }
            return;
        }
        synchronized (this.d) {
            b bVar = this.v;
            if (bVar == null) {
                this.v = new b(exc);
            } else {
                throw bVar.a;
            }
        }
        throw exc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e1, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        if (r4 >= r3) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (((defpackage.armo) r10.get(r4)).b == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0103, code lost:
    
        if (r9 >= r4) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        r11 = (defpackage.armo) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
    
        if (r11.b != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
    
        r11 = (defpackage.byi) r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        if (r11 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0114, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        r4 = r18.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0120, code lost:
    
        defpackage.aqjn.S(r18.h, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0125, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0126, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        if (r9 >= r4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0136, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013f, code lost:
    
        if (((defpackage.armo) r11).b == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0141, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0144, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A(java.util.List r19, defpackage.vh r20) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzj.A(java.util.List, vh):java.util.List");
    }

    @Override // defpackage.bwr
    public final int a() {
        return 1000;
    }

    @Override // defpackage.bwr
    public final byh b(byi byiVar) {
        byh byhVar;
        synchronized (this.d) {
            byhVar = (byh) this.j.remove(byiVar);
        }
        return byhVar;
    }

    @Override // defpackage.bwr
    public final arpi d() {
        return this.w;
    }

    @Override // defpackage.bwr
    public final void e(bxc bxcVar, arqv arqvVar) {
        boolean q2 = bxcVar.q();
        try {
            cem h = ces.a.h(new bzn(bxcVar), new bzq(bxcVar, null));
            try {
                ces w = h.w();
                try {
                    synchronized (((bwt) bxcVar).c) {
                        ((bwt) bxcVar).j();
                        ve t = ((bwt) bxcVar).t();
                        try {
                            bwt.v();
                            bwk bwkVar = ((bwt) bxcVar).j;
                            if (!bwkVar.d.d()) {
                                bwp.i("Expected applyChanges() to have been called");
                            }
                            bwkVar.ah(t, arqvVar);
                        } catch (Exception e) {
                            ((bwt) bxcVar).n = t;
                            throw e;
                        }
                    }
                    if (!q2) {
                        ces.a.c();
                    }
                    synchronized (this.d) {
                        if (((d) this.n.c()).compareTo(d.b) > 0 && !g().contains(bxcVar)) {
                            this.r.add(bxcVar);
                            this.s = null;
                        }
                    }
                    try {
                        synchronized (this.d) {
                            List list = this.h;
                            int size = list.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (defpackage.d.F(((byi) list.get(i)).c, bxcVar)) {
                                    ArrayList arrayList = new ArrayList();
                                    E(arrayList, this, bxcVar);
                                    while (!arrayList.isEmpty()) {
                                        A(arrayList, null);
                                        E(arrayList, this, bxcVar);
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                        try {
                            bxcVar.f();
                            bxcVar.g();
                            if (!q2) {
                                ces.a.c();
                            }
                        } catch (Exception e2) {
                            H(e2, null);
                        }
                    } catch (Exception e3) {
                        H(e3, bxcVar);
                    }
                } catch (Throwable th) {
                    try {
                        try {
                            Set set = ((bwt) bxcVar).d;
                            if (!set.isEmpty()) {
                                new cdo(set).b();
                            }
                            throw th;
                        } catch (Exception e4) {
                            ((bwt) bxcVar).d();
                            throw e4;
                        }
                    } finally {
                        ces.E(w);
                    }
                }
            } finally {
                C(h);
            }
        } catch (Exception e5) {
            H(e5, bxcVar);
        }
    }

    @Override // defpackage.bwr
    public final void f(byi byiVar) {
        synchronized (this.d) {
            Map map = this.i;
            byg bygVar = byiVar.a;
            Object obj = map.get(bygVar);
            if (obj == null) {
                obj = new ArrayList();
                map.put(bygVar, obj);
            }
            ((List) obj).add(byiVar);
        }
    }

    public final List g() {
        List list = this.s;
        if (list == null) {
            List list2 = this.r;
            if (list2.isEmpty()) {
                list = arnv.a;
            } else {
                list = new ArrayList(list2);
            }
            this.s = list;
        }
        return list;
    }

    @Override // defpackage.bwr
    public final void i(bxc bxcVar) {
        arvo arvoVar;
        synchronized (this.d) {
            if (!this.g.l(bxcVar)) {
                this.g.n(bxcVar);
                arvoVar = t();
            } else {
                arvoVar = null;
            }
        }
        if (arvoVar != null) {
            arvoVar.w(arnb.a);
        }
    }

    @Override // defpackage.bwr
    public final void j(byi byiVar, byh byhVar) {
        synchronized (this.d) {
            this.j.put(byiVar, byhVar);
        }
    }

    @Override // defpackage.bwr
    public final void m(bxc bxcVar) {
        synchronized (this.d) {
            Set set = this.k;
            if (set == null) {
                set = new LinkedHashSet();
                this.k = set;
            }
            set.add(bxcVar);
        }
    }

    @Override // defpackage.bwr
    public final void p(bxc bxcVar) {
        synchronized (this.d) {
            F(bxcVar);
            this.g.m(bxcVar);
            this.t.remove(bxcVar);
        }
    }

    @Override // defpackage.bwr
    public final boolean q() {
        return ((Boolean) q.get()).booleanValue();
    }

    @Override // defpackage.bwr
    public final boolean r() {
        return false;
    }

    @Override // defpackage.bwr
    public final boolean s() {
        return false;
    }

    public final arvo t() {
        d dVar;
        byte[] bArr = null;
        if (((d) this.n.c()).compareTo(d.b) <= 0) {
            this.r.clear();
            this.s = arnv.a;
            this.p = new vh(bArr);
            this.g.g();
            this.t.clear();
            this.h.clear();
            this.u = null;
            arvo arvoVar = this.l;
            if (arvoVar != null) {
                arvoVar.h(null);
            }
            this.l = null;
            this.v = null;
            return null;
        }
        if (this.v != null) {
            dVar = d.c;
        } else if (this.e == null) {
            this.p = new vh(bArr);
            this.g.g();
            if (x()) {
                dVar = d.d;
            } else {
                dVar = d.c;
            }
        } else if (this.g.b == 0 && !this.p.c() && this.t.isEmpty() && this.h.isEmpty() && !x()) {
            dVar = d.e;
        } else {
            dVar = d.f;
        }
        this.n.f(dVar);
        if (dVar != d.f) {
            return null;
        }
        arvo arvoVar2 = this.l;
        this.l = null;
        return arvoVar2;
    }

    public final void u() {
        synchronized (this.d) {
            if (((d) this.n.c()).compareTo(d.e) >= 0) {
                this.n.f(d.b);
            }
        }
        this.x.v(null);
    }

    public final void v() {
        synchronized (this.d) {
            this.m = true;
        }
    }

    public final void w(bxc bxcVar) {
        List list = this.u;
        if (list == null) {
            list = new ArrayList();
            this.u = list;
        }
        if (!list.contains(bxcVar)) {
            list.add(bxcVar);
        }
        F(bxcVar);
    }

    public final boolean x() {
        if (!this.m && this.c.d.get() != 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.p.c() && this.g.b == 0) {
                if (!x()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final boolean z() {
        List g;
        boolean G;
        synchronized (this.d) {
            if (this.p.b()) {
                return G();
            }
            cbj cbjVar = new cbj(this.p);
            byte[] bArr = null;
            this.p = new vh(bArr);
            synchronized (this.d) {
                g = g();
            }
            try {
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    ((bxc) g.get(i)).n(cbjVar);
                    if (((d) this.n.c()).compareTo(d.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.d) {
                    this.p = new vh(bArr);
                }
                synchronized (this.d) {
                    if (t() == null) {
                        G = G();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return G;
            } catch (Throwable th) {
                synchronized (this.d) {
                    this.p.k(cbjVar);
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.bwr
    public final void k(Set set) {
    }
}
