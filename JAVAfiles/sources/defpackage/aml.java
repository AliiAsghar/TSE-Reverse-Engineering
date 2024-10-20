package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aml extends cga.c implements cxi {
    public amj a;

    /* compiled from: PG */
    /* renamed from: aml$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ cuh b;
        final /* synthetic */ aml c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar, cuh cuhVar, aml amlVar) {
            super(1);
            this.a = cvcVar;
            this.b = cuhVar;
            this.c = amlVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cuh cuhVar = this.b;
            ((cvc.a) obj).e(this.a, cuhVar.eo(this.c.a.b(cuhVar.q())), this.b.eo(this.c.a.d()), brg.a);
            return arnb.a;
        }
    }

    public aml(amj amjVar) {
        this.a = amjVar;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        if (Float.compare(this.a.b(cuhVar.q()), brg.a) < 0 || Float.compare(this.a.d(), brg.a) < 0 || Float.compare(this.a.c(cuhVar.q()), brg.a) < 0 || Float.compare(this.a.a(), brg.a) < 0) {
            ann.a("Padding must be non-negative");
        }
        int eo = cuhVar.eo(this.a.b(cuhVar.q())) + cuhVar.eo(this.a.c(cuhVar.q()));
        int eo2 = cuhVar.eo(this.a.d()) + cuhVar.eo(this.a.a());
        cvc e = cucVar.e(dqt.h(j, -eo, -eo2));
        et = cuhVar.et(dqt.c(j, e.a + eo), dqt.b(j, e.b + eo2), arnw.a, new AnonymousClass1(e, cuhVar, this));
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
}
