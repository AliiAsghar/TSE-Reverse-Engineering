package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveRbmSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ree implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;

    public ree(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
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

    public final /* bridge */ /* synthetic */ Action a(Bundle bundle) {
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        uhj uhjVar = (uhj) this.g.b();
        uhjVar.getClass();
        return new ReceiveRbmSuggestionsAction(this.a, this.b, this.c, this.d, this.e, xnvVar, uhjVar, this.h, this.i, bundle);
    }

    @Override // defpackage.rhp
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        uhj uhjVar = (uhj) this.g.b();
        uhjVar.getClass();
        parcel.getClass();
        return new ReceiveRbmSuggestionsAction(this.a, this.b, this.c, this.d, this.e, xnvVar, uhjVar, this.h, this.i, parcel);
    }
}
