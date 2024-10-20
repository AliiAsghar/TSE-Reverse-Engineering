package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateRbmBotParticipantAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgs implements rhp {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;

    public rgs(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
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
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateRbmBotParticipantAction c(Parcel parcel) {
        uhj uhjVar = (uhj) this.c.b();
        uhjVar.getClass();
        agnq agnqVar = (agnq) this.d.b();
        agnqVar.getClass();
        parcel.getClass();
        return new UpdateRbmBotParticipantAction(this.a, this.b, uhjVar, agnqVar, parcel);
    }
}
