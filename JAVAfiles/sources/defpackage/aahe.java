package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahe extends aahj {
    private final Context e;

    public aahe(Context context, SuggestionData suggestionData, View view) {
        super(context, suggestionData, view);
        this.e = context;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_gm_ic_my_location_black_24, i, true);
    }

    @Override // defpackage.aahj
    public final String b() {
        return aahj.g(this.e.getString(R.string.conversation_suggestion_share_location_action), c());
    }
}
