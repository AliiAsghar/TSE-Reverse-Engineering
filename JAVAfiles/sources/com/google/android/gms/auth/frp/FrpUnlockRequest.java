package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FrpUnlockRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FrpUnlockRequest> CREATOR = new abmm(10);
    public final String a;
    public final Account b;

    public FrpUnlockRequest(String str, Account account) {
        this.a = str;
        this.b = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }
}
