package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axt implements ctq {
    public final azv a;
    public final int b;
    public final dow c;
    public final arqg d;

    /* compiled from: PG */
    /* renamed from: axt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cuh a;
        final /* synthetic */ axt b;
        final /* synthetic */ cvc c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cuh cuhVar, axt axtVar, cvc cvcVar, int i) {
            super(1);
            this.a = cuhVar;
            this.b = axtVar;
            this.c = cvcVar;
            this.d = i;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            diy diyVar;
            boolean z;
            cvc.a aVar = (cvc.a) obj;
            axt axtVar = this.b;
            baa baaVar = (baa) axtVar.d.a();
            if (baaVar != null) {
                diyVar = baaVar.a;
            } else {
                diyVar = null;
            }
            diy diyVar2 = diyVar;
            dow dowVar = axtVar.c;
            int i = axtVar.b;
            cuh cuhVar = this.a;
            if (cuhVar.q() == drk.b) {
                z = true;
            } else {
                z = false;
            }
            this.b.a.e(ahp.b, azu.a(cuhVar, i, dowVar, diyVar2, z, this.c.a), this.d, this.c.a);
            cvc.a.m(aVar, this.c, Math.round(-this.b.a.b()), 0);
            return arnb.a;
        }
    }

    public axt(azv azvVar, int i, dow dowVar, arqg arqgVar) {
        this.a = azvVar;
        this.b = i;
        this.c = dowVar;
        this.d = arqgVar;
    }

    @Override // defpackage.cga
    public final /* synthetic */ cga a(cga cgaVar) {
        return cfz.a(this, cgaVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
        return cgb.a(this, obj, arqvVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ boolean c(arqr arqrVar) {
        return cgb.b(this, arqrVar);
    }

    @Override // defpackage.ctq
    public final /* synthetic */ int e(ctd ctdVar, ctc ctcVar, int i) {
        return ctp.a(this, ctdVar, ctcVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axt)) {
            return false;
        }
        axt axtVar = (axt) obj;
        if (d.F(this.a, axtVar.a) && this.b == axtVar.b && d.F(this.c, axtVar.c) && d.F(this.d, axtVar.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ctq
    public final /* synthetic */ int f(ctd ctdVar, ctc ctcVar, int i) {
        return ctp.b(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.ctq
    public final /* synthetic */ int g(ctd ctdVar, ctc ctcVar, int i) {
        return ctp.c(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.ctq
    public final /* synthetic */ int h(ctd ctdVar, ctc ctcVar, int i) {
        return ctp.d(this, ctdVar, ctcVar, i);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.ctq
    public final cuf i(cuh cuhVar, cuc cucVar, long j) {
        long k;
        cuf et;
        if (cucVar.b(dqs.a(j)) < dqs.b(j)) {
            k = j;
        } else {
            k = dqs.k(j, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        cvc e = cucVar.e(k);
        int min = Math.min(e.a, dqs.b(j));
        et = cuhVar.et(min, e.b, arnw.a, new AnonymousClass1(cuhVar, this, e, min));
        return et;
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
