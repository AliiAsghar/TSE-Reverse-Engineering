package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahb extends aahj {
    private final Context e;
    private final SmartSuggestionData f;

    public aahb(Context context, SmartSuggestionData smartSuggestionData, View view) {
        super(context, smartSuggestionData, view);
        this.e = context;
        this.f = smartSuggestionData;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_ic_content_copy_grey600_24, i, true);
    }

    @Override // defpackage.aahj
    public final String c() {
        aqce aqceVar;
        aqcz aqczVar = ((SmartSuggestionItemSuggestionData) this.f).c;
        if (aqczVar.c == 18) {
            aqceVar = (aqce) aqczVar.d;
        } else {
            aqceVar = aqce.a;
        }
        Context context = this.e;
        String str = aqceVar.b;
        str.getClass();
        return context.getString(R.string.action_copy_otp, xwr.e(str));
    }
}
