package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import defpackage.apxm;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lro extends lrl implements akkh, apxq, akkf, aklk, akrw {
    private lrp a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public lro() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return lrp.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            lrp E = E();
            layoutInflater.getClass();
            if (true != E.b()) {
                i = R.layout.identity_details_fragment_legacy;
            } else {
                i = R.layout.identity_details_fragment;
            }
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            if (((trz) E.e.b()).p()) {
                inflate.getClass();
                TextView textView = (TextView) inflate.findViewById(R.id.identity_details_intro);
                textView.setText(R.string.security_key_page_intro);
                Context context = inflate.getContext();
                Resources resources = context.getResources();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(R.string.security_key_page_description));
                String e = ((trz) E.e.b()).e();
                e.getClass();
                if (!TextUtils.isEmpty(e)) {
                    String bs = yyb.bs(context);
                    spannableStringBuilder = aabr.af(context, spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bs).toString(), bs);
                    ((TextView) inflate.findViewById(R.id.identity_details_learn_more)).setOnClickListener(new iix(context, aabr.aa(e, context), 13));
                }
                ((TextView) inflate.findViewById(R.id.identity_details_learn_more)).setText(spannableStringBuilder);
                akgu akguVar = (akgu) E.h.b();
                txg txgVar = (txg) E.f.b();
                qei qeiVar = E.i.c;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                akguVar.a(R.id.get_identity_details_security_key, new txf(txgVar, qeiVar, E.i.d), E.j);
                ((mbl) E.g.b()).c("Bugle.Etouffee.UI.IdentityDetails.Page.Open.Counts");
            }
            if (E.b()) {
                inflate.getClass();
                ComposeView composeView = (ComposeView) inflate.findViewById(R.id.identity_details_compose_view);
                composeView.j();
                composeView.a(new cdj(-1954299512, true, new lfw(E, 9)));
            }
            inflate.getClass();
            akqj.p();
            return inflate;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg, defpackage.enm
    public final enh N() {
        return this.e;
    }

    @Override // defpackage.lrl, defpackage.aiuc, defpackage.cg
    public final void Y(Activity activity) {
        this.c.k();
        try {
            super.Y(activity);
            akqj.p();
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final void aG(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        super.aG(intent);
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.d == null) {
            this.d = new aklm(this, super.x());
        }
        return this.d;
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final aktr aW() {
        return this.c.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.c.e(aktrVar, z);
    }

    @Override // defpackage.aklf, defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.c.b = aktrVar;
    }

    @Override // defpackage.cg
    public final void ak(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        albo.U(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ak(bundle);
    }

    @Override // defpackage.cg
    public final void ar(boolean z) {
        d.H(z);
    }

    @Override // defpackage.cg
    public final void au(Intent intent) {
        if (akec.y(intent, x().getApplicationContext())) {
            akto.m(intent);
        }
        aG(intent);
    }

    @Override // defpackage.lrl
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.lrl, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        krv krvVar = ((kqm) aS).a;
                        apya apyaVar = krvVar.kI;
                        apya apyaVar2 = krvVar.ee;
                        apya apyaVar3 = krvVar.a.gq;
                        apya apyaVar4 = krvVar.bB;
                        apya apyaVar5 = ((kqm) aS).T;
                        Bundle a = ((kqm) aS).a();
                        aozs aozsVar = (aozs) ((kqm) aS).a.a.dt.b();
                        d.t(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        lrn lrnVar = (lrn) aowt.f(a, "TIKTOK_FRAGMENT_ARGUMENT", lrn.a, aozsVar);
                        lrnVar.getClass();
                        this.a = new lrp(cgVar, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, lrnVar);
                        this.Z.c(new akli(this.c, this.e));
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aD = aD();
            LayoutInflater cloneInContext = aD.cloneInContext(new apxm.a(aD, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new aklm(this, cloneInContext));
            akqj.p();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuc, defpackage.cg
    public final void i() {
        aksa a = this.c.a();
        try {
            aV();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akkh
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final lrp E() {
        lrp lrpVar = this.a;
        if (lrpVar != null) {
            if (!this.ag) {
                return lrpVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.lrl, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
