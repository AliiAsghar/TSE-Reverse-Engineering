package com.google.android.ims.rcs.singleregistration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adse;
import defpackage.ahby;
import defpackage.apgi;
import defpackage.aphf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SingleRegistrationVendorImsServiceResult extends ahby {
    public static final Parcelable.Creator<SingleRegistrationVendorImsServiceResult> CREATOR = new adse(1);
    public final apgi a;
    public final aphf b;

    public SingleRegistrationVendorImsServiceResult(int i) {
        this(i, aphf.FAILURE_REASON_UNKNOWN, apgi.IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeInt(this.b.j);
        parcel.writeInt(this.a.e);
    }

    public SingleRegistrationVendorImsServiceResult(int i, apgi apgiVar) {
        this(i, aphf.FAILURE_REASON_IMS_EXCEPTION, apgiVar);
    }

    public SingleRegistrationVendorImsServiceResult(int i, aphf aphfVar) {
        this(i, aphfVar, apgi.IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED);
    }

    private SingleRegistrationVendorImsServiceResult(int i, aphf aphfVar, apgi apgiVar) {
        this.code = i;
        this.b = aphfVar;
        this.a = apgiVar;
    }

    public SingleRegistrationVendorImsServiceResult(Parcel parcel) {
        this.code = parcel.readInt();
        this.b = aphf.b(parcel.readInt());
        this.a = apgi.b(parcel.readInt());
    }
}
