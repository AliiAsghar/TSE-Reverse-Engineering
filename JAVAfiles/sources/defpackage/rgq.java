package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateMessagePartSizeAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgq implements rhp {
    public final armf a;

    public rgq(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateMessagePartSizeAction c(Parcel parcel) {
        parcel.getClass();
        return new UpdateMessagePartSizeAction(this.a, parcel);
    }
}
