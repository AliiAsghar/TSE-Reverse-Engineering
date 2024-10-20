package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abkq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HasCapabilitiesRequest> CREATOR = new abkq(5);
    public final Account a;
    public final String[] b;
    public final Bundle c;

    public HasCapabilitiesRequest(Account account, String[] strArr, Bundle bundle) {
        this.a = account;
        this.b = strArr;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, account, i, false);
        abhi.F(parcel, 2, this.b);
        abhi.t(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
