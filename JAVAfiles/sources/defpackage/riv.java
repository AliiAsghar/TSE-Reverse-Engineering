package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class riv implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;

    public riv() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Action a(MessageCoreData messageCoreData, boolean z, amgj amgjVar, tqc tqcVar, int i, Optional optional, long j, boolean z2) {
        agnq agnqVar = (agnq) this.c.b();
        agnqVar.getClass();
        msk mskVar = (msk) this.d.b();
        mskVar.getClass();
        viq viqVar = (viq) this.e.b();
        viqVar.getClass();
        rae raeVar = (rae) this.h.b();
        raeVar.getClass();
        messageCoreData.getClass();
        armf armfVar = this.i;
        armf armfVar2 = this.j;
        armf armfVar3 = this.k;
        return new InsertNewMessageAction(this.a, this.b, agnqVar, mskVar, viqVar, this.f, this.g, raeVar, armfVar, armfVar2, armfVar3, messageCoreData, z, amgjVar, tqcVar, i, optional, j, z2);
    }

    public final Action b(MessageCoreData messageCoreData, boolean z, tqc tqcVar) {
        return a(messageCoreData, z, null, tqcVar, -1, Optional.empty(), 0L, false);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        agnq agnqVar = (agnq) this.c.b();
        agnqVar.getClass();
        msk mskVar = (msk) this.d.b();
        mskVar.getClass();
        viq viqVar = (viq) this.e.b();
        viqVar.getClass();
        rae raeVar = (rae) this.h.b();
        raeVar.getClass();
        parcel.getClass();
        armf armfVar = this.i;
        armf armfVar2 = this.j;
        armf armfVar3 = this.k;
        return new InsertNewMessageAction(this.a, this.b, agnqVar, mskVar, viqVar, this.f, this.g, raeVar, armfVar, armfVar2, armfVar3, parcel);
    }

    public riv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
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
        armfVar10.getClass();
        this.j = armfVar10;
        armfVar11.getClass();
        this.k = armfVar11;
    }
}
