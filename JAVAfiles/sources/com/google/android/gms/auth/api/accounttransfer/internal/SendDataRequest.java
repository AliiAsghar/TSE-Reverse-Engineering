package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abkq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendDataRequest> CREATOR = new abkq(18);
    public final String a;
    public final byte[] b;

    public SendDataRequest(String str, byte[] bArr) {
        abhg.m(str);
        this.a = str;
        abhg.m(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, 1);
        abhi.q(parcel, 2, this.a, false);
        abhi.j(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }
}
