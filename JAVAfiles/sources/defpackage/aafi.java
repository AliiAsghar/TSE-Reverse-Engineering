package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafi implements aafw {
    final /* synthetic */ aack a;
    final /* synthetic */ int b;

    public aafi(aack aackVar, int i) {
        this.a = aackVar;
        this.b = i;
    }

    @Override // defpackage.aafw
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aafw
    public final ConversationIdType b() {
        return ((itb) this.a).af;
    }

    @Override // defpackage.aafw
    public final void c(SuggestionData suggestionData) {
        this.a.h(suggestionData);
    }

    @Override // defpackage.aafw
    public final void d() {
        View view;
        itb itbVar = (itb) this.a;
        if (itbVar.ao != null && itbVar.ap != null) {
            int i = 0;
            while (true) {
                if (i < itbVar.ao.getChildCount()) {
                    view = itbVar.ao.getChildAt(i);
                    if (view instanceof ConversationMessageView) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                view.sendAccessibilityEvent(8);
                view.sendAccessibilityEvent(32);
            }
        }
    }

    @Override // defpackage.aafw
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.aafw
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // defpackage.aafw
    public final boolean g() {
        return ((Boolean) ConversationSuggestionsView.a.e()).booleanValue();
    }
}
