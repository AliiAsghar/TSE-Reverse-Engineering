package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahi extends aahj {
    private final Context e;

    public aahi(Context context, SuggestionData suggestionData, View view) {
        super(context, suggestionData, view);
        this.e = context;
    }

    @Override // defpackage.aahj
    public final String b() {
        return aahj.g(this.e.getString(R.string.conversation_suggestion_send_reply), c());
    }

    @Override // defpackage.aahj
    public final String c() {
        String c = super.c();
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        return this.b.d();
    }
}
