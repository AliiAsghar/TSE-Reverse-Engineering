package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bex implements bdq {
    private final boolean a;
    private final int b;
    private final int c;
    private final bcy d;
    private final bcx e;

    public bex(boolean z, int i, int i2, bcy bcyVar, bcx bcxVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = bcyVar;
        this.e = bcxVar;
    }

    @Override // defpackage.bdq
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bdq
    public final int b() {
        return 1;
    }

    @Override // defpackage.bdq
    public final int c() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r4.a.b <= r4.b.b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r4.a.b <= r4.b.b) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r4 = defpackage.bcy.a(r4, null, null, !r0, 3);
     */
    @Override // defpackage.bdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.uf d(defpackage.bcy r4) {
        /*
            r3 = this;
            boolean r0 = r4.c
            if (r0 != 0) goto Le
            bcy$a r1 = r4.a
            bcy$a r2 = r4.b
            int r1 = r1.b
            int r2 = r2.b
            if (r1 > r2) goto L1a
        Le:
            if (r0 == 0) goto L22
            bcy$a r1 = r4.a
            bcy$a r2 = r4.b
            int r1 = r1.b
            int r2 = r2.b
            if (r1 > r2) goto L22
        L1a:
            r0 = r0 ^ 1
            r1 = 3
            r2 = 0
            bcy r4 = defpackage.bcy.a(r4, r2, r2, r0, r1)
        L22:
            bcx r0 = r3.e
            long r0 = r0.a
            uf r4 = defpackage.ug.b(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bex.d(bcy):uf");
    }

    @Override // defpackage.bdq
    public final bcn e() {
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            return bcn.b;
        }
        if (i > i2) {
            return bcn.a;
        }
        return this.e.b();
    }

    @Override // defpackage.bdq
    public final bcx f() {
        return this.e;
    }

    @Override // defpackage.bdq
    public final bcx g() {
        return this.e;
    }

    @Override // defpackage.bdq
    public final bcx h() {
        return this.e;
    }

    @Override // defpackage.bdq
    public final bcx j() {
        return this.e;
    }

    @Override // defpackage.bdq
    public final bcy k() {
        return this.d;
    }

    @Override // defpackage.bdq
    public final boolean m() {
        return this.a;
    }

    @Override // defpackage.bdq
    public final boolean n(bdq bdqVar) {
        if (this.d != null && bdqVar != null && (bdqVar instanceof bex) && this.b == bdqVar.c() && this.c == bdqVar.a() && this.a == bdqVar.m() && !this.e.f(((bex) bdqVar).e)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + e() + ", info=\n\t" + this.e + ')';
    }

    @Override // defpackage.bdq
    public final void l(arqr arqrVar) {
    }
}
