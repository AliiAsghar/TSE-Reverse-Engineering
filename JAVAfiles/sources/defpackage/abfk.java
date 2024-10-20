package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.welcome.EmergencySmsButtonView;
import defpackage.abfl;
import defpackage.apxm;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfk extends abey implements akkh, apxq, akkf, aklk, akrw, akwc {
    private abfl a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);
    private final akmy ah = new akmy((byte[]) null);

    @Deprecated
    public abfk() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return abfl.class;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Optional empty;
        int i;
        int i2;
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            abfl E = E();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.welcome_fragment_gaia_auto_sign_in_layout, viewGroup, false);
            ((TextView) inflate.findViewById(R.id.welcome_gaia_auto_sign_account_info_title)).setVisibility(8);
            TextView textView = (TextView) inflate.findViewById(R.id.welcome_gaia_auto_sign_account_info_title_v2);
            textView.setVisibility(0);
            TextView textView2 = (TextView) inflate.findViewById(R.id.welcome_gaia_auto_sign_in_account_name);
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            layoutParams.getClass();
            ad adVar = (ad) layoutParams;
            adVar.i = textView.getId();
            textView2.setLayoutParams(adVar);
            textView2.requestLayout();
            EmergencySmsButtonView emergencySmsButtonView = (EmergencySmsButtonView) inflate.findViewById(R.id.welcome_gaia_auto_sign_in_emergency_sms_button);
            adea adeaVar = (adea) E.d.b();
            emergencySmsButtonView.getClass();
            adeaVar.d(emergencySmsButtonView, E.e.F(), 6);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.welcome_gaia_auto_sign_in_promo_list);
            adea adeaVar2 = (adea) E.d.b();
            cj F = E.e.F();
            linearLayout.getClass();
            apax apaxVar = ((aplg) abgh.b.e()).b;
            apaxVar.getClass();
            for (String str : aqjn.ax(apaxVar)) {
                View inflate2 = LayoutInflater.from(F).inflate(R.layout.gaia_auto_sign_in_promo_list_item_layout, (ViewGroup) linearLayout, false);
                ImageView imageView = (ImageView) inflate2.findViewById(R.id.item_icon);
                abfn abfnVar = (abfn) adeaVar2.a.get(str);
                if (abfnVar != null) {
                    i = abfnVar.a;
                } else {
                    i = 0;
                }
                imageView.setImageResource(i);
                TextView textView3 = (TextView) inflate2.findViewById(R.id.item_text);
                abfn abfnVar2 = (abfn) adeaVar2.a.get(str);
                if (abfnVar2 != null) {
                    i2 = abfnVar2.b;
                } else {
                    i2 = 0;
                }
                textView3.setText(F.getString(i2));
                linearLayout.addView(inflate2);
            }
            ((aohs) E.b.b()).s((Button) inflate.findViewById(R.id.welcome_gaia_auto_sign_in_next_button), new abfl.a());
            inflate.getClass();
            try {
                empty = Optional.of(aowt.c(E.e.F().getIntent(), "extra_gaia_account_info", ajzb.a, aozs.a()));
            } catch (apba unused) {
                empty = Optional.empty();
            }
            if (empty.isPresent()) {
                ((TextView) inflate.findViewById(R.id.welcome_gaia_auto_sign_in_account_name)).setText(((ajzb) empty.get()).d);
                ((TextView) inflate.findViewById(R.id.welcome_gaia_auto_sign_in_account_display_id)).setText(((ajzb) empty.get()).e);
                ((hlp) ((hlp) ((hlp) E.h.g(((ajzb) empty.get()).f).X()).E(E.f.getDrawable(R.drawable.gaia_auto_sign_in_profile_bubble))).z()).t((ImageView) inflate.findViewById(R.id.welcome_gaia_auto_sign_in_profile_image));
                akqj.p();
                return inflate;
            }
            throw new IllegalStateException("Account info not found");
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

    @Override // defpackage.abey, defpackage.aiuc, defpackage.cg
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
            abfl E = E();
            if (!E.g.getAndSet(true)) {
                ((zfj) E.c.b()).c(6);
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
            aktp.H(this, abfl.a.class, new aawx(E(), 12));
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

    @Override // defpackage.abey
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.akwc
    public final akwa e(akvv akvvVar) {
        return this.ah.k(akvvVar);
    }

    @Override // defpackage.abey, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        krv krvVar = ((kqm) aS).a;
                        apya apyaVar = krvVar.au;
                        kqj kqjVar = ((kqm) aS).bh;
                        apya apyaVar2 = kqjVar.aG;
                        apya apyaVar3 = krvVar.gD;
                        apya apyaVar4 = kqjVar.aB;
                        apya apyaVar5 = ((kqm) aS).aO;
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof abfk) {
                            this.a = new abfl(apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, (abfk) cgVar, kqjVar.az, ((kqm) aS).T, (aquq) krvVar.xy.b());
                            this.Z.c(new akli(this.c, this.e));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, abfl.class));
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
    public final abfl E() {
        abfl abflVar = this.a;
        if (abflVar != null) {
            if (!this.ag) {
                return abflVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.abey, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
