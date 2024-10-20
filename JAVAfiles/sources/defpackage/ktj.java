package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import defpackage.apxm;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktj extends ktv implements akkh, apxq, akkf, aklk, akrw {
    private ktk a;
    private boolean ag;
    private Context d;
    private final eno e = new eno(this);

    @Deprecated
    public ktj() {
        aiut.c();
    }

    @Override // defpackage.akkh
    public final Class C() {
        return ktk.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.aklf, defpackage.aiuc, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            aM(layoutInflater, viewGroup, bundle);
            ktk E = E();
            View inflate = layoutInflater.inflate(R.layout.advanced_feedback_data_detail_fragment, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.advanced_feedback_data_detail_description);
            TextView textView2 = (TextView) inflate.findViewById(R.id.advanced_feedback_data_detail_rationale);
            TextView textView3 = (TextView) inflate.findViewById(R.id.advanced_feedback_data_detail_rationale_title);
            Bundle bundle2 = ((cg) E.a).m;
            if (bundle2 != null) {
                textView.setText(albo.ag(bundle2.getString("advanced_feedback_data_description")));
                textView2.setText(albo.ag(bundle2.getString("advanced_feedback_data_rationale")));
                textView3.setText(albo.ag(bundle2.getString("advanced_feedback_data_rationale_title")));
                E.c = albo.ag(bundle2.getString("advanced_feedback_data_name"));
            }
            en j = ((AdvancedFeedbackActivity) ((cg) E.a).fe()).j();
            if (j != null) {
                j.setDisplayHomeAsUpEnabled(false);
                j.setCustomView(R.layout.advanced_feedback_data_detail_toolbar);
                ImageButton imageButton = (ImageButton) j.getCustomView().findViewById(R.id.advanced_feedback_close_button);
                if (!TextUtils.isEmpty(E.c)) {
                    ((TextView) j.getCustomView().findViewById(R.id.advanced_feedback_title)).setText((CharSequence) E.c);
                }
                ((aohs) E.b).s(imageButton, new ktp());
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

    @Override // defpackage.ktv, defpackage.aiuc, defpackage.cg
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

    @Override // defpackage.akkh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ktk E() {
        ktk ktkVar = this.a;
        if (ktkVar != null) {
            if (!this.ag) {
                return ktkVar;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
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

    @Override // defpackage.ktv
    protected final /* synthetic */ apxh d() {
        return new aklt(this);
    }

    @Override // defpackage.ktv, defpackage.aklf, defpackage.cg
    public final void f(Context context) {
        this.c.k();
        try {
            if (!this.ag) {
                super.f(context);
                if (this.a == null) {
                    try {
                        Object aS = aS();
                        cg cgVar = (cg) ((apxx) ((kqm) aS).b).a;
                        if (cgVar instanceof ktj) {
                            this.a = new ktk((ktj) cgVar, (aohs) ((kqm) aS).bh.aG.b());
                            this.Z.c(new akli(this.c, this.e));
                        } else {
                            throw new IllegalStateException(hht.e(cgVar, ktk.class));
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

    @Override // defpackage.ktv, defpackage.cg
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        return aU();
    }
}
