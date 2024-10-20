package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.rdk;
import defpackage.rir;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class ReadDraftDataAction extends Action implements Parcelable {
    public static final Parcelable.Creator<Action> CREATOR = new rdk(1);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rir Py();
    }

    public ReadDraftDataAction(Parcel parcel) {
        super(parcel, amdy.READ_DRAFT_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("ReadDraftDataAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReadDraftData.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
