package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgo implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;

    public rgo(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
    }

    public final /* synthetic */ Action a(ConversationIdType conversationIdType) {
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        tsp tspVar = (tsp) this.b.b();
        tspVar.getClass();
        conversationIdType.getClass();
        return new UpdateConversationEncryptionStatusAction(anenVar, tspVar, this.c, this.d, this.e, this.f, this.g, conversationIdType);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        tsp tspVar = (tsp) this.b.b();
        tspVar.getClass();
        parcel.getClass();
        return new UpdateConversationEncryptionStatusAction(anenVar, tspVar, this.c, this.d, this.e, this.f, this.g, parcel);
    }
}
