package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aags extends aahj {
    private static final alor e;
    private final Context f;
    private final SmartSuggestionData g;

    static {
        alok alokVar = new alok();
        alokVar.h("ASSISTANT_WEATHER", Integer.valueOf(R.drawable.quantum_gm_ic_partly_cloudy_day_gm_grey_24));
        alokVar.h("ASSISTANT_DINING", Integer.valueOf(R.drawable.quantum_gm_ic_restaurant_gm_grey_24));
        alokVar.h("ASSISTANT_MOVIES", Integer.valueOf(R.drawable.quantum_gm_ic_movie_gm_grey_24));
        e = alokVar.b();
    }

    public aags(Context context, SmartSuggestionData smartSuggestionData, View view) {
        super(context, smartSuggestionData, view);
        this.f = context;
        this.g = smartSuggestionData;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        String o = this.g.o();
        alor alorVar = e;
        if (alorVar.containsKey(o)) {
            return f(this.f, ((Integer) alorVar.get(o)).intValue(), i, true);
        }
        return f(this.f, R.drawable.assistant_logo, i, false);
    }

    @Override // defpackage.aahj
    public final String b() {
        return aahj.g(this.f.getString(R.string.p2p_conversation_suggestion_assistant_action), c());
    }

    @Override // defpackage.aahj
    public final String c() {
        return this.g.i();
    }
}
