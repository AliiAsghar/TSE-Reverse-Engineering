package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagu extends aahj {
    private final Context e;
    private final boolean f;
    private final SmartSuggestionData g;

    public aagu(Context context, SmartSuggestionData smartSuggestionData, View view) {
        super(context, smartSuggestionData, view);
        this.e = context;
        this.g = smartSuggestionData;
        this.f = TextUtils.isEmpty(smartSuggestionData.j());
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        if (TextUtils.isEmpty(this.g.k())) {
            Context context = this.e;
            return f(context, R.drawable.quantum_ic_account_circle_googblue_24, ahnz.f(context, R.attr.colorPrimaryBrandIcon, "ContactShareSuggestionContainerViewHolder"), true);
        }
        SmartSuggestionData smartSuggestionData = this.g;
        return Optional.of(aktp.x(this.e).c().h(Uri.parse(smartSuggestionData.k())).b(hxc.b()));
    }

    @Override // defpackage.aahj
    public final String b() {
        String c;
        if (this.f) {
            c = this.e.getString(R.string.p2p_conversation_suggestion_pick_contact_share_description);
        } else {
            c = c();
        }
        return g(this.e.getString(R.string.p2p_conversation_suggestion_contact_share_action), c);
    }

    @Override // defpackage.aahj
    public final String c() {
        aqbk aqbkVar;
        if (this.f) {
            return this.e.getString(R.string.p2p_conversation_suggestion_pick_contact_share_display_text);
        }
        aqcz aqczVar = ((SmartSuggestionItemSuggestionData) this.g).c;
        if (aqczVar.c == 6) {
            aqbkVar = (aqbk) aqczVar.d;
        } else {
            aqbkVar = aqbk.a;
        }
        String str = aqbkVar.b;
        str.getClass();
        return str;
    }
}
