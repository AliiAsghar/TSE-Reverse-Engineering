package defpackage;

import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqd implements flu {
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final eqn c;
    private fqc A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private flw G;
    private fmq[] H;
    private boolean I;
    private final fqf J;
    private final fvq K;
    public fmq[] a;
    private final frj d;
    private final int e;
    private final List f;
    private final SparseArray g;
    private final euf h;
    private final euf i;
    private final euf j;
    private final byte[] k;
    private final euf l;
    private final euf m;
    private final ArrayDeque n;
    private final ArrayDeque o;
    private alog p;
    private int q;
    private int r;
    private long s;
    private int t;
    private euf u;
    private long v;
    private int w;
    private long x;
    private long y;
    private long z;

    static {
        eqm eqmVar = new eqm();
        eqmVar.b("application/x-emsg");
        c = new eqn(eqmVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fqd() {
        /*
            r3 = this;
            frj r0 = defpackage.frj.a
            int r1 = defpackage.alog.d
            r1 = 32
            alog r2 = defpackage.alsx.a
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqd.<init>():void");
    }

    private static eqj a(List list) {
        Object obj;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            euo euoVar = (euo) list.get(i);
            if (euoVar.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = euoVar.a.a;
                apuv o = dyd.o(bArr);
                if (o == null) {
                    obj = null;
                } else {
                    obj = o.b;
                }
                if (obj == null) {
                    eub.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new eqi((UUID) obj, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new eqj(null, false, (eqi[]) arrayList.toArray(new eqi[0]));
    }

    private final void b() {
        this.q = 0;
        this.t = 0;
    }

    private static void c(euf eufVar, int i, fqk fqkVar) {
        boolean z;
        eufVar.J(i + 8);
        int a = fpz.a(eufVar.e());
        if ((a & 1) == 0) {
            if ((a & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int m = eufVar.m();
            if (m == 0) {
                Arrays.fill(fqkVar.l, 0, fqkVar.e, false);
                return;
            }
            int i2 = fqkVar.e;
            if (m == i2) {
                Arrays.fill(fqkVar.l, 0, m, z);
                fqkVar.b(eufVar.b());
                euf eufVar2 = fqkVar.m;
                eufVar.E(eufVar2.a, 0, eufVar2.c);
                fqkVar.m.J(0);
                fqkVar.n = false;
                return;
            }
            throw new erm(a.bU(i2, m, "Senc sample count ", " is different from fragment sample count"), null, true, 1);
        }
        throw new erm("Overriding TrackEncryptionBox parameters is unsupported.", null, false, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x032f, code lost:
    
        if (r0 < r5.e) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x061d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(long r49) {
        /*
            Method dump skipped, instructions count: 1845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqd.j(long):void");
    }

    private static void k(int i) {
        if (i >= 0) {
        } else {
            throw new erm(a.bV(i, "Unexpected negative value: "), null, true, 1);
        }
    }

    private static final fqa l(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (fqa) sparseArray.valueAt(0);
        }
        fqa fqaVar = (fqa) sparseArray.get(i);
        dzg.g(fqaVar);
        return fqaVar;
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        return this.p;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        int i;
        if ((this.e & 32) == 0) {
            flwVar = new frm(flwVar, this.d);
        }
        this.G = flwVar;
        b();
        fmq[] fmqVarArr = new fmq[2];
        this.H = fmqVarArr;
        int i2 = 100;
        int i3 = 0;
        if ((this.e & 4) != 0) {
            fmqVarArr[0] = this.G.p(100, 5);
            i = 1;
            i2 = 101;
        } else {
            i = 0;
        }
        fmq[] fmqVarArr2 = (fmq[]) eul.ad(this.H, i);
        this.H = fmqVarArr2;
        for (fmq fmqVar : fmqVarArr2) {
            fmqVar.h(c);
        }
        this.a = new fmq[this.f.size()];
        while (i3 < this.a.length) {
            fmq p = this.G.p(i2, 3);
            p.h((eqn) this.f.get(i3));
            this.a[i3] = p;
            i3++;
            i2++;
        }
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ((fqc) this.g.valueAt(i)).e();
        }
        this.o.clear();
        this.w = 0;
        this.J.b();
        this.x = j2;
        this.n.clear();
        b();
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        alog alogVar;
        fmo a = fqi.a(flvVar, true, false);
        if (a != null) {
            alogVar = alog.r(a);
        } else {
            int i = alog.d;
            alogVar = alsx.a;
        }
        this.p = alogVar;
        if (a == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:317:0x0091, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0094, code lost:
    
        if (r35.q != 3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0098, code lost:
    
        if (r2.j != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x009a, code lost:
    
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00ab, code lost:
    
        r35.B = r3;
        r35.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00b3, code lost:
    
        if (r2.f >= r2.i) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00b5, code lost:
    
        r0.m(r3);
        r0 = r2.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00bc, code lost:
    
        if (r0 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00bf, code lost:
    
        r3 = r2.b.m;
        r0 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00c5, code lost:
    
        if (r0 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00c7, code lost:
    
        r3.K(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x00d2, code lost:
    
        if (r2.b.c(r2.f) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00d4, code lost:
    
        r3.K(r3.n() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x00e0, code lost:
    
        if (r2.f() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x00e2, code lost:
    
        r35.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x00e4, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x02d7, code lost:
    
        r35.q = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x02da, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x00ed, code lost:
    
        if (r2.d.a.h != 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x00ef, code lost:
    
        r35.B = r3 - 8;
        r0.m(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0104, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.o) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0106, code lost:
    
        r35.C = r2.b(r35.B, 7);
        defpackage.flc.a(r35.B, r35.l);
        r2.a.l(r35.l, 7);
        r3 = r35.C + 7;
        r35.C = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x012b, code lost:
    
        r35.B += r3;
        r35.q = 4;
        r35.D = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0123, code lost:
    
        r3 = r2.b(r35.B, 0);
        r35.C = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00a3, code lost:
    
        r3 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0135, code lost:
    
        r3 = r2.d;
        r5 = r3.a;
        r6 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x013d, code lost:
    
        if (r2.j != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x013f, code lost:
    
        r11 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x014e, code lost:
    
        r3 = r5.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0150, code lost:
    
        if (r3 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0152, code lost:
    
        r3 = r35.C;
        r4 = r35.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0156, code lost:
    
        if (r3 >= r4) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0158, code lost:
    
        r35.C += r6.d(r0, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0274, code lost:
    
        r22 = r2.a();
        r0 = r2.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x027c, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x027e, code lost:
    
        r0 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0282, code lost:
    
        r6.n(r11, r22, r35.B, 0, (defpackage.fmp) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0299, code lost:
    
        if (r35.o.isEmpty() != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x029b, code lost:
    
        r0 = (defpackage.fqb) r35.o.removeFirst();
        r35.w -= r0.c;
        r3 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x02ae, code lost:
    
        if (r0.b == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x02b0, code lost:
    
        r3 = r3 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x02b1, code lost:
    
        r5 = r35.H;
        r6 = r5.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x02b5, code lost:
    
        if (r7 >= r6) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x02b7, code lost:
    
        r5[r7].n(r3, 1, r0.c, r35.w, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x02d1, code lost:
    
        if (r2.f() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x02d3, code lost:
    
        r35.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x02d6, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0281, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0163, code lost:
    
        r7 = r35.i.a;
        r7[0] = 0;
        r7[1] = 0;
        r7[2] = 0;
        r14 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0177, code lost:
    
        if (r35.C >= r35.B) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0179, code lost:
    
        r13 = r35.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x017d, code lost:
    
        if (r13 != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x017f, code lost:
    
        r0.k(r7, r3, r14);
        r35.i.J(r10);
        r13 = r35.i.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x018d, code lost:
    
        if (r13 <= 0) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x018f, code lost:
    
        r35.D = r13 - 1;
        r35.h.J(r10);
        r6.l(r35.h, 4);
        r6.l(r35.i, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x01a8, code lost:
    
        if (r35.a.length <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x01aa, code lost:
    
        r13 = r5.g;
        r17 = r7[4];
        r10 = defpackage.euw.a;
        r10 = r13.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01b6, code lost:
    
        if ("video/avc".equals(r10) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x01ba, code lost:
    
        if ((r17 & 31) == r4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x01bd, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x01ce, code lost:
    
        r35.F = r10;
        r35.C += 5;
        r35.B += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01dd, code lost:
    
        if (r35.E != false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01eb, code lost:
    
        if (j$.util.Objects.equals(r2.d.a.g.o, "video/avc") == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01f4, code lost:
    
        if (defpackage.euw.h(r7[4]) == false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01f6, code lost:
    
        r35.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x026f, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01c3, code lost:
    
        if ("video/hevc".equals(r10) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01ca, code lost:
    
        if (((r17 & 126) >> 1) != 39) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01cd, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0201, code lost:
    
        throw new defpackage.erm("Invalid NAL length", null, true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0204, code lost:
    
        if (r35.F == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0206, code lost:
    
        r35.j.F(r13);
        r0.k(r35.j.a, 0, r35.D);
        r6.l(r35.j, r35.D);
        r8 = r35.D;
        r10 = r35.j;
        r10 = defpackage.euw.d(r10.a, r10.c);
        r35.j.J("video/hevc".equals(r5.g.o) ? 1 : 0);
        r35.j.I(r10);
        r4 = r5.g.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x023f, code lost:
    
        if (r4 == (-1)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0241, code lost:
    
        r10 = r35.J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0245, code lost:
    
        if (r4 == r10.a) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0247, code lost:
    
        r10.c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x024a, code lost:
    
        r35.J.a(r11, r35.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0257, code lost:
    
        if ((r2.a() & 5) == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0259, code lost:
    
        r35.J.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0264, code lost:
    
        r35.C += r8;
        r35.D -= r8;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x025f, code lost:
    
        r8 = r6.d(r0, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0146, code lost:
    
        r11 = r2.b.a(r2.f);
     */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0058 A[SYNTHETIC] */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.flv r36, defpackage.vtk r37) {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqd.i(flv, vtk):int");
    }

    public fqd(frj frjVar, int i, List list) {
        this.d = frjVar;
        this.e = i;
        this.f = DesugarCollections.unmodifiableList(list);
        this.K = new fvq();
        this.m = new euf(16);
        this.h = new euf(euw.a);
        this.i = new euf(5);
        this.j = new euf();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new euf(bArr);
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.g = new SparseArray();
        int i2 = alog.d;
        this.p = alsx.a;
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.G = flw.y;
        this.H = new fmq[0];
        this.a = new fmq[0];
        this.J = new fqf(new fuj(this, 1));
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
