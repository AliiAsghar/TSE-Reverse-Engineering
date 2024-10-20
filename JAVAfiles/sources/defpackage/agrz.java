package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrz extends agse {
    public ViewGroup ag;
    private final agrx al = new agrx();
    private agrp am;
    public boolean[] d;
    public boolean e;

    private final void aO(String str, boolean z, int i, String str2) {
        LayoutInflater.from(x()).inflate(R.layout.hats_survey_question_multiple_select_item, this.ag, true);
        FrameLayout frameLayout = (FrameLayout) this.ag.getChildAt(i);
        CheckBox checkBox = (CheckBox) frameLayout.findViewById(R.id.hats_lib_multiple_select_checkbox);
        checkBox.setText(str);
        checkBox.setContentDescription(str);
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(new ajaa(this, i, 1));
        frameLayout.setOnClickListener(new agrb(checkBox, 6));
        if (str2 != null) {
            checkBox.setTag(str2);
        }
    }

    @Override // defpackage.agse, defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View K = super.K(layoutInflater, viewGroup, bundle);
        K.setContentDescription(this.a.c);
        if (!this.J) {
            this.al.b((SurveyPromptActivity) fe(), K);
        }
        return K;
    }

    @Override // defpackage.cg
    public final void W(Bundle bundle) {
        super.W(bundle);
        ((SurveyPromptActivity) fe()).A(aN(), this);
    }

    @Override // defpackage.agse
    public final String aM() {
        return this.a.c;
    }

    public final boolean aN() {
        if (this.e) {
            return true;
        }
        for (boolean z : this.d) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agrw
    public final aoco d() {
        aozy createBuilder = aoco.a.createBuilder();
        if (this.am.e()) {
            if (this.e) {
                aozy createBuilder2 = aocm.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((aocm) createBuilder2.b).d = a.ak(4);
                createBuilder.aW((aocm) createBuilder2.s());
                this.am.b();
            } else {
                apax apaxVar = this.a.e;
                int i = 0;
                while (true) {
                    boolean[] zArr = this.d;
                    if (i >= zArr.length) {
                        break;
                    }
                    if (zArr[i]) {
                        aozy createBuilder3 = aocm.a.createBuilder();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        apag apagVar = createBuilder3.b;
                        ((aocm) apagVar).b = i;
                        if (!apagVar.isMutable()) {
                            createBuilder3.u();
                        }
                        ((aocm) createBuilder3.b).d = a.ak(3);
                        String str = ((aock) apaxVar.get(i)).b;
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        aocm aocmVar = (aocm) createBuilder3.b;
                        str.getClass();
                        aocmVar.e = str;
                        createBuilder.aW((aocm) createBuilder3.s());
                        this.am.b();
                    }
                    i++;
                }
                if (((aoco) createBuilder.b).g.size() > 0) {
                    int nextInt = ((agrl) agrn.c()).b.nextInt(((aoco) createBuilder.b).g.size());
                    aozy builder = ((aocm) ((aoco) createBuilder.b).g.get(nextInt)).toBuilder();
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    ((aocm) builder.b).g = true;
                    aocm aocmVar2 = (aocm) builder.s();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aoco aocoVar = (aoco) createBuilder.b;
                    aocoVar.a();
                    aocoVar.g.remove(nextInt);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aoco aocoVar2 = (aoco) createBuilder.b;
                    aocmVar2.getClass();
                    aocoVar2.a();
                    aocoVar2.g.add(nextInt, aocmVar2);
                }
            }
            if (this.am.d()) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((aoco) createBuilder.b).e = a.am(3);
            }
            int i2 = this.c;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            ((aoco) apagVar2).b = i2;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            ((aoco) createBuilder.b).c = a.am(4);
            int a = (int) this.am.a();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((aoco) createBuilder.b).d = a;
        }
        return (aoco) createBuilder.s();
    }

    @Override // defpackage.agrw, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle != null) {
            this.e = bundle.getBoolean("NoneOfTheAboveAsBoolean", false);
            this.am = (agrp) bundle.getParcelable("QuestionMetrics");
            this.d = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.am == null) {
            this.am = new agrp();
        }
        boolean[] zArr = this.d;
        if (zArr == null) {
            this.d = new boolean[this.a.e.size()];
            return;
        }
        if (zArr.length != this.a.e.size()) {
            Log.e("HatsLibMultiSelectFrag", "Saved instance state responses had incorrect length: " + this.d.length);
            this.d = new boolean[this.a.e.size()];
        }
    }

    @Override // defpackage.cg
    public final void i() {
        this.al.a();
        super.i();
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        bundle.putBoolean("NoneOfTheAboveAsBoolean", this.e);
        bundle.putParcelable("QuestionMetrics", this.am);
        bundle.putBooleanArray("ResponsesAsArray", this.d);
    }

    @Override // defpackage.agrw
    public final void o() {
        boolean z = ((agrl) agrn.c()).c;
        if (this.ag != null) {
            int i = 0;
            while (i < this.ag.getChildCount()) {
                View childAt = this.ag.getChildAt(i);
                childAt.setAlpha(brg.a);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.agrw
    public final void p() {
        this.am.c();
        ((SurveyPromptActivity) fe()).A(aN(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agse
    public final View r() {
        this.ag = (LinearLayout) LayoutInflater.from(x()).inflate(R.layout.hats_survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.hats_lib_survey_answers_container);
        apax apaxVar = this.a.e;
        for (int i = 0; i < apaxVar.size(); i++) {
            aO(((aock) apaxVar.get(i)).b, this.d[i], i, null);
        }
        aO(z().getString(R.string.hats_lib_none_of_the_above), this.e, apaxVar.size(), "NoneOfTheAbove");
        return this.ag;
    }
}
