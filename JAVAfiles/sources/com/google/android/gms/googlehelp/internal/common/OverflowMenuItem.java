package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abzo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OverflowMenuItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OverflowMenuItem> CREATOR = new abzo(15);
    final int a;
    final String b;
    final Intent c;

    public OverflowMenuItem(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.q(parcel, 3, this.b, false);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.g(parcel, e);
    }
}
