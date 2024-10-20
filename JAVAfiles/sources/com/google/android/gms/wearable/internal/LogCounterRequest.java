package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aclk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LogCounterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogCounterRequest> CREATOR = new aclk(20);
    public final String a;
    public final long b;
    public final byte[] c;
    public final long d;
    public final boolean e;

    public LogCounterRequest(String str, long j, byte[] bArr, long j2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = bArr;
        this.d = j2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.n(parcel, 2, this.b);
        abhi.j(parcel, 3, this.c, false);
        abhi.n(parcel, 4, this.d);
        abhi.h(parcel, 5, this.e);
        abhi.g(parcel, e);
    }
}
