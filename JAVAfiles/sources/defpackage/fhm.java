package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhm implements fgt, flw, fjn, fht {
    public static final Map a;
    public static final eqn b;
    private final evg A;
    private final fdu B;
    private final long C;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private final fjl L;
    private gpx N;
    private final apuv O;
    public fgs g;
    public fod h;
    public boolean j;
    public fmk k;
    public long l;
    public boolean m;
    public boolean o;
    public boolean p;
    public long q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public final fhp v;
    public final lxs w;
    public final apuv x;
    private final Uri z;
    public final fjq c = new fjq();
    private final aqws M = new aqws((char[]) null);
    public final Runnable d = new fhg(this, 1);
    public final Runnable e = new fhg(this, 0);
    public final Handler f = eul.C();
    private fhl[] D = new fhl[0];
    public fhu[] i = new fhu[0];
    private long K = -9223372036854775807L;
    public int n = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        a = DesugarCollections.unmodifiableMap(hashMap);
        eqm eqmVar = new eqm();
        eqmVar.a = "icy";
        eqmVar.b("application/x-icy");
        b = new eqn(eqmVar);
    }

    public fhm(Uri uri, evg evgVar, lxs lxsVar, fdu fduVar, apuv apuvVar, apuv apuvVar2, fhp fhpVar, fjl fjlVar, long j) {
        this.z = uri;
        this.A = evgVar;
        this.B = fduVar;
        this.O = apuvVar;
        this.x = apuvVar2;
        this.v = fhpVar;
        this.L = fjlVar;
        this.w = lxsVar;
        this.C = j;
    }

    private final void A() {
        fhj fhjVar = new fhj(this, this.z, this.A, this.w, this, this.M);
        if (this.j) {
            dzg.d(B());
            long j = this.l;
            if (j != -9223372036854775807L && this.K > j) {
                this.t = true;
                this.K = -9223372036854775807L;
                return;
            }
            fmk fmkVar = this.k;
            dzg.g(fmkVar);
            fhjVar.b(fmkVar.b(this.K).a.c, this.K);
            for (fhu fhuVar : this.i) {
                fhuVar.g = this.K;
            }
            this.K = -9223372036854775807L;
        }
        this.s = b();
        fjq fjqVar = this.c;
        Looper myLooper = Looper.myLooper();
        dzg.h(myLooper);
        fjqVar.d = null;
        SystemClock.elapsedRealtime();
        new fjo(fjqVar, myLooper, fhjVar, this).b(0L);
        evl evlVar = fhjVar.h;
        this.x.w(new fgm(evlVar), new fgr(-1, null, eul.z(fhjVar.g), eul.z(this.l)));
    }

    private final boolean B() {
        if (this.K != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    private final void z() {
        dzg.d(this.j);
        dzg.g(this.N);
        dzg.g(this.k);
    }

    @Override // defpackage.fgt
    public final long a(long j, fbi fbiVar) {
        boolean z;
        z();
        if (!this.k.c()) {
            return 0L;
        }
        fmi b2 = this.k.b(j);
        fml fmlVar = b2.a;
        fml fmlVar2 = b2.b;
        long j2 = fbiVar.c;
        if (j2 == 0) {
            if (fbiVar.d == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = fmlVar.b;
        int i = eul.a;
        long j4 = j - j2;
        long j5 = fbiVar.d;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z2 = true;
        if (j4 <= j3 && j3 <= j6) {
            z = true;
        } else {
            z = false;
        }
        long j9 = fmlVar2.b;
        if (j4 > j9 || j9 > j6) {
            z2 = false;
        }
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j9 - j)) {
                return j9;
            }
        } else if (!z) {
            if (z2) {
                return j9;
            }
            return j4;
        }
        return j3;
    }

    public final int b() {
        int i = 0;
        for (fhu fhuVar : this.i) {
            i += fhuVar.c();
        }
        return i;
    }

    public final long c(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.i.length; i++) {
            if (!z) {
                gpx gpxVar = this.N;
                dzg.g(gpxVar);
                if (!((boolean[]) gpxVar.a)[i]) {
                }
            }
            j = Math.max(j, this.i[i].e());
        }
        return j;
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long d() {
        long j;
        z();
        if (this.t || this.J == 0) {
            return Long.MIN_VALUE;
        }
        if (B()) {
            return this.K;
        }
        if (this.F) {
            int length = this.i.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                gpx gpxVar = this.N;
                if (((boolean[]) gpxVar.d)[i] && ((boolean[]) gpxVar.a)[i] && !this.i[i].p()) {
                    j = Math.min(j, this.i[i].e());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = c(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.q;
        }
        return j;
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long e() {
        return d();
    }

    @Override // defpackage.fgt
    public final long f() {
        if (this.I) {
            this.I = false;
        } else if (this.o) {
            if (this.t || b() > this.s) {
                this.o = false;
            } else {
                return -9223372036854775807L;
            }
        } else {
            return -9223372036854775807L;
        }
        return this.q;
    }

    @Override // defpackage.fgt
    public final long g(long j) {
        boolean s;
        z();
        Object obj = this.N.d;
        if (true != this.k.c()) {
            j = 0;
        }
        int i = 0;
        this.o = false;
        this.q = j;
        if (B()) {
            this.K = j;
            return j;
        }
        if (this.n != 7 && (this.t || this.c.b())) {
            int length = this.i.length;
            for (int i2 = 0; i2 < length; i2++) {
                fhu fhuVar = this.i[i2];
                if (this.G) {
                    s = fhuVar.r(fhuVar.e);
                } else {
                    s = fhuVar.s(j, false);
                }
                if (s || (!((boolean[]) obj)[i2] && this.F)) {
                }
            }
            return j;
        }
        this.r = false;
        this.K = j;
        this.t = false;
        this.I = false;
        fjq fjqVar = this.c;
        if (fjqVar.b()) {
            fhu[] fhuVarArr = this.i;
            int length2 = fhuVarArr.length;
            while (i < length2) {
                fhuVarArr[i].g();
                i++;
            }
            this.c.a();
        } else {
            fjqVar.d = null;
            fhu[] fhuVarArr2 = this.i;
            int length3 = fhuVarArr2.length;
            while (i < length3) {
                fhuVarArr2[i].j();
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.fgt
    public final long h(fje[] fjeVarArr, boolean[] zArr, fhv[] fhvVarArr, boolean[] zArr2, long j) {
        boolean z;
        fje fjeVar;
        boolean z2;
        boolean z3;
        z();
        gpx gpxVar = this.N;
        Object obj = gpxVar.c;
        Object obj2 = gpxVar.a;
        int i = this.J;
        int i2 = 0;
        for (int i3 = 0; i3 < fjeVarArr.length; i3++) {
            fhv fhvVar = fhvVarArr[i3];
            if (fhvVar != null && (fjeVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((fhk) fhvVar).a;
                boolean[] zArr3 = (boolean[]) obj2;
                dzg.d(zArr3[i4]);
                this.J--;
                zArr3[i4] = false;
                fhvVarArr[i3] = null;
            }
        }
        if (!this.H ? !(j == 0 || this.G) : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < fjeVarArr.length; i5++) {
            if (fhvVarArr[i5] == null && (fjeVar = fjeVarArr[i5]) != null) {
                if (fjeVar.d() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dzg.d(z2);
                if (fjeVar.a(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                dzg.d(z3);
                int a2 = ((fid) obj).a(fjeVar.g());
                dzg.d(!r7[a2]);
                this.J++;
                ((boolean[]) obj2)[a2] = true;
                this.I = fjeVar.f().u | this.I;
                fhvVarArr[i5] = new fhk(this, a2);
                zArr2[i5] = true;
                if (!z) {
                    fhu fhuVar = this.i[a2];
                    if (fhuVar.a() != 0 && !fhuVar.s(j, true)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.J == 0) {
            this.r = false;
            this.o = false;
            this.I = false;
            if (this.c.b()) {
                fhu[] fhuVarArr = this.i;
                int length = fhuVarArr.length;
                while (i2 < length) {
                    fhuVarArr[i2].g();
                    i2++;
                }
                this.c.a();
            } else {
                this.t = false;
                fhu[] fhuVarArr2 = this.i;
                int length2 = fhuVarArr2.length;
                while (i2 < length2) {
                    fhuVarArr2[i2].j();
                    i2++;
                }
            }
        } else if (z) {
            j = g(j);
            while (i2 < fhvVarArr.length) {
                if (fhvVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.H = true;
        return j;
    }

    @Override // defpackage.fgt
    public final fid i() {
        z();
        return (fid) this.N.c;
    }

    @Override // defpackage.fgt
    public final void j() {
        v();
        if (this.t && !this.j) {
            throw new erm("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // defpackage.fgt
    public final void k(fgs fgsVar, long j) {
        this.g = fgsVar;
        this.M.h();
        A();
    }

    public final fmq m(fhl fhlVar) {
        int length = this.i.length;
        for (int i = 0; i < length; i++) {
            if (fhlVar.equals(this.D[i])) {
                return this.i[i];
            }
        }
        if (this.E) {
            eub.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + fhlVar.a + ") after finishing tracks.");
            return new flr();
        }
        fhu fhuVar = new fhu(this.L, this.B, this.O);
        fhuVar.c = this;
        int i2 = length + 1;
        fhl[] fhlVarArr = (fhl[]) Arrays.copyOf(this.D, i2);
        fhlVarArr[length] = fhlVar;
        int i3 = eul.a;
        this.D = fhlVarArr;
        fhu[] fhuVarArr = (fhu[]) Arrays.copyOf(this.i, i2);
        fhuVarArr[length] = fhuVar;
        this.i = fhuVarArr;
        return fhuVar;
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean n(fam famVar) {
        if (!this.t) {
            fjq fjqVar = this.c;
            if (fjqVar.d == null && !this.r) {
                if (!this.j || this.J != 0) {
                    boolean h = this.M.h();
                    if (!fjqVar.b()) {
                        A();
                        return true;
                    }
                    return h;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean o() {
        if (this.c.b() && this.M.g()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.flw
    public final fmq p(int i, int i2) {
        return m(new fhl(i, false));
    }

    @Override // defpackage.fgt
    public final void q(long j) {
        if (!this.G) {
            z();
            if (!B()) {
                Object obj = this.N.a;
                int length = this.i.length;
                for (int i = 0; i < length; i++) {
                    fhu fhuVar = this.i[i];
                    fhuVar.a.c(fhuVar.t(j, ((boolean[]) obj)[i]));
                }
            }
        }
    }

    @Override // defpackage.flw
    public final void r() {
        this.E = true;
        this.f.post(this.d);
    }

    public final void s() {
        boolean z;
        boolean z2;
        erk c;
        int i;
        if (!this.u && !this.j && this.E && this.k != null) {
            for (fhu fhuVar : this.i) {
                if (fhuVar.f() == null) {
                    return;
                }
            }
            this.M.i();
            int length = this.i.length;
            esa[] esaVarArr = new esa[length];
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                eqn f = this.i[i2].f();
                dzg.g(f);
                String str = f.o;
                boolean g = erl.g(str);
                if (!g && !erl.j(str)) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[i2] = z;
                this.F = z | this.F;
                boolean h = erl.h(str);
                if (this.C != -9223372036854775807L && length == 1 && h) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.G = z2;
                fod fodVar = this.h;
                if (fodVar != null) {
                    if (g || this.D[i2].b) {
                        erk erkVar = f.l;
                        if (erkVar == null) {
                            c = new erk(fodVar);
                        } else {
                            c = erkVar.c(fodVar);
                        }
                        eqm eqmVar = new eqm(f);
                        eqmVar.k = c;
                        f = new eqn(eqmVar);
                    }
                    if (g && f.h == -1 && f.i == -1 && (i = fodVar.a) != -1) {
                        eqm eqmVar2 = new eqm(f);
                        eqmVar2.h = i;
                        f = new eqn(eqmVar2);
                    }
                }
                eqn b2 = f.b(this.B.a(f));
                esaVarArr[i2] = new esa(Integer.toString(i2), b2);
                this.I = b2.u | this.I;
            }
            this.N = new gpx(new fid(esaVarArr), zArr);
            if (this.G && this.l == -9223372036854775807L) {
                this.l = this.C;
                this.k = new fhi(this, this.k);
            }
            this.v.u(this.l, this.k.c(), this.m);
            this.j = true;
            fgs fgsVar = this.g;
            dzg.g(fgsVar);
            fgsVar.c(this);
        }
    }

    public final void t(int i) {
        z();
        gpx gpxVar = this.N;
        boolean[] zArr = (boolean[]) gpxVar.b;
        if (!zArr[i]) {
            eqn a2 = ((fid) gpxVar.c).b(i).a(0);
            this.x.s(new fgr(erl.b(a2.o), a2, eul.z(this.q), -9223372036854775807L));
            zArr[i] = true;
        }
    }

    public final void u(int i) {
        z();
        Object obj = this.N.d;
        if (this.r && ((boolean[]) obj)[i]) {
            if (!this.i[i].q(false)) {
                this.K = 0L;
                this.r = false;
                this.o = true;
                this.q = 0L;
                this.s = 0;
                for (fhu fhuVar : this.i) {
                    fhuVar.j();
                }
                fgs fgsVar = this.g;
                dzg.g(fgsVar);
                fgsVar.b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        IOException iOException;
        int g = eec.g(this.n);
        fjq fjqVar = this.c;
        IOException iOException2 = fjqVar.d;
        if (iOException2 == null) {
            fjo fjoVar = fjqVar.c;
            if (fjoVar != null && (iOException = fjoVar.a) != null && fjoVar.b > g) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    @Override // defpackage.flw
    public final void w(fmk fmkVar) {
        this.f.post(new fhh(this, fmkVar, 0));
    }

    public final boolean x() {
        if (!this.o && !B()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fjn
    public final /* bridge */ /* synthetic */ void y(fhj fhjVar, boolean z) {
        ewb ewbVar = fhjVar.c;
        long j = fhjVar.a;
        evl evlVar = fhjVar.h;
        this.x.t(new fgm(), new fgr(-1, null, eul.z(fhjVar.g), eul.z(this.l)));
        if (!z) {
            for (fhu fhuVar : this.i) {
                fhuVar.j();
            }
            if (this.J > 0) {
                fgs fgsVar = this.g;
                dzg.g(fgsVar);
                fgsVar.b(this);
            }
        }
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final void l(long j) {
    }
}
