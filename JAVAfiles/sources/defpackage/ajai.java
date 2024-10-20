package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajai extends LinearLayout {
    public ajah a;

    public ajai(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_open_text_item, (ViewGroup) this, true);
    }

    public final void a(aprh aprhVar) {
        EditText editText = (EditText) findViewById(R.id.survey_open_text);
        ahnz.M(editText, (TextView) findViewById(R.id.survey_open_text_personal_info));
        editText.setSingleLine(false);
        if (!aprhVar.b.isEmpty()) {
            editText.setHint(aprhVar.b);
        }
        if (!aizr.i(getContext())) {
            editText.requestFocus();
        }
        editText.addTextChangedListener(new aflc(this, 4));
    }
}
