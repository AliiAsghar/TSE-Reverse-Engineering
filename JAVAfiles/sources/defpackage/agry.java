package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.SurveyPromptActivity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agry extends agse {
    private static final alor al;
    public agrp ag;
    private LinearLayout am;
    public String d;
    private final agrx an = new agrx();
    public int e = -1;

    static {
        tm tmVar = new tm();
        tmVar.put(0, Integer.valueOf(R.drawable.ic_sentiment_very_satisfied_grey600_36dp));
        tmVar.put(1, Integer.valueOf(R.drawable.ic_sentiment_satisfied_grey600_36dp));
        tmVar.put(2, Integer.valueOf(R.drawable.ic_sentiment_neutral_grey600_36dp));
        tmVar.put(3, Integer.valueOf(R.drawable.ic_sentiment_dissatisfied_grey600_36dp));
        tmVar.put(4, Integer.valueOf(R.drawable.ic_sentiment_very_dissatisfied_grey600_36dp));
        al = alor.j(tmVar);
    }

    @Override // defpackage.agse, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View K = super.K(layoutInflater, viewGroup, bundle);
        K.setContentDescription(this.a.c);
        if (!this.J) {
            this.an.b((SurveyPromptActivity) fe(), K);
        }
        return K;
    }

    @Override // defpackage.agse
    public final String aM() {
        return this.a.c;
    }

    @Override // defpackage.agrw
    public final aoco d() {
        aozy createBuilder = aoco.a.createBuilder();
        if (this.ag.d()) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aoco) createBuilder.b).e = a.am(3);
        }
        if (this.ag.e()) {
            if (this.d != null) {
                aozy createBuilder2 = aocm.a.createBuilder();
                int i = this.e;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                ((aocm) apagVar).b = i;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                ((aocm) createBuilder2.b).d = a.ak(3);
                String str = this.d;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                str.getClass();
                ((aocm) apagVar2).e = str;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                ((aocm) createBuilder2.b).g = true;
                createBuilder.aW((aocm) createBuilder2.s());
            }
            int i2 = this.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            ((aoco) apagVar3).b = i2;
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            ((aoco) createBuilder.b).c = a.am(3);
            int a = (int) this.ag.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar4 = createBuilder.b;
            ((aoco) apagVar4).d = a;
            apao apaoVar = this.a.h;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            aoco aocoVar = (aoco) createBuilder.b;
            apao apaoVar2 = aocoVar.f;
            if (!apaoVar2.c()) {
                aocoVar.f = apag.mutableCopy(apaoVar2);
            }
            aoyj.addAll(apaoVar, aocoVar.f);
        }
        return (aoco) createBuilder.s();
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
        this.an.a();
        super.i();
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.ag);
    }

    @Override // defpackage.agrw
    public final void o() {
        boolean z = ((agrl) agrn.c()).c;
        if (this.am != null) {
            int i = 0;
            while (i < this.am.getChildCount()) {
                View childAt = this.am.getChildAt(i);
                childAt.setAlpha(brg.a);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.agrw
    public final void p() {
        this.ag.c();
        ((SurveyPromptActivity) fe()).A(false, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agse
    public final View r() {
        List list;
        boolean z;
        LayoutInflater from = LayoutInflater.from(x());
        Resources.Theme theme = null;
        View inflate = from.inflate(R.layout.hats_survey_scrollable_answer_content_container, (ViewGroup) null);
        this.am = (LinearLayout) inflate.findViewById(R.id.hats_lib_survey_answers_container);
        View[] viewArr = new View[this.a.e.size()];
        apao apaoVar = this.a.h;
        if (!apaoVar.isEmpty() && apaoVar.size() == this.a.e.size()) {
            list = new ArrayList();
            apax apaxVar = this.a.e;
            for (int i = 0; i < apaxVar.size(); i++) {
                list.add(i, (aock) apaxVar.get(apaoVar.indexOf(Integer.valueOf(i))));
            }
        } else {
            list = this.a.e;
        }
        List list2 = list;
        if (this.a.g && list2.size() == 5) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < list2.size()) {
            if (z) {
                from.inflate(R.layout.hats_survey_question_multiple_choice_with_smileys_item, (ViewGroup) this.am, true);
                View childAt = this.am.getChildAt(r0.getChildCount() - 1);
                viewArr[i2] = childAt;
                TextView textView = (TextView) childAt.findViewById(R.id.hats_lib_survey_multiple_choice_text);
                textView.setText(((aock) list2.get(i2)).b);
                textView.setContentDescription(((aock) list2.get(i2)).b);
                ((ImageView) viewArr[i2].findViewById(R.id.hats_lib_survey_multiple_choice_icon)).setImageDrawable(gmz.b(z(), ((Integer) al.get(Integer.valueOf(i2))).intValue(), theme));
            } else {
                from.inflate(R.layout.hats_survey_question_multiple_choice_item, (ViewGroup) this.am, true);
                View childAt2 = this.am.getChildAt(r0.getChildCount() - 1);
                viewArr[i2] = childAt2;
                ((Button) childAt2).setText(((aock) list2.get(i2)).b);
                ((Button) viewArr[i2]).setContentDescription(((aock) list2.get(i2)).b);
            }
            viewArr[i2].setOnClickListener(new ajbd(this, viewArr, list2, i2, 1));
            i2++;
            theme = null;
        }
        return inflate;
    }
}
