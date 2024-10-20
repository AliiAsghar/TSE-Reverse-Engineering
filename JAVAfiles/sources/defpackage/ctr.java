package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctr extends cga.c implements cxi {
    public arqw a;

    public ctr(arqw arqwVar) {
        this.a = arqwVar;
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        return (cuf) this.a.a(cuhVar, cucVar, new dqs(j));
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
        return "LayoutModifierImpl(measureBlock=" + this.a + ')';
    }
}
