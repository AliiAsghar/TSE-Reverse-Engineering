package defpackage;

import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atgr extends atgs {
    private static final long serialVersionUID = -6728465968995518215L;
    private transient atfw A;
    private transient atfw B;
    private transient atfw C;
    private transient atfw D;
    private transient atfw E;
    private transient atfw F;
    private transient atfw G;
    private transient atfw I;
    private transient atfw J;
    private transient atfw K;
    public final atfu a;
    public final Object b;
    public transient atgd c;
    public transient atgd d;
    public transient atgd e;
    public transient atgd f;
    private transient atfw fH;
    public transient atgd g;
    public transient atgd h;
    public transient atfw i;
    public transient atfw j;
    public transient atfw k;
    public transient atfw l;
    public transient atfw m;
    public transient atfw n;
    private transient atgd o;
    private transient atgd p;
    private transient atgd q;
    private transient atgd r;
    private transient atgd s;
    private transient atgd t;
    private transient atfw u;
    private transient atfw v;
    private transient atfw w;
    private transient atfw x;
    private transient atfw y;
    private transient atfw z;

    /* JADX INFO: Access modifiers changed from: protected */
    public atgr(atfu atfuVar, Object obj) {
        this.a = atfuVar;
        this.b = obj;
        N();
    }

    private final void N() {
        atgq atgqVar = new atgq();
        atfu atfuVar = this.a;
        if (atfuVar != null) {
            atgd F = atfuVar.F();
            if (atgq.b(F)) {
                atgqVar.a = F;
            }
            atgd I = atfuVar.I();
            if (atgq.b(I)) {
                atgqVar.b = I;
            }
            atgd G = atfuVar.G();
            if (atgq.b(G)) {
                atgqVar.c = G;
            }
            atgd E = atfuVar.E();
            if (atgq.b(E)) {
                atgqVar.d = E;
            }
            atgd D = atfuVar.D();
            if (atgq.b(D)) {
                atgqVar.e = D;
            }
            atgd B = atfuVar.B();
            if (atgq.b(B)) {
                atgqVar.f = B;
            }
            atgd J = atfuVar.J();
            if (atgq.b(J)) {
                atgqVar.g = J;
            }
            atgd K = atfuVar.K();
            if (atgq.b(K)) {
                atgqVar.h = K;
            }
            atgd H = atfuVar.H();
            if (atgq.b(H)) {
                atgqVar.i = H;
            }
            atgd L = atfuVar.L();
            if (atgq.b(L)) {
                atgqVar.j = L;
            }
            atgd A = atfuVar.A();
            if (atgq.b(A)) {
                atgqVar.k = A;
            }
            atgd C = atfuVar.C();
            if (atgq.b(C)) {
                atgqVar.l = C;
            }
            atfw n = atfuVar.n();
            if (atgq.a(n)) {
                atgqVar.m = n;
            }
            atfw m = atfuVar.m();
            if (atgq.a(m)) {
                atgqVar.n = m;
            }
            atfw s = atfuVar.s();
            if (atgq.a(s)) {
                atgqVar.o = s;
            }
            atfw r = atfuVar.r();
            if (atgq.a(r)) {
                atgqVar.p = r;
            }
            atfw p = atfuVar.p();
            if (atgq.a(p)) {
                atgqVar.q = p;
            }
            atfw o = atfuVar.o();
            if (atgq.a(o)) {
                atgqVar.r = o;
            }
            atfw k = atfuVar.k();
            if (atgq.a(k)) {
                atgqVar.s = k;
            }
            atfw d = atfuVar.d();
            if (atgq.a(d)) {
                atgqVar.t = d;
            }
            atfw l = atfuVar.l();
            if (atgq.a(l)) {
                atgqVar.u = l;
            }
            atfw e = atfuVar.e();
            if (atgq.a(e)) {
                atgqVar.v = e;
            }
            atfw j = atfuVar.j();
            if (atgq.a(j)) {
                atgqVar.w = j;
            }
            atfw g = atfuVar.g();
            if (atgq.a(g)) {
                atgqVar.x = g;
            }
            atfw f = atfuVar.f();
            if (atgq.a(f)) {
                atgqVar.y = f;
            }
            atfw h = atfuVar.h();
            if (atgq.a(h)) {
                atgqVar.z = h;
            }
            atfw t = atfuVar.t();
            if (atgq.a(t)) {
                atgqVar.A = t;
            }
            atfw u = atfuVar.u();
            if (atgq.a(u)) {
                atgqVar.B = u;
            }
            atfw v = atfuVar.v();
            if (atgq.a(v)) {
                atgqVar.C = v;
            }
            atfw q = atfuVar.q();
            if (atgq.a(q)) {
                atgqVar.D = q;
            }
            atfw w = atfuVar.w();
            if (atgq.a(w)) {
                atgqVar.E = w;
            }
            atfw y = atfuVar.y();
            if (atgq.a(y)) {
                atgqVar.F = y;
            }
            atfw x = atfuVar.x();
            if (atgq.a(x)) {
                atgqVar.G = x;
            }
            atfw c = atfuVar.c();
            if (atgq.a(c)) {
                atgqVar.H = c;
            }
            atfw i = atfuVar.i();
            if (atgq.a(i)) {
                atgqVar.I = i;
            }
        }
        M(atgqVar);
        atgd atgdVar = atgqVar.a;
        if (atgdVar == null) {
            atgdVar = super.F();
        }
        this.o = atgdVar;
        atgd atgdVar2 = atgqVar.b;
        if (atgdVar2 == null) {
            atgdVar2 = super.I();
        }
        this.p = atgdVar2;
        atgd atgdVar3 = atgqVar.c;
        if (atgdVar3 == null) {
            atgdVar3 = super.G();
        }
        this.q = atgdVar3;
        atgd atgdVar4 = atgqVar.d;
        if (atgdVar4 == null) {
            atgdVar4 = super.E();
        }
        this.r = atgdVar4;
        atgd atgdVar5 = atgqVar.e;
        if (atgdVar5 == null) {
            atgdVar5 = super.D();
        }
        this.s = atgdVar5;
        atgd atgdVar6 = atgqVar.f;
        if (atgdVar6 == null) {
            atgdVar6 = super.B();
        }
        this.c = atgdVar6;
        atgd atgdVar7 = atgqVar.g;
        if (atgdVar7 == null) {
            atgdVar7 = super.J();
        }
        this.d = atgdVar7;
        atgd atgdVar8 = atgqVar.h;
        if (atgdVar8 == null) {
            atgdVar8 = super.K();
        }
        this.e = atgdVar8;
        atgd atgdVar9 = atgqVar.i;
        if (atgdVar9 == null) {
            atgdVar9 = super.H();
        }
        this.f = atgdVar9;
        atgd atgdVar10 = atgqVar.j;
        if (atgdVar10 == null) {
            atgdVar10 = super.L();
        }
        this.g = atgdVar10;
        atgd atgdVar11 = atgqVar.k;
        if (atgdVar11 == null) {
            atgdVar11 = super.A();
        }
        this.t = atgdVar11;
        atgd atgdVar12 = atgqVar.l;
        if (atgdVar12 == null) {
            atgdVar12 = super.C();
        }
        this.h = atgdVar12;
        atfw atfwVar = atgqVar.m;
        if (atfwVar == null) {
            atfwVar = super.n();
        }
        this.u = atfwVar;
        atfw atfwVar2 = atgqVar.n;
        if (atfwVar2 == null) {
            atfwVar2 = super.m();
        }
        this.i = atfwVar2;
        atfw atfwVar3 = atgqVar.o;
        if (atfwVar3 == null) {
            atfwVar3 = super.s();
        }
        this.v = atfwVar3;
        atfw atfwVar4 = atgqVar.p;
        if (atfwVar4 == null) {
            atfwVar4 = super.r();
        }
        this.w = atfwVar4;
        atfw atfwVar5 = atgqVar.q;
        if (atfwVar5 == null) {
            atfwVar5 = super.p();
        }
        this.x = atfwVar5;
        atfw atfwVar6 = atgqVar.r;
        if (atfwVar6 == null) {
            atfwVar6 = super.o();
        }
        this.y = atfwVar6;
        atfw atfwVar7 = atgqVar.s;
        if (atfwVar7 == null) {
            atfwVar7 = super.k();
        }
        this.z = atfwVar7;
        atfw atfwVar8 = atgqVar.t;
        if (atfwVar8 == null) {
            atfwVar8 = super.d();
        }
        this.A = atfwVar8;
        atfw atfwVar9 = atgqVar.u;
        if (atfwVar9 == null) {
            atfwVar9 = super.l();
        }
        this.B = atfwVar9;
        atfw atfwVar10 = atgqVar.v;
        if (atfwVar10 == null) {
            atfwVar10 = super.e();
        }
        this.C = atfwVar10;
        atfw atfwVar11 = atgqVar.w;
        if (atfwVar11 == null) {
            atfwVar11 = super.j();
        }
        this.D = atfwVar11;
        atfw atfwVar12 = atgqVar.x;
        if (atfwVar12 == null) {
            atfwVar12 = super.g();
        }
        this.j = atfwVar12;
        atfw atfwVar13 = atgqVar.y;
        if (atfwVar13 == null) {
            atfwVar13 = super.f();
        }
        this.k = atfwVar13;
        atfw atfwVar14 = atgqVar.z;
        if (atfwVar14 == null) {
            atfwVar14 = super.h();
        }
        this.E = atfwVar14;
        atfw atfwVar15 = atgqVar.A;
        if (atfwVar15 == null) {
            atfwVar15 = super.t();
        }
        this.l = atfwVar15;
        atfw atfwVar16 = atgqVar.B;
        if (atfwVar16 == null) {
            atfwVar16 = super.u();
        }
        this.F = atfwVar16;
        atfw atfwVar17 = atgqVar.C;
        if (atfwVar17 == null) {
            atfwVar17 = super.v();
        }
        this.G = atfwVar17;
        atfw atfwVar18 = atgqVar.D;
        if (atfwVar18 == null) {
            atfwVar18 = super.q();
        }
        this.m = atfwVar18;
        atfw atfwVar19 = atgqVar.E;
        if (atfwVar19 == null) {
            atfwVar19 = super.w();
        }
        this.n = atfwVar19;
        atfw atfwVar20 = atgqVar.F;
        if (atfwVar20 == null) {
            atfwVar20 = super.y();
        }
        this.fH = atfwVar20;
        atfw atfwVar21 = atgqVar.G;
        if (atfwVar21 == null) {
            atfwVar21 = super.x();
        }
        this.I = atfwVar21;
        atfw atfwVar22 = atgqVar.H;
        if (atfwVar22 == null) {
            atfwVar22 = super.c();
        }
        this.J = atfwVar22;
        atfw atfwVar23 = atgqVar.I;
        if (atfwVar23 == null) {
            atfwVar23 = super.i();
        }
        this.K = atfwVar23;
        atfu atfuVar2 = this.a;
        if (atfuVar2 != null) {
            if (this.z == atfuVar2.k() && this.x == this.a.p() && this.v == this.a.s()) {
                this.a.n();
            }
            this.a.m();
            if (this.n == this.a.w() && this.m == this.a.q()) {
                this.a.f();
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        N();
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd A() {
        return this.t;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd B() {
        return this.c;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd C() {
        return this.h;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd D() {
        return this.s;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd E() {
        return this.r;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd F() {
        return this.o;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd G() {
        return this.q;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd H() {
        return this.f;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd I() {
        return this.p;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd J() {
        return this.d;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd K() {
        return this.e;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atgd L() {
        return this.g;
    }

    protected abstract void M(atgq atgqVar);

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw c() {
        return this.J;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw d() {
        return this.A;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw e() {
        return this.C;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw f() {
        return this.k;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw g() {
        return this.j;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw h() {
        return this.E;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw i() {
        return this.K;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw j() {
        return this.D;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw k() {
        return this.z;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw l() {
        return this.B;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw m() {
        return this.i;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw n() {
        return this.u;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw o() {
        return this.y;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw p() {
        return this.x;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw q() {
        return this.m;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw r() {
        return this.w;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw s() {
        return this.v;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw t() {
        return this.l;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw u() {
        return this.F;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw v() {
        return this.G;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw w() {
        return this.n;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw x() {
        return this.I;
    }

    @Override // defpackage.atgs, defpackage.atfu
    public final atfw y() {
        return this.fH;
    }

    @Override // defpackage.atfu
    public atgc z() {
        atfu atfuVar = this.a;
        if (atfuVar != null) {
            return atfuVar.z();
        }
        return null;
    }
}
