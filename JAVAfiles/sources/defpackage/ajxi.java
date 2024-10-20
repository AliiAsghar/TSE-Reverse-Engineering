package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajxi implements emx, ajyb {
    final /* synthetic */ ajxf a;
    private boolean b;
    private boolean c = false;
    private Bundle d;

    public ajxi(ajxf ajxfVar) {
        this.a = ajxfVar;
    }

    @Override // defpackage.ajyb
    public final ListenableFuture a() {
        ajxf ajxfVar = this.a;
        ajxfVar.o = true;
        if (!ajxfVar.n && !ajxfVar.c.h() && !this.a.c.g()) {
            return this.a.g();
        }
        return albo.bI(null);
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        Bundle bundle;
        alog alogVar;
        String concat;
        ajxf ajxfVar = this.a;
        if (ajxfVar.l == null) {
            ajxfVar.l = ajyu.a().a();
        }
        if (ajya.a(this.a.c.a()) && ((alogVar = this.a.l.c) == null || !alogVar.isEmpty())) {
            ajxf ajxfVar2 = this.a;
            alog t = ajxfVar2.t.t(ajxfVar2.l.c);
            if (t.isEmpty()) {
                concat = "";
            } else {
                concat = " Requirements: ".concat(String.valueOf(String.valueOf(t)));
            }
            IllegalStateException illegalStateException = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(concat));
            if (this.a.i) {
                ((alvg) ((alvg) ((alvg) ajxf.a.h()).g(illegalStateException)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$AccountControllerLifecycleObserver", "onCreate", (char) 1108, "AccountControllerImpl.java")).q("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
            } else {
                throw illegalStateException;
            }
        }
        if (this.a.q.aK().e()) {
            bundle = this.a.q.aK().b("tiktok_account_controller_saved_instance_state");
        } else {
            bundle = null;
        }
        this.d = bundle;
        boolean z = true;
        if (bundle != null && (this.a.h || !bundle.getBoolean("tiktok_accounts_disabled"))) {
            z = false;
        }
        this.b = z;
        if (z) {
            ajxf ajxfVar3 = this.a;
            ajxfVar3.m = ajxf.b;
            ajxfVar3.p = ajxfVar3.e(ajxfVar3.l.b, new ajxb());
        } else {
            ajxf ajxfVar4 = this.a;
            Bundle bundle2 = this.d;
            ajxl ajxlVar = ajxl.a;
            aozs aozsVar = aozs.a;
            apcc apccVar = apcc.a;
            ajxfVar4.m = (ajxl) aowt.f(bundle2, "state_latest_operation", ajxlVar, aozs.a);
            this.a.n = this.d.getBoolean("state_pending_op");
        }
        ajxf ajxfVar5 = this.a;
        ajxfVar5.f.b(ajxfVar5.k);
        this.a.r.a(this);
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        this.a.r.b(this);
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        this.a.m();
    }

    @Override // defpackage.emx
    public final void h(enm enmVar) {
        if (this.c) {
            this.a.m();
            return;
        }
        this.c = true;
        if (this.b) {
            d.t(true ^ this.a.e.c(), "Should not have account before initial start.");
            ajxf ajxfVar = this.a;
            ajxfVar.p.getClass();
            ajxl ajxlVar = ajxfVar.m;
            ajxlVar.getClass();
            if (ajxlVar.equals(ajxf.b)) {
                ajxf ajxfVar2 = this.a;
                ajxfVar2.l(ajxfVar2.l.b, ajxfVar2.p, 0);
            }
            this.a.p = null;
        } else {
            ajyp ajypVar = this.a.e;
            ajwt.a(ajypVar.a());
            ajypVar.o(this.a.e.b());
            this.a.o = this.d.getBoolean("state_do_not_revalidate");
            this.a.m();
        }
        Bundle bundle = this.d;
        if (bundle != null && this.a.h && !bundle.getBoolean("tiktok_accounts_disabled")) {
            this.a.e.j();
        }
        this.d = null;
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
