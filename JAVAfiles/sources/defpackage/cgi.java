package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgi extends cga.c implements cxi {
    public float a;

    /* compiled from: PG */
    /* renamed from: cgi$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;
        final /* synthetic */ cgi b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar, cgi cgiVar) {
            super(1);
            this.a = cvcVar;
            this.b = cgiVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            ((cvc.a) obj).e(this.a, 0, 0, this.b.a);
            return arnb.a;
        }
    }

    public cgi(float f) {
        this.a = f;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        cvc e = cucVar.e(j);
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass1(e, this));
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

    public final String toString() {
        return "ZIndexModifier(zIndex=" + this.a + ')';
    }
}
