package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acdi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendDataRequest> CREATOR = new acdi(20);
    public final String a;
    public final byte[] b;

    public SendDataRequest(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.j(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }
}
