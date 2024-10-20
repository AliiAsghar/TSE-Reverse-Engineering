package com.google.android.gms.auth.api.accounttransfer.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abkq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UserChallengeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserChallengeRequest> CREATOR = new abkq(19);
    public final String a;
    public final PendingIntent b;

    public UserChallengeRequest(String str, PendingIntent pendingIntent) {
        abhg.m(str);
        this.a = str;
        abhg.m(pendingIntent);
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, 1);
        abhi.q(parcel, 2, this.a, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.g(parcel, e);
    }
}
