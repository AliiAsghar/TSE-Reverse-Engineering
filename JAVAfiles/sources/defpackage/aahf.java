package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahf extends aahj {
    private final Context e;

    public aahf(Context context, SuggestionData suggestionData, View view) {
        super(context, suggestionData, view);
        this.e = context;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_ic_alarm_black_24, i, true);
    }

    @Override // defpackage.aahj
    public final String b() {
        return aahj.g(this.e.getString(R.string.conversation_suggestion_set_reminder_action), c());
    }

    @Override // defpackage.aahj
    public final String c() {
        Resources resources = this.e.getResources();
        if (((Boolean) abal.i.e()).booleanValue()) {
            return resources.getString(R.string.p2p_conversation_suggestion_set_reminder_predefined_text);
        }
        return resources.getString(R.string.p2p_conversation_suggestion_set_reminder_text);
    }
}
