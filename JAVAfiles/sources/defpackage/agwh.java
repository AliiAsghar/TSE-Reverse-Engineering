package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agwh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public agwh(agre agreVar, String str, int i, int i2, int i3) {
        this.e = i3;
        this.c = str;
        this.b = i;
        this.a = i2;
        this.d = agreVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View childAt;
        if (this.e != 0) {
            int i = this.a;
            int i2 = this.b;
            agre agreVar = (agre) this.d;
            SurveyPromptActivity.D(agreVar.a.a(), (String) this.c, agreVar.e, agreVar.f, agreVar.d, Integer.valueOf(i2), agreVar.g, agreVar.h, i);
            ((agre) this.d).k = true;
            ((agre) this.d).a.dismissAllowingStateLoss();
            return;
        }
        int i3 = this.b;
        Object obj = this.d;
        int i4 = this.a;
        Object obj2 = this.c;
        if (i4 == 0) {
            agwi agwiVar = (agwi) obj2;
            childAt = ((LinearLayout) obj).getChildAt(agwiVar.h);
            agwiVar.h = i3;
        } else {
            agwi agwiVar2 = (agwi) obj2;
            childAt = ((LinearLayout) obj).getChildAt(agwiVar2.i);
            agwiVar2.i = i3;
        }
        if (childAt != null) {
            childAt.setSelected(false);
            childAt.setClickable(true);
        }
        view.setClickable(false);
        view.setSelected(true);
        agwi agwiVar3 = (agwi) obj2;
        agwiVar3.c(agwiVar3.d);
    }

    public /* synthetic */ agwh(agwi agwiVar, int i, LinearLayout linearLayout, int i2, int i3) {
        this.e = i3;
        this.c = agwiVar;
        this.a = i;
        this.d = linearLayout;
        this.b = i2;
    }
}
