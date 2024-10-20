package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LogEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogEventRequest> CREATOR = new acll(1);
    public final byte[] a;

    public LogEventRequest(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 1, bArr, false);
        abhi.g(parcel, e);
    }
}
