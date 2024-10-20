package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kyo implements aafw {
    final /* synthetic */ kzx a;
    final /* synthetic */ kyp b;

    public kyo(kyp kypVar, kzx kzxVar) {
        this.a = kzxVar;
        this.b = kypVar;
    }

    @Override // defpackage.aafw
    public final int a() {
        return 0;
    }

    @Override // defpackage.aafw
    public final ConversationIdType b() {
        return this.a.a.l;
    }

    @Override // defpackage.aafw
    public final void c(SuggestionData suggestionData) {
        ((xwj) this.b.b.b()).b(suggestionData, aqax.CONVERSATIONS_LIST_VIEW);
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
        return false;
    }

    @Override // defpackage.aafw
    public final void d() {
    }
}
