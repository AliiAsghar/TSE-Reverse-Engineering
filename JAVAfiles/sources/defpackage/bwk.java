package defpackage;

import android.os.Trace;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.bwj;
import defpackage.byx;
import defpackage.cbb;
import defpackage.cbf;
import defpackage.cdm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwk implements bwj {
    public tx A;
    private final Set B;
    private byw D;
    private int E;
    private int F;
    private int G;
    private int K;
    private final AnonymousClass1 L;
    private final ArrayList M;
    private bwa N;
    private cba O;
    private tt P;
    public final bwc a;
    public final bwr b;
    public final cab c;
    public final cay d;
    public final cay e;
    public final bxc f;
    public int[] g;
    public boolean h;
    public boolean i;
    public boolean k;
    public boolean m;
    public int o;
    public boolean p;
    public boolean q;
    public caa r;
    public cab s;
    public cae t;
    public boolean u;
    public byx v;
    public cay w;
    public final caz x;
    public boolean y;
    public int z;
    private final ArrayList C = new ArrayList();
    private final bxr H = new bxr();
    public final List j = new ArrayList();
    private final bxr I = new bxr();
    private byx J = cdm.d;
    public final bxr l = new bxr();
    public int n = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b extends bwr {
        public final Set a = new LinkedHashSet();
        public final byn b = new byu(cdm.d, bzr.a);
        private final int d;
        private final boolean e;
        private final boolean f;
        private Set g;

        public b(int i, boolean z, boolean z2) {
            this.d = i;
            this.e = z;
            this.f = z2;
        }

        @Override // defpackage.bwr
        public final int a() {
            return this.d;
        }

        @Override // defpackage.bwr
        public final byh b(byi byiVar) {
            return bwk.this.b.b(byiVar);
        }

        @Override // defpackage.bwr
        public final byx c() {
            return (byx) this.b.a();
        }

        @Override // defpackage.bwr
        public final arpi d() {
            return bwk.this.b.d();
        }

        @Override // defpackage.bwr
        public final void e(bxc bxcVar, arqv arqvVar) {
            bwk.this.b.e(bxcVar, arqvVar);
        }

        @Override // defpackage.bwr
        public final void f(byi byiVar) {
            bwk.this.b.f(byiVar);
        }

        public final void g() {
            if (!this.a.isEmpty()) {
                Set set = this.g;
                if (set != null) {
                    for (bwk bwkVar : this.a) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((Set) it.next()).remove(bwkVar.c);
                        }
                    }
                }
                this.a.clear();
            }
        }

        @Override // defpackage.bwr
        public final void h() {
            bwk bwkVar = bwk.this;
            bwkVar.o--;
        }

        @Override // defpackage.bwr
        public final void i(bxc bxcVar) {
            bwk bwkVar = bwk.this;
            bwkVar.b.i(bwkVar.f);
            bwk.this.b.i(bxcVar);
        }

        @Override // defpackage.bwr
        public final void j(byi byiVar, byh byhVar) {
            bwk.this.b.j(byiVar, byhVar);
        }

        @Override // defpackage.bwr
        public final void k(Set set) {
            Set set2 = this.g;
            if (set2 == null) {
                set2 = new HashSet();
                this.g = set2;
            }
            set2.add(set);
        }

        @Override // defpackage.bwr
        public final void l(bwj bwjVar) {
            this.a.add(bwjVar);
        }

        @Override // defpackage.bwr
        public final void m(bxc bxcVar) {
            bwk.this.b.m(bxcVar);
        }

        @Override // defpackage.bwr
        public final void n() {
            bwk.this.o++;
        }

        @Override // defpackage.bwr
        public final void o(bwj bwjVar) {
            Set set = this.g;
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((bwk) bwjVar).c);
                }
            }
            Set set2 = this.a;
            arsd.h(set2);
            set2.remove(bwjVar);
        }

        @Override // defpackage.bwr
        public final void p(bxc bxcVar) {
            bwk.this.b.p(bxcVar);
        }

        @Override // defpackage.bwr
        public final boolean q() {
            return bwk.this.b.q();
        }

        @Override // defpackage.bwr
        public final boolean r() {
            return this.e;
        }

        @Override // defpackage.bwr
        public final boolean s() {
            return this.f;
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [bwk$1] */
    public bwk(bwc bwcVar, bwr bwrVar, cab cabVar, Set set, cay cayVar, cay cayVar2, bxc bxcVar) {
        boolean z;
        this.a = bwcVar;
        this.b = bwrVar;
        this.c = cabVar;
        this.B = set;
        this.d = cayVar;
        this.e = cayVar2;
        this.f = bxcVar;
        if (!bwrVar.s() && !bwrVar.q()) {
            z = false;
        } else {
            z = true;
        }
        this.p = z;
        this.L = new bxf() { // from class: bwk.1
            @Override // defpackage.bxf
            public final void a() {
                bwk bwkVar = bwk.this;
                bwkVar.o--;
            }

            @Override // defpackage.bxf
            public final void b() {
                bwk.this.o++;
            }
        };
        this.M = new ArrayList();
        caa b2 = cabVar.b();
        b2.r();
        this.r = b2;
        cab cabVar2 = new cab();
        if (bwrVar.s()) {
            cabVar2.e();
        }
        if (bwrVar.q()) {
            cabVar2.d();
        }
        this.s = cabVar2;
        cae c = cabVar2.c();
        c.z(true);
        this.t = c;
        this.x = new caz(this, cayVar);
        caa b3 = this.s.b();
        try {
            bwa g = b3.g(0);
            b3.r();
            this.N = g;
            this.O = new cba();
        } catch (Throwable th) {
            b3.r();
            throw th;
        }
    }

    private final void aA(boolean z, Object obj) {
        if (z) {
            caa caaVar = this.r;
            if (caaVar.h <= 0) {
                if (!cad.v(caaVar.b, caaVar.e)) {
                    byy.a("Expected a node group");
                }
                caaVar.v();
                return;
            }
            return;
        }
        if (obj != null && this.r.h() != obj) {
            caz cazVar = this.x;
            caz.n(cazVar);
            cbf cbfVar = cazVar.a.a;
            cbb.ae aeVar = cbb.ae.a;
            cbfVar.e(aeVar);
            cbf.b.b(cbfVar, 0, obj);
            if (cbfVar.g != cbf.h(aeVar.b) || cbfVar.h != cbf.h(aeVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i = aeVar.b;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    if (((1 << i3) & cbfVar.g) != 0) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(aeVar.a(i3));
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i4 = aeVar.c;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    if (((1 << i6) & cbfVar.h) != 0) {
                        if (i2 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(aeVar.c(i6));
                        i5++;
                    }
                }
                byy.b(defpackage.a.cm(new StringBuilder(), sb3.toString(), i5, sb2, i2, aeVar));
            }
        }
        this.r.v();
    }

    private final void aB(int i, int i2) {
        int O = O(i);
        if (O != i2) {
            int size = this.C.size() - 1;
            while (i != -1) {
                int O2 = O(i) + (i2 - O);
                ae(i, O2);
                int i3 = size;
                while (true) {
                    if (i3 < 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    byw bywVar = (byw) this.C.get(i3);
                    if (bywVar != null && bywVar.d(i, O2)) {
                        size = i4;
                        break;
                    }
                    i3 = i4;
                }
                if (i < 0) {
                    i = this.r.g;
                } else if (!this.r.z(i)) {
                    i = this.r.e(i);
                } else {
                    return;
                }
            }
        }
    }

    private final void aC(Object obj) {
        S();
        af(obj);
    }

    private final void aD() {
        if (!this.i) {
            bwp.i("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.i = false;
    }

    private final void aE() {
        if (!this.i) {
            return;
        }
        bwp.i("A call to createNode(), emitNode() or useNode() expected");
    }

    private static final int aF(int i) {
        return (-2) - i;
    }

    public static final /* synthetic */ void aj(bwk bwkVar, byg bygVar, byx byxVar, Object obj) {
        boolean z;
        bwkVar.x(126665345, bygVar);
        bwkVar.aC(obj);
        int i = bwkVar.z;
        try {
            bwkVar.z = 126665345;
            if (bwkVar.y) {
                cae.X(bwkVar.t);
            }
            if (bwkVar.y || d.F(bwkVar.r.h(), byxVar)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                bwkVar.Z(byxVar);
            }
            bwkVar.ab(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, bwp.c, 0, byxVar);
            bwkVar.v = null;
            boolean z2 = bwkVar.k;
            bwkVar.k = z;
            cdv.a(bwkVar, new cdj(316014703, true, new bwn()));
            bwkVar.k = z2;
        } finally {
            bwkVar.Y();
            bwkVar.v = null;
            bwkVar.z = i;
            bwkVar.Y();
        }
    }

    private final int al(int i, int i2, int i3, int i4) {
        int i5;
        if (i != i3) {
            caa caaVar = this.r;
            if (caaVar.x(i)) {
                Object m = caaVar.m(i);
                if (m != null) {
                    if (m instanceof Enum) {
                        i5 = ((Enum) m).ordinal();
                    } else if (m instanceof byg) {
                        i5 = 126665345;
                    } else {
                        i5 = m.hashCode();
                    }
                } else {
                    i5 = 0;
                }
            } else {
                int b2 = caaVar.b(i);
                if (b2 == 207) {
                    Object j = caaVar.j(i);
                    if (j != null && !d.F(j, bwj.a.a)) {
                        i5 = j.hashCode();
                    } else {
                        i5 = 207;
                    }
                } else {
                    i5 = b2;
                }
            }
            if (i5 == 126665345) {
                return i5;
            }
            int e = this.r.e(i);
            if (e != i3) {
                i4 = al(e, am(e), i3, i4);
            }
            if (true == this.r.x(i)) {
                i2 = 0;
            }
            return Integer.rotateLeft(Integer.rotateLeft(i4, 3) ^ i5, 3) ^ i2;
        }
        return i4;
    }

    private final int am(int i) {
        int e = this.r.e(i) + 1;
        int i2 = 0;
        while (e < i) {
            if (!this.r.x(e)) {
                i2++;
            }
            e += this.r.c(e);
        }
        return i2;
    }

    private static final int an(bwk bwkVar, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        a aVar;
        caa caaVar = bwkVar.r;
        int i4 = 1;
        if (cad.t(caaVar.b, i)) {
            int b2 = caaVar.b(i);
            Object m = caaVar.m(i);
            if (b2 == 126665345) {
                if (m instanceof byg) {
                    byg bygVar = (byg) m;
                    Object l = caaVar.l(i, 0);
                    bwa g = caaVar.g(i);
                    int c = caaVar.c(i) + i;
                    List list = bwkVar.j;
                    ArrayList arrayList = new ArrayList();
                    for (int c2 = bwp.c(list, i); c2 < list.size(); c2++) {
                        bxt bxtVar = (bxt) list.get(c2);
                        if (bxtVar.b >= c) {
                            break;
                        }
                        arrayList.add(bxtVar);
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        bxt bxtVar2 = (bxt) arrayList.get(i5);
                        arrayList2.add(new armo(bxtVar2.a, bxtVar2.c));
                    }
                    byi byiVar = new byi(bygVar, l, bwkVar.f, bwkVar.c, g, arrayList2, bwkVar.ao(i));
                    bwkVar.b.f(byiVar);
                    bwkVar.x.k();
                    caz cazVar = bwkVar.x;
                    bxc bxcVar = bwkVar.f;
                    bwr bwrVar = bwkVar.b;
                    cbf cbfVar = cazVar.a.a;
                    cbb.u uVar = cbb.u.a;
                    cbfVar.e(uVar);
                    cbf.b.b(cbfVar, 0, bxcVar);
                    cbf.b.b(cbfVar, 1, bwrVar);
                    cbf.b.b(cbfVar, 2, byiVar);
                    if (cbfVar.g != cbf.h(uVar.b) || cbfVar.h != cbf.h(uVar.c)) {
                        StringBuilder sb = new StringBuilder();
                        int i6 = uVar.b;
                        int i7 = 0;
                        for (int i8 = 0; i8 < i6; i8++) {
                            if (((1 << i8) & cbfVar.g) != 0) {
                                if (i7 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(uVar.a(i8));
                                i7++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder();
                        int i9 = uVar.c;
                        int i10 = 0;
                        for (int i11 = 0; i11 < i9; i11++) {
                            if (((1 << i11) & cbfVar.h) != 0) {
                                if (i7 > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(uVar.c(i11));
                                i10++;
                            }
                        }
                        byy.b(defpackage.a.cm(new StringBuilder(), sb3.toString(), i10, sb2, i7, uVar));
                    }
                    if (z) {
                        caz cazVar2 = bwkVar.x;
                        cazVar2.i();
                        cazVar2.g();
                        if (!cazVar2.a().z(i)) {
                            i4 = cazVar2.a().d(i);
                        }
                        if (i4 <= 0) {
                            return 0;
                        }
                        cazVar2.l(i2, i4);
                        return 0;
                    }
                    return caaVar.d(i);
                }
            } else if (b2 == 206 && d.F(m, bwp.e)) {
                Object l2 = caaVar.l(i, 0);
                if (l2 instanceof a) {
                    aVar = (a) l2;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    for (bwk bwkVar2 : aVar.a.a) {
                        cab cabVar = bwkVar2.c;
                        if (cabVar.b > 0 && cad.r(cabVar.a, 0)) {
                            bxc bxcVar2 = bwkVar2.f;
                            synchronized (((bwt) bxcVar2).c) {
                                Object andSet = ((bwt) bxcVar2).b.getAndSet(arnx.a);
                                if (!d.F(andSet, bwu.a) && andSet != null) {
                                    if (andSet instanceof Set) {
                                        ((bwt) bxcVar2).e((Set) andSet, false);
                                    } else if (andSet instanceof Object[]) {
                                        for (Set set : (Set[]) andSet) {
                                            ((bwt) bxcVar2).e(set, false);
                                        }
                                    } else {
                                        AtomicReference atomicReference = ((bwt) bxcVar2).b;
                                        Objects.toString(atomicReference);
                                        bwp.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                                        throw new armj();
                                    }
                                }
                                ve t = ((bwt) bxcVar2).t();
                                try {
                                    ((bwt) bxcVar2).j.ai(t);
                                } catch (Exception e) {
                                    ((bwt) bxcVar2).n = t;
                                    throw e;
                                }
                            }
                            cay cayVar = new cay();
                            bwkVar2.w = cayVar;
                            caa b3 = bwkVar2.c.b();
                            try {
                                bwkVar2.r = b3;
                                caz cazVar3 = bwkVar2.x;
                                cay cayVar2 = cazVar3.a;
                                try {
                                    cazVar3.a = cayVar;
                                    bwkVar2.ax(0);
                                    caz cazVar4 = bwkVar2.x;
                                    cazVar4.g();
                                    if (cazVar4.b) {
                                        cazVar4.m();
                                        cazVar4.b();
                                    }
                                    cazVar3.a = cayVar2;
                                } catch (Throwable th) {
                                    cazVar3.a = cayVar2;
                                    throw th;
                                }
                            } finally {
                                b3.r();
                            }
                        }
                        bwkVar.b.m(bwkVar2.f);
                    }
                }
                return caaVar.d(i);
            }
            if (caaVar.z(i)) {
                return 1;
            }
            return caaVar.d(i);
        }
        if (cad.r(caaVar.b, i)) {
            int c3 = caaVar.c(i) + i;
            int i12 = 0;
            for (int i13 = i + 1; i13 < c3; i13 += caaVar.c(i13)) {
                boolean z3 = caaVar.z(i13);
                if (z3) {
                    bwkVar.x.i();
                    bwkVar.x.d(caaVar.o(i13));
                }
                if (!z3 && !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z3) {
                    i3 = 0;
                } else {
                    i3 = i2 + i12;
                }
                i12 += an(bwkVar, i13, z2, i3);
                if (z3) {
                    bwkVar.x.i();
                    bwkVar.x.f();
                }
            }
            if (caaVar.z(i)) {
                return 1;
            }
            return i12;
        }
        if (caaVar.z(i)) {
            return 1;
        }
        return caaVar.d(i);
    }

    private final byx ao(int i) {
        byx byxVar;
        if (this.y && this.u) {
            int i2 = this.t.q;
            while (i2 > 0) {
                if (this.t.i(i2) == 202 && d.F(this.t.u(i2), bwp.c)) {
                    Object t = this.t.t(i2);
                    t.getClass();
                    byx byxVar2 = (byx) t;
                    this.v = byxVar2;
                    return byxVar2;
                }
                i2 = this.t.l(i2);
            }
        }
        if (this.r.c > 0) {
            while (i > 0) {
                if (this.r.b(i) == 202 && d.F(this.r.m(i), bwp.c)) {
                    tx txVar = this.A;
                    if (txVar == null || (byxVar = (byx) txVar.a(i)) == null) {
                        Object j = this.r.j(i);
                        j.getClass();
                        byxVar = (byx) j;
                    }
                    this.v = byxVar;
                    return byxVar;
                }
                i = this.r.e(i);
            }
        }
        byx byxVar3 = this.J;
        this.v = byxVar3;
        return byxVar3;
    }

    private final void ap(int i, int i2) {
        if (i > 0 && i != i2) {
            ap(this.r.e(i), i2);
            if (this.r.z(i)) {
                this.x.d(this.r.o(i));
            }
        }
    }

    private final void aq(boolean z) {
        int hashCode;
        int i;
        int rotateRight;
        int i2;
        boolean z2;
        int i3;
        int i4;
        List list;
        List list2;
        HashSet hashSet;
        LinkedHashSet linkedHashSet;
        int i5;
        int i6;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i7;
        Object[] objArr3;
        Object[] objArr4;
        int i8;
        int i9;
        int hashCode2;
        int i10;
        int rotateRight2;
        bwk bwkVar = this;
        int i11 = bwkVar.H.a[r1.b - 2] - 1;
        int i12 = 207;
        if (bwkVar.y) {
            cae caeVar = bwkVar.t;
            int i13 = caeVar.q;
            int i14 = caeVar.i(i13);
            Object u = bwkVar.t.u(i13);
            Object t = bwkVar.t.t(i13);
            if (u == null) {
                if (t != null && i14 == 207) {
                    if (!d.F(t, bwj.a.a)) {
                        rotateRight2 = Integer.rotateRight(i11 ^ bwkVar.z, 3) ^ t.hashCode();
                    }
                } else {
                    i12 = i14;
                }
                rotateRight2 = Integer.rotateRight(i11 ^ bwkVar.z, 3) ^ i12;
            } else {
                if (u instanceof Enum) {
                    hashCode2 = ((Enum) u).ordinal();
                    i10 = bwkVar.z;
                } else {
                    hashCode2 = u.hashCode();
                    i10 = bwkVar.z;
                }
                rotateRight2 = hashCode2 ^ Integer.rotateRight(i10, 3);
            }
            bwkVar.z = Integer.rotateRight(rotateRight2, 3);
        } else {
            caa caaVar = bwkVar.r;
            int i15 = caaVar.g;
            int b2 = caaVar.b(i15);
            Object m = bwkVar.r.m(i15);
            Object j = bwkVar.r.j(i15);
            if (m == null) {
                if (j != null && b2 == 207) {
                    if (!d.F(j, bwj.a.a)) {
                        rotateRight = Integer.rotateRight(i11 ^ bwkVar.z, 3) ^ j.hashCode();
                    }
                } else {
                    i12 = b2;
                }
                rotateRight = Integer.rotateRight(i11 ^ bwkVar.z, 3) ^ i12;
            } else {
                if (m instanceof Enum) {
                    hashCode = ((Enum) m).ordinal();
                    i = bwkVar.z;
                } else {
                    hashCode = m.hashCode();
                    i = bwkVar.z;
                }
                rotateRight = hashCode ^ Integer.rotateRight(i, 3);
            }
            bwkVar.z = Integer.rotateRight(rotateRight, 3);
        }
        int i16 = bwkVar.F;
        byw bywVar = bwkVar.D;
        if (bywVar != null && bywVar.a.size() > 0) {
            List list3 = bywVar.a;
            List list4 = bywVar.d;
            HashSet hashSet2 = new HashSet(list4.size());
            int size = list4.size();
            for (int i17 = 0; i17 < size; i17++) {
                hashSet2.add(list4.get(i17));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int size2 = list4.size();
            int size3 = list3.size();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i18 < size3) {
                bxw bxwVar = (bxw) list3.get(i18);
                if (!hashSet2.contains(bxwVar)) {
                    i18++;
                    bwkVar.x.l(bywVar.a(bxwVar) + bywVar.b, bxwVar.d);
                    bywVar.d(bxwVar.c, 0);
                    bwkVar.x.e(bxwVar.c);
                    bwkVar.r.t(bxwVar.c);
                    av();
                    bwkVar.r.f();
                    List list5 = bwkVar.j;
                    int i21 = bxwVar.c;
                    bwp.l(list5, i21, bwkVar.r.c(i21) + i21);
                } else if (linkedHashSet2.contains(bxwVar)) {
                    i18++;
                } else if (i19 < size2) {
                    bxw bxwVar2 = (bxw) list4.get(i19);
                    if (bxwVar2 != bxwVar) {
                        int a2 = bywVar.a(bxwVar2);
                        linkedHashSet2.add(bxwVar2);
                        if (a2 != i20) {
                            int b3 = bywVar.b(bxwVar2);
                            caz cazVar = bwkVar.x;
                            list2 = list4;
                            int i22 = bywVar.b;
                            hashSet = hashSet2;
                            if (b3 > 0) {
                                int i23 = i20 + i22;
                                int i24 = i22 + a2;
                                linkedHashSet = linkedHashSet2;
                                int i25 = cazVar.h;
                                i5 = size2;
                                if (i25 > 0) {
                                    i6 = size3;
                                    if (cazVar.f == i24 - i25 && cazVar.g == i23 - i25) {
                                        cazVar.h = i25 + b3;
                                    }
                                } else {
                                    i6 = size3;
                                }
                                cazVar.i();
                                cazVar.f = i24;
                                cazVar.g = i23;
                                cazVar.h = b3;
                            } else {
                                linkedHashSet = linkedHashSet2;
                                i5 = size2;
                                i6 = size3;
                            }
                            char c = 7;
                            int i26 = 8;
                            if (a2 > i20) {
                                tx txVar = bywVar.f;
                                Object[] objArr5 = txVar.c;
                                long[] jArr3 = txVar.a;
                                int length = jArr3.length - 2;
                                i4 = i16;
                                if (length >= 0) {
                                    int i27 = 0;
                                    while (true) {
                                        long j2 = jArr3[i27];
                                        list = list3;
                                        long[] jArr4 = jArr3;
                                        if ((((~j2) << c) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i28 = 8 - ((~(i27 - length)) >>> 31);
                                            int i29 = 0;
                                            while (i29 < i28) {
                                                if ((j2 & 255) < 128) {
                                                    bxo bxoVar = (bxo) objArr5[(i27 << 3) + i29];
                                                    int i30 = bxoVar.b;
                                                    objArr4 = objArr5;
                                                    if (a2 <= i30 && i30 < a2 + b3) {
                                                        i9 = (i30 - a2) + i20;
                                                    } else {
                                                        if (i20 <= i30 && i30 < a2) {
                                                            i9 = i30 + b3;
                                                        }
                                                        i8 = 8;
                                                    }
                                                    bxoVar.b = i9;
                                                    i8 = 8;
                                                } else {
                                                    objArr4 = objArr5;
                                                    i8 = i26;
                                                }
                                                j2 >>= i8;
                                                i29++;
                                                i26 = i8;
                                                objArr5 = objArr4;
                                            }
                                            objArr3 = objArr5;
                                            if (i28 != i26) {
                                                break;
                                            }
                                        } else {
                                            objArr3 = objArr5;
                                        }
                                        if (i27 == length) {
                                            break;
                                        }
                                        i27++;
                                        list3 = list;
                                        jArr3 = jArr4;
                                        objArr5 = objArr3;
                                        c = 7;
                                        i26 = 8;
                                    }
                                } else {
                                    list = list3;
                                }
                            } else {
                                i4 = i16;
                                list = list3;
                                if (i20 > a2) {
                                    tx txVar2 = bywVar.f;
                                    Object[] objArr6 = txVar2.c;
                                    long[] jArr5 = txVar2.a;
                                    int length2 = jArr5.length - 2;
                                    if (length2 >= 0) {
                                        int i31 = 0;
                                        while (true) {
                                            long j3 = jArr5[i31];
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                                int i33 = 0;
                                                while (i33 < i32) {
                                                    if ((j3 & 255) < 128) {
                                                        bxo bxoVar2 = (bxo) objArr6[(i31 << 3) + i33];
                                                        jArr2 = jArr5;
                                                        int i34 = bxoVar2.b;
                                                        objArr2 = objArr6;
                                                        if (a2 <= i34 && i34 < a2 + b3) {
                                                            i7 = (i34 - a2) + i20;
                                                        } else if (a2 + 1 <= i34 && i34 < i20) {
                                                            i7 = i34 - b3;
                                                        }
                                                        bxoVar2.b = i7;
                                                    } else {
                                                        jArr2 = jArr5;
                                                        objArr2 = objArr6;
                                                    }
                                                    j3 >>= 8;
                                                    i33++;
                                                    jArr5 = jArr2;
                                                    objArr6 = objArr2;
                                                }
                                                jArr = jArr5;
                                                objArr = objArr6;
                                                if (i32 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr = jArr5;
                                                objArr = objArr6;
                                            }
                                            if (i31 == length2) {
                                                break;
                                            }
                                            i31++;
                                            jArr5 = jArr;
                                            objArr6 = objArr;
                                        }
                                    }
                                }
                            }
                        } else {
                            i4 = i16;
                            list = list3;
                            list2 = list4;
                            hashSet = hashSet2;
                            linkedHashSet = linkedHashSet2;
                            i5 = size2;
                            i6 = size3;
                        }
                    } else {
                        i4 = i16;
                        list = list3;
                        list2 = list4;
                        hashSet = hashSet2;
                        linkedHashSet = linkedHashSet2;
                        i5 = size2;
                        i6 = size3;
                        i18++;
                    }
                    i19++;
                    i20 += bywVar.b(bxwVar2);
                    bwkVar = this;
                    list4 = list2;
                    hashSet2 = hashSet;
                    linkedHashSet2 = linkedHashSet;
                    size2 = i5;
                    size3 = i6;
                    i16 = i4;
                    list3 = list;
                } else {
                    bwkVar = this;
                }
            }
            i2 = i16;
            bwkVar.x.i();
            if (list3.size() > 0) {
                bwkVar.x.e(bwkVar.r.f);
                bwkVar.r.u();
            }
        } else {
            i2 = i16;
        }
        boolean z3 = bwkVar.y;
        if (!z3) {
            caa caaVar2 = bwkVar.r;
            int i35 = caaVar2.j - caaVar2.i;
            if (i35 > 0) {
                caz cazVar2 = bwkVar.x;
                cazVar2.h();
                cbf cbfVar = cazVar2.a.a;
                cbb.ac acVar = cbb.ac.a;
                cbfVar.e(acVar);
                cbf.b.a(cbfVar, 0, i35);
                if (cbfVar.g != cbf.h(acVar.b) || cbfVar.h != cbf.h(acVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i36 = acVar.b;
                    int i37 = 0;
                    for (int i38 = 0; i38 < i36; i38++) {
                        if (((1 << i38) & cbfVar.g) != 0) {
                            if (i37 > 0) {
                                sb.append(", ");
                            }
                            sb.append(acVar.a(i38));
                            i37++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i39 = acVar.c;
                    int i40 = 0;
                    for (int i41 = 0; i41 < i39; i41++) {
                        if (((1 << i41) & cbfVar.h) != 0) {
                            if (i37 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(acVar.c(i41));
                            i40++;
                        }
                    }
                    byy.b(defpackage.a.cm(new StringBuilder(), sb3.toString(), i40, sb2, i37, acVar));
                }
            }
        }
        int i42 = bwkVar.E;
        while (!bwkVar.r.y()) {
            int i43 = bwkVar.r.e;
            av();
            bwkVar.x.l(i42, bwkVar.r.f());
            bwp.l(bwkVar.j, i43, bwkVar.r.e);
        }
        if (z3) {
            if (z) {
                cba cbaVar = bwkVar.O;
                if (!cbaVar.b.g()) {
                    bwp.i("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                cbf cbfVar2 = cbaVar.b;
                cbf cbfVar3 = cbaVar.a;
                if (!cbfVar2.f()) {
                    cbb[] cbbVarArr = cbfVar2.a;
                    int i44 = cbfVar2.b - 1;
                    cbfVar2.b = i44;
                    cbb cbbVar = cbbVarArr[i44];
                    cbbVar.getClass();
                    cbbVarArr[i44] = null;
                    cbfVar3.e(cbbVar);
                    int i45 = cbfVar2.f;
                    int i46 = cbfVar3.f;
                    for (int i47 = 0; i47 < cbbVar.c; i47++) {
                        i46--;
                        i45--;
                        Object[] objArr7 = cbfVar3.e;
                        Object[] objArr8 = cbfVar2.e;
                        objArr7[i46] = objArr8[i45];
                        objArr8[i45] = null;
                    }
                    int i48 = cbfVar2.d;
                    int i49 = cbfVar3.d;
                    int i50 = cbbVar.b;
                    for (int i51 = 0; i51 < i50; i51++) {
                        i49--;
                        i48--;
                        int[] iArr = cbfVar3.c;
                        int[] iArr2 = cbfVar2.c;
                        iArr[i49] = iArr2[i48];
                        iArr2[i48] = 0;
                    }
                    cbfVar2.f -= cbbVar.c;
                    cbfVar2.d -= cbbVar.b;
                    i3 = 1;
                } else {
                    throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                }
            } else {
                i3 = i2;
            }
            if (bwkVar.r.h <= 0) {
                byy.a("Unbalanced begin/end empty");
            }
            r5.h--;
            cae caeVar2 = bwkVar.t;
            int i52 = caeVar2.q;
            caeVar2.W();
            if (!bwkVar.r.w()) {
                int aF = aF(i52);
                bwkVar.t.A();
                bwkVar.t.z(true);
                bwa bwaVar = bwkVar.N;
                cba cbaVar2 = bwkVar.O;
                if (cbaVar2.a.f()) {
                    caz cazVar3 = bwkVar.x;
                    cab cabVar = bwkVar.s;
                    cazVar3.g();
                    cazVar3.h();
                    cazVar3.i();
                    cbf cbfVar4 = cazVar3.a.a;
                    cbb.p pVar = cbb.p.a;
                    cbfVar4.e(pVar);
                    cbf.b.b(cbfVar4, 0, bwaVar);
                    cbf.b.b(cbfVar4, 1, cabVar);
                    if (cbfVar4.g != cbf.h(pVar.b) || cbfVar4.h != cbf.h(pVar.c)) {
                        StringBuilder sb4 = new StringBuilder();
                        int i53 = pVar.b;
                        int i54 = 0;
                        for (int i55 = 0; i55 < i53; i55++) {
                            if (((1 << i55) & cbfVar4.g) != 0) {
                                if (i54 > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(pVar.a(i55));
                                i54++;
                            }
                        }
                        String sb5 = sb4.toString();
                        StringBuilder sb6 = new StringBuilder();
                        int i56 = pVar.c;
                        int i57 = 0;
                        for (int i58 = 0; i58 < i56; i58++) {
                            if (((1 << i58) & cbfVar4.h) != 0) {
                                if (i54 > 0) {
                                    sb6.append(", ");
                                }
                                sb6.append(pVar.c(i58));
                                i57++;
                            }
                        }
                        byy.b(defpackage.a.cm(new StringBuilder(), sb6.toString(), i57, sb5, i54, pVar));
                    }
                } else {
                    caz cazVar4 = bwkVar.x;
                    cab cabVar2 = bwkVar.s;
                    cazVar4.g();
                    cazVar4.h();
                    cazVar4.i();
                    cbf cbfVar5 = cazVar4.a.a;
                    cbb.q qVar = cbb.q.a;
                    cbfVar5.e(qVar);
                    cbf.b.b(cbfVar5, 0, bwaVar);
                    cbf.b.b(cbfVar5, 1, cabVar2);
                    cbf.b.b(cbfVar5, 2, cbaVar2);
                    if (cbfVar5.g != cbf.h(qVar.b) || cbfVar5.h != cbf.h(qVar.c)) {
                        StringBuilder sb7 = new StringBuilder();
                        int i59 = qVar.b;
                        int i60 = 0;
                        for (int i61 = 0; i61 < i59; i61++) {
                            if (((1 << i61) & cbfVar5.g) != 0) {
                                if (i60 > 0) {
                                    sb7.append(", ");
                                }
                                sb7.append(qVar.a(i61));
                                i60++;
                            }
                        }
                        String sb8 = sb7.toString();
                        StringBuilder sb9 = new StringBuilder();
                        int i62 = qVar.c;
                        int i63 = 0;
                        for (int i64 = 0; i64 < i62; i64++) {
                            if (((1 << i64) & cbfVar5.h) != 0) {
                                if (i60 > 0) {
                                    sb9.append(", ");
                                }
                                sb9.append(qVar.c(i64));
                                i63++;
                            }
                        }
                        byy.b(defpackage.a.cm(new StringBuilder(), sb9.toString(), i63, sb8, i60, qVar));
                    }
                    bwkVar.O = new cba();
                }
                bwkVar.y = false;
                if (bwkVar.c.b != 0) {
                    bwkVar.ae(aF, 0);
                    bwkVar.aB(aF, i3);
                }
            }
        } else {
            if (z) {
                bwkVar.x.f();
                z2 = true;
            } else {
                z2 = false;
            }
            caz cazVar5 = bwkVar.x;
            int i65 = cazVar5.a().g;
            if (cazVar5.c.b(-1) > i65) {
                bwp.i("Missed recording an endGroup");
            }
            if (cazVar5.c.b(-1) == i65) {
                caz.n(cazVar5);
                cazVar5.c.c();
                cazVar5.a.c();
            }
            int i66 = bwkVar.r.g;
            int i67 = i2;
            if (i67 != bwkVar.O(i66)) {
                bwkVar.aB(i66, i67);
            }
            if (true == z2) {
                i67 = 1;
            }
            bwkVar.r.s();
            bwkVar.x.i();
            i3 = i67;
        }
        byw bywVar2 = (byw) car.a(bwkVar.C);
        if (bywVar2 != null && !z3) {
            bywVar2.c++;
        }
        bwkVar.D = bywVar2;
        bwkVar.E = bwkVar.H.c() + i3;
        bwkVar.G = bwkVar.H.c();
        bwkVar.F = bwkVar.H.c() + i3;
    }

    private final void ar() {
        if (this.t.r) {
            cae c = this.s.c();
            this.t = c;
            c.J();
            this.u = false;
            this.v = null;
        }
    }

    private final void as(boolean z, byw bywVar) {
        this.C.add(this.D);
        this.D = bywVar;
        this.H.e(this.F);
        this.H.e(this.G);
        this.H.e(this.E);
        if (z) {
            this.E = 0;
        }
        this.F = 0;
        this.G = 0;
    }

    private final void at() {
        cab cabVar = new cab();
        if (this.p) {
            cabVar.e();
        }
        if (this.b.q()) {
            cabVar.d();
        }
        this.s = cabVar;
        cae c = cabVar.c();
        c.z(true);
        this.t = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0058, code lost:
    
        if (defpackage.bzf.p((defpackage.bxe) r13, r15) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void au() {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwk.au():void");
    }

    private final void av() {
        ax(this.r.e);
        caz cazVar = this.x;
        cazVar.h();
        cazVar.a.a.d(cbb.w.a);
        int i = cazVar.e;
        caa a2 = cazVar.a();
        cazVar.e = i + cad.c(a2.b, a2.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aw(int r7, int r8, int r9) {
        /*
            r6 = this;
            caa r0 = r6.r
            if (r7 != r8) goto L5
            goto L17
        L5:
            if (r7 == r9) goto L55
            if (r8 == r9) goto L55
            int r1 = r0.e(r7)
            if (r1 != r8) goto L11
            r9 = r8
            goto L55
        L11:
            int r1 = r0.e(r8)
            if (r1 != r7) goto L19
        L17:
            r9 = r7
            goto L55
        L19:
            int r1 = r0.e(r7)
            int r2 = r0.e(r8)
            if (r1 != r2) goto L28
            int r9 = r0.e(r7)
            goto L55
        L28:
            int r1 = defpackage.bwp.b(r0, r7, r9)
            int r9 = defpackage.bwp.b(r0, r8, r9)
            int r2 = r1 - r9
            r3 = 0
            r5 = r7
            r4 = r3
        L35:
            if (r4 >= r2) goto L3e
            int r5 = r0.e(r5)
            int r4 = r4 + 1
            goto L35
        L3e:
            int r9 = r9 - r1
            r1 = r8
        L40:
            if (r3 >= r9) goto L49
            int r1 = r0.e(r1)
            int r3 = r3 + 1
            goto L40
        L49:
            if (r5 == r1) goto L54
            int r5 = r0.e(r5)
            int r1 = r0.e(r1)
            goto L49
        L54:
            r9 = r5
        L55:
            if (r7 <= 0) goto L69
            if (r7 == r9) goto L69
            boolean r1 = r0.z(r7)
            if (r1 == 0) goto L64
            caz r1 = r6.x
            r1.f()
        L64:
            int r7 = r0.e(r7)
            goto L55
        L69:
            r6.ap(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwk.aw(int, int, int):void");
    }

    private final void ax(int i) {
        an(this, i, false, 0);
        this.x.i();
    }

    private final void ay() {
        int i;
        caa caaVar = this.r;
        int i2 = caaVar.g;
        if (i2 >= 0) {
            i = cad.f(caaVar.b, i2);
        } else {
            i = 0;
        }
        this.F = i;
        this.r.u();
    }

    private final void az(int i) {
        ab(i, null, 0, null);
    }

    @Override // defpackage.bwj
    public final void A() {
        ab(125, null, 2, null);
        this.i = true;
    }

    @Override // defpackage.bwj
    public final void B(Object obj) {
        ad(obj);
    }

    @Override // defpackage.bwj
    public final void C() {
        aD();
        if (this.y) {
            bwp.i("useNode() called while inserting");
        }
        caa caaVar = this.r;
        Object o = caaVar.o(caaVar.g);
        this.x.d(o);
        if (this.m && (o instanceof bwh)) {
            caz cazVar = this.x;
            cazVar.g();
            cazVar.a.a.d(cbb.ai.a);
        }
    }

    @Override // defpackage.bwj
    public final boolean D(float f) {
        Object S = S();
        if ((S instanceof Float) && f == ((Number) S).floatValue()) {
            return false;
        }
        af(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.bwj
    public final boolean E(int i) {
        Object S = S();
        if ((S instanceof Integer) && i == ((Number) S).intValue()) {
            return false;
        }
        af(Integer.valueOf(i));
        return true;
    }

    @Override // defpackage.bwj
    public final boolean F(long j) {
        Object S = S();
        if ((S instanceof Long) && j == ((Number) S).longValue()) {
            return false;
        }
        af(Long.valueOf(j));
        return true;
    }

    @Override // defpackage.bwj
    public final boolean G(Object obj) {
        if (!d.F(S(), obj)) {
            af(obj);
            return true;
        }
        return false;
    }

    @Override // defpackage.bwj
    public final boolean H(boolean z) {
        Object S = S();
        if ((S instanceof Boolean) && z == ((Boolean) S).booleanValue()) {
            return false;
        }
        af(Boolean.valueOf(z));
        return true;
    }

    @Override // defpackage.bwj
    public final boolean I(Object obj) {
        if (S() != obj) {
            af(obj);
            return true;
        }
        return false;
    }

    @Override // defpackage.bwj
    public final boolean J() {
        if (!L() || this.k) {
            return true;
        }
        bzf R = R();
        if (R != null && (R.a & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bwj
    public final boolean K() {
        return this.y;
    }

    @Override // defpackage.bwj
    public final boolean L() {
        bzf R;
        if (!this.y && !this.m && !this.k && (R = R()) != null && (R.a & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bwj
    public final void M(Object obj) {
        if (!this.y && this.r.a() == 207 && !d.F(this.r.h(), obj) && this.n < 0) {
            this.n = this.r.e;
            this.m = true;
        }
        ab(207, null, 0, obj);
    }

    public final int O(int i) {
        int i2;
        if (i < 0) {
            tt ttVar = this.P;
            if (ttVar == null || ttVar.a(i) < 0) {
                return 0;
            }
            return ttVar.b(i);
        }
        int[] iArr = this.g;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.r.d(i);
    }

    public final byx P() {
        byx byxVar = this.v;
        if (byxVar != null) {
            return byxVar;
        }
        return ao(this.r.g);
    }

    public final byx Q(byx byxVar, byx byxVar2) {
        byx.a c = byxVar.c();
        c.putAll(byxVar2);
        cdm b2 = ((cdm.a) c).b();
        ac(204, bwp.d);
        aC(b2);
        aC(byxVar2);
        Y();
        return b2;
    }

    public final bzf R() {
        if (this.o == 0) {
            ArrayList arrayList = this.M;
            if (car.b(arrayList)) {
                return (bzf) arrayList.get(arrayList.size() - 1);
            }
            return null;
        }
        return null;
    }

    public final Object S() {
        if (this.y) {
            aE();
            return bwj.a.a;
        }
        Object n = this.r.n();
        if (this.m && !(n instanceof bzx)) {
            return bwj.a.a;
        }
        return n;
    }

    public final Object T() {
        if (this.y) {
            aE();
            return bwj.a.a;
        }
        Object n = this.r.n();
        if (this.m && !(n instanceof bzx)) {
            return bwj.a.a;
        }
        if (n instanceof bzu) {
            return ((bzu) n).a;
        }
        return n;
    }

    public final void U() {
        V();
        this.C.clear();
        this.H.d();
        this.I.d();
        this.l.d();
        this.A = null;
        cba cbaVar = this.O;
        cbaVar.b.b();
        cbaVar.a.b();
        this.z = 0;
        this.o = 0;
        this.i = false;
        this.y = false;
        this.m = false;
        this.q = false;
        this.n = -1;
        caa caaVar = this.r;
        if (!caaVar.d) {
            caaVar.r();
        }
        if (!this.t.r) {
            at();
        }
    }

    public final void V() {
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.z = 0;
        this.i = false;
        caz cazVar = this.x;
        cazVar.b = false;
        cazVar.c.d();
        cazVar.e = 0;
        this.M.clear();
        this.g = null;
        this.P = null;
    }

    public final void W() {
        bwp.m(this.t.r);
        at();
    }

    public final void X() {
        this.M.clear();
        this.j.clear();
        this.d.a();
        this.A = null;
    }

    public final void Y() {
        aq(false);
    }

    public final void Z(byx byxVar) {
        tx txVar = this.A;
        if (txVar == null) {
            txVar = new tx((byte[]) null);
            this.A = txVar;
        }
        txVar.f(this.r.e, byxVar);
    }

    @Override // defpackage.bwj
    public final int a() {
        return this.z;
    }

    public final void aa() {
        this.F += this.r.f();
    }

    public final void ab(int i, Object obj, int i2, Object obj2) {
        int hashCode;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        byw bywVar;
        Object valueOf;
        int i5;
        int i6;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        Object[] objArr3;
        int i7;
        Object[] objArr4;
        int i8;
        int f;
        int i9;
        int rotateLeft;
        Object obj3 = obj;
        aE();
        int i10 = this.G;
        if (obj3 == null) {
            if (obj2 != null) {
                i4 = 207;
                i9 = i;
                if (i9 == 207) {
                    if (!d.F(obj2, bwj.a.a)) {
                        rotateLeft = obj2.hashCode() ^ Integer.rotateLeft(this.z, 3);
                        this.z = i10 ^ Integer.rotateLeft(rotateLeft, 3);
                    }
                    rotateLeft = Integer.rotateLeft(this.z, 3) ^ i4;
                    this.z = i10 ^ Integer.rotateLeft(rotateLeft, 3);
                }
            } else {
                i9 = i;
            }
            i4 = i9;
            rotateLeft = Integer.rotateLeft(this.z, 3) ^ i4;
            this.z = i10 ^ Integer.rotateLeft(rotateLeft, 3);
        } else {
            if (obj3 instanceof Enum) {
                hashCode = ((Enum) obj3).ordinal();
                i3 = this.z;
            } else {
                hashCode = obj.hashCode();
                i3 = this.z;
            }
            this.z = Integer.rotateLeft(hashCode ^ Integer.rotateLeft(i3, 3), 3);
            i4 = i;
        }
        boolean z3 = true;
        if (obj3 == null) {
            this.G++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.y) {
            this.r.q();
            cae caeVar = this.t;
            int i11 = caeVar.o;
            if (z) {
                caeVar.N(i4, bwj.a.a);
            } else {
                if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = bwj.a.a;
                    }
                    caeVar.K(i4, obj3, obj2);
                } else {
                    if (obj3 == null) {
                        obj3 = bwj.a.a;
                    }
                    caeVar.M(i4, obj3);
                }
                z3 = false;
            }
            byw bywVar2 = this.D;
            if (bywVar2 != null) {
                bxw bxwVar = new bxw(i4, -1, aF(i11), -1);
                bywVar2.c(bxwVar, this.E - bywVar2.b);
                bywVar2.e(bxwVar);
            }
            as(z3, null);
            return;
        }
        if (i2 != 1 || !this.m) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.D == null) {
            int a2 = this.r.a();
            if (!z2 && a2 == i4 && d.F(obj3, this.r.i())) {
                aA(z, obj2);
            } else {
                caa caaVar = this.r;
                ArrayList arrayList = new ArrayList();
                if (caaVar.h <= 0) {
                    for (int i12 = caaVar.e; i12 < caaVar.f; i12 += cad.c(caaVar.b, i12)) {
                        int d = cad.d(caaVar.b, i12);
                        Object p = caaVar.p(caaVar.b, i12);
                        if (cad.v(caaVar.b, i12)) {
                            f = 1;
                        } else {
                            f = cad.f(caaVar.b, i12);
                        }
                        arrayList.add(new bxw(d, p, i12, f));
                    }
                }
                this.D = new byw(arrayList, this.E);
            }
        }
        byw bywVar3 = this.D;
        if (bywVar3 != null) {
            if (obj3 != null) {
                valueOf = new bxv(Integer.valueOf(i4), obj3);
            } else {
                valueOf = Integer.valueOf(i4);
            }
            ve veVar = ((bym) bywVar3.e.a()).a;
            Object a3 = veVar.a(valueOf);
            if (a3 != null) {
                if (arsd.e(a3)) {
                    List b2 = arsd.b(a3);
                    Object remove = b2.remove(0);
                    if (b2.isEmpty()) {
                        veVar.g(valueOf);
                    }
                    a3 = remove;
                } else {
                    veVar.g(valueOf);
                }
                a3.getClass();
            } else {
                a3 = null;
            }
            bxw bxwVar2 = (bxw) a3;
            if (!z2 && bxwVar2 != null) {
                bywVar3.e(bxwVar2);
                this.E = bywVar3.a(bxwVar2) + bywVar3.b;
                bxo bxoVar = (bxo) bywVar3.f.a(bxwVar2.c);
                if (bxoVar != null) {
                    i6 = bxoVar.a;
                } else {
                    i6 = -1;
                }
                int i13 = bywVar3.c;
                int i14 = i6 - i13;
                char c = 7;
                if (i6 > i13) {
                    tx txVar = bywVar3.f;
                    Object[] objArr5 = txVar.c;
                    long[] jArr3 = txVar.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j = jArr3[i15];
                            int i16 = i6;
                            if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i15 - length)) >>> 31);
                                int i18 = 0;
                                while (i18 < i17) {
                                    if ((j & 255) < 128) {
                                        bxo bxoVar2 = (bxo) objArr5[(i15 << 3) + i18];
                                        int i19 = bxoVar2.a;
                                        objArr4 = objArr5;
                                        i8 = i16;
                                        if (i19 == i8) {
                                            bxoVar2.a = i13;
                                        } else if (i13 <= i19 && i19 < i8) {
                                            bxoVar2.a = i19 + 1;
                                        }
                                    } else {
                                        objArr4 = objArr5;
                                        i8 = i16;
                                    }
                                    j >>= 8;
                                    i18++;
                                    i16 = i8;
                                    objArr5 = objArr4;
                                }
                                objArr3 = objArr5;
                                i7 = i16;
                                if (i17 != 8) {
                                    break;
                                }
                            } else {
                                objArr3 = objArr5;
                                i7 = i16;
                            }
                            if (i15 == length) {
                                break;
                            }
                            i15++;
                            i6 = i7;
                            objArr5 = objArr3;
                            c = 7;
                        }
                    }
                } else {
                    int i20 = i6;
                    if (i13 > i20) {
                        tx txVar2 = bywVar3.f;
                        Object[] objArr6 = txVar2.c;
                        long[] jArr4 = txVar2.a;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i21 = 0;
                            while (true) {
                                long j2 = jArr4[i21];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        if ((j2 & 255) < 128) {
                                            bxo bxoVar3 = (bxo) objArr6[(i21 << 3) + i23];
                                            jArr2 = jArr4;
                                            int i24 = bxoVar3.a;
                                            if (i24 == i20) {
                                                bxoVar3.a = i13;
                                            } else {
                                                objArr2 = objArr6;
                                                if (i20 + 1 <= i24 && i24 < i13) {
                                                    bxoVar3.a = i24 - 1;
                                                }
                                                j2 >>= 8;
                                                i23++;
                                                jArr4 = jArr2;
                                                objArr6 = objArr2;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                        }
                                        objArr2 = objArr6;
                                        j2 >>= 8;
                                        i23++;
                                        jArr4 = jArr2;
                                        objArr6 = objArr2;
                                    }
                                    jArr = jArr4;
                                    objArr = objArr6;
                                    if (i22 != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr4;
                                    objArr = objArr6;
                                }
                                if (i21 == length2) {
                                    break;
                                }
                                i21++;
                                jArr4 = jArr;
                                objArr6 = objArr;
                            }
                        }
                    }
                }
                int i25 = bxwVar2.c;
                this.x.e(i25);
                this.r.t(i25);
                if (i14 > 0) {
                    caz cazVar = this.x;
                    cazVar.h();
                    cbf cbfVar = cazVar.a.a;
                    cbb.r rVar = cbb.r.a;
                    cbfVar.e(rVar);
                    cbf.b.a(cbfVar, 0, i14);
                    if (cbfVar.g != cbf.h(rVar.b) || cbfVar.h != cbf.h(rVar.c)) {
                        StringBuilder sb = new StringBuilder();
                        int i26 = rVar.b;
                        int i27 = 0;
                        for (int i28 = 0; i28 < i26; i28++) {
                            if ((cbfVar.g & (1 << i28)) != 0) {
                                if (i27 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(rVar.a(i28));
                                i27++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder();
                        int i29 = rVar.c;
                        int i30 = 0;
                        for (int i31 = 0; i31 < i29; i31++) {
                            if ((cbfVar.h & (1 << i31)) != 0) {
                                if (i27 > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(rVar.c(i31));
                                i30++;
                            }
                        }
                        byy.b(defpackage.a.cm(new StringBuilder(), sb3.toString(), i30, sb2, i27, rVar));
                    }
                }
                aA(z, obj2);
                bywVar = null;
            } else {
                this.r.q();
                boolean z4 = true;
                this.y = true;
                this.v = null;
                ar();
                this.t.y();
                cae caeVar2 = this.t;
                int i32 = caeVar2.o;
                if (z) {
                    caeVar2.N(i4, bwj.a.a);
                } else {
                    if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = bwj.a.a;
                        }
                        caeVar2.K(i4, obj3, obj2);
                    } else {
                        if (obj3 == null) {
                            obj3 = bwj.a.a;
                        }
                        caeVar2.M(i4, obj3);
                    }
                    z4 = false;
                }
                this.N = this.t.q(i32);
                bxw bxwVar3 = new bxw(i4, -1, aF(i32), -1);
                bywVar3.c(bxwVar3, this.E - bywVar3.b);
                bywVar3.e(bxwVar3);
                ArrayList arrayList2 = new ArrayList();
                if (z4) {
                    i5 = 0;
                } else {
                    i5 = this.E;
                }
                bywVar = new byw(arrayList2, i5);
                z = z4;
            }
        } else {
            bywVar = null;
        }
        as(z, bywVar);
    }

    public final void ac(int i, Object obj) {
        ab(i, obj, 0, null);
    }

    public final void ad(Object obj) {
        int i;
        caa caaVar;
        int i2;
        cae caeVar;
        if (obj instanceof bzt) {
            if (this.y) {
                cbf cbfVar = this.x.a.a;
                cbb.v vVar = cbb.v.a;
                cbfVar.e(vVar);
                cbf.b.b(cbfVar, 0, (bzt) obj);
                if (cbfVar.g != cbf.h(vVar.b) || cbfVar.h != cbf.h(vVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i3 = vVar.b;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (((1 << i5) & cbfVar.g) != 0) {
                            if (i4 > 0) {
                                sb.append(", ");
                            }
                            sb.append(vVar.a(i5));
                            i4++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i6 = vVar.c;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        if (((1 << i8) & cbfVar.h) != 0) {
                            if (i4 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(vVar.c(i8));
                            i7++;
                        }
                    }
                    byy.b(defpackage.a.cm(new StringBuilder(), sb3.toString(), i7, sb2, i4, vVar));
                }
            }
            this.B.add(obj);
            bzt bztVar = (bzt) obj;
            bwa bwaVar = null;
            if (this.y) {
                cae caeVar2 = this.t;
                int i9 = caeVar2.o;
                if (i9 > caeVar2.q + 1) {
                    int i10 = i9 - 1;
                    int l = caeVar2.l(i10);
                    while (true) {
                        i2 = i10;
                        i10 = l;
                        caeVar = this.t;
                        if (i10 == caeVar.q || i10 < 0) {
                            break;
                        } else {
                            l = caeVar.l(i10);
                        }
                    }
                    bwaVar = caeVar.q(i2);
                }
            } else {
                caa caaVar2 = this.r;
                int i11 = caaVar2.e;
                if (i11 > caaVar2.g + 1) {
                    int i12 = i11 - 1;
                    int e = caaVar2.e(i12);
                    while (true) {
                        i = i12;
                        i12 = e;
                        caaVar = this.r;
                        if (i12 == caaVar.g || i12 < 0) {
                            break;
                        } else {
                            e = caaVar.e(i12);
                        }
                    }
                    bwaVar = caaVar.g(i);
                }
            }
            obj = new bzu(bztVar, bwaVar);
        }
        af(obj);
    }

    public final void ae(int i, int i2) {
        if (O(i) != i2) {
            if (i < 0) {
                tt ttVar = this.P;
                if (ttVar == null) {
                    ttVar = new tt(null);
                    this.P = ttVar;
                }
                ttVar.d(i, i2);
                return;
            }
            int[] iArr = this.g;
            if (iArr == null) {
                iArr = new int[this.r.c];
                aqil.C(iArr, -1, iArr.length);
                this.g = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void af(Object obj) {
        if (this.y) {
            this.t.Z(obj);
            return;
        }
        caa caaVar = this.r;
        int i = 0;
        if (caaVar.k) {
            int j = caaVar.i - cad.j(caaVar.b, caaVar.g);
            caz cazVar = this.x;
            int i2 = j - 1;
            if (cazVar.a().g - cazVar.e < 0) {
                caz cazVar2 = this.x;
                caa caaVar2 = this.r;
                bwa g = caaVar2.g(caaVar2.g);
                cbf cbfVar = cazVar2.a.a;
                cbb.ad adVar = cbb.ad.a;
                cbfVar.e(adVar);
                cbf.b.b(cbfVar, 0, obj);
                cbf.b.b(cbfVar, 1, g);
                cbf.b.a(cbfVar, 0, i2);
                if (cbfVar.g != cbf.h(adVar.b) || cbfVar.h != cbf.h(adVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i3 = adVar.b;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (((1 << i5) & cbfVar.g) != 0) {
                            if (i4 > 0) {
                                sb.append(", ");
                            }
                            sb.append(adVar.a(i5));
                            i4++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i6 = adVar.c;
                    int i7 = 0;
                    while (i < i6) {
                        if (((1 << i) & cbfVar.h) != 0) {
                            if (i4 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(adVar.c(i));
                            i7++;
                        }
                        i++;
                    }
                    byy.b(defpackage.a.cm(new StringBuilder(), sb3.toString(), i7, sb2, i4, adVar));
                    return;
                }
                return;
            }
            caz cazVar3 = this.x;
            cazVar3.j(true);
            cbf cbfVar2 = cazVar3.a.a;
            cbb.ag agVar = cbb.ag.a;
            cbfVar2.e(agVar);
            cbf.b.b(cbfVar2, 0, obj);
            cbf.b.a(cbfVar2, 0, i2);
            if (cbfVar2.g != cbf.h(agVar.b) || cbfVar2.h != cbf.h(agVar.c)) {
                StringBuilder sb4 = new StringBuilder();
                int i8 = agVar.b;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    if (((1 << i10) & cbfVar2.g) != 0) {
                        if (i9 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(agVar.a(i10));
                        i9++;
                    }
                }
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                int i11 = agVar.c;
                int i12 = 0;
                while (i < i11) {
                    if (((1 << i) & cbfVar2.h) != 0) {
                        if (i9 > 0) {
                            sb6.append(", ");
                        }
                        sb6.append(agVar.c(i));
                        i12++;
                    }
                    i++;
                }
                byy.b(defpackage.a.cm(new StringBuilder(), sb6.toString(), i12, sb5, i9, agVar));
                return;
            }
            return;
        }
        caz cazVar4 = this.x;
        bwa g2 = caaVar.g(caaVar.g);
        cbf cbfVar3 = cazVar4.a.a;
        cbb.b bVar = cbb.b.a;
        cbfVar3.e(bVar);
        cbf.b.b(cbfVar3, 0, g2);
        cbf.b.b(cbfVar3, 1, obj);
        if (cbfVar3.g == cbf.h(bVar.b) && cbfVar3.h == cbf.h(bVar.c)) {
            return;
        }
        StringBuilder sb7 = new StringBuilder();
        int i13 = bVar.b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            if (((1 << i15) & cbfVar3.g) != 0) {
                if (i14 > 0) {
                    sb7.append(", ");
                }
                sb7.append(bVar.a(i15));
                i14++;
            }
        }
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder();
        int i16 = bVar.c;
        int i17 = 0;
        while (i < i16) {
            if (((1 << i) & cbfVar3.h) != 0) {
                if (i14 > 0) {
                    sb9.append(", ");
                }
                sb9.append(bVar.c(i));
                i17++;
            }
            i++;
        }
        byy.b(defpackage.a.cm(new StringBuilder(), sb9.toString(), i17, sb8, i14, bVar));
    }

    public final boolean ag(bzf bzfVar, Object obj) {
        bwa bwaVar = bzfVar.c;
        if (bwaVar == null) {
            return false;
        }
        int a2 = this.r.a.a(bwaVar);
        if (!this.q || a2 < this.r.e) {
            return false;
        }
        List list = this.j;
        int d = bwp.d(list, a2);
        if (d < 0) {
            int i = d + 1;
            if (true != (obj instanceof bxe)) {
                obj = null;
            }
            list.add(-i, new bxt(bzfVar, a2, obj));
        } else {
            bxt bxtVar = (bxt) list.get(d);
            if (obj instanceof bxe) {
                Object obj2 = bxtVar.c;
                if (obj2 == null) {
                    bxtVar.c = obj;
                } else if (obj2 instanceof vh) {
                    ((vh) obj2).j(obj);
                } else {
                    vh vhVar = new vh(2);
                    vhVar.h(obj2);
                    vhVar.h(obj);
                    bxtVar.c = vhVar;
                }
            } else {
                bxtVar.c = null;
            }
        }
        return true;
    }

    public final void ah(ve veVar, arqv arqvVar) {
        int rotateLeft;
        int rotateRight;
        if (this.q) {
            bwp.i("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.K = cex.b().v();
            this.A = null;
            ai(veVar);
            this.E = 0;
            this.q = true;
            try {
                this.G = 0;
                this.r = this.c.b();
                az(100);
                this.b.n();
                this.J = this.b.c();
                this.l.e(bwp.a(this.k));
                this.k = G(this.J);
                this.v = null;
                if (!this.h) {
                    this.h = this.b.r();
                }
                if (!this.p) {
                    this.p = this.b.s();
                }
                Set set = (Set) bwz.b(this.J, cfn.a);
                if (set != null) {
                    set.add(this.c);
                    this.b.k(set);
                }
                az(this.b.a());
                Object S = S();
                if (S != arqvVar && arqvVar != null) {
                    af(arqvVar);
                }
                AnonymousClass1 anonymousClass1 = this.L;
                cbh a2 = cal.a();
                try {
                    a2.n(anonymousClass1);
                    if (arqvVar != null) {
                        ac(BasePaymentResult.ERROR_REQUEST_FAILED, bwp.a);
                        cdv.a(this, arqvVar);
                        Y();
                    } else if (this.k && S != null && !d.F(S, bwj.a.a)) {
                        ac(BasePaymentResult.ERROR_REQUEST_FAILED, bwp.a);
                        arsd.g(S, 2);
                        cdv.a(this, (arqv) S);
                        Y();
                    } else if (this.j.isEmpty()) {
                        aa();
                    } else {
                        caa caaVar = this.r;
                        int a3 = caaVar.a();
                        Object i = caaVar.i();
                        Object h = caaVar.h();
                        int i2 = this.G;
                        int i3 = 207;
                        if (i == null) {
                            if (h != null && a3 == 207) {
                                if (!d.F(h, bwj.a.a)) {
                                    this.z = Integer.rotateLeft(h.hashCode() ^ Integer.rotateLeft(this.z, 3), 3) ^ i2;
                                    a3 = 207;
                                } else {
                                    a3 = 207;
                                }
                            }
                            this.z = Integer.rotateLeft(Integer.rotateLeft(this.z, 3) ^ a3, 3) ^ i2;
                        } else {
                            if (i instanceof Enum) {
                                rotateLeft = Integer.rotateLeft(((Enum) i).ordinal() ^ Integer.rotateLeft(this.z, 3), 3);
                            } else {
                                rotateLeft = Integer.rotateLeft(i.hashCode() ^ Integer.rotateLeft(this.z, 3), 3);
                            }
                            this.z = rotateLeft;
                        }
                        aA(cad.v(caaVar.b, caaVar.e), null);
                        au();
                        caaVar.s();
                        if (i == null) {
                            if (h != null && a3 == 207) {
                                if (!d.F(h, bwj.a.a)) {
                                    rotateRight = Integer.rotateRight(h.hashCode() ^ Integer.rotateRight(this.z ^ i2, 3), 3);
                                }
                            } else {
                                i3 = a3;
                            }
                            rotateRight = Integer.rotateRight(Integer.rotateRight(this.z ^ i2, 3) ^ i3, 3);
                        } else if (i instanceof Enum) {
                            rotateRight = Integer.rotateRight(((Enum) i).ordinal() ^ Integer.rotateRight(this.z, 3), 3);
                        } else {
                            rotateRight = Integer.rotateRight(i.hashCode() ^ Integer.rotateRight(this.z, 3), 3);
                        }
                        this.z = rotateRight;
                    }
                    a2.c(a2.b - 1);
                    Y();
                    this.b.h();
                    Y();
                    this.x.b();
                    caz cazVar = this.x;
                    cazVar.g();
                    if (!cazVar.c.f()) {
                        bwp.i("Missed recording an endGroup()");
                    }
                    if (!this.C.isEmpty()) {
                        bwp.i("Start/end imbalance");
                    }
                    V();
                    this.r.r();
                    this.k = bwp.n(this.l.c());
                    this.q = false;
                    this.j.clear();
                    W();
                } catch (Throwable th) {
                    a2.c(a2.b - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.q = false;
                this.j.clear();
                U();
                W();
                throw th2;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void ai(ve veVar) {
        int i;
        Object[] objArr = veVar.b;
        Object[] objArr2 = veVar.c;
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
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            obj.getClass();
                            bzf bzfVar = (bzf) obj;
                            bwa bwaVar = bzfVar.c;
                            if (bwaVar != null) {
                                List list = this.j;
                                int i6 = bwaVar.a;
                                if (obj2 == bzy.a) {
                                    obj2 = null;
                                }
                                list.add(new bxt(bzfVar, i6, obj2));
                            }
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
        aqjn.M(this.j, bwp.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r10 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ak(defpackage.bxc r9, defpackage.bxc r10, java.lang.Integer r11, java.util.List r12, defpackage.arqg r13) {
        /*
            r8 = this;
            boolean r0 = r8.q
            int r1 = r8.E
            r2 = 1
            r8.q = r2     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r8.E = r2     // Catch: java.lang.Throwable -> L71
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L71
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2a
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L71
            armo r6 = (defpackage.armo) r6     // Catch: java.lang.Throwable -> L71
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L71
            bzf r7 = (defpackage.bzf) r7     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L24
            r8.ag(r7, r6)     // Catch: java.lang.Throwable -> L71
            goto L27
        L24:
            r8.ag(r7, r5)     // Catch: java.lang.Throwable -> L71
        L27:
            int r4 = r4 + 1
            goto Lf
        L2a:
            if (r9 == 0) goto L69
            if (r11 == 0) goto L33
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L71
            goto L34
        L33:
            r11 = -1
        L34:
            if (r10 == 0) goto L63
            boolean r12 = defpackage.d.F(r10, r9)     // Catch: java.lang.Throwable -> L71
            if (r12 != 0) goto L63
            if (r11 < 0) goto L63
            bwt r10 = (defpackage.bwt) r10     // Catch: java.lang.Throwable -> L71
            r12 = r9
            bwt r12 = (defpackage.bwt) r12     // Catch: java.lang.Throwable -> L71
            r12.h = r10     // Catch: java.lang.Throwable -> L71
            r10 = r9
            bwt r10 = (defpackage.bwt) r10     // Catch: java.lang.Throwable -> L71
            r10.i = r11     // Catch: java.lang.Throwable -> L71
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L58
            r11 = r9
            bwt r11 = (defpackage.bwt) r11     // Catch: java.lang.Throwable -> L71
            r11.h = r5     // Catch: java.lang.Throwable -> L71
            bwt r9 = (defpackage.bwt) r9     // Catch: java.lang.Throwable -> L71
            r9.i = r2     // Catch: java.lang.Throwable -> L71
            goto L67
        L58:
            r10 = move-exception
            r11 = r9
            bwt r11 = (defpackage.bwt) r11     // Catch: java.lang.Throwable -> L71
            r11.h = r5     // Catch: java.lang.Throwable -> L71
            bwt r9 = (defpackage.bwt) r9     // Catch: java.lang.Throwable -> L71
            r9.i = r2     // Catch: java.lang.Throwable -> L71
            throw r10     // Catch: java.lang.Throwable -> L71
        L63:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L71
        L67:
            if (r10 != 0) goto L6c
        L69:
            r13.a()     // Catch: java.lang.Throwable -> L71
        L6c:
            r8.q = r0
            r8.E = r1
            return
        L71:
            r9 = move-exception
            r8.q = r0
            r8.E = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwk.ak(bxc, bxc, java.lang.Integer, java.util.List, arqg):void");
    }

    @Override // defpackage.bwj
    public final int b() {
        if (this.y) {
            return -this.t.q;
        }
        return this.r.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Type inference failed for: r0v7, types: [bzi, bxc] */
    /* JADX WARN: Type inference failed for: r12v17, types: [bzi, bxc] */
    @Override // defpackage.bwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bwj c(int r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwk.c(int):bwj");
    }

    @Override // defpackage.bwj
    public final bwy d() {
        return P();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    @Override // defpackage.bwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bzz e() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwk.e():bzz");
    }

    @Override // defpackage.bwj
    public final cfm f() {
        return this.c;
    }

    @Override // defpackage.bwj
    public final Object g(bwv bwvVar) {
        return bwz.b(P(), bwvVar);
    }

    @Override // defpackage.bwj
    public final Object h() {
        return T();
    }

    @Override // defpackage.bwj
    public final arpi i() {
        return this.b.d();
    }

    @Override // defpackage.bwj
    public final void j(Object obj, arqv arqvVar) {
        int i = 0;
        if (this.y) {
            cbf cbfVar = this.O.a;
            cbb.af afVar = cbb.af.a;
            cbfVar.e(afVar);
            cbf.b.b(cbfVar, 0, obj);
            arqvVar.getClass();
            arsd.g(arqvVar, 2);
            cbf.b.b(cbfVar, 1, arqvVar);
            if (cbfVar.g != cbf.h(afVar.b) || cbfVar.h != cbf.h(afVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i2 = afVar.b;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (((1 << i4) & cbfVar.g) != 0) {
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(afVar.a(i4));
                        i3++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i5 = afVar.c;
                int i6 = 0;
                while (i < i5) {
                    if (((1 << i) & cbfVar.h) != 0) {
                        if (i3 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(afVar.c(i));
                        i6++;
                    }
                    i++;
                }
                byy.b(defpackage.a.cm(new StringBuilder(), sb3.toString(), i6, sb2, i3, afVar));
                return;
            }
            return;
        }
        caz cazVar = this.x;
        cazVar.g();
        cbf cbfVar2 = cazVar.a.a;
        cbb.af afVar2 = cbb.af.a;
        cbfVar2.e(afVar2);
        cbf.b.b(cbfVar2, 0, obj);
        arqvVar.getClass();
        arsd.g(arqvVar, 2);
        cbf.b.b(cbfVar2, 1, arqvVar);
        if (cbfVar2.g == cbf.h(afVar2.b) && cbfVar2.h == cbf.h(afVar2.c)) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        int i7 = afVar2.b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            if (((1 << i9) & cbfVar2.g) != 0) {
                if (i8 > 0) {
                    sb4.append(", ");
                }
                sb4.append(afVar2.a(i9));
                i8++;
            }
        }
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder();
        int i10 = afVar2.c;
        int i11 = 0;
        while (i < i10) {
            if (((1 << i) & cbfVar2.h) != 0) {
                if (i8 > 0) {
                    sb6.append(", ");
                }
                sb6.append(afVar2.c(i));
                i11++;
            }
            i++;
        }
        byy.b(defpackage.a.cm(new StringBuilder(), sb6.toString(), i11, sb5, i8, afVar2));
    }

    @Override // defpackage.bwj
    public final void k() {
        this.h = true;
        this.p = true;
        this.c.e();
        this.s.e();
        cae caeVar = this.t;
        cab cabVar = caeVar.a;
        caeVar.e = cabVar.i;
        caeVar.s = cabVar.j;
    }

    @Override // defpackage.bwj
    public final void l(arqg arqgVar) {
        aD();
        if (!this.y) {
            bwp.i("createNode() can only be called when inserting");
        }
        int a2 = this.H.a();
        cae caeVar = this.t;
        bwa q = caeVar.q(caeVar.q);
        int i = 1;
        this.F++;
        cba cbaVar = this.O;
        cbf cbfVar = cbaVar.a;
        cbb.o oVar = cbb.o.a;
        cbfVar.e(oVar);
        cbf.b.b(cbfVar, 0, arqgVar);
        cbf.b.a(cbfVar, 0, a2);
        cbf.b.b(cbfVar, 1, q);
        if (cbfVar.g != cbf.h(oVar.b) || cbfVar.h != cbf.h(oVar.c)) {
            StringBuilder sb = new StringBuilder();
            int i2 = oVar.b;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                if (((1 << i4) & cbfVar.g) != 0) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(oVar.a(i4));
                    i3++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            int i5 = oVar.c;
            int i6 = 0;
            int i7 = 0;
            while (i7 < i5) {
                if ((cbfVar.h & (i << i7)) != 0) {
                    if (i3 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(oVar.c(i7));
                    i6++;
                }
                i7++;
                i = 1;
            }
            byy.b(defpackage.a.cm(new StringBuilder(), sb3.toString(), i6, sb2, i3, oVar));
        }
        cbf cbfVar2 = cbaVar.b;
        cbb.t tVar = cbb.t.a;
        cbfVar2.e(tVar);
        cbf.b.a(cbfVar2, 0, a2);
        cbf.b.b(cbfVar2, 0, q);
        if (cbfVar2.g == cbf.h(tVar.b) && cbfVar2.h == cbf.h(tVar.c)) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        int i8 = tVar.b;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if ((cbfVar2.g & (1 << i10)) != 0) {
                if (i9 > 0) {
                    sb4.append(", ");
                }
                sb4.append(tVar.a(i10));
                i9++;
            }
        }
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder();
        int i11 = tVar.c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((1 << i13) & cbfVar2.h) != 0) {
                if (i9 > 0) {
                    sb6.append(", ");
                }
                sb6.append(tVar.c(i13));
                i12++;
            }
        }
        byy.b(defpackage.a.cm(new StringBuilder(), sb6.toString(), i12, sb5, i9, tVar));
    }

    @Override // defpackage.bwj
    public final void m(boolean z) {
        if (this.F != 0) {
            bwp.i("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (!this.y) {
            if (!z) {
                ay();
                return;
            }
            caa caaVar = this.r;
            int i = caaVar.e;
            int i2 = caaVar.f;
            caz cazVar = this.x;
            caz.n(cazVar);
            cazVar.a.a.d(cbb.f.a);
            bwp.l(this.j, i, i2);
            this.r.u();
        }
    }

    @Override // defpackage.bwj
    public final void n() {
        Y();
        bzf R = R();
        if (R != null && R.l()) {
            R.a |= 2;
        }
    }

    @Override // defpackage.bwj
    public final void o() {
        Y();
    }

    @Override // defpackage.bwj
    public final void p() {
        aq(true);
    }

    @Override // defpackage.bwj
    public final void q() {
        Y();
    }

    @Override // defpackage.bwj
    public final void r() {
        Y();
    }

    @Override // defpackage.bwj
    public final void s() {
        if (this.m && this.r.g == this.n) {
            this.n = -1;
            this.m = false;
        }
        aq(false);
    }

    @Override // defpackage.bwj
    public final void t(int i) {
        if (i < 0) {
            int i2 = -i;
            cae caeVar = this.t;
            while (true) {
                int i3 = caeVar.q;
                if (i3 > i2) {
                    aq(caeVar.S(i3));
                } else {
                    return;
                }
            }
        } else {
            if (this.y) {
                cae caeVar2 = this.t;
                while (this.y) {
                    aq(caeVar2.S(caeVar2.q));
                }
            }
            caa caaVar = this.r;
            while (true) {
                int i4 = caaVar.g;
                if (i4 > i) {
                    aq(caaVar.z(i4));
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.bwj
    public final void u(arqg arqgVar) {
        cbf cbfVar = this.x.a.a;
        cbb.z zVar = cbb.z.a;
        cbfVar.e(zVar);
        cbf.b.b(cbfVar, 0, arqgVar);
        if (cbfVar.g == cbf.h(zVar.b) && cbfVar.h == cbf.h(zVar.c)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = zVar.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (((1 << i3) & cbfVar.g) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(zVar.a(i3));
                i2++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        int i4 = zVar.c;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (((1 << i6) & cbfVar.h) != 0) {
                if (i2 > 0) {
                    sb3.append(", ");
                }
                sb3.append(zVar.c(i6));
                i5++;
            }
        }
        byy.b(defpackage.a.cm(new StringBuilder(), sb3.toString(), i5, sb2, i2, zVar));
    }

    @Override // defpackage.bwj
    public final void v() {
        if (this.F != 0) {
            bwp.i("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.y) {
            bzf R = R();
            if (R != null && !R.j()) {
                R.h(true);
            }
            if (this.j.isEmpty()) {
                ay();
            } else {
                au();
            }
        }
    }

    @Override // defpackage.bwj
    public final void w() {
        ab(-127, null, 0, null);
    }

    @Override // defpackage.bwj
    public final void x(int i, Object obj) {
        ab(i, obj, 0, null);
    }

    @Override // defpackage.bwj
    public final void y(int i) {
        int i2;
        if (this.D != null) {
            ab(i, null, 0, null);
            return;
        }
        aE();
        this.z = this.G ^ Integer.rotateLeft(Integer.rotateLeft(this.z, 3) ^ i, 3);
        this.G++;
        caa caaVar = this.r;
        if (this.y) {
            caaVar.q();
            this.t.M(i, bwj.a.a);
            as(false, null);
            return;
        }
        if (caaVar.a() == i && ((i2 = caaVar.e) >= caaVar.f || !cad.u(caaVar.b, i2))) {
            caaVar.v();
            as(false, null);
            return;
        }
        if (!caaVar.y()) {
            int i3 = this.E;
            int i4 = caaVar.e;
            av();
            this.x.l(i3, caaVar.f());
            bwp.l(this.j, i4, caaVar.e);
        }
        caaVar.q();
        this.y = true;
        this.v = null;
        ar();
        cae caeVar = this.t;
        caeVar.y();
        int i5 = caeVar.o;
        caeVar.M(i, bwj.a.a);
        this.N = caeVar.q(i5);
        as(false, null);
    }

    @Override // defpackage.bwj
    public final void z(int i) {
        ab(i, null, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements bzx {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.bzt
        public final void g() {
            this.a.g();
        }

        @Override // defpackage.bzt
        public final void h() {
            this.a.g();
        }

        @Override // defpackage.bzt
        public final void i() {
        }
    }

    @Override // defpackage.bwj
    public final void N() {
    }
}
