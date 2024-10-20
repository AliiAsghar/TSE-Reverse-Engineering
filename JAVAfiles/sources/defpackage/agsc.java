package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.SurveyPromptActivity;
import com.google.android.libraries.hats20.view.RatingView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agsc extends agrw {
    public agrp ag;
    private final agrx ah = new agrx();
    private TextView ai;
    public String d;
    public int e;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.hats_survey_question_rating, viewGroup, false);
        inflate.setContentDescription(this.a.c);
        agkx.m((ImageView) inflate.findViewById(R.id.hats_lib_rating_banner_logo), this.m.getInt("DispalyLogoResId", 0));
        TextView textView = (TextView) inflate.findViewById(R.id.hats_lib_survey_question_text);
        this.ai = textView;
        textView.setText(agrv.a(this.a.c));
        this.ai.setContentDescription(this.a.c);
        RatingView ratingView = (RatingView) inflate.findViewById(R.id.hats_lib_rating_view);
        aocn aocnVar = this.a.f;
        if (aocnVar == null) {
            aocnVar = aocn.a;
        }
        ratingView.b(aocnVar, this.a.g);
        ratingView.a = new agsb(this);
        if (!this.J) {
            this.ah.b((SurveyPromptActivity) fe(), inflate);
        }
        return inflate;
    }

    @Override // defpackage.agrw
    public final aoco d() {
        aozy createBuilder = aoco.a.createBuilder();
        if (this.ag.e()) {
            int a = (int) this.ag.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((aoco) apagVar).d = a;
            if (this.d != null) {
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                ((aoco) createBuilder.b).e = a.am(3);
                aozy createBuilder2 = aocm.a.createBuilder();
                int i = this.e;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                ((aocm) apagVar2).b = i;
                float f = this.e;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar3 = createBuilder2.b;
                ((aocm) apagVar3).c = f;
                String str = this.d;
                if (!apagVar3.isMutable()) {
                    createBuilder2.u();
                }
                aocm aocmVar = (aocm) createBuilder2.b;
                str.getClass();
                aocmVar.e = str;
                createBuilder.aW((aocm) createBuilder2.s());
                Log.d("HatsLibRatingFragment", "Selected response: ".concat(String.valueOf(this.d)));
            }
        }
        return (aoco) createBuilder.s();
    }

    @Override // defpackage.agrw
    public final String e() {
        return this.ai.getText().toString();
    }

    @Override // defpackage.agrw, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.ag = (agrp) bundle.getParcelable("QuestionMetrics");
        }
        if (this.ag == null) {
            this.ag = new agrp();
        }
    }

    @Override // defpackage.cg
    public final void i() {
        this.ah.a();
        super.i();
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.ag);
    }

    @Override // defpackage.agrw
    public final void p() {
        this.ag.c();
        ((SurveyPromptActivity) fe()).A(r(), this);
    }

    @Override // defpackage.agrw
    public final void q(String str) {
        this.ai.setText(agrv.a(str));
        this.ai.setContentDescription(str);
    }

    public final boolean r() {
        if (this.d != null) {
            return true;
        }
        return false;
    }
}
