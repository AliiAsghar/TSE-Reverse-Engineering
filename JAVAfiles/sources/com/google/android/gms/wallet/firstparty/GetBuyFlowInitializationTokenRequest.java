package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class GetBuyFlowInitializationTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBuyFlowInitializationTokenRequest> CREATOR = new acjq(15);
    byte[] a;
    byte[] b;

    public GetBuyFlowInitializationTokenRequest(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, this.a, false);
        abhi.j(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }

    GetBuyFlowInitializationTokenRequest() {
        this(null, null);
    }
}
