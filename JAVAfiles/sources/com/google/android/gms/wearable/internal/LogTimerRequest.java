package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LogTimerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogTimerRequest> CREATOR = new acll(0);
    public final String a;
    public final long b;
    public final byte[] c;

    public LogTimerRequest(String str, long j, byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.n(parcel, 2, this.b);
        abhi.j(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
