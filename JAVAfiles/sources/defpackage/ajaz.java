package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajaz extends aizv {
    public View ag;
    public View ah;
    public View ai;
    public ScrollViewWithSizeCallback aj;
    private TextView d;
    private final ajay e = new ajay(this, 0);
    private boolean ak = false;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CharSequence charSequence;
        View inflate = layoutInflater.inflate(R.layout.survey_question_with_scrollable_content, viewGroup, false);
        this.ag = inflate.findViewById(R.id.survey_question_header_logo_text);
        this.d = (TextView) inflate.findViewById(R.id.survey_question_text);
        if (bundle != null) {
            charSequence = bundle.getCharSequence("QuestionTextFromHtml");
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = Html.fromHtml(aM(), 0);
        }
        this.d.setText(charSequence);
        this.d.setContentDescription(charSequence.toString());
        this.ai = r();
        ScrollViewWithSizeCallback scrollViewWithSizeCallback = (ScrollViewWithSizeCallback) inflate.findViewById(R.id.survey_question_scroll_view);
        this.aj = scrollViewWithSizeCallback;
        scrollViewWithSizeCallback.addView(this.ai);
        ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = this.aj;
        ajay ajayVar = this.e;
        scrollViewWithSizeCallback2.a = ajayVar;
        if (!this.ak && scrollViewWithSizeCallback2 != null) {
            scrollViewWithSizeCallback2.getViewTreeObserver().addOnScrollChangedListener(ajayVar);
            this.ak = true;
        }
        aizj.c((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), this.c);
        ajbm d = d();
        if (d != null) {
            this.ah = d.d().findViewById(R.id.survey_controls_container);
        }
        eek.o(inflate, null);
        return inflate;
    }

    public abstract String aM();

    public final boolean aO() {
        if (x() != null && this.d != null && this.ag != null && this.ah != null && this.ai != null && this.aj != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cg
    public final void h() {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.ak && (scrollViewWithSizeCallback = this.aj) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.e);
            this.ak = false;
        }
        super.h();
    }

    @Override // defpackage.cg
    public void j(Bundle bundle) {
        TextView textView = this.d;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // defpackage.aizv
    public void p() {
        View view;
        ahnz ahnzVar = aizp.c;
        if ((!aizp.b(aqql.c(aizp.b)) || aO()) && aizr.i(x()) && (view = this.ag) != null) {
            view.requestFocus();
            this.ag.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.aizv
    public final void q(String str) {
        Spanned fromHtml;
        ahnz ahnzVar = aizp.c;
        if (aizp.b(aqql.c(aizp.b)) && !aO()) {
            return;
        }
        fromHtml = Html.fromHtml(str, 0);
        this.d.setText(fromHtml);
        this.d.setContentDescription(fromHtml.toString());
    }

    public abstract View r();
}
