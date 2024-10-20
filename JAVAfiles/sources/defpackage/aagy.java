package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagy extends aahj {
    private final Context e;
    private final SmartSuggestionData f;

    public aagy(Context context, SmartSuggestionData smartSuggestionData, View view) {
        super(context, smartSuggestionData, view);
        this.e = context;
        this.f = smartSuggestionData;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_ic_search_black_24, i, true);
    }

    @Override // defpackage.aahj
    public final String b() {
        return aahj.g(this.e.getString(R.string.p2p_conversation_suggestion_gif_search_action), this.e.getString(R.string.p2p_conversation_suggestion_gif_search_description, this.f.m()));
    }

    @Override // defpackage.aahj
    public final String c() {
        return this.e.getString(R.string.p2p_conversation_suggestion_gif_search_display_text, this.f.m());
    }
}
