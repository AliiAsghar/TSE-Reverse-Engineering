package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdb implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;

    public rdb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
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

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessPendingRevocationsAction c(Parcel parcel) {
        ImsConnectionTrackerService imsConnectionTrackerService = (ImsConnectionTrackerService) this.a.b();
        imsConnectionTrackerService.getClass();
        vqu vquVar = (vqu) this.c.b();
        vquVar.getClass();
        rjf rjfVar = (rjf) this.d.b();
        rjfVar.getClass();
        parcel.getClass();
        return new ProcessPendingRevocationsAction(imsConnectionTrackerService, this.b, vquVar, rjfVar, this.e, this.f, this.g, parcel);
    }
}
