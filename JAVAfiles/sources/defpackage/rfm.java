package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ResetGroupRcsSessionIdAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rfm implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;

    public rfm(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ResetGroupRcsSessionIdAction c(Parcel parcel) {
        vsh vshVar = (vsh) this.b.b();
        vshVar.getClass();
        uhj uhjVar = (uhj) this.c.b();
        uhjVar.getClass();
        parcel.getClass();
        return new ResetGroupRcsSessionIdAction(this.a, vshVar, uhjVar, parcel);
    }
}
