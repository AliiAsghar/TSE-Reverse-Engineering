package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bap implements ctq {
    public final azv a;
    public final int b;
    public final dow c;
    public final arqg d;

    /* compiled from: PG */
    /* renamed from: bap$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cuh a;
        final /* synthetic */ bap b;
        final /* synthetic */ cvc c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cuh cuhVar, bap bapVar, cvc cvcVar, int i) {
            super(1);
            this.a = cuhVar;
            this.b = bapVar;
            this.c = cvcVar;
            this.d = i;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            diy diyVar;
            cvc.a aVar = (cvc.a) obj;
            bap bapVar = this.b;
            baa baaVar = (baa) bapVar.d.a();
            if (baaVar != null) {
                diyVar = baaVar.a;
            } else {
                diyVar = null;
            }
            dow dowVar = bapVar.c;
            int i = bapVar.b;
            cjp a = azu.a(this.a, i, dowVar, diyVar, false, this.c.a);
            bap bapVar2 = this.b;
            bapVar2.a.e(ahp.a, a, this.d, this.c.b);
            cvc.a.m(aVar, this.c, 0, Math.round(-this.b.a.b()));
            return arnb.a;
        }
    }

    public bap(azv azvVar, int i, dow dowVar, arqg arqgVar) {
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
        if (!(obj instanceof bap)) {
            return false;
        }
        bap bapVar = (bap) obj;
        if (d.F(this.a, bapVar.a) && this.b == bapVar.b && d.F(this.c, bapVar.c) && d.F(this.d, bapVar.d)) {
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
        cuf et;
        cvc e = cucVar.e(dqs.k(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(e.b, dqs.a(j));
        et = cuhVar.et(e.a, min, arnw.a, new AnonymousClass1(cuhVar, this, e, min));
        return et;
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
