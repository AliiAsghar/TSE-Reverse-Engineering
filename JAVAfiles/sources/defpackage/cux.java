package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cux extends cga.c implements cxg {
    public arqr a;
    public long b = -9223372034707292160L;

    public cux(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // cga.c
    public final boolean dL() {
        return true;
    }

    @Override // defpackage.cxg
    public final void dX(long j) {
        if (!a.bB(this.b, j)) {
            this.a.a(new dri(j));
            this.b = j;
        }
    }

    @Override // defpackage.cxg
    public final /* synthetic */ void dW(cti ctiVar) {
    }
}
