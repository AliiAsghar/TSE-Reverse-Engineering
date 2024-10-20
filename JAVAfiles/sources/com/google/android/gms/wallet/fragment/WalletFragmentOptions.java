package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WalletFragmentOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WalletFragmentOptions> CREATOR = new acjs(11);
    public final int a;
    public int b;
    public final WalletFragmentStyle c;
    public int d;

    public WalletFragmentOptions(int i, int i2, WalletFragmentStyle walletFragmentStyle, int i3) {
        this.a = i;
        this.b = i2;
        this.c = walletFragmentStyle;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.m(parcel, 3, this.b);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.m(parcel, 5, this.d);
        abhi.g(parcel, e);
    }

    private WalletFragmentOptions() {
        this.a = 3;
        this.c = new WalletFragmentStyle();
    }
}
