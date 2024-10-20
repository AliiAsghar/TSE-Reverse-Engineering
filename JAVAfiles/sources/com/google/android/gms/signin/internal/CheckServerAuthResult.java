package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CheckServerAuthResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CheckServerAuthResult> CREATOR = new achm(5);
    final int a;
    final boolean b;
    final List c;

    public CheckServerAuthResult(int i, boolean z, List list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.r(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
