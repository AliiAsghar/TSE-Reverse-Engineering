package defpackage;

import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicMessageDataView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuf {
    public final TextView a;
    public final TextView b;
    public final CheckBox c;
    public final armf d;
    public ksx e;
    public kuc f;

    public kuf(ProblematicMessageDataView problematicMessageDataView, armf armfVar) {
        this.d = armfVar;
        this.a = (TextView) problematicMessageDataView.findViewById(R.id.message_content);
        this.b = (TextView) problematicMessageDataView.findViewById(R.id.message_timestamp);
        CheckBox checkBox = (CheckBox) problematicMessageDataView.findViewById(R.id.advanced_feedback_data_checkbox);
        this.c = checkBox;
        problematicMessageDataView.setOnClickListener(new klx(this, 13));
        checkBox.setOnCheckedChangeListener(new ggc(this, 4));
    }

    public final boolean a() {
        return this.c.isChecked();
    }
}
