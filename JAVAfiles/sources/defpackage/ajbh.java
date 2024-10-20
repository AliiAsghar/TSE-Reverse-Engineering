package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbh extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final alor c = alor.p(0, Integer.valueOf(R.drawable.quantum_ic_sentiment_very_satisfied_grey600_36), 1, Integer.valueOf(R.drawable.quantum_ic_sentiment_satisfied_grey600_36), 2, Integer.valueOf(R.drawable.quantum_ic_sentiment_neutral_grey600_36), 3, Integer.valueOf(R.drawable.quantum_ic_sentiment_dissatisfied_grey600_36), 4, Integer.valueOf(R.drawable.quantum_ic_sentiment_very_dissatisfied_grey600_36));
    public ajbg a;

    public ajbh(Context context) {
        super(context);
        setOrientation(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(apry apryVar) {
        int Z;
        boolean z;
        int i;
        apqh apqhVar = apryVar.c;
        if (apqhVar == null) {
            apqhVar = apqh.a;
        }
        View[] viewArr = new View[apqhVar.b.size()];
        apqh apqhVar2 = apryVar.c;
        if (apqhVar2 == null) {
            apqhVar2 = apqh.a;
        }
        apax apaxVar = apqhVar2.b;
        int i2 = apryVar.d;
        int Z2 = a.Z(i2);
        int i3 = 4;
        int i4 = 0;
        if (((Z2 == 0 || Z2 != 4) && ((Z = a.Z(i2)) == 0 || Z != 5)) || apaxVar.size() != 5) {
            z = false;
        } else {
            z = true;
        }
        int i5 = 0;
        while (i5 < apaxVar.size()) {
            int i6 = i5 + 1;
            int Z3 = a.Z(((apqg) apaxVar.get(i5)).c);
            if (Z3 != 0 && Z3 == i3) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_other_entry, (ViewGroup) this, true);
                EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                ahnz.M(editText, (TextView) linearLayout.findViewById(R.id.survey_other_option_personal_info));
                linearLayout.findViewById(R.id.survey_other_option_background).setOnClickListener(new agrb(editText, 20, null));
                editText.addTextChangedListener(new ajbf(this, apaxVar, i5, i4));
                editText.setOnFocusChangeListener(new ajbe(this, editText, apaxVar, i5, 0));
                viewArr[i5] = editText;
            } else {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_item, (ViewGroup) this, true);
                View childAt = getChildAt(getChildCount() - 1);
                viewArr[i5] = childAt;
                TextView textView = (TextView) childAt.findViewById(R.id.survey_multiple_choice_text);
                textView.setText(((apqg) apaxVar.get(i5)).e);
                textView.setContentDescription(((apqg) apaxVar.get(i5)).e);
                ImageView imageView = (ImageView) viewArr[i5].findViewById(R.id.survey_multiple_choice_icon);
                if (z) {
                    int Z4 = a.Z(apryVar.d);
                    if (Z4 != 0 && Z4 == 5) {
                        i = ((altc) c).d - i6;
                    } else {
                        i = i5;
                    }
                    imageView.setImageDrawable(ahnz.N(d.f(getContext(), ((Integer) c.get(Integer.valueOf(i))).intValue()), getContext(), getContext().getColor(R.color.survey_grey_icon_color)));
                } else {
                    imageView.setVisibility(8);
                }
                viewArr[i5].setOnClickListener(new ajbd(this, viewArr, apaxVar, i5, 0));
            }
            i5 = i6;
            i3 = 4;
            i4 = 0;
        }
    }
}
