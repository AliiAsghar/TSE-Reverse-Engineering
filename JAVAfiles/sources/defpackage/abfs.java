package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.welcome.EmergencySmsButtonView;
import defpackage.abft;
import defpackage.apxm;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfs extends abfa implements akkh, apxq, akkf, aklk, akrw, akwc {
    private abft a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public abfs() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return abft.class;
    }

    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            abft E = E();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.welcome_fragment_rcs_consent_layout_scroll, viewGroup, false);
            EmergencySmsButtonView emergencySmsButtonView = (EmergencySmsButtonView) inflate.findViewById(R.id.welcome_fragment_rcs_consent_emergency_sms_button);
            adea adeaVar = (adea) E.g.b();
            emergencySmsButtonView.getClass();
            adeaVar.d(emergencySmsButtonView, E.k.F(), 4);
            TextView textView = (TextView) inflate.findViewById(R.id.welcome_fragment_rcs_consent_description);
            inflate.getClass();
            String string = E.l.getString(R.string.rcs_chats_terms_of_service);
            string.getClass();
            String string2 = E.l.getString(R.string.rcs_chats);
            string2.getClass();
            String string3 = E.l.getString(R.string.welcome_chat_features_legal_v2_tooltip_fix, string2, string);
            string3.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
            String string4 = E.l.getString(R.string.rcs_chats);
            string4.getClass();
            int T = arsd.T(string3, string4, 0, 6);
            if (T != -1) {
                spannableStringBuilder.setSpan(new abfu(E, (TextView) inflate.findViewById(R.id.welcome_fragment_rcs_consent_description)), T, string4.length() + T, 17);
            }
            E.m.r(E.l, spannableStringBuilder);
            textView.setText(spannableStringBuilder);
            ahnz.s(textView);
            ahnz.t(textView);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.welcome_fragment_rcs_consent_animation);
            lottieAnimationView.e(E.l.getString(R.string.rcs_tos_animation_json));
            ajcj x = ahnz.x(E.k.F());
            ajcl ajclVar = ajcl.a;
            lottieAnimationView.getClass();
            ahnz.B(ajclVar, lottieAnimationView, x);
            ((aohs) E.d.b()).s((Button) inflate.findViewById(R.id.welcome_fragment_rcs_consent_accept_button), new abft.a());
            TextView textView2 = (TextView) inflate.findViewById(R.id.welcome_fragment_rcs_consent_decline);
            textView2.setVisibility(0);
            ((aohs) E.d.b()).s(textView2, new abft.b());
            View findViewById = inflate.findViewById(R.id.content_view);
            findViewById.getClass();
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
            af afVar = new af();
            afVar.e(constraintLayout);
            afVar.d(R.id.welcome_fragment_rcs_consent_animation, 4);
            int i = 3;
            afVar.f(R.id.welcome_fragment_rcs_consent_animation, 4, R.id.welcome_fragment_rcs_consent_description, 3);
            afVar.b(constraintLayout);
            textView.setTypeface(null);
            TextView textView3 = (TextView) inflate.findViewById(R.id.welcome_fragment_rcs_multisim_text);
            if (((yjy) E.i.b()).a() >= 2) {
                ((zfh) E.h.b()).q(E.k.x(), textView3);
                textView3.setOnClickListener(new abbh(E, textView3, i));
            } else {
                textView3.setVisibility(8);
            }
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

    @Override // defpackage.abfa, defpackage.aiuc, defpackage.cg
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
            abft E = E();
            View findViewById = E.k.L().findViewById(R.id.welcome_fragment_rcs_consent_animation);
            findViewById.getClass();
            ((LottieAnimationView) findViewById).c();
            if (!E.n.getAndSet(true)) {
                qjh.l(E.j, null, new aanv(E, (arpe) null, 12), 3);
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
            abft E = E();
            aktp.H(this, abft.a.class, new aawx(E, 14));
            aktp.H(this, abft.b.class, new aawx(E, 15));
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

    @Override // defpackage.abfa
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.abfa, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        apya apyaVar = ((kqm) aS).Y;
                        apya apyaVar2 = ((kqm) aS).aP;
                        krv krvVar = ((kqm) aS).a;
                        apya apyaVar3 = krvVar.au;
                        kqj kqjVar = ((kqm) aS).bh;
                        apya apyaVar4 = kqjVar.aG;
                        apya apyaVar5 = krvVar.gD;
                        apya apyaVar6 = kqjVar.aB;
                        apya apyaVar7 = ((kqm) aS).aO;
                        apya apyaVar8 = ((kqm) aS).aK;
                        apya apyaVar9 = krvVar.aF;
                        arwe arweVar = (arwe) krvVar.dP.b();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof abfs) {
                            this.a = new abft(apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, apyaVar9, arweVar, (abfs) cgVar, ((kqm) aS).bh.az);
                            this.Z.c(new akli(this.c, this.e));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, abft.class));
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
    public final abft E() {
        abft abftVar = this.a;
        if (abftVar != null) {
            if (!this.ag) {
                return abftVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.abfa, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
