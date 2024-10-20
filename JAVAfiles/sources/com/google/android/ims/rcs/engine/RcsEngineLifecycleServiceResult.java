package com.google.android.ims.rcs.engine;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.acll;
import defpackage.ahby;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RcsEngineLifecycleServiceResult extends ahby {
    public static final Parcelable.Creator<RcsEngineLifecycleServiceResult> CREATOR = new acll(20);

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
