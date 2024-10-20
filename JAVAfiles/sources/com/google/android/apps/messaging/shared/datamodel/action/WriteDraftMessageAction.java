package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.rha;
import defpackage.rir;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class WriteDraftMessageAction extends Action<String> implements Parcelable {
    public static final Parcelable.Creator<Action<String>> CREATOR = new rha(0);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rir cN();
    }

    public WriteDraftMessageAction(Parcel parcel) {
        super(parcel, amdy.WRITE_DRAFT_MESSAGE_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("WriteDraftMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.WriteDraftMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
