package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationInteractiveTimestampAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgp implements rhp {
    private final armf a;
    private final armf b;

    public rgp(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public final /* bridge */ /* synthetic */ Action a(ConversationIdType conversationIdType, long j) {
        agnq agnqVar = (agnq) this.b.b();
        agnqVar.getClass();
        conversationIdType.getClass();
        return new UpdateConversationInteractiveTimestampAction(this.a, agnqVar, conversationIdType, j);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        agnq agnqVar = (agnq) this.b.b();
        agnqVar.getClass();
        parcel.getClass();
        return new UpdateConversationInteractiveTimestampAction(this.a, agnqVar, parcel);
    }
}
