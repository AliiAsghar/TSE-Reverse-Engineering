package defpackage;

import defpackage.dli;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbu extends cwr implements cxi, cwx, cwz {
    public bbw a;
    public final bca b;

    public bbu(dhv dhvVar, dje djeVar, dli.a aVar, arqr arqrVar, int i, boolean z, int i2, int i3, List list, arqr arqrVar2, bbw bbwVar, ckx ckxVar) {
        this.a = bbwVar;
        bca bcaVar = new bca(dhvVar, djeVar, aVar, arqrVar, i, z, i2, i3, list, arqrVar2, this.a, ckxVar, null);
        K(bcaVar);
        this.b = bcaVar;
        if (this.a != null) {
            return;
        }
        aju.a("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new armj();
    }

    @Override // defpackage.cxi
    public final cuf b(cuh cuhVar, cuc cucVar, long j) {
        return this.b.b(cuhVar, cucVar, j);
    }

    @Override // defpackage.cxi
    public final int d(ctd ctdVar, ctc ctcVar, int i) {
        return this.b.d(ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final int e(ctd ctdVar, ctc ctcVar, int i) {
        return this.b.e(ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final int f(ctd ctdVar, ctc ctcVar, int i) {
        return this.b.f(ctdVar, ctcVar, i);
    }

    @Override // defpackage.cxi
    public final int g(ctd ctdVar, ctc ctcVar, int i) {
        return this.b.g(ctdVar, ctcVar, i);
    }

    @Override // defpackage.cwz
    public final void i(cti ctiVar) {
        bbw bbwVar = this.a;
        if (bbwVar != null) {
            bbwVar.d = bbz.a(bbwVar.d, ctiVar, null, 2);
            bbwVar.b.c(bbwVar.a);
        }
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        this.b.r(cntVar);
    }

    @Override // defpackage.cwx
    public final /* synthetic */ void t() {
    }
}
