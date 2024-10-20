package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Collection;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
final class mne implements ncq {
    private final ncq a;

    public mne(Set set, ConversationId conversationId) {
        if (set.size() == 1) {
            this.a = ((mng) Collection.EL.stream(set).findFirst().get()).a(conversationId);
            return;
        }
        throw new UnsupportedOperationException("ConversationDisableModeObservableSupplier does not yet support multibindings with multiple (or zero) ConversationDisableModeObserverFactory's");
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.a.a(ncpVar);
    }

    @Override // defpackage.ncq
    public final akul b() {
        return this.a.b();
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        return (mnd) this.a.c();
    }
}
