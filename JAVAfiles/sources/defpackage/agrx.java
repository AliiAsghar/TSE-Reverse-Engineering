package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrx implements ViewTreeObserver.OnGlobalLayoutListener {
    private View a;
    private SurveyPromptActivity b;

    public final void a() {
        View view = this.a;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        this.a = null;
        this.b = null;
    }

    public final void b(SurveyPromptActivity surveyPromptActivity, View view) {
        this.b = surveyPromptActivity;
        this.a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        SurveyPromptActivity surveyPromptActivity = this.b;
        Point l = agkx.l(surveyPromptActivity);
        l.x = Math.min(l.x, akro.c(surveyPromptActivity.x) - Math.round(surveyPromptActivity.o.left + surveyPromptActivity.o.right));
        Point point = new Point(View.MeasureSpec.makeMeasureSpec(l.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(l.y, Integer.MIN_VALUE));
        this.a.measure(point.x, point.y);
        SurveyPromptActivity surveyPromptActivity2 = this.b;
        int measuredWidth = this.a.getMeasuredWidth();
        int measuredHeight = this.a.getMeasuredHeight();
        surveyPromptActivity2.p++;
        surveyPromptActivity2.n.x = Math.max(surveyPromptActivity2.n.x, measuredWidth);
        surveyPromptActivity2.n.y = Math.max(surveyPromptActivity2.n.y, measuredHeight);
        if (surveyPromptActivity2.p == surveyPromptActivity2.v.j()) {
            surveyPromptActivity2.p = 0;
            FrameLayout frameLayout = (FrameLayout) surveyPromptActivity2.findViewById(R.id.hats_lib_survey_controls_container);
            if (frameLayout != null) {
                surveyPromptActivity2.n.y += frameLayout.getMeasuredHeight();
            }
            surveyPromptActivity2.q.v();
            if (surveyPromptActivity2.r.a.getString("t") == null) {
                surveyPromptActivity2.C("sv");
            }
            surveyPromptActivity2.E();
            Window window = surveyPromptActivity2.getWindow();
            window.addFlags(2);
            window.clearFlags(32);
            window.addFlags(262144);
            window.setDimAmount(0.4f);
            if (((Context) surveyPromptActivity2.x.d).getResources().getBoolean(R.bool.hats_lib_survey_should_display_close_button)) {
                surveyPromptActivity2.findViewById(R.id.hats_lib_close_button).setVisibility(0);
            }
            surveyPromptActivity2.B();
        }
        a();
    }
}
