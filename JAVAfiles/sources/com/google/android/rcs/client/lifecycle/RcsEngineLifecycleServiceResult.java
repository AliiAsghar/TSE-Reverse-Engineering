package com.google.android.rcs.client.lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ahby;
import defpackage.ajog;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class RcsEngineLifecycleServiceResult extends ahby {
    public static final Parcelable.Creator<RcsEngineLifecycleServiceResult> CREATOR = new ajog(1);

    public RcsEngineLifecycleServiceResult(int i) {
        this.code = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
    }

    public RcsEngineLifecycleServiceResult(Parcel parcel) {
        this.code = parcel.readInt();
    }
}
