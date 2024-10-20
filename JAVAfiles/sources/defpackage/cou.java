package defpackage;

import defpackage.cnr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cou extends cpb {
    public arqr e;
    public float g;
    public float h;
    public float i;
    public float l;
    public float m;
    private float[] o;
    private clr q;
    private final List p = new ArrayList();
    public boolean a = true;
    public long b = cku.h;
    public List c = cpe.a;
    public boolean d = true;
    private final arqr r = new AnonymousClass1();
    public String f = "";
    public float j = 1.0f;
    public float k = 1.0f;
    public boolean n = true;

    /* compiled from: PG */
    /* renamed from: cou$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cpb, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cpb cpbVar = (cpb) obj;
            cou.this.d(cpbVar);
            arqr arqrVar = cou.this.e;
            if (arqrVar != null) {
                arqrVar.a(cpbVar);
            }
            return arnb.a;
        }
    }

    private final void g() {
        this.a = false;
        this.b = cku.h;
    }

    private final void h(cko ckoVar) {
        if (this.a && ckoVar != null) {
            if (ckoVar instanceof cmd) {
                i(((cmd) ckoVar).a);
            } else {
                g();
            }
        }
    }

    private final void i(long j) {
        if (this.a && j != 16) {
            long j2 = this.b;
            if (j2 == 16) {
                this.b = j;
                return;
            }
            List list = cpe.a;
            if (cku.d(j2) != cku.d(j) || cku.c(j2) != cku.c(j) || cku.b(j2) != cku.b(j)) {
                g();
            }
        }
    }

    private final boolean j() {
        if (!this.c.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cpb
    public final arqr a() {
        return this.e;
    }

    @Override // defpackage.cpb
    public final void b(cny cnyVar) {
        if (this.n) {
            float[] fArr = this.o;
            if (fArr == null) {
                fArr = cll.e();
                this.o = fArr;
            } else {
                cll.c(fArr);
            }
            cll.f(fArr, this.l + this.h, this.m + this.i);
            float f = this.g * 0.0027777778f;
            float floor = f - ((float) Math.floor(f + 0.5f));
            float abs = Math.abs(floor);
            float f2 = abs + abs;
            float floor2 = (f + 0.25f) - ((float) Math.floor(0.5f + r3));
            float abs2 = Math.abs(floor2);
            float f3 = abs2 + abs2;
            float f4 = fArr[0];
            float f5 = 1.0f - f3;
            float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (f3 * f5));
            float f7 = 1.0f - f2;
            float f8 = ((floor * 8.0f) * f7) / (1.25f - (f2 * f7));
            float f9 = fArr[4];
            float f10 = -f8;
            float f11 = fArr[1];
            float f12 = fArr[5];
            float f13 = fArr[2];
            float f14 = fArr[6];
            float f15 = fArr[3];
            float f16 = fArr[7];
            float f17 = (f6 * f4) + (f8 * f9);
            fArr[0] = f17;
            float f18 = (f6 * f11) + (f8 * f12);
            fArr[1] = f18;
            float f19 = (f6 * f13) + (f8 * f14);
            fArr[2] = f19;
            float f20 = (f6 * f15) + (f8 * f16);
            fArr[3] = f20;
            float f21 = (f4 * f10) + (f9 * f6);
            fArr[4] = f21;
            float f22 = (f11 * f10) + (f12 * f6);
            fArr[5] = f22;
            float f23 = (f13 * f10) + (f14 * f6);
            fArr[6] = f23;
            float f24 = (f10 * f15) + (f6 * f16);
            fArr[7] = f24;
            float f25 = this.j;
            float f26 = this.k;
            fArr[0] = f17 * f25;
            fArr[1] = f18 * f25;
            fArr[2] = f19 * f25;
            fArr[3] = f20 * f25;
            fArr[4] = f21 * f26;
            fArr[5] = f22 * f26;
            fArr[6] = f23 * f26;
            fArr[7] = f24 * f26;
            cll.f(fArr, -this.h, -this.i);
            this.n = false;
        }
        if (this.d) {
            if (j()) {
                clr clrVar = this.q;
                if (clrVar == null) {
                    clrVar = new cke((byte[]) null);
                    this.q = clrVar;
                }
                cpa.a(this.c, clrVar);
            }
            this.d = false;
        }
        cnu q = cnyVar.q();
        long a = q.a();
        q.b().l();
        try {
            coa coaVar = ((cnr.AnonymousClass1) q).a;
            float[] fArr2 = this.o;
            if (fArr2 != null) {
                ((cns) coaVar).a.b().b(new cll(fArr2).a);
            }
            clr clrVar2 = this.q;
            if (j() && clrVar2 != null) {
                coaVar.g(clrVar2);
            }
            List list = this.p;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((cpb) list.get(i)).b(cnyVar);
            }
        } finally {
            q.b().j();
            q.h(a);
        }
    }

    public final void c(int i, cpb cpbVar) {
        if (i < this.p.size()) {
            this.p.set(i, cpbVar);
        } else {
            this.p.add(cpbVar);
        }
        d(cpbVar);
        cpbVar.e(this.r);
        f();
    }

    public final void d(cpb cpbVar) {
        if (cpbVar instanceof cox) {
            cox coxVar = (cox) cpbVar;
            h(coxVar.a);
            h(coxVar.f);
        } else if (cpbVar instanceof cou) {
            cou couVar = (cou) cpbVar;
            if (couVar.a && this.a) {
                i(couVar.b);
            } else {
                g();
            }
        }
    }

    @Override // defpackage.cpb
    public final void e(arqr arqrVar) {
        this.e = arqrVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f);
        List list = this.p;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cpb cpbVar = (cpb) list.get(i);
            sb.append("\t");
            sb.append(cpbVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
