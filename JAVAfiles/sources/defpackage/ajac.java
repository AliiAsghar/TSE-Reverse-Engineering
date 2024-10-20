package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajac extends LinearLayout {
    public boolean[] a;
    public String b;
    public ajab c;

    public ajac(Context context) {
        super(context);
        setOrientation(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(aprg aprgVar, boolean[] zArr) {
        String str;
        if (zArr == null) {
            apqh apqhVar = aprgVar.c;
            if (apqhVar == null) {
                apqhVar = apqh.a;
            }
            this.a = new boolean[apqhVar.b.size()];
        } else {
            this.a = zArr;
        }
        apqh apqhVar2 = aprgVar.c;
        if (apqhVar2 == null) {
            apqhVar2 = apqh.a;
        }
        apax apaxVar = apqhVar2.b;
        int i = 0;
        for (int i2 = 0; i2 < apaxVar.size(); i2++) {
            int Z = a.Z(((apqg) apaxVar.get(i2)).c);
            if (Z != 0 && Z == 4) {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_other_option, (ViewGroup) this, true);
                LinearLayout linearLayout = (LinearLayout) getChildAt(i2);
                CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox.setContentDescription(getResources().getString(R.string.survey_other_option_hint));
                checkBox.setChecked(this.a[i2]);
                checkBox.setOnCheckedChangeListener(new ajaa(this, i2, 0));
                checkBox.setTag("OtherPleaseSpecify");
                EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                ahnz.M(editText, (TextView) linearLayout.findViewById(R.id.tv_survey_other_option_pii_info));
                View findViewById = linearLayout.findViewById(R.id.survey_other_option_background);
                findViewById.setOnTouchListener(new aizz(checkBox, findViewById, editText, i));
                editText.addTextChangedListener(new ajbf(this, i2, checkBox, 1));
                editText.setOnFocusChangeListener(new ajbe(this, i2, checkBox, editText, 1));
                ahnz ahnzVar = aizp.c;
                if (aqpw.a.get().a(getContext())) {
                    editText.setFocusable(false);
                    editText.postDelayed(new ahsa(editText, 16), 500L);
                }
            } else {
                boolean z = this.a[i2];
                int Z2 = a.Z(((apqg) apaxVar.get(i2)).c);
                if (Z2 == 0) {
                    Z2 = 1;
                }
                if (Z2 == 5) {
                    str = "NoneOfTheAbove";
                } else {
                    str = null;
                }
                String str2 = ((apqg) apaxVar.get(i2)).e;
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_item, (ViewGroup) this, true);
                FrameLayout frameLayout = (FrameLayout) getChildAt(i2);
                CheckBox checkBox2 = (CheckBox) frameLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox2.setText(str2);
                checkBox2.setContentDescription(str2);
                checkBox2.setChecked(z);
                checkBox2.setOnCheckedChangeListener(new ajaa(this, i2, 0));
                frameLayout.setOnClickListener(new agrb(checkBox2, 16, null));
                if (str != null) {
                    checkBox2.setTag(str);
                }
            }
        }
    }
}
