package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahh extends aahj {
    private final Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aahh(Context context, SuggestionData suggestionData, View view) {
        super(context, suggestionData, view);
        context.getClass();
        suggestionData.getClass();
        view.getClass();
        this.e = context;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        return super.f(this.e, R.drawable.quantum_gm_ic_star_outline_vd_theme_24, i, true);
    }

    @Override // defpackage.aahj
    public final String b() {
        String string = this.e.getString(R.string.conversation_suggestion_star_action);
        string.getClass();
        return string;
    }
}
