package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsz<T> extends cga.c implements cxi {
    public bsr a;
    public arqv b;
    public ahp c;
    private boolean d;

    /* compiled from: PG */
    /* renamed from: bsz$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cuh a;
        final /* synthetic */ bsz b;
        final /* synthetic */ cvc c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cuh cuhVar, bsz bszVar, cvc cvcVar) {
            super(1);
            this.a = cuhVar;
            this.b = bszVar;
            this.c = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float e;
            float f;
            cvc.a aVar = (cvc.a) obj;
            if (this.a.ev()) {
                e = this.b.a.f().c(this.b.a.l());
            } else {
                e = this.b.a.e();
            }
            if (this.b.c == ahp.b) {
                f = e;
            } else {
                f = 0.0f;
            }
            if (this.b.c != ahp.a) {
                e = 0.0f;
            }
            aVar.j(new bsy(this.c, f, e));
            return arnb.a;
        }
    }

    public bsz(bsr bsrVar, arqv arqvVar, ahp ahpVar) {
        this.a = bsrVar;
        this.b = arqvVar;
        this.c = ahpVar;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        cvc e = cucVar.e(j);
        if (!cuhVar.ev() || !this.d) {
            armo armoVar = (armo) this.b.a(new dri(drj.a(e.a, e.b)), new dqs(j));
            bsr bsrVar = this.a;
            bsw bswVar = (bsw) armoVar.a;
            Object obj = armoVar.b;
            if (!d.F(bsrVar.f(), bswVar)) {
                bsrVar.g.h(bswVar);
                bte bteVar = bsrVar.c;
                bss bssVar = new bss(bsrVar, obj);
                if (bteVar.b.c()) {
                    try {
                        bssVar.a();
                    } finally {
                        bteVar.b.d();
                    }
                } else {
                    bsrVar.o(obj);
                }
            }
        }
        boolean z = true;
        if (!cuhVar.ev() && !this.d) {
            z = false;
        }
        this.d = z;
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass1(cuhVar, this, e));
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

    @Override // cga.c
    public final void s() {
        this.d = false;
    }
}
