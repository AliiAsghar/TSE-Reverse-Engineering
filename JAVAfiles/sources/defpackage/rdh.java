package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdh implements rhp {
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

    public rdh(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
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

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        ((Context) this.a.b()).getClass();
        yjy yjyVar = (yjy) this.d.b();
        yjyVar.getClass();
        ((mce) this.e.b()).getClass();
        ((rji) this.f.b()).getClass();
        vjs vjsVar = (vjs) this.g.b();
        vjsVar.getClass();
        uhj uhjVar = (uhj) this.h.b();
        uhjVar.getClass();
        ((wyj) this.i.b()).getClass();
        parcel.getClass();
        return new ProcessTelephonyChangeAction(this.b, this.c, yjyVar, vjsVar, uhjVar, this.j, this.k, parcel);
    }
}
