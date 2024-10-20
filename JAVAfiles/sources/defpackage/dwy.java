package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dwy implements dwo {
    public int c;
    public dwc d;
    protected int j;
    fcp l;
    public final dwr e = new dwr(this);
    public int f = 0;
    public boolean g = false;
    public final dwq h = new dwq(this);
    public final dwq i = new dwq(this);
    protected int k = 1;

    public dwy(dwc dwcVar) {
        this.d = dwcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void j(dwq dwqVar, dwq dwqVar2, int i) {
        dwqVar.k.add(dwqVar2);
        dwqVar.e = i;
        dwqVar2.j.add(dwqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final dwq k(dwb dwbVar) {
        dwb dwbVar2 = dwbVar.e;
        if (dwbVar2 != null) {
            int i = dwbVar2.i;
            dwc dwcVar = dwbVar2.d;
            int i2 = i - 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return null;
                            }
                            return dwcVar.p.a;
                        }
                        return dwcVar.p.i;
                    }
                    return dwcVar.o.i;
                }
                return dwcVar.p.h;
            }
            return dwcVar.o.h;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final dwq l(dwb dwbVar, int i) {
        dwy dwyVar;
        dwb dwbVar2 = dwbVar.e;
        if (dwbVar2 != null) {
            dwc dwcVar = dwbVar2.d;
            if (i == 0) {
                dwyVar = dwcVar.o;
            } else {
                dwyVar = dwcVar.p;
            }
            int i2 = dwbVar2.i - 1;
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    return null;
                }
                return dwyVar.i;
            }
            return dwyVar.h;
        }
        return null;
    }

    public long a() {
        if (this.e.i) {
            return r0.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.dwo
    public void f() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int h(int i, int i2) {
        if (i2 == 0) {
            dwc dwcVar = this.d;
            int i3 = dwcVar.G;
            int max = Math.max(dwcVar.F, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
            return i;
        }
        dwc dwcVar2 = this.d;
        int i4 = dwcVar2.J;
        int max2 = Math.max(dwcVar2.I, i);
        if (i4 > 0) {
            max2 = Math.min(i4, i);
        }
        if (max2 == i) {
            return i;
        }
        return max2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(dwq dwqVar, dwq dwqVar2, int i, dwr dwrVar) {
        dwqVar.k.add(dwqVar2);
        dwqVar.k.add(this.e);
        dwqVar.g = i;
        dwqVar.h = dwrVar;
        dwqVar2.j.add(dwqVar);
        dwrVar.j.add(dwqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r10.c == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.dwb r13, defpackage.dwb r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwy.m(dwb, dwb, int):void");
    }
}
