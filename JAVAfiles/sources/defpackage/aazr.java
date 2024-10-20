package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazr extends aazp implements akkh, apxq, akkf, aklk, akrw {
    private aazt ah;
    private Context ai;
    private final eno aj = new eno(this);
    private final akqf ak = new akqf(this);
    private boolean al;

    @Deprecated
    public aazr() {
        aiut.c();
    }

    public static aazr aP(aazz aazzVar) {
        aazr aazrVar = new aazr();
        apxh.e(aazrVar);
        aklt.a(aazrVar, aazzVar);
        return aazrVar;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return aazt.class;
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.k();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            aazt E = E();
            View inflate = layoutInflater.inflate(R.layout.phone_number_input_bottomsheet_layout, viewGroup, false);
            inflate.getViewTreeObserver().addOnWindowFocusChangeListener(new ajud(E, 1));
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
        return this.aj;
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final void W(Bundle bundle) {
        this.ak.k();
        try {
            super.W(bundle);
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

    @Override // defpackage.aiuh, defpackage.cg
    public final void X(int i, int i2, Intent intent) {
        aksa f = this.ak.f();
        try {
            super.X(i, i2, intent);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aazp, defpackage.aiuh, defpackage.cg
    public final void Y(Activity activity) {
        this.ak.k();
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

    @Override // defpackage.aiuh, defpackage.cg
    public final boolean aC(MenuItem menuItem) {
        aksa j = this.ak.j();
        try {
            boolean aC = super.aC(menuItem);
            j.close();
            return aC;
        } catch (Throwable th) {
            try {
                j.close();
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

    @Override // defpackage.cg
    public final void aH(int i, int i2) {
        this.ak.h(i, i2);
        akqj.p();
    }

    @Override // defpackage.aazp
    protected final /* synthetic */ apxh aN() {
        return new aklt(this);
    }

    @Override // defpackage.akkh
    /* renamed from: aQ, reason: merged with bridge method [inline-methods] */
    public final aazt E() {
        aazt aaztVar = this.ah;
        if (aaztVar != null) {
            if (!this.al) {
                return aaztVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.akkf
    @Deprecated
    public final Context aU() {
        if (this.ai == null) {
            this.ai = new aklm(this, super.x());
        }
        return this.ai;
    }

    @Override // defpackage.akrw
    public final aktr aW() {
        return this.ak.a;
    }

    @Override // defpackage.aklk
    public final Locale aX() {
        return akec.q(this);
    }

    @Override // defpackage.akrw
    public final void aY(aktr aktrVar, boolean z) {
        this.ak.e(aktrVar, z);
    }

    @Override // defpackage.akrw
    public final void aZ(aktr aktrVar) {
        this.ak.b = aktrVar;
    }

    @Override // defpackage.aiuh, defpackage.cg
    public final void aa() {
        aksa b = this.ak.b();
        try {
            super.aa();
            aazt E = E();
            ahjj ahjjVar = E.A;
            if (ahjjVar != null) {
                ((abaa) ahjjVar.a).b = null;
                E.A = null;
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

    @Override // defpackage.aiuh, defpackage.cg
    public final void ad() {
        this.ak.k();
        try {
            super.ad();
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

    @Override // defpackage.aiuh, defpackage.cg
    public final void af() {
        aksa b = this.ak.b();
        try {
            super.af();
            aazt E = E();
            E.l();
            if (((Optional) E.c.get()).isPresent()) {
                E.k(amlw.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_SEEN);
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

    @Override // defpackage.aiuh, defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.ak.k();
        try {
            super.ag(view, bundle);
            final aazt E = E();
            if (E.p()) {
                TextView textView = (TextView) E.d.L().findViewById(R.id.tos_reminder_text);
                zrs zrsVar = (zrs) E.i.b();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((Context) zrsVar.a).getString(R.string.phone_number_input_tos_reminder_text_v2, ((Context) zrsVar.a).getString(R.string.phone_number_input_tos_text_v2)));
                String string = ((Context) zrsVar.a).getResources().getString(R.string.phone_number_input_tos_text_v2);
                int indexOf = TextUtils.indexOf(spannableStringBuilder, string);
                if (indexOf != -1) {
                    spannableStringBuilder.setSpan(new abab(aaxz.b(yhx.b((Context) zrsVar.a))), indexOf, string.length() + indexOf, 17);
                }
                textView.setText(spannableStringBuilder);
                ahnz.s(textView);
                ahnz.t(textView);
                textView.setVisibility(0);
            }
            if (E.q()) {
                E.d.L().findViewById(R.id.multi_sim_subtitle).setVisibility(0);
                ((zfh) E.j.b()).q(E.d.y(), (TextView) E.d.L().findViewById(R.id.multi_sim_subtitle));
            }
            TextInputLayout textInputLayout = (TextInputLayout) E.d.L().findViewById(R.id.country_code_text_container);
            textInputLayout.u(new aazu(textInputLayout));
            TextInputEditText textInputEditText = (TextInputEditText) E.d.L().findViewById(R.id.country_code_text);
            textInputEditText.setInputType(0);
            textInputEditText.setKeyListener(null);
            textInputEditText.setLongClickable(false);
            textInputEditText.setOnClickListener(new acah(E, 1));
            textInputEditText.setOnTouchListener(new nhn(2));
            TextInputEditText textInputEditText2 = (TextInputEditText) E.d.L().findViewById(R.id.phone_number_text);
            E.c().addTextChangedListener(E.e());
            ahnz.t(textInputEditText);
            ahnz.t(textInputEditText2);
            textInputLayout.h(yzc.q(E.d.F()));
            ((TextInputLayout) E.d.L().findViewById(R.id.phone_number_text_container)).h(yzc.q(E.d.F()));
            String f = ((ykw) E.g.b()).f("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(E.e)), "");
            E.s = E.f();
            E.j();
            if (!TextUtils.isEmpty(f)) {
                E.c().setText(f);
            } else {
                E.a().setEnabled(false);
            }
            ((Button) E.d.L().findViewById(R.id.cancel_button)).setOnClickListener(new aaxc(E, 20));
            ((Button) E.d.L().findViewById(R.id.continue_button)).setOnClickListener(new View.OnClickListener() { // from class: aazs
                /* JADX WARN: Type inference failed for: r0v20, types: [java.util.concurrent.Executor, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v24, types: [java.util.concurrent.Executor, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean C;
                    boolean booleanValue = ((Boolean) new mst(12).get()).booleanValue();
                    aazt aaztVar = aazt.this;
                    if (booleanValue) {
                        C = aaztVar.d().q();
                    } else {
                        C = ((yjr) aaztVar.f.b()).C(aaztVar.h());
                    }
                    if (!C) {
                        aaztVar.c().setError(aaztVar.d.x().getString(R.string.phone_number_input_invalid_number_text));
                        return;
                    }
                    aaztVar.s(10);
                    Editable text = aaztVar.c().getText();
                    ajcb ajcbVar = aaztVar.s;
                    String h = aaztVar.h();
                    if (ajcbVar != null && text != null) {
                        boolean z = true;
                        if (((Boolean) new msn(16).get()).booleanValue()) {
                            msh d = aaztVar.d();
                            int r = aaztVar.r();
                            wpp wppVar = (wpp) aaztVar.o.b();
                            String str = aaztVar.e;
                            String ag = albo.ag(d.o(((Boolean) new msn(16).get()).booleanValue()));
                            if (r != 4) {
                                z = false;
                            }
                            wgi A = wppVar.A(ag, z, str);
                            ((akbo) aaztVar.l.b()).j(ahlp.l(((wpp) aaztVar.o.b()).B(aaztVar.e, A)), ahlp.m(A), aaztVar.x);
                        } else {
                            String ag2 = albo.ag(h);
                            int r2 = aaztVar.r();
                            wpp wppVar2 = (wpp) aaztVar.o.b();
                            String str2 = aaztVar.e;
                            if (r2 != 4) {
                                z = false;
                            }
                            wgi A2 = wppVar2.A(ag2, z, str2);
                            ((akbo) aaztVar.l.b()).j(ahlp.l(((wpp) aaztVar.o.b()).B(aaztVar.e, A2)), ahlp.m(A2), aaztVar.x);
                        }
                        ((akbo) aaztVar.l.b()).c(ahlp.l(aktp.ah(new aauq(aaztVar, ajcbVar, h, 2, (byte[]) null), (Executor) aaztVar.h.b())), aaztVar.y);
                    }
                    String g = aaztVar.g();
                    if (aczv.S()) {
                        ((aaxz) aaztVar.u.get()).g();
                    } else if (((Boolean) new msn(16).get()).booleanValue()) {
                        zrs zrsVar2 = (zrs) aaztVar.i.b();
                        qiu.h(aktp.ah(new aauq(zrsVar2, aaztVar.e, aaztVar.d(), 3), zrsVar2.b));
                    } else {
                        zrs zrsVar3 = (zrs) aaztVar.i.b();
                        qjb.a(new aauq(zrsVar3, aaztVar.e, g, 4, (byte[]) null), zrsVar3.b);
                    }
                    aaztVar.k(amlw.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_ACCEPTED);
                    if (aaztVar.r() == 4) {
                        String str3 = aaztVar.e;
                        ((alvg) ((alvg) aazt.a.g()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer", "incrementRetryCounterForSimId", 963, "PhoneNumberInputBottomSheetFragmentPeer.java")).t("Incrementing daily retry counter for simId: %s", advq.SIM_ID.c(str3));
                        ((akbo) aaztVar.l.b()).j(ahlp.l(((wih) aaztVar.p.b()).f(new adiw(str3))), new ahlp(str3), aaztVar.z);
                    }
                    aaztVar.i(-1);
                    ahjj ahjjVar = aaztVar.A;
                    if (ahjjVar != null) {
                        aazr aazrVar = aaztVar.d;
                        Object obj = ahjjVar.a;
                        cj F = aazrVar.F();
                        ((abaa) obj).e();
                        lga.E(F, F.getString(R.string.phone_number_ui_accepted_snackbar_text_v2));
                    }
                }
            });
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

    @Override // defpackage.ajel, defpackage.bw
    public final void d() {
        aksa k = akqj.k();
        try {
            super.d();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aazp, defpackage.bw, defpackage.cg
    public final void f(Context context) {
        aazr aazrVar = this;
        aazrVar.ak.k();
        try {
            if (!aazrVar.al) {
                super.f(context);
                if (aazrVar.ah == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof aazr) {
                            aazr aazrVar2 = (aazr) cgVar;
                            Bundle a = ((kqm) aS).a();
                            aozs aozsVar = (aozs) ((kqm) aS).a.a.dt.b();
                            d.t(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            aazz aazzVar = (aazz) aowt.f(a, "TIKTOK_FRAGMENT_ARGUMENT", aazz.a, aozsVar);
                            aazzVar.getClass();
                            krv krvVar = ((kqm) aS).a;
                            apya apyaVar = krvVar.bO;
                            apya apyaVar2 = krvVar.av;
                            apya apyaVar3 = krvVar.aF;
                            apya apyaVar4 = krvVar.z;
                            krx krxVar = krvVar.a;
                            try {
                                aazrVar = this;
                                aazrVar.ah = new aazt(aazrVar2, aazzVar, apyaVar, apyaVar2, apyaVar3, apyaVar4, krxVar.gL, ((kqm) aS).aK, krxVar.cX, krvVar.vk, krvVar.sR, krvVar.bV, ((kqm) aS).o, ((kqm) aS).Y, krvVar.yH, krxVar.eh, ((kqm) aS).aL, ((kqm) aS).r, krvVar.dd, krxVar.gM, krvVar.hr, ((kqm) aS).d, ((kqm) aS).aM, ((kqm) aS).ag);
                                aazrVar.Z.c(new akli(aazrVar.ak, aazrVar.aj));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    akqj.p();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, aazt.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                }
                eoz eozVar = aazrVar.E;
                if (eozVar instanceof akrw) {
                    akqf akqfVar = aazrVar.ak;
                    if (akqfVar.a == null) {
                        akqfVar.e(((akrw) eozVar).aW(), true);
                    }
                }
                akqj.p();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void g(Bundle bundle) {
        this.ak.k();
        try {
            super.g(bundle);
            aazt E = E();
            ((akbo) E.l.b()).b(E.y);
            E.w = new wfz(aazt.b);
            ((akbo) E.l.b()).b(E.w);
            E.x = new wgj(aazt.b);
            ((akbo) E.l.b()).b(E.x);
            ((akbo) E.l.b()).b(E.z);
            aohs aohsVar = (aohs) E.n.b();
            wgd wgdVar = (wgd) E.m.b();
            aohsVar.C(new akfu(wgdVar.n, new akfk(wgdVar.p, new izd(wgdVar, E.e, 9), whj.b, 2)), new aazx(E));
            akgu akguVar = (akgu) E.q.b();
            wfw wfwVar = (wfw) E.r.b();
            String str = E.e;
            str.getClass();
            akguVar.a(R.id.phone_number_input_ui_sim_info_id, new whv(wfwVar, str, 1), new isj(E, 13));
            E.v = E.d.M(new aazw(E), new ct(E, 3));
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

    @Override // defpackage.ajel, defpackage.fr, defpackage.bw
    public final Dialog gM(Bundle bundle) {
        super.gM(bundle);
        aazt E = E();
        ajek ajekVar = new ajek(E.d.x(), R.style.ThemeOverlay_Bugle_InputBottomSheetDialog);
        ajekVar.b.b(ajekVar, new aazv(E));
        ajekVar.setOnShowListener(new uab(E, 8, null));
        return ajekVar;
    }

    @Override // defpackage.aazp, defpackage.bw, defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        this.ak.k();
        try {
            LayoutInflater gl = super.gl(bundle);
            LayoutInflater cloneInContext = gl.cloneInContext(new aklm(this, gl));
            akqj.p();
            return cloneInContext;
        } catch (Throwable th) {
            try {
                akqj.p();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void h() {
        aksa b = this.ak.b();
        try {
            super.h();
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

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void i() {
        aksa a = this.ak.a();
        try {
            super.i();
            this.al = true;
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

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void j(Bundle bundle) {
        this.ak.k();
        try {
            super.j(bundle);
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

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void k() {
        this.ak.k();
        try {
            super.k();
            aktp.O(this);
            if (this.c) {
                aktp.N(this);
            }
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

    @Override // defpackage.aiuh, defpackage.bw, defpackage.cg
    public final void l() {
        this.ak.k();
        try {
            super.l();
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

    @Override // defpackage.bw, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.ak.g().close();
    }

    @Override // defpackage.bw, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        aksa i = this.ak.i();
        try {
            super.onDismiss(dialogInterface);
            i.close();
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aazp, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
