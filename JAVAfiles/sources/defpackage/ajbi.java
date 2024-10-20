package defpackage;

import android.content.Intent;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbi extends rg {
    final /* synthetic */ SurveyActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbi(SurveyActivity surveyActivity) {
        super(true);
        this.a = surveyActivity;
    }

    @Override // defpackage.rg
    public final void b() {
        ajbl ajblVar = this.a.n;
        ajblVar.o(6);
        if (ajblVar.j) {
            ajblVar.u.setResult(-1, new Intent().putExtra("EXTRA_BACK_BUTTON_PRESSED", true));
        }
        ajblVar.u.finish();
    }
}
