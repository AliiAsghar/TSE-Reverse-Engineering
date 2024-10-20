package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ame extends cga.c implements cxi {
    public float a;
    public float b;
    public boolean c = true;

    /* compiled from: PG */
    /* renamed from: ame$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc b;
        final /* synthetic */ cuh c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar, cuh cuhVar) {
            super(1);
            this.b = cvcVar;
            this.c = cuhVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a aVar = (cvc.a) obj;
            ame ameVar = ame.this;
            if (!ameVar.c) {
                aVar.e(this.b, this.c.eo(ameVar.a), this.c.eo(ame.this.b), brg.a);
            } else {
                cvc.a.m(aVar, this.b, this.c.eo(ameVar.a), this.c.eo(ame.this.b));
            }
            return arnb.a;
        }
    }

    public ame(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        cvc e = cucVar.e(j);
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass1(e, cuhVar));
        return et;
    }

    @Override // defpackage.cxi
    public final /* synthetic */ int d(ctd ctdVar, ctc ctcVar, int i) {
        return cxh.a(this, ctdVar, ctcVar, i);
    }

    @Override // cga.c
    public final boolean dL() {
        return false;
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
