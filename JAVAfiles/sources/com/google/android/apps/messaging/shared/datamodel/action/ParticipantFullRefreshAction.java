package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.ray;
import defpackage.rbf;
import defpackage.uhc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ParticipantFullRefreshAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ray(4);
    private final uhc a;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rbf Nt();
    }

    public ParticipantFullRefreshAction(uhc uhcVar) {
        super(amdy.PARTICIPANT_FULL_REFRESH_ACTION);
        this.a = uhcVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ParticipantFullRefreshAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ParticipantFullRefreshAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fw() {
        uhc uhcVar = this.a;
        uhcVar.a.set(false);
        uhcVar.c(1);
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ParticipantFullRefreshAction(uhc uhcVar, Parcel parcel) {
        super(parcel, amdy.PARTICIPANT_FULL_REFRESH_ACTION);
        this.a = uhcVar;
    }
}
