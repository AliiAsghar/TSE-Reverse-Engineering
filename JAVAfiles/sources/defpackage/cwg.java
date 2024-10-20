package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import defpackage.cga;
import defpackage.crl;
import defpackage.czb;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwg extends cga.c implements cxi, cwx, czk, czi, cvy, cwb, czf, cxg, cwz, cid, cis, ciw, czc, che {
    public cga.b a;
    public boolean b;
    public final HashSet c;
    public cti d;
    private cvr e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cwg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cwg.this.z();
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cwg$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<arnb> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cwg cwgVar = cwg.this;
            cga.b bVar = cwgVar.a;
            bVar.getClass();
            ((cvu) bVar).d(cwgVar);
            return arnb.a;
        }
    }

    public cwg(cga.b bVar) {
        this.q = cyp.a(bVar);
        this.a = bVar;
        this.b = true;
        this.c = new HashSet();
    }

    @Override // defpackage.czc
    public final boolean J() {
        return this.z;
    }

    @Override // defpackage.cid
    public final void a(ciy ciyVar) {
        cga.b bVar = this.a;
        if (!(bVar instanceof cic)) {
            csg.c("onFocusEvent called on wrong node");
        }
        ((cic) bVar).d();
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cga.b bVar = this.a;
        bVar.getClass();
        return ((ctq) bVar).i(cuhVar, cucVar, j);
    }

    @Override // defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        cga.b bVar = this.a;
        bVar.getClass();
        return ((ctq) bVar).e(ctdVar, ctcVar, i);
    }

    @Override // defpackage.czk
    public final void dM(dho dhoVar) {
        int i;
        char c;
        cga.b bVar = this.a;
        bVar.getClass();
        dgy f = ((dha) bVar).f();
        dhoVar.getClass();
        if (f.a) {
            ((dgy) dhoVar).a = true;
        }
        if (f.b) {
            ((dgy) dhoVar).b = true;
        }
        ve veVar = f.c;
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
                            dhn dhnVar = (dhn) obj;
                            dgy dgyVar = (dgy) dhoVar;
                            if (!ve.e(dgyVar.c, dhnVar)) {
                                dgyVar.c.j(dhnVar, obj2);
                            } else if (obj2 instanceof dgn) {
                                Object a = dgyVar.c.a(dhnVar);
                                a.getClass();
                                ve veVar2 = dgyVar.c;
                                dgn dgnVar = (dgn) a;
                                String str = dgnVar.a;
                                if (str == null) {
                                    str = ((dgn) obj2).a;
                                }
                                armh armhVar = dgnVar.b;
                                if (armhVar == null) {
                                    armhVar = ((dgn) obj2).b;
                                }
                                veVar2.j(dhnVar, new dgn(str, armhVar));
                                c = '\b';
                                j >>= c;
                                i4++;
                            }
                        }
                        c = '\b';
                        j >>= c;
                        i4++;
                    }
                    if (i != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // cga.c
    public final void dQ() {
        v(true);
    }

    @Override // defpackage.czi
    public final void dR() {
        cga.b bVar = this.a;
        bVar.getClass();
        crl.AnonymousClass1 anonymousClass1 = (crl.AnonymousClass1) ((cri) bVar).d();
        if (anonymousClass1.b == crl.a.b) {
            crl crlVar = crl.this;
            long uptimeMillis = SystemClock.uptimeMillis();
            crm crmVar = new crm(crlVar);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, brg.a, brg.a, 0);
            obtain.setSource(0);
            crmVar.a(obtain);
            obtain.recycle();
            anonymousClass1.b();
        }
    }

    @Override // defpackage.czi
    public final /* synthetic */ void dS() {
        czh.a(this);
    }

    @Override // defpackage.czi
    public final void dT(cqq cqqVar, cqs cqsVar, long j) {
        cga.b bVar = this.a;
        bVar.getClass();
        crl.AnonymousClass1 anonymousClass1 = (crl.AnonymousClass1) ((cri) bVar).d();
        boolean z = crl.this.b;
        List list = cqqVar.a;
        boolean z2 = true;
        if (!z) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    crc crcVar = (crc) list.get(i);
                    if (cqr.e(crcVar) || cqr.g(crcVar)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        }
        if (anonymousClass1.b != crl.a.c) {
            if (cqsVar == cqs.a && z2) {
                anonymousClass1.a(cqqVar);
            }
            if (cqsVar == cqs.c && !z2) {
                anonymousClass1.a(cqqVar);
            }
        }
        if (cqsVar == cqs.c) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!cqr.g((crc) list.get(i2))) {
                    return;
                }
            }
            anonymousClass1.b();
        }
    }

    @Override // defpackage.czi
    public final /* synthetic */ void dU() {
        czh.b(this);
    }

    @Override // defpackage.cxg
    public final void dW(cti ctiVar) {
        this.d = ctiVar;
        cga.b bVar = this.a;
        if (bVar instanceof cut) {
            ((cut) bVar).d();
        }
    }

    @Override // defpackage.cxg
    public final void dX(long j) {
        cga.b bVar = this.a;
        if (bVar instanceof cuv) {
            ((cuv) bVar).d();
        }
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dY() {
        return false;
    }

    @Override // defpackage.czk
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.cxi
    public final int e(ctd ctdVar, ctc ctcVar, int i) {
        cga.b bVar = this.a;
        bVar.getClass();
        return ((ctq) bVar).f(ctdVar, ctcVar, i);
    }

    @Override // defpackage.czf
    public final Object ea(Object obj) {
        cga.b bVar = this.a;
        bVar.getClass();
        return ((cuz) bVar).d();
    }

    @Override // defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        cga.b bVar = this.a;
        bVar.getClass();
        return ((ctq) bVar).g(ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        cga.b bVar = this.a;
        bVar.getClass();
        return ((ctq) bVar).h(ctdVar, ctcVar, i);
    }

    @Override // defpackage.che
    public final long h() {
        return drj.c(cwp.f(this, 128).c);
    }

    @Override // defpackage.cwz
    public final void i(cti ctiVar) {
        cga.b bVar = this.a;
        bVar.getClass();
        ((cuq) bVar).e();
    }

    @Override // defpackage.che
    public final dqv n() {
        return cwp.e(this).q;
    }

    @Override // defpackage.che
    public final drk o() {
        return cwp.e(this).r;
    }

    @Override // defpackage.cvy
    public final cvw p() {
        cvr cvrVar = this.e;
        if (cvrVar != null) {
            return cvrVar;
        }
        return cvs.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [cga$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [cbh] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cbh] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.cwb
    public final Object q(cvt cvtVar) {
        cyk cykVar;
        this.c.add(cvtVar);
        cga.c cVar = this.p;
        if (cVar.z) {
            cga.c cVar2 = cVar.s;
            cxn e = cwp.e(this);
            while (e != null) {
                if ((e.w.e.r & 32) != 0) {
                    while (cVar2 != null) {
                        if ((cVar2.q & 32) != 0) {
                            cwr cwrVar = cVar2;
                            ?? r4 = 0;
                            while (cwrVar != 0) {
                                if (cwrVar instanceof cvy) {
                                    cvy cvyVar = (cvy) cwrVar;
                                    if (cvyVar.p().c(cvtVar)) {
                                        return cvyVar.p().a(cvtVar);
                                    }
                                } else if ((cwrVar.q & 32) != 0 && (cwrVar instanceof cwr)) {
                                    cga.c cVar3 = cwrVar.B;
                                    int i = 0;
                                    cwrVar = cwrVar;
                                    r4 = r4;
                                    while (cVar3 != null) {
                                        if ((cVar3.q & 32) != 0) {
                                            i++;
                                            r4 = r4;
                                            if (i == 1) {
                                                cwrVar = cVar3;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new cbh(new cga.c[16]);
                                                }
                                                if (cwrVar != 0) {
                                                    r4.n(cwrVar);
                                                }
                                                r4.n(cVar3);
                                                cwrVar = 0;
                                            }
                                        }
                                        cVar3 = cVar3.t;
                                        cwrVar = cwrVar;
                                        r4 = r4;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cwrVar = cwp.a(r4);
                            }
                        }
                        cVar2 = cVar2.s;
                    }
                }
                e = e.t();
                if (e != null && (cykVar = e.w) != null) {
                    cVar2 = cykVar.d;
                } else {
                    cVar2 = null;
                }
            }
            return cvtVar.a.a();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        cga.b bVar = this.a;
        bVar.getClass();
        chn chnVar = (chn) bVar;
        if (this.b && (bVar instanceof chm)) {
            ((dai) cwp.g(this)).s.d(this, cwi.b, new cwh(bVar));
            this.b = false;
        }
        chnVar.d(cntVar);
    }

    @Override // cga.c
    public final void s() {
        y();
    }

    @Override // defpackage.cwx
    public final void t() {
        this.b = true;
        cwy.a(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.cis
    public final void u(ciq ciqVar) {
        cga.b bVar = this.a;
        if (!(bVar instanceof cil)) {
            csg.c("applyFocusProperties called on wrong node");
        }
        ((cil) bVar).d();
    }

    public final void v(boolean z) {
        if (!this.z) {
            csg.c("initializeModifier called on unattached node");
        }
        cga.b bVar = this.a;
        if ((this.q & 32) != 0) {
            if (bVar instanceof cvu) {
                cwp.g(this).x(new AnonymousClass1());
            }
            if (bVar instanceof cwa) {
                cwa cwaVar = (cwa) bVar;
                cvr cvrVar = this.e;
                if (cvrVar != null && cvrVar.c(cwaVar.j())) {
                    cvrVar.a = cwaVar;
                    cvv cvvVar = ((dai) cwp.g(this)).G;
                    cwc j = cwaVar.j();
                    cvvVar.a.n(this);
                    cvvVar.b.n(j);
                    cvvVar.a();
                } else {
                    this.e = new cvr(cwaVar);
                    if (cwi.a(this)) {
                        cvv cvvVar2 = ((dai) cwp.g(this)).G;
                        cwc j2 = cwaVar.j();
                        cvvVar2.a.n(this);
                        cvvVar2.b.n(j2);
                        cvvVar2.a();
                    }
                }
            }
        }
        if ((this.q & 4) != 0) {
            if (bVar instanceof chm) {
                this.b = true;
            }
            if (!z) {
                cxl.a(this);
            }
        }
        if ((this.q & 2) != 0) {
            if (cwi.a(this)) {
                cyn cynVar = this.v;
                cynVar.getClass();
                ((cxj) cynVar).E(this);
                cynVar.ag();
            }
            if (!z) {
                cxl.a(this);
                cwp.e(this).P();
            }
        }
        if (bVar instanceof cvf) {
            ((cvf) bVar).d(cwp.e(this));
        }
        if ((this.q & 128) != 0) {
            if ((bVar instanceof cuv) && cwi.a(this)) {
                cwp.e(this).P();
            }
            if (bVar instanceof cut) {
                this.d = null;
                if (cwi.a(this)) {
                    czb g = cwp.g(this);
                    dai daiVar = (dai) g;
                    daiVar.v.f.n(new czb.a() { // from class: cwg.2
                        @Override // czb.a
                        public final void a() {
                            cwg cwgVar = cwg.this;
                            if (cwgVar.d == null) {
                                cwgVar.dW(cwp.f(cwgVar, 128));
                            }
                        }
                    });
                    daiVar.X(null);
                }
            }
        }
        if ((this.q & 256) != 0 && (bVar instanceof cuq) && cwi.a(this)) {
            cwp.e(this).P();
        }
        if (bVar instanceof ciu) {
            ((ciu) bVar).d().c.n(this);
        }
        if ((this.q & 16) != 0 && (bVar instanceof cri)) {
            ((cri) bVar).d().a = this.v;
        }
        if ((this.q & 8) != 0) {
            cwp.g(this).w();
        }
    }

    @Override // defpackage.czi
    public final boolean w() {
        cga.b bVar = this.a;
        bVar.getClass();
        return true;
    }

    @Override // defpackage.czi
    public final void x() {
        cga.b bVar = this.a;
        bVar.getClass();
    }

    public final void y() {
        if (!this.z) {
            csg.c("unInitializeModifier called on unattached node");
        }
        cga.b bVar = this.a;
        if ((this.q & 32) != 0) {
            if (bVar instanceof cwa) {
                cvv cvvVar = ((dai) cwp.g(this)).G;
                cwc j = ((cwa) bVar).j();
                cvvVar.c.n(cwp.e(this));
                cvvVar.d.n(j);
                cvvVar.a();
            }
            if (bVar instanceof cvu) {
                ((cvu) bVar).d(cwi.a);
            }
        }
        if ((this.q & 8) != 0) {
            cwp.g(this).w();
        }
        if (bVar instanceof ciu) {
            ((ciu) bVar).d().c.m(this);
        }
    }

    public final void z() {
        if (this.z) {
            this.c.clear();
            ((dai) cwp.g(this)).s.d(this, cwi.c, new AnonymousClass3());
        }
    }
}
