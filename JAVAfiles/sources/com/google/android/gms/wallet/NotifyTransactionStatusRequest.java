package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class NotifyTransactionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotifyTransactionStatusRequest> CREATOR = new aciz(20);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        abhi.g(parcel, abhi.e(parcel));
    }
}
