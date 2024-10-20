package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abt<S> {
    public final abt a;
    public final String b;
    public long e;
    private final ace f;
    private final byn g = new byu(e(), cav.a);
    private final byn h = new byu(new c(e(), e()), cav.a);
    private final byl i = new byt(0);
    private final byl j = new byt(Long.MIN_VALUE);
    private final byn k = new byu(false, cav.a);
    public final cez c = new cez();
    public final cez d = new cez();
    private final byn l = new byu(false, cav.a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: abt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ arwe a;
        final /* synthetic */ abt b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arwe arweVar, abt abtVar) {
            super(1);
            this.a = arweVar;
            this.b = abtVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            arrn.J(this.a, null, arwf.d, new abv(this.b, null), 1);
            return new abw();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: abt$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, int i) {
            super(2);
            this.b = obj;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            abt.this.g(this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: abt$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqg<Long> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Long.valueOf(abt.this.a());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a<T, V extends zz> {
        private final acg b;
        private final byn c = new byu(null, cav.a);

        /* compiled from: PG */
        /* renamed from: abt$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0001a<T, V extends zz> implements cas<T> {
            public final d a;
            public arqr b;
            public arqr c;

            public C0001a(d dVar, arqr arqrVar, arqr arqrVar2) {
                this.a = dVar;
                this.b = arqrVar;
                this.c = arqrVar2;
            }

            @Override // defpackage.cas
            public final Object a() {
                b(abt.this.d());
                return this.a.a();
            }

            public final void b(b bVar) {
                Object a = this.c.a(bVar.b());
                if (abt.this.t()) {
                    this.a.j(this.c.a(bVar.a()), a, (aap) this.b.a(bVar));
                } else {
                    this.a.k(a, (aap) this.b.a(bVar));
                }
            }
        }

        public a(acg acgVar) {
            this.b = acgVar;
        }

        public final C0001a a() {
            return (C0001a) this.c.a();
        }

        public final cas b(arqr arqrVar, arqr arqrVar2) {
            C0001a a = a();
            if (a == null) {
                abt abtVar = abt.this;
                C0001a c0001a = new C0001a(new d(arqrVar2.a(abtVar.e()), zu.a(this.b, arqrVar2.a(abt.this.e())), this.b), arqrVar, arqrVar2);
                abt abtVar2 = abt.this;
                this.c.h(c0001a);
                abtVar2.u(c0001a.a);
                a = c0001a;
            }
            abt abtVar3 = abt.this;
            a.c = arqrVar2;
            a.b = arqrVar;
            a.b(abtVar3.d());
            return a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface b<S> {
        Object a();

        Object b();

        boolean c(Object obj, Object obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class c<S> implements b<S> {
        private final Object a;
        private final Object b;

        public c(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        @Override // abt.b
        public final Object a() {
            return this.a;
        }

        @Override // abt.b
        public final Object b() {
            return this.b;
        }

        @Override // abt.b
        public final /* synthetic */ boolean c(Object obj, Object obj2) {
            return abu.a(this, obj, obj2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (defpackage.d.F(this.a, bVar.a()) && defpackage.d.F(this.b, bVar.b())) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            Object obj = this.a;
            int i2 = 0;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            Object obj2 = this.b;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            return (i * 31) + i2;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class d<T, V extends zz> implements cas<T> {
        public zz a;
        private final acg c;
        private final byn d;
        private final abm e;
        private final byn f;
        private final byn g;
        private final byn h;
        private final byj i;
        private boolean j;
        private final byn k;
        private final byl l;
        private boolean m;
        private final aap n;

        public d(Object obj, zz zzVar, acg acgVar) {
            this.c = acgVar;
            this.d = new byu(obj, cav.a);
            Object obj2 = null;
            abm c = zs.c(brg.a, brg.a, null, 7);
            this.e = c;
            this.f = new byu(c, cav.a);
            this.g = new byu(new abs(d(), acgVar, obj, n(), zzVar), cav.a);
            this.h = new byu(true, cav.a);
            this.i = new byr(-1.0f);
            this.k = new byu(obj, cav.a);
            this.a = zzVar;
            this.l = new byt(e().a());
            Float f = (Float) acz.b.get(acgVar);
            if (f != null) {
                float floatValue = f.floatValue();
                zz zzVar2 = (zz) acgVar.b().a(obj);
                int b = zzVar2.b();
                for (int i = 0; i < b; i++) {
                    zzVar2.e(i, floatValue);
                }
                obj2 = this.c.a().a(zzVar2);
            }
            this.n = zs.c(brg.a, brg.a, obj2, 3);
        }

        private final Object n() {
            return this.d.a();
        }

        private final void o(abs absVar) {
            this.g.h(absVar);
        }

        private final void p(aap aapVar) {
            this.f.h(aapVar);
        }

        private final void q(Object obj) {
            this.d.h(obj);
        }

        private final void r(Object obj, boolean z) {
            zr d;
            zr zrVar;
            if (defpackage.d.F(null, n())) {
                o(new abs(this.n, this.c, obj, obj, this.a.c()));
                this.j = true;
                f(e().a());
                return;
            }
            if (z && !this.m) {
                if (d() instanceof abm) {
                    d = d();
                } else {
                    d = this.n;
                }
            } else {
                d = d();
            }
            long j = 0;
            if (abt.this.b() > 0) {
                zrVar = new abn(d, abt.this.b());
            } else {
                zrVar = d;
            }
            o(new abs(zrVar, this.c, obj, n(), this.a));
            f(e().a());
            this.j = false;
            abt abtVar = abt.this;
            abtVar.p(true);
            if (abtVar.t()) {
                cez cezVar = abtVar.c;
                int a = cezVar.a();
                for (int i = 0; i < a; i++) {
                    d dVar = (d) cezVar.get(i);
                    j = Math.max(j, dVar.c());
                    long j2 = abtVar.e;
                    dVar.m();
                }
                abtVar.p(false);
            }
        }

        @Override // defpackage.cas
        public final Object a() {
            return this.k.a();
        }

        public final float b() {
            return this.i.b();
        }

        public final long c() {
            return this.l.b();
        }

        public final aap d() {
            return (aap) this.f.a();
        }

        public final abs e() {
            return (abs) this.g.a();
        }

        public final void f(long j) {
            this.l.d(j);
        }

        public final void g(boolean z) {
            this.h.h(Boolean.valueOf(z));
        }

        public final void h(float f) {
            this.i.d(f);
        }

        public final void i(Object obj) {
            this.k.h(obj);
        }

        public final void j(Object obj, Object obj2, aap aapVar) {
            q(obj2);
            p(aapVar);
            if (defpackage.d.F(e().b, obj) && defpackage.d.F(e().a, obj2)) {
                return;
            }
            r(obj, false);
        }

        public final void k(Object obj, aap aapVar) {
            Object a;
            if (!this.j || !defpackage.d.F(obj, null)) {
                if (defpackage.d.F(n(), obj) && b() == -1.0f) {
                    return;
                }
                q(obj);
                p(aapVar);
                if (b() == -3.0f) {
                    a = obj;
                } else {
                    a = a();
                }
                boolean z = true;
                r(a, !l());
                if (b() != -3.0f) {
                    z = false;
                }
                g(z);
                if (b() >= brg.a) {
                    i(e().d(((float) e().a()) * b()));
                } else if (b() == -3.0f) {
                    i(obj);
                }
                this.j = false;
                h(-1.0f);
            }
        }

        public final boolean l() {
            return ((Boolean) this.h.a()).booleanValue();
        }

        public final void m() {
            if (b() == -1.0f) {
                this.m = true;
                if (defpackage.d.F(e().a, e().b)) {
                    i(e().a);
                } else {
                    i(e().d(0L));
                    this.a = e().b(0L);
                }
            }
        }

        public final String toString() {
            return "current value: " + a() + ", target: " + n() + ", spec: " + d();
        }
    }

    public abt(ace aceVar, abt abtVar, String str) {
        this.f = aceVar;
        this.a = abtVar;
        this.b = str;
        new bxd(new AnonymousClass3(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void w() {
        cez cezVar = this.c;
        int a2 = cezVar.a();
        for (int i = 0; i < a2; i++) {
            ((d) cezVar.get(i)).h(-2.0f);
        }
        cez cezVar2 = this.d;
        int a3 = cezVar2.a();
        for (int i2 = 0; i2 < a3; i2++) {
            ((abt) cezVar2.get(i2)).w();
        }
    }

    private final void x(b bVar) {
        this.h.h(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        cez cezVar = this.c;
        int a2 = cezVar.a();
        long j = 0;
        for (int i = 0; i < a2; i++) {
            j = Math.max(j, ((d) cezVar.get(i)).c());
        }
        cez cezVar2 = this.d;
        int a3 = cezVar2.a();
        for (int i2 = 0; i2 < a3; i2++) {
            j = Math.max(j, ((abt) cezVar2.get(i2)).a());
        }
        return j;
    }

    public final long b() {
        abt abtVar = this.a;
        if (abtVar != null) {
            return abtVar.b();
        }
        return this.i.b();
    }

    public final long c() {
        return this.j.b();
    }

    public final b d() {
        return (b) this.h.a();
    }

    public final Object e() {
        return this.f.a();
    }

    public final Object f() {
        return this.g.a();
    }

    public final void g(Object obj, bwj bwjVar, int i) {
        int i2;
        int i3;
        boolean I;
        int i4;
        int i5 = i & 6;
        bwj c2 = bwjVar.c(-1493585151);
        boolean z = true;
        if (i5 == 0) {
            if ((i & 8) == 0) {
                I = c2.G(obj);
            } else {
                I = c2.I(obj);
            }
            if (true != I) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c2.G(this)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c2.L()) {
            c2.v();
        } else if (!t()) {
            q(obj);
            if (!defpackage.d.F(obj, e()) || s() || ((Boolean) this.k.a()).booleanValue()) {
                bwk bwkVar = (bwk) c2;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = bxl.a(arpj.a, c2);
                    bwkVar.ad(T);
                }
                arwe arweVar = (arwe) T;
                boolean I2 = c2.I(arweVar);
                if ((i2 & 112) != 32) {
                    z = false;
                }
                boolean z2 = I2 | z;
                Object T2 = bwkVar.T();
                if (z2 || T2 == bwj.a.a) {
                    T2 = new AnonymousClass1(arweVar, this);
                    bwkVar.ad(T2);
                }
                bxl.b(arweVar, this, (arqr) T2, c2);
            }
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(obj, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(long j, boolean z) {
        long j2;
        if (c() == Long.MIN_VALUE) {
            j(j);
        } else if (!((Boolean) this.f.a.a()).booleanValue()) {
            this.f.e(true);
        }
        p(false);
        cez cezVar = this.c;
        int a2 = cezVar.a();
        boolean z2 = true;
        for (int i = 0; i < a2; i++) {
            d dVar = (d) cezVar.get(i);
            if (!dVar.l()) {
                if (z) {
                    j2 = dVar.e().a();
                } else {
                    j2 = j;
                }
                dVar.i(dVar.e().d(j2));
                dVar.a = dVar.e().b(j2);
                if (zm.a(dVar.e(), j2)) {
                    dVar.g(true);
                }
            }
            z2 &= dVar.l();
        }
        cez cezVar2 = this.d;
        int a3 = cezVar2.a();
        for (int i2 = 0; i2 < a3; i2++) {
            abt abtVar = (abt) cezVar2.get(i2);
            if (!defpackage.d.F(abtVar.f(), abtVar.e())) {
                abtVar.h(j, z);
            }
            z2 &= defpackage.d.F(abtVar.f(), abtVar.e());
        }
        if (z2) {
            i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        n(Long.MIN_VALUE);
        ace aceVar = this.f;
        if (aceVar instanceof abd) {
            aceVar.c(f());
        }
        l(0L);
        this.f.e(false);
        cez cezVar = this.d;
        int a2 = cezVar.a();
        for (int i = 0; i < a2; i++) {
            ((abt) cezVar.get(i)).i();
        }
    }

    public final void j(long j) {
        n(j);
        this.f.e(true);
    }

    public final void k(d dVar) {
        this.c.remove(dVar);
    }

    public final void l(long j) {
        if (this.a == null) {
            this.i.d(j);
        }
    }

    public final void m(boolean z) {
        this.l.h(Boolean.valueOf(z));
    }

    public final void n(long j) {
        this.j.d(j);
    }

    public final void o(Object obj) {
        this.g.h(obj);
    }

    public final void p(boolean z) {
        this.k.h(Boolean.valueOf(z));
    }

    public final void q(Object obj) {
        if (!defpackage.d.F(f(), obj)) {
            x(new c(f(), obj));
            if (!defpackage.d.F(e(), f())) {
                this.f.c(f());
            }
            o(obj);
            if (!s()) {
                p(true);
            }
            w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        cez cezVar = this.c;
        int a2 = cezVar.a();
        for (int i = 0; i < a2; i++) {
        }
        cez cezVar2 = this.d;
        int a3 = cezVar2.a();
        for (int i2 = 0; i2 < a3; i2++) {
            if (((abt) cezVar2.get(i2)).r()) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        if (c() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        return ((Boolean) this.l.a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        cez cezVar = this.c;
        int a2 = cezVar.a();
        String str = "Transition animation values: ";
        for (int i = 0; i < a2; i++) {
            str = str + ((d) cezVar.get(i)) + ", ";
        }
        return str;
    }

    public final void u(d dVar) {
        this.c.add(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(Object obj, Object obj2) {
        n(Long.MIN_VALUE);
        this.f.e(false);
        if (!t() || !defpackage.d.F(e(), obj) || !defpackage.d.F(f(), obj2)) {
            if (!defpackage.d.F(e(), obj)) {
                ace aceVar = this.f;
                if (aceVar instanceof abd) {
                    aceVar.c(obj);
                }
            }
            o(obj2);
            m(true);
            x(new c(obj, obj2));
        }
        cez cezVar = this.d;
        int a2 = cezVar.a();
        for (int i = 0; i < a2; i++) {
            abt abtVar = (abt) cezVar.get(i);
            abtVar.getClass();
            if (abtVar.t()) {
                abtVar.v(abtVar.e(), abtVar.f());
            }
        }
        cez cezVar2 = this.c;
        int a3 = cezVar2.a();
        for (int i2 = 0; i2 < a3; i2++) {
            ((d) cezVar2.get(i2)).m();
        }
        this.e = 0L;
    }
}
