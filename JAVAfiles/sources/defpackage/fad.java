package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fad extends eqb implements ExoPlayer {
    public static final /* synthetic */ int G = 0;
    public fay A;
    public int B;
    public long C;
    public final fbt D;
    final agoe E;
    public final atkm F;
    private final Context H;
    private final fbd[] I;
    private final fji J;
    private final CopyOnWriteArraySet K;
    private final boolean L;
    private final fgu M;
    private final fjk N;
    private final long O;
    private final long P;
    private final long Q;
    private final eti R;
    private final long S;
    private fbi T;
    private ezt U;
    private int V;
    private eug W;
    private int X;
    private epz Y;
    private boolean Z;
    private boolean aa;
    private int ab;
    private final aqws ac = new aqws((char[]) null);
    private kkc ad;
    private final qdq ae;
    final erp b;
    public final ert c;
    public final etu d;
    public final fai e;
    public final ety f;
    public final erx g;
    public final List h;
    public final Looper i;
    public final faa j;
    public final fab k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public boolean p;
    public erp q;
    public erh r;
    public Object s;
    public Surface t;
    public SurfaceHolder u;
    public boolean v;
    public boolean w;
    public eta x;
    public esn y;
    public erh z;

    static {
        erf.b("media3.exoplayer");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01ad A[Catch: all -> 0x0338, TryCatch #0 {all -> 0x0338, blocks: (B:3:0x0013, B:6:0x008d, B:8:0x0111, B:10:0x0119, B:12:0x017c, B:16:0x018a, B:18:0x01ad, B:20:0x01fa, B:23:0x025b, B:25:0x02b6, B:26:0x02c1, B:31:0x0257, B:32:0x01b7, B:36:0x01d6, B:38:0x01e7, B:39:0x01ee, B:40:0x01cb), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02b6 A[Catch: all -> 0x0338, TryCatch #0 {all -> 0x0338, blocks: (B:3:0x0013, B:6:0x008d, B:8:0x0111, B:10:0x0119, B:12:0x017c, B:16:0x018a, B:18:0x01ad, B:20:0x01fa, B:23:0x025b, B:25:0x02b6, B:26:0x02c1, B:31:0x0257, B:32:0x01b7, B:36:0x01d6, B:38:0x01e7, B:39:0x01ee, B:40:0x01cb), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0257 A[Catch: all -> 0x0338, TryCatch #0 {all -> 0x0338, blocks: (B:3:0x0013, B:6:0x008d, B:8:0x0111, B:10:0x0119, B:12:0x017c, B:16:0x018a, B:18:0x01ad, B:20:0x01fa, B:23:0x025b, B:25:0x02b6, B:26:0x02c1, B:31:0x0257, B:32:0x01b7, B:36:0x01d6, B:38:0x01e7, B:39:0x01ee, B:40:0x01cb), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b7 A[Catch: all -> 0x0338, TryCatch #0 {all -> 0x0338, blocks: (B:3:0x0013, B:6:0x008d, B:8:0x0111, B:10:0x0119, B:12:0x017c, B:16:0x018a, B:18:0x01ad, B:20:0x01fa, B:23:0x025b, B:25:0x02b6, B:26:0x02c1, B:31:0x0257, B:32:0x01b7, B:36:0x01d6, B:38:0x01e7, B:39:0x01ee, B:40:0x01cb), top: B:2:0x0013 }] */
    /* JADX WARN: Type inference failed for: r8v12, types: [fjk, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fad(defpackage.ezs r30) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fad.<init>(ezs):void");
    }

    private final int ai(fay fayVar) {
        if (fayVar.b.q()) {
            return this.B;
        }
        return fayVar.b.o(fayVar.c.a, this.g).c;
    }

    private final long aj(fay fayVar) {
        if (fayVar.c.b()) {
            fayVar.b.o(fayVar.c.a, this.g);
            if (fayVar.d == -9223372036854775807L) {
                return fayVar.b.p(ai(fayVar), this.a).a();
            }
            return this.g.f() + eul.z(fayVar.d);
        }
        return eul.z(ak(fayVar));
    }

    private final long ak(fay fayVar) {
        if (fayVar.b.q()) {
            return eul.u(this.C);
        }
        boolean z = fayVar.p;
        long j = fayVar.s;
        if (fayVar.c.b()) {
            return j;
        }
        return S(fayVar.b, fayVar.c, j);
    }

    private static long al(fay fayVar) {
        ery eryVar = new ery();
        erx erxVar = new erx();
        fayVar.b.o(fayVar.c.a, erxVar);
        long j = fayVar.d;
        if (j == -9223372036854775807L) {
            return fayVar.b.p(erxVar.c, eryVar).l;
        }
        return erxVar.e + j;
    }

    private final Pair am(erz erzVar, int i, long j) {
        if (erzVar.q()) {
            this.B = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.C = j;
            return null;
        }
        if (i == -1 || i >= erzVar.c()) {
            i = erzVar.g(this.m);
            j = erzVar.p(i, this.a).a();
        }
        return erzVar.l(this.a, this.g, i, eul.u(j));
    }

    private final fay an(fay fayVar, erz erzVar, Pair pair) {
        boolean z;
        fgv fgvVar;
        fid fidVar;
        fgv fgvVar2;
        agoe agoeVar;
        List list;
        fay h;
        long j;
        if (!erzVar.q() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        d.s(z);
        erz erzVar2 = fayVar.b;
        long aj = aj(fayVar);
        fay f = fayVar.f(erzVar);
        if (erzVar.q()) {
            fgv fgvVar3 = fay.a;
            long u = eul.u(this.C);
            agoe agoeVar2 = this.E;
            fid fidVar2 = fid.a;
            int i = alog.d;
            fay a = f.h(fgvVar3, u, u, u, 0L, fidVar2, agoeVar2, alsx.a).a(fgvVar3);
            a.q = a.s;
            return a;
        }
        Object obj = f.c.a;
        int i2 = eul.a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            fgvVar = new fgv(pair.first);
        } else {
            fgvVar = f.c;
        }
        fgv fgvVar4 = fgvVar;
        long longValue = ((Long) pair.second).longValue();
        long u2 = eul.u(aj);
        if (!erzVar2.q()) {
            u2 -= erzVar2.o(obj, this.g).e;
        }
        if (equals && longValue >= u2) {
            if (longValue == u2) {
                int a2 = erzVar.a(f.k.a);
                if (a2 == -1 || erzVar.n(a2, this.g).c != erzVar.o(fgvVar4.a, this.g).c) {
                    erzVar.o(fgvVar4.a, this.g);
                    if (fgvVar4.b()) {
                        j = this.g.e(fgvVar4.b, fgvVar4.c);
                    } else {
                        j = this.g.d;
                    }
                    h = f.h(fgvVar4, f.s, f.s, f.e, j - f.s, f.i, f.u, f.j).a(fgvVar4);
                    h.q = j;
                } else {
                    return f;
                }
            } else {
                dzg.d(!fgvVar4.b());
                long max = Math.max(0L, f.r - (longValue - u2));
                long j2 = f.q;
                if (f.k.equals(f.c)) {
                    j2 = longValue + max;
                }
                h = f.h(fgvVar4, longValue, longValue, longValue, max, f.i, f.u, f.j);
                h.q = j2;
            }
            return h;
        }
        dzg.d(!fgvVar4.b());
        if (!equals) {
            fidVar = fid.a;
        } else {
            fidVar = f.i;
        }
        fid fidVar3 = fidVar;
        if (!equals) {
            fgvVar2 = fgvVar4;
            agoeVar = this.E;
        } else {
            fgvVar2 = fgvVar4;
            agoeVar = f.u;
        }
        agoe agoeVar3 = agoeVar;
        if (!equals) {
            int i3 = alog.d;
            list = alsx.a;
        } else {
            list = f.j;
        }
        fay a3 = f.h(fgvVar2, longValue, longValue, longValue, 0L, fidVar3, agoeVar3, list).a(fgvVar2);
        a3.q = longValue;
        return a3;
    }

    @Override // defpackage.ert
    public final long A() {
        ag();
        return eul.z(ak(this.A));
    }

    @Override // defpackage.ert
    public final long B() {
        ag();
        if (R()) {
            fay fayVar = this.A;
            fgv fgvVar = fayVar.c;
            fayVar.b.o(fgvVar.a, this.g);
            return eul.z(this.g.e(fgvVar.b, fgvVar.c));
        }
        return c();
    }

    @Override // defpackage.ert
    public final long C() {
        ag();
        return this.Q;
    }

    @Override // defpackage.ert
    public final long D() {
        ag();
        return this.O;
    }

    @Override // defpackage.ert
    public final long E() {
        ag();
        return this.P;
    }

    @Override // defpackage.ert
    public final ero F() {
        ag();
        return this.A.o;
    }

    @Override // defpackage.ert
    public final erp G() {
        ag();
        return this.q;
    }

    @Override // defpackage.ert
    public final erz H() {
        ag();
        return this.A.b;
    }

    @Override // defpackage.ert
    public final ese I() {
        ag();
        return this.J.c();
    }

    @Override // defpackage.ert
    public final esg J() {
        ag();
        return (esg) this.A.u.b;
    }

    @Override // defpackage.ert
    public final void K(err errVar) {
        dzg.g(errVar);
        this.f.b(errVar);
    }

    @Override // defpackage.ert
    public final void L() {
        int i;
        ag();
        ah(P(), 1);
        fay fayVar = this.A;
        if (fayVar.f != 1) {
            return;
        }
        fay c = fayVar.c(null);
        if (true != c.b.q()) {
            i = 2;
        } else {
            i = 4;
        }
        fay e = c.e(i);
        this.n++;
        this.e.d.f(29).f();
        ae(e, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.ert
    public final void M(err errVar) {
        ag();
        dzg.g(errVar);
        ety etyVar = this.f;
        etyVar.g();
        Iterator it = etyVar.c.iterator();
        while (it.hasNext()) {
            etx etxVar = (etx) it.next();
            if (etxVar.a.equals(errVar)) {
                etxVar.a(etyVar.b);
                etyVar.c.remove(etxVar);
            }
        }
    }

    @Override // defpackage.ert
    public final void N(boolean z) {
        ag();
        w();
        ah(z, 1);
    }

    @Override // defpackage.ert
    public final void O(ese eseVar) {
        ag();
        this.J.l();
        if (eseVar.equals(this.J.c())) {
            return;
        }
        this.J.j(eseVar);
        this.f.f(19, new ezu(eseVar, 5));
    }

    @Override // defpackage.ert
    public final boolean P() {
        ag();
        return this.A.l;
    }

    @Override // defpackage.ert
    public final boolean Q() {
        ag();
        return this.m;
    }

    @Override // defpackage.ert
    public final boolean R() {
        ag();
        return this.A.c.b();
    }

    public final long S(erz erzVar, fgv fgvVar, long j) {
        erzVar.o(fgvVar.a, this.g);
        return j + this.g.e;
    }

    public final erh T() {
        erz H = H();
        if (H.q()) {
            return this.z;
        }
        ere ereVar = H.p(u(), this.a).d;
        erg ergVar = new erg(this.z);
        erh erhVar = ereVar.d;
        if (erhVar != null) {
            CharSequence charSequence = erhVar.b;
            if (charSequence != null) {
                ergVar.a = charSequence;
            }
            CharSequence charSequence2 = erhVar.c;
            if (charSequence2 != null) {
                ergVar.b = charSequence2;
            }
            CharSequence charSequence3 = erhVar.d;
            if (charSequence3 != null) {
                ergVar.c = charSequence3;
            }
            CharSequence charSequence4 = erhVar.e;
            if (charSequence4 != null) {
                ergVar.d = charSequence4;
            }
            CharSequence charSequence5 = erhVar.f;
            if (charSequence5 != null) {
                ergVar.e = charSequence5;
            }
            byte[] bArr = erhVar.g;
            if (bArr != null) {
                Integer num = erhVar.h;
                ergVar.f = (byte[]) bArr.clone();
                ergVar.g = num;
            }
            Integer num2 = erhVar.i;
            if (num2 != null) {
                ergVar.h = num2;
            }
            Integer num3 = erhVar.j;
            if (num3 != null) {
                ergVar.i = num3;
            }
            Integer num4 = erhVar.k;
            if (num4 != null) {
                ergVar.j = num4;
            }
            Boolean bool = erhVar.l;
            if (bool != null) {
                ergVar.k = bool;
            }
            Integer num5 = erhVar.m;
            if (num5 != null) {
                ergVar.l = num5;
            }
            Integer num6 = erhVar.n;
            if (num6 != null) {
                ergVar.l = num6;
            }
            Integer num7 = erhVar.o;
            if (num7 != null) {
                ergVar.m = num7;
            }
            Integer num8 = erhVar.p;
            if (num8 != null) {
                ergVar.n = num8;
            }
            Integer num9 = erhVar.q;
            if (num9 != null) {
                ergVar.o = num9;
            }
            Integer num10 = erhVar.r;
            if (num10 != null) {
                ergVar.p = num10;
            }
            Integer num11 = erhVar.s;
            if (num11 != null) {
                ergVar.q = num11;
            }
            CharSequence charSequence6 = erhVar.t;
            if (charSequence6 != null) {
                ergVar.r = charSequence6;
            }
            CharSequence charSequence7 = erhVar.u;
            if (charSequence7 != null) {
                ergVar.s = charSequence7;
            }
            CharSequence charSequence8 = erhVar.v;
            if (charSequence8 != null) {
                ergVar.t = charSequence8;
            }
            CharSequence charSequence9 = erhVar.w;
            if (charSequence9 != null) {
                ergVar.u = charSequence9;
            }
            CharSequence charSequence10 = erhVar.x;
            if (charSequence10 != null) {
                ergVar.v = charSequence10;
            }
            Integer num12 = erhVar.y;
            if (num12 != null) {
                ergVar.w = num12;
            }
        }
        return new erh(ergVar);
    }

    public final ezo U() {
        ag();
        return this.A.g;
    }

    public final fbb V(fba fbaVar) {
        ai(this.A);
        erz erzVar = this.A.b;
        fai faiVar = this.e;
        return new fbb(faiVar, fbaVar, faiVar.e);
    }

    public final List W(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((alsx) list).c; i++) {
            arrayList.add(this.M.b((ere) list.get(i)));
        }
        return arrayList;
    }

    public final void X() {
        ag();
        Z();
        ac(null);
        Y(0, 0);
    }

    public final void Y(final int i, final int i2) {
        eug eugVar = this.W;
        if (i == eugVar.b && i2 == eugVar.c) {
            return;
        }
        this.W = new eug(i, i2);
        this.f.f(24, new etv() { // from class: ezv
            @Override // defpackage.etv
            public final void a(Object obj) {
                int i3 = fad.G;
                ((err) obj).x();
            }
        });
        aa(2, 14, new eug(i, i2));
    }

    public final void Z() {
        SurfaceHolder surfaceHolder = this.u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.j);
            this.u = null;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void a() {
        eub.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.0-alpha01] [" + eul.e + "] [" + erf.a() + "]");
        ag();
        this.F.c = null;
        int i = 1;
        if (!this.e.e()) {
            this.f.f(10, new ezz(i));
        }
        this.f.e();
        this.d.d();
        ((fjm) this.N).g.u(this.D);
        boolean z = this.A.p;
        fay e = this.A.e(1);
        this.A = e;
        fay a = e.a(e.c);
        this.A = a;
        a.q = a.s;
        this.A.r = 0L;
        fbt fbtVar = this.D;
        etu etuVar = fbtVar.f;
        dzg.h(etuVar);
        etuVar.b(new exl(fbtVar, 5));
        this.J.h();
        Z();
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        this.x = eta.a;
    }

    public final void aa(int i, int i2, Object obj) {
        for (fbd fbdVar : this.I) {
            if (i == -1 || fbdVar.eL() == i) {
                fbb V = V(fbdVar);
                V.f(i2);
                V.e(obj);
                V.d();
            }
        }
    }

    public final void ab(List list, int i, long j, boolean z) {
        long j2;
        int i2 = i;
        int ai = ai(this.A);
        long A = A();
        this.n++;
        boolean z2 = false;
        if (!this.h.isEmpty()) {
            int size = this.h.size();
            for (int i3 = size - 1; i3 >= 0; i3--) {
                this.h.remove(i3);
            }
            kkc kkcVar = this.ad;
            int[] iArr = new int[((int[]) kkcVar.c).length - size];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = (int[]) kkcVar.c;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i6 = iArr2[i4];
                if (i6 >= 0 && i6 < size) {
                    i5++;
                } else {
                    int i7 = i4 - i5;
                    if (i6 >= 0) {
                        i6 -= size;
                    }
                    iArr[i7] = i6;
                }
                i4++;
            }
            this.ad = new kkc(iArr, new Random(((Random) kkcVar.a).nextLong()));
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            fav favVar = new fav((fgx) list.get(i8), this.L);
            arrayList.add(favVar);
            this.h.add(i8, new fac(favVar.b, favVar.a));
        }
        this.ad = this.ad.L(arrayList.size());
        ezd ezdVar = new ezd(this.h, this.ad);
        if (!ezdVar.q() && i2 >= ezdVar.b) {
            throw new eqr();
        }
        if (z) {
            i2 = ezdVar.g(this.m);
            j2 = -9223372036854775807L;
        } else if (i2 == -1) {
            i2 = ai;
            j2 = A;
        } else {
            j2 = j;
        }
        fay an = an(this.A, ezdVar, am(ezdVar, i2, j2));
        int i9 = an.f;
        if (i2 != -1 && i9 != 1) {
            i9 = 4;
            if (!ezdVar.q() && i2 < ezdVar.b) {
                i9 = 2;
            }
        }
        fay e = an.e(i9);
        this.e.d.g(17, new fae(arrayList, this.ad, i2, eul.u(j2))).f();
        if (!this.A.c.a.equals(e.c.a) && !this.A.b.q()) {
            z2 = true;
        }
        ae(e, 0, z2, 4, ak(e), -1, false);
    }

    public final void ac(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (fbd fbdVar : this.I) {
            if (fbdVar.eL() == 2) {
                fbb V = V(fbdVar);
                V.f(1);
                V.e(obj);
                V.d();
                arrayList.add(V);
            }
        }
        Object obj2 = this.s;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((fbb) it.next()).b(this.S);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.s;
            Surface surface = this.t;
            if (obj3 == surface) {
                surface.release();
                this.t = null;
            }
        }
        this.s = obj;
        if (z) {
            ezo ezoVar = new ezo(2, new faj(3), 1003);
            fay fayVar = this.A;
            fay a = fayVar.a(fayVar.c);
            a.q = a.s;
            a.r = 0L;
            fay c = a.e(1).c(ezoVar);
            this.n++;
            this.e.d.f(6).f();
            ae(c, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void ad() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        erp erpVar = this.q;
        int i = eul.a;
        ert ertVar = this.c;
        boolean R = ertVar.R();
        boolean o = ertVar.o();
        boolean k = ertVar.k();
        boolean j = ertVar.j();
        boolean n = ertVar.n();
        boolean m = ertVar.m();
        boolean q = ertVar.H().q();
        apvo apvoVar = new apvo((char[]) null);
        dzf.g(this.b, apvoVar);
        boolean z7 = !R;
        dzf.h(4, z7, apvoVar);
        boolean z8 = false;
        if (o && !R) {
            z = true;
        } else {
            z = false;
        }
        dzf.h(5, z, apvoVar);
        if (k && !R) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = 6;
        dzf.h(6, z2, apvoVar);
        if (!q && ((k || !n || o) && !R)) {
            z3 = true;
        } else {
            z3 = false;
        }
        dzf.h(7, z3, apvoVar);
        if (j && !R) {
            z4 = true;
        } else {
            z4 = false;
        }
        dzf.h(8, z4, apvoVar);
        if (!q && ((j || (n && m)) && !R)) {
            z5 = true;
        } else {
            z5 = false;
        }
        dzf.h(9, z5, apvoVar);
        dzf.h(10, z7, apvoVar);
        if (o && !R) {
            z6 = true;
        } else {
            z6 = false;
        }
        dzf.h(11, z6, apvoVar);
        if (o && !R) {
            z8 = true;
        }
        dzf.h(12, z8, apvoVar);
        erp f = dzf.f(apvoVar);
        this.q = f;
        if (!f.equals(erpVar)) {
            this.f.d(13, new ezu(this, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ae(final defpackage.fay r42, final int r43, boolean r44, int r45, long r46, int r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fad.ae(fay, int, boolean, int, long, int, boolean):void");
    }

    public final void af() {
        int w = w();
        if (w != 2 && w != 3) {
            return;
        }
        ag();
        boolean z = this.A.p;
        P();
        P();
    }

    public final void ag() {
        IllegalStateException illegalStateException;
        this.ac.f();
        if (Thread.currentThread() != this.i.getThread()) {
            String G2 = eul.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.i.getThread().getName());
            if (!this.Z) {
                if (this.aa) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                eub.g("ExoPlayerImpl", G2, illegalStateException);
                this.aa = true;
                return;
            }
            throw new IllegalStateException(G2);
        }
    }

    public final void ah(boolean z, int i) {
        fay fayVar = this.A;
        if (fayVar.l == z && fayVar.n == 0 && fayVar.m == 1) {
            return;
        }
        this.n++;
        boolean z2 = fayVar.p;
        fay b = fayVar.b(z, 1, 0);
        this.e.d.h(1, z ? 1 : 0, 1).f();
        ae(b, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.eqb
    public final void p(int i, long j, boolean z) {
        boolean z2;
        ag();
        if (i != -1) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            d.s(z2);
            erz erzVar = this.A.b;
            if (!erzVar.q() && i >= erzVar.c()) {
                return;
            }
            fbt fbtVar = this.D;
            if (!fbtVar.g) {
                fbk A = fbtVar.A();
                fbtVar.g = true;
                fbtVar.F(A, -1, new fbn(16));
            }
            this.n++;
            if (R()) {
                eub.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                fag fagVar = new fag(this.A);
                fagVar.a(1);
                this.ae.I(fagVar);
                return;
            }
            fay fayVar = this.A;
            int i2 = fayVar.f;
            if (i2 == 3 || (i2 == 4 && !erzVar.q())) {
                fayVar = this.A.e(2);
            }
            int u = u();
            fay an = an(fayVar, erzVar, am(erzVar, i, j));
            this.e.d.g(3, new fah(erzVar, i, eul.u(j))).f();
            ae(an, 0, true, 1, ak(an), u, z);
        }
    }

    @Override // defpackage.ert
    public final int s() {
        ag();
        if (R()) {
            return this.A.c.b;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        ag();
        aa(4, 15, imageOutput);
    }

    @Override // defpackage.ert
    public final int t() {
        ag();
        if (R()) {
            return this.A.c.c;
        }
        return -1;
    }

    @Override // defpackage.ert
    public final int u() {
        ag();
        int ai = ai(this.A);
        if (ai == -1) {
            return 0;
        }
        return ai;
    }

    @Override // defpackage.ert
    public final int v() {
        ag();
        if (this.A.b.q()) {
            return 0;
        }
        fay fayVar = this.A;
        return fayVar.b.a(fayVar.c.a);
    }

    @Override // defpackage.ert
    public final int w() {
        ag();
        return this.A.f;
    }

    @Override // defpackage.ert
    public final int x() {
        ag();
        return this.A.n;
    }

    @Override // defpackage.ert
    public final int y() {
        ag();
        return this.l;
    }

    @Override // defpackage.ert
    public final long z() {
        ag();
        return aj(this.A);
    }
}
