package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abjj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new abjj(20);
    final int a;
    final List b;

    public AccountChangeEventsResponse(int i, List list) {
        this.a = i;
        abhg.m(list);
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.r(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }
}
