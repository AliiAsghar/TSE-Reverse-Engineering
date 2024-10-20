package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.adse;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class FileDownloadResult implements Parcelable {
    public static final Parcelable.Creator<FileDownloadResult> CREATOR = new adse(13);

    public abstract String a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, a(), false);
        abhi.g(parcel, e);
    }
}
