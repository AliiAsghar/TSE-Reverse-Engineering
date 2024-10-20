package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagv extends aahj {
    private final Context e;
    private final SmartSuggestionData f;

    public aagv(Context context, SmartSuggestionData smartSuggestionData, View view) {
        super(context, smartSuggestionData, view);
        this.e = context;
        this.f = smartSuggestionData;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        return f(this.e, R.drawable.context_everywhere_logo, i, false);
    }

    @Override // defpackage.aahj
    public final String b() {
        return this.f.h();
    }

    @Override // defpackage.aahj
    public final String c() {
        return this.e.getString(R.string.p2p_conversation_suggestion_context_action_text);
    }
}
