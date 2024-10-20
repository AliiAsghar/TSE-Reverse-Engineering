package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveRcsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ref implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;

    public ref(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    public final /* bridge */ /* synthetic */ Action a(Bundle bundle) {
        xnv xnvVar = (xnv) this.a.b();
        xnvVar.getClass();
        vyv vyvVar = (vyv) this.b.b();
        vyvVar.getClass();
        return new ReceiveRcsMessageAction(xnvVar, vyvVar, this.c, bundle);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        xnv xnvVar = (xnv) this.a.b();
        xnvVar.getClass();
        vyv vyvVar = (vyv) this.b.b();
        vyvVar.getClass();
        parcel.getClass();
        return new ReceiveRcsMessageAction(xnvVar, vyvVar, this.c, parcel);
    }
}
