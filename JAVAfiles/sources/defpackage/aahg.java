package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahg extends aahj {
    private final Context e;
    private final SmartSuggestionData f;

    public aahg(Context context, SmartSuggestionData smartSuggestionData, View view) {
        super(context, smartSuggestionData, view);
        this.e = context;
        this.f = smartSuggestionData;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_ic_image_black_24, i, true);
    }

    @Override // defpackage.aahj
    public final String c() {
        aqcs aqcsVar;
        SmartSuggestionData smartSuggestionData = this.f;
        Resources resources = this.e.getResources();
        aqcz aqczVar = ((SmartSuggestionItemSuggestionData) smartSuggestionData).c;
        if (aqczVar.c == 17) {
            aqcsVar = (aqcs) aqczVar.d;
        } else {
            aqcsVar = aqcs.a;
        }
        return resources.getQuantityString(R.plurals.p2p_conversation_suggestion_share_recent_image_display_text, aqcsVar.g);
    }
}
