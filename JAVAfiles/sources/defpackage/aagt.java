package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagt extends aahj {
    private final Context e;

    public aagt(Context context, SuggestionData suggestionData, View view) {
        super(context, suggestionData, view);
        this.e = context;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24, i, true);
    }

    @Override // defpackage.aahj
    public final String b() {
        return aahj.g(this.e.getString(R.string.conversation_suggestion_launch_calendar_action), c());
    }

    @Override // defpackage.aahj
    public final String c() {
        return this.e.getString(R.string.p2p_conversation_suggestion_add_to_calendar_action_text);
    }
}
