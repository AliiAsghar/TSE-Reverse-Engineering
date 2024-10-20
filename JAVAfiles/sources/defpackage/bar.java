package defpackage;

import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bar extends baq implements cxi {

    /* compiled from: PG */
    /* renamed from: bar$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar, int i, int i2) {
            super(1);
            this.a = cvcVar;
            this.b = i;
            this.c = i2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            int i = this.c;
            ((cvc.a) obj).e(this.a, -this.b, -i, brg.a);
            return arnb.a;
        }
    }

    public bar(arqg arqgVar) {
        super(arqgVar);
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        int eo = cuhVar.eo(brg.a);
        int eo2 = cuhVar.eo(brg.a);
        int i = eo2 + eo2;
        int i2 = eo + eo;
        cvc e = cucVar.e(dqt.h(j, i, i2));
        et = cuhVar.et(e.a - i, e.b - i2, arnw.a, new AnonymousClass1(e, eo2, eo));
        return et;
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int d(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.a(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int e(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.b(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int f(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.c(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int g(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.d(this, ctdVar, ctcVar, i);
    }

    @Override // defpackage.baq, defpackage.czi
    public final boolean w() {
        return true;
    }
}
