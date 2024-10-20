package com.google.android.gms.auth.firstparty.dataservice;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PostSignInData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PostSignInData> CREATOR = new abmi(6);
    final int a;
    public final Intent b;
    public final PendingIntent c;

    public PostSignInData(int i, Intent intent, PendingIntent pendingIntent) {
        this.a = i;
        this.b = intent;
        this.c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }
}
