package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abkq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotifyCompletionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotifyCompletionRequest> CREATOR = new abkq(16);
    public final String a;
    public final int b;

    public NotifyCompletionRequest(String str, int i) {
        abhg.m(str);
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, 1);
        abhi.q(parcel, 2, this.a, false);
        abhi.m(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
