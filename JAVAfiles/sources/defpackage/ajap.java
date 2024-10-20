package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajap {
    public static alor a;
    public final ajao b;
    public aiza c;
    public Context d;
    public Activity e;
    public apri f;
    public aizb g;
    public aprx h;
    public aizw i;
    public boolean j;
    public String k;
    public String l;
    public aspl n;
    public agrk o;
    private View p;
    private ViewGroup q;
    private int s;
    private Integer t;
    private aiyq u;
    private String v;
    private boolean r = false;
    private boolean w = false;
    private boolean x = true;
    private boolean y = true;
    public int m = 0;

    public ajap(ajao ajaoVar) {
        this.b = ajaoVar;
    }

    private final void m(View.OnClickListener onClickListener, String str) {
        ((MaterialButton) this.q.findViewById(R.id.survey_next)).setOnClickListener(new ivq(this, onClickListener, str, 19));
    }

    private final void n() {
        ((LayoutInflater) this.d.getSystemService("layout_inflater")).inflate(R.layout.survey_controls, this.q);
        if (!aizr.l(this.f)) {
            this.q.findViewById(R.id.survey_next).setVisibility(8);
        } else {
            f(false);
            MaterialButton materialButton = (MaterialButton) this.q.findViewById(R.id.survey_next);
            if (materialButton != null && this.f.g.size() == 1 && !this.w) {
                materialButton.setText(R.string.survey_submit);
            }
            aizj.e(this.q.findViewById(R.id.survey_controls_container), this.q.findViewById(R.id.survey_next), R.dimen.survey_button_accessibility_padding, 0);
        }
        this.q.findViewById(R.id.survey_controls_divider).setVisibility(8);
        this.q.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
    }

    private final void o(Context context, String str, aprx aprxVar, boolean z) {
        aiza aizaVar = this.c;
        aizaVar.g = 3;
        new akyr(context, str, aprxVar).m(aizaVar, z);
    }

    private final boolean p() {
        Activity activity;
        if (this.r) {
            return false;
        }
        ahnz ahnzVar = aizp.c;
        if (aizp.b(aqra.a.get().b(aizp.b)) && (activity = this.b.getActivity()) != null && activity.isChangingConfigurations()) {
            return false;
        }
        return true;
    }

    private static final void q(View view, String str) {
        Spanned fromHtml;
        TextView textView = (TextView) view.findViewById(R.id.survey_prompt_title_text);
        fromHtml = Html.fromHtml(str, 0);
        textView.setText(fromHtml);
        textView.announceForAccessibility(fromHtml.toString());
    }

    public final aiyz a() {
        aprx aprxVar = this.h;
        if (aprxVar != null && this.k != null) {
            arbj arbjVar = new arbj();
            arbjVar.R(aprxVar.b);
            arbjVar.T(this.k);
            arbjVar.S(aizd.POPUP);
            return arbjVar.Q();
        }
        long j = aizr.a;
        return null;
    }

    public final void b(apro aproVar) {
        if (aizp.a()) {
            aprn aprnVar = aproVar.k;
            if (aprnVar == null) {
                aprnVar = aprn.a;
            }
            if ((aprnVar.b & 1) != 0) {
                aprn aprnVar2 = aproVar.k;
                if (aprnVar2 == null) {
                    aprnVar2 = aprn.a;
                }
                apqi apqiVar = aprnVar2.d;
                if (apqiVar == null) {
                    apqiVar = apqi.a;
                }
                int Z = a.Z(apqiVar.b);
                if (Z == 0) {
                    Z = 1;
                }
                if (Z - 2 != 3) {
                    this.m = 1;
                    return;
                } else {
                    this.m = this.f.g.size();
                    return;
                }
            }
            this.m = 1;
            return;
        }
        this.m = 1;
    }

    public final void c() {
        aiyq aiyqVar;
        this.g.a();
        ahnz ahnzVar = aizp.c;
        if (aizp.c(aqqo.b(aizp.b)) && (((aiyqVar = this.u) == aiyq.TOAST || aiyqVar == aiyq.SILENT) && (this.f.g.size() == 1 || ahnz.G(this.j, this.f, this.c) || this.m == this.f.g.size()))) {
            aiyq aiyqVar2 = this.u;
            if (aiyqVar2 == aiyq.TOAST) {
                View view = this.p;
                apqp apqpVar = this.f.d;
                if (apqpVar == null) {
                    apqpVar = apqp.b;
                }
                Snackbar.q(view, apqpVar.c, -1).i();
            } else if (aiyqVar2 == aiyq.SILENT) {
                Log.v("SurveyPromptDialogDel", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
            }
            Context context = this.d;
            String str = this.k;
            aprx aprxVar = this.h;
            boolean j = aizr.j(this.f);
            aiza aizaVar = this.c;
            aizaVar.g = 5;
            new akyr(context, str, aprxVar).m(aizaVar, j);
            o(this.d, this.k, this.h, aizr.j(this.f));
            this.b.dismissAllowingStateLoss();
            return;
        }
        h();
    }

    public final void d() {
        if (aizp.b != null) {
            if (aizp.d()) {
                aiyz a2 = a();
                if (p() && a2 != null) {
                    ahnz.a.n(a2);
                    return;
                }
                return;
            }
            if (p()) {
                ahnz.a.m();
            }
        }
    }

    public final void e(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.d.getSystemService("accessibility");
        View findViewById = view.findViewById(R.id.survey_prompt_title_text);
        ahnz ahnzVar = aizp.c;
        if (aizp.b(aqpq.a.get().a(aizp.b)) && accessibilityManager.isTouchExplorationEnabled() && findViewById != null && !findViewById.isAccessibilityFocused()) {
            findViewById.performAccessibilityAction(64, null);
        }
    }

    public final void f(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.q.findViewById(R.id.survey_next);
        if (materialButton != null && materialButton.isEnabled() != z) {
            materialButton.setEnabled(z);
        }
    }

    public final void g(apro aproVar) {
        apry apryVar;
        int i;
        aspl asplVar = this.n;
        aozy createBuilder = apqz.a.createBuilder();
        if (this.g.c() && asplVar.c != null) {
            aozy createBuilder2 = apqx.a.createBuilder();
            int i2 = asplVar.b;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            ((apqx) apagVar).c = i2;
            int i3 = asplVar.a;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            ((apqx) createBuilder2.b).b = a.ak(i3);
            Object obj = asplVar.c;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apqx apqxVar = (apqx) createBuilder2.b;
            obj.getClass();
            apqxVar.d = (String) obj;
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
            int i4 = aproVar.e;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            ((apqz) createBuilder.b).d = i4;
        }
        apqz apqzVar2 = (apqz) createBuilder.s();
        if (apqzVar2 != null) {
            this.c.a = apqzVar2;
        }
        b(aproVar);
        aspl asplVar2 = this.n;
        ahnz ahnzVar = aizp.c;
        if (!aizp.c(aqpn.b(aizp.b))) {
            this.m = 1;
        } else {
            apqg apqgVar = apqg.a;
            if (aproVar.c == 4) {
                apryVar = (apry) aproVar.d;
            } else {
                apryVar = apry.a;
            }
            apqh apqhVar = apryVar.c;
            if (apqhVar == null) {
                apqhVar = apqh.a;
            }
            Iterator<E> it = apqhVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                apqg apqgVar2 = (apqg) it.next();
                if (apqgVar2.d == asplVar2.b) {
                    apqgVar = apqgVar2;
                    break;
                }
            }
            if ((apqgVar.b & 1) != 0) {
                apqi apqiVar = apqgVar.g;
                if (apqiVar == null) {
                    apqiVar = apqi.a;
                }
                int Z = a.Z(apqiVar.b);
                if (Z == 0) {
                    Z = 1;
                }
                int i5 = Z - 2;
                if (i5 != 2) {
                    if (i5 != 3) {
                        this.m = 1;
                    } else {
                        this.m = this.f.g.size();
                    }
                } else {
                    apqi apqiVar2 = apqgVar.g;
                    if (apqiVar2 == null) {
                        apqiVar2 = apqi.a;
                    }
                    String str = apqiVar2.c;
                    if (a.containsKey(str)) {
                        i = ((Integer) a.get(str)).intValue();
                    } else {
                        i = 0;
                    }
                    this.m = i;
                }
            }
        }
        c();
    }

    public final void h() {
        Integer num;
        Activity activity = this.b.getActivity();
        String str = this.k;
        apri apriVar = this.f;
        aprx aprxVar = this.h;
        aiza aizaVar = this.c;
        int i = this.s;
        Integer valueOf = Integer.valueOf(i);
        boolean z = this.j;
        Integer num2 = this.t;
        aiyq aiyqVar = this.u;
        String str2 = this.v;
        int i2 = this.m;
        boolean z2 = this.w;
        boolean z3 = this.x;
        boolean z4 = this.y;
        HashMap hashMap = new HashMap();
        Iterator it = apriVar.g.iterator();
        while (true) {
            num = valueOf;
            if (!it.hasNext()) {
                break;
            }
            Iterator it2 = it;
            apro aproVar = (apro) it.next();
            boolean z5 = z4;
            if ((1 & aproVar.b) != 0) {
                aprn aprnVar = aproVar.k;
                if (aprnVar == null) {
                    aprnVar = aprn.a;
                }
                if (!hashMap.containsKey(aprnVar.c)) {
                    aprn aprnVar2 = aproVar.k;
                    if (aprnVar2 == null) {
                        aprnVar2 = aprn.a;
                    }
                    hashMap.put(aprnVar2.c, Integer.valueOf(aproVar.e - 1));
                }
            }
            z4 = z5;
            valueOf = num;
            it = it2;
        }
        boolean z6 = z4;
        ajbl.a = alor.j(hashMap);
        Intent intent = new Intent(activity, (Class<?>) ajbl.class);
        intent.setClassName(activity, str2);
        intent.putExtra("TriggerId", str);
        intent.putExtra("SurveyPayload", apriVar.toByteArray());
        intent.putExtra("SurveySession", aprxVar.toByteArray());
        intent.putExtra("Answer", aizaVar);
        intent.putExtra("IsFullWidth", false);
        intent.putExtra("IgnoreFirstQuestion", z);
        if (num2 != null) {
            intent.putExtra("LogoResId", num2);
        }
        intent.putExtra("IsSubmitting", false);
        intent.putExtra("SurveyCompletionStyle", aiyqVar);
        intent.putExtra("StartingQuestionIndex", i2);
        intent.putExtra("keepNextButtonForLastQuestion", z2);
        intent.putExtra("isCarDisplayFullyReachable", z3);
        intent.putExtra("isCarDisplayRightOfUser", z6);
        long j = aizr.a;
        num.getClass();
        activity.startActivityForResult(intent, i);
        this.r = true;
        o(this.d, this.k, this.h, aizr.j(this.f));
        this.b.dismissAllowingStateLoss();
    }

    public final void i(Context context, String str, aprx aprxVar, boolean z) {
        aiza aizaVar = this.c;
        aizaVar.g = 4;
        new akyr(context, str, aprxVar).m(aizaVar, z);
    }

    public final void j(Context context, String str, aprx aprxVar, boolean z) {
        aiza aizaVar = this.c;
        aizaVar.g = 6;
        new akyr(context, str, aprxVar).m(aizaVar, z);
    }

    public final void k() {
        if (aizp.b == null) {
            this.b.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0498  */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View l(android.view.ViewGroup r20) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajap.l(android.view.ViewGroup):android.view.View");
    }
}
