package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acbp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActivityRecognitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityRecognitionRequest> CREATOR = new acbp(9);
    public final long a;
    public final boolean b;
    public final WorkSource c;
    public final String d;
    public final int[] e;
    public final boolean f;
    public final String g;
    public final long h;
    public final String i;

    public ActivityRecognitionRequest(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.a = j;
        this.b = z;
        this.c = workSource;
        this.d = str;
        this.e = iArr;
        this.f = z2;
        this.g = str2;
        this.h = j2;
        this.i = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        abhg.m(parcel);
        int e = abhi.e(parcel);
        abhi.n(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.y(parcel, 5, this.e);
        abhi.h(parcel, 6, this.f);
        abhi.q(parcel, 7, this.g, false);
        abhi.n(parcel, 8, this.h);
        abhi.q(parcel, 9, this.i, false);
        abhi.g(parcel, e);
    }
}
