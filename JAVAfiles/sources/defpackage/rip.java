package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationOptionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rip implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;

    public rip() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Action a(ConversationIdType conversationIdType, Boolean bool, String str, Boolean bool2, Integer num) {
        ujv ujvVar = (ujv) this.b.b();
        ujvVar.getClass();
        uhj uhjVar = (uhj) this.c.b();
        uhjVar.getClass();
        return new UpdateConversationOptionsAction(this.a, ujvVar, uhjVar, conversationIdType, bool, str, bool2, num);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        ujv ujvVar = (ujv) this.b.b();
        ujvVar.getClass();
        uhj uhjVar = (uhj) this.c.b();
        uhjVar.getClass();
        parcel.getClass();
        return new UpdateConversationOptionsAction(this.a, ujvVar, uhjVar, parcel);
    }

    public rip(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }
}
