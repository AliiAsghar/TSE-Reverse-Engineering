package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akrh;
import defpackage.aktp;
import defpackage.amdy;
import defpackage.qyy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DoNothingAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<DoNothingAction> CREATOR = new qyy(6);

    public DoNothingAction() {
        super(amdy.DO_NOTHING_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final akrh a() {
        return aktp.e("DoNothingAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DoNothingAction(Parcel parcel) {
        super(parcel, amdy.DO_NOTHING_ACTION);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
