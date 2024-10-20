package defpackage;

import android.view.View;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbq extends gnm {
    final /* synthetic */ SurveyViewPager a;

    public ajbq(SurveyViewPager surveyViewPager) {
        this.a = surveyViewPager;
    }

    @Override // defpackage.gnm, defpackage.gnj
    public final void b(int i) {
        this.a.invalidate();
        aizv u = this.a.u();
        if (u != null) {
            u.p();
            u.o();
            View view = u.Q;
            if (view != null) {
                view.sendAccessibilityEvent(32);
            }
        }
        this.a.requestLayout();
    }
}
