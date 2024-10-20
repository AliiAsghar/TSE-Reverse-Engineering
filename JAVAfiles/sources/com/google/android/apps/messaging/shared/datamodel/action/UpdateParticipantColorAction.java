package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.armf;
import defpackage.rfw;
import defpackage.rhl;
import defpackage.rjc;
import defpackage.rtz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateParticipantColorAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new rfw(17);
    private final armf a;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rjc cV();
    }

    public UpdateParticipantColorAction(armf armfVar, Parcel parcel) {
        super(parcel, amdy.UPDATE_PARTICIPANT_COLOR_ACTION);
        this.a = armfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("UpdateParticipantColorAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        rhl rhlVar = this.u;
        ((rtz) this.a.b()).V(rhlVar.l("participantId"), (ParticipantCoreColor) rhlVar.h(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR));
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateParticipantColor.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
