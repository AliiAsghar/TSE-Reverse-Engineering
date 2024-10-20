package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RefreshStatefulNotificationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rff extends rji {
    private final armf a;
    private final armf b;
    private final armf c;

    public rff(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    @Override // defpackage.rji, defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final RefreshStatefulNotificationsAction c(Parcel parcel) {
        via viaVar = (via) this.a.b();
        viaVar.getClass();
        mgv mgvVar = (mgv) this.b.b();
        mgvVar.getClass();
        yep yepVar = (yep) this.c.b();
        yepVar.getClass();
        parcel.getClass();
        return new RefreshStatefulNotificationsAction(viaVar, mgvVar, yepVar, parcel);
    }

    @Override // defpackage.rji
    public final /* bridge */ /* synthetic */ ThrottledAction d(boolean z, boolean z2, boolean z3, ConversationIdType conversationIdType) {
        via viaVar = (via) this.a.b();
        viaVar.getClass();
        mgv mgvVar = (mgv) this.b.b();
        mgvVar.getClass();
        yep yepVar = (yep) this.c.b();
        yepVar.getClass();
        conversationIdType.getClass();
        return new RefreshStatefulNotificationsAction(viaVar, mgvVar, yepVar, z, z2, z3, conversationIdType);
    }
}
