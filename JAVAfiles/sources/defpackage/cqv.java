package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqv extends cga.c implements czp, czi, cwm {
    public final String a = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    public cqx b;
    public boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cqv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqr<cqv, czo> {
        final /* synthetic */ arrx a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(arrx arrxVar) {
            super(1);
            this.a = arrxVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            if (((cqv) obj).c) {
                this.a.a = false;
                return czo.c;
            }
            return czo.a;
        }
    }

    public cqv(cqx cqxVar) {
        this.b = cqxVar;
    }

    private final cqz d() {
        return (cqz) cwn.a(this, dch.o);
    }

    private final void e() {
        cqx cqxVar;
        arsb arsbVar = new arsb();
        czq.c(this, new cqw());
        cqv cqvVar = (cqv) arsbVar.a;
        if (cqvVar == null || (cqxVar = cqvVar.b) == null) {
            cqxVar = this.b;
        }
        cqz d = d();
        if (d != null) {
            d.a(cqxVar);
        }
    }

    private final void f() {
        arnb arnbVar;
        cqz d;
        if (this.c) {
            this.c = false;
            if (this.z) {
                arsb arsbVar = new arsb();
                czq.c(this, new cqu(arsbVar));
                cqv cqvVar = (cqv) arsbVar.a;
                if (cqvVar != null) {
                    cqvVar.e();
                    arnbVar = arnb.a;
                } else {
                    arnbVar = null;
                }
                if (arnbVar == null && (d = d()) != null) {
                    d.a(null);
                }
            }
        }
    }

    public final void a() {
        arrx arrxVar = new arrx();
        arrxVar.a = true;
        czq.e(this, new AnonymousClass1(arrxVar));
        if (arrxVar.a) {
            e();
        }
    }

    @Override // defpackage.czp
    public final /* synthetic */ Object dP() {
        return this.a;
    }

    @Override // defpackage.czi
    public final void dR() {
        f();
    }

    @Override // defpackage.czi
    public final /* synthetic */ void dS() {
        czh.a(this);
    }

    @Override // defpackage.czi
    public final void dT(cqq cqqVar, cqs cqsVar, long j) {
        if (cqsVar == cqs.b) {
            int i = cqqVar.d;
            if (!a.bA(i, 4)) {
                if (a.bA(i, 5)) {
                    f();
                }
            } else {
                this.c = true;
                a();
            }
        }
    }

    @Override // defpackage.czi
    public final /* synthetic */ void dU() {
        czh.b(this);
    }

    @Override // cga.c
    public final void s() {
        f();
    }

    @Override // defpackage.czi
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.czi
    public final /* synthetic */ void x() {
    }
}
