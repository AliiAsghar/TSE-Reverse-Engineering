package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjq;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyCard> CREATOR = new acjq(7);
    final String a;
    final String b;
    final int c;
    final int d;

    public ProxyCard(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.m(parcel, 4, this.c);
        abhi.m(parcel, 5, this.d);
        abhi.g(parcel, e);
    }
}
