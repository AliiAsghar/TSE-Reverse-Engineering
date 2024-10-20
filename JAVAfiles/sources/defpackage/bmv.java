package defpackage;

import defpackage.cga;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmv extends cga.c implements cwm, cxi {

    /* compiled from: PG */
    /* renamed from: bmv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<cvc.a, arnb> {
        final /* synthetic */ int a;
        final /* synthetic */ cvc b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, cvc cvcVar, int i2) {
            super(1);
            this.a = i;
            this.b = cvcVar;
            this.c = i2;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f = this.a - this.b.a;
            int i = this.c;
            ((cvc.a) obj).e(this.b, arsk.g(f / 2.0f), arsk.g((i - r1.b) / 2.0f), brg.a);
            return arnb.a;
        }
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        boolean z;
        int i;
        int i2;
        cuf et;
        float o = arrn.o(((dqy) cwn.a(this, bmi.a)).a, brg.a);
        cvc e = cucVar.e(j);
        int i3 = 0;
        if (this.z && !Float.isNaN(o) && Float.compare(o, brg.a) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!Float.isNaN(o)) {
            i3 = cuhVar.eo(o);
        }
        if (z) {
            i = Math.max(e.a, i3);
        } else {
            i = e.a;
        }
        if (z) {
            i2 = Math.max(e.b, i3);
        } else {
            i2 = e.b;
        }
        et = cuhVar.et(i, i2, arnw.a, new AnonymousClass1(i, e, i2));
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
