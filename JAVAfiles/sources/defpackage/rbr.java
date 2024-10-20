package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rbr implements rhp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;

    public rbr(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
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
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        wzs wzsVar = (wzs) this.c.b();
        wzsVar.getClass();
        mho mhoVar = (mho) this.d.b();
        mhoVar.getClass();
        agnq agnqVar = (agnq) this.e.b();
        agnqVar.getClass();
        parcel.getClass();
        return new ProcessDeliveryReportAction(this.a, xnvVar, wzsVar, mhoVar, agnqVar, parcel);
    }
}
