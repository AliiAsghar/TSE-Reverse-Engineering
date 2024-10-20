package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhu implements fmq {
    private final apuv B;
    public final fhr a;
    public fht c;
    public fdp d;
    public int e;
    public int f;
    private final fdu h;
    private eqn i;
    private int q;
    private int r;
    private boolean u;
    private eqn x;
    private boolean z;
    public final fhs b = new fhs();
    private int j = 1000;
    private long[] k = new long[1000];
    private long[] l = new long[1000];
    private long[] o = new long[1000];
    private int[] n = new int[1000];
    private int[] m = new int[1000];
    private fmp[] p = new fmp[1000];
    private final arrt A = new arrt(new fde(3));
    public long g = Long.MIN_VALUE;
    private long s = Long.MIN_VALUE;
    private long t = Long.MIN_VALUE;
    private boolean w = true;
    private boolean v = true;
    private boolean y = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public fhu(fjl fjlVar, fdu fduVar, apuv apuvVar) {
        this.h = fduVar;
        this.B = apuvVar;
        this.a = new fhr(fjlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (((defpackage.eqn) ((defpackage.fvq) r12.A.k()).b).equals(r12.x) == false) goto L19;
     */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, etm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void A(long r13, int r15, long r16, int r18, defpackage.fmp r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhu.A(long, int, long, int, fmp):void");
    }

    private final synchronized void B() {
        this.f = 0;
        fhr fhrVar = this.a;
        fhrVar.c = fhrVar.b;
    }

    private final boolean C() {
        if (this.f != this.q) {
            return true;
        }
        return false;
    }

    private final boolean D(int i) {
        fdp fdpVar = this.d;
        if (fdpVar == null || fdpVar.a() == 4) {
            return true;
        }
        if ((this.n[i] & 1073741824) == 0 && this.d.l()) {
            return true;
        }
        return false;
    }

    private final synchronized boolean E(eqn eqnVar) {
        this.w = false;
        if (Objects.equals(eqnVar, this.x)) {
            return false;
        }
        if (!this.A.l() && ((eqn) ((fvq) this.A.k()).b).equals(eqnVar)) {
            this.x = (eqn) ((fvq) this.A.k()).b;
        } else {
            this.x = eqnVar;
        }
        boolean z = this.y;
        eqn eqnVar2 = this.x;
        this.y = z & erl.f(eqnVar2.o, eqnVar2.k);
        this.z = false;
        return true;
    }

    private final void F(eqn eqnVar, fqu fquVar) {
        eqj eqjVar;
        eqn eqnVar2 = this.i;
        if (eqnVar2 == null) {
            eqjVar = null;
        } else {
            eqjVar = eqnVar2.s;
        }
        this.i = eqnVar;
        eqj eqjVar2 = eqnVar.s;
        fquVar.a = eqnVar.b(this.h.a(eqnVar));
        fquVar.b = this.d;
        if (eqnVar2 == null || !Objects.equals(eqjVar, eqjVar2)) {
            fdp fdpVar = this.d;
            fdp f = this.h.f(this.B, eqnVar);
            this.d = f;
            fquVar.b = f;
            if (fdpVar != null) {
                fdpVar.o(this.B);
            }
        }
    }

    private final int w(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.o[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.n[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.j) {
                i = 0;
            }
        }
        return i3;
    }

    private final int x(int i) {
        int i2 = this.r + i;
        int i3 = this.j;
        if (i2 < i3) {
            return i2;
        }
        return i2 - i3;
    }

    private final synchronized long y() {
        int i = this.q;
        if (i == 0) {
            return -1L;
        }
        return z(i);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, etm] */
    private final long z(int i) {
        long j = this.s;
        long j2 = Long.MIN_VALUE;
        int i2 = 0;
        if (i != 0) {
            int x = x(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.o[x]);
                if ((this.n[x] & 1) != 0) {
                    break;
                }
                x--;
                if (x == -1) {
                    x = this.j - 1;
                }
            }
        }
        this.s = Math.max(j, j2);
        this.q -= i;
        int i4 = this.e + i;
        this.e = i4;
        int i5 = this.r + i;
        this.r = i5;
        int i6 = this.j;
        if (i5 >= i6) {
            this.r = i5 - i6;
        }
        int i7 = this.f - i;
        this.f = i7;
        if (i7 < 0) {
            this.f = 0;
        }
        arrt arrtVar = this.A;
        while (i2 < ((SparseArray) arrtVar.c).size() - 1) {
            int i8 = i2 + 1;
            if (i4 < ((SparseArray) arrtVar.c).keyAt(i8)) {
                break;
            }
            arrtVar.b.a(((SparseArray) arrtVar.c).valueAt(i2));
            ((SparseArray) arrtVar.c).removeAt(i2);
            int i9 = arrtVar.a;
            if (i9 > 0) {
                arrtVar.a = i9 - 1;
            }
            i2 = i8;
        }
        if (this.q == 0) {
            int i10 = this.r;
            if (i10 == 0) {
                i10 = this.j;
            }
            return this.l[i10 - 1] + this.m[r12];
        }
        return this.l[this.r];
    }

    public final int a() {
        return this.e + this.f;
    }

    public final synchronized int b(long j, boolean z) {
        int i = this.f;
        int x = x(i);
        if (C() && j >= this.o[x]) {
            if (j > this.t && z) {
                return this.q - i;
            }
            int w = w(x, this.q - i, j, true);
            if (w == -1) {
                return 0;
            }
            return w;
        }
        return 0;
    }

    public final int c() {
        return this.e + this.q;
    }

    @Override // defpackage.fmq
    public final /* synthetic */ int d(eqe eqeVar, int i, boolean z) {
        return dxt.C(this, eqeVar, i, z);
    }

    public final synchronized long e() {
        return this.t;
    }

    public final synchronized eqn f() {
        if (this.w) {
            return null;
        }
        return this.x;
    }

    public final void g() {
        this.a.c(y());
    }

    @Override // defpackage.fmq
    public final void h(eqn eqnVar) {
        boolean E = E(eqnVar);
        fht fhtVar = this.c;
        if (fhtVar != null && E) {
            fhm fhmVar = (fhm) fhtVar;
            fhmVar.f.post(fhmVar.d);
        }
    }

    public final void i() {
        fdp fdpVar = this.d;
        if (fdpVar != null) {
            fdpVar.o(this.B);
            this.d = null;
            this.i = null;
        }
    }

    public final void j() {
        k(false);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, etm] */
    public final void k(boolean z) {
        fhr fhrVar = this.a;
        fhq fhqVar = fhrVar.b;
        if (fhqVar.d != null) {
            fhrVar.f.e(fhqVar);
            fhqVar.b();
        }
        fhrVar.b.c(0L);
        fhq fhqVar2 = fhrVar.b;
        fhrVar.c = fhqVar2;
        fhrVar.d = fhqVar2;
        fhrVar.e = 0L;
        fhrVar.f.d();
        this.q = 0;
        this.e = 0;
        this.r = 0;
        this.f = 0;
        this.v = true;
        this.g = Long.MIN_VALUE;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = false;
        arrt arrtVar = this.A;
        for (int i = 0; i < ((SparseArray) arrtVar.c).size(); i++) {
            arrtVar.b.a(((SparseArray) arrtVar.c).valueAt(i));
        }
        arrtVar.a = -1;
        ((SparseArray) arrtVar.c).clear();
        if (z) {
            this.x = null;
            this.w = true;
            this.y = true;
        }
    }

    @Override // defpackage.fmq
    public final /* synthetic */ void l(euf eufVar, int i) {
        dxt.D(this, eufVar, i);
    }

    @Override // defpackage.fmq
    public final void m(euf eufVar, int i, int i2) {
        while (i > 0) {
            fhr fhrVar = this.a;
            int a = fhrVar.a(i);
            fhq fhqVar = fhrVar.d;
            eufVar.E((byte[]) fhqVar.d.b, fhqVar.a(fhrVar.e), a);
            i -= a;
            fhrVar.d(a);
        }
    }

    @Override // defpackage.fmq
    public final void n(long j, int i, int i2, int i3, fmp fmpVar) {
        if (this.v) {
            if ((i & 1) != 0) {
                this.v = false;
            } else {
                return;
            }
        }
        if (this.y) {
            if (j >= this.g) {
                if ((i & 1) == 0) {
                    if (!this.z) {
                        eub.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.x))));
                        this.z = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        A(j, i, (this.a.e - i2) - i3, i2, fmpVar);
    }

    public final synchronized void o(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f + i <= this.q) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d.s(z);
        this.f += i;
    }

    public final synchronized boolean p() {
        return this.u;
    }

    public final synchronized boolean q(boolean z) {
        boolean z2 = true;
        if (!C()) {
            if (!z && !this.u) {
                eqn eqnVar = this.x;
                if (eqnVar != null) {
                    if (eqnVar == this.i) {
                        return false;
                    }
                } else {
                    z2 = false;
                }
            }
            return z2;
        }
        if (((fvq) this.A.j(a())).b != this.i) {
            return true;
        }
        return D(x(this.f));
    }

    public final synchronized boolean r(int i) {
        B();
        int i2 = this.e;
        if (i >= i2 && i <= this.q + i2) {
            this.g = Long.MIN_VALUE;
            this.f = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean s(long j, boolean z) {
        int w;
        B();
        int i = this.f;
        int x = x(i);
        if (C() && j >= this.o[x]) {
            if (j > this.t) {
                if (z) {
                    z = true;
                }
            }
            if (this.y) {
                w = this.q - i;
                int i2 = 0;
                while (true) {
                    if (i2 < w) {
                        if (this.o[x] < j) {
                            x++;
                            if (x == this.j) {
                                x = 0;
                            }
                            i2++;
                        } else {
                            w = i2;
                            break;
                        }
                    } else if (!z) {
                        w = -1;
                    }
                }
            } else {
                w = w(x, this.q - i, j, true);
            }
            if (w != -1) {
                this.g = j;
                this.f += w;
                return true;
            }
        }
        return false;
    }

    public final synchronized long t(long j, boolean z) {
        int i;
        int i2 = this.q;
        if (i2 != 0) {
            long[] jArr = this.o;
            int i3 = this.r;
            if (j >= jArr[i3]) {
                if (z && (i = this.f) != i2) {
                    i2 = i + 1;
                }
                int w = w(i3, i2, j, false);
                if (w != -1) {
                    return z(w);
                }
            }
        }
        return -1L;
    }

    @Override // defpackage.fmq
    public final int u(eqe eqeVar, int i, boolean z) {
        fhr fhrVar = this.a;
        int a = fhrVar.a(i);
        fhq fhqVar = fhrVar.d;
        int a2 = eqeVar.a((byte[]) fhqVar.d.b, fhqVar.a(fhrVar.e), a);
        if (a2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        fhrVar.d(a2);
        return a2;
    }

    public final synchronized int v(fqu fquVar, ewl ewlVar, boolean z, boolean z2, fhs fhsVar) {
        ewlVar.e = false;
        if (!C()) {
            if (!z2 && !this.u) {
                eqn eqnVar = this.x;
                if (eqnVar == null || (!z && eqnVar == this.i)) {
                    return -3;
                }
                F(eqnVar, fquVar);
                return -5;
            }
            ewlVar.a = 4;
            ewlVar.f = Long.MIN_VALUE;
            return -4;
        }
        Object obj = ((fvq) this.A.j(a())).b;
        if (!z && obj == this.i) {
            int x = x(this.f);
            if (!D(x)) {
                ewlVar.e = true;
                return -3;
            }
            ewlVar.a = this.n[x];
            if (this.f == this.q - 1 && (z2 || this.u)) {
                ewlVar.eP(536870912);
            }
            ewlVar.f = this.o[x];
            fhsVar.a = this.m[x];
            fhsVar.b = this.l[x];
            fhsVar.c = this.p[x];
            return -4;
        }
        F((eqn) obj, fquVar);
        return -5;
    }
}
