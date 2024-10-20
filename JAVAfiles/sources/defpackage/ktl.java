package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.apxm;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.File;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktl extends ktx implements akkh, apxq, akkf, aklk, akrw {
    private kto a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public ktl() {
        aiut.c();
    }

    public static ktl a() {
        ktl ktlVar = new ktl();
        apxh.e(ktlVar);
        return ktlVar;
    }

    @Override // defpackage.akkh
    public final Class C() {
        return kto.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25, types: [armf, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        ktd ktdVar;
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            kto E = E();
            View inflate = layoutInflater.inflate(R.layout.advanced_feedback_fragment, viewGroup, false);
            cj fe = E.b.fe();
            fe.getClass();
            Bundle extras = fe.getIntent().getExtras();
            E.t = (AdvancedFeedbackActivity) fe;
            if (extras != null) {
                E.n = amek.b(extras.getInt("advanced_feedback_config_data"));
            }
            if (E.n == amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC && ((Boolean) ktf.d.e()).booleanValue()) {
                ((via) E.l.b()).i();
                ((kor) E.q.b()).f(((luj) E.m.b()).e(fe.getIntent(), "report_issue_event_type", 3));
            }
            Bundle bundle2 = E.b.m;
            byte[] bArr = null;
            if (bundle2 != null) {
                str = bundle2.getString("screenshot_file_key");
            } else {
                str = null;
            }
            int i = 2;
            if (str != null) {
                aohs aohsVar = E.y;
                kor korVar = E.w;
                File file = new File(str);
                aohsVar.C(new akfk((ansy) korVar.a, new izd(korVar, file, i), file.getPath(), 2), E.u);
            }
            E.e = (TextInputLayout) inflate.findViewById(R.id.advanced_feedback_fragment_issue_list_layout);
            E.d = (AutoCompleteTextView) inflate.findViewById(R.id.advanced_feedback_fragment_issue_list_view);
            E.f = (LinearLayout) inflate.findViewById(R.id.advanced_feedback_fragment_checkbox_list);
            Stream map = Collection.EL.stream(E.x.c()).map(new koa(11));
            int i2 = alog.d;
            E.d.setAdapter(new ArrayAdapter(E.a, R.layout.advanced_feedback_issue_view, (alog) map.collect(alls.a)));
            E.d.setOnItemClickListener(new ov(E, i, bArr));
            kkg kkgVar = E.v;
            alob alobVar = new alob();
            alobVar.h(kkgVar.d);
            alobVar.h(kkgVar.b);
            if (((Boolean) ktf.b.e()).booleanValue()) {
                alobVar.h((ksq) kkgVar.e.b());
            }
            if (((Boolean) xzk.a.e()).booleanValue()) {
                alobVar.h(kkgVar.a);
            }
            if (((Boolean) ktf.c.e()).booleanValue()) {
                alobVar.h(kkgVar.c);
            }
            alog g = alobVar.g();
            int i3 = ((alsx) g).c;
            for (int i4 = 0; i4 < i3; i4++) {
                ksq ksqVar = (ksq) g.get(i4);
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) layoutInflater.inflate(R.layout.advanced_feedback_data_view, (ViewGroup) E.f, false);
                advancedFeedbackDataView.j = ksqVar;
                String h = ksqVar.h();
                if (h != null) {
                    advancedFeedbackDataView.h.setText(h);
                }
                E.g.add(advancedFeedbackDataView);
                E.f.addView(advancedFeedbackDataView);
            }
            View findViewById = inflate.findViewById(R.id.advanced_feedback_share_with_partner_title);
            View findViewById2 = inflate.findViewById(R.id.advanced_feedback_share_with_external_card);
            int i5 = 7;
            if (yyb.aD()) {
                findViewById2.setVisibility(8);
                findViewById.setVisibility(8);
                E.o.a = amej.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_NOT_REQUIRED;
            } else {
                CheckBox checkBox = (CheckBox) findViewById2.findViewById(R.id.advanced_feedback_share_with_external_checkbox);
                E.o.a = amej.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_CONSENTED;
                checkBox.setChecked(true);
                findViewById2.setOnClickListener(new iix(E, checkBox, i5, bArr));
            }
            E.d();
            Intent a = E.a();
            if (a != null) {
                int intExtra = a.getIntExtra("report_issue_type_value_extra", 0);
                E.s = intExtra;
                if (intExtra != 0) {
                    amme b = amme.b(intExtra);
                    b.getClass();
                    int ordinal = b.ordinal();
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal != 7) {
                                    ktdVar = E.x.d;
                                } else {
                                    ktdVar = E.x.g;
                                }
                            } else {
                                ktdVar = E.x.m;
                            }
                        } else {
                            ktdVar = E.x.h;
                        }
                    } else {
                        ktdVar = E.x.f;
                    }
                    E.d.setText((CharSequence) ktdVar.c(), false);
                    E.c(ktdVar);
                }
            }
            String f = E.f();
            if (f != null) {
                ((alwl) ((alwl) E.h.g()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer", "onCreateView", 233, "AdvancedFeedbackFragmentPeer.java")).t("Messages automatically detected an error. User tapped notification, launching advanced feedback: %s", f);
            }
            ((kor) E.p.b()).d(2, Optional.of(E.n), Optional.empty(), Optional.empty(), Optional.empty());
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

    @Override // defpackage.ktx, defpackage.aiuc, defpackage.cg
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

    @Override // defpackage.akkh
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final kto E() {
        kto ktoVar = this.a;
        if (ktoVar != null) {
            if (!this.ag) {
                return ktoVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.ktx
    protected final /* synthetic */ apxh e() {
        return new aklt(this);
    }

    @Override // defpackage.ktx, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        Context context2 = (Context) ((kqm) aS).bh.c.b();
                        ksm ksmVar = (ksm) ((kqm) aS).a.a.fP.b();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof ktl) {
                            ktl ktlVar = (ktl) cgVar;
                            krx krxVar = ((kqm) aS).a.a;
                            try {
                                yzk yzkVar = new yzk(new izc(krxVar.a.n, (byte[]) null, (char[]) null, (byte[]) null), new izc(krxVar.a.n, (byte[]) null, (char[]) null), new izc(krxVar.a.n, (char[]) null, (byte[]) null), new izc(krxVar.a.n, (byte[]) null, (byte[]) null, (byte[]) null), new ghw(krxVar.a.n, null, null, null), new izc((armf) krxVar.a.n, (short[]) null), new ghw(krxVar.a.n, (char[]) null), new izc((armf) krxVar.a.n, (char[]) null), new ghw(krxVar.a.n, null, null, null, null), new ghw(krxVar.a.n, (byte[]) null, (byte[]) null), krxVar.m423if(), krxVar.m(), krxVar.gp, krxVar.n(), krxVar.l());
                                ksv m423if = ((kqm) aS).a.a.m423if();
                                kst m = ((kqm) aS).a.a.m();
                                krx krxVar2 = ((kqm) aS).a.a;
                                kkg kkgVar = new kkg(m423if, m, krxVar2.gp, krxVar2.n(), ((kqm) aS).a.a.l());
                                aohs aohsVar = (aohs) ((kqm) aS).bh.aG.b();
                                ksu ksuVar = new ksu();
                                aohs aohsVar2 = (aohs) ((kqm) aS).r.b();
                                kor korVar = new kor((kkc) ((kqm) aS).a.yZ.b(), (ansy) ((kqm) aS).a.ct.b());
                                yjf yjfVar = (yjf) ((kqm) aS).a.bU.b();
                                apya apyaVar = ((kqm) aS).bh.f;
                                ksr ksrVar = (ksr) ((kqm) aS).a.a.gp.b();
                                krv krvVar = ((kqm) aS).a;
                                this.a = new kto(context2, ksmVar, ktlVar, yzkVar, kkgVar, aohsVar, ksuVar, aohsVar2, korVar, yjfVar, apyaVar, ksrVar, krvVar.mt, krvVar.zb, ((kqm) aS).P, krvVar.zh);
                                this.Z.c(new akli(this.c, this.e));
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
                            throw new IllegalStateException(hht.e(cgVar, kto.class));
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
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

    @Override // defpackage.ktx, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
