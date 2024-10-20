package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new aciz(16);
    public String a;
    public String b;
    private int c;

    private InstrumentInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        int i2 = 0;
        abhi.q(parcel, 2, this.a, false);
        abhi.q(parcel, 3, this.b, false);
        int i3 = this.c;
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i2 = i3;
        }
        abhi.m(parcel, 4, i2);
        abhi.g(parcel, e);
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
