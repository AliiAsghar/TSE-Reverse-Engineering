package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import defpackage.alsx;
import defpackage.gfx;
import defpackage.zmo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SuggestionExamplePreference extends Preference {
    public List a;
    private LinearLayout b;

    public SuggestionExamplePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        super.a(gfxVar);
        LinearLayout linearLayout = (LinearLayout) gfxVar.D(R.id.suggestion_list_container);
        this.b = linearLayout;
        linearLayout.setGravity(8388611);
        ((ConversationSuggestionsView) gfxVar.D(R.id.conversation_suggestions_view)).c(this.a, new zmo());
        if (((alsx) this.a).c > 1) {
            TextView textView = (TextView) gfxVar.D(R.id.example_suggestion_title);
            textView.setText(textView.getResources().getString(R.string.example_suggestions_title));
        }
    }
}
