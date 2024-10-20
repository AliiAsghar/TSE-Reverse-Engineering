package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.actionfactories.SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgl implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;

    public rgl(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
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
        armfVar8.getClass();
        this.h = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
    }

    public final /* bridge */ /* synthetic */ SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction a(boolean z) {
        wyt wytVar = (wyt) this.d.b();
        wytVar.getClass();
        vxr vxrVar = (vxr) this.g.b();
        vxrVar.getClass();
        armf armfVar = this.h;
        armf armfVar2 = this.i;
        return new SyncTelephonyThreadsAction((armf<wzp>) this.a, (armf<rus>) this.b, (armf<uzo>) this.c, wytVar, (armf<xhl>) this.e, (armf<rji>) this.f, vxrVar, (armf<maq>) armfVar, (armf<znj>) armfVar2, z);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        wyt wytVar = (wyt) this.d.b();
        wytVar.getClass();
        vxr vxrVar = (vxr) this.g.b();
        vxrVar.getClass();
        parcel.getClass();
        armf armfVar = this.h;
        armf armfVar2 = this.i;
        return new SyncTelephonyThreadsAction((armf<wzp>) this.a, (armf<rus>) this.b, (armf<uzo>) this.c, wytVar, (armf<xhl>) this.e, (armf<rji>) this.f, vxrVar, (armf<maq>) armfVar, (armf<znj>) armfVar2, parcel);
    }
}
