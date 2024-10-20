package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvt extends dvk {
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public float aJ;
    public float aK;
    public float aL;
    public float aM;
    protected dwf ao;
    protected HashMap ap;
    protected HashMap aq;
    protected HashMap ar;
    public int as;
    public int at;
    public int au;
    public int av;
    public int aw;
    public int ax;
    public int ay;
    public int az;

    public dvt(dvo dvoVar, int i) {
        super(dvoVar, i);
        this.as = 0;
        this.at = -1;
        this.au = -1;
        this.av = -1;
        this.aw = -1;
        this.ax = -1;
        this.ay = -1;
        this.az = 2;
        this.aA = 2;
        this.aB = 0;
        this.aC = 0;
        this.aD = 0;
        this.aE = 0;
        this.aF = 0;
        this.aG = 0;
        this.aH = -1;
        this.aI = 0;
        this.aJ = 0.5f;
        this.aK = 0.5f;
        this.aL = 0.5f;
        this.aM = 0.5f;
        if (i == 8) {
            this.aI = 1;
        }
    }

    public final void A(String str, float f, float f2, float f3) {
        super.z(str);
        if (!Float.isNaN(f)) {
            if (this.ap == null) {
                this.ap = new HashMap();
            }
            this.ap.put(str, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            if (this.aq == null) {
                this.aq = new HashMap();
            }
            this.aq.put(str, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            if (this.ar == null) {
                this.ar = new HashMap();
            }
            this.ar.put(str, Float.valueOf(f3));
        }
    }

    @Override // defpackage.dvk, defpackage.dve, defpackage.dvl
    public final void e() {
        x();
        f(this.ao);
        dwf dwfVar = this.ao;
        dwfVar.aI = this.aI;
        dwfVar.aG = this.as;
        int i = this.aH;
        if (i != -1) {
            dwfVar.aH = i;
        }
        int i2 = this.aD;
        if (i2 != 0) {
            dwfVar.aR = i2;
        }
        int i3 = this.aF;
        if (i3 != 0) {
            dwfVar.aN = i3;
        }
        int i4 = this.aE;
        if (i4 != 0) {
            dwfVar.aS = i4;
        }
        int i5 = this.aG;
        if (i5 != 0) {
            dwfVar.aO = i5;
        }
        int i6 = this.aC;
        if (i6 != 0) {
            dwfVar.aC = i6;
        }
        int i7 = this.aB;
        if (i7 != 0) {
            dwfVar.aD = i7;
        }
        float f = this.h;
        if (f != 0.5f) {
            dwfVar.g = f;
        }
        float f2 = this.aL;
        if (f2 != 0.5f) {
            dwfVar.i = f2;
        }
        float f3 = this.aM;
        if (f3 != 0.5f) {
            dwfVar.k = f3;
        }
        float f4 = this.i;
        if (f4 != 0.5f) {
            dwfVar.h = f4;
        }
        float f5 = this.aJ;
        if (f5 != 0.5f) {
            dwfVar.j = f5;
        }
        float f6 = this.aK;
        if (f6 != 0.5f) {
            dwfVar.aB = f6;
        }
        int i8 = this.aA;
        if (i8 != 2) {
            dwfVar.aE = i8;
        }
        int i9 = this.az;
        if (i9 != 2) {
            dwfVar.aF = i9;
        }
        int i10 = this.at;
        if (i10 != -1) {
            dwfVar.b = i10;
        }
        int i11 = this.au;
        if (i11 != -1) {
            dwfVar.d = i11;
        }
        int i12 = this.av;
        if (i12 != -1) {
            dwfVar.f = i12;
        }
        int i13 = this.aw;
        if (i13 != -1) {
            dwfVar.a = i13;
        }
        int i14 = this.ax;
        if (i14 != -1) {
            dwfVar.c = i14;
        }
        int i15 = this.ay;
        if (i15 != -1) {
            dwfVar.e = i15;
        }
        y();
    }

    @Override // defpackage.dvk
    public final dwh x() {
        if (this.ao == null) {
            this.ao = new dwf();
        }
        return this.ao;
    }
}
