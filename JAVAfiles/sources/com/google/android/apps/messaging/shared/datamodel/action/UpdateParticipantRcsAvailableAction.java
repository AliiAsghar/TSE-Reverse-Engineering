package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.rfw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class UpdateParticipantRcsAvailableAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(18);

    private UpdateParticipantRcsAvailableAction() {
        super(amdy.UPDATE_PARTICIPANT_RCS_AVAILABLE_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateParticipantRcsAvailableAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateParticipantRcsAvailable.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateParticipantRcsAvailableAction(Parcel parcel) {
        super(parcel, amdy.UPDATE_PARTICIPANT_RCS_AVAILABLE_ACTION);
    }
}
