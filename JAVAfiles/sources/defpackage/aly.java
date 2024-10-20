package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aly extends cga.c implements cxi {

    /* compiled from: PG */
    /* renamed from: aly$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ cvc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cvc cvcVar) {
            super(1);
            this.a = cvcVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            cvc.a.n((cvc.a) obj, this.a, 0L);
            return arnb.a;
        }
    }

    public abstract boolean a();

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        cuf et;
        long h = h(cucVar, j);
        if (a()) {
            h = dqt.f(j, h);
        }
        cvc e = cucVar.e(h);
        et = cuhVar.et(e.a, e.b, arnw.a, new AnonymousClass1(e));
        return et;
    }

    public int d(ctd ctdVar, ctc ctcVar, int i) {
        return ctcVar.a(i);
    }

    @Override // defpackage.cxi
    public int e(ctd ctdVar, ctc ctcVar, int i) {
        return ctcVar.b(i);
    }

    public int f(ctd ctdVar, ctc ctcVar, int i) {
        return ctcVar.c(i);
    }

    @Override // defpackage.cxi
    public int g(ctd ctdVar, ctc ctcVar, int i) {
        return ctcVar.d(i);
    }

    public abstract long h(cuc cucVar, long j);
}
