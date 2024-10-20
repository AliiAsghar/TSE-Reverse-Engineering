package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WalletFragmentInitParams extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentInitParams> CREATOR = new acjs(10);
    public String a;
    public MaskedWalletRequest b;
    public final int c;
    public MaskedWallet d;

    private WalletFragmentInitParams() {
        this.c = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, this.a, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.m(parcel, 4, this.c);
        abhi.o(parcel, 5, this.d, i, false);
        abhi.g(parcel, e);
    }

    public WalletFragmentInitParams(String str, MaskedWalletRequest maskedWalletRequest, int i, MaskedWallet maskedWallet) {
        this.a = str;
        this.b = maskedWalletRequest;
        this.c = i;
        this.d = maskedWallet;
    }
}
