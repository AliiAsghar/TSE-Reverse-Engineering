package com.google.android.gms.auth.account.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abkq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AddCastCertificateToDeviceAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddCastCertificateToDeviceAccountRequest> CREATOR = new abkq(9);
    public final String a;
    public final byte[][] b;

    public AddCastCertificateToDeviceAccountRequest(String str, byte[][] bArr) {
        abhg.k(str);
        this.a = str;
        abhg.m(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.u(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
