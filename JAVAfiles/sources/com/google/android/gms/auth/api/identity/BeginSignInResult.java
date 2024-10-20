package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new ablm(16);
    public final PendingIntent a;

    public BeginSignInResult(PendingIntent pendingIntent) {
        abhg.m(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, pendingIntent, i, false);
        abhi.g(parcel, e);
    }
}
