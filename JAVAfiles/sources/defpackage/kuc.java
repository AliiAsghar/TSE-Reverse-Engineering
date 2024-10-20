package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicConversationDataView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuc {
    public final LinearLayout a;
    public final TextView b;
    public final CheckBox c;
    public final List d = new ArrayList();
    public ConversationIdType e = ruy.a;
    public SpannableString f;
    private final Context g;
    private final TextView h;

    public kuc(ProblematicConversationDataView problematicConversationDataView) {
        this.g = problematicConversationDataView.getContext();
        this.a = (LinearLayout) problematicConversationDataView.findViewById(R.id.message_data_container);
        this.b = (TextView) problematicConversationDataView.findViewById(R.id.conversation_name);
        CheckBox checkBox = (CheckBox) problematicConversationDataView.findViewById(R.id.conversation_selection_checkbox);
        this.c = checkBox;
        this.h = (TextView) problematicConversationDataView.findViewById(R.id.conversation_message_count);
        problematicConversationDataView.setOnClickListener(new klx(this, 12));
        checkBox.setOnCheckedChangeListener(new ggc(this, 3));
    }

    public final void a() {
        long size = this.d.size();
        long count = Collection.EL.stream(this.d).filter(new ilu(14)).count();
        if (count == size) {
            this.c.setChecked(true);
        }
        if (count == 0) {
            this.c.setChecked(false);
        }
        this.h.setText(this.g.getString(R.string.problematic_conversation_message_counter_text, Long.valueOf(count), Long.valueOf(size)));
    }
}
