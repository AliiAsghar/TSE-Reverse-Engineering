package com.google.android.ims.rcsservice.filetransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import defpackage.abhi;
import defpackage.adse;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ResumeDownloadRequest implements Parcelable {
    public static final Parcelable.Creator<ResumeDownloadRequest> CREATOR = new adse(20);

    public abstract PendingIntent a();

    public abstract FileInformation b();

    public abstract String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.E(parcel, a());
        abhi.q(parcel, 2, c(), false);
        abhi.o(parcel, 3, b(), i, false);
        abhi.g(parcel, e);
    }
}
