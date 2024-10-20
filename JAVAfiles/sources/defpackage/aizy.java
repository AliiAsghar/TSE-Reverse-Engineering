package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizy extends ajaz {
    private boolean[] ak;
    private ViewGroup al;
    public aizb d;
    public agrk e;

    @Override // defpackage.cg
    public final void W(Bundle bundle) {
        super.W(bundle);
        d().q(aN(), this);
    }

    @Override // defpackage.ajaz
    public final String aM() {
        if (this.a.g.isEmpty()) {
            return this.a.f;
        }
        return this.a.g;
    }

    public final boolean aN() {
        agrk agrkVar = this.e;
        if (agrkVar == null) {
            return false;
        }
        return agrkVar.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.aizv
    public final apqz e() {
        aprg aprgVar;
        aozy createBuilder = apqz.a.createBuilder();
        if (this.d.c()) {
            aozy createBuilder2 = apqu.a.createBuilder();
            apro aproVar = this.a;
            if (aproVar.c == 5) {
                aprgVar = (aprg) aproVar.d;
            } else {
                aprgVar = aprg.a;
            }
            apqh apqhVar = aprgVar.c;
            if (apqhVar == null) {
                apqhVar = apqh.a;
            }
            apax apaxVar = apqhVar.b;
            int i = 0;
            while (true) {
                boolean[] zArr = (boolean[]) this.e.a;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    Object obj = ((apqg) apaxVar.get(i)).e;
                    int Z = a.Z(((apqg) apaxVar.get(i)).c);
                    int i2 = 4;
                    if (Z != 0 && Z == 4 && !TextUtils.isEmpty(this.e.b)) {
                        obj = this.e.b;
                    }
                    aozy createBuilder3 = apqx.a.createBuilder();
                    int i3 = ((apqg) apaxVar.get(i)).d;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar = createBuilder3.b;
                    ((apqx) apagVar).c = i3;
                    if (!apagVar.isMutable()) {
                        createBuilder3.u();
                    }
                    apqx apqxVar = (apqx) createBuilder3.b;
                    obj.getClass();
                    apqxVar.d = (String) obj;
                    int Z2 = a.Z(((apqg) apaxVar.get(i)).c);
                    if (Z2 == 0) {
                        Z2 = 1;
                    }
                    int i4 = Z2 - 2;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                i2 = 2;
                            } else {
                                i2 = 5;
                            }
                        }
                    } else {
                        i2 = 3;
                    }
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    ((apqx) createBuilder3.b).b = a.ak(i2);
                    createBuilder2.bC((apqx) createBuilder3.s());
                    this.d.a();
                }
                int i5 = this.a.e;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((apqz) createBuilder.b).d = i5;
                apqu apquVar = (apqu) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apqz apqzVar = (apqz) createBuilder.b;
                apquVar.getClass();
                apqzVar.c = apquVar;
                apqzVar.b = 3;
                i++;
            }
        }
        return (apqz) createBuilder.s();
    }

    @Override // defpackage.aizv, defpackage.cg
    public final void g(Bundle bundle) {
        aprg aprgVar;
        aprg aprgVar2;
        aprg aprgVar3;
        super.g(bundle);
        if (bundle != null) {
            this.d = (aizb) bundle.getParcelable("QuestionMetrics");
            this.ak = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.d == null) {
            this.d = new aizb();
        }
        boolean[] zArr = this.ak;
        if (zArr == null) {
            apro aproVar = this.a;
            if (aproVar.c == 5) {
                aprgVar3 = (aprg) aproVar.d;
            } else {
                aprgVar3 = aprg.a;
            }
            apqh apqhVar = aprgVar3.c;
            if (apqhVar == null) {
                apqhVar = apqh.a;
            }
            this.ak = new boolean[apqhVar.b.size()];
            return;
        }
        apro aproVar2 = this.a;
        if (aproVar2.c == 5) {
            aprgVar = (aprg) aproVar2.d;
        } else {
            aprgVar = aprg.a;
        }
        apqh apqhVar2 = aprgVar.c;
        if (apqhVar2 == null) {
            apqhVar2 = apqh.a;
        }
        if (zArr.length != apqhVar2.b.size()) {
            Log.e("SurveyMultiSelectFrag", "Saved instance state responses had incorrect length: " + this.ak.length);
            apro aproVar3 = this.a;
            if (aproVar3.c == 5) {
                aprgVar2 = (aprg) aproVar3.d;
            } else {
                aprgVar2 = aprg.a;
            }
            apqh apqhVar3 = aprgVar2.c;
            if (apqhVar3 == null) {
                apqhVar3 = apqh.a;
            }
            this.ak = new boolean[apqhVar3.b.size()];
        }
    }

    @Override // defpackage.ajaz, defpackage.cg
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putParcelable("QuestionMetrics", this.d);
        bundle.putBooleanArray("ResponsesAsArray", this.ak);
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
        super.p();
        this.d.b();
        d().q(aN(), this);
    }

    @Override // defpackage.ajaz
    public final View r() {
        aprg aprgVar;
        this.al = (LinearLayout) LayoutInflater.from(x()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        ajac ajacVar = new ajac(x());
        ajacVar.c = new ajan(this, 1);
        apro aproVar = this.a;
        if (aproVar.c == 5) {
            aprgVar = (aprg) aproVar.d;
        } else {
            aprgVar = aprg.a;
        }
        ajacVar.a(aprgVar, this.ak);
        this.al.addView(ajacVar);
        return this.al;
    }
}
