package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbc extends ajaz {
    public int ak;
    private LinearLayout al;
    private aizb am;
    public String d;
    public int e = -1;

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
        if (this.am.c() && this.d != null) {
            this.am.a();
            aozy createBuilder2 = apqx.a.createBuilder();
            int i = this.e;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            ((apqx) apagVar).c = i;
            int i2 = this.ak;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            ((apqx) createBuilder2.b).b = a.ak(i2);
            String str = this.d;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apqx apqxVar = (apqx) createBuilder2.b;
            str.getClass();
            apqxVar.d = str;
            apqx apqxVar2 = (apqx) createBuilder2.s();
            aozy createBuilder3 = apqy.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apqy apqyVar = (apqy) createBuilder3.b;
            apqxVar2.getClass();
            apqyVar.c = apqxVar2;
            apqyVar.b |= 1;
            apqy apqyVar2 = (apqy) createBuilder3.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            apqz apqzVar = (apqz) apagVar2;
            apqyVar2.getClass();
            apqzVar.c = apqyVar2;
            apqzVar.b = 2;
            int i3 = this.a.e;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            ((apqz) createBuilder.b).d = i3;
        }
        return (apqz) createBuilder.s();
    }

    @Override // defpackage.aizv, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.am = (aizb) bundle.getParcelable("QuestionMetrics");
        }
        if (this.am == null) {
            this.am = new aizb();
        }
    }

    @Override // defpackage.ajaz, defpackage.cg
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.am);
    }

    @Override // defpackage.aizv
    public final void o() {
        if (this.al != null) {
            int i = 0;
            while (i < this.al.getChildCount()) {
                View childAt = this.al.getChildAt(i);
                childAt.setAlpha(brg.a);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.ajaz, defpackage.aizv
    public final void p() {
        EditText editText;
        super.p();
        this.am.b();
        ajbm d = d();
        LinearLayout linearLayout = this.al;
        boolean z = false;
        if (linearLayout != null && (editText = (EditText) linearLayout.findViewById(R.id.survey_other_option)) != null && editText.hasFocus()) {
            z = true;
        }
        d.q(z, this);
    }

    @Override // defpackage.ajaz
    public final View r() {
        apry apryVar;
        View inflate = LayoutInflater.from(x()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null);
        this.al = (LinearLayout) inflate.findViewById(R.id.survey_answers_container);
        ajbh ajbhVar = new ajbh(x());
        ajbhVar.a = new ajbg() { // from class: ajbb
            @Override // defpackage.ajbg
            public final void a(aspl asplVar) {
                ajbc ajbcVar = ajbc.this;
                ajbm d = ajbcVar.d();
                if (d == null) {
                    Log.w("SurveyMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                    return;
                }
                ajbcVar.ak = asplVar.a;
                ajbcVar.d = (String) asplVar.c;
                ajbcVar.e = asplVar.b;
                if (asplVar.a == 4) {
                    d.r(true);
                } else {
                    d.p();
                }
            }
        };
        apro aproVar = this.a;
        if (aproVar.c == 4) {
            apryVar = (apry) aproVar.d;
        } else {
            apryVar = apry.a;
        }
        ajbhVar.a(apryVar);
        this.al.addView(ajbhVar);
        if (!d().aN()) {
            inflate.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), z().getDimensionPixelSize(R.dimen.survey_bottom_padding));
        }
        return inflate;
    }
}
