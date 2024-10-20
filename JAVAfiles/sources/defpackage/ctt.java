package defpackage;

import android.os.Trace;
import defpackage.ces;
import defpackage.cga;
import defpackage.cvm;
import defpackage.cvo;
import defpackage.cxn;
import defpackage.cxt;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctt implements bwh {
    public final cxn a;
    public bwr b;
    public cvo c;
    public int d;
    public int e;
    public int i;
    public int j;
    public final ve l = new ve((byte[]) null);
    public final ve m = new ve((byte[]) null);
    public final c f = new c();
    public final b g = new b();
    public final ve n = new ve((byte[]) null);
    private final cvo.a p = new cvo.a(null);
    public final ve o = new ve((byte[]) null);
    public final cbh h = new cbh(new Object[16]);
    public final String k = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public Object a;
        public arqv b;
        public boolean d;
        public boolean e;
        public bzw c = null;
        public byn f = new byu(true, cav.a);

        public a(Object obj, arqv arqvVar) {
            this.a = obj;
            this.b = arqvVar;
        }

        public final boolean a() {
            return ((Boolean) this.f.a()).booleanValue();
        }

        public final void b() {
            this.f.h(false);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class b implements cvn, cuh {
        private final /* synthetic */ c b;

        public b() {
            this.b = ctt.this.f;
        }

        @Override // defpackage.cvn
        public final List a(Object obj, arqv arqvVar) {
            cxn cxnVar = (cxn) ctt.this.m.a(obj);
            if (cxnVar != null && ctt.this.a.E().indexOf(cxnVar) < ctt.this.d) {
                return cxnVar.C();
            }
            ctt cttVar = ctt.this;
            if (cttVar.h.b < cttVar.e) {
                csg.b("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
            }
            cbh cbhVar = cttVar.h;
            int i = cbhVar.b;
            int i2 = cttVar.e;
            if (i == i2) {
                cbhVar.n(obj);
            } else {
                cbhVar.d(i2, obj);
            }
            cttVar.e++;
            if (!ve.e(cttVar.n, obj)) {
                cttVar.o.j(obj, cttVar.a(obj, arqvVar));
                if (cttVar.a.q() == cxn.a.c) {
                    cttVar.a.aa(true);
                } else {
                    cxn.au(cttVar.a, true, 6);
                }
            }
            cxn cxnVar2 = (cxn) cttVar.n.a(obj);
            if (cxnVar2 != null) {
                List o = cxnVar2.w().o();
                int size = o.size();
                for (int i3 = 0; i3 < size; i3++) {
                    cxt.this.b = true;
                }
                return o;
            }
            return arnv.a;
        }

        @Override // defpackage.dqv
        public final float ec() {
            return this.b.b;
        }

        @Override // defpackage.drc
        public final float ed() {
            return this.b.c;
        }

        @Override // defpackage.drc
        public final float ef(long j) {
            return drb.a(this.b, j);
        }

        @Override // defpackage.dqv
        public final float eg(float f) {
            return dqu.a(this.b, f);
        }

        @Override // defpackage.dqv
        public final float eh(int i) {
            return dqu.b(this.b, i);
        }

        @Override // defpackage.dqv
        public final float el(long j) {
            return dqu.c(this.b, j);
        }

        @Override // defpackage.dqv
        public final float em(float f) {
            return dqu.d(this.b, f);
        }

        @Override // defpackage.dqv
        public final int en(long j) {
            return dqu.e(this.b, j);
        }

        @Override // defpackage.dqv
        public final int eo(float f) {
            return dqu.f(this.b, f);
        }

        @Override // defpackage.dqv
        public final long ep(long j) {
            return dqu.g(this.b, j);
        }

        @Override // defpackage.dqv
        public final long eq(long j) {
            return dqu.h(this.b, j);
        }

        @Override // defpackage.drc
        public final long er(float f) {
            return drb.b(this.b, f);
        }

        @Override // defpackage.dqv
        public final long es(float f) {
            return dqu.i(this.b, f);
        }

        @Override // defpackage.cuh
        public final cuf et(int i, int i2, Map map, arqr arqrVar) {
            return cug.a(this.b, i, i2, map, arqrVar);
        }

        @Override // defpackage.cuh
        public final cuf eu(int i, int i2, Map map, arqr arqrVar, arqr arqrVar2) {
            return this.b.eu(i, i2, map, arqrVar, arqrVar2);
        }

        @Override // defpackage.ctd
        public final boolean ev() {
            return this.b.ev();
        }

        @Override // defpackage.ctd
        public final drk q() {
            return this.b.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class c implements cvn {
        public drk a = drk.b;
        public float b;
        public float c;

        public c() {
        }

        @Override // defpackage.cvn
        public final List a(Object obj, arqv arqvVar) {
            ctt cttVar = ctt.this;
            cttVar.i();
            cxn.a q = cttVar.a.q();
            if (q != cxn.a.a && q != cxn.a.c && q != cxn.a.b && q != cxn.a.d) {
                csg.c("subcompose can only be used inside the measure or layout blocks");
            }
            ve veVar = cttVar.m;
            Object a = veVar.a(obj);
            if (a == null) {
                a = (cxn) cttVar.n.g(obj);
                if (a != null) {
                    if (cttVar.j <= 0) {
                        csg.c("Check failed.");
                    }
                    cttVar.j--;
                } else {
                    a = cttVar.f(obj);
                    if (a == null) {
                        a = cttVar.e(cttVar.d);
                    }
                }
                veVar.j(obj, a);
            }
            cxn cxnVar = (cxn) a;
            if (aqjn.aa(cttVar.a.E(), cttVar.d) != cxnVar) {
                int indexOf = cttVar.a.E().indexOf(cxnVar);
                if (indexOf < cttVar.d) {
                    csg.b(defpackage.a.cc(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
                }
                int i = cttVar.d;
                if (i != indexOf) {
                    cttVar.l(indexOf, i);
                }
            }
            cttVar.d++;
            cttVar.k(cxnVar, obj, arqvVar);
            if (q != cxn.a.a && q != cxn.a.c) {
                return cxnVar.B();
            }
            return cxnVar.C();
        }

        @Override // defpackage.dqv
        public final float ec() {
            return this.b;
        }

        @Override // defpackage.drc
        public final float ed() {
            return this.c;
        }

        @Override // defpackage.drc
        public final /* synthetic */ float ef(long j) {
            return drb.a(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float eg(float f) {
            return dqu.a(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float eh(int i) {
            return dqu.b(this, i);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float el(long j) {
            return dqu.c(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ float em(float f) {
            return dqu.d(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ int en(long j) {
            return dqu.e(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ int eo(float f) {
            return dqu.f(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ long ep(long j) {
            return dqu.g(this, j);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ long eq(long j) {
            return dqu.h(this, j);
        }

        @Override // defpackage.drc
        public final /* synthetic */ long er(float f) {
            return drb.b(this, f);
        }

        @Override // defpackage.dqv
        public final /* synthetic */ long es(float f) {
            return dqu.i(this, f);
        }

        @Override // defpackage.cuh
        public final /* synthetic */ cuf et(int i, int i2, Map map, arqr arqrVar) {
            return cug.a(this, i, i2, map, arqrVar);
        }

        @Override // defpackage.cuh
        public final cuf eu(final int i, final int i2, final Map map, final arqr arqrVar, final arqr arqrVar2) {
            if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
                csg.c(defpackage.a.cl(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
            }
            final ctt cttVar = ctt.this;
            return new cuf() { // from class: ctt.c.1
                @Override // defpackage.cuf
                public final int j() {
                    return i2;
                }

                @Override // defpackage.cuf
                public final int k() {
                    return i;
                }

                @Override // defpackage.cuf
                public final Map m() {
                    return map;
                }

                @Override // defpackage.cuf
                public final arqr n() {
                    return arqrVar;
                }

                @Override // defpackage.cuf
                public final void o() {
                    cyc cycVar;
                    if (this.ev() && (cycVar = ((cxc) cttVar.a.x()).g) != null) {
                        arqrVar2.a(cycVar.l);
                    } else {
                        arqrVar2.a(cttVar.a.x().l);
                    }
                }
            };
        }

        @Override // defpackage.ctd
        public final boolean ev() {
            if (ctt.this.a.q() != cxn.a.d && ctt.this.a.q() != cxn.a.b) {
                return false;
            }
            return true;
        }

        @Override // defpackage.ctd
        public final drk q() {
            return this.a;
        }
    }

    public ctt(cxn cxnVar, cvo cvoVar) {
        this.a = cxnVar;
        this.c = cvoVar;
    }

    private final Object m(List list, int i) {
        Object a2 = this.l.a((cxn) list.get(i));
        a2.getClass();
        return ((a) a2).a;
    }

    private static final void n(cxn cxnVar) {
        cxnVar.w().k = cxn.c.c;
        cxt.a v = cxnVar.v();
        if (v != null) {
            v.i = cxn.c.c;
        }
    }

    public final cvm.a a(final Object obj, arqv arqvVar) {
        if (!this.a.am()) {
            return new cvm.a() { // from class: ctt.1
                @Override // cvm.a
                public final /* synthetic */ int a() {
                    return 0;
                }

                @Override // cvm.a
                public final void b() {
                }

                @Override // cvm.a
                public final /* synthetic */ void d(arqr arqrVar) {
                }

                @Override // cvm.a
                public final /* synthetic */ void c(int i, long j) {
                }
            };
        }
        i();
        if (!ve.e(this.m, obj)) {
            this.o.g(obj);
            ve veVar = this.n;
            Object a2 = veVar.a(obj);
            if (a2 == null) {
                a2 = f(obj);
                if (a2 != null) {
                    l(this.a.E().indexOf(a2), this.a.E().size());
                    this.j++;
                } else {
                    a2 = e(this.a.E().size());
                    this.j++;
                }
                veVar.j(obj, a2);
            }
            k((cxn) a2, obj, arqvVar);
        }
        return new cvm.a() { // from class: ctt.2
            @Override // cvm.a
            public final int a() {
                cxn cxnVar = (cxn) ctt.this.n.a(obj);
                if (cxnVar != null) {
                    return cxnVar.D().size();
                }
                return 0;
            }

            @Override // cvm.a
            public final void b() {
                ctt.this.i();
                cxn cxnVar = (cxn) ctt.this.n.g(obj);
                if (cxnVar != null) {
                    if (ctt.this.j <= 0) {
                        csg.c("No pre-composed items to dispose");
                    }
                    int indexOf = ctt.this.a.E().indexOf(cxnVar);
                    if (indexOf < ctt.this.a.E().size() - ctt.this.j) {
                        csg.c("Item is not in pre-composed item range");
                    }
                    ctt cttVar = ctt.this;
                    cttVar.i++;
                    cttVar.j--;
                    int size = cttVar.a.E().size();
                    ctt cttVar2 = ctt.this;
                    int i = (size - cttVar2.j) - cttVar2.i;
                    cttVar2.l(indexOf, i);
                    ctt.this.h(i);
                }
            }

            @Override // cvm.a
            public final void c(int i, long j) {
                cxn cxnVar = (cxn) ctt.this.n.a(obj);
                if (cxnVar != null && cxnVar.am()) {
                    int size = cxnVar.D().size();
                    if (i < 0 || i >= size) {
                        csg.d("Index (" + i + ") is out of bound of [0, " + size + ')');
                    }
                    if (cxnVar.ew()) {
                        csg.b("Pre-measure called on node that is not placed");
                    }
                    cxn cxnVar2 = ctt.this.a;
                    cxnVar2.o = true;
                    cxq.a(cxnVar).r((cxn) cxnVar.D().get(i), j);
                    cxnVar2.o = false;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v0, types: [arqr] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1, types: [cga$c] */
            /* JADX WARN: Type inference failed for: r6v10 */
            /* JADX WARN: Type inference failed for: r6v11 */
            /* JADX WARN: Type inference failed for: r6v12 */
            /* JADX WARN: Type inference failed for: r6v13 */
            /* JADX WARN: Type inference failed for: r6v6 */
            /* JADX WARN: Type inference failed for: r6v7, types: [cga$c] */
            /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v9 */
            /* JADX WARN: Type inference failed for: r7v0 */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v10 */
            /* JADX WARN: Type inference failed for: r7v11 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v3, types: [cbh] */
            /* JADX WARN: Type inference failed for: r7v4 */
            /* JADX WARN: Type inference failed for: r7v5 */
            /* JADX WARN: Type inference failed for: r7v6, types: [cbh] */
            /* JADX WARN: Type inference failed for: r7v8 */
            /* JADX WARN: Type inference failed for: r7v9 */
            @Override // cvm.a
            public final void d(arqr arqrVar) {
                cyk cykVar;
                cga.c cVar;
                Object obj2;
                cxn cxnVar = (cxn) ctt.this.n.a(obj);
                if (cxnVar != null && (cykVar = cxnVar.w) != null && (cVar = cykVar.e) != null) {
                    if (!cVar.A().z) {
                        csg.c("visitSubtreeIf called on an unattached node");
                    }
                    cbh cbhVar = new cbh(new cga.c[16]);
                    cga.c cVar2 = cVar.A().t;
                    if (cVar2 == null) {
                        cwp.j(cbhVar, cVar.A());
                    } else {
                        cbhVar.n(cVar2);
                    }
                    while (true) {
                        int i = cbhVar.b;
                        if (i != 0) {
                            cga.c cVar3 = (cga.c) cbhVar.c(i - 1);
                            if ((cVar3.r & 262144) != 0) {
                                for (cga.c cVar4 = cVar3; cVar4 != null; cVar4 = cVar4.t) {
                                    if ((cVar4.q & 262144) != 0) {
                                        cwr cwrVar = cVar4;
                                        ?? r7 = 0;
                                        while (cwrVar != 0) {
                                            if (cwrVar instanceof czp) {
                                                czp czpVar = (czp) cwrVar;
                                                if (d.F("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", czpVar.dP())) {
                                                    obj2 = arqrVar.a(czpVar);
                                                } else {
                                                    obj2 = czo.a;
                                                }
                                                if (obj2 != czo.c) {
                                                    if (obj2 == czo.b) {
                                                        break;
                                                    }
                                                } else {
                                                    return;
                                                }
                                            } else if ((cwrVar.q & 262144) != 0 && (cwrVar instanceof cwr)) {
                                                cga.c cVar5 = cwrVar.B;
                                                int i2 = 0;
                                                cwrVar = cwrVar;
                                                r7 = r7;
                                                while (cVar5 != null) {
                                                    if ((cVar5.q & 262144) != 0) {
                                                        i2++;
                                                        r7 = r7;
                                                        if (i2 == 1) {
                                                            cwrVar = cVar5;
                                                        } else {
                                                            if (r7 == 0) {
                                                                r7 = new cbh(new cga.c[16]);
                                                            }
                                                            if (cwrVar != 0) {
                                                                r7.n(cwrVar);
                                                            }
                                                            r7.n(cVar5);
                                                            cwrVar = 0;
                                                        }
                                                    }
                                                    cVar5 = cVar5.t;
                                                    cwrVar = cwrVar;
                                                    r7 = r7;
                                                }
                                                if (i2 != 1) {
                                                }
                                            }
                                            cwrVar = cwp.a(r7);
                                        }
                                    }
                                }
                            }
                            cwp.j(cbhVar, cVar3);
                        } else {
                            return;
                        }
                    }
                }
            }
        };
    }

    @Override // defpackage.bwh
    public final void b() {
        j(true);
    }

    @Override // defpackage.bwh
    public final void c() {
        g();
    }

    @Override // defpackage.bwh
    public final void d() {
        j(false);
    }

    public final cxn e(int i) {
        cxn cxnVar = new cxn(true, 2, null);
        cxn cxnVar2 = this.a;
        cxnVar2.o = true;
        cxnVar2.M(i, cxnVar);
        cxnVar2.o = false;
        return cxnVar;
    }

    public final cxn f(Object obj) {
        int i;
        if (this.i == 0) {
            return null;
        }
        List E = this.a.E();
        int size = E.size() - this.j;
        int i2 = size - this.i;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 >= i2) {
                if (d.F(m(E, i4), obj)) {
                    i = i4;
                    break;
                }
                i4--;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object a2 = this.l.a((cxn) E.get(i3));
                a2.getClass();
                a aVar = (a) a2;
                Object obj2 = aVar.a;
                if (obj2 != cvl.a && !this.c.b(obj, obj2)) {
                    i3--;
                } else {
                    aVar.a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
            }
            i4 = i3;
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            l(i4, i2);
        }
        this.i--;
        cxn cxnVar = (cxn) E.get(i2);
        Object a3 = this.l.a(cxnVar);
        a3.getClass();
        a aVar2 = (a) a3;
        aVar2.f = new byu(true, cav.a);
        aVar2.e = true;
        aVar2.d = true;
        return cxnVar;
    }

    public final void g() {
        int i;
        bzw bzwVar;
        arqg arqgVar = cxn.b;
        cxn cxnVar = this.a;
        cxnVar.o = true;
        ve veVar = this.l;
        Object[] objArr = veVar.c;
        long[] jArr = veVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128 && (bzwVar = ((a) objArr[(i2 << 3) + i4]).c) != null) {
                            bzwVar.b();
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.a.X();
        cxnVar.o = false;
        this.l.i();
        this.m.i();
        this.j = 0;
        this.i = 0;
        this.n.i();
        i();
    }

    public final void h(int i) {
        arqr arqrVar;
        this.i = 0;
        List E = this.a.E();
        int size = (E.size() - this.j) - 1;
        if (i <= size) {
            this.p.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.p.add(m(E, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(this.p);
            ces a2 = ces.a.a();
            if (a2 != null) {
                arqrVar = a2.i();
            } else {
                arqrVar = null;
            }
            ces b2 = ces.a.b(a2);
            boolean z = false;
            while (size >= i) {
                try {
                    cxn cxnVar = (cxn) E.get(size);
                    Object a3 = this.l.a(cxnVar);
                    a3.getClass();
                    a aVar = (a) a3;
                    Object obj = aVar.a;
                    if (this.p.contains(obj)) {
                        this.i++;
                        if (aVar.a()) {
                            n(cxnVar);
                            aVar.b();
                            z = true;
                        }
                    } else {
                        cxn cxnVar2 = this.a;
                        cxnVar2.o = true;
                        this.l.g(cxnVar);
                        bzw bzwVar = aVar.c;
                        if (bzwVar != null) {
                            bzwVar.b();
                        }
                        this.a.Y(size, 1);
                        cxnVar2.o = false;
                    }
                    this.m.g(obj);
                    size--;
                } finally {
                    ces.a.f(a2, b2, arqrVar);
                }
            }
            if (z) {
                ces.a.g();
            }
        }
        i();
    }

    public final void i() {
        int size = this.a.E().size();
        if (this.l.e != size) {
            csg.b("Inconsistency between the count of nodes tracked by the state (" + this.l.e + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.i) - this.j < 0) {
            csg.b("Incorrect state. Total children " + size + ". Reusable children " + this.i + ". Precomposed children " + this.j);
        }
        if (this.n.e == this.j) {
            return;
        }
        csg.b("Incorrect state. Precomposed children " + this.j + ". Map size " + this.n.e);
    }

    public final void j(boolean z) {
        arqr arqrVar;
        boolean z2;
        this.j = 0;
        this.n.i();
        List E = this.a.E();
        int size = E.size();
        if (this.i != size) {
            this.i = size;
            ces a2 = ces.a.a();
            if (a2 != null) {
                arqrVar = a2.i();
            } else {
                arqrVar = null;
            }
            ces b2 = ces.a.b(a2);
            for (int i = 0; i < size; i++) {
                try {
                    cxn cxnVar = (cxn) E.get(i);
                    a aVar = (a) this.l.a(cxnVar);
                    if (aVar != null && aVar.a()) {
                        n(cxnVar);
                        if (z) {
                            bzw bzwVar = aVar.c;
                            if (bzwVar != null) {
                                synchronized (((bwt) bzwVar).c) {
                                    if (((bwt) bzwVar).e.b > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2 || !((bwt) bzwVar).d.isEmpty()) {
                                        Trace.beginSection("Compose:deactivate");
                                        try {
                                            cdo cdoVar = new cdo(((bwt) bzwVar).d);
                                            if (z2) {
                                                cae c2 = ((bwt) bzwVar).e.c();
                                                try {
                                                    bwp.j(c2, cdoVar);
                                                    c2.z(true);
                                                    ((bwt) bzwVar).a.f();
                                                    cdoVar.c();
                                                } finally {
                                                }
                                            }
                                            cdoVar.b();
                                        } finally {
                                        }
                                    }
                                    ((bwt) bzwVar).l.i();
                                    ((bwt) bzwVar).m.i();
                                    ((bwt) bzwVar).n.i();
                                    ((bwt) bzwVar).f.a();
                                    ((bwt) bzwVar).g.a();
                                    ((bwt) bzwVar).j.X();
                                }
                            }
                            aVar.f = new byu(false, cav.a);
                        } else {
                            aVar.b();
                        }
                        aVar.a = cvl.a;
                    }
                } catch (Throwable th) {
                    ces.a.f(a2, b2, arqrVar);
                    throw th;
                }
            }
            ces.a.f(a2, b2, arqrVar);
            this.m.i();
        }
        i();
    }

    public final void k(cxn cxnVar, Object obj, arqv arqvVar) {
        boolean z;
        arqr arqrVar;
        ve veVar = this.l;
        Object a2 = veVar.a(cxnVar);
        if (a2 == null) {
            a2 = new a(obj, csu.a);
            veVar.j(cxnVar, a2);
        }
        a aVar = (a) a2;
        bzw bzwVar = aVar.c;
        if (bzwVar != null) {
            synchronized (((bwt) bzwVar).c) {
                if (((bwt) bzwVar).n.e > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = true;
        }
        if (aVar.b == arqvVar && !z && !aVar.d) {
            return;
        }
        aVar.b = arqvVar;
        ces a3 = ces.a.a();
        if (a3 != null) {
            arqrVar = a3.i();
        } else {
            arqrVar = null;
        }
        ces b2 = ces.a.b(a3);
        try {
            cxn cxnVar2 = this.a;
            arqg arqgVar = cxn.b;
            cxnVar2.o = true;
            arqv arqvVar2 = aVar.b;
            bzw bzwVar2 = aVar.c;
            bwr bwrVar = this.b;
            if (bwrVar != null) {
                boolean z2 = aVar.e;
                cdj cdjVar = new cdj(-1750409193, true, new ctv(aVar, arqvVar2));
                if (bzwVar2 == null || ((bwt) bzwVar2).k) {
                    bzwVar2 = new bwt(bwrVar, new czs(cxnVar));
                }
                if (!z2) {
                    ((bwt) bzwVar2).i(cdjVar);
                } else {
                    bwk bwkVar = ((bwt) bzwVar2).j;
                    bwkVar.n = 100;
                    bwkVar.m = true;
                    ((bwt) bzwVar2).i(cdjVar);
                    bwk bwkVar2 = ((bwt) bzwVar2).j;
                    if (bwkVar2.q || bwkVar2.n != 100) {
                        byy.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    bwkVar2.n = -1;
                    bwkVar2.m = false;
                }
                aVar.c = bzwVar2;
                aVar.e = false;
                cxnVar2.o = false;
                ces.a.f(a3, b2, arqrVar);
                aVar.d = false;
                return;
            }
            csg.a("parent composition reference not set");
            throw new armj();
        } catch (Throwable th) {
            ces.a.f(a3, b2, arqrVar);
            throw th;
        }
    }

    public final void l(int i, int i2) {
        arqg arqgVar = cxn.b;
        cxn cxnVar = this.a;
        cxnVar.o = true;
        cxnVar.V(i, i2, 1);
        cxnVar.o = false;
    }
}
