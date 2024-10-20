package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import defpackage.ahnz;
import defpackage.aiyz;
import defpackage.aizp;
import defpackage.ajbi;
import defpackage.ajbl;
import defpackage.ajbm;
import defpackage.ajbr;
import defpackage.aqpz;
import defpackage.aqql;
import defpackage.cg;
import defpackage.ex;
import defpackage.rg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SurveyActivity extends ex implements ajbm {
    public ajbl n;
    private final rg o = new ajbi(this);

    @Override // defpackage.ajbj
    public final boolean aM() {
        return false;
    }

    @Override // defpackage.ajbj
    public final boolean aN() {
        return this.n.m();
    }

    @Override // defpackage.ajad
    public final void aO() {
        this.n.j(false);
    }

    @Override // defpackage.ajbj
    public final void e() {
        this.n.e();
    }

    @Override // defpackage.ajbj
    public final void o() {
        ImageButton imageButton = (ImageButton) this.n.b(R.id.survey_close_button);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0406  */
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.SurveyActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ex, defpackage.cj, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ajbl ajblVar = this.n;
        if (aizp.b == null) {
            return;
        }
        if (aizp.d()) {
            aiyz c = ajblVar.c();
            if (ajblVar.u.isFinishing() && c != null) {
                ahnz.a.n(c);
            }
        } else if (ajblVar.u.isFinishing()) {
            ahnz.a.m();
        }
        ajblVar.p.removeCallbacks(ajblVar.q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ajbl ajblVar = this.n;
        if (intent.getBooleanExtra("IsDismissing", false)) {
            ajblVar.u.finish();
        }
        if (intent.hasExtra("IsPausing")) {
            ajblVar.g(intent.getBooleanExtra("IsPausing", false));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.re, defpackage.dx, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        ajbl ajblVar = this.n;
        ahnz ahnzVar = aizp.c;
        if (aizp.b(aqql.c(aizp.b))) {
            SurveyViewPager surveyViewPager = ajblVar.d;
            if (surveyViewPager != null) {
                i = surveyViewPager.c;
            } else {
                i = 0;
            }
            bundle.putInt("CurrentQuestionIndexForViewPager", i);
        } else {
            bundle.putInt("CurrentQuestionIndexForViewPager", ajblVar.a());
        }
        bundle.putBoolean("IsSubmitting", ajblVar.j);
        bundle.putParcelable("Answer", ajblVar.e);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", ajblVar.f);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ahnz ahnzVar = aizp.c;
        if (!aqpz.b(this)) {
            return this.n.n(motionEvent);
        }
        if (this.n.n(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.ajad
    public final void p() {
        this.n.f();
    }

    @Override // defpackage.ajae
    public final void q(boolean z, cg cgVar) {
        ajbl ajblVar = this.n;
        if (!ajblVar.j && ajbr.m(cgVar) == ajblVar.d.c) {
            ajblVar.i(z);
        }
    }

    @Override // defpackage.ajad
    public final void r(boolean z) {
        this.n.i(z);
    }

    @Override // defpackage.ajbm
    public final Activity d() {
        return this;
    }
}
