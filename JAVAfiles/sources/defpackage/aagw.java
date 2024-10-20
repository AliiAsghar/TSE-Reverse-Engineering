package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagw extends aahj {
    private final Context e;
    private final apwt f;

    public aagw(Context context, SuggestionData suggestionData, View view, apwt apwtVar) {
        super(context, suggestionData, view);
        this.e = context;
        this.f = apwtVar;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        AtomicReference atomicReference = new AtomicReference(Integer.valueOf(R.drawable.comms_gm_ic_videocam_vd_theme_24));
        if (((Boolean) yvr.b.e()).booleanValue()) {
            ((yvs) this.f.b()).b().ifPresent(new aagi(atomicReference, 3));
        }
        return f(this.e, ((Integer) atomicReference.get()).intValue(), i, true);
    }

    @Override // defpackage.aahj
    public final String c() {
        return this.e.getString(R.string.p2p_conversation_suggestion_duo_call_action_text);
    }
}
