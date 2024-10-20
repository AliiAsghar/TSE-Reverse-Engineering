package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ami extends cga.c implements cxi {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e = true;

    /* compiled from: PG */
    /* renamed from: ami$1, reason: invalid class name */
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
            ami amiVar = ami.this;
            if (!amiVar.e) {
                aVar.e(this.b, this.c.eo(amiVar.a), this.c.eo(ami.this.b), brg.a);
            } else {
                cvc.a.m(aVar, this.b, this.c.eo(amiVar.a), this.c.eo(ami.this.b));
            }
            return arnb.a;
        }
    }

    public ami(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        int eo = cuhVar.eo(this.a) + cuhVar.eo(this.c);
        int eo2 = cuhVar.eo(this.b) + cuhVar.eo(this.d);
        cvc e = cucVar.e(dqt.h(j, -eo, -eo2));
        int i = e.a + eo;
        int i2 = e.b + eo2;
        et = cuhVar.et(dqt.c(j, i), dqt.b(j, i2), arnw.a, new AnonymousClass1(e, cuhVar));
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
