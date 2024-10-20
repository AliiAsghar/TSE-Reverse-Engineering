package com.google.android.ims.rcsservice.filetransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import defpackage.abhi;
import defpackage.adse;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class FileDownloadRequest implements Parcelable {
    public static final Parcelable.Creator<FileDownloadRequest> CREATOR = new adse(12);

    public abstract PendingIntent a();

    public abstract FileInformation b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.E(parcel, a());
        abhi.o(parcel, 2, b(), i, false);
        abhi.g(parcel, e);
    }
}
