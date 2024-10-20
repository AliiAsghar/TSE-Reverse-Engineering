package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.welcome.EmergencySmsButtonView;
import defpackage.abfp;
import defpackage.apxm;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfo extends abez implements akkh, apxq, akkf, aklk, akrw, akwc {
    private abfp a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public abfo() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return abfp.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            abfp E = E();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.welcome_fragment_federated_learning_layout_scroll, viewGroup, false);
            EmergencySmsButtonView emergencySmsButtonView = (EmergencySmsButtonView) inflate.findViewById(R.id.welcome_fragment_federated_learning_emergency_sms_button);
            adea adeaVar = (adea) E.g.b();
            emergencySmsButtonView.getClass();
            adeaVar.d(emergencySmsButtonView, E.h.F(), 2);
            TextView textView = (TextView) inflate.findViewById(R.id.welcome_fragment_federated_learning_description);
            String string = E.i.getString(R.string.welcome_federated_learning_manage_in_settings_variant);
            string.getClass();
            String bt = yyb.bt(E.i.getString(R.string.welcome_federated_learning_learn_more_label));
            String string2 = E.i.getString(R.string.welcome_federated_learning_description_variant, bt, string);
            string2.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            bt.getClass();
            int ai = arsd.ai(string2, bt);
            spannableStringBuilder.setSpan(new abfq(E), ai, bt.length() + ai, 17);
            int ai2 = arsd.ai(string2, string);
            spannableStringBuilder.setSpan(new abfr(E), ai2, string.length() + ai2, 17);
            textView.setText(spannableStringBuilder);
            ahnz.s(textView);
            ahnz.t(textView);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.welcome_fragment_federated_learning_animation);
            lottieAnimationView.e(E.i.getString(R.string.smarts_animation_json));
            ajcj x = ahnz.x(E.h.F());
            ajcp ajcpVar = ajcp.a;
            lottieAnimationView.getClass();
            ahnz.B(ajcpVar, lottieAnimationView, x);
            ((aohs) E.d.b()).s((Button) inflate.findViewById(R.id.welcome_fragment_federated_learning_next_button), new abfp.a());
            inflate.findViewById(R.id.welcome_fragment_overall_title).setVisibility(0);
            ((TextView) inflate.findViewById(R.id.welcome_fragment_federated_learning_title)).setText(E.i.getString(R.string.welcome_federated_learning_title_variant));
            textView.setTypeface(null);
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

    @Override // defpackage.abez, defpackage.aiuc, defpackage.cg
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

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void af() {
        aksa b = this.c.b();
        try {
            bb();
            abfp E = E();
            View findViewById = E.h.L().findViewById(R.id.welcome_fragment_federated_learning_animation);
            findViewById.getClass();
            ((LottieAnimationView) findViewById).c();
            if (!E.j.getAndSet(true)) {
                ((zfj) E.f.b()).c(2);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.c.k();
        try {
            aktp.bH(this).a = view;
            E();
            aktp.H(this, abfp.a.class, new aawx(E(), 13));
            bf(view, bundle);
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

    @Override // defpackage.abez
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.abez, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        Optional empty = Optional.empty();
                        krv krvVar = ((kqm) aS).a;
                        apya apyaVar = krvVar.au;
                        kqj kqjVar = ((kqm) aS).bh;
                        apya apyaVar2 = kqjVar.aG;
                        apya apyaVar3 = krvVar.gD;
                        apya apyaVar4 = kqjVar.aB;
                        apya apyaVar5 = ((kqm) aS).aO;
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof abfo) {
                            this.a = new abfp(empty, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, (abfo) cgVar);
                            this.Z.c(new akli(this.c, this.e));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, abfp.class));
                        }
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

    @Override // defpackage.akwc
    public final void o(Class cls, akvz akvzVar) {
        this.ah.l(cls, akvzVar);
    }

    @Override // defpackage.akkh
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final abfp E() {
        abfp abfpVar = this.a;
        if (abfpVar != null) {
            if (!this.ag) {
                return abfpVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.abez, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
