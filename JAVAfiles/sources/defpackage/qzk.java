package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ForwardIncomingTypingIndicatorToTachyonAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzk implements rhp {
    public final armf a;
    public final armf b;

    public qzk(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ForwardIncomingTypingIndicatorToTachyonAction c(Parcel parcel) {
        jat jatVar = (jat) this.b.b();
        jatVar.getClass();
        parcel.getClass();
        return new ForwardIncomingTypingIndicatorToTachyonAction(this.a, jatVar, parcel);
    }
}
