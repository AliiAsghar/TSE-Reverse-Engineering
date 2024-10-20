package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajas extends aizv {
    public aizb ag;
    private TextView ah;
    public String d;
    public int e;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer num;
        aprq aprqVar;
        String str;
        View inflate = layoutInflater.inflate(R.layout.survey_question_rating_fragment, viewGroup, false);
        Bundle bundle2 = this.m;
        CharSequence charSequence = null;
        if (bundle2.containsKey("DisplayLogoResId")) {
            num = Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0));
        } else {
            num = null;
        }
        aizj.c((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), num);
        if (bundle != null) {
            charSequence = bundle.getCharSequence("QuestionTextFromHtml");
        }
        if (charSequence == null) {
            if (this.a.g.isEmpty()) {
                str = this.a.f;
            } else {
                str = this.a.g;
            }
            charSequence = Html.fromHtml(str, 0);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.survey_question_text);
        this.ah = textView;
        textView.setText(charSequence);
        this.ah.setContentDescription(charSequence.toString());
        ajax ajaxVar = new ajax(x());
        apro aproVar = this.a;
        if (aproVar.c == 6) {
            aprqVar = (aprq) aproVar.d;
        } else {
            aprqVar = aprq.a;
        }
        ajaxVar.d(aprqVar);
        ajaxVar.a = new ajaw() { // from class: ajar
            @Override // defpackage.ajaw
            public final void a(int i) {
                ajas ajasVar = ajas.this;
                ajasVar.d = Integer.toString(i);
                ajasVar.e = i;
                ajasVar.ag.a();
                int T = a.T(ajasVar.a.i);
                if (T == 0) {
                    T = 1;
                }
                ajbm d = ajasVar.d();
                if (d == null) {
                    Log.w("SurveyRatingFragment", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                } else if (T == 5) {
                    d.p();
                } else {
                    d.q(ajasVar.r(), ajasVar);
                }
            }
        };
        ((ViewGroup) inflate.findViewById(R.id.survey_rating_container)).addView(ajaxVar);
        return inflate;
    }

    @Override // defpackage.aizv
    public final apqz e() {
        aozy createBuilder = apqz.a.createBuilder();
        if (this.ag.c() && this.d != null) {
            aozy createBuilder2 = apqx.a.createBuilder();
            int i = this.e;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            ((apqx) apagVar).c = i;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            ((apqx) createBuilder2.b).b = a.ak(3);
            String str = this.d;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apqx apqxVar = (apqx) createBuilder2.b;
            str.getClass();
            apqxVar.d = str;
            apqx apqxVar2 = (apqx) createBuilder2.s();
            aozy createBuilder3 = apqw.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apqw apqwVar = (apqw) createBuilder3.b;
            apqxVar2.getClass();
            apqwVar.c = apqxVar2;
            apqwVar.b |= 1;
            apqw apqwVar2 = (apqw) createBuilder3.s();
            int i2 = this.a.e;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            ((apqz) apagVar2).d = i2;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apqz apqzVar = (apqz) createBuilder.b;
            apqwVar2.getClass();
            apqzVar.c = apqwVar2;
            apqzVar.b = 4;
            long j = aizr.a;
        }
        return (apqz) createBuilder.s();
    }

    @Override // defpackage.aizv, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.ag = (aizb) bundle.getParcelable("QuestionMetrics");
        }
        if (this.ag == null) {
            this.ag = new aizb();
        }
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.ag);
        TextView textView = this.ah;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // defpackage.aizv
    public final void p() {
        TextView textView;
        this.ag.b();
        if (d() != null) {
            d().aO();
        }
        d().q(r(), this);
        if (aizr.i(x()) && (textView = this.ah) != null) {
            textView.requestFocus();
            this.ah.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.aizv
    public final void q(String str) {
        Spanned fromHtml;
        ahnz ahnzVar = aizp.c;
        if (aizp.b(aqql.c(aizp.b)) && (x() == null || this.ah == null)) {
            return;
        }
        fromHtml = Html.fromHtml(str, 0);
        this.ah.setText(fromHtml);
        this.ah.setContentDescription(fromHtml.toString());
    }

    public final boolean r() {
        if (this.d != null) {
            return true;
        }
        return false;
    }
}
