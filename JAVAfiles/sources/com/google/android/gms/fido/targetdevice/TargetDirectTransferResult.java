package com.google.android.gms.fido.targetdevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abzf;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TargetDirectTransferResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TargetDirectTransferResult> CREATOR = new abzf(13);
    public final Status a;
    public final List b;

    public TargetDirectTransferResult(Status status, List list) {
        this.a = status;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, status, i, false);
        abhi.r(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }
}
