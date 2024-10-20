package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyz implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;

    public qyz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ClearCloudSyncMessagesAction c(Parcel parcel) {
        rji rjiVar = (rji) this.a.b();
        rjiVar.getClass();
        uhj uhjVar = (uhj) this.b.b();
        uhjVar.getClass();
        agnq agnqVar = (agnq) this.c.b();
        agnqVar.getClass();
        parcel.getClass();
        return new ClearCloudSyncMessagesAction(rjiVar, uhjVar, agnqVar, parcel);
    }
}
