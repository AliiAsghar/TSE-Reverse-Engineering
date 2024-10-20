package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetClientTokenRequest> CREATOR = new acjq(17);
    WalletCustomTheme a;
    boolean b;
    final int c;

    GetClientTokenRequest() {
        this.c = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.h(parcel, 3, this.b);
        abhi.m(parcel, 4, this.c);
        abhi.g(parcel, e);
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme, boolean z, int i) {
        this.a = walletCustomTheme;
        this.b = z;
        this.c = i;
        if (walletCustomTheme == null) {
            throw new NullPointerException("WalletCustomTheme is required");
        }
    }
}
