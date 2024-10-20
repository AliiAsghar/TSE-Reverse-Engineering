package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WalletFragmentStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletFragmentStyle> CREATOR = new acjs(12);
    final Bundle a;
    int b;

    public WalletFragmentStyle(Bundle bundle, int i) {
        this.a = bundle;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.t(parcel, 2, this.a);
        abhi.m(parcel, 3, this.b);
        abhi.g(parcel, e);
    }

    public WalletFragmentStyle() {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putInt("buyButtonAppearanceDefault", 4);
        bundle.putInt("maskedWalletDetailsLogoImageTypeDefault", 3);
    }
}
