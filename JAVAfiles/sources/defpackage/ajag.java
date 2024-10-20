package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajag extends ajaz {
    public String d;
    private aizb e;

    private final ajai aN(String str) {
        aprh aprhVar;
        ajai ajaiVar = new ajai(x());
        ((EditText) ajaiVar.findViewById(R.id.survey_open_text)).setText(str);
        apro aproVar = this.a;
        if (aproVar.c == 7) {
            aprhVar = (aprh) aproVar.d;
        } else {
            aprhVar = aprh.a;
        }
        ajaiVar.a(aprhVar);
        ajaiVar.a = new ajam(this, 1);
        return ajaiVar;
    }

    @Override // defpackage.cg
    public final void W(Bundle bundle) {
        super.W(bundle);
        d().q(true, this);
    }

    @Override // defpackage.ajaz
    public final String aM() {
        if (this.a.g.isEmpty()) {
            return this.a.f;
        }
        return this.a.g;
    }

    @Override // defpackage.aizv
    public final apqz e() {
        aozy createBuilder = apqz.a.createBuilder();
        if (this.e.c()) {
            this.e.a();
            String ag = albo.ag(this.d);
            aozy createBuilder2 = apqv.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((apqv) createBuilder2.b).b = ag;
            apqv apqvVar = (apqv) createBuilder2.s();
            int i = this.a.e;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((apqz) apagVar).d = i;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apqz apqzVar = (apqz) createBuilder.b;
            apqvVar.getClass();
            apqzVar.c = apqvVar;
            apqzVar.b = 5;
        }
        return (apqz) createBuilder.s();
    }

    @Override // defpackage.aizv, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle == null) {
            this.e = new aizb();
        } else {
            this.e = (aizb) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.ajaz, defpackage.cg
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putParcelable("QuestionMetrics", this.e);
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        View view;
        super.onConfigurationChanged(configuration);
        ahnz ahnzVar = aizp.c;
        if (aqqf.a.get().a(x()) && configuration.orientation == 2 && (view = this.Q) != null) {
            EditText editText = (EditText) view.findViewById(R.id.survey_open_text);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.survey_answers_container);
            if (linearLayout != null && editText != null) {
                linearLayout.removeAllViews();
                linearLayout.addView(aN(editText.getText().toString()));
            }
        }
    }

    @Override // defpackage.ajaz, defpackage.aizv
    public final void p() {
        super.p();
        this.e.b();
        d().q(true, this);
    }

    @Override // defpackage.ajaz
    public final View r() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(x()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        linearLayout.addView(aN(""));
        return linearLayout;
    }
}
