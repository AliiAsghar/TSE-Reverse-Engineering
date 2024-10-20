package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WalletCustomTheme extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCustomTheme> CREATOR = new acjs(0);
    final int a;
    final int b;
    final int c;
    final Bundle d;
    final String e;

    public WalletCustomTheme(int i, Bundle bundle, String str, int i2, int i3) {
        this.d = bundle;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.t(parcel, 3, this.d);
        abhi.q(parcel, 4, this.e, false);
        abhi.m(parcel, 5, this.b);
        abhi.m(parcel, 6, this.c);
        abhi.g(parcel, e);
    }

    public WalletCustomTheme() {
        this.b = 0;
        this.c = 0;
        this.a = 0;
        this.d = new Bundle();
        this.e = "";
    }
}
