package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecordUntetheredSupervisedAccountTransferRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecordUntetheredSupervisedAccountTransferRequest> CREATOR = new acll(11);
    public final String a;
    public final String b;
    public final boolean c;

    public RecordUntetheredSupervisedAccountTransferRequest(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.h(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
