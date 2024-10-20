package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.adse;
import defpackage.adss;
import defpackage.adtg;
import defpackage.ajgk;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class FileTransferResult implements Parcelable {
    public static final Parcelable.Creator<FileTransferResult> CREATOR;
    public static final FileTransferResult a;
    public static final FileTransferResult b;

    static {
        adtg adtgVar = new adtg();
        adtgVar.n(adss.OK);
        a = adtgVar.m();
        adtg adtgVar2 = new adtg();
        adtgVar2.n(adss.FAILED);
        b = adtgVar2.m();
        CREATOR = new adse(15);
    }

    public abstract adss a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        ajgk.C(parcel, 1, a());
        abhi.g(parcel, e);
    }
}
