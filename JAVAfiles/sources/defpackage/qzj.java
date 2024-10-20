package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzj implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;

    public qzj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
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
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        uie uieVar = (uie) this.a.b();
        uieVar.getClass();
        agnq agnqVar = (agnq) this.b.b();
        agnqVar.getClass();
        parcel.getClass();
        xnv xnvVar = (xnv) this.d.b();
        xnvVar.getClass();
        return new FixupMessageStatusOnStartupAction(uieVar, agnqVar, parcel, this.c, xnvVar, this.e, this.f);
    }
}
