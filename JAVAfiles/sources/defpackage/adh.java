package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adh extends cga.c implements cwx, cyu {
    public long a;
    public cko b;
    public cmb d;
    public cln e;
    private drk g;
    private cln h;
    private cmb i;
    public float c = 1.0f;
    private long f = 9205357640488583168L;

    public adh(long j, cko ckoVar, cmb cmbVar) {
        this.a = j;
        this.b = ckoVar;
        this.d = cmbVar;
    }

    @Override // defpackage.cyu
    public final void a() {
        this.f = 9205357640488583168L;
        this.g = null;
        this.h = null;
        this.i = null;
        cwy.a(this);
    }

    @Override // defpackage.cwx
    public final void r(cnt cntVar) {
        cln clnVar;
        if (this.d == clw.a) {
            if (!a.bB(this.a, cku.h)) {
                cnw.l(cntVar, this.a, 0L, 0L, brg.a, null, 126);
            }
            cko ckoVar = this.b;
            if (ckoVar != null) {
                cnw.k(cntVar, ckoVar, 0L, 0L, this.c, null, 118);
            }
        } else {
            if (a.bB(cntVar.o(), this.f) && cntVar.r() == this.g && d.F(this.i, this.d)) {
                clnVar = this.h;
                clnVar.getClass();
            } else {
                cyv.a(this, new adg(this, cntVar));
                clnVar = this.e;
                this.e = null;
            }
            this.h = clnVar;
            this.f = cntVar.o();
            this.g = cntVar.r();
            this.i = this.d;
            clnVar.getClass();
            if (!a.bB(this.a, cku.h)) {
                clo.b(cntVar, clnVar, this.a);
            }
            cko ckoVar2 = this.b;
            if (ckoVar2 != null) {
                clo.a(cntVar, clnVar, ckoVar2, this.c);
            }
        }
        cntVar.p();
    }

    @Override // defpackage.cwx
    public final /* synthetic */ void t() {
    }
}
