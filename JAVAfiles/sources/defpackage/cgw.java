package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgw extends cga.c implements czp, cwo, cgy, cxg {
    public final arqr a;
    public cgw b;
    public cgy c;
    public long d;
    private final Object e;

    /* compiled from: PG */
    /* renamed from: cgw$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<cgw, czo> {
        final /* synthetic */ arsb a;
        final /* synthetic */ cgw b;
        final /* synthetic */ cgs c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arsb arsbVar, cgw cgwVar, cgs cgsVar) {
            super(1);
            this.a = arsbVar;
            this.b = cgwVar;
            this.c = cgsVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            czp czpVar = (czp) obj;
            cgw cgwVar = (cgw) czpVar;
            if (((dai) cwp.g(this.b)).f.b.contains(cgwVar) && cgx.c(cgwVar, cgz.a(this.c))) {
                this.a.a = czpVar;
                return czo.c;
            }
            return czo.a;
        }
    }

    public cgw() {
        this(null);
    }

    public final void a(cgs cgsVar) {
        cgw cgwVar = this.b;
        if (cgwVar != null) {
            cgwVar.a(cgsVar);
        }
        this.b = null;
    }

    @Override // defpackage.cgy
    public final void d(cgs cgsVar) {
        czp czpVar;
        cgw cgwVar;
        cgw cgwVar2 = this.b;
        cgw cgwVar3 = null;
        if (cgwVar2 != null && cgx.c(cgwVar2, cgz.a(cgsVar))) {
            cgwVar = cgwVar2;
        } else {
            if (!this.p.z) {
                czpVar = null;
            } else {
                arsb arsbVar = new arsb();
                czq.e(this, new AnonymousClass1(arsbVar, this, cgsVar));
                czpVar = (czp) arsbVar.a;
            }
            cgwVar = (cgw) czpVar;
        }
        if (cgwVar != null && cgwVar2 == null) {
            cgx.a(cgwVar, cgsVar);
        } else if (cgwVar == null && cgwVar2 != null) {
            cgwVar2.a(cgsVar);
        } else if (!d.F(cgwVar, cgwVar2)) {
            if (cgwVar != null) {
                cgx.a(cgwVar, cgsVar);
                cgwVar3 = cgwVar;
            }
            if (cgwVar2 != null) {
                cgwVar2.a(cgsVar);
            }
            cgwVar = cgwVar3;
        } else if (cgwVar != null) {
            cgwVar.d(cgsVar);
        }
        this.b = cgwVar;
    }

    @Override // defpackage.czp
    public final Object dP() {
        return this.e;
    }

    @Override // defpackage.cxg
    public final void dX(long j) {
        this.d = j;
    }

    @Override // cga.c
    public final void s() {
        this.c = null;
        this.b = null;
    }

    public /* synthetic */ cgw(byte[] bArr) {
        this.a = null;
        this.e = cgt.a;
        this.d = 0L;
    }

    @Override // defpackage.cgy
    public final void e() {
    }

    @Override // defpackage.cxg
    public final /* synthetic */ void dW(cti ctiVar) {
    }
}
