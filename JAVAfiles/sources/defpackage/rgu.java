package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.WaitForRcsServiceConnectionAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgu implements rhp {
    public final armf a;
    public final armf b;
    private final armf c;
    private final armf d;

    public rgu(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        lrf lrfVar = (lrf) this.c.b();
        lrfVar.getClass();
        ibi ibiVar = (ibi) this.d.b();
        ibiVar.getClass();
        parcel.getClass();
        return new WaitForRcsServiceConnectionAction(lrfVar, ibiVar, parcel);
    }
}
