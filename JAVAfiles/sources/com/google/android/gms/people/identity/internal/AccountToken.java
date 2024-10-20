package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AccountToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountToken> CREATOR = new acfy(1);
    public final String a;
    public final String b;

    public AccountToken(String str, String str2) {
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
