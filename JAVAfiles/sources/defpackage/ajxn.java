package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ajxm;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajxn implements emx, ajyb {
    final /* synthetic */ ajxm a;
    private boolean b = false;

    public ajxn(ajxm ajxmVar) {
        this.a = ajxmVar;
    }

    @Override // defpackage.ajyb
    public final ListenableFuture a() {
        ajxm ajxmVar = this.a;
        ajxm.a aVar = ajxmVar.m;
        aVar.c = true;
        if (!aVar.b && !ajxmVar.c.g() && !this.a.c.f()) {
            return this.a.g();
        }
        return albo.bI(null);
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        alog alogVar;
        String concat;
        ajxm ajxmVar = this.a;
        ajxmVar.m = (ajxm.a) new eoy(ajxmVar.o).a(ajxm.a.class);
        ajxm ajxmVar2 = this.a;
        ajxmVar2.m.d.a = ajxmVar2.h;
        if (ajxmVar2.l == null) {
            ajxmVar2.l = ajyu.a().a();
        }
        if (ajya.a(this.a.c.a()) && ((alogVar = this.a.l.c) == null || !alogVar.isEmpty())) {
            ajxm ajxmVar3 = this.a;
            alog t = ajxmVar3.r.t(ajxmVar3.l.c);
            if (t.isEmpty()) {
                concat = "";
            } else {
                concat = " Requirements: ".concat(String.valueOf(String.valueOf(t)));
            }
            IllegalStateException illegalStateException = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(concat));
            if (this.a.i) {
                ((alvg) ((alvg) ((alvg) ajxm.a.h()).g(illegalStateException)).h("com/google/apps/tiktok/account/api/controller/AccountControllerViewModelBacked$AccountControllerLifecycleObserver", "onCreate", (char) 1096, "AccountControllerViewModelBacked.java")).q("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
            } else {
                throw illegalStateException;
            }
        }
        if (this.a.m.d.a()) {
            ajxm ajxmVar4 = this.a;
            ajxmVar4.m.a = ajxm.b;
            akrh e = aktp.e("AccountController getInitialAccount");
            try {
                ListenableFuture e2 = ajxmVar4.e(ajxmVar4.l.b, new ajxb());
                e.b(e2);
                e.close();
                ajxmVar4.n = e2;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ajxm ajxmVar5 = this.a;
        ajxmVar5.f.b(ajxmVar5.k);
        this.a.p.a(this);
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        this.a.p.b(this);
        ajxp ajxpVar = this.a.m.d;
        ajxpVar.d = algw.i(Boolean.valueOf(ajxpVar.a));
        ajxpVar.c = null;
        ajxpVar.b = 3;
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        this.a.m();
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        if (this.b) {
            this.a.m();
            return;
        }
        this.b = true;
        if (this.a.m.d.a()) {
            d.t(true ^ this.a.e.c(), "Should not have account before initial start.");
            ajxm ajxmVar = this.a;
            ajxmVar.n.getClass();
            ajxl ajxlVar = ajxmVar.m.a;
            ajxlVar.getClass();
            if (ajxlVar.equals(ajxm.b)) {
                ajxm ajxmVar2 = this.a;
                ajxmVar2.l(ajxmVar2.l.b, ajxmVar2.n, 0);
            }
            this.a.n = null;
        } else {
            ajyp ajypVar = this.a.e;
            ajwt.a(ajypVar.a());
            ajypVar.o(this.a.e.b());
            this.a.m();
        }
        if (((algw) this.a.m.d.d).f() && !((Boolean) ((algw) this.a.m.d.d).b()).booleanValue()) {
            ajxm ajxmVar3 = this.a;
            if (ajxmVar3.h) {
                ajxmVar3.e.j();
            }
        }
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
