package defpackage;

import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajaa implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ Object a;
    private final int b;
    private final /* synthetic */ int c;

    public ajaa(Object obj, int i, int i2) {
        this.c = i2;
        this.a = obj;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBox checkBox;
        int i = 0;
        if (this.c != 0) {
            if ("NoneOfTheAbove".equals(compoundButton.getTag())) {
                agrz agrzVar = (agrz) this.a;
                agrzVar.e = z;
                if (z) {
                    if (agrzVar.ag.getChildCount() != ((agrz) this.a).d.length + 1) {
                        Log.e("HatsLibMultiSelectFrag", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                    }
                    for (int i2 = 0; i2 < ((agrz) this.a).ag.getChildCount(); i2++) {
                        CheckBox checkBox2 = (CheckBox) ((agrz) this.a).ag.getChildAt(i2).findViewById(R.id.hats_lib_multiple_select_checkbox);
                        if (!"NoneOfTheAbove".equals(checkBox2.getTag())) {
                            checkBox2.setChecked(false);
                        }
                    }
                }
            } else {
                agrz agrzVar2 = (agrz) this.a;
                agrzVar2.d[this.b] = z;
                if (z) {
                    ((CheckBox) agrzVar2.ag.findViewWithTag("NoneOfTheAbove")).setChecked(false);
                }
            }
            Object obj = this.a;
            cg cgVar = (cg) obj;
            SurveyPromptActivity surveyPromptActivity = (SurveyPromptActivity) cgVar.fe();
            if (surveyPromptActivity != null) {
                surveyPromptActivity.A(((agrz) obj).aN(), cgVar);
                return;
            }
            return;
        }
        if ("NoneOfTheAbove".equals(compoundButton.getTag())) {
            ajac ajacVar = (ajac) this.a;
            ajacVar.a[this.b] = z;
            if (z) {
                if (ajacVar.getChildCount() != ((ajac) this.a).a.length + 1) {
                    Log.e("SurveyMultipleSelectView", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                }
                for (int i3 = 0; i3 < ((ajac) this.a).getChildCount(); i3++) {
                    CheckBox checkBox3 = (CheckBox) ((ajac) this.a).getChildAt(i3).findViewById(R.id.survey_multiple_select_checkbox);
                    if (!"NoneOfTheAbove".equals(checkBox3.getTag())) {
                        checkBox3.setChecked(false);
                    }
                }
            }
        } else if ("OtherPleaseSpecify".equals(compoundButton.getTag())) {
            ((ajac) this.a).a[this.b] = z;
            if (z) {
                while (true) {
                    if (i >= ((ajac) this.a).getChildCount()) {
                        break;
                    }
                    EditText editText = (EditText) ((ajac) this.a).getChildAt(i).findViewById(R.id.survey_other_option);
                    if (editText != null) {
                        editText.requestFocus();
                        break;
                    }
                    i++;
                }
            }
        } else {
            ajac ajacVar2 = (ajac) this.a;
            ajacVar2.a[this.b] = z;
            if (z && (checkBox = (CheckBox) ajacVar2.findViewWithTag("NoneOfTheAbove")) != null) {
                checkBox.setChecked(false);
            }
        }
        ajac ajacVar3 = (ajac) this.a;
        ajacVar3.c.a(new agrk(ajacVar3.b, ajacVar3.a, (byte[]) null));
    }
}
