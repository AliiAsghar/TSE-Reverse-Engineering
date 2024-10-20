package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbl {
    public static alor a;
    public apri b;
    public aprx c;
    public SurveyViewPager d;
    public aiza e;
    public ScrollView g;
    public MaterialCardView h;
    public LinearLayout i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Integer r;
    public boolean s;
    public aiyq t;
    public final Activity u;
    public final ajbm v;
    public final da w;
    public akyr x;
    public Bundle f = new Bundle();
    public final Handler p = new Handler();
    public final Runnable q = new ahsa(this, 19);

    public ajbl(Activity activity, da daVar, ajbm ajbmVar) {
        this.u = activity;
        this.w = daVar;
        this.v = ajbmVar;
    }

    private final void q() {
        if (!this.d.A() && ahnz.F(a(), this.b, this.e)) {
            s(this.d.c + 1);
        } else {
            t();
        }
    }

    private final void r(ViewGroup viewGroup, boolean z) {
        viewGroup.setEnabled(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                r((ViewGroup) childAt, z);
            } else if (childAt.getId() == R.id.survey_next && z) {
                b(R.id.survey_next).setEnabled(this.k);
            } else {
                childAt.setEnabled(z);
            }
        }
    }

    private final void s(int i) {
        ahnz ahnzVar = aizp.c;
        if (aizp.b(aqql.c(aizp.b))) {
            j(m());
        }
        h();
        o(5);
        this.d.x(i);
        l();
        k();
        this.d.u().Q.sendAccessibilityEvent(32);
        long j = aizr.a;
    }

    private final void t() {
        long j = aizr.a;
        o(5);
        this.j = true;
        i(false);
        this.u.setResult(-1, new Intent());
        ahnz ahnzVar = aizp.c;
        if (aizp.c(aqqo.b(aizp.b))) {
            if (this.t == aiyq.CARD) {
                this.d.w();
                return;
            }
            this.h.setVisibility(8);
            aiyq aiyqVar = this.t;
            if (aiyqVar == aiyq.TOAST) {
                View findViewById = this.u.getWindow().findViewById(android.R.id.content);
                apqp apqpVar = this.b.d;
                if (apqpVar == null) {
                    apqpVar = apqp.b;
                }
                Snackbar.q(findViewById, apqpVar.c, -1).i();
                e();
                return;
            }
            if (aiyqVar == aiyq.SILENT) {
                Log.v("SurveyActivityImpl", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
                this.u.finish();
                return;
            }
            return;
        }
        this.d.w();
    }

    public final int a() {
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager != null) {
            int i = surveyViewPager.c;
            if (aizp.a()) {
                return i + this.l;
            }
            if (this.s) {
                return i + 1;
            }
            return i;
        }
        return 0;
    }

    public final View b(int i) {
        return this.u.findViewById(i);
    }

    public final aiyz c() {
        String stringExtra = this.u.getIntent().getStringExtra("TriggerId");
        aprx aprxVar = this.c;
        if (aprxVar != null && stringExtra != null) {
            arbj arbjVar = new arbj();
            arbjVar.R(aprxVar.b);
            arbjVar.T(stringExtra);
            arbjVar.S(aizd.POPUP);
            return arbjVar.Q();
        }
        long j = aizr.a;
        return null;
    }

    public final apqz d() {
        return this.e.a;
    }

    public final void e() {
        this.u.setResult(-1, new Intent());
        this.p.postDelayed(this.q, 2400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        int T;
        apry apryVar;
        apry apryVar2;
        apqy apqyVar;
        int T2;
        apqw apqwVar;
        int T3;
        apqy apqyVar2;
        apqu apquVar;
        apqw apqwVar2;
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager != null && surveyViewPager.z()) {
            apre apreVar = this.b.c;
            if (apreVar == null) {
                apreVar = apre.a;
            }
            if (!apreVar.b) {
                o(3);
            }
        }
        aizr.g(this.i);
        p();
        aiyz c = c();
        int i = 1;
        if (c != null) {
            int T4 = a.T(((apro) this.b.g.get(a())).i);
            if (T4 == 0) {
                T4 = 1;
            }
            int i2 = T4 - 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            asqc.z(ahnz.a, c);
                        }
                    } else {
                        apqz v = this.d.v();
                        if (v.b == 4) {
                            apqwVar2 = (apqw) v.c;
                        } else {
                            apqwVar2 = apqw.a;
                        }
                        apqx apqxVar = apqwVar2.c;
                        if (apqxVar == null) {
                            apqxVar = apqx.a;
                        }
                        int i3 = apqxVar.c;
                        asqc.z(ahnz.a, c);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    apqz v2 = this.d.v();
                    if (v2.b == 3) {
                        apquVar = (apqu) v2.c;
                    } else {
                        apquVar = apqu.a;
                    }
                    Iterator<E> it = apquVar.b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((apqx) it.next()).c - 1));
                    }
                    asqc asqcVar = ahnz.a;
                    alog.n(arrayList);
                    asqc.z(asqcVar, c);
                }
            } else {
                apqz v3 = this.d.v();
                if (v3.b == 2) {
                    apqyVar2 = (apqy) v3.c;
                } else {
                    apqyVar2 = apqy.a;
                }
                apqx apqxVar2 = apqyVar2.c;
                if (apqxVar2 == null) {
                    apqxVar2 = apqx.a;
                }
                int i4 = apqxVar2.c;
                asqc.z(ahnz.a, c);
            }
        }
        ahnz ahnzVar = aizp.c;
        if (!aizp.b(aqql.c(aizp.b))) {
            apro aproVar = (apro) this.b.g.get(a());
            if (m() && (T3 = a.T(aproVar.i)) != 0 && T3 == 5) {
                j(true);
            }
        }
        apqz v4 = this.d.v();
        if (v4 != null) {
            this.e.a = v4;
        }
        if (aizp.a()) {
            SurveyViewPager surveyViewPager2 = this.d;
            if (surveyViewPager2 == null) {
                q();
                return;
            }
            apro aproVar2 = surveyViewPager2.u().a;
            aprn aprnVar = aproVar2.k;
            if (aprnVar == null) {
                aprnVar = aprn.a;
            }
            if ((aprnVar.b & 1) != 0) {
                aprn aprnVar2 = aproVar2.k;
                if (aprnVar2 == null) {
                    aprnVar2 = aprn.a;
                }
                apqi apqiVar = aprnVar2.d;
                if (apqiVar == null) {
                    apqiVar = apqi.a;
                }
                int Z = a.Z(apqiVar.b);
                if (Z != 0 && Z == 5) {
                    t();
                    return;
                }
            }
            ahnz ahnzVar2 = aizp.c;
            int i5 = 0;
            if (aizp.c(aqpn.c(aizp.b)) && (T2 = a.T(aproVar2.i)) != 0 && T2 == 5) {
                apqz v5 = this.d.v();
                if (v5.b == 4) {
                    apqwVar = (apqw) v5.c;
                } else {
                    apqwVar = apqw.a;
                }
                apqx apqxVar3 = apqwVar.c;
                if (apqxVar3 == null) {
                    apqxVar3 = apqx.a;
                }
                int b = new arjs(null).b(a, this.b.g.size(), apqxVar3.c, aproVar2);
                if (b == -1) {
                    q();
                    return;
                }
                if (b - 1 != this.b.g.size()) {
                    ajbr ajbrVar = (ajbr) this.d.b;
                    if (ajbrVar != null) {
                        i5 = ajbrVar.n(b);
                    }
                    s(i5);
                    return;
                }
                t();
                return;
            }
            ahnz ahnzVar3 = aizp.c;
            if (aizp.c(aqpn.b(aizp.b)) && (T = a.T(aproVar2.i)) != 0 && T == 3) {
                apqg apqgVar = apqg.a;
                if (aproVar2.c == 4) {
                    apryVar = (apry) aproVar2.d;
                } else {
                    apryVar = apry.a;
                }
                apqh apqhVar = apryVar.c;
                if (apqhVar == null) {
                    apqhVar = apqh.a;
                }
                Iterator<E> it2 = apqhVar.b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    apqg apqgVar2 = (apqg) it2.next();
                    int i6 = apqgVar2.d;
                    apqz v6 = this.d.v();
                    if (v6.b == 2) {
                        apqyVar = (apqy) v6.c;
                    } else {
                        apqyVar = apqy.a;
                    }
                    apqx apqxVar4 = apqyVar.c;
                    if (apqxVar4 == null) {
                        apqxVar4 = apqx.a;
                    }
                    if (i6 == apqxVar4.c) {
                        apqgVar = apqgVar2;
                        break;
                    }
                }
                if (aproVar2.c == 4) {
                    apryVar2 = (apry) aproVar2.d;
                } else {
                    apryVar2 = apry.a;
                }
                if ((apryVar2.b & 1) != 0 && (apqgVar.b & 1) != 0) {
                    apqi apqiVar2 = apqgVar.g;
                    if (apqiVar2 == null) {
                        apqiVar2 = apqi.a;
                    }
                    int Z2 = a.Z(apqiVar2.b);
                    if (Z2 != 0) {
                        i = Z2;
                    }
                    int i7 = i - 2;
                    if (i7 != 2) {
                        if (i7 != 3) {
                            q();
                            return;
                        } else {
                            t();
                            return;
                        }
                    }
                    apqi apqiVar3 = apqgVar.g;
                    if (apqiVar3 == null) {
                        apqiVar3 = apqi.a;
                    }
                    String str = apqiVar3.c;
                    ajbr ajbrVar2 = (ajbr) this.d.b;
                    if (ajbrVar2 != null && a.containsKey(str)) {
                        i5 = ajbrVar2.n(((Integer) a.get(str)).intValue());
                    }
                    s(i5);
                    return;
                }
                q();
                return;
            }
            q();
            return;
        }
        q();
    }

    public final void g(boolean z) {
        int i;
        float f;
        LinearLayout linearLayout = this.i;
        if (true != z) {
            i = 262144;
        } else {
            i = 393216;
        }
        linearLayout.setDescendantFocusability(i);
        LinearLayout linearLayout2 = this.i;
        if (true != z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        linearLayout2.setAlpha(f);
        if (z) {
            this.k = b(R.id.survey_next).isEnabled();
        }
        r(this.i, !z);
    }

    public final void h() {
        apqy apqyVar;
        int g = aove.g(d().b);
        if (g != 0) {
            if (g == 1) {
                Bundle bundle = this.f;
                String valueOf = String.valueOf(d().d);
                apqz d = d();
                if (d.b == 2) {
                    apqyVar = (apqy) d.c;
                } else {
                    apqyVar = apqy.a;
                }
                apqx apqxVar = apqyVar.c;
                if (apqxVar == null) {
                    apqxVar = apqx.a;
                }
                bundle.putString(valueOf, apqxVar.d);
                return;
            }
            return;
        }
        throw null;
    }

    public final void i(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null && materialButton.isEnabled() != z) {
            materialButton.setEnabled(z);
        }
        this.k = z;
    }

    public final void j(boolean z) {
        int i;
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null) {
            if (true != z) {
                i = 8;
            } else {
                i = 0;
            }
            materialButton.setVisibility(i);
        }
    }

    public final void k() {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null && this.d.A() && !this.m) {
            materialButton.setText(R.string.survey_submit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        String str;
        aprz aprzVar;
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager != null && surveyViewPager.B()) {
            return;
        }
        apri apriVar = this.b;
        apro aproVar = (apro) apriVar.g.get(a());
        if (aproVar.g.isEmpty()) {
            str = aproVar.f;
        } else {
            str = aproVar.g;
        }
        int size = aproVar.h.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        for (int i = 0; i < size; i++) {
            apsa apsaVar = (apsa) aproVar.h.get(i);
            int i2 = apsaVar.b;
            if (aove.f(i2) == 3) {
                if (i2 == 2) {
                    aprzVar = (aprz) apsaVar.c;
                } else {
                    aprzVar = aprz.a;
                }
                int i3 = aprzVar.b;
                String string = this.f.getString(String.valueOf(i3));
                if (string != null) {
                    strArr[i] = apsaVar.d;
                    strArr2[i] = string;
                } else {
                    Log.e("SurveyActivityImpl", a.cb(i3, "No single-select question with ordinal ", " was found."));
                }
            }
        }
        this.d.y(TextUtils.replace(str, strArr, strArr2).toString());
    }

    public final boolean m() {
        return aizr.l(this.b);
    }

    public final boolean n(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            this.h.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && this.j) {
                long j = aizr.a;
                this.u.finish();
                return true;
            }
        }
        ahnz ahnzVar = aizp.c;
        if (!aqpz.b(this.u)) {
            return this.u.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void o(int i) {
        aiza aizaVar = this.e;
        aizaVar.g = i;
        this.x.m(aizaVar, aizr.j(this.b));
    }

    public final void p() {
        b(R.id.survey_controls_divider).setVisibility(8);
        b(R.id.survey_controls_legal_text).setVisibility(8);
    }
}
