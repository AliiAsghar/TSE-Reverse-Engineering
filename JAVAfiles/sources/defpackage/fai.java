package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fai implements Handler.Callback, fgs, fjh, faw, ezl, faz {
    private static final long l = eul.z(10000);
    private fbi A;
    private fay B;
    private fag C;
    private boolean E;
    private boolean F;
    private boolean H;
    private int I;
    private boolean J;
    private boolean K;
    private int L;
    private fah M;
    private long N;
    private long O;
    private int P;
    private boolean Q;
    private ezo R;
    private final ezj T;
    private final qdq U;
    public final fbd[] a;
    public final fbf[] b;
    public final fji c;
    public final etu d;
    public final Looper e;
    public final fax f;
    public boolean g;
    public ezt h;
    public final fbt i;
    public final ezk j;
    public final agoe k;
    private final Set m;
    private final boolean[] n;
    private final fjk o;
    private final HandlerThread p;
    private final ery q;
    private final erx r;
    private final long s;
    private final ezm t;
    private final ArrayList u;
    private final eti v;
    private final far w;
    private final long x;
    private final fbz y;
    private final etu z;
    private boolean D = false;
    private long S = -9223372036854775807L;
    private long G = -9223372036854775807L;

    public fai(fbd[] fbdVarArr, fji fjiVar, agoe agoeVar, ezk ezkVar, fjk fjkVar, int i, boolean z, fbt fbtVar, fbi fbiVar, ezj ezjVar, long j, Looper looper, eti etiVar, qdq qdqVar, fbz fbzVar, ezt eztVar) {
        this.U = qdqVar;
        this.a = fbdVarArr;
        this.c = fjiVar;
        this.k = agoeVar;
        this.j = ezkVar;
        this.o = fjkVar;
        this.I = i;
        this.J = z;
        this.A = fbiVar;
        this.T = ezjVar;
        this.x = j;
        this.v = etiVar;
        this.y = fbzVar;
        this.h = eztVar;
        this.i = fbtVar;
        this.s = ezkVar.d;
        erz erzVar = erz.a;
        fay i2 = fay.i(agoeVar);
        this.B = i2;
        this.C = new fag(i2);
        int length = fbdVarArr.length;
        this.b = new fbf[length];
        this.n = new boolean[length];
        fbe d = fjiVar.d();
        for (int i3 = 0; i3 < fbdVarArr.length; i3++) {
            fbdVarArr[i3].q(i3, fbzVar, etiVar);
            this.b[i3] = fbdVarArr[i3].j();
            this.b[i3].F(d);
        }
        this.t = new ezm(this);
        this.u = new ArrayList();
        this.m = alzz.O();
        this.q = new ery();
        this.r = new erx();
        fjiVar.h = this;
        fjiVar.i = fjkVar;
        this.Q = true;
        etu b = etiVar.b(looper, null);
        this.z = b;
        this.w = new far(fbtVar, b, new qdq(this), eztVar);
        this.f = new fax(this, fbtVar, b, fbzVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.p = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.e = looper2;
        this.d = etiVar.b(looper2, this);
    }

    private final void A(int i, boolean z) {
        boolean[] zArr = this.n;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.z.b(new ebm(this, i, 2));
        }
    }

    private final void B() {
        agoe agoeVar;
        boolean z;
        float f = this.t.b().b;
        far farVar = this.w;
        fao faoVar = farVar.d;
        fao faoVar2 = farVar.e;
        agoe agoeVar2 = null;
        boolean z2 = true;
        while (faoVar != null && faoVar.e) {
            erz erzVar = this.B.b;
            agoe q = faoVar.q();
            if (faoVar == this.w.d) {
                agoeVar = q;
            } else {
                agoeVar = agoeVar2;
            }
            agoe agoeVar3 = faoVar.l;
            boolean z3 = false;
            if (agoeVar3 != null) {
                if (((fje[]) agoeVar3.d).length == ((fje[]) q.d).length) {
                    for (int i = 0; i < ((fje[]) q.d).length; i++) {
                        if (q.d(agoeVar3, i)) {
                        }
                    }
                    if (faoVar != faoVar2) {
                        z3 = true;
                    }
                    z2 = z3 & z2;
                    faoVar = faoVar.i;
                    agoeVar2 = agoeVar;
                }
            }
            if (z2) {
                far farVar2 = this.w;
                fao faoVar3 = farVar2.d;
                boolean n = farVar2.n(faoVar3);
                boolean[] zArr = new boolean[this.a.length];
                dzg.g(agoeVar);
                long o = faoVar3.o(agoeVar, this.B.s, n, zArr);
                fay fayVar = this.B;
                if (fayVar.f != 4 && o != fayVar.s) {
                    z = true;
                } else {
                    z = false;
                }
                fay fayVar2 = this.B;
                this.B = n(fayVar2.c, o, fayVar2.d, fayVar2.e, z, 5);
                if (z) {
                    F(o);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    fbd[] fbdVarArr = this.a;
                    if (i2 >= fbdVarArr.length) {
                        break;
                    }
                    fbd fbdVar = fbdVarArr[i2];
                    boolean U = U(fbdVar);
                    zArr2[i2] = U;
                    fhv fhvVar = faoVar3.c[i2];
                    if (U) {
                        if (fhvVar != fbdVar.l()) {
                            o(i2);
                        } else if (zArr[i2]) {
                            fbdVar.D(this.N);
                        }
                    }
                    i2++;
                }
                r(zArr2, this.N);
            } else {
                this.w.n(faoVar);
                if (faoVar.e) {
                    faoVar.p(q, Math.max(faoVar.g.b, faoVar.d(this.N)));
                }
            }
            t(true);
            if (this.B.f != 4) {
                x();
                Q();
                this.d.e(2);
                return;
            }
            return;
        }
    }

    private final void C() {
        B();
        I(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r5.equals(r33.B.c) == false) goto L34;
     */
    /* JADX WARN: Type inference failed for: r0v19, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [fdq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [fhb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [fgw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void D(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fai.D(boolean, boolean, boolean, boolean):void");
    }

    private final void E() {
        fao faoVar = this.w.d;
        boolean z = false;
        if (faoVar != null && faoVar.g.h && this.D) {
            z = true;
        }
        this.E = z;
    }

    private final void F(long j) {
        long e;
        fao faoVar = this.w.d;
        if (faoVar == null) {
            e = j + 1000000000000L;
        } else {
            e = faoVar.e(j);
        }
        this.N = e;
        this.t.a.d(e);
        for (fbd fbdVar : this.a) {
            if (U(fbdVar)) {
                fbdVar.D(this.N);
            }
        }
        for (fao faoVar2 = this.w.d; faoVar2 != null; faoVar2 = faoVar2.i) {
            for (fje fjeVar : (fje[]) faoVar2.l.d) {
            }
        }
    }

    private final void G(erz erzVar, erz erzVar2) {
        if (erzVar.q() && erzVar2.q()) {
            return;
        }
        int size = this.u.size() - 1;
        if (size < 0) {
            Collections.sort(this.u);
            return;
        }
        faf fafVar = (faf) this.u.get(size);
        Object obj = fafVar.b;
        fbb fbbVar = fafVar.a;
        throw null;
    }

    private final void H(long j) {
        long j2;
        if (this.B.f == 3 && !X()) {
            j2 = 1000;
        } else {
            j2 = l;
        }
        ((eui) this.d).b.sendEmptyMessageAtTime(2, j + j2);
    }

    private final void I(boolean z) {
        fgv fgvVar = this.w.d.g.a;
        long k = k(fgvVar, this.B.s, true, false);
        if (k != this.B.s) {
            fay fayVar = this.B;
            this.B = n(fgvVar, k, fayVar.d, fayVar.e, z, 5);
        }
    }

    private final void J(ero eroVar) {
        this.d.a(16);
        this.t.c(eroVar);
    }

    private final void K(boolean z, int i, boolean z2, int i2) {
        this.C.a(z2 ? 1 : 0);
        this.B = this.B.b(z, i2, i);
        S(false, false);
        for (fao faoVar = this.w.d; faoVar != null; faoVar = faoVar.i) {
            for (fje fjeVar : (fje[]) faoVar.l.d) {
            }
        }
        if (!X()) {
            O();
            Q();
            return;
        }
        int i3 = this.B.f;
        if (i3 == 3) {
            this.t.d();
            M();
            this.d.e(2);
        } else if (i3 == 2) {
            this.d.e(2);
        }
    }

    private final void L(int i) {
        fay fayVar = this.B;
        if (fayVar.f != i) {
            if (i != 2) {
                this.S = -9223372036854775807L;
            }
            this.B = fayVar.e(i);
        }
    }

    private final void M() {
        fao faoVar = this.w.d;
        if (faoVar != null) {
            agoe agoeVar = faoVar.l;
            for (int i = 0; i < this.a.length; i++) {
                if (agoeVar.c(i) && this.a[i].eK() == 1) {
                    this.a[i].I();
                }
            }
        }
    }

    private final void N(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.K) {
            z3 = false;
        } else {
            z3 = true;
        }
        D(z3, false, true, false);
        this.C.a(z2 ? 1 : 0);
        this.j.c(this.y);
        L(1);
    }

    private final void O() {
        this.t.e();
        for (fbd fbdVar : this.a) {
            if (U(fbdVar)) {
                aa(fbdVar);
            }
        }
    }

    private final void P() {
        boolean z;
        fao faoVar = this.w.f;
        if (!this.H && (faoVar == null || !faoVar.a.o())) {
            z = false;
        } else {
            z = true;
        }
        fay fayVar = this.B;
        if (z != fayVar.h) {
            erz erzVar = fayVar.b;
            fgv fgvVar = fayVar.c;
            long j = fayVar.d;
            long j2 = fayVar.e;
            int i = fayVar.f;
            ezo ezoVar = fayVar.g;
            fid fidVar = fayVar.i;
            agoe agoeVar = fayVar.u;
            List list = fayVar.j;
            fgv fgvVar2 = fayVar.k;
            boolean z2 = fayVar.l;
            int i2 = fayVar.m;
            int i3 = fayVar.n;
            ero eroVar = fayVar.o;
            long j3 = fayVar.q;
            long j4 = fayVar.r;
            long j5 = fayVar.s;
            long j6 = fayVar.t;
            boolean z3 = fayVar.p;
            this.B = new fay(erzVar, fgvVar, j, j2, i, ezoVar, z, fidVar, agoeVar, list, fgvVar2, z2, i2, i3, eroVar, j3, j4, j5, j6, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x013e, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Q() {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fai.Q():void");
    }

    private final void R(erz erzVar, fgv fgvVar, erz erzVar2, fgv fgvVar2, long j, boolean z) {
        Object obj;
        ero eroVar;
        if (!Y(erzVar, fgvVar)) {
            if (fgvVar.b()) {
                eroVar = ero.a;
            } else {
                eroVar = this.B.o;
            }
            if (!this.t.b().equals(eroVar)) {
                J(eroVar);
                w(this.B.o, eroVar.b, false, false);
                return;
            }
            return;
        }
        erzVar.p(erzVar.o(fgvVar.a, this.r).c, this.q);
        ezj ezjVar = this.T;
        era eraVar = this.q.j;
        int i = eul.a;
        ezjVar.h = eul.u(eraVar.a);
        ezjVar.j = eul.u(eraVar.b);
        ezjVar.k = eul.u(eraVar.c);
        float f = eraVar.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        ezjVar.n = f;
        float f2 = eraVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        ezjVar.m = f2;
        if (f == 1.0f && f2 == 1.0f) {
            ezjVar.h = -9223372036854775807L;
        }
        ezjVar.a();
        if (j != -9223372036854775807L) {
            this.T.b(g(erzVar, fgvVar.a, j));
            return;
        }
        Object obj2 = this.q.b;
        if (!erzVar2.q()) {
            obj = erzVar2.p(erzVar2.o(fgvVar2.a, this.r).c, this.q).b;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj2) && !z) {
            return;
        }
        this.T.b(-9223372036854775807L);
    }

    private final void S(boolean z, boolean z2) {
        this.F = z;
        long j = -9223372036854775807L;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.G = j;
    }

    private final synchronized void T(alhr alhrVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) alhrVar.get()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private static boolean U(fbd fbdVar) {
        if (fbdVar.eK() != 0) {
            return true;
        }
        return false;
    }

    private final boolean V() {
        fao faoVar = this.w.d;
        long j = faoVar.g.e;
        if (!faoVar.e) {
            return false;
        }
        if (j == -9223372036854775807L || this.B.s < j) {
            return true;
        }
        if (X()) {
            return false;
        }
        return true;
    }

    private static boolean W(fay fayVar, erx erxVar) {
        fgv fgvVar = fayVar.c;
        erz erzVar = fayVar.b;
        if (!erzVar.q() && !erzVar.o(fgvVar.a, erxVar).f) {
            return false;
        }
        return true;
    }

    private final boolean X() {
        fay fayVar = this.B;
        if (fayVar.l && fayVar.n == 0) {
            return true;
        }
        return false;
    }

    private final boolean Y(erz erzVar, fgv fgvVar) {
        if (!fgvVar.b() && !erzVar.q()) {
            erzVar.p(erzVar.o(fgvVar.a, this.r).c, this.q);
            if (this.q.c()) {
                ery eryVar = this.q;
                if (eryVar.i && eryVar.f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static eqn[] Z(fje fjeVar) {
        int i;
        if (fjeVar != null) {
            i = fjeVar.d();
        } else {
            i = 0;
        }
        eqn[] eqnVarArr = new eqn[i];
        for (int i2 = 0; i2 < i; i2++) {
            eqnVarArr[i2] = fjeVar.e(i2);
        }
        return eqnVarArr;
    }

    static int a(ery eryVar, erx erxVar, int i, boolean z, Object obj, erz erzVar, erz erzVar2) {
        Object obj2 = erzVar.p(erzVar.o(obj, erxVar).c, eryVar).b;
        int i2 = 0;
        for (int i3 = 0; i3 < erzVar2.c(); i3++) {
            if (erzVar2.p(i3, eryVar).b.equals(obj2)) {
                return i3;
            }
        }
        int a = erzVar.a(obj);
        int b = erzVar.b();
        int i4 = a;
        int i5 = -1;
        while (true) {
            if (i2 >= b || i5 != -1) {
                break;
            }
            i4 = erzVar.i(i4, erxVar, eryVar, i, z);
            if (i4 == -1) {
                i5 = -1;
                break;
            }
            i5 = erzVar2.a(erzVar.f(i4));
            i2++;
        }
        if (i5 == -1) {
            return -1;
        }
        return erzVar2.n(i5, erxVar).c;
    }

    private static final void aa(fbd fbdVar) {
        if (fbdVar.eK() == 2) {
            fbdVar.J();
        }
    }

    private static final boolean ab(fao faoVar) {
        if (faoVar != null) {
            try {
                if (!faoVar.e) {
                    faoVar.a.j();
                } else {
                    for (fhv fhvVar : faoVar.c) {
                        if (fhvVar != null) {
                            fhvVar.b();
                        }
                    }
                }
                if (faoVar.b() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private static final void ac(fbd fbdVar, long j) {
        fbdVar.E();
        if (fbdVar instanceof fil) {
            fil filVar = (fil) fbdVar;
            dzg.d(filVar.g);
            filVar.j = j;
        }
    }

    private final void ad(agoe agoeVar) {
        erz erzVar = this.B.b;
        ezk ezkVar = this.j;
        HashMap hashMap = ezkVar.e;
        Object obj = agoeVar.d;
        appq appqVar = (appq) hashMap.get(this.y);
        dzg.g(appqVar);
        int i = 0;
        int i2 = 0;
        while (true) {
            fbd[] fbdVarArr = this.a;
            int i3 = 13107200;
            if (i < fbdVarArr.length) {
                if (((fje[]) obj)[i] != null) {
                    int eL = fbdVarArr[i].eL();
                    if (eL != 1) {
                        if (eL != 2) {
                            i3 = 131072;
                            if (eL != 3) {
                            }
                        } else {
                            i3 = 131072000;
                        }
                    }
                    i2 += i3;
                }
                i++;
            } else {
                appqVar.b = Math.max(13107200, i2);
                ezkVar.d();
                return;
            }
        }
    }

    public static final void f(fbb fbbVar) {
        fbbVar.c();
        try {
            fbbVar.a.p(fbbVar.b, fbbVar.c);
        } finally {
            fbbVar.a(true);
        }
    }

    private final long g(erz erzVar, Object obj, long j) {
        long elapsedRealtime;
        erzVar.p(erzVar.o(obj, this.r).c, this.q);
        ery eryVar = this.q;
        if (eryVar.f != -9223372036854775807L && eryVar.c()) {
            ery eryVar2 = this.q;
            if (eryVar2.i) {
                long j2 = eryVar2.g;
                if (j2 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j2 + SystemClock.elapsedRealtime();
                }
                long j3 = elapsedRealtime - this.q.f;
                return eul.u(j3) - (j + this.r.e);
            }
        }
        return -9223372036854775807L;
    }

    private final long h() {
        return i(this.B.q);
    }

    private final long i(long j) {
        fao faoVar = this.w.f;
        if (faoVar == null) {
            return 0L;
        }
        return Math.max(0L, j - faoVar.d(this.N));
    }

    private final long j(fgv fgvVar, long j, boolean z) {
        boolean z2;
        far farVar = this.w;
        if (farVar.d != farVar.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        return k(fgvVar, j, z2, z);
    }

    private final long k(fgv fgvVar, long j, boolean z, boolean z2) {
        far farVar;
        O();
        S(false, true);
        if (z2 || this.B.f == 3) {
            L(2);
        }
        fao faoVar = this.w.d;
        fao faoVar2 = faoVar;
        while (faoVar2 != null && !fgvVar.equals(faoVar2.g.a)) {
            faoVar2 = faoVar2.i;
        }
        if (z || faoVar != faoVar2 || (faoVar2 != null && faoVar2.e(j) < 0)) {
            for (int i = 0; i < this.a.length; i++) {
                o(i);
            }
            if (faoVar2 != null) {
                while (true) {
                    farVar = this.w;
                    if (farVar.d == faoVar2) {
                        break;
                    }
                    farVar.a();
                }
                farVar.n(faoVar2);
                faoVar2.k = 1000000000000L;
                q();
            }
        }
        if (faoVar2 != null) {
            this.w.n(faoVar2);
            if (!faoVar2.e) {
                faoVar2.g = faoVar2.g.b(j);
            } else if (faoVar2.f) {
                j = faoVar2.a.g(j);
                faoVar2.a.q(j - this.s);
            }
            F(j);
            x();
        } else {
            this.w.f();
            F(j);
        }
        t(false);
        this.d.e(2);
        return j;
    }

    private final Pair l(erz erzVar) {
        long j = 0;
        if (erzVar.q()) {
            return Pair.create(fay.a, 0L);
        }
        Pair l2 = erzVar.l(this.q, this.r, erzVar.g(this.J), -9223372036854775807L);
        fgv e = this.w.e(erzVar, l2.first, 0L);
        long longValue = ((Long) l2.second).longValue();
        if (e.b()) {
            erzVar.o(e.a, this.r);
            if (e.c == this.r.d(e.b)) {
                this.r.h();
            }
        } else {
            j = longValue;
        }
        return Pair.create(e, Long.valueOf(j));
    }

    private static Pair m(erz erzVar, fah fahVar, boolean z, int i, boolean z2, ery eryVar, erx erxVar) {
        erz erzVar2;
        Pair l2;
        erz erzVar3 = fahVar.a;
        if (erzVar.q()) {
            return null;
        }
        if (true == erzVar3.q()) {
            erzVar2 = erzVar;
        } else {
            erzVar2 = erzVar3;
        }
        try {
            l2 = erzVar2.l(eryVar, erxVar, fahVar.b, fahVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (erzVar.equals(erzVar2)) {
            return l2;
        }
        if (erzVar.a(l2.first) != -1) {
            if (erzVar2.o(l2.first, erxVar).f && erzVar2.p(erxVar.c, eryVar).n == erzVar2.a(l2.first)) {
                return erzVar.l(eryVar, erxVar, erzVar.o(l2.first, erxVar).c, fahVar.c);
            }
            return l2;
        }
        int a = a(eryVar, erxVar, i, z2, l2.first, erzVar2, erzVar);
        if (a != -1) {
            return erzVar.l(eryVar, erxVar, a, -9223372036854775807L);
        }
        return null;
    }

    private final fay n(fgv fgvVar, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        fid fidVar;
        agoe agoeVar;
        List list;
        fid fidVar2;
        agoe agoeVar2;
        alog alogVar;
        boolean z3 = false;
        if (!this.Q && j == this.B.s && fgvVar.equals(this.B.c)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.Q = z2;
        E();
        fay fayVar = this.B;
        fid fidVar3 = fayVar.i;
        agoe agoeVar3 = fayVar.u;
        List list2 = fayVar.j;
        if (this.f.h) {
            fao faoVar = this.w.d;
            if (faoVar == null) {
                fidVar2 = fid.a;
            } else {
                fidVar2 = faoVar.j;
            }
            if (faoVar == null) {
                agoeVar2 = this.k;
            } else {
                agoeVar2 = faoVar.l;
            }
            Object obj = agoeVar2.d;
            alob alobVar = new alob();
            boolean z4 = false;
            for (fje fjeVar : (fje[]) obj) {
                if (fjeVar != null) {
                    erk erkVar = fjeVar.e(0).l;
                    if (erkVar == null) {
                        alobVar.h(new erk(new erj[0]));
                    } else {
                        alobVar.h(erkVar);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                alogVar = alobVar.g();
            } else {
                int i2 = alog.d;
                alogVar = alsx.a;
            }
            if (faoVar != null) {
                fap fapVar = faoVar.g;
                if (fapVar.c != j2) {
                    faoVar.g = fapVar.a(j2);
                }
            }
            fao faoVar2 = this.w.d;
            if (faoVar2 != null) {
                agoe agoeVar4 = faoVar2.l;
                for (int i3 = 0; i3 < this.a.length; i3++) {
                    if (agoeVar4.c(i3)) {
                        if (this.a[i3].eL() != 1) {
                            break;
                        }
                        int i4 = ((fbg[]) agoeVar4.e)[i3].b;
                    }
                }
            }
            list = alogVar;
            fidVar = fidVar2;
            agoeVar = agoeVar2;
        } else if (!fgvVar.equals(fayVar.c)) {
            agoe agoeVar5 = this.k;
            fid fidVar4 = fid.a;
            int i5 = alog.d;
            agoeVar = agoeVar5;
            fidVar = fidVar4;
            list = alsx.a;
        } else {
            fidVar = fidVar3;
            agoeVar = agoeVar3;
            list = list2;
        }
        if (z) {
            fag fagVar = this.C;
            if (fagVar.d && fagVar.e != 5) {
                if (i == 5) {
                    z3 = true;
                }
                d.s(z3);
            } else {
                fagVar.a = true;
                fagVar.d = true;
                fagVar.e = i;
            }
        }
        return this.B.h(fgvVar, j, j2, j3, h(), fidVar, agoeVar, list);
    }

    private final void o(int i) {
        fbd fbdVar = this.a[i];
        if (!U(fbdVar)) {
            return;
        }
        A(i, false);
        ezm ezmVar = this.t;
        if (fbdVar == ezmVar.c) {
            ezmVar.d = null;
            ezmVar.c = null;
            ezmVar.e = true;
        }
        aa(fbdVar);
        fbdVar.n();
        this.L--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x056e, code lost:
    
        if (r7 != false) goto L304;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x067c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0304 A[EDGE_INSN: B:49:0x0304->B:50:0x0304 BREAK  A[LOOP:0: B:29:0x02b3->B:37:0x0301], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03a3  */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [int] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p() {
        /*
            Method dump skipped, instructions count: 1679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fai.p():void");
    }

    private final void q() {
        r(new boolean[this.a.length], this.w.e.c());
    }

    private final void r(boolean[] zArr, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        fan fanVar;
        fao faoVar = this.w.e;
        agoe agoeVar = faoVar.l;
        for (int i = 0; i < this.a.length; i++) {
            if (!agoeVar.c(i) && this.m.remove(this.a[i])) {
                this.a[i].C();
            }
        }
        for (int i2 = 0; i2 < this.a.length; i2++) {
            if (agoeVar.c(i2)) {
                boolean z4 = zArr[i2];
                fbd fbdVar = this.a[i2];
                if (U(fbdVar)) {
                    continue;
                } else {
                    far farVar = this.w;
                    fao faoVar2 = farVar.e;
                    if (faoVar2 == farVar.d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    agoe agoeVar2 = faoVar2.l;
                    fbg fbgVar = ((fbg[]) agoeVar2.e)[i2];
                    eqn[] Z = Z(((fje[]) agoeVar2.d)[i2]);
                    if (X() && this.B.f == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z4 && z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.L++;
                    this.m.add(fbdVar);
                    fbdVar.N(fbgVar, Z, faoVar2.c[i2], z3, z, j, faoVar2.k, faoVar2.g.a);
                    fbdVar.p(11, new qdq(this, null));
                    ezm ezmVar = this.t;
                    fan i3 = fbdVar.i();
                    if (i3 != null && i3 != (fanVar = ezmVar.d)) {
                        if (fanVar == null) {
                            ezmVar.d = i3;
                            ezmVar.c = fbdVar;
                            ezmVar.d.c(ezmVar.a.a);
                        } else {
                            throw new ezo(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z2 && z) {
                        fbdVar.I();
                    }
                }
            }
        }
        faoVar.h = true;
    }

    private final void s(IOException iOException, int i) {
        ezo ezoVar = new ezo(0, iOException, i);
        fao faoVar = this.w.d;
        if (faoVar != null) {
            ezoVar = ezoVar.a(faoVar.g.a);
        }
        eub.d("ExoPlayerImplInternal", "Playback error", ezoVar);
        N(false, false);
        this.B = this.B.c(ezoVar);
    }

    private final void t(boolean z) {
        fgv fgvVar;
        long a;
        fao faoVar = this.w.f;
        if (faoVar == null) {
            fgvVar = this.B.c;
        } else {
            fgvVar = faoVar.g.a;
        }
        boolean equals = this.B.k.equals(fgvVar);
        if (!equals) {
            this.B = this.B.a(fgvVar);
        }
        fay fayVar = this.B;
        if (faoVar == null) {
            a = fayVar.s;
        } else {
            a = faoVar.a();
        }
        fayVar.q = a;
        this.B.r = h();
        if ((!equals || z) && faoVar != null && faoVar.e) {
            fgv fgvVar2 = faoVar.g.a;
            ad(faoVar.l);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x033f, code lost:
    
        if (r0.n(r5) == false) goto L198;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0474 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b0  */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [int] */
    /* JADX WARN: Type inference failed for: r6v56 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void u(defpackage.erz r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fai.u(erz, boolean):void");
    }

    private final void v(ero eroVar, boolean z) {
        w(eroVar, eroVar.b, true, z);
    }

    private final void w(ero eroVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.C.a(1);
            }
            this.B = this.B.d(eroVar);
        }
        float f2 = eroVar.b;
        fao faoVar = this.w.d;
        while (true) {
            i = 0;
            if (faoVar == null) {
                break;
            }
            fje[] fjeVarArr = (fje[]) faoVar.l.d;
            int length = fjeVarArr.length;
            while (i < length) {
                fje fjeVar = fjeVarArr[i];
                i++;
            }
            faoVar = faoVar.i;
        }
        fbd[] fbdVarArr = this.a;
        int length2 = fbdVarArr.length;
        while (i < length2) {
            fbd fbdVar = fbdVarArr[i];
            if (fbdVar != null) {
                fbdVar.G(f, eroVar.b);
            }
            i++;
        }
    }

    private final void x() {
        long j;
        boolean e;
        if (!ab(this.w.f)) {
            e = false;
        } else {
            fao faoVar = this.w.f;
            long i = i(faoVar.b());
            if (faoVar == this.w.d) {
                faoVar.d(this.N);
            } else {
                faoVar.d(this.N);
                long j2 = faoVar.g.b;
            }
            if (Y(this.B.b, faoVar.g.a)) {
                j = this.T.l;
            } else {
                j = -9223372036854775807L;
            }
            long j3 = j;
            fbz fbzVar = this.y;
            erz erzVar = this.B.b;
            fgv fgvVar = faoVar.g.a;
            float f = this.t.b().b;
            boolean z = this.B.l;
            fak fakVar = new fak(fbzVar, i, f, this.F, j3);
            e = this.j.e(fakVar);
            fao faoVar2 = this.w.d;
            if (!e && faoVar2.e && i < 500000 && this.s > 0) {
                faoVar2.a.q(this.B.s);
                e = this.j.e(fakVar);
            }
        }
        this.H = e;
        if (e) {
            this.w.f.f(this.N, this.t.b().b, this.G);
        }
        P();
    }

    private final void y() {
        this.w.g();
        fao faoVar = this.w.g;
        if (faoVar != null) {
            if ((!faoVar.d || faoVar.e) && !faoVar.a.o()) {
                ezk ezkVar = this.j;
                erz erzVar = this.B.b;
                fgv fgvVar = faoVar.g.a;
                if (faoVar.e) {
                    faoVar.a.d();
                }
                Iterator it = ezkVar.e.values().iterator();
                while (it.hasNext()) {
                    if (((appq) it.next()).a) {
                        return;
                    }
                }
                if (!faoVar.d) {
                    faoVar.g(this, faoVar.g.b);
                } else {
                    faoVar.f(this.N, this.B.o.b, this.G);
                }
            }
        }
    }

    private final void z() {
        boolean z;
        fag fagVar = this.C;
        fay fayVar = this.B;
        boolean z2 = fagVar.a;
        if (fagVar.b != fayVar) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        fagVar.a = z3;
        fagVar.b = fayVar;
        if (z3) {
            this.U.I(fagVar);
            this.C = new fag(this.B);
        }
    }

    @Override // defpackage.fhw
    public final /* bridge */ /* synthetic */ void b(fhx fhxVar) {
        this.d.g(9, (fgt) fhxVar).f();
    }

    @Override // defpackage.fgs
    public final void c(fgt fgtVar) {
        this.d.g(8, fgtVar).f();
    }

    @Override // defpackage.faz
    public final synchronized void d(fbb fbbVar) {
        if (!this.g && this.e.getThread().isAlive()) {
            this.d.g(14, fbbVar).f();
            return;
        }
        eub.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        fbbVar.a(false);
    }

    public final synchronized boolean e() {
        if (!this.g && this.e.getThread().isAlive()) {
            this.d.e(7);
            T(new ezp(this, 10), this.x);
            return this.g;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[Catch: RuntimeException -> 0x05ae, IOException -> 0x05d9, ffw -> 0x05e2, evi -> 0x05eb, erm -> 0x05f4, fdo -> 0x060b, ezo -> 0x0614, TryCatch #8 {erm -> 0x05f4, evi -> 0x05eb, ezo -> 0x0614, fdo -> 0x060b, ffw -> 0x05e2, IOException -> 0x05d9, RuntimeException -> 0x05ae, blocks: (B:3:0x0007, B:4:0x0010, B:7:0x0014, B:13:0x0036, B:15:0x0045, B:16:0x004f, B:19:0x006d, B:20:0x007d, B:22:0x0085, B:24:0x0098, B:29:0x00a1, B:30:0x00b8, B:33:0x00cb, B:36:0x00d4, B:39:0x00e2, B:41:0x00e8, B:43:0x0100, B:46:0x0109, B:47:0x010e, B:48:0x0113, B:51:0x011a, B:53:0x0123, B:55:0x012b, B:57:0x0133, B:58:0x013e, B:60:0x0153, B:61:0x0169, B:62:0x0174, B:65:0x0187, B:68:0x0190, B:70:0x01a1, B:73:0x01bd, B:75:0x01cb, B:77:0x01da, B:78:0x01de, B:79:0x01eb, B:81:0x01f8, B:82:0x020c, B:83:0x022a, B:84:0x0233, B:86:0x0243, B:87:0x024f, B:88:0x0260, B:90:0x026c, B:93:0x0277, B:94:0x027e, B:95:0x0289, B:98:0x0290, B:100:0x0298, B:102:0x029c, B:104:0x02a2, B:106:0x02aa, B:108:0x02b2, B:110:0x02b5, B:115:0x02ba, B:124:0x02c7, B:126:0x02c8, B:129:0x02cf, B:131:0x02df, B:132:0x02e2, B:134:0x02e7, B:136:0x02f9, B:137:0x02fc, B:138:0x0301, B:139:0x0306, B:141:0x0312, B:142:0x031e, B:144:0x0326, B:145:0x032b, B:147:0x0337, B:149:0x0342, B:150:0x0351, B:152:0x0360, B:153:0x0380, B:154:0x0385, B:155:0x0388, B:157:0x0390, B:159:0x039e, B:163:0x03a3, B:165:0x03c0, B:258:0x03f3, B:260:0x03f7, B:261:0x03fa, B:270:0x0405, B:167:0x041b, B:168:0x0420, B:169:0x0428, B:170:0x043a, B:172:0x045c, B:179:0x0574, B:180:0x053e, B:203:0x053a, B:218:0x0585, B:219:0x0595, B:226:0x047e, B:229:0x0491, B:231:0x04a1, B:233:0x04b8, B:235:0x04c2, B:242:0x0596, B:243:0x059b, B:246:0x05a2, B:273:0x0407, B:275:0x040c, B:276:0x040f, B:280:0x0416, B:285:0x041a), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[Catch: RuntimeException -> 0x05ae, IOException -> 0x05d9, ffw -> 0x05e2, evi -> 0x05eb, erm -> 0x05f4, fdo -> 0x060b, ezo -> 0x0614, LOOP:0: B:20:0x007d->B:22:0x0085, LOOP_END, TryCatch #8 {erm -> 0x05f4, evi -> 0x05eb, ezo -> 0x0614, fdo -> 0x060b, ffw -> 0x05e2, IOException -> 0x05d9, RuntimeException -> 0x05ae, blocks: (B:3:0x0007, B:4:0x0010, B:7:0x0014, B:13:0x0036, B:15:0x0045, B:16:0x004f, B:19:0x006d, B:20:0x007d, B:22:0x0085, B:24:0x0098, B:29:0x00a1, B:30:0x00b8, B:33:0x00cb, B:36:0x00d4, B:39:0x00e2, B:41:0x00e8, B:43:0x0100, B:46:0x0109, B:47:0x010e, B:48:0x0113, B:51:0x011a, B:53:0x0123, B:55:0x012b, B:57:0x0133, B:58:0x013e, B:60:0x0153, B:61:0x0169, B:62:0x0174, B:65:0x0187, B:68:0x0190, B:70:0x01a1, B:73:0x01bd, B:75:0x01cb, B:77:0x01da, B:78:0x01de, B:79:0x01eb, B:81:0x01f8, B:82:0x020c, B:83:0x022a, B:84:0x0233, B:86:0x0243, B:87:0x024f, B:88:0x0260, B:90:0x026c, B:93:0x0277, B:94:0x027e, B:95:0x0289, B:98:0x0290, B:100:0x0298, B:102:0x029c, B:104:0x02a2, B:106:0x02aa, B:108:0x02b2, B:110:0x02b5, B:115:0x02ba, B:124:0x02c7, B:126:0x02c8, B:129:0x02cf, B:131:0x02df, B:132:0x02e2, B:134:0x02e7, B:136:0x02f9, B:137:0x02fc, B:138:0x0301, B:139:0x0306, B:141:0x0312, B:142:0x031e, B:144:0x0326, B:145:0x032b, B:147:0x0337, B:149:0x0342, B:150:0x0351, B:152:0x0360, B:153:0x0380, B:154:0x0385, B:155:0x0388, B:157:0x0390, B:159:0x039e, B:163:0x03a3, B:165:0x03c0, B:258:0x03f3, B:260:0x03f7, B:261:0x03fa, B:270:0x0405, B:167:0x041b, B:168:0x0420, B:169:0x0428, B:170:0x043a, B:172:0x045c, B:179:0x0574, B:180:0x053e, B:203:0x053a, B:218:0x0585, B:219:0x0595, B:226:0x047e, B:229:0x0491, B:231:0x04a1, B:233:0x04b8, B:235:0x04c2, B:242:0x0596, B:243:0x059b, B:246:0x05a2, B:273:0x0407, B:275:0x040c, B:276:0x040f, B:280:0x0416, B:285:0x041a), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Type inference failed for: r2v109, types: [ewc, fjk] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r24) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fai.handleMessage(android.os.Message):boolean");
    }
}
