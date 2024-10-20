package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogOptions> CREATOR = new abxj(8);
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final ServiceDumpRequest[] f;

    public LogOptions(String str, boolean z, boolean z2, boolean z3, boolean z4, ServiceDumpRequest[] serviceDumpRequestArr) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = serviceDumpRequestArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.h(parcel, 3, this.b);
        abhi.h(parcel, 4, this.c);
        abhi.h(parcel, 5, this.d);
        abhi.h(parcel, 6, this.e);
        abhi.H(parcel, 7, this.f, i);
        abhi.g(parcel, e);
    }
}
