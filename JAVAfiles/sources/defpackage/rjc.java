package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateParticipantColorAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjc implements rhp {
    private final armf a;

    public rjc() {
        throw null;
    }

    @Override // defpackage.rhp
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateParticipantColorAction c(Parcel parcel) {
        parcel.getClass();
        return new UpdateParticipantColorAction(this.a, parcel);
    }

    public rjc(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
