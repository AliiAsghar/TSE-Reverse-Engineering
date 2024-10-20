package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountData> CREATOR = new abzo(18);
    public final String a;
    public final String b;

    public AccountData(String str, String str2) {
        abhg.l(str, "Account name must not be empty.");
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }
}
