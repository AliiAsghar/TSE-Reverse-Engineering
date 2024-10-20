package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abzo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GmsDeviceComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GmsDeviceComplianceResponse> CREATOR = new abzo(9);
    final int a;
    public boolean b;
    public PendingIntent c;
    public boolean d;
    public long e;
    public byte[] f;

    public GmsDeviceComplianceResponse(int i, boolean z, PendingIntent pendingIntent, boolean z2, long j, byte[] bArr) {
        this.a = i;
        this.b = z;
        this.c = pendingIntent;
        this.d = z2;
        this.e = j;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.h(parcel, 4, this.d);
        abhi.n(parcel, 5, this.e);
        abhi.j(parcel, 6, this.f, false);
        abhi.g(parcel, e);
    }

    public GmsDeviceComplianceResponse() {
        this(1, true, null, false, 0L, null);
    }
}
