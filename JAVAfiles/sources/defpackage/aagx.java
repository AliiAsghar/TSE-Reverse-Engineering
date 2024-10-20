package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagx extends aahj {
    private final Context e;
    private final SmartSuggestionData f;

    public aagx(Context context, SmartSuggestionData smartSuggestionData, View view) {
        super(context, smartSuggestionData, view);
        this.e = context;
        this.f = smartSuggestionData;
    }

    @Override // defpackage.aahj
    public final String b() {
        aqbq aqbqVar;
        Context context = this.e;
        SmartSuggestionData smartSuggestionData = this.f;
        String string = context.getString(R.string.conversation_suggestion_sticker);
        aqcz aqczVar = ((SmartSuggestionItemSuggestionData) smartSuggestionData).c;
        if (aqczVar.c == 13) {
            aqbqVar = (aqbq) aqczVar.d;
        } else {
            aqbqVar = aqbq.a;
        }
        String str = aqbqVar.d;
        str.getClass();
        return aahj.g(string, str);
    }

    @Override // defpackage.aahj
    public final String c() {
        return "";
    }
}
