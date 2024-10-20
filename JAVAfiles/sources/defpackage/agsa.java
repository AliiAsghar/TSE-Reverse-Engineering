package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agsa extends agse {
    private agrp ag;
    public EditText d;
    private final agrx e = new agrx();

    @Override // defpackage.agse, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View K = super.K(layoutInflater, viewGroup, bundle);
        K.setContentDescription(this.a.c);
        if (!this.J) {
            this.e.b((SurveyPromptActivity) fe(), K);
        }
        return K;
    }

    @Override // defpackage.cg
    public final void W(Bundle bundle) {
        super.W(bundle);
        ((SurveyPromptActivity) fe()).A(true, this);
    }

    @Override // defpackage.agse
    public final String aM() {
        return this.a.c;
    }

    @Override // defpackage.agrw
    public final aoco d() {
        aozy createBuilder = aoco.a.createBuilder();
        if (this.ag.e()) {
            this.ag.b();
            int a = (int) this.ag.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((aoco) apagVar).d = a;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ((aoco) createBuilder.b).c = a.am(5);
            int i = this.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aoco) createBuilder.b).b = i;
            String obj = this.d.getText().toString();
            if (obj.trim().isEmpty()) {
                aozy createBuilder2 = aocm.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((aocm) createBuilder2.b).f = "skipped";
                createBuilder.aW((aocm) createBuilder2.s());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aoco) createBuilder.b).e = a.am(4);
            } else {
                aozy createBuilder3 = aocm.a.createBuilder();
                String trim = obj.trim();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                aocm aocmVar = (aocm) createBuilder3.b;
                trim.getClass();
                aocmVar.f = trim;
                createBuilder.aW((aocm) createBuilder3.s());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aoco) createBuilder.b).e = a.am(3);
            }
        }
        return (aoco) createBuilder.s();
    }

    @Override // defpackage.agrw, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle == null) {
            this.ag = new agrp();
        } else {
            this.ag = (agrp) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.cg
    public final void i() {
        this.e.a();
        super.i();
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        bundle.putParcelable("QuestionMetrics", this.ag);
    }

    @Override // defpackage.agrw
    public final void p() {
        this.ag.c();
        ((SurveyPromptActivity) fe()).A(true, this);
    }

    @Override // defpackage.agse
    public final View r() {
        LayoutInflater from = LayoutInflater.from(x());
        View inflate = from.inflate(R.layout.hats_survey_scrollable_answer_content_container, (ViewGroup) null);
        inflate.setMinimumHeight(z().getDimensionPixelSize(R.dimen.hats_lib_open_text_question_min_height));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.hats_lib_survey_answers_container);
        from.inflate(R.layout.hats_survey_question_open_text_item, (ViewGroup) linearLayout, true);
        EditText editText = (EditText) linearLayout.findViewById(R.id.hats_lib_survey_open_text);
        this.d = editText;
        editText.setSingleLine(false);
        this.d.setHint(z().getString(R.string.hats_lib_open_text_hint));
        return linearLayout;
    }
}
