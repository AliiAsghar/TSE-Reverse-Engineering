package defpackage;

import android.R;
import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.apps.messaging.ui.rcs.setup.auto.RcsPromoActivity;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class aaza implements aayl {
    public final RcsPromoActivity a;
    public final vqu b;
    public final mho c;
    public final yjr d;
    public SharedPreferences.OnSharedPreferenceChangeListener e;
    public abrd f;
    public final zap g;
    private final ykw h;
    private final armf i;

    public aaza(RcsPromoActivity rcsPromoActivity, vqu vquVar, armf armfVar, ykw ykwVar, yjr yjrVar, zap zapVar, armf armfVar2) {
        this.a = rcsPromoActivity;
        this.b = vquVar;
        this.c = (mho) armfVar.b();
        this.h = ykwVar;
        this.d = yjrVar;
        this.g = zapVar;
        this.i = armfVar2;
    }

    public final void a() {
        this.c.aS(51);
        this.c.x();
        da a = this.a.a();
        if (a.e("rcsSuccess") != null) {
            return;
        }
        abaf abafVar = new abaf();
        bd bdVar = new bd(a);
        bdVar.v(R.id.content, abafVar, "rcsSuccess");
        bdVar.j();
    }

    public final void b() {
        aayp aaypVar = new aayp();
        bd bdVar = new bd(this.a.a());
        bdVar.v(R.id.content, aaypVar, "RcsTermsAndConditionsFragmentPeer");
        bdVar.b();
    }

    public final void c() {
        this.c.aS(42);
        this.h.h("boew_promo_complete", true);
        aazc aazcVar = new aazc();
        bd bdVar = new bd(this.a.a());
        bdVar.v(R.id.content, aazcVar, "RcsWaitingFragmentPeer");
        bdVar.b();
        ((adnk) this.i.b()).G();
    }

    public final void d() {
        if (this.e != null) {
            this.a.getSharedPreferences("bugle", 0).unregisterOnSharedPreferenceChangeListener(this.e);
        }
    }

    @Override // defpackage.aayl
    public final void h(Activity activity) {
        xzb.j("BugleRcs", "RcsPromoActivity: BOEW granted");
        this.c.S(amlw.RCS_PROVISIONING_BOEW_ACCEPTED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
        c();
    }

    @Override // defpackage.aayl
    public final void i() {
        xzb.j("BugleRcs", "RcsPromoActivity: SKIP.");
        this.c.S(amlw.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_REJECTED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
        this.h.h("boew_promo_complete", true);
        this.c.x();
        this.a.finish();
    }

    @Override // defpackage.aayl
    public final void j() {
        this.c.S(amlw.RCS_PROVISIONING_BOEW_REJECTED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
    }

    @Override // defpackage.aayl
    public final void k(Activity activity) {
        this.c.S(amlw.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_ACCEPTED, amlx.PROVISIONING_UI_TYPE_RCS_PROMO);
    }
}
