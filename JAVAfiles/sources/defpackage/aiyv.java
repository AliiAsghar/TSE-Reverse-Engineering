package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.EmbeddedSurveyFragment;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiyv {
    public View a;
    public final Set b = new HashSet();
    public final apri c;
    public final LayoutInflater d;
    public SurveyViewPager e;
    public final aiza f;
    public final Bundle g;
    public final MaterialCardView h;
    public final LinearLayout i;
    public boolean j;
    public final ajbp k;
    public final ajbm l;
    public final da m;
    private alor n;
    private final akyr o;

    public aiyv() {
    }

    private final void o() {
        if (!this.e.A() && ahnz.F(d(), this.c, this.f)) {
            p(this.e.c + 1);
        } else {
            q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p(int i) {
        String str;
        aprz aprzVar;
        apqy apqyVar;
        ahnz ahnzVar = aizp.c;
        if (aizp.b(aqql.c(aizp.b))) {
            j(l());
        }
        int g = aove.g(f().b);
        if (g != 0) {
            if (g == 1) {
                Bundle bundle = this.g;
                String valueOf = String.valueOf(f().d);
                apqz f = f();
                if (f.b == 2) {
                    apqyVar = (apqy) f.c;
                } else {
                    apqyVar = apqy.a;
                }
                apqx apqxVar = apqyVar.c;
                if (apqxVar == null) {
                    apqxVar = apqx.a;
                }
                bundle.putString(valueOf, apqxVar.d);
            }
            m(5);
            this.e.x(i);
            SurveyViewPager surveyViewPager = this.e;
            if (surveyViewPager == null || !surveyViewPager.B()) {
                apri apriVar = this.c;
                apro aproVar = (apro) apriVar.g.get(d());
                if (aproVar.g.isEmpty()) {
                    str = aproVar.f;
                } else {
                    str = aproVar.g;
                }
                int size = aproVar.h.size();
                String[] strArr = new String[size];
                String[] strArr2 = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    apsa apsaVar = (apsa) aproVar.h.get(i2);
                    int i3 = apsaVar.b;
                    if (aove.f(i3) == 3) {
                        if (i3 == 2) {
                            aprzVar = (aprz) apsaVar.c;
                        } else {
                            aprzVar = aprz.a;
                        }
                        Bundle bundle2 = this.g;
                        int i4 = aprzVar.b;
                        String string = bundle2.getString(String.valueOf(i4));
                        if (string != null) {
                            strArr[i2] = apsaVar.d;
                            strArr2[i2] = string;
                        } else {
                            Log.e("SurveyContainer", a.cb(i4, "No single-select question with ordinal ", " was found."));
                        }
                    }
                }
                this.e.y(TextUtils.replace(str, strArr, strArr2).toString());
            }
            k();
            this.e.u().Q.sendAccessibilityEvent(32);
            long j = aizr.a;
            return;
        }
        throw null;
    }

    private final void q() {
        long j = aizr.a;
        m(5);
        this.j = true;
        h(false);
        for (EmbeddedSurveyFragment embeddedSurveyFragment : c()) {
        }
        ahnz ahnzVar = aizp.c;
        if (aizp.c(aqqo.b(aizp.b))) {
            if (this.k.i == aiyq.CARD) {
                this.e.w();
                return;
            }
            b(R.id.survey_main_scroll_view).setVisibility(8);
            for (EmbeddedSurveyFragment embeddedSurveyFragment2 : c()) {
                apqp apqpVar = this.c.d;
                if (apqpVar == null) {
                    apqpVar = apqp.b;
                }
                Snackbar.q(embeddedSurveyFragment2.F().getWindow().findViewById(android.R.id.content), apqpVar.c, -1).i();
            }
            return;
        }
        this.e.w();
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final View b(int i) {
        return this.a.findViewById(i);
    }

    public final Set c() {
        return alpt.o(this.b);
    }

    public final int d() {
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager != null) {
            int i = surveyViewPager.c;
            if (aizp.a()) {
                return i + this.k.g;
            }
            return i;
        }
        return 0;
    }

    public final aiyz e() {
        arbj arbjVar = new arbj();
        arbjVar.R(this.k.f.b);
        arbjVar.T(this.k.e);
        arbjVar.S(this.k.l);
        return arbjVar.Q();
    }

    public final apqz f() {
        return this.f.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        apqy apqyVar;
        int T;
        apry apryVar;
        apry apryVar2;
        apqy apqyVar2;
        int T2;
        apqw apqwVar;
        int T3;
        apqu apquVar;
        apqw apqwVar2;
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager != null && surveyViewPager.z()) {
            apre apreVar = this.c.c;
            if (apreVar == null) {
                apreVar = apre.a;
            }
            if (!apreVar.b) {
                m(3);
            }
        }
        aizr.g(this.i);
        n();
        aiyz e = e();
        int T4 = a.T(((apro) this.c.g.get(d())).i);
        int i = 1;
        if (T4 == 0) {
            T4 = 1;
        }
        int i2 = T4 - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        asqc.z(ahnz.a, e);
                    }
                } else {
                    apqz v = this.e.v();
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
                    asqc.z(ahnz.a, e);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                apqz v2 = this.e.v();
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
                asqc.z(asqcVar, e);
            }
        } else {
            apqz v3 = this.e.v();
            if (v3.b == 2) {
                apqyVar = (apqy) v3.c;
            } else {
                apqyVar = apqy.a;
            }
            apqx apqxVar2 = apqyVar.c;
            if (apqxVar2 == null) {
                apqxVar2 = apqx.a;
            }
            int i4 = apqxVar2.c;
            asqc.z(ahnz.a, e);
        }
        ahnz ahnzVar = aizp.c;
        if (!aizp.b(aqql.c(aizp.b))) {
            apro aproVar = (apro) this.c.g.get(d());
            if (l() && (T3 = a.T(aproVar.i)) != 0 && T3 == 5) {
                j(true);
            }
        }
        apqz v4 = this.e.v();
        if (v4 != null) {
            this.f.a = v4;
        }
        if (aizp.a()) {
            SurveyViewPager surveyViewPager2 = this.e;
            if (surveyViewPager2 == null) {
                o();
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
                    q();
                    return;
                }
            }
            ahnz ahnzVar2 = aizp.c;
            int i5 = 0;
            if (aizp.c(aqpn.c(aizp.b)) && (T2 = a.T(aproVar2.i)) != 0 && T2 == 5) {
                apqz v5 = this.e.v();
                if (v5.b == 4) {
                    apqwVar = (apqw) v5.c;
                } else {
                    apqwVar = apqw.a;
                }
                apqx apqxVar3 = apqwVar.c;
                if (apqxVar3 == null) {
                    apqxVar3 = apqx.a;
                }
                int b = new arjs(null).b(this.n, this.c.g.size(), apqxVar3.c, aproVar2);
                if (b == -1) {
                    o();
                    return;
                }
                if (b - 1 != this.c.g.size()) {
                    ajbr ajbrVar = (ajbr) this.e.b;
                    if (ajbrVar != null) {
                        i5 = ajbrVar.n(b);
                    }
                    p(i5);
                    return;
                }
                q();
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
                    apqz v6 = this.e.v();
                    if (v6.b == 2) {
                        apqyVar2 = (apqy) v6.c;
                    } else {
                        apqyVar2 = apqy.a;
                    }
                    apqx apqxVar4 = apqyVar2.c;
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
                            o();
                            return;
                        } else {
                            q();
                            return;
                        }
                    }
                    apqi apqiVar3 = apqgVar.g;
                    if (apqiVar3 == null) {
                        apqiVar3 = apqi.a;
                    }
                    String str = apqiVar3.c;
                    ajbr ajbrVar2 = (ajbr) this.e.b;
                    if (ajbrVar2 != null && this.n.containsKey(str)) {
                        i5 = ajbrVar2.n(((Integer) this.n.get(str)).intValue());
                    }
                    p(i5);
                    return;
                }
                o();
                return;
            }
            o();
            return;
        }
        o();
    }

    public final void h(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null && materialButton.isEnabled() != z) {
            materialButton.setEnabled(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.String r8) {
        /*
            r7 = this;
            ajbk r6 = new ajbk
            r0 = 2
            r6.<init>(r7, r8, r0)
            apri r1 = r7.c
            aprf r1 = r1.i
            if (r1 != 0) goto Le
            aprf r1 = defpackage.aprf.a
        Le:
            int r1 = r1.b
            r1 = r1 & 1
            r2 = 0
            if (r1 == 0) goto L31
            apri r1 = r7.c
            aprf r1 = r1.i
            if (r1 != 0) goto L1d
            aprf r1 = defpackage.aprf.a
        L1d:
            java.lang.String r1 = r1.c
            int r1 = r1.length()
            if (r1 <= 0) goto L31
            apri r1 = r7.c
            aprf r1 = r1.i
            if (r1 != 0) goto L2d
            aprf r1 = defpackage.aprf.a
        L2d:
            java.lang.String r1 = r1.c
            r3 = r1
            goto L32
        L31:
            r3 = r2
        L32:
            apri r1 = r7.c
            aprf r1 = r1.i
            if (r1 != 0) goto L3b
            aprf r4 = defpackage.aprf.a
            goto L3c
        L3b:
            r4 = r1
        L3c:
            int r4 = r4.b
            r0 = r0 & r4
            if (r0 == 0) goto L59
            if (r1 != 0) goto L45
            aprf r1 = defpackage.aprf.a
        L45:
            java.lang.String r0 = r1.d
            int r0 = r0.length()
            if (r0 <= 0) goto L59
            apri r0 = r7.c
            aprf r0 = r0.i
            if (r0 != 0) goto L55
            aprf r0 = defpackage.aprf.a
        L55:
            java.lang.String r0 = r0.d
            r4 = r0
            goto L5a
        L59:
            r4 = r2
        L5a:
            apri r0 = r7.c
            aprf r0 = r0.i
            if (r0 != 0) goto L63
            aprf r1 = defpackage.aprf.a
            goto L64
        L63:
            r1 = r0
        L64:
            int r1 = r1.b
            r1 = r1 & 4
            if (r1 == 0) goto L82
            if (r0 != 0) goto L6e
            aprf r0 = defpackage.aprf.a
        L6e:
            java.lang.String r0 = r0.e
            int r0 = r0.length()
            if (r0 <= 0) goto L82
            apri r0 = r7.c
            aprf r0 = r0.i
            if (r0 != 0) goto L7e
            aprf r0 = defpackage.aprf.a
        L7e:
            java.lang.String r0 = r0.e
            r5 = r0
            goto L83
        L82:
            r5 = r2
        L83:
            android.content.Context r0 = r7.a()
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 2131429791(0x7f0b099f, float:1.8481265E38)
            android.view.View r1 = r7.b(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r8
            defpackage.ahnz.P(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyv.i(java.lang.String):void");
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
        if (materialButton != null && this.e.A()) {
            materialButton.setText(R.string.survey_submit);
        }
    }

    public final boolean l() {
        return aizr.l(this.c);
    }

    public final void m(int i) {
        aiza aizaVar = this.f;
        aizaVar.g = i;
        this.o.m(aizaVar, aizr.j(this.c));
    }

    public final void n() {
        b(R.id.survey_controls_divider).setVisibility(8);
        b(R.id.survey_controls_legal_text).setVisibility(8);
    }

    public aiyv(LayoutInflater layoutInflater, da daVar, ajbm ajbmVar, ajbp ajbpVar) {
        this.a = layoutInflater.inflate(R.layout.survey_container, (ViewGroup) null, false);
        this.d = layoutInflater;
        this.m = daVar;
        apri apriVar = ajbpVar.a;
        this.c = apriVar;
        this.f = ajbpVar.b;
        this.j = ajbpVar.c;
        this.k = ajbpVar;
        this.l = ajbmVar;
        this.g = ajbpVar.m;
        HashMap hashMap = new HashMap();
        for (apro aproVar : apriVar.g) {
            if ((aproVar.b & 1) != 0) {
                aprn aprnVar = aproVar.k;
                if (!hashMap.containsKey((aprnVar == null ? aprn.a : aprnVar).c)) {
                    aprn aprnVar2 = aproVar.k;
                    hashMap.put((aprnVar2 == null ? aprn.a : aprnVar2).c, Integer.valueOf(aproVar.e - 1));
                }
            }
        }
        this.n = alor.j(hashMap);
        this.o = new akyr(a(), ajbpVar.e, ajbpVar.f);
        this.i = (LinearLayout) b(R.id.survey_container);
        this.h = (MaterialCardView) b(R.id.survey_overall_container);
    }
}
