package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rda implements algk {
    final /* synthetic */ ProcessPendingRevocationsAction a;

    public rda(ProcessPendingRevocationsAction processPendingRevocationsAction) {
        this.a = processPendingRevocationsAction;
    }

    @Override // defpackage.algk
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            this.a.b.b();
            return null;
        }
        return null;
    }
}
