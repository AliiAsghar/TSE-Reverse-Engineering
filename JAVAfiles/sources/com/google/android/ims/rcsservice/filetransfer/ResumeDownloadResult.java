package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.adsv;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ResumeDownloadResult implements Parcelable {
    public static final Parcelable.Creator<ResumeDownloadResult> CREATOR = new adsv(1);

    public abstract FileTransferResult a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, a(), i, false);
        abhi.g(parcel, e);
    }
}
