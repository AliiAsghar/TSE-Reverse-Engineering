package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ackp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FastPairAccountKeyParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FastPairAccountKeyParcelable> CREATOR = new ackp(15);
    private final byte[] a;

    public FastPairAccountKeyParcelable(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 1, (byte[]) bArr.clone(), false);
        abhi.g(parcel, e);
    }
}
